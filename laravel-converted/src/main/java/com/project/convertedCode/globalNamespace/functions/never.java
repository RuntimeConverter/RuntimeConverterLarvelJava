package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.PHPUnit.namespaces.Framework.namespaces.MockObject.namespaces.Matcher.classes.InvokedCount;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/phpunit/phpunit/src/Framework/Assert/Functions.php

*/

public class never extends FunctionBaseRegular {

    public static never f = new never();

    @ConvertedMethod
    public Object call(RuntimeEnv env, Object... args) {
        return ZVal.assign(new InvokedCount(env, 0));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/phpunit/phpunit/src/Framework/Assert")
                .setFile("/vendor/phpunit/phpunit/src/Framework/Assert/Functions.php");
    }
}
