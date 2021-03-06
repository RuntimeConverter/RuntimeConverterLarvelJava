package com.project.convertedCode.includes.vendor.symfony.routing.Loader.Configurator;

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

 vendor/symfony/routing/Loader/Configurator/RouteConfigurator.php

*/

public class file_RouteConfigurator_php implements RuntimeIncludable {

    public static final file_RouteConfigurator_php instance = new file_RouteConfigurator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3565 scope = new Scope3565();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3565 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named RouteConfigurator was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\Routing\\Loader\\Configurator\\RouteConfigurator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/routing/Loader/Configurator")
                    .setFile("/vendor/symfony/routing/Loader/Configurator/RouteConfigurator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3565 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
