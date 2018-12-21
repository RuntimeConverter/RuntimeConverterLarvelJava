package com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Ramsey.namespaces.Uuid.namespaces.Generator.classes.RandomGeneratorInterface;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Generator/PeclUuidRandomGenerator.php

*/

public class PeclUuidRandomGenerator extends RuntimeClassBase implements RandomGeneratorInterface {

    public PeclUuidRandomGenerator(RuntimeEnv env, Object... args) {
        super(env);
    }

    public PeclUuidRandomGenerator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "length")
    public Object generate(RuntimeEnv env, Object... args) {
        Object length = assignParameter(args, 0, false);
        Object uuid = null;
        uuid =
                com.runtimeconverter.runtime.ZVal.functionNotFound("uuid_create")
                        .env(env)
                        .call(function_constant.get(env, "UUID_TYPE_RANDOM"))
                        .value();
        return ZVal.assign(
                com.runtimeconverter.runtime.ZVal.functionNotFound("uuid_parse")
                        .env(env)
                        .call(uuid)
                        .value());
    }

    public static final Object CONST_class = "Ramsey\\Uuid\\Generator\\PeclUuidRandomGenerator";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends StaticBaseClass {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Ramsey\\Uuid\\Generator\\PeclUuidRandomGenerator")
                    .setLookup(
                            PeclUuidRandomGenerator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename("vendor/ramsey/uuid/src/Generator/PeclUuidRandomGenerator.php")
                    .addInterface("Ramsey\\Uuid\\Generator\\RandomGeneratorInterface")
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
