package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Processors.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Query.namespaces.Processors.classes.Processor;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.Closure;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_map;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_object;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_numeric;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeClasses.exceptions.PHPException;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Query/Processors/SqlServerProcessor.php

*/

public class SqlServerProcessor extends Processor {

    public SqlServerProcessor(RuntimeEnv env, Object... args) {
        super(env);
    }

    public SqlServerProcessor(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "query",
        typeHint = "Illuminate\\Database\\Query\\Builder"
    )
    @ConvertedParameter(index = 1, name = "sql")
    @ConvertedParameter(index = 2, name = "values")
    @ConvertedParameter(
        index = 3,
        name = "sequence",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object processInsertGetId(RuntimeEnv env, Object... args) {
        Object query = assignParameter(args, 0, false);
        Object sql = assignParameter(args, 1, false);
        Object values = assignParameter(args, 2, false);
        Object sequence = assignParameter(args, 3, true);
        if (null == sequence) {
            sequence = ZVal.getNull();
        }
        Object connection = null;
        Object id = null;
        connection = env.callMethod(query, "getConnection", SqlServerProcessor.class);
        env.callMethod(connection, "insert", SqlServerProcessor.class, sql, values);
        if (ZVal.strictEqualityCheck(
                env.callMethod(connection, "getConfig", SqlServerProcessor.class, "odbc"),
                "===",
                true)) {
            id = this.processInsertGetIdForOdbc(env, connection);

        } else {
            id =
                    env.callMethod(
                            env.callMethod(connection, "getPdo", SqlServerProcessor.class),
                            "lastInsertId",
                            SqlServerProcessor.class);
        }

        return ZVal.assign(
                function_is_numeric.f.env(env).call(id).getBool() ? ZVal.toLong(id) : id);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "connection",
        typeHint = "Illuminate\\Database\\Connection"
    )
    protected Object processInsertGetIdForOdbc(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        ReferenceContainer result = new BasicReferenceContainer(null);
        ReferenceContainer row = new BasicReferenceContainer(null);
        result.setObject(
                env.callMethod(
                        connection,
                        "selectFromWriteConnection",
                        SqlServerProcessor.class,
                        "SELECT CAST(COALESCE(SCOPE_IDENTITY(), @@IDENTITY) AS int) AS insertid"));
        if (!ZVal.isTrue(result.getObject())) {
            throw ZVal.getException(
                    env, new PHPException(env, "Unable to retrieve lastInsertID for ODBC."));
        }

        row.setObject(ZVal.assign(result.arrayGet(env, 0)));
        return ZVal.assign(
                function_is_object.f.env(env).call(row.getObject()).getBool()
                        ? toObjectR(row.getObject()).accessProp(this, env).name("insertid").value()
                        : row.arrayGet(env, "insertid"));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "results")
    public Object processColumnListing(RuntimeEnv env, Object... args) {
        ContextConstants runtimeConverterFunctionClassConstants =
                new ContextConstants()
                        .setDir(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Processors")
                        .setFile(
                                "/vendor/laravel/framework/src/Illuminate/Database/Query/Processors/SqlServerProcessor.php");
        Object results = assignParameter(args, 0, false);
        return ZVal.assign(
                function_array_map
                        .f
                        .env(env)
                        .call(
                                new Closure(
                                        env,
                                        runtimeConverterFunctionClassConstants,
                                        "Illuminate\\Database\\Query\\Processors",
                                        this) {
                                    @Override
                                    @ConvertedMethod
                                    @ConvertedParameter(index = 0, name = "result")
                                    public Object run(
                                            RuntimeEnv env,
                                            Object thisvar,
                                            PassByReferenceArgs runtimePassByReferenceArgs,
                                            Object... args) {
                                        Object result = assignParameter(args, 0, false);
                                        return ZVal.assign(
                                                toObjectR(toObjectR(result))
                                                        .accessProp(this, env)
                                                        .name("name")
                                                        .value());
                                    }
                                },
                                results)
                        .value());
    }

    public static final Object CONST_class =
            "Illuminate\\Database\\Query\\Processors\\SqlServerProcessor";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Processor.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Database\\Query\\Processors\\SqlServerProcessor")
                    .setLookup(
                            SqlServerProcessor.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Query/Processors/SqlServerProcessor.php")
                    .addExtendsClass("Illuminate\\Database\\Query\\Processors\\Processor")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
