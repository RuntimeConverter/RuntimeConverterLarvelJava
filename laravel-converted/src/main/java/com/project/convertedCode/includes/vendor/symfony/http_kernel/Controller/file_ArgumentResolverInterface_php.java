package com.project.convertedCode.includes.vendor.symfony.http_kernel.Controller;

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

 vendor/symfony/http-kernel/Controller/ArgumentResolverInterface.php

*/

public class file_ArgumentResolverInterface_php implements RuntimeIncludable {

    public static final file_ArgumentResolverInterface_php instance =
            new file_ArgumentResolverInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3404 scope = new Scope3404();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3404 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named ArgumentResolverInterface was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\HttpKernel\\Controller\\ArgumentResolverInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-kernel/Controller")
                    .setFile(
                            "/vendor/symfony/http-kernel/Controller/ArgumentResolverInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3404 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
