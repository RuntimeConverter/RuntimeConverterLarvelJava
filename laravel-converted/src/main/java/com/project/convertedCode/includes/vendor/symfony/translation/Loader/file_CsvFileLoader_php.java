package com.project.convertedCode.includes.vendor.symfony.translation.Loader;

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

 vendor/symfony/translation/Loader/CsvFileLoader.php

*/

public class file_CsvFileLoader_php implements RuntimeIncludable {

    public static final file_CsvFileLoader_php instance = new file_CsvFileLoader_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3634 scope = new Scope3634();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3634 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named CsvFileLoader was here in the source code
        env.addManualClassLoad("Symfony\\Component\\Translation\\Loader\\CsvFileLoader");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/translation/Loader")
                    .setFile("/vendor/symfony/translation/Loader/CsvFileLoader.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3634 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
