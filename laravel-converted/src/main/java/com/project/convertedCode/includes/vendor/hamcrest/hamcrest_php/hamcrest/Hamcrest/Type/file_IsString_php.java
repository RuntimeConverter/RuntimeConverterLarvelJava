package com.project.convertedCode.includes.vendor.hamcrest.hamcrest_php.hamcrest.Hamcrest.Type;

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

 vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Type/IsString.php

*/

public class file_IsString_php implements RuntimeIncludable {

    public static final file_IsString_php instance = new file_IsString_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope861 scope = new Scope861();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope861 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named IsString was here in the source code
        env.addManualClassLoad("Hamcrest\\Type\\IsString");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Type")
                    .setFile("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Type/IsString.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope861 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
