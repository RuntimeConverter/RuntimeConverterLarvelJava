package com.project.convertedCode.globalNamespace.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.project.convertedCode.globalNamespace.classes.Swift_Events_EventListener;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/CommandListener.php

*/

public interface Swift_Events_CommandListener extends Swift_Events_EventListener {

    public static final Object CONST_class = "Swift_Events_CommandListener";

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "evt", typeHint = "Swift_Events_CommandEvent")
    public Object commandSent(RuntimeEnv env, Object... args);

    static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Swift_Events_CommandListener")
                    .setLookup(Swift_Events_CommandListener.class, MethodHandles.lookup())
                    .setLocalProperties()
                    .setFilename(
                            "vendor/swiftmailer/swiftmailer/lib/classes/Swift/Events/CommandListener.php")
                    .addInterface("Swift_Events_EventListener")
                    .get();
}
