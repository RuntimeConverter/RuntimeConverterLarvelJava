package com.project.convertedCode.includes.vendor.laravel.framework.src.Illuminate.Foundation.Testing.Constraints;

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

 vendor/laravel/framework/src/Illuminate/Foundation/Testing/Constraints/SoftDeletedInDatabase.php

*/

public class file_SoftDeletedInDatabase_php implements RuntimeIncludable {

    public static final file_SoftDeletedInDatabase_php instance =
            new file_SoftDeletedInDatabase_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1307 scope = new Scope1307();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1307 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Namespace import was here
        // Conversion Note: class named SoftDeletedInDatabase was here in the source code
        env.addManualClassLoad(
                "Illuminate\\Foundation\\Testing\\Constraints\\SoftDeletedInDatabase");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Constraints")
                    .setFile(
                            "/vendor/laravel/framework/src/Illuminate/Foundation/Testing/Constraints/SoftDeletedInDatabase.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1307 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
