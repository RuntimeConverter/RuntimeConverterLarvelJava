package com.project.convertedCode.includes.vendor.swiftmailer.swiftmailer.lib.classes.Swift.ByteStream;

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

 vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/ArrayByteStream.php

*/

public class file_ArrayByteStream_php implements RuntimeIncludable {

    public static final file_ArrayByteStream_php instance = new file_ArrayByteStream_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2983 scope = new Scope2983();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2983 scope)
            throws IncludeEventException {
        // Conversion Note: class named Swift_ByteStream_ArrayByteStream was here in the source code
        env.addManualClassLoad("Swift_ByteStream_ArrayByteStream");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream")
                    .setFile(
                            "/vendor/swiftmailer/swiftmailer/lib/classes/Swift/ByteStream/ArrayByteStream.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2983 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
