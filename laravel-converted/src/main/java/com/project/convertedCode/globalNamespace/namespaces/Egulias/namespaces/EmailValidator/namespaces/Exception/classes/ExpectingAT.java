package com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.Egulias.namespaces.EmailValidator.namespaces.Exception.classes.InvalidEmail;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/egulias/email-validator/EmailValidator/Exception/ExpectingAT.php

*/

public class ExpectingAT extends InvalidEmail {

    public ExpectingAT(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ExpectingAT.class) {
            this.__construct(env, args);
        }
    }

    public ExpectingAT(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_CODE = 202;

    public static final Object CONST_REASON = "Expecting AT '@' ";

    public static final Object CONST_class = "Egulias\\EmailValidator\\Exception\\ExpectingAT";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends InvalidEmail.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Egulias\\EmailValidator\\Exception\\ExpectingAT")
                    .setLookup(
                            ExpectingAT.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Exception/ExpectingAT.php")
                    .addInterface("Throwable")
                    .addExtendsClass("Egulias\\EmailValidator\\Exception\\InvalidEmail")
                    .addExtendsClass("InvalidArgumentException")
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
