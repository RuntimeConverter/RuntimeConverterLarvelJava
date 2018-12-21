package com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.classes.BaseTag;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Reference.classes.Url;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Factory.classes.StaticMethod;
import java.lang.invoke.MethodHandles;
import com.project.convertedCode.globalNamespace.namespaces.Webmozart.namespaces.Assert.classes.Assert;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.phpDocumentor.namespaces.Reflection.namespaces.DocBlock.namespaces.Tags.namespaces.Reference.classes.Fqsen;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/See.php

*/

public class See extends BaseTag implements StaticMethod {

    public Object refers = ZVal.getNull();

    public See(RuntimeEnv env, Object... args) {
        super(env);
        // Super class property overrides
        this.name = "see";
        if (this.getClass() == See.class) {
            this.__construct(env, args);
        }
    }

    public See(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "refers",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Tags\\Reference\\Reference"
    )
    @ConvertedParameter(
        index = 1,
        name = "description",
        typeHint = "phpDocumentor\\Reflection\\DocBlock\\Description",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object refers = assignParameter(args, 0, false);
        Object description = assignParameter(args, 1, true);
        if (null == description) {
            description = ZVal.getNull();
        }
        this.refers = refers;
        toObjectR(this).accessProp(this, env).name("description").set(description);
        return null;
    }

    @ConvertedMethod
    public Object getReference(RuntimeEnv env, Object... args) {
        return ZVal.assign(this.refers);
    }

    @ConvertedMethod
    public Object __toString(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                toStringR(this.refers, env)
                        + toStringR(
                                toObjectR(this).accessProp(this, env).name("description").getBool()
                                        ? " "
                                                + toStringR(
                                                        env.callMethod(
                                                                toObjectR(this)
                                                                        .accessProp(this, env)
                                                                        .name("description")
                                                                        .value(),
                                                                "render",
                                                                See.class),
                                                        env)
                                        : "",
                                env));
    }

    public static final Object CONST_class = "phpDocumentor\\Reflection\\DocBlock\\Tags\\See";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends BaseTag.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        @ConvertedParameter(index = 0, name = "body")
        @ConvertedParameter(
            index = 1,
            name = "resolver",
            typeHint = "phpDocumentor\\Reflection\\FqsenResolver",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 2,
            name = "descriptionFactory",
            typeHint = "phpDocumentor\\Reflection\\DocBlock\\DescriptionFactory",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        @ConvertedParameter(
            index = 3,
            name = "context",
            typeHint = "phpDocumentor\\Reflection\\Types\\Context",
            defaultValue = "NULL",
            defaultValueType = "constant"
        )
        public Object create(RuntimeEnv env, Object... args) {
            Object body = assignParameter(args, 0, false);
            Object resolver = assignParameter(args, 1, true);
            if (null == resolver) {
                resolver = ZVal.getNull();
            }
            Object descriptionFactory = assignParameter(args, 2, true);
            if (null == descriptionFactory) {
                descriptionFactory = ZVal.getNull();
            }
            Object context = assignParameter(args, 3, true);
            if (null == context) {
                context = ZVal.getNull();
            }
            ReferenceContainer parts = new BasicReferenceContainer(null);
            Object description = null;
            Assert.runtimeStaticObject.string(env, body);
            Assert.runtimeStaticObject.callUnknownStaticMethod(
                    env,
                    "allNotNull",
                    new RuntimeArgsWithReferences(),
                    ZVal.newArray(new ZPair(0, resolver), new ZPair(1, descriptionFactory)));
            parts.setObject(NamespaceGlobal.preg_split.env(env).call("/\\s+/Su", body, 2).value());
            description =
                    ZVal.assign(
                            arrayActionR(ArrayAction.ISSET, parts, env, 1)
                                    ? env.callMethod(
                                            descriptionFactory,
                                            "create",
                                            See.class,
                                            parts.arrayGet(env, 1),
                                            context)
                                    : ZVal.getNull());
            if (function_preg_match
                    .f
                    .env(env)
                    .call("/\\w:\\/\\/\\w/i", parts.arrayGet(env, 0))
                    .getBool()) {
                return ZVal.assign(
                        env.createNewWithLateStaticBindings(
                                this, new Url(env, parts.arrayGet(env, 0)), description));
            }

            return ZVal.assign(
                    env.createNewWithLateStaticBindings(
                            this,
                            new Fqsen(
                                    env,
                                    env.callMethod(
                                            resolver,
                                            "resolve",
                                            See.class,
                                            parts.arrayGet(env, 0),
                                            context)),
                            description));
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("phpDocumentor\\Reflection\\DocBlock\\Tags\\See")
                    .setLookup(
                            See.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("description", "name", "name", "refers")
                    .setFilename(
                            "vendor/phpdocumentor/reflection-docblock/src/DocBlock/Tags/See.php")
                    .addInterface(
                            "phpDocumentor\\Reflection\\DocBlock\\Tags\\Factory\\StaticMethod")
                    .addInterface("phpDocumentor\\Reflection\\DocBlock\\Tag")
                    .addExtendsClass("phpDocumentor\\Reflection\\DocBlock\\Tags\\BaseTag")
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
