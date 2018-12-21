package com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes;

import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.TheSeer.namespaces.Tokenizer.classes.NamespaceUriException;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/theseer/tokenizer/src/NamespaceUri.php

*/

public class NamespaceUri extends RuntimeClassBase {

    public Object value = null;

    public NamespaceUri(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == NamespaceUri.class) {
            this.__construct(env, args);
        }
    }

    public NamespaceUri(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        this.ensureValidUri(env, value);
        this.value = value;
        return null;
    }

    @ConvertedMethod
    public Object asString(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.value);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    private Object ensureValidUri(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        if (ZVal.strictEqualityCheck(
                function_strpos.f.env(env).call(value, ":").value(), "===", false)) {
            throw ZVal.getException(
                    env,
                    new NamespaceUriException(
                            env,
                            function_sprintf
                                    .f
                                    .env(env)
                                    .call(
                                            "Namespace URI '%s' must contain at least one colon",
                                            value)
                                    .value()));
        }

        return null;
    }

    public static final Object CONST_class = "TheSeer\\Tokenizer\\NamespaceUri";

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
                    .setName("TheSeer\\Tokenizer\\NamespaceUri")
                    .setLookup(
                            NamespaceUri.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("value")
                    .setFilename("vendor/theseer/tokenizer/src/NamespaceUri.php")
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
