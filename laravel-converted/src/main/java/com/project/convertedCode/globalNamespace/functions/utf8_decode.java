package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.project.convertedCode.globalNamespace.namespaces.Symfony.namespaces.Polyfill.namespaces.Php72.classes.Php72;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/symfony/polyfill-php72/bootstrap.php

*/

public class utf8_decode extends FunctionBaseRegular {

    public static utf8_decode f = new utf8_decode();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "s")
    public Object call(RuntimeEnv env, Object... args) {
        Object s = assignParameter(args, 0, false);
        return ZVal.assign(Php72.runtimeStaticObject.utf8_decode(env, s));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/symfony/polyfill-php72")
                .setFile("/vendor/symfony/polyfill-php72/bootstrap.php");
    }
}
