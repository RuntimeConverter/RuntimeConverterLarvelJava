package com.project.convertedCode.includes.vendor.psy.psysh.src.VersionUpdater;

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

 vendor/psy/psysh/src/VersionUpdater/GitHubChecker.php

*/

public class file_GitHubChecker_php implements RuntimeIncludable {

    public static final file_GitHubChecker_php instance = new file_GitHubChecker_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2872 scope = new Scope2872();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2872 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named GitHubChecker was here in the source code
        env.addManualClassLoad("Psy\\VersionUpdater\\GitHubChecker");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/psy/psysh/src/VersionUpdater")
                    .setFile("/vendor/psy/psysh/src/VersionUpdater/GitHubChecker.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2872 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
