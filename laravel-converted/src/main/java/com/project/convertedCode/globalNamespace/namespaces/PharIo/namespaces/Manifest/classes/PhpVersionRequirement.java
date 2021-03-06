package com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes;

import com.project.convertedCode.globalNamespace.namespaces.PharIo.namespaces.Manifest.classes.Requirement;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
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

 vendor/phar-io/manifest/src/values/PhpVersionRequirement.php

*/

public class PhpVersionRequirement extends RuntimeClassBase implements Requirement {

    public Object versionConstraint = null;

    public PhpVersionRequirement(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PhpVersionRequirement.class) {
            this.__construct(env, args);
        }
    }

    public PhpVersionRequirement(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "versionConstraint",
        typeHint = "PharIo\\Version\\VersionConstraint"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object versionConstraint = assignParameter(args, 0, false);
        this.versionConstraint = versionConstraint;
        return null;
    }

    @ConvertedMethod
    public Object getVersionConstraint(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.versionConstraint);
    }

    public static final Object CONST_class = "PharIo\\Manifest\\PhpVersionRequirement";

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
                    .setName("PharIo\\Manifest\\PhpVersionRequirement")
                    .setLookup(
                            PhpVersionRequirement.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("versionConstraint")
                    .setFilename("vendor/phar-io/manifest/src/values/PhpVersionRequirement.php")
                    .addInterface("PharIo\\Manifest\\Requirement")
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
