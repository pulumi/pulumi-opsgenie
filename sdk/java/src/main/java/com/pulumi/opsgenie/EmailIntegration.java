// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.EmailIntegrationArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.EmailIntegrationState;
import com.pulumi.opsgenie.outputs.EmailIntegrationResponder;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Email Integration within Opsgenie.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.opsgenie.EmailIntegration;
 * import com.pulumi.opsgenie.EmailIntegrationArgs;
 * import com.pulumi.opsgenie.inputs.EmailIntegrationResponderArgs;
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
 *         var testEmailIntegration = new EmailIntegration(&#34;testEmailIntegration&#34;, EmailIntegrationArgs.builder()        
 *             .emailUsername(&#34;fahri&#34;)
 *             .build());
 * 
 *         var testIndex_emailIntegrationEmailIntegration = new EmailIntegration(&#34;testIndex/emailIntegrationEmailIntegration&#34;, EmailIntegrationArgs.builder()        
 *             .responders(            
 *                 EmailIntegrationResponderArgs.builder()
 *                     .type(&#34;user&#34;)
 *                     .id(opsgenie_user.test().id())
 *                     .build(),
 *                 EmailIntegrationResponderArgs.builder()
 *                     .type(&#34;schedule&#34;)
 *                     .id(opsgenie_schedule.test().id())
 *                     .build(),
 *                 EmailIntegrationResponderArgs.builder()
 *                     .type(&#34;escalation&#34;)
 *                     .id(opsgenie_escalation.test().id())
 *                     .build(),
 *                 EmailIntegrationResponderArgs.builder()
 *                     .type(&#34;team&#34;)
 *                     .id(opsgenie_team.test2().id())
 *                     .build())
 *             .emailUsername(&#34;test&#34;)
 *             .enabled(true)
 *             .ignoreRespondersFromPayload(true)
 *             .suppressNotifications(true)
 *             .build());
 * 
 *         var testOpsgenieIndex_emailIntegrationEmailIntegration = new EmailIntegration(&#34;testOpsgenieIndex/emailIntegrationEmailIntegration&#34;, EmailIntegrationArgs.builder()        
 *             .responders(EmailIntegrationResponderArgs.builder()
 *                 .type(&#34;user&#34;)
 *                 .id(opsgenie_user.test().id())
 *                 .build())
 *             .emailUsername(&#34;test&#34;)
 *             .enabled(true)
 *             .ignoreRespondersFromPayload(true)
 *             .suppressNotifications(true)
 *             .ownerTeamId(opsgenie_team_genies.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Email Integrations can be imported using the `id`, e.g.
 * 
 * ```sh
 *  $ pulumi import opsgenie:index/emailIntegration:EmailIntegration test id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/emailIntegration:EmailIntegration")
public class EmailIntegration extends com.pulumi.resources.CustomResource {
    /**
     * The username part of the email address. It must be unique for each integration.
     * 
     */
    @Export(name="emailUsername", refs={String.class}, tree="[0]")
    private Output<String> emailUsername;

    /**
     * @return The username part of the email address. It must be unique for each integration.
     * 
     */
    public Output<String> emailUsername() {
        return this.emailUsername;
    }
    /**
     * A Member block as documented below.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return A Member block as documented below.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
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
     * Owner team id of the integration.
     * 
     */
    @Export(name="ownerTeamId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ownerTeamId;

    /**
     * @return Owner team id of the integration.
     * 
     */
    public Output<Optional<String>> ownerTeamId() {
        return Codegen.optional(this.ownerTeamId);
    }
    @Export(name="responders", refs={List.class,EmailIntegrationResponder.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EmailIntegrationResponder>> responders;

    public Output<Optional<List<EmailIntegrationResponder>>> responders() {
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EmailIntegration(String name) {
        this(name, EmailIntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EmailIntegration(String name, EmailIntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EmailIntegration(String name, EmailIntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/emailIntegration:EmailIntegration", name, args == null ? EmailIntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EmailIntegration(String name, Output<String> id, @Nullable EmailIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/emailIntegration:EmailIntegration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
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
    public static EmailIntegration get(String name, Output<String> id, @Nullable EmailIntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EmailIntegration(name, id, state, options);
    }
}
