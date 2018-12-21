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

 vendor/nikic/php-parser/lib/PhpParser/Node/Expr/PreInc.php

*/

public class PreInc extends Expr {

    public Object var = null;

    public PreInc(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PreInc.class) {
            this.__construct(env, args);
        }
    }

    public PreInc(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "var", typeHint = "PhpParser\\Node\\Expr")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object var = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        this.var = var;
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("var"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Expr_PreInc";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Expr\\PreInc";

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
                    .setName("PhpParser\\Node\\Expr\\PreInc")
                    .setLookup(
                            PreInc.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "var")
                    .setFilename("vendor/nikic/php-parser/lib/PhpParser/Node/Expr/PreInc.php")
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
