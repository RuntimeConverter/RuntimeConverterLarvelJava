package com.project.convertedCode.includes.vendor.psr.log.Psr.Log;

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

 vendor/psr/log/Psr/Log/LoggerAwareTrait.php

*/

public class file_LoggerAwareTrait_php implements RuntimeIncludable {

    public static final file_LoggerAwareTrait_php instance = new file_LoggerAwareTrait_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2728 scope = new Scope2728();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2728 scope)
            throws IncludeEventException {

        // Conversion Note: class named LoggerAwareTrait was here in the source code
        env.addManualClassLoad("Psr\\Log\\LoggerAwareTrait");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/psr/log/Psr/Log")
                    .setFile("/vendor/psr/log/Psr/Log/LoggerAwareTrait.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2728 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
