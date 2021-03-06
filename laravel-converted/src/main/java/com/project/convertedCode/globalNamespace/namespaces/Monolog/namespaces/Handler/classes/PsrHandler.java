package com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.classes.Logger;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.project.convertedCode.globalNamespace.namespaces.Monolog.namespaces.Handler.classes.AbstractHandler;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import static com.runtimeconverter.runtime.ZVal.toObjectR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/monolog/monolog/src/Monolog/Handler/PsrHandler.php

*/

public class PsrHandler extends AbstractHandler {

    public Object logger = null;

    public PsrHandler(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == PsrHandler.class) {
            this.__construct(env, args);
        }
    }

    public PsrHandler(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "logger", typeHint = "Psr\\Log\\LoggerInterface")
    @ConvertedParameter(index = 1, name = "level")
    @ConvertedParameter(
        index = 2,
        name = "bubble",
        defaultValue = "true",
        defaultValueType = "constant"
    )
    public Object __construct(RuntimeEnv env, Object... args) {
        Object logger = assignParameter(args, 0, false);
        Object level = assignParameter(args, 1, true);
        if (null == level) {
            level = Logger.CONST_DEBUG;
        }
        Object bubble = assignParameter(args, 2, true);
        if (null == bubble) {
            bubble = true;
        }
        super.__construct(env, level, bubble);
        this.logger = logger;
        return null;
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "record", typeHint = "array")
    public Object handle(RuntimeEnv env, Object... args) {
        ReferenceContainer record = new BasicReferenceContainer(assignParameter(args, 0, false));
        if (!ZVal.isTrue(
                env.callMethod(this, "isHandling", PsrHandler.class, record.getObject()))) {
            return ZVal.assign(false);
        }

        env.callMethod(
                this.logger,
                "log",
                PsrHandler.class,
                NamespaceGlobal.strtolower
                        .env(env)
                        .call(record.arrayGet(env, "level_name"))
                        .value(),
                record.arrayGet(env, "message"),
                record.arrayGet(env, "context"));
        return ZVal.assign(
                ZVal.strictEqualityCheck(
                        false,
                        "===",
                        toObjectR(this).accessProp(this, env).name("bubble").value()));
    }

    public static final Object CONST_class = "Monolog\\Handler\\PsrHandler";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion extends AbstractHandler.RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Monolog\\Handler\\PsrHandler")
                    .setLookup(
                            PsrHandler.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("bubble", "formatter", "level", "logger", "processors")
                    .setFilename("vendor/monolog/monolog/src/Monolog/Handler/PsrHandler.php")
                    .addInterface("Monolog\\Handler\\HandlerInterface")
                    .addExtendsClass("Monolog\\Handler\\AbstractHandler")
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
