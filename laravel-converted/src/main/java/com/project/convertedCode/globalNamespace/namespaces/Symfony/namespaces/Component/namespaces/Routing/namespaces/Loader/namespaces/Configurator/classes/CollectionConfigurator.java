package com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.namespaces.Configurator.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.namespaces.Loader.namespaces.Configurator.classes.RouteConfigurator;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.nativeFunctions.string.function_sprintf;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.interfaces.RuntimeClassInterface;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.Route;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeClasses.spl.exceptions.LogicException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_diff_key;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_keys;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Component.namespaces.Routing.classes.RouteCollection;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/routing/Loader/Configurator/CollectionConfigurator.php

*/

public class CollectionConfigurator extends RuntimeClassBase {

    public Object parent = null;

    public Object parentConfigurator = null;

    public Object parentPrefixes = null;

    public Object collection = null;

    public Object name = "";

    public Object prefixes = null;

    public Object route = null;

    public CollectionConfigurator(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == CollectionConfigurator.class) {
            this.__construct(env, args);
        }
    }

    public CollectionConfigurator(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(
        index = 0,
        name = "parent",
        typeHint = "Symfony\\Component\\Routing\\RouteCollection"
    )
    @ConvertedParameter(index = 1, name = "name", typeHint = "string")
    @ConvertedParameter(
        index = 2,
        name = "parentConfigurator",
        typeHint = "self",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    @ConvertedParameter(
        index = 3,
        name = "parentPrefixes",
        typeHint = "array",
        defaultValue = "NULL",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object parent = assignParameter(args, 0, false);
        Object name = assignParameter(args, 1, false);
        Object parentConfigurator = assignParameter(args, 2, true);
        if (null == parentConfigurator) {
            parentConfigurator = ZVal.getNull();
        }
        Object parentPrefixes = assignParameter(args, 3, true);
        if (null == parentPrefixes) {
            parentPrefixes = ZVal.getNull();
        }
        this.parent = parent;
        this.name = name;
        this.collection = new RouteCollection(env);
        this.route = new Route(env, "");
        this.parentConfigurator = parentConfigurator;
        this.parentPrefixes = parentPrefixes;
        return null;
    }

    @ConvertedMethod
    public Object __destruct(RuntimeEnv env, Object... args) {
        if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.prefixes)) {
            env.callMethod(
                    this.collection,
                    "addPrefix",
                    CollectionConfigurator.class,
                    env.callMethod(this.route, "getPath", CollectionConfigurator.class));
        }

        env.callMethod(this.parent, "addCollection", CollectionConfigurator.class, this.collection);
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name")
    public final Object collection(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, true);
        if (null == name) {
            name = "";
        }
        return ZVal.assign(
                new com.project
                        .convertedCode
                        .globalNamespace
                        .namespaces
                        .Symfony
                        .namespaces
                        .Component
                        .namespaces
                        .Routing
                        .namespaces
                        .Loader
                        .namespaces
                        .Configurator
                        .classes
                        .CollectionConfigurator(
                        env,
                        this.collection,
                        toStringR(this.name, env) + toStringR(name, env),
                        this,
                        this.prefixes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "prefix")
    public final Object prefix(RuntimeEnv env, Object... args) {
        ReferenceContainer prefix = new BasicReferenceContainer(assignParameter(args, 0, false));
        Object localePrefix = null;
        Object missing = null;
        Object locale = null;
        if (function_is_array.f.env(env).call(prefix.getObject()).getBool()) {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.parentPrefixes)) {

            } else if (ZVal.isTrue(
                    missing =
                            function_array_diff_key
                                    .f
                                    .env(env)
                                    .call(this.parentPrefixes, prefix.getObject())
                                    .value())) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Collection \"%s\" is missing prefixes for locale(s) \"%s\".",
                                                this.name,
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                "\", \"",
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(missing)
                                                                        .value())
                                                        .value())
                                        .value()));

            } else {
                for (ZPair zpairResult2024 : ZVal.getIterable(prefix.getObject(), env, false)) {
                    locale = ZVal.assign(zpairResult2024.getKey());
                    localePrefix = ZVal.assign(zpairResult2024.getValue());
                    if (!arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "parentPrefixes", env),
                            env,
                            locale)) {
                        throw ZVal.getException(
                                env,
                                new LogicException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Collection \"%s\" with locale \"%s\" is missing a corresponding prefix in its parent collection.",
                                                        this.name, locale)
                                                .value()));
                    }

                    prefix.arrayAccess(env, locale)
                            .set(
                                    toStringR(
                                                    new ReferenceClassProperty(
                                                                    this, "parentPrefixes", env)
                                                            .arrayGet(env, locale),
                                                    env)
                                            + toStringR(localePrefix, env));
                }
            }

            this.prefixes = prefix.getObject();
            env.callMethod(this.route, "setPath", CollectionConfigurator.class, "/");

        } else {
            this.prefixes = ZVal.getNull();
            env.callMethod(this.route, "setPath", CollectionConfigurator.class, prefix.getObject());
        }

        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    private Object createRoute(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, false);
        return ZVal.assign(
                env.callMethod(
                        ((RuntimeClassInterface) this.route).phpClone(env),
                        "setPath",
                        CollectionConfigurator.class,
                        path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "path")
    public final Object add(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        Object routes = null;
        Object route = null;
        ReferenceContainer paths = new BasicReferenceContainer(null);
        Object localePath = null;
        Object prefix = null;
        Object missing = null;
        Object parentConfigurator = null;
        Object locale = null;
        paths.setObject(ZVal.newArray());
        parentConfigurator =
                ZVal.assign(
                        ZVal.isTrue(
                                        ZVal.checkInstanceType(
                                                this,
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Symfony
                                                        .namespaces
                                                        .Component
                                                        .namespaces
                                                        .Routing
                                                        .namespaces
                                                        .Loader
                                                        .namespaces
                                                        .Configurator
                                                        .classes
                                                        .CollectionConfigurator
                                                        .class,
                                                "Symfony\\Component\\Routing\\Loader\\Configurator\\CollectionConfigurator"))
                                ? this
                                : ZVal.isTrue(
                                                ZVal.checkInstanceType(
                                                        this,
                                                        RouteConfigurator.class,
                                                        "Symfony\\Component\\Routing\\Loader\\Configurator\\RouteConfigurator"))
                                        ? this.parentConfigurator
                                        : ZVal.getNull());
        if (function_is_array.f.env(env).call(path).getBool()) {
            if (ZVal.strictEqualityCheck(ZVal.getNull(), "===", this.prefixes)) {
                paths.setObject(ZVal.assign(path));

            } else if (ZVal.isTrue(
                    missing =
                            function_array_diff_key.f.env(env).call(this.prefixes, path).value())) {
                throw ZVal.getException(
                        env,
                        new LogicException(
                                env,
                                function_sprintf
                                        .f
                                        .env(env)
                                        .call(
                                                "Route \"%s\" is missing routes for locale(s) \"%s\".",
                                                name,
                                                NamespaceGlobal.implode
                                                        .env(env)
                                                        .call(
                                                                "\", \"",
                                                                function_array_keys
                                                                        .f
                                                                        .env(env)
                                                                        .call(missing)
                                                                        .value())
                                                        .value())
                                        .value()));

            } else {
                for (ZPair zpairResult2384 : ZVal.getIterable(path, env, false)) {
                    locale = ZVal.assign(zpairResult2384.getKey());
                    localePath = ZVal.assign(zpairResult2384.getValue());
                    if (!arrayActionR(
                            ArrayAction.ISSET,
                            new ReferenceClassProperty(this, "prefixes", env),
                            env,
                            locale)) {
                        throw ZVal.getException(
                                env,
                                new LogicException(
                                        env,
                                        function_sprintf
                                                .f
                                                .env(env)
                                                .call(
                                                        "Route \"%s\" with locale \"%s\" is missing a corresponding prefix in its parent collection.",
                                                        name, locale)
                                                .value()));
                    }

                    paths.arrayAccess(env, locale)
                            .set(
                                    toStringR(
                                                    new ReferenceClassProperty(
                                                                    this, "prefixes", env)
                                                            .arrayGet(env, locale),
                                                    env)
                                            + toStringR(localePath, env));
                }
            }

        } else if (ZVal.strictNotEqualityCheck(ZVal.getNull(), "!==", this.prefixes)) {
            for (ZPair zpairResult2385 : ZVal.getIterable(this.prefixes, env, false)) {
                locale = ZVal.assign(zpairResult2385.getKey());
                prefix = ZVal.assign(zpairResult2385.getValue());
                paths.arrayAccess(env, locale).set(toStringR(prefix, env) + toStringR(path, env));
            }

        } else {
            env.callMethod(
                    this.collection,
                    new RuntimeArgsWithReferences(),
                    "add",
                    CollectionConfigurator.class,
                    toStringR(this.name, env) + toStringR(name, env),
                    route = this.createRoute(env, path));
            return ZVal.assign(
                    new RouteConfigurator(
                            env,
                            this.collection,
                            route,
                            this.name,
                            parentConfigurator,
                            this.prefixes));
        }

        routes = new RouteCollection(env);
        for (ZPair zpairResult2386 : ZVal.getIterable(paths.getObject(), env, false)) {
            locale = ZVal.assign(zpairResult2386.getKey());
            path = ZVal.assign(zpairResult2386.getValue());
            env.callMethod(
                    routes,
                    new RuntimeArgsWithReferences(),
                    "add",
                    CollectionConfigurator.class,
                    toStringR(name, env) + "." + toStringR(locale, env),
                    route = this.createRoute(env, path));
            env.callMethod(
                    this.collection,
                    new RuntimeArgsWithReferences(),
                    "add",
                    CollectionConfigurator.class,
                    toStringR(this.name, env) + toStringR(name, env) + "." + toStringR(locale, env),
                    route);
            env.callMethod(route, "setDefault", CollectionConfigurator.class, "_locale", locale);
            env.callMethod(
                    route,
                    "setDefault",
                    CollectionConfigurator.class,
                    "_canonical_route",
                    toStringR(this.name, env) + toStringR(name, env));
        }

        return ZVal.assign(
                new RouteConfigurator(
                        env,
                        this.collection,
                        routes,
                        this.name,
                        parentConfigurator,
                        this.prefixes));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "name", typeHint = "string")
    @ConvertedParameter(index = 1, name = "path")
    public final Object __invoke(RuntimeEnv env, Object... args) {
        Object name = assignParameter(args, 0, false);
        Object path = assignParameter(args, 1, false);
        return ZVal.assign(this.add(env, name, path));
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "defaults", typeHint = "array")
    public final Object defaults(RuntimeEnv env, Object... args) {
        Object defaults = assignParameter(args, 0, false);
        env.callMethod(this.route, "addDefaults", CollectionConfigurator.class, defaults);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "requirements", typeHint = "array")
    public final Object requirements(RuntimeEnv env, Object... args) {
        Object requirements = assignParameter(args, 0, false);
        env.callMethod(this.route, "addRequirements", CollectionConfigurator.class, requirements);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "options", typeHint = "array")
    public final Object options(RuntimeEnv env, Object... args) {
        Object options = assignParameter(args, 0, false);
        env.callMethod(this.route, "addOptions", CollectionConfigurator.class, options);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "condition", typeHint = "string")
    public final Object condition(RuntimeEnv env, Object... args) {
        Object condition = assignParameter(args, 0, false);
        env.callMethod(this.route, "setCondition", CollectionConfigurator.class, condition);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "pattern", typeHint = "string")
    public final Object host(RuntimeEnv env, Object... args) {
        Object pattern = assignParameter(args, 0, false);
        env.callMethod(this.route, "setHost", CollectionConfigurator.class, pattern);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "schemes", typeHint = "array")
    public final Object schemes(RuntimeEnv env, Object... args) {
        Object schemes = assignParameter(args, 0, false);
        env.callMethod(this.route, "setSchemes", CollectionConfigurator.class, schemes);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "methods", typeHint = "array")
    public final Object methods(RuntimeEnv env, Object... args) {
        Object methods = assignParameter(args, 0, false);
        env.callMethod(this.route, "setMethods", CollectionConfigurator.class, methods);
        return ZVal.assign(this);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "controller")
    public final Object controller(RuntimeEnv env, Object... args) {
        Object controller = assignParameter(args, 0, false);
        env.callMethod(
                this.route,
                "addDefaults",
                CollectionConfigurator.class,
                ZVal.newArray(new ZPair("_controller", controller)));
        return ZVal.assign(this);
    }

    public static final Object CONST_class =
            "Symfony\\Component\\Routing\\Loader\\Configurator\\CollectionConfigurator";

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
                    .setName(
                            "Symfony\\Component\\Routing\\Loader\\Configurator\\CollectionConfigurator")
                    .setLookup(
                            CollectionConfigurator.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties(
                            "collection",
                            "name",
                            "parent",
                            "parentConfigurator",
                            "parentPrefixes",
                            "prefixes",
                            "route")
                    .setFilename(
                            "vendor/symfony/routing/Loader/Configurator/CollectionConfigurator.php")
                    .addTrait("Symfony\\Component\\Routing\\Loader\\Configurator\\Traits\\AddTrait")
                    .addTrait(
                            "Symfony\\Component\\Routing\\Loader\\Configurator\\Traits\\RouteTrait")
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
