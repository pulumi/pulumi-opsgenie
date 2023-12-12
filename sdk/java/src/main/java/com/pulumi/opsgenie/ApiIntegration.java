// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.ApiIntegrationArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.ApiIntegrationState;
import com.pulumi.opsgenie.outputs.ApiIntegrationResponder;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an API Integration within Opsgenie.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.opsgenie.ApiIntegration;
 * import com.pulumi.opsgenie.ApiIntegrationArgs;
 * import com.pulumi.opsgenie.inputs.ApiIntegrationResponderArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example_api_integrationApiIntegration = new ApiIntegration(&#34;example-api-integrationApiIntegration&#34;, ApiIntegrationArgs.builder()        
 *             .type(&#34;API&#34;)
 *             .responders(            
 *                 ApiIntegrationResponderArgs.builder()
 *                     .type(&#34;user&#34;)
 *                     .id(opsgenie_user.user().id())
 *                     .build(),
 *                 ApiIntegrationResponderArgs.builder()
 *                     .type(&#34;user&#34;)
 *                     .id(opsgenie_user.fahri().id())
 *                     .build())
 *             .build());
 * 
 *         var example_api_integrationIndex_apiIntegrationApiIntegration = new ApiIntegration(&#34;example-api-integrationIndex/apiIntegrationApiIntegration&#34;, ApiIntegrationArgs.builder()        
 *             .type(&#34;Prometheus&#34;)
 *             .responders(ApiIntegrationResponderArgs.builder()
 *                 .type(&#34;user&#34;)
 *                 .id(opsgenie_user.user().id())
 *                 .build())
 *             .enabled(false)
 *             .allowWriteAccess(false)
 *             .ignoreRespondersFromPayload(true)
 *             .suppressNotifications(true)
 *             .ownerTeamId(opsgenie_team.team().id())
 *             .build());
 * 
 *         var test3 = new ApiIntegration(&#34;test3&#34;, ApiIntegrationArgs.builder()        
 *             .type(&#34;Webhook&#34;)
 *             .responders(ApiIntegrationResponderArgs.builder()
 *                 .type(&#34;user&#34;)
 *                 .id(opsgenie_user.user().id())
 *                 .build())
 *             .enabled(false)
 *             .allowWriteAccess(false)
 *             .suppressNotifications(true)
 *             .webhookUrl(&#34;https://api.example.com/v1&#34;)
 *             .headers(Map.of(&#34;header1&#34;, value1))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * API Integrations can be imported using the `integration_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import opsgenie:index/apiIntegration:ApiIntegration this integration_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/apiIntegration:ApiIntegration")
public class ApiIntegration extends com.pulumi.resources.CustomResource {
    /**
     * This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Default: `true`.
     * 
     */
    @Export(name="allowWriteAccess", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> allowWriteAccess;

    /**
     * @return This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Default: `true`.
     * 
     */
    public Output<Optional<Boolean>> allowWriteAccess() {
        return Codegen.optional(this.allowWriteAccess);
    }
    /**
     * (Computed) API key of the created integration
     * 
     */
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output<String> apiKey;

    /**
     * @return (Computed) API key of the created integration
     * 
     */
    public Output<String> apiKey() {
        return this.apiKey;
    }
    /**
     * This parameter is for specifying whether the integration will be enabled or not. Default: `true`
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return This parameter is for specifying whether the integration will be enabled or not. Default: `true`
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    @Export(name="headers", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> headers;

    public Output<Optional<Map<String,String>>> headers() {
        return Codegen.optional(this.headers);
    }
    /**
     * If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
     * 
     */
    @Export(name="ignoreRespondersFromPayload", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreRespondersFromPayload;

    /**
     * @return If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
     * 
     */
    public Output<Optional<Boolean>> ignoreRespondersFromPayload() {
        return Codegen.optional(this.ignoreRespondersFromPayload);
    }
    /**
     * Name of the integration. Name must be unique for each integration.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the integration. Name must be unique for each integration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Owner team id of the integration. If changed, this will recreate a new API integration, which will probably have a different API key.
     * 
     */
    @Export(name="ownerTeamId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ownerTeamId;

    /**
     * @return Owner team id of the integration. If changed, this will recreate a new API integration, which will probably have a different API key.
     * 
     */
    public Output<Optional<String>> ownerTeamId() {
        return Codegen.optional(this.ownerTeamId);
    }
    /**
     * User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
     * 
     */
    @Export(name="responders", refs={List.class,ApiIntegrationResponder.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ApiIntegrationResponder>> responders;

    /**
     * @return User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
     * 
     */
    public Output<Optional<List<ApiIntegrationResponder>>> responders() {
        return Codegen.optional(this.responders);
    }
    /**
     * If enabled, notifications that come from alerts will be suppressed. Default: `false`.
     * 
     */
    @Export(name="suppressNotifications", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> suppressNotifications;

    /**
     * @return If enabled, notifications that come from alerts will be suppressed. Default: `false`.
     * 
     */
    public Output<Optional<Boolean>> suppressNotifications() {
        return Codegen.optional(this.suppressNotifications);
    }
    /**
     * Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> type;

    /**
     * @return Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
     * 
     */
    public Output<Optional<String>> type() {
        return Codegen.optional(this.type);
    }
    /**
     * It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
     * 
     */
    @Export(name="webhookUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> webhookUrl;

    /**
     * @return It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
     * 
     */
    public Output<Optional<String>> webhookUrl() {
        return Codegen.optional(this.webhookUrl);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ApiIntegration(String name) {
        this(name, ApiIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ApiIntegration(String name, @Nullable ApiIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ApiIntegration(String name, @Nullable ApiIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/apiIntegration:ApiIntegration", name, args == null ? ApiIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ApiIntegration(String name, Output<String> id, @Nullable ApiIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/apiIntegration:ApiIntegration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiKey"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ApiIntegration get(String name, Output<String> id, @Nullable ApiIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ApiIntegration(name, id, state, options);
    }
}
