package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Queue.Connectors;

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

 vendor/laravel/framework/src/Illuminate/Queue/Connectors/ConnectorInterface.php

*/

public class file_ConnectorInterface_php implements RuntimeIncludable {

    public static final file_ConnectorInterface_php instance = new file_ConnectorInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1446 scope = new Scope1446();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1446 scope)
            throws IncludeEventException {

        // Conversion Note: class named ConnectorInterface was here in the source code
        env.addManualClassLoad("Illuminate\\Queue\\Connectors\\ConnectorInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/laravel/framework/src/Illuminate/Queue/Connectors")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Queue/Connectors/ConnectorInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1446 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
