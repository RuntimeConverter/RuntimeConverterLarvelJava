package com.project.convertedCode.includes.vendor.ramsey.uuid.src.Converter.Number;

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

 vendor/ramsey/uuid/src/Converter/Number/DegradedNumberConverter.php

*/

public class file_DegradedNumberConverter_php implements RuntimeIncludable {

    public static final file_DegradedNumberConverter_php instance =
            new file_DegradedNumberConverter_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2887 scope = new Scope2887();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2887 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named DegradedNumberConverter was here in the source code
        env.addManualClassLoad("Ramsey\\Uuid\\Converter\\Number\\DegradedNumberConverter");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/ramsey/uuid/src/Converter/Number")
                    .setFile(
                            "/vendor/ramsey/uuid/src/Converter/Number/DegradedNumberConverter.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2887 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
