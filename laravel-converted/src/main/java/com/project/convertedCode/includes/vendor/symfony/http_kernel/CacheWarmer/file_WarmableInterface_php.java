package com.project.convertedCode.includes.vendor.symfony.http_kernel.CacheWarmer;

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

 vendor/symfony/http-kernel/CacheWarmer/WarmableInterface.php

*/

public class file_WarmableInterface_php implements RuntimeIncludable {

    public static final file_WarmableInterface_php instance = new file_WarmableInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3393 scope = new Scope3393();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3393 scope)
            throws IncludeEventException {

        // Conversion Note: class named WarmableInterface was here in the source code
        env.addManualClassLoad("Symfony\\Component\\HttpKernel\\CacheWarmer\\WarmableInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-kernel/CacheWarmer")
                    .setFile("/vendor/symfony/http-kernel/CacheWarmer/WarmableInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3393 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
