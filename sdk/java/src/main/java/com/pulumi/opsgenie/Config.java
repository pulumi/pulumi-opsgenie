// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("opsgenie");
    public String apiKey() {
        return Codegen.stringProp("apiKey").config(config).require();
    }
    public Optional<String> apiUrl() {
        return Codegen.stringProp("apiUrl").config(config).env("OPSGENIE_API_URL").get();
    }
}
