package com.project.convertedCode.servlets.vendor.jakub_onderka.php_console_highlighter.src.JakubOnderka.PhpConsoleHighlighter;

import com.runtimeconverter.runtime.includes.RuntimeIncludable;
import com.runtimeconverter.runtime.includes.RuntimeConverterServlet;
import com.runtimeconverter.runtime.RuntimeEnv;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        "/vendor/jakub-onderka/php-console-highlighter/src/JakubOnderka/PhpConsoleHighlighter/Highlighter.php")
public class servlet_Highlighter_php extends RuntimeConverterServlet {

    protected final RuntimeIncludable getInclude() {
        return com.project
                .convertedCode
                .includes
                .vendor
                .jakub_onderka
                .php_console_highlighter
                .src
                .JakubOnderka
                .PhpConsoleHighlighter
                .file_Highlighter_php
                .instance;
    }

    protected final RuntimeEnv getRuntimeEnv(
            String httpRequestType, HttpServletRequest req, HttpServletResponse resp) {
        return new com.project.convertedCode.main.ConvertedProjectRuntimeEnv(
                req, resp, this.getInclude());
    }
}
