package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.CountValidator.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Exception.classes.InvalidCountException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.CountValidator.classes.CountValidatorAbstract;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/CountValidator/AtLeast.php

*/

public class AtLeast extends CountValidatorAbstract {

    public AtLeast(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == AtLeast.class) {
            this.__construct(env, args);
        }
    }

    public AtLeast(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "n")
    public Object isEligible(RuntimeEnv env, Object... args) {
        Object n = assignParameter(args, 0, false);
        return ZVal.assign(true);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "n")
    public Object validate(RuntimeEnv env, Object... args) {
        Object n = assignParameter(args, 0, false);
        Object exception = null;
        if (ZVal.isGreaterThan(
                toObjectR(this).accessProp(this, env).name("_limit").value(), '>', n)) {
            exception =
                    new InvalidCountException(
                            env,
                            "Method "
                                    + toStringR(
                                            toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("_expectation")
                                                            .value(),
                                                    env),
                                            env)
                                    + " from "
                                    + toStringR(
                                            env.callMethod(
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("_expectation")
                                                                    .value(),
                                                            "getMock",
                                                            AtLeast.class),
                                                    "mockery_getName",
                                                    AtLeast.class),
                                            env)
                                    + " should be called"
                                    + toStringR("\n", env)
                                    + " at least "
                                    + toStringR(
                                            toObjectR(this)
                                                    .accessProp(this, env)
                                                    .name("_limit")
                                                    .value(),
                                            env)
                                    + " times but called "
                                    + toStringR(n, env)
                                    + " times.");
            env.callMethod(
                    env.callMethod(
                            env.callMethod(
                                    env.callMethod(
                                            env.callMethod(
                                                    exception,
                                                    "setMock",
                                                    AtLeast.class,
                                                    env.callMethod(
                                                            toObjectR(this)
                                                                    .accessProp(this, env)
                                                                    .name("_expectation")
                                                                    .value(),
                                                            "getMock",
                                                            AtLeast.class)),
                                            "setMethodName",
                                            AtLeast.class,
                                            toStringR(
                                                    toObjectR(this)
                                                            .accessProp(this, env)
                                                            .name("_expectation")
                                                            .value(),
                                                    env)),
                                    "setExpectedCountComparative",
                                    AtLeast.class,
                                    ">="),
                            "setExpectedCount",
                            AtLeast.class,
                            toObjectR(this).accessProp(this, env).name("_limit").value()),
                    "setActualCount",
                    AtLeast.class,
                    n);
            throw ZVal.getException(env, exception);
        }

        return null;
    }

    public static final Object CONST_class = "Mockery\\CountValidator\\AtLeast";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends CountValidatorAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\CountValidator\\AtLeast")
                    .setLookup(
                            AtLeast.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expectation", "_limit")
                    .setFilename(
                            "vendor/mockery/mockery/library/Mockery/CountValidator/AtLeast.php")
                    .addExtendsClass("Mockery\\CountValidator\\CountValidatorAbstract")
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
