package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Contracts.Broadcasting;

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

 vendor/laravel/framework/src/Illuminate/Contracts/Broadcasting/ShouldBroadcastNow.php

*/

public class file_ShouldBroadcastNow_php implements RuntimeIncludable {

    public static final file_ShouldBroadcastNow_php instance = new file_ShouldBroadcastNow_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope997 scope = new Scope997();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope997 scope)
            throws IncludeEventException {

        // Conversion Note: class named ShouldBroadcastNow was here in the source code
        env.addManualClassLoad("Illuminate\\Contracts\\Broadcasting\\ShouldBroadcastNow");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Contracts/Broadcasting")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Contracts/Broadcasting/ShouldBroadcastNow.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope997 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
