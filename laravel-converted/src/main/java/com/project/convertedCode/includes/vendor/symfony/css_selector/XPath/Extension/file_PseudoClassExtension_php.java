package com.project.convertedCode.includes.vendor.symfony.css_selector.XPath.Extension;

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

 vendor/symfony/css-selector/XPath/Extension/PseudoClassExtension.php

*/

public class file_PseudoClassExtension_php implements RuntimeIncludable {

    public static final file_PseudoClassExtension_php instance =
            new file_PseudoClassExtension_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3262 scope = new Scope3262();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3262 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named PseudoClassExtension was here in the source code
        env.addManualClassLoad(
                "Symfony\\Component\\CssSelector\\XPath\\Extension\\PseudoClassExtension");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/css-selector/XPath/Extension")
                    .setFile(
                            "/vendor/symfony/css-selector/XPath/Extension/PseudoClassExtension.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3262 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
