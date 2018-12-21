package com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Stub.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_shift;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.classes.Stub;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.SebastianBergmann.namespaces.Exporter.classes.Exporter;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/MockObject/Stub/ConsecutiveCalls.php

*/

public class ConsecutiveCalls extends RuntimeClassBase implements Stub {

    public Object stack = null;

    public Object value = null;

    public ConsecutiveCalls(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConsecutiveCalls.class) {
            this.__construct(env, args);
        }
    }

    public ConsecutiveCalls(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "stack", typeHint = "array")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object stack = assignParameter(args, 0, false);
        this.stack = stack;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "invocation",
        typeHint = "PHPUnit\\Framework\\MockObject\\Invocation"
    )
    public Object invoke(RuntimeEnv env, Object... args) {
        Object invocation = assignParameter(args, 0, false);
        this.value = function_array_shift.f.env(env).call(this.stack).value();
        if (ZVal.isTrue(
                ZVal.checkInstanceType(
                        this.value, Stub.class, "PHPUnit\\Framework\\MockObject\\Stub"))) {
            this.value = env.callMethod(this.value, "invoke", ConsecutiveCalls.class, invocation);
        }

        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    public Object toString(RuntimeEnv env, Object... args) {
        Object exporter = null;
        exporter = new Exporter(env);
        return ZVal.assign(
                function_sprintf
                        .f
                        .env(env)
                        .call(
                                "return user-specified value %s",
                                env.callMethod(
                                        exporter, "export", ConsecutiveCalls.class, this.value))
                        .value());
    }

    public static final Object CONST_class =
            "PHPUnit\\Framework\\MockObject\\Stub\\ConsecutiveCalls";

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
                    .setName("PHPUnit\\Framework\\MockObject\\Stub\\ConsecutiveCalls")
                    .setLookup(
                            ConsecutiveCalls.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("stack", "value")
                    .setFilename(
                            "vendor/phpunit/phpunit/src/Framework/MockObject/Stub/ConsecutiveCalls.php")
                    .addInterface("PHPUnit\\Framework\\MockObject\\Stub")
                    .addInterface("PHPUnit\\Framework\\SelfDescribing")
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
