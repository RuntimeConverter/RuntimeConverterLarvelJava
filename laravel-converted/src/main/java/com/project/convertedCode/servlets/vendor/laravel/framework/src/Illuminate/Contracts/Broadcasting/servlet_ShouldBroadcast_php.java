package com.project.convertedCode.servlets.vendor.laravel.framework.src.Illuminate.Contracts.Broadcasting;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/vendor/laravel/framework/src/Illuminate/Contracts/Broadcasting/ShouldBroadcast.php")
public class servlet_ShouldBroadcast_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .laravel
                .framework
                .src
                .Illuminate
                .Contracts
                .Broadcasting
                .file_ShouldBroadcast_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
