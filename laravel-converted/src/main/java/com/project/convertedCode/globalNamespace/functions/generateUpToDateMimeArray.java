package com.project.convertedCode.globalNamespace.functions;

import com.runtimeconverter.runtime.references.ReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.string.function_trim;
import com.runtimeconverter.runtime.references.BasicReferenceContainer;
import com.runtimeconverter.runtime.nativeFunctions.typeIsA.function_is_array;
import com.runtimeconverter.runtime.nativeFunctions.pcre.function_preg_match_all;
import com.runtimeconverter.runtime.nativeFunctions.array.function_ksort;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.nativeFunctions.string.function_explode;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.references.ReferenceClassProperty;
import com.runtimeconverter.runtime.nativeFunctions.array.function_array_unique;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.nativeFunctions.constants.function_constant;
import com.runtimeconverter.runtime.arrays.ZPair;
import com.runtimeconverter.runtime.interfaces.ContextConstants;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strpos;
import com.runtimeconverter.runtime.nativeFunctions.string.function_strlen;
import com.runtimeconverter.runtime.functions.FunctionBaseRegular;
import com.runtimeconverter.runtime.arrays.ArrayAction;
import com.project.convertedCode.globalNamespace.NamespaceGlobal;
import com.runtimeconverter.runtime.nativeFunctions.array.function_end;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.nativeFunctions.file.function_file_get_contents;
import static com.runtimeconverter.runtime.ZVal.rToArrayCast;
import static com.runtimeconverter.runtime.ZVal.arrayActionR;
import static com.runtimeconverter.runtime.ZVal.toStringR;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/swiftmailer/swiftmailer/lib/swiftmailer_generate_mimes_config.php

*/

public class generateUpToDateMimeArray extends FunctionBaseRegular {

    public static generateUpToDateMimeArray f = new generateUpToDateMimeArray();

    @ConvertedMethod
    public Object call(RuntimeEnv env, Object... args) {
        int runtimeConverterContinueCount;
        Object preamble = null;
        Object extension = null;
        ReferenceContainer valid_mime_types = new BasicReferenceContainer(null);
        Object mime_xml = null;
        Object i = null;
        Object mime_types = null;
        ReferenceContainer matches = new BasicReferenceContainer(null);
        Object output = null;
        ReferenceContainer node = new BasicReferenceContainer(null);
        Object extensions = null;
        Object mime_type = null;
        Object xml = null;
        Object valid_mime_types_preset = null;
        preamble = "<?php\n\n";
        preamble = toStringR(preamble, env) + "/*\n";
        preamble = toStringR(preamble, env) + " * This file is part of SwiftMailer.\n";
        preamble = toStringR(preamble, env) + " * (c) 2004-2009 Chris Corbyn\n *\n";
        preamble =
                toStringR(preamble, env)
                        + " * For the full copyright and license information, please view the LICENSE\n";
        preamble =
                toStringR(preamble, env)
                        + " * file that was distributed with this source code.\n *\n";
        preamble =
                toStringR(preamble, env)
                        + " * autogenerated using https://svn.apache.org/repos/asf/httpd/httpd/trunk/docs/conf/mime.types\n";
        preamble =
                toStringR(preamble, env)
                        + " * and https://raw.github.com/minad/mimemagic/master/script/freedesktop.org.xml\n";
        preamble = toStringR(preamble, env) + " */\n\n";
        preamble = toStringR(preamble, env) + "/*\n";
        preamble =
                toStringR(preamble, env)
                        + " * List of MIME type automatically detected in Swift Mailer.\n";
        preamble = toStringR(preamble, env) + " */\n\n";
        preamble =
                toStringR(preamble, env)
                        + "// You may add or take away what you like (lowercase required)\n\n";
        mime_types =
                function_file_get_contents
                        .f
                        .env(env)
                        .call(function_constant.get(env, "APACHE_MIME_TYPES_URL"))
                        .value();
        mime_xml =
                function_file_get_contents
                        .f
                        .env(env)
                        .call(function_constant.get(env, "FREEDESKTOP_XML_URL"))
                        .value();
        valid_mime_types.setObject(ZVal.newArray());
        if (ZVal.strictNotEqualityCheck(
                false,
                "!==",
                function_preg_match_all
                        .f
                        .env(env)
                        .addReferenceArgs(new RuntimeArgsWithReferences().add(2, matches))
                        .call(
                                "/^#?([a-z0-9\\-\\+\\/\\.]+)[\\t]+(.*)$/miu",
                                mime_types,
                                matches.getObject())
                        .value())) {
            valid_mime_types_preset =
                    ZVal.newArray(
                            new ZPair("php", "application/x-php"),
                            new ZPair("php3", "application/x-php"),
                            new ZPair("php4", "application/x-php"),
                            new ZPair("php5", "application/x-php"),
                            new ZPair("zip", "application/zip"),
                            new ZPair("gif", "image/gif"),
                            new ZPair("png", "image/png"),
                            new ZPair("css", "text/css"),
                            new ZPair("js", "text/javascript"),
                            new ZPair("txt", "text/plain"),
                            new ZPair("aif", "audio/x-aiff"),
                            new ZPair("aiff", "audio/x-aiff"),
                            new ZPair("avi", "video/avi"),
                            new ZPair("bmp", "image/bmp"),
                            new ZPair("bz2", "application/x-bz2"),
                            new ZPair("csv", "text/csv"),
                            new ZPair("dmg", "application/x-apple-diskimage"),
                            new ZPair("doc", "application/msword"),
                            new ZPair(
                                    "docx",
                                    "application/vnd.openxmlformats-officedocument.wordprocessingml.document"),
                            new ZPair("eml", "message/rfc822"),
                            new ZPair("aps", "application/postscript"),
                            new ZPair("exe", "application/x-ms-dos-executable"),
                            new ZPair("flv", "video/x-flv"),
                            new ZPair("gz", "application/x-gzip"),
                            new ZPair("hqx", "application/stuffit"),
                            new ZPair("htm", "text/html"),
                            new ZPair("html", "text/html"),
                            new ZPair("jar", "application/x-java-archive"),
                            new ZPair("jpeg", "image/jpeg"),
                            new ZPair("jpg", "image/jpeg"),
                            new ZPair("m3u", "audio/x-mpegurl"),
                            new ZPair("m4a", "audio/mp4"),
                            new ZPair("mdb", "application/x-msaccess"),
                            new ZPair("mid", "audio/midi"),
                            new ZPair("midi", "audio/midi"),
                            new ZPair("mov", "video/quicktime"),
                            new ZPair("mp3", "audio/mpeg"),
                            new ZPair("mp4", "video/mp4"),
                            new ZPair("mpeg", "video/mpeg"),
                            new ZPair("mpg", "video/mpeg"),
                            new ZPair("odg", "vnd.oasis.opendocument.graphics"),
                            new ZPair("odp", "vnd.oasis.opendocument.presentation"),
                            new ZPair("odt", "vnd.oasis.opendocument.text"),
                            new ZPair("ods", "vnd.oasis.opendocument.spreadsheet"),
                            new ZPair("ogg", "audio/ogg"),
                            new ZPair("pdf", "application/pdf"),
                            new ZPair("ppt", "application/vnd.ms-powerpoint"),
                            new ZPair(
                                    "pptx",
                                    "application/vnd.openxmlformats-officedocument.presentationml.presentation"),
                            new ZPair("ps", "application/postscript"),
                            new ZPair("rar", "application/x-rar-compressed"),
                            new ZPair("rtf", "application/rtf"),
                            new ZPair("tar", "application/x-tar"),
                            new ZPair("sit", "application/x-stuffit"),
                            new ZPair("svg", "image/svg+xml"),
                            new ZPair("tif", "image/tiff"),
                            new ZPair("tiff", "image/tiff"),
                            new ZPair("ttf", "application/x-font-truetype"),
                            new ZPair("vcf", "text/x-vcard"),
                            new ZPair("wav", "audio/wav"),
                            new ZPair("wma", "audio/x-ms-wma"),
                            new ZPair("wmv", "audio/x-ms-wmv"),
                            new ZPair("xls", "application/vnd.ms-excel"),
                            new ZPair(
                                    "xlsx",
                                    "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
                            new ZPair("xml", "application/xml"));
            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1620 : ZVal.getIterable(valid_mime_types_preset, env, false)) {
                extension = ZVal.assign(zpairResult1620.getKey());
                mime_type = ZVal.assign(zpairResult1620.getValue());
                valid_mime_types
                        .arrayAccess(env, extension)
                        .set(
                                "'"
                                        + toStringR(extension, env)
                                        + "' => '"
                                        + toStringR(mime_type, env)
                                        + "'");
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1621 : ZVal.getIterable(matches.arrayGet(env, 2), env, false)) {
                i = ZVal.assign(zpairResult1621.getKey());
                extensions = ZVal.assign(zpairResult1621.getValue());
                extensions =
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        " ",
                                        NamespaceGlobal.strtolower
                                                .env(env)
                                                .call(extensions)
                                                .value())
                                .value();
                if (!function_is_array.f.env(env).call(extensions).getBool()) {
                    extensions = ZVal.newArray(new ZPair(0, extensions));
                }

                runtimeConverterContinueCount = 0;
                for (ZPair zpairResult1622 : ZVal.getIterable(extensions, env, true)) {
                    extension = ZVal.assign(zpairResult1622.getValue());
                    mime_type = ZVal.assign(matches.arrayGet(env, 1, i));
                    if (ZVal.isLessThan(
                            function_strlen.f.env(env).call(extension).value(), '<', 10)) {
                        if (!arrayActionR(ArrayAction.ISSET, valid_mime_types, env, mime_type)) {
                            valid_mime_types
                                    .arrayAccess(env, extension)
                                    .set(
                                            "'"
                                                    + toStringR(extension, env)
                                                    + "' => '"
                                                    + toStringR(mime_type, env)
                                                    + "'");
                        }
                    }
                }
            }
        }

        xml = NamespaceGlobal.simplexml_load_string.env(env).call(mime_xml).value();
        runtimeConverterContinueCount = 0;
        for (ZPair zpairResult1623 : ZVal.getIterable(xml, env, true)) {
            node.setObject(ZVal.assign(zpairResult1623.getValue()));
            if (!arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(node.getObject(), "glob", env),
                    env,
                    "pattern")) {
                continue;
            }

            runtimeConverterContinueCount = 0;
            for (ZPair zpairResult1624 :
                    ZVal.getIterable(
                            rToArrayCast(
                                    new ReferenceClassProperty(node.getObject(), "glob", env)
                                            .arrayGet(env, "pattern")),
                            env,
                            true)) {
                extension = ZVal.assign(zpairResult1624.getValue());
                if (ZVal.strictEqualityCheck(
                        false, "===", function_strpos.f.env(env).call(extension, ".").value())) {
                    continue;
                }

                extension =
                        function_explode
                                .f
                                .env(env)
                                .call(
                                        ".",
                                        NamespaceGlobal.strtolower.env(env).call(extension).value())
                                .value();
                extension = function_end.f.env(env).call(extension).value();
            }

            if (arrayActionR(
                    ArrayAction.ISSET,
                    new ReferenceClassProperty(node.getObject(), "glob", env),
                    env,
                    "pattern",
                    0)) {
                mime_type =
                        NamespaceGlobal.strtolower
                                .env(env)
                                .call(toStringR(node.arrayGet(env, "type"), env))
                                .value();
                extension =
                        NamespaceGlobal.strtolower
                                .env(env)
                                .call(
                                        function_trim
                                                .f
                                                .env(env)
                                                .call(
                                                        new ReferenceClassProperty(
                                                                        node.getObject(),
                                                                        "glob",
                                                                        env)
                                                                .arrayGet(env, "ddpattern", 0),
                                                        "*.")
                                                .value())
                                .value();
                if (ZVal.toBool(
                                ZVal.toBool(
                                                ZVal.strictNotEqualityCheck(
                                                        false,
                                                        "!==",
                                                        function_strpos
                                                                .f
                                                                .env(env)
                                                                .call(extension, ".")
                                                                .value()))
                                        || ZVal.toBool(
                                                ZVal.isLessThan(
                                                        function_strlen
                                                                .f
                                                                .env(env)
                                                                .call(extension)
                                                                .value(),
                                                        '<',
                                                        1)))
                        || ZVal.toBool(
                                ZVal.isGreaterThan(
                                        function_strlen.f.env(env).call(extension).value(),
                                        '>',
                                        9))) {
                    continue;
                }

                if (!arrayActionR(ArrayAction.ISSET, valid_mime_types, env, mime_type)) {
                    valid_mime_types
                            .arrayAccess(env, extension)
                            .set(
                                    "'"
                                            + toStringR(extension, env)
                                            + "' => '"
                                            + toStringR(mime_type, env)
                                            + "'");
                }
            }
        }

        valid_mime_types.setObject(
                function_array_unique.f.env(env).call(valid_mime_types.getObject()).value());
        function_ksort.f.env(env).call(valid_mime_types.getObject());
        output =
                toStringR(toStringR(preamble, env) + "$swift_mime_types = array(\n    ", env)
                        + toStringR(
                                NamespaceGlobal.implode
                                        .env(env)
                                        .call(valid_mime_types.getObject(), ",\n    ")
                                        .value(),
                                env)
                        + "\n);";
        NamespaceGlobal.file_put_contents.env(env).call("./mime_types.php", output).value();
        return null;
    }

    @Override
    protected ContextConstants getContextConstantsProtected() {
        return new ContextConstants()
                .setDir("/vendor/swiftmailer/swiftmailer/lib")
                .setFile(
                        "/vendor/swiftmailer/swiftmailer/lib/swiftmailer_generate_mimes_config.php");
    }
}
