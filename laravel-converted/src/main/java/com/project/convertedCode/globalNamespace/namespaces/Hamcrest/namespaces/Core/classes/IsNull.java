package com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_null;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.namespaces.Core.classes.IsNot;
import com.project.convertedCode.globalNamespace.namespaces.Hamcrest.classes.BaseMatcher;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsNull.php

*/

public class IsNull extends BaseMatcher {

    public IsNull(RuntimeEnv env, Object... args) {
        super(env);
    }

    public IsNull(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "item")
    public Object matches(RuntimeEnv env, Object... args) {
        Object item = assignParameter(args, 0, false);
        return ZVal.assign(function_is_null.f.env(env).call(item).value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "description", typeHint = "Hamcrest\\Description")
    public Object describeTo(RuntimeEnv env, Object... args) {
        Object description = assignParameter(args, 0, false);
        env.callMethod(description, "appendText", IsNull.class, "null");
        return null;
    }

    public static final Object CONST_class = "Hamcrest\\Core\\IsNull";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object nullValue(RuntimeEnv env, Object... args) {
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Core
                                            .classes
                                            .IsNull
                                            .RequestStaticProperties
                                            .class)
                            ._INSTANCE)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Hamcrest
                                                .namespaces
                                                .Core
                                                .classes
                                                .IsNull
                                                .RequestStaticProperties
                                                .class)
                                ._INSTANCE =
                        new com.project
                                .convertedCode
                                .globalNamespace
                                .namespaces
                                .Hamcrest
                                .namespaces
                                .Core
                                .classes
                                .IsNull(env);
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Core
                                            .classes
                                            .IsNull
                                            .RequestStaticProperties
                                            .class)
                            ._INSTANCE);
        }

        @ConvertedMethod
        public Object notNullValue(RuntimeEnv env, Object... args) {
            if (!ZVal.isTrue(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Core
                                            .classes
                                            .IsNull
                                            .RequestStaticProperties
                                            .class)
                            ._NOT_INSTANCE)) {
                env.getRequestStaticProperties(
                                        com.project
                                                .convertedCode
                                                .globalNamespace
                                                .namespaces
                                                .Hamcrest
                                                .namespaces
                                                .Core
                                                .classes
                                                .IsNull
                                                .RequestStaticProperties
                                                .class)
                                ._NOT_INSTANCE =
                        IsNot.runtimeStaticObject.not(env, runtimeStaticObject.nullValue(env));
            }

            return ZVal.assign(
                    env.getRequestStaticProperties(
                                    com.project
                                            .convertedCode
                                            .globalNamespace
                                            .namespaces
                                            .Hamcrest
                                            .namespaces
                                            .Core
                                            .classes
                                            .IsNull
                                            .RequestStaticProperties
                                            .class)
                            ._NOT_INSTANCE);
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object _INSTANCE = null;

        public Object _NOT_INSTANCE = null;
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Hamcrest\\Core\\IsNull")
                    .setLookup(
                            IsNull.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setStaticPropertyNames("_INSTANCE", "_NOT_INSTANCE")
                    .setFilename("vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Core/IsNull.php")
                    .addInterface("Hamcrest\\Matcher")
                    .addInterface("Hamcrest\\SelfDescribing")
                    .addExtendsClass("Hamcrest\\BaseMatcher")
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
