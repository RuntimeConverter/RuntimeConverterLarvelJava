package com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Mockery.namespaces.Matcher.classes.MatcherAbstract;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.exceptions.TemporaryStubFunctionException;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameterRef;
import static com.runtimeconverter.runtime.ZVal.toObjectR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/mockery/mockery/library/Mockery/Matcher/Closure.php

*/

public class Closure extends MatcherAbstract {

    public Closure(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Closure.class) {
            this.__construct(env, args);
        }
    }

    public Closure(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "actual")
    public Object match(
            RuntimeEnv env, PassByReferenceArgs runtimePassByReferenceArgs, Object... args) {
        ReferenceContainer actual = assignParameterRef(runtimePassByReferenceArgs, args, 0, false);
        Object result = null;
        Object closure = null;
        closure = ZVal.assign(toObjectR(this).accessProp(this, env).name("_expected").value());
        result =
                env.callFunctionDynamic(
                                closure,
                                new RuntimeArgsWithReferences().add(0, actual),
                                actual.getObject())
                        .value();
        return ZVal.assign(ZVal.strictEqualityCheck(result, "===", true));
    }

    public Object match(RuntimeEnv env, Object... args) {
        throw new TemporaryStubFunctionException();
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return "<Closure===true>";
    }

    public static final Object CONST_class = "Mockery\\Matcher\\Closure";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends MatcherAbstract.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Mockery\\Matcher\\Closure")
                    .setLookup(
                            Closure.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("_expected")
                    .setFilename("vendor/mockery/mockery/library/Mockery/Matcher/Closure.php")
                    .addExtendsClass("Mockery\\Matcher\\MatcherAbstract")
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
