package com.project.convertedCode.includes.vendor.symfony.http_foundation;

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

 vendor/symfony/http-foundation/HeaderUtils.php

*/

public class file_HeaderUtils_php implements RuntimeIncludable {

    public static final file_HeaderUtils_php instance = new file_HeaderUtils_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope3345 scope = new Scope3345();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope3345 scope)
            throws IncludeEventException {

        // Conversion Note: class named HeaderUtils was here in the source code
        env.addManualClassLoad("Symfony\\Component\\HttpFoundation\\HeaderUtils");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/symfony/http-foundation")
                    .setFile("/vendor/symfony/http-foundation/HeaderUtils.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope3345 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
