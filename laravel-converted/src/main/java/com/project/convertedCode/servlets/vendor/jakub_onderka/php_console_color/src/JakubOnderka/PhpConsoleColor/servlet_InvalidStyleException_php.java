package com.project.convertedCode.servlets.vendor.jakub_onderka.php_console_color.src.JakubOnderka.PhpConsoleColor;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        "/vendor/jakub-onderka/php-console-color/src/JakubOnderka/PhpConsoleColor/InvalidStyleException.php")
public class servlet_InvalidStyleException_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .jakub_onderka
                .php_console_color
                .src
                .JakubOnderka
                .PhpConsoleColor
                .file_InvalidStyleException_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
