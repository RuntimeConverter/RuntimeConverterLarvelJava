package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Hashing.classes.AbstractHasher;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Contracts.namespaces.Hashing.classes.Hasher;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.RuntimeException;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Hashing/BcryptHasher.php

*/

public class BcryptHasher extends AbstractHasher implements Hasher {

    public Object rounds = 10;

    public BcryptHasher(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == BcryptHasher.class) {
            this.__construct(env, args);
        }
    }

    public BcryptHasher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object ternaryExpressionTemp = null;
        this.rounds =
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "rounds"))
                        ? ternaryExpressionTemp
                        : this.rounds;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object make(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        Object hash = null;
        hash =
                NamespaceGlobal.password_hash
                        .env(env)
                        .call(value, 1, ZVal.newArray(new ZPair("cost", this.cost(env, options))))
                        .value();
        if (ZVal.strictEqualityCheck(hash, "===", false)) {
            throw ZVal.getException(
                    env, new RuntimeException(env, "Bcrypt hashing not supported."));
        }

        return ZVal.assign(hash);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "hashedValue")
    @ConvertedParameter(
        index = 1,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object needsRehash(RuntimeEnv env, Object... args) {
        Object hashedValue = assignParameter(args, 0, false);
        Object options = assignParameter(args, 1, true);
        if (null == options) {
            options = ZVal.newArray();
        }
        return ZVal.assign(
                NamespaceGlobal.password_needs_rehash
                        .env(env)
                        .call(
                                hashedValue,
                                1,
                                ZVal.newArray(new ZPair("cost", this.cost(env, options))))
                        .value());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "rounds")
    public Object setRounds(RuntimeEnv env, Object... args) {
        Object rounds = assignParameter(args, 0, false);
        this.rounds = ZVal.toLong(rounds);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "options",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    protected Object cost(RuntimeEnv env, Object... args) {
        ReferenceContainer options = new BasicReferenceContainer(assignParameter(args, 0, true));
        if (null == options.getObject()) {
            options.setObject(ZVal.newArray());
        }
        Object ternaryExpressionTemp = null;
        return ZVal.assign(
                ZVal.isDefined(ternaryExpressionTemp = options.arrayGet(env, "rounds"))
                        ? ternaryExpressionTemp
                        : this.rounds);
    }

    public static final Object CONST_class = "Illuminate\\Hashing\\BcryptHasher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractHasher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Illuminate\\Hashing\\BcryptHasher")
                    .setLookup(
                            BcryptHasher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("rounds")
                    .setFilename("vendor/laravel/framework/src/Illuminate/Hashing/BcryptHasher.php")
                    .addInterface("Illuminate\\Contracts\\Hashing\\Hasher")
                    .addExtendsClass("Illuminate\\Hashing\\AbstractHasher")
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
