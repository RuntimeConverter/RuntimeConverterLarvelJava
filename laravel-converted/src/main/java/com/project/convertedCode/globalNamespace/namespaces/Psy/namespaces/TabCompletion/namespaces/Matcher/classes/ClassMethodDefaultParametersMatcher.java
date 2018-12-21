package com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeClasses.exceptions.ReflectionException;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionMethod;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_pop;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.reflection.phpClasses.ReflectionClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.exceptions.ConvertedException;
import com.project.convertedCode.globalNamespace.namespaces.Psy.namespaces.TabCompletion.namespaces.Matcher.classes.AbstractDefaultParametersMatcher;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/psy/psysh/src/TabCompletion/Matcher/ClassMethodDefaultParametersMatcher.php

*/

public class ClassMethodDefaultParametersMatcher extends AbstractDefaultParametersMatcher {

    public ClassMethodDefaultParametersMatcher(RuntimeEnv env, Object... args) {
        super(env);
    }

    public ClassMethodDefaultParametersMatcher(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    @ConvertedParameter(
        index = 1,
        name = "info",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object getMatches(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        Object info = assignParameter(args, 1, true);
        if (null == info) {
            info = ZVal.newArray();
        }
        Object reflection = null;
        Object method = null;
        ReferenceContainer functionName = new BasicReferenceContainer(null);
        Object e = null;
        Object methods = null;
        Object methodOperator = null;
        Object openBracket = null;
        Object _pClass = null;
        openBracket = function_array_pop.f.env(env).call(tokens).value();
        functionName.setObject(function_array_pop.f.env(env).call(tokens).value());
        methodOperator = function_array_pop.f.env(env).call(tokens).value();
        _pClass =
                env.callMethod(
                        this,
                        "getNamespaceAndClass",
                        ClassMethodDefaultParametersMatcher.class,
                        tokens);
        try {
            reflection = new ReflectionClass(env, _pClass);
        } catch (ConvertedException convertedException202) {
            if (convertedException202.instanceOf(
                    ReflectionException.class, "ReflectionException")) {
                e = convertedException202.getObject();
                return ZVal.assign(ZVal.newArray());
            } else {
                throw convertedException202;
            }
        }

        methods =
                env.callMethod(
                        reflection, "getMethods", ClassMethodDefaultParametersMatcher.class, 1);
        for (ZPair zpairResult1420 : ZVal.getIterable(methods, env, true)) {
            method = ZVal.assign(zpairResult1420.getValue());
            if (ZVal.strictEqualityCheck(
                    env.callMethod(method, "getName", ClassMethodDefaultParametersMatcher.class),
                    "===",
                    functionName.arrayGet(env, 1))) {
                return ZVal.assign(
                        env.callMethod(
                                this,
                                "getDefaultParameterCompletion",
                                ClassMethodDefaultParametersMatcher.class,
                                env.callMethod(
                                        method,
                                        "getParameters",
                                        ClassMethodDefaultParametersMatcher.class)));
            }
        }

        return ZVal.assign(ZVal.newArray());
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "tokens", typeHint = "array")
    public Object hasMatched(RuntimeEnv env, Object... args) {
        Object tokens = assignParameter(args, 0, false);
        Object functionName = null;
        Object openBracket = null;
        Object operator = null;
        openBracket = function_array_pop.f.env(env).call(tokens).value();
        if (ZVal.strictNotEqualityCheck(openBracket, "!==", "(")) {
            return ZVal.assign(false);
        }

        functionName = function_array_pop.f.env(env).call(tokens).value();
        if (!ZVal.isTrue(runtimeStaticObject.tokenIs(env, functionName, CONST_T_STRING))) {
            return ZVal.assign(false);
        }

        operator = function_array_pop.f.env(env).call(tokens).value();
        if (!ZVal.isTrue(runtimeStaticObject.tokenIs(env, operator, CONST_T_DOUBLE_COLON))) {
            return ZVal.assign(false);
        }

        return ZVal.assign(true);
    }

    public static final Object CONST_class =
            "Psy\\TabCompletion\\Matcher\\ClassMethodDefaultParametersMatcher";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends AbstractDefaultParametersMatcher.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Psy\\TabCompletion\\Matcher\\ClassMethodDefaultParametersMatcher")
                    .setLookup(
                            ClassMethodDefaultParametersMatcher.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("context")
                    .setFilename(
                            "vendor/psy/psysh/src/TabCompletion/Matcher/ClassMethodDefaultParametersMatcher.php")
                    .addInterface("Psy\\ContextAware")
                    .addExtendsClass(
                            "Psy\\TabCompletion\\Matcher\\AbstractDefaultParametersMatcher")
                    .addExtendsClass("Psy\\TabCompletion\\Matcher\\AbstractContextAwareMatcher")
                    .addExtendsClass("Psy\\TabCompletion\\Matcher\\AbstractMatcher")
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
