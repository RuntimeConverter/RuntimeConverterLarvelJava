package com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Database.namespaces.Events.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.StaticBaseClass;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Database/Events/ConnectionEvent.php

*/

public abstract class ConnectionEvent extends RuntimeClassBase {

    public Object connectionName = null;

    public Object connection = null;

    public ConnectionEvent(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == ConnectionEvent.class) {
            this.__construct(env, args);
        }
    }

    public ConnectionEvent(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "connection")
    public Object __construct(RuntimeEnv env, Object... args) {
        Object connection = assignParameter(args, 0, false);
        this.connection = connection;
        this.connectionName = env.callMethod(connection, "getName", ConnectionEvent.class);
        return null;
    }

    public static final Object CONST_class = "Illuminate\\Database\\Events\\ConnectionEvent";

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
                    .setName("Illuminate\\Database\\Events\\ConnectionEvent")
                    .setLookup(
                            ConnectionEvent.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("connection", "connectionName")
                    .setFilename(
                            "vendor/laravel/framework/src/Illuminate/Database/Events/ConnectionEvent.php")
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
