package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Doubler.classes.DoubleException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/ReturnByReferenceException.php

*/

public class ReturnByReferenceException extends DoubleException {

    public Object classname = null;

    public Object methodName = null;

    public ReturnByReferenceException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ReturnByReferenceException.class) {
            this.__construct(env, args);
        }
    }

    public ReturnByReferenceException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(index = 1, name = "classname")
    @ConvertedParameter(index = 2, name = "methodName")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object classname = assignParameter(args, 1, false);
        Object methodName = assignParameter(args, 2, false);
        super.__construct(env, message);
        this.classname = classname;
        this.methodName = methodName;
        return null;
    }

    @ConvertedMethod
    public Object getClassname(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.classname);
    }

    @ConvertedMethod
    public Object getMethodName(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.methodName);
    }

    public static final Object CONST_class =
            "Prophecy\\Exception\\Doubler\\ReturnByReferenceException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends DoubleException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Doubler\\ReturnByReferenceException")
                    .setLookup(
                            ReturnByReferenceException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("classname", "methodName")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Doubler/ReturnByReferenceException.php")
                    .addInterface("Prophecy\\Exception\\Doubler\\DoublerException")
                    .addInterface("Prophecy\\Exception\\Exception")
                    .addInterface("Throwable")
                    .addExtendsClass("Prophecy\\Exception\\Doubler\\DoubleException")
                    .addExtendsClass("RuntimeException")
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
