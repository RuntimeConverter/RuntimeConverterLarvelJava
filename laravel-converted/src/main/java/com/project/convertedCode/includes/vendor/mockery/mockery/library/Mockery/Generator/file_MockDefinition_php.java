package com.project.convertedCode.includes.vendor.mockery.mockery.library.Mockery.Generator;

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

 vendor/mockery/mockery/library/Mockery/Generator/MockDefinition.php

*/

public class file_MockDefinition_php implements RuntimeIncludable {

    public static final file_MockDefinition_php instance = new file_MockDefinition_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1773 scope = new Scope1773();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1773 scope)
            throws IncludeEventException {

        // Conversion Note: class named MockDefinition was here in the source code
        env.addManualClassLoad("Mockery\\Generator\\MockDefinition");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/mockery/mockery/library/Mockery/Generator")
                    .setFile(
                            "/vendor/mockery/mockery/library/Mockery/Generator/MockDefinition.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1773 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
