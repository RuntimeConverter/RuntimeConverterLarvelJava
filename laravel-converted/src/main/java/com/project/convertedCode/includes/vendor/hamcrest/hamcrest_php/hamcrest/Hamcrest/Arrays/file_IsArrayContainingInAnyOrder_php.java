package com.project.convertedCode.includes.vendor.hamcrest.hamcrest_php.hamcrest.Hamcrest.Arrays;

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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContainingInAnyOrder.php

*/

public class file_IsArrayContainingInAnyOrder_php implements RuntimeIncludable {

    public static final file_IsArrayContainingInAnyOrder_php instance =
            new file_IsArrayContainingInAnyOrder_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope800 scope = new Scope800();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope800 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named IsArrayContainingInAnyOrder was here in the source code
        env.addManualClassLoad("Hamcrest\\Arrays\\IsArrayContainingInAnyOrder");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays")
                    .setFile(
                            "/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Arrays/IsArrayContainingInAnyOrder.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope800 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
