package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Middleware.classes;

import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_string;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.array.function_in_array;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Foundation.namespaces.Http.namespaces.Middleware.classes.TransformsRequest;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/TrimStrings.php

*/

public class TrimStrings extends TransformsRequest {

    public Object except = ZVal.newArray();

    public TrimStrings(RuntimeEnv env, Object... args) {
        super(env);
    }

    public TrimStrings(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "key")
    @ConvertedParameter(index = 1, name = "value")
    protected Object transform(RuntimeEnv env, Object... args) {
        Object key = assignParameter(args, 0, false);
        Object value = assignParameter(args, 1, false);
        if (function_in_array.f.env(env).call(key, this.except, true).getBool()) {
            return ZVal.assign(value);
        }

        return ZVal.assign(
                function_is_string.f.env(env).call(value).getBool()
                        ? function_trim.f.env(env).call(value).value()
                        : value);
    }

    public static final Object CONST_class =
            "Illuminate\\Foundation\\Http\\Middleware\\TrimStrings";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends TransformsRequest.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Foundation\\Http\\Middleware\\TrimStrings")
                    .setLookup(
                            TrimStrings.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "except")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Foundation/Http/Middleware/TrimStrings.php")
                    .addExtendsClass("Illuminate\\Foundation\\Http\\Middleware\\TransformsRequest")
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
