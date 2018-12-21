package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.namespaces.Illuminate.namespaces.Support.classes.Str;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Support/helpers.php

*/

public class str_plural extends FunctionBaseRegular {

    public static str_plural f = new str_plural();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "value")
    @ConvertedParameter(index = 1, name = "count", defaultValue = "2", defaultValueType = "number")
    public Object call(RuntimeEnv env, Object... args) {
        Object value = assignParameter(args, 0, false);
        Object count = assignParameter(args, 1, true);
        if (null == count) {
            count = 2;
        }
        return ZVal.assign(Str.runtimeStaticObject.plural(env, value, count));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Support")
                .setFile("/vendor/laravel/framework/src/Illuminate/Support/helpers.php");
    }
}
