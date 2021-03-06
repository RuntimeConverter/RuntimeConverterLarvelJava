package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Identifier;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes.ClassLike;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Interface_.php

*/

public class Interface_ extends ClassLike {

    public Object _pExtends = null;

    public Interface_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Interface_.class) {
            this.__construct(env, args);
        }
    }

    public Interface_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    @ConvertedParameter(
        index = 1,
        name = "subNodes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        ReferenceContainer subNodes = new BasicReferenceContainer(assignParameter(args, 1, true));
        if (null == subNodes.getObject()) {
            subNodes.setObject(ZVal.newArray());
        }
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        Object ternaryExpressionTemp = null;
        super.__construct(env, attributes);
        toObjectR(this)
                .accessProp(this, env)
                .name("name")
                .set(
                        function_is_string.f.env(env).call(name).getBool()
                                ? new Identifier(env, name)
                                : name);
        this._pExtends =
                ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "extends"))
                        ? ternaryExpressionTemp
                        : ZVal.newArray();
        toObjectR(this)
                .accessProp(this, env)
                .name("stmts")
                .set(
                        ZVal.isDefined(ternaryExpressionTemp = subNodes.arrayGet(env, "stmts"))
                                ? ternaryExpressionTemp
                                : ZVal.newArray());
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("name", "extends", "stmts"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_Interface";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\Interface_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends ClassLike.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Stmt\\Interface_")
                    .setLookup(
                            Interface_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "extends", "name", "stmts")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Interface_.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Stmt\\ClassLike")
                    .addExtendsClass("PhpParser\\Node\\Stmt")
                    .addExtendsClass("PhpParser\\NodeAbstract")
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
