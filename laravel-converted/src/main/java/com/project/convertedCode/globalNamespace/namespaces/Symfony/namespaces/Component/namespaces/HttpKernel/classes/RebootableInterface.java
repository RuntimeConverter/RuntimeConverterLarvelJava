package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.HttpKernel.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/http-kernel/RebootableInterface.php

*/

public interface RebootableInterface {

    public static final Object CONST_class = "Symfony\\Component\\HttpKernel\\RebootableInterface";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "warmupDir")
    public Object reboot(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Symfony\\Component\\HttpKernel\\RebootableInterface")
                    .setLookup(RebootableInterface.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename("vendor/symfony/http-kernel/RebootableInterface.php")
                    .get();
}
