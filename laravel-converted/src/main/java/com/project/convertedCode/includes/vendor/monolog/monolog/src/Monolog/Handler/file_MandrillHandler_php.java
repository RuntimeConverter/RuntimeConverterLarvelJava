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

 vendor/monolog/monolog/src/Monolog/Handler/MandrillHandler.php

*/

public class file_MandrillHandler_php implements RuntimeIncludable {

    public static final file_MandrillHandler_php instance = new file_MandrillHandler_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1872 scope = new Scope1872();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1872 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named MandrillHandler was here in the source code
        env.addManualClassLoad("Monolog\\Handler\\MandrillHandler");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/monolog/monolog/src/Monolog/Handler")
                    .setFile("/vendor/monolog/monolog/src/Monolog/Handler/MandrillHandler.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1872 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
