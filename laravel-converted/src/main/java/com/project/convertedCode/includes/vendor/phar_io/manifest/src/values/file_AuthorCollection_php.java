package com.project.convertedCode.includes.vendor.phar_io.manifest.src.values;

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

 vendor/phar-io/manifest/src/values/AuthorCollection.php

*/

public class file_AuthorCollection_php implements RuntimeIncludable {

    public static final file_AuthorCollection_php instance = new file_AuthorCollection_php();

    public final void include(RuntimeEnv env, RuntimeStack stack) throws IncludeEventException {
        Scope2273 scope = new Scope2273();
        stack.pushScope(scope);
        this.include(env, stack, scope);
        stack.popScope();
    }

    public final void include(RuntimeEnv env, RuntimeStack stack, Scope2273 scope)
            throws IncludeEventException {

        // Conversion Note: class named AuthorCollection was here in the source code
        env.addManualClassLoad("PharIo\\Manifest\\AuthorCollection");
    }

    private static final ContextConstants runtimeConverterContextContantsInstance =
            new ContextConstants()
                    .setDir("/vendor/phar-io/manifest/src/values")
                    .setFile("/vendor/phar-io/manifest/src/values/AuthorCollection.php");

    public ContextConstants getContextConstants() {
        return runtimeConverterContextContantsInstance;
    }

    private static class Scope2273 implements UpdateRuntimeScopeInterface {

        public void updateStack(RuntimeStack stack) {}

        public void updateScope(RuntimeStack stack) {}
    }
}
