package com.project.convertedCode.includes.vendor.fzaninotto.faker.src.Faker;

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

 vendor/fzaninotto/faker/src/Faker/DefaultGenerator.php

*/

public class file_DefaultGenerator_php implements RuntimeIncludable {

    public static final file_DefaultGenerator_php instance = new file_DefaultGenerator_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope355 scope = new Scope355();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope355 scope)
            throws IncludeEventException {

        // Conversion Note: class named DefaultGenerator was here in the source code
        env.addManualClassLoad("Faker\\DefaultGenerator");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/fzaninotto/faker/src/Faker")
                    .setFile("/vendor/fzaninotto/faker/src/Faker/DefaultGenerator.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope355 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
