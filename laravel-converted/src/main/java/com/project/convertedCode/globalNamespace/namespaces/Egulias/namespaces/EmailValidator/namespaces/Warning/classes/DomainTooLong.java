package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes;

import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Warning.classes.Warning;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Warning/DomainTooLong.php

*/

public class DomainTooLong extends Warning {

    public DomainTooLong(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == DomainTooLong.class) {
            this.__construct(env, args);
        }
    }

    public DomainTooLong(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object __construct(RuntimeEnv env, Object... args) {
        toObjectR(this)
                .accessProp(this, env)
                .name("message")
                .set("Domain is too long, exceeds 255 chars");
        toObjectR(this).accessProp(this, env).name("rfcNumber").set(5322);
        return null;
    }

    public static final Object CONST_CODE = 255;

    public static final Object CONST_class = "Egulias\\EmailValidator\\Warning\\DomainTooLong";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Warning.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Egulias\\EmailValidator\\Warning\\DomainTooLong")
                    .setLookup(
                            DomainTooLong.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("message", "rfcNumber")
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Warning/DomainTooLong.php")
                    .addExtendsClass("Egulias\\EmailValidator\\Warning\\Warning")
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
