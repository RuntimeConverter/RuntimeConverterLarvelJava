package com.project.convertedCode.includes.vendor.symfony.console.Formatter;

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

 vendor/symfony/console/Formatter/OutputFormatterStyleInterface.php

*/

public class file_OutputFormatterStyleInterface_php implements RuntimeIncludable {

    public static final file_OutputFormatterStyleInterface_php instance =
            new file_OutputFormatterStyleInterface_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3173 scope = new Scope3173();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3173 scope)
            throws IncludeEventException {

        // Conversion Note: class named OutputFormatterStyleInterface was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\Console\\Formatter\\OutputFormatterStyleInterface");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/console/Formatter")
                    .setFile("/vendor/symfony/console/Formatter/OutputFormatterStyleInterface.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3173 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
