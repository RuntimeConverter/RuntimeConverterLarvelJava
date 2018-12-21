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

 vendor/egulias/email-validator/EmailValidator/Exception/CharNotAllowed.php

*/

public class CharNotAllowed extends InvalidEmail {

    public CharNotAllowed(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CharNotAllowed.class) {
            this.__construct(env, args);
        }
    }

    public CharNotAllowed(NoConstructor n) {
        super(n);
    }

    public static final Object CONST_CODE = 201;

    public static final Object CONST_REASON = "Non allowed character in domain";

    public static final Object CONST_class = "Egulias\\EmailValidator\\Exception\\CharNotAllowed";

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
                    .setName("Egulias\\EmailValidator\\Exception\\CharNotAllowed")
                    .setLookup(
                            CharNotAllowed.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties()
                    .setFilename(
                            "vendor/egulias/email-validator/EmailValidator/Exception/CharNotAllowed.php")
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
