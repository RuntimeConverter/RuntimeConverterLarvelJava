package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.namespaces.Log.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/Log/DebugLoggerInterface.php

*/

public interface DebugLoggerInterface {

    public static final Object CONST_class =
            "Symfony\\Component\\HttpKernel\\Log\\DebugLoggerInterface";

    @ConvertedMethod
    public Object getLogs(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object countErrors(RuntimeEnv env, Object... args);

    @ConvertedMethod
    public Object clear(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\Log\\DebugLoggerInterface")
                    .setLookup(DebugLoggerInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/Log/DebugLoggerInterface.php")
                    .get();
}
