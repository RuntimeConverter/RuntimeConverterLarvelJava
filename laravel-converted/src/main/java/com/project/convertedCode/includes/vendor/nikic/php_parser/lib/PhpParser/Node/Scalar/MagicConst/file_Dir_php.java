package com.project.convertedCode.includes.vendor.nikic.php_parser.lib.PhpParser.Node.Scalar.MagicConst;

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

 vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/MagicConst/Dir.php

*/

public class file_Dir_php implements RuntimeIncludable {

    public static final file_Dir_php instance = new file_Dir_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2154 scope = new Scope2154();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2154 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named Dir was here in the source code
        env.addManualClassLoad("PhpParser\\Node\\Scalar\\MagicConst\\Dir");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/MagicConst")
                    .setFile(
                            "/vendor/nikic/php-parser/lib/PhpParser/Node/Scalar/MagicConst/Dir.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2154 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
