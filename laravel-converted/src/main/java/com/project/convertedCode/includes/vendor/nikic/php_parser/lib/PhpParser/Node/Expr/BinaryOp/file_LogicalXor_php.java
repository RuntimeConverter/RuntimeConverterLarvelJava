package com.project.convertedCode.includes.vendor.nikic.php_parser.lib.PhpParser.Node.Expr.BinaryOp;

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

 vendor/nikic/php-parser/lib/PhpParser/Node/Expr/BinaryOp/LogicalXor.php

*/

public class file_LogicalXor_php implements RuntimeIncludable {

    public static final file_LogicalXor_php instance = new file_LogicalXor_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2085 scope = new Scope2085();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2085 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named LogicalXor was here in the source code
        env.addManualClassLoad("PhpParser\\Node\\Expr\\BinaryOp\\LogicalXor");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/nikic/php-parser/lib/PhpParser/Node/Expr/BinaryOp")
                    .setFile(
                            "/vendor/nikic/php-parser/lib/PhpParser/Node/Expr/BinaryOp/LogicalXor.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2085 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
