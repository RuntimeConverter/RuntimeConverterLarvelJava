package com.project.convertedCode.includes.vendor.psy.psysh.src.TabCompletion.Matcher;

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

 vendor/psy/psysh/src/TabCompletion/Matcher/KeywordsMatcher.php

*/

public class file_KeywordsMatcher_php implements RuntimeIncludable {

    public static final file_KeywordsMatcher_php instance = new file_KeywordsMatcher_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2856 scope = new Scope2856();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2856 scope)
            throws IncludeEventException {

        // Conversion Note: class named KeywordsMatcher was here in the source code
        env.addManualClassLoad("Psy\\TabCompletion\\Matcher\\KeywordsMatcher");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/psy/psysh/src/TabCompletion/Matcher")
                    .setFile("/vendor/psy/psysh/src/TabCompletion/Matcher/KeywordsMatcher.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2856 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
