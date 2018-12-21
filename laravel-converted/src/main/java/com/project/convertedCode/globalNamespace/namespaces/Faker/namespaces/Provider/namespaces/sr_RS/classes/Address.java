package com.project.convertedCode.globalNamespace.namespaces.Faker.namespaces.Provider.namespaces.sr_RS.classes;

import java.lang.invoke.MethodHandles;
import com.runtimeconverter.runtime.passByReference.PassByReferenceArgs;
import com.runtimeconverter.runtime.classes.NoConstructor;
import com.runtimeconverter.runtime.classes.RuntimeClassBase;
import com.runtimeconverter.runtime.classes.StaticMethodUtils;
import com.runtimeconverter.runtime.RuntimeEnv;
import com.runtimeconverter.runtime.annotations.ConvertedMethod;
import com.runtimeconverter.runtime.passByReference.RuntimeArgsWithReferences;
import com.runtimeconverter.runtime.ZVal;
import com.runtimeconverter.runtime.reflection.ReflectionClassData;
import com.runtimeconverter.runtime.arrays.ZPair;

/*

 Converted with The Runtime Converter (runtimeconverter.com)

 vendor/fzaninotto/faker/src/Faker/Provider/sr_RS/Address.php

*/

public class Address
        extends com.project
                .convertedCode
                .globalNamespace
                .namespaces
                .Faker
                .namespaces
                .Provider
                .classes
                .Address {

    public Address(RuntimeEnv env, Object... args) {
        super(env);
        if (this.getClass() == Address.class) {
            this.__construct(env, args);
        }
    }

    public Address(NoConstructor n) {
        super(n);
    }

    @ConvertedMethod
    public Object cityName(RuntimeEnv env, Object... args) {
        return ZVal.assign(
                StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                        .method("randomElement")
                        .addReferenceArgs(
                                new RuntimeArgsWithReferences()
                                        .add(
                                                0,
                                                env.getRequestStaticPropertiesReference(
                                                        com.project
                                                                .convertedCode
                                                                .globalNamespace
                                                                .namespaces
                                                                .Faker
                                                                .namespaces
                                                                .Provider
                                                                .namespaces
                                                                .sr_RS
                                                                .classes
                                                                .Address
                                                                .RequestStaticProperties
                                                                .class,
                                                        "cityNames")))
                        .call(
                                env.getRequestStaticProperties(
                                                com.project
                                                        .convertedCode
                                                        .globalNamespace
                                                        .namespaces
                                                        .Faker
                                                        .namespaces
                                                        .Provider
                                                        .namespaces
                                                        .sr_RS
                                                        .classes
                                                        .Address
                                                        .RequestStaticProperties
                                                        .class)
                                        .cityNames)
                        .value());
    }

    public static final Object CONST_class = "Faker\\Provider\\sr_RS\\Address";

    // Runtime Converter Internals
    // RuntimeStaticCompanion contains static methods
    // RequestStaticProperties contains static (per-request) properties
    // ReflectionClassData contains php reflection data used by the runtime library

    public static class RuntimeStaticCompanion
            extends com.project
                    .convertedCode
                    .globalNamespace
                    .namespaces
                    .Faker
                    .namespaces
                    .Provider
                    .classes
                    .Address
                    .RuntimeStaticCompanion {

        private static final MethodHandles.Lookup staticCompanionLookup = MethodHandles.lookup();

        @ConvertedMethod
        public Object streetPrefix(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .sr_RS
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .streetPrefix)
                            .value());
        }

        @ConvertedMethod
        public Object street(RuntimeEnv env, Object... args) {
            return ZVal.assign(
                    StaticMethodUtils.accessUnknownLateStaticMethod(env, this, Address.class)
                            .method("randomElement")
                            .addReferenceArgs(new RuntimeArgsWithReferences())
                            .call(
                                    env.getRequestStaticProperties(
                                                    com.project
                                                            .convertedCode
                                                            .globalNamespace
                                                            .namespaces
                                                            .Faker
                                                            .namespaces
                                                            .Provider
                                                            .namespaces
                                                            .sr_RS
                                                            .classes
                                                            .Address
                                                            .RequestStaticProperties
                                                            .class)
                                            .street)
                            .value());
        }
    }

    public static final RuntimeStaticCompanion runtimeStaticObject = new RuntimeStaticCompanion();

    public static class RequestStaticProperties {

        public Object postcode = ZVal.arrayFromList("#####");

        public Object streetPrefix =
                ZVal.arrayFromList("\u0411\u0443\u043B\u0435\u0432\u0430\u0440");

        public Object street =
                ZVal.arrayFromList(
                        "\u041A\u0440\u0430\u0459\u0430 \u041C\u0438\u043B\u0430\u043D\u0430",
                        "\u0426\u0430\u0440\u0430 \u0414\u0443\u0448\u0430\u043D\u0430",
                        "\u041D\u0438\u043A\u043E\u043B\u0435 \u0422\u0435\u0441\u043B\u0435",
                        "\u041C\u0438\u0445\u0430\u0458\u043B\u0430 \u041F\u0443\u043F\u0438\u043D\u0430",
                        "\u041D\u0438\u043A\u043E\u043B\u0435 \u041F\u0430\u0448\u0438\u045B\u0430");

        public Object streetNameFormats =
                ZVal.arrayFromList("{{street}}", "{{streetPrefix}} {{street}}");

        public Object streetAddressFormats =
                ZVal.arrayFromList("{{streetName}} {{buildingNumber}}");

        public Object cityFormats = ZVal.arrayFromList("{{cityName}}");

        public Object cityNames =
                ZVal.arrayFromList(
                        "\u0411\u0435\u043E\u0433\u0440\u0430\u0434",
                        "\u0412\u0430\u0459\u0435\u0432\u043E",
                        "\u0412\u0440\u0430\u045A\u0435",
                        "\u0417\u0430\u0458\u0435\u0447\u0430\u0440",
                        "\u0417\u0440\u0435\u045A\u0430\u043D\u0438\u043D",
                        "\u0408\u0430\u0433\u043E\u0434\u0438\u043D\u0430",
                        "\u041A\u0440\u0430\u0433\u0443\u0458\u0435\u0432\u0430\u0446",
                        "\u041A\u0440\u0430\u0459\u0435\u0432\u043E",
                        "\u041A\u0440\u0443\u0448\u0435\u0432\u0430\u0446",
                        "\u041B\u0435\u0441\u043A\u043E\u0432\u0430\u0446",
                        "\u041B\u043E\u0437\u043D\u0438\u0446\u0430",
                        "\u041D\u0438\u0448",
                        "\u041D\u043E\u0432\u0438 \u041F\u0430\u0437\u0430\u0440",
                        "\u041D\u043E\u0432\u0438 \u0421\u0430\u0434",
                        "\u041F\u0430\u043D\u0447\u0435\u0432\u043E",
                        "\u041F\u043E\u0436\u0430\u0440\u0435\u0432\u0430\u0446",
                        "\u041F\u0440\u0438\u0448\u0442\u0438\u043D\u0430",
                        "\u0421\u043C\u0435\u0434\u0435\u0440\u0435\u0432\u043E",
                        "\u0421\u043E\u043C\u0431\u043E\u0440",
                        "\u0421\u0440\u0435\u043C\u0441\u043A\u0430 \u041C\u0438\u0442\u0440\u043E\u0432\u0438\u0446\u0430",
                        "\u0421\u0443\u0431\u043E\u0442\u0438\u0446\u0430",
                        "\u0423\u0436\u0438\u0446\u0435",
                        "\u0427\u0430\u0447\u0430\u043A",
                        "\u0428\u0430\u0431\u0430\u0446");

        public Object country =
                ZVal.arrayFromLambdaExpression(
                        /* Lambda can be removed if method size limit (64kb) is not an issue. */
                        () -> {
                            return ZVal.arrayFromList(
                                    "\u041E\u0441\u0442\u0440\u0432\u043E \u0410\u0441\u0435\u043D\u0441\u0438\u043E\u043D",
                                    "\u0410\u043D\u0434\u043E\u0440\u0430",
                                    "\u0423\u0458\u0435\u0434\u0438\u045A\u0435\u043D\u0438 \u0410\u0440\u0430\u043F\u0441\u043A\u0438 \u0415\u043C\u0438\u0440\u0430\u0442\u0438",
                                    "\u0410\u0432\u0433\u0430\u043D\u0438\u0441\u0442\u0430\u043D",
                                    "\u0410\u043D\u0442\u0438\u0433\u0432\u0435 \u0438 \u0411\u0430\u0440\u0431\u0443\u0434\u0430",
                                    "\u0410\u043D\u0433\u0432\u0438\u043B\u0430",
                                    "\u0410\u043B\u0431\u0430\u043D\u0438\u0458\u0430",
                                    "\u0410\u0440\u043C\u0435\u043D\u0438\u0458\u0430",
                                    "\u0425\u043E\u043B\u0430\u043D\u0434\u0441\u043A\u0438 \u0410\u043D\u0442\u0438\u043B\u0438",
                                    "\u0410\u043D\u0433\u043E\u043B\u0430",
                                    "\u0410\u043D\u0442\u0430\u0440\u043A\u0442\u0438\u043A",
                                    "\u0410\u0440\u0433\u0435\u043D\u0442\u0438\u043D\u0430",
                                    "\u0410\u043C\u0435\u0440\u0438\u0447\u043A\u0430 \u0421\u0430\u043C\u043E\u0430",
                                    "\u0410\u0443\u0441\u0442\u0440\u0438\u0458\u0430",
                                    "\u0410\u0443\u0441\u0442\u0440\u0430\u043B\u0438\u0458\u0430",
                                    "\u0410\u0440\u0443\u0431\u0430",
                                    "\u0410\u043B\u0430\u043D\u0434\u0441\u043A\u0430 \u043E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0410\u0437\u0435\u0440\u0431\u0435\u0458\u045F\u0430\u043D",
                                    "\u0411\u043E\u0441\u043D\u0430 \u0438 \u0425\u0435\u0440\u0446\u0435\u0433\u043E\u0432\u0438\u043D\u0430",
                                    "\u0411\u0430\u0440\u0431\u0430\u0434\u043E\u0441",
                                    "\u0411\u0430\u043D\u0433\u043B\u0430\u0434\u0435\u0448",
                                    "\u0411\u0435\u043B\u0433\u0438\u0458\u0430",
                                    "\u0411\u0443\u0440\u043A\u0438\u043D\u0430 \u0424\u0430\u0441\u043E",
                                    "\u0411\u0443\u0433\u0430\u0440\u0441\u043A\u0430",
                                    "\u0411\u0430\u0445\u0440\u0435\u0438\u043D",
                                    "\u0411\u0443\u0440\u0443\u043D\u0434\u0438",
                                    "\u0411\u0435\u043D\u0438\u043D",
                                    "\u0421\u0432\u0435\u0442\u0438 \u0411\u0430\u0440\u0442\u043E\u043B\u043E\u043C\u0435\u0458",
                                    "\u0411\u0435\u0440\u043C\u0443\u0434\u0430",
                                    "\u0411\u0440\u0443\u043D\u0435\u0458",
                                    "\u0411\u043E\u043B\u0438\u0432\u0438\u0458\u0430",
                                    "\u0411\u0440\u0430\u0437\u0438\u043B",
                                    "\u0411\u0430\u0445\u0430\u043C\u0438",
                                    "\u0411\u0443\u0442\u0430\u043D",
                                    "\u0411\u0443\u0432\u0435 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0411\u043E\u0446\u0432\u0430\u043D\u0430",
                                    "\u0411\u0435\u043B\u043E\u0440\u0443\u0441\u0438\u0458\u0430",
                                    "\u0411\u0435\u043B\u0438\u0437\u0435",
                                    "\u041A\u0430\u043D\u0430\u0434\u0430",
                                    "\u041A\u043E\u043A\u043E\u0441 (\u041A\u0435\u043B\u0438\u043D\u0433) \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u041A\u043E\u043D\u0433\u043E - \u041A\u0438\u043D\u0448\u0430\u0441\u0430",
                                    "\u0426\u0435\u043D\u0442\u0440\u0430\u043B\u043D\u043E \u0410\u0444\u0440\u0438\u0447\u043A\u0430 \u0420\u0435\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u041A\u043E\u043D\u0433\u043E - \u0411\u0440\u0430\u0437\u0430\u0432\u0438\u043B",
                                    "\u0428\u0432\u0430\u0458\u0446\u0430\u0440\u0441\u043A\u0430",
                                    "\u041E\u0431\u0430\u043B\u0430 \u0421\u043B\u043E\u043D\u043E\u0432\u0430\u0447\u0435",
                                    "\u041A\u0443\u043A\u043E\u0432\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0427\u0438\u043B\u0435",
                                    "\u041A\u0430\u043C\u0435\u0440\u0443\u043D",
                                    "\u041A\u0438\u043D\u0430",
                                    "\u041A\u043E\u043B\u0443\u043C\u0431\u0438\u0458\u0430",
                                    "\u041E\u0441\u0442\u0440\u0432\u043E \u041A\u043B\u0438\u043F\u0435\u0440\u0442\u043E\u043D",
                                    "\u041A\u043E\u0441\u0442\u0430\u0440\u0438\u043A\u0430",
                                    "\u0421\u0440\u0431\u0438\u0458\u0430 \u0438 \u0426\u0440\u043D\u0430 \u0413\u043E\u0440\u0430",
                                    "\u041A\u0443\u0431\u0430",
                                    "\u041A\u0430\u043F\u0435 \u0412\u0435\u0440\u0434\u0435",
                                    "\u0411\u043E\u0436\u0438\u045B\u043D\u0430 \u043E\u0441\u0442\u0440\u0432\u0430",
                                    "\u041A\u0438\u043F\u0430\u0440",
                                    "\u0427\u0435\u0448\u043A\u0430",
                                    "\u041D\u0435\u043C\u0430\u0447\u043A\u0430",
                                    "\u0414\u0438\u0458\u0435\u0433\u043E \u0413\u0430\u0440\u0441\u0438\u0458\u0430",
                                    "\u040F\u0438\u0431\u0443\u0442\u0438",
                                    "\u0414\u0430\u043D\u0441\u043A\u0430",
                                    "\u0414\u043E\u043C\u0438\u043D\u0438\u043A\u0430",
                                    "\u0414\u043E\u043C\u0438\u043D\u0438\u043A\u0430\u043D\u0441\u043A\u0430 \u0420\u0435\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u0410\u043B\u0436\u0438\u0440",
                                    "\u0421\u0435\u0443\u0442\u0430 \u0438 \u041C\u0435\u043B\u0438\u0459\u0430",
                                    "\u0415\u043A\u0432\u0430\u0434\u043E\u0440",
                                    "\u0415\u0441\u0442\u043E\u043D\u0438\u0458\u0430",
                                    "\u0415\u0433\u0438\u043F\u0430\u0442",
                                    "\u0417\u0430\u043F\u0430\u0434\u043D\u0430 \u0421\u0430\u0445\u0430\u0440\u0430",
                                    "\u0415\u0440\u0438\u0442\u0440\u0435\u0458\u0430",
                                    "\u0428\u043F\u0430\u043D\u0438\u0458\u0430",
                                    "\u0415\u0442\u0438\u043E\u043F\u0438\u0458\u0430",
                                    "\u0415\u0432\u0440\u043E\u043F\u0441\u043A\u0430 \u0423\u043D\u0438\u0458\u0430",
                                    "\u0424\u0438\u043D\u0441\u043A\u0430",
                                    "\u0424\u0438\u045F\u0438",
                                    "\u0424\u043E\u043B\u043A\u043B\u0430\u043D\u0434\u0441\u043A\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u041C\u0438\u043A\u0440\u043E\u043D\u0435\u0437\u0438\u0458\u0430",
                                    "\u0424\u0430\u0440\u0441\u043A\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0424\u0440\u0430\u043D\u0446\u0443\u0441\u043A\u0430",
                                    "\u0413\u0430\u0431\u043E\u043D",
                                    "\u0412\u0435\u043B\u0438\u043A\u0430 \u0411\u0440\u0438\u0442\u0430\u043D\u0438\u0458\u0430",
                                    "\u0413\u0440\u0435\u043D\u0430\u0434\u0430",
                                    "\u0413\u0440\u0443\u0437\u0438\u0458\u0430",
                                    "\u0424\u0440\u0430\u043D\u0446\u0443\u0441\u043A\u0430 \u0413\u0432\u0430\u0458\u0430\u043D\u0430",
                                    "\u0413\u0443\u0440\u043D\u0441\u0438",
                                    "\u0413\u0430\u043D\u0430",
                                    "\u0413\u0438\u0431\u0440\u0430\u043B\u0442\u0430\u0440",
                                    "\u0413\u0440\u0435\u043D\u043B\u0430\u043D\u0434",
                                    "\u0413\u0430\u043C\u0431\u0438\u0458\u0430",
                                    "\u0413\u0432\u0438\u043D\u0435\u0458\u0430",
                                    "\u0413\u0432\u0430\u0434\u0435\u043B\u0443\u043F\u0435",
                                    "\u0415\u043A\u0432\u0430\u0442\u043E\u0440\u0438\u0458\u0430\u043B\u043D\u0430 \u0413\u0432\u0438\u043D\u0435\u0458\u0430",
                                    "\u0413\u0440\u0447\u043A\u0430",
                                    "\u0408\u0443\u0436\u043D\u0430 \u040F\u043E\u0440\u045F\u0438\u0458\u0430 \u0438 \u0408\u0443\u0436\u043D\u0430 \u0421\u0435\u043D\u0434\u0432\u0438\u0447 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0413\u0432\u0430\u0442\u0435\u043C\u0430\u043B\u0430",
                                    "\u0413\u0443\u0430\u043C",
                                    "\u0413\u0432\u0438\u043D\u0435\u0458\u0430-\u0411\u0438\u0441\u0430\u043E",
                                    "\u0413\u0432\u0430\u0458\u0430\u043D\u0430",
                                    "\u0425\u043E\u043D\u0433 \u041A\u043E\u043D\u0433 \u0421. \u0410. \u0420. \u041A\u0438\u043D\u0430",
                                    "\u0425\u0435\u0440\u0434 \u0438 \u041C\u0435\u043A\u0434\u043E\u043D\u0430\u043B\u0434 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0425\u043E\u043D\u0434\u0443\u0440\u0430\u0441",
                                    "\u0425\u0440\u0432\u0430\u0442\u0441\u043A\u0430",
                                    "\u0425\u0430\u0438\u0442\u0438",
                                    "\u041C\u0430\u0452\u0430\u0440\u0441\u043A\u0430",
                                    "\u041A\u0430\u043D\u0430\u0440\u0441\u043A\u0430 \u043E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0418\u043D\u0434\u043E\u043D\u0435\u0437\u0438\u0458\u0430",
                                    "\u0418\u0440\u0441\u043A\u0430",
                                    "\u0418\u0437\u0440\u0430\u0435\u043B",
                                    "\u041E\u0441\u0442\u0440\u0432\u043E \u041C\u0430\u043D",
                                    "\u0418\u043D\u0434\u0438\u0458\u0430",
                                    "\u0411\u0440\u0438\u0442\u0430\u043D\u0441\u043A\u0430 \u0442\u0435\u0440\u0438\u0442\u043E\u0440\u0438\u0458\u0430 \u0443 \u0418\u043D\u0434\u0438\u0458\u0441\u043A\u043E\u043C \u043E\u043A\u0435\u0430\u043D\u0443",
                                    "\u0418\u0440\u0430\u043A",
                                    "\u0418\u0440\u0430\u043D",
                                    "\u0418\u0441\u043B\u0430\u043D\u0434",
                                    "\u0418\u0442\u0430\u043B\u0438\u0458\u0430",
                                    "\u040F\u0435\u0440\u0441\u0438",
                                    "\u0408\u0430\u043C\u0430\u0458\u043A\u0430",
                                    "\u0408\u043E\u0440\u0434\u0430\u043D",
                                    "\u0408\u0430\u043F\u0430\u043D",
                                    "\u041A\u0435\u043D\u0438\u0458\u0430",
                                    "\u041A\u0438\u0440\u0433\u0438\u0437\u0441\u0442\u0430\u043D",
                                    "\u041A\u0430\u043C\u0431\u043E\u045F\u0430",
                                    "\u041A\u0438\u0440\u0438\u0431\u0430\u0442\u0438",
                                    "\u041A\u043E\u043C\u043E\u0440\u0441\u043A\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0421\u0435\u043D\u0442 \u041A\u0438\u0442\u0441 \u0438 \u041D\u0435\u0432\u0438\u0441",
                                    "\u0421\u0435\u0432\u0435\u0440\u043D\u0430 \u041A\u043E\u0440\u0435\u0458\u0430",
                                    "\u0408\u0443\u0436\u043D\u0430 \u041A\u043E\u0440\u0435\u0458\u0430",
                                    "\u041A\u0443\u0432\u0430\u0458\u0442",
                                    "\u041A\u0430\u0458\u043C\u0430\u043D\u0441\u043A\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u041A\u0430\u0437\u0430\u0445\u0441\u0442\u0430\u043D",
                                    "\u041B\u0430\u043E\u0441",
                                    "\u041B\u0438\u0431\u0430\u043D",
                                    "\u0421\u0435\u043D\u0442 \u041B\u0443\u0446\u0438\u0458\u0430",
                                    "\u041B\u0438\u0445\u0442\u0435\u043D\u0448\u0442\u0430\u0458\u043D",
                                    "\u0428\u0440\u0438 \u041B\u0430\u043D\u043A\u0430",
                                    "\u041B\u0438\u0431\u0435\u0440\u0438\u0458\u0430",
                                    "\u041B\u0435\u0441\u043E\u0442\u043E",
                                    "\u041B\u0438\u0442\u0432\u0430\u043D\u0438\u0458\u0430",
                                    "\u041B\u0443\u043A\u0441\u0435\u043C\u0431\u0443\u0440\u0433",
                                    "\u041B\u0435\u0442\u043E\u043D\u0438\u0458\u0430",
                                    "\u041B\u0438\u0431\u0438\u0458\u0430",
                                    "\u041C\u0430\u0440\u043E\u043A\u043E",
                                    "\u041C\u043E\u043D\u0430\u043A\u043E",
                                    "\u041C\u043E\u043B\u0434\u0430\u0432\u0438\u0458\u0430",
                                    "\u0426\u0440\u043D\u0430 \u0413\u043E\u0440\u0430",
                                    "\u0421\u0435\u043D\u0442 \u041C\u0430\u0440\u0442\u0438\u043D",
                                    "\u041C\u0430\u0434\u0430\u0433\u0430\u0441\u043A\u0430\u0440",
                                    "\u041C\u0430\u0440\u0448\u0430\u043B\u0441\u043A\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u041C\u0430\u043A\u0435\u0434\u043E\u043D\u0438\u0458\u0430",
                                    "\u041C\u0430\u043B\u0438",
                                    "\u041C\u0438\u0458\u0430\u043D\u043C\u0430\u0440 [\u0411\u0443\u0440\u043C\u0430]",
                                    "\u041C\u043E\u043D\u0433\u043E\u043B\u0438\u0458\u0430",
                                    "\u041C\u0430\u043A\u0430\u043E \u0421. \u0410. \u0420. \u041A\u0438\u043D\u0430",
                                    "\u0421\u0435\u0432\u0435\u0440\u043D\u0430 \u041C\u0430\u0440\u0438\u0458\u0430\u043D\u0441\u043A\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u041C\u0430\u0440\u0442\u0438\u043D\u0438\u043A",
                                    "\u041C\u0430\u0443\u0440\u0438\u0442\u0430\u043D\u0438\u0458\u0430",
                                    "\u041C\u043E\u043D\u0441\u0435\u0440\u0430\u0442",
                                    "\u041C\u0430\u043B\u0442\u0430",
                                    "\u041C\u0430\u0443\u0440\u0438\u0446\u0438\u0458\u0443\u0441",
                                    "\u041C\u0430\u043B\u0434\u0438\u0432\u0438",
                                    "\u041C\u0430\u043B\u0430\u0432\u0438",
                                    "\u041C\u0435\u043A\u0441\u0438\u043A\u043E",
                                    "\u041C\u0430\u043B\u0435\u0437\u0438\u0458\u0430",
                                    "\u041C\u043E\u0437\u0430\u043C\u0431\u0438\u043A",
                                    "\u041D\u0430\u043C\u0438\u0431\u0438\u0458\u0430",
                                    "\u041D\u043E\u0432\u0430 \u041A\u0430\u043B\u0435\u0434\u043E\u043D\u0438\u0458\u0430",
                                    "\u041D\u0438\u0433\u0435\u0440",
                                    "\u041D\u043E\u0440\u0444\u043E\u043B\u043A \u041E\u0441\u0442\u0440\u0432\u043E",
                                    "\u041D\u0438\u0433\u0435\u0440\u0438\u0458\u0430",
                                    "\u041D\u0438\u043A\u0430\u0440\u0430\u0433\u0432\u0430",
                                    "\u0425\u043E\u043B\u0430\u043D\u0434\u0438\u0458\u0430",
                                    "\u041D\u043E\u0440\u0432\u0435\u0448\u043A\u0430",
                                    "\u041D\u0435\u043F\u0430\u043B",
                                    "\u041D\u0430\u0443\u0440\u0443",
                                    "\u041D\u0438\u0443\u0435",
                                    "\u041D\u043E\u0432\u0438 \u0417\u0435\u043B\u0430\u043D\u0434",
                                    "\u041E\u043C\u0430\u043D",
                                    "\u041F\u0430\u043D\u0430\u043C\u0430",
                                    "\u041F\u0435\u0440\u0443",
                                    "\u0424\u0440\u0430\u043D\u0446\u0443\u0441\u043A\u0430 \u041F\u043E\u043B\u0438\u043D\u0435\u0437\u0438\u0458\u0430",
                                    "\u041F\u0430\u043F\u0443\u0430 \u041D\u043E\u0432\u0430 \u0413\u0432\u0438\u043D\u0435\u0458\u0430",
                                    "\u0424\u0438\u043B\u0438\u043F\u0438\u043D\u0438",
                                    "\u041F\u0430\u043A\u0438\u0441\u0442\u0430\u043D",
                                    "\u041F\u043E\u0459\u0441\u043A\u0430",
                                    "\u0421\u0435\u043D \u041F\u0458\u0435\u0440 \u0438 \u041C\u0438\u043A\u0435\u043B\u043E\u043D",
                                    "\u041F\u0438\u0442\u043A\u0435\u0440\u043D",
                                    "\u041F\u043E\u0440\u0442\u043E \u0420\u0438\u043A\u043E",
                                    "\u041F\u0430\u043B\u0435\u0441\u0442\u0438\u043D\u0441\u043A\u0435 \u0442\u0435\u0440\u0438\u0442\u043E\u0440\u0438\u0458\u0435",
                                    "\u041F\u043E\u0440\u0442\u0443\u0433\u0430\u043B",
                                    "\u041F\u0430\u043B\u0430\u0443",
                                    "\u041F\u0430\u0440\u0430\u0433\u0432\u0430\u0458",
                                    "\u041A\u0430\u0442\u0430\u0440",
                                    "\u041E\u0441\u0442\u0430\u043B\u0430 \u043E\u043A\u0435\u0430\u043D\u0438\u0458\u0430",
                                    "\u0420\u0435\u0438\u043D\u0438\u043E\u043D",
                                    "\u0420\u0443\u043C\u0443\u043D\u0438\u0458\u0430",
                                    "\u0421\u0440\u0431\u0438\u0458\u0430",
                                    "\u0420\u0443\u0441\u0438\u0458\u0430",
                                    "\u0420\u0443\u0430\u043D\u0434\u0430",
                                    "\u0421\u0430\u0443\u0434\u0438\u0458\u0441\u043A\u0430 \u0410\u0440\u0430\u0431\u0438\u0458\u0430",
                                    "\u0421\u043E\u043B\u043E\u043C\u043E\u043D\u0441\u043A\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0421\u0435\u0458\u0448\u0435\u043B\u0438",
                                    "\u0421\u0443\u0434\u0430\u043D",
                                    "\u0428\u0432\u0435\u0434\u0441\u043A\u0430",
                                    "\u0421\u0438\u043D\u0433\u0430\u043F\u0443\u0440",
                                    "\u0421\u0432\u0435\u0442\u0430 \u0408\u0435\u043B\u0435\u043D\u0430",
                                    "\u0421\u043B\u043E\u0432\u0435\u043D\u0438\u0458\u0430",
                                    "\u0421\u0432\u0430\u043B\u0431\u0430\u0440\u0434 \u0438 \u0408\u0430\u043D\u043C\u0430\u0458\u0435\u043D \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0421\u043B\u043E\u0432\u0430\u0447\u043A\u0430",
                                    "\u0421\u0438\u0458\u0435\u0440\u0430 \u041B\u0435\u043E\u043D\u0435",
                                    "\u0421\u0430\u043D \u041C\u0430\u0440\u0438\u043D\u043E",
                                    "\u0421\u0435\u043D\u0435\u0433\u0430\u043B",
                                    "\u0421\u043E\u043C\u0430\u043B\u0438\u0458\u0430",
                                    "\u0421\u0443\u0440\u0438\u043D\u0430\u043C",
                                    "\u0421\u0430\u043E \u0422\u043E\u043C\u0435 \u0438 \u041F\u0440\u0438\u043D\u0446\u0438\u043F\u0435",
                                    "\u0421\u0430\u043B\u0432\u0430\u0434\u043E\u0440",
                                    "\u0421\u0438\u0440\u0438\u0458\u0430",
                                    "\u0421\u0432\u0430\u0437\u0438\u043B\u0435\u043D\u0434",
                                    "\u0422\u0440\u0438\u0441\u0442\u0430\u043D \u0434\u0430 \u041A\u0443\u045A\u0430",
                                    "\u0422\u0443\u0440\u043A\u0441 \u0438 \u041A\u0430\u0458\u043A\u043E\u0441 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0427\u0430\u0434",
                                    "\u0424\u0440\u0430\u043D\u0446\u0443\u0441\u043A\u0435 \u0408\u0443\u0436\u043D\u0435 \u0422\u0435\u0440\u0438\u0442\u043E\u0440\u0438\u0458\u0435",
                                    "\u0422\u043E\u0433\u043E",
                                    "\u0422\u0430\u0458\u043B\u0430\u043D\u0434",
                                    "\u0422\u0430\u045F\u0438\u043A\u0438\u0441\u0442\u0430\u043D",
                                    "\u0422\u043E\u043A\u0435\u043B\u0430\u0443",
                                    "\u0418\u0441\u0442\u043E\u0447\u043D\u0438 \u0422\u0438\u043C\u043E\u0440",
                                    "\u0422\u0443\u0440\u043A\u043C\u0435\u043D\u0438\u0441\u0442\u0430\u043D",
                                    "\u0422\u0443\u043D\u0438\u0441",
                                    "\u0422\u043E\u043D\u0433\u0430",
                                    "\u0422\u0443\u0440\u0441\u043A\u0430",
                                    "\u0422\u0440\u0438\u043D\u0438\u0434\u0430\u0434 \u0438 \u0422\u043E\u0431\u0430\u0433\u043E",
                                    "\u0422\u0443\u0432\u0430\u043B\u0443",
                                    "\u0422\u0430\u0458\u0432\u0430\u043D",
                                    "\u0422\u0430\u043D\u0437\u0430\u043D\u0438\u0458\u0430",
                                    "\u0423\u043A\u0440\u0430\u0458\u0438\u043D\u0430",
                                    "\u0423\u0433\u0430\u043D\u0434\u0430",
                                    "\u041C\u0430\u045A\u0430 \u0443\u0434\u0430\u0459\u0435\u043D\u0430 \u043E\u0441\u0442\u0440\u0432\u0430 \u0421\u0410\u0414",
                                    "\u0421\u0458\u0435\u0434\u0438\u045A\u0435\u043D\u0435 \u0410\u043C\u0435\u0440\u0438\u0447\u043A\u0435 \u0414\u0440\u0436\u0430\u0432\u0435",
                                    "\u0423\u0440\u0443\u0433\u0432\u0430\u0458",
                                    "\u0423\u0437\u0431\u0435\u043A\u0438\u0441\u0442\u0430\u043D",
                                    "\u0412\u0430\u0442\u0438\u043A\u0430\u043D",
                                    "\u0421\u0435\u043D\u0442 \u0412\u0438\u043D\u0441\u0435\u043D\u0442 \u0438 \u0413\u0440\u0435\u043D\u0430\u0434\u0438\u043D\u0438",
                                    "\u0412\u0435\u043D\u0435\u0446\u0443\u0435\u043B\u0430",
                                    "\u0411\u0440\u0438\u0442\u0430\u043D\u0441\u043A\u0430 \u0414\u0435\u0432\u0438\u0447\u0430\u043D\u0441\u043A\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0421.\u0410.\u0414. \u0414\u0435\u0432\u0438\u0447\u0430\u043D\u0441\u043A\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0412\u0438\u0458\u0435\u0442\u043D\u0430\u043C",
                                    "\u0412\u0430\u043D\u0443\u0430\u0442\u0443",
                                    "\u0412\u0430\u043B\u0438\u0441 \u0438 \u0424\u0443\u0442\u0443\u043D\u0430 \u041E\u0441\u0442\u0440\u0432\u0430",
                                    "\u0421\u0430\u043C\u043E\u0430",
                                    "\u0408\u0435\u043C\u0435\u043D",
                                    "\u041C\u0430\u0458\u043E\u0442\u0435",
                                    "\u0408\u0443\u0436\u043D\u043E\u0430\u0444\u0440\u0438\u0447\u043A\u0430 \u0420\u0435\u043F\u0443\u0431\u043B\u0438\u043A\u0430",
                                    "\u0417\u0430\u043C\u0431\u0438\u0458\u0430",
                                    "\u0417\u0438\u043C\u0431\u0430\u0431\u0432\u0435");
                        });
    }

    private static final ReflectionClassData runtimeConverterReflectionData =
            ReflectionClassData.builder()
                    .setName("Faker\\Provider\\sr_RS\\Address")
                    .setLookup(
                            Address.class,
                            MethodHandles.lookup(),
                            RuntimeStaticCompanion.staticCompanionLookup)
                    .setLocalProperties("generator", "unique")
                    .setStaticPropertyNames(
                            "cityFormats",
                            "cityNames",
                            "country",
                            "postcode",
                            "street",
                            "streetAddressFormats",
                            "streetNameFormats",
                            "streetPrefix")
                    .setFilename("vendor/fzaninotto/faker/src/Faker/Provider/sr_RS/Address.php")
                    .addExtendsClass("Faker\\Provider\\Address")
                    .addExtendsClass("Faker\\Provider\\Base")
                    .get();

    @Override
    public ReflectionClassData getRuntimeConverterReflectionData() {
        return runtimeConverterReflectionData;
    }

    @Override
    public Object converterRuntimeCallExtended(
            RuntimeEnv env,
            String method,
            Class<?> caller,
            PassByReferenceArgs passByReferenceArgs,
            Object... args) {
        return RuntimeClassBase.converterRuntimeCallExtendedWithDataStatic(
                this,
                runtimeConverterReflectionData,
                env,
                method,
                caller,
                passByReferenceArgs,
                args);
    }
}
