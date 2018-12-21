package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Expr.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Expr;
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

 vendor/nikic/php-parser/lib/PhpParser/Node/Expr/New_.php

*/

public class New_ extends Expr {

    public Object _pClass = null;

    public Object ___args = null;

    public New_(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == New_.class) {
            this.__construct(env, args);
        }
    }

    public New_(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "class")
    @ConvertedParameter(
        index = 1,
        name = "args",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    @ConvertedParameter(
        index = 2,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object _pClass = assignParameter(args, 0, false);
        Object ___args = assignParameter(args, 1, true);
        if (null == ___args) {
            ___args = ZVal.newArray();
        }
        Object attributes = assignParameter(args, 2, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        this._pClass = _pClass;
        this.___args = ___args;
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("class", "args"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Expr_New";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Expr\\New_";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Expr.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Expr\\New_")
                    .setLookup(
                            New_.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("args", "attributes", "class")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Expr/New_.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Expr")
                    .addExtendsClass("PhpParser\\NodeAbstract")
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
