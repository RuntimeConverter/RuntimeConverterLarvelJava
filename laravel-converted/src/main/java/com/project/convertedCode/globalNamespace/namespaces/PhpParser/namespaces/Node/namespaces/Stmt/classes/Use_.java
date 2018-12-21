package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Stmt.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Stmt;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Use_.php

*/

public class Use_ extends Stmt {

    public Object type = null;

    public Object uses = null;

    public Use_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Use_.class) {
            this.__construct(env, args);
        }
    }

    public Use_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "uses", typeHint = "array")
    @ConvertedParameter(index = 1, name = "type", typeHint = "int")
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object uses = assignParameter(args, 0, false);
        Object type = assignParameter(args, 1, true);
        if (null == type) {
            type = CONST_TYPE_NORMAL;
        }
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        this.type = type;
        this.uses = uses;
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("type", "uses"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Stmt_Use";
    }

    public static final Object CONST_TYPE_UNKNOWN = 0;

    public static final Object CONST_TYPE_NORMAL = 1;

    public static final Object CONST_TYPE_FUNCTION = 2;

    public static final Object CONST_TYPE_CONSTANT = 3;

    public static final Object CONST_class = "PhpParser\\Node\\Stmt\\Use_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Stmt.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Stmt\\Use_")
                    .setLookup(
                            Use_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "type", "uses")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Stmt/Use_.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
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
