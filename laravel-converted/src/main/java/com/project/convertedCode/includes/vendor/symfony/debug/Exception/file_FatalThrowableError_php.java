package com.project.convertedCode.includes.vendor.symfony.debug.Exception;

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

 vendor/symfony/debug/Exception/FatalThrowableError.php

*/

public class file_FatalThrowableError_php implements RuntimeIncludable {

    public static final file_FatalThrowableError_php instance = new file_FatalThrowableError_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3272 scope = new Scope3272();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3272 scope)
            throws IncludeEventException {

        // Conversion Note: class named FatalThrowableError was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Debug\\Exception\\FatalThrowableError");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/debug/Exception")
                    .setFile("/vendor/symfony/debug/Exception/FatalThrowableError.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3272 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
