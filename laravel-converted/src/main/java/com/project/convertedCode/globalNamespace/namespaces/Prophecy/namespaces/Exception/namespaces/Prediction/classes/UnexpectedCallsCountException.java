package com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Prophecy.namespaces.Exception.namespaces.Prediction.classes.UnexpectedCallsException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/UnexpectedCallsCountException.php

*/

public class UnexpectedCallsCountException extends UnexpectedCallsException {

    public Object expectedCount = null;

    public UnexpectedCallsCountException(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == UnexpectedCallsCountException.class) {
            this.__construct(env, args);
        }
    }

    public UnexpectedCallsCountException(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "message")
    @ConvertedParameter(
        index = 1,
        name = "methodProphecy",
        typeHint = "Prophecy\\Prophecy\\MethodProphecy"
    )
    @ConvertedParameter(index = 2, name = "count")
    @ConvertedParameter(index = 3, name = "calls", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object message = assignParameter(args, 0, false);
        Object methodProphecy = assignParameter(args, 1, false);
        Object count = assignParameter(args, 2, false);
        Object calls = assignParameter(args, 3, false);
        super.__construct(env, message, methodProphecy, calls);
        this.expectedCount = NamespaceGlobal.intval.env(env).call(count).value();
        return null;
    }

    @ConvertedMethod
    public Object getExpectedCount(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.expectedCount);
    }

    public static final Object CONST_class =
            "Prophecy\\Exception\\Prediction\\UnexpectedCallsCountException";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends UnexpectedCallsException.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Prophecy\\Exception\\Prediction\\UnexpectedCallsCountException")
                    .setLookup(
                            UnexpectedCallsCountException.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "calls", "expectedCount", "methodProphecy", "objectProphecy")
                    .setFilename(
                            "vendor/phpspec/prophecy/src/Prophecy/Exception/Prediction/UnexpectedCallsCountException.php")
                    .addInterface("Prophecy\\Exception\\Prediction\\PredictionException")
                    .addInterface("Prophecy\\Exception\\Exception")
                    .addInterface("Prophecy\\Exception\\Prophecy\\ProphecyException")
                    .addInterface("Throwable")
                    .addExtendsClass("Prophecy\\Exception\\Prediction\\UnexpectedCallsException")
                    .addExtendsClass("Prophecy\\Exception\\Prophecy\\MethodProphecyException")
                    .addExtendsClass("Prophecy\\Exception\\Prophecy\\ObjectProphecyException")
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
