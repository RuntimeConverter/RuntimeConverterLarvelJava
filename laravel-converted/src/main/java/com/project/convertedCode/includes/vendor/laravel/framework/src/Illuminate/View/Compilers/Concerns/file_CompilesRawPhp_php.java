package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.View.Compilers.Concerns;

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

 vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns/CompilesRawPhp.php

*/

public class file_CompilesRawPhp_php implements RuntimeIncludable {

    public static final file_CompilesRawPhp_php instance = new file_CompilesRawPhp_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1672 scope = new Scope1672();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1672 scope)
            throws IncludeEventException {

        // Conversion Note: class named CompilesRawPhp was here in the source code
        env.addManualClassLoad("Illuminate\\View\\Compilers\\Concerns\\CompilesRawPhp");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns/CompilesRawPhp.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1672 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
