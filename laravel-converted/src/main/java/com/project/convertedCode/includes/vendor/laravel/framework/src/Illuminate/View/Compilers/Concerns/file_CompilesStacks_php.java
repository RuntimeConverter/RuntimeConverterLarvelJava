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

 vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns/CompilesStacks.php

*/

public class file_CompilesStacks_php implements RuntimeIncludable {

    public static final file_CompilesStacks_php instance = new file_CompilesStacks_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1673 scope = new Scope1673();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1673 scope)
            throws IncludeEventException {

        // Conversion Note: class named CompilesStacks was here in the source code
        env.addManualClassLoad("Illuminate\\View\\Compilers\\Concerns\\CompilesStacks");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/View/Compilers/Concerns/CompilesStacks.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1673 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
