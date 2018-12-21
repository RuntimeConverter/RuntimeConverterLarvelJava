package com.project.convertedCode.globalNamespace.functions;

import com.project.convertedCode.globalNamespace.functions.app;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_ltrim;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.annotations.ConvertedParameter;
import com.runtimeconverter.runtime.arrays.ZPair;
import static com.runtimeconverter.runtime.ZVal.toStringR;
import static com.runtimeconverter.runtime.ZVal.assignParameter;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/laravel/framework/src/Illuminate/Foundation/helpers.php

*/

public class public_path extends FunctionBaseRegular {

    public static public_path f = new public_path();

    @ConvertedMethod
    @ConvertedParameter(index = 0, name = "path")
    public Object call(RuntimeEnv env, Object... args) {
        Object path = assignParameter(args, 0, true);
        if (null == path) {
            path = "";
        }
        return ZVal.assign(
                toStringR(
                                env.callMethod(
                                        app.f.env(env).call().value(),
                                        "make",
                                        public_path.class,
                                        "path.public"),
                                env)
                        + toStringR(
                                ZVal.isTrue(path)
                                        ? toStringR("/", env)
                                                + toStringR(
                                                        function_ltrim
                                                                .f
                                                                .env(env)
                                                                .call(path, "/")
                                                                .value(),
                                                        env)
                                        : path,
                                env));
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/laravel/framework/src/Illuminate/Foundation")
                .setFile("/vendor/laravel/framework/src/Illuminate/Foundation/helpers.php");
    }
}
