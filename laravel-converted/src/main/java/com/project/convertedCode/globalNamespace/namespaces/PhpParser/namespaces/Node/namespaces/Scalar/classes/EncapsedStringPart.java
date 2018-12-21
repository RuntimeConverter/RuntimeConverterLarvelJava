package com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.namespaces.Scalar.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.PhpParser.namespaces.Node.classes.Scalar;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/EncapsedStringPart.php

*/

public class EncapsedStringPart extends Scalar {

    public Object value = null;

    public EncapsedStringPart(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == EncapsedStringPart.class) {
            this.__construct(env, args);
        }
    }

    public EncapsedStringPart(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value", typeHint = "string")
    @ConvertedParameter(
        index = 1,
        name = "attributes",
        typeHint = "array",
        defaultValue = "",
        defaultValueType = "array"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object attributes = assignParameter(args, 1, true);
        if (null == attributes) {
            attributes = ZVal.newArray();
        }
        super.__construct(env, attributes);
        this.value = value;
        return null;
    }

    @ConvertedMethod
    public Object getSubNodeNames(RuntimeEnv env, Object... args) {
        return ZVal.assign(ZVal.arrayFromList("value"));
    }

    @ConvertedMethod
    public Object getType(RuntimeEnv env, Object... args) {
        return "Scalar_EncapsedStringPart";
    }

    public static final Object CONST_class = "PhpParser\\Node\\Scalar\\EncapsedStringPart";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends Scalar.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("PhpParser\\Node\\Scalar\\EncapsedStringPart")
                    .setLookup(
                            EncapsedStringPart.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("attributes", "value")
                    .setFilename(
                            "vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/EncapsedStringPart.php")
                    .addInterface("PhpParser\\Node")
                    .addInterface("JsonSerializable")
                    .addExtendsClass("PhpParser\\Node\\Scalar")
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
