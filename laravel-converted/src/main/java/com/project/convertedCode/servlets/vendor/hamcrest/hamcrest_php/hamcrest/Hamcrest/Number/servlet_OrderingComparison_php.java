package com.project.convertedCode.servlets.vendor.hamcrest.hamcrest_php.hamcrest.Hamcrest.Number;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/vendor/hamcrest/hamcrest-php/hamcrest/Hamcrest/Number/OrderingComparison.php")
public class servlet_OrderingComparison_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .hamcrest
                .hamcrest_php
                .hamcrest
                .Hamcrest
                .Number
                .file_OrderingComparison_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
