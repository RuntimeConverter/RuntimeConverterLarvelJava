package com.project.convertedCode.includes.vendor.mockery.mockery.library.Mockery.Generator.StringManipulation.Pass;

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

 vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/RemoveUnserializeForInternalSerializableClassesPass.php

*/

public class file_RemoveUnserializeForInternalSerializableClassesPass_php
        implements RuntimeIncludable {

    public static final file_RemoveUnserializeForInternalSerializableClassesPass_php instance =
            new file_RemoveUnserializeForInternalSerializableClassesPass_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope1786 scope = new Scope1786();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope1786 scope)
            throws IncludeEventException {

        // Namespace import was here
        // Conversion Note: class named RemoveUnserializeForInternalSerializableClassesPass was here
        // in the source code
        env.addManualClassLoad(
                "Mockery\\Generator\\StringManipulation\\Pass\\RemoveUnserializeForInternalSerializableClassesPass");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir(
                            "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass")
                    .setFile(
                            "/vendor/mockery/mockery/library/Mockery/Generator/StringManipulation/Pass/RemoveUnserializeForInternalSerializableClassesPass.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope1786 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
