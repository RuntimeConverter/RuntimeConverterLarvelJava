package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.Plugins;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/ReporterPlugin.php

*/

public class file_ReporterPlugin_php implements RuntimeIncludable {

    public static final file_ReporterPlugin_php instance = new file_ReporterPlugin_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3086 scope = new Scope3086();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3086 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_Plugins_ReporterPlugin was here in the source code
        env.addManualClassLoad("Swift_Plugins_ReporterPlugin");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Plugins/ReporterPlugin.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3086 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
