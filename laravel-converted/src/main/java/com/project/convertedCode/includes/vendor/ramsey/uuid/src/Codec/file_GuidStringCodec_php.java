package com.project.convertedCode.includes.vendor.ramsey.uuid.src.Codec;

import com.runtimeconverter.runtime.RuntimeStack;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.IncludeEventException;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.interfaces.UpdateRuntimeScopeInterface;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/ramsey/uuid/src/Codec/GuidStringCodec.php

*/

public class file_GuidStringCodec_php implements RuntimeIncludable {

    public static final file_GuidStringCodec_php instance = new file_GuidStringCodec_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2881 scope = new Scope2881();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2881 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named GuidStringCodec was here in the source code
        env.addManualClassLoad("Ramsey\\Uuid\\Codec\\GuidStringCodec");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/ramsey/uuid/src/Codec")
                    .setFile("/vendor/ramsey/uuid/src/Codec/GuidStringCodec.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2881 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
