package com.project.convertedCode.servlets.vendor.swiftmailer.swiftmailer.lib.classes.Swift.Signers;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/vendor/swiftmailer/swiftmailer/lib/classes/Swift/Signers/DKIMSigner.php")
public class servlet_DKIMSigner_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .swiftmailer
                .swiftmailer
                .lib
                .classes
                .Swift
                .Signers
                .file_DKIMSigner_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
