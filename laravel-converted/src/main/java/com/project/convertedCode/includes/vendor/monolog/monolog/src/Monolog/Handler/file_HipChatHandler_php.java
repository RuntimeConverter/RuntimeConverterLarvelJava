package com.project.convertedCode.includes.vendor.monolog.monolog.src.Monolog.Handler;

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

 vendor/monolog/monolog/src/Monolog/Handler/HipChatHandler.php

*/

public class file_HipChatHandler_php implements RuntimeIncludable {

    public static final file_HipChatHandler_php instance = new file_HipChatHandler_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1867 scope = new Scope1867();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1867 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named HipChatHandler was here in the source code
        env.addManualClassLoad("Monolog\\Handler\\HipChatHandler");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                    .setFile("/vendor/monolog/monolog/src/Monolog/Handler/HipChatHandler.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1867 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
