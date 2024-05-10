// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.HeartbeatArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.HeartbeatState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages heartbeat within Opsgenie.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.opsgenie.Heartbeat;
 * import com.pulumi.opsgenie.HeartbeatArgs;
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
 *         var test = new Heartbeat("test", HeartbeatArgs.builder()        
 *             .name("genieheartbeat-test")
 *             .description("test opsgenie heartbeat terraform")
 *             .intervalUnit("minutes")
 *             .interval(10)
 *             .enabled(false)
 *             .alertMessage("Test")
 *             .alertPriority("P3")
 *             .alertTags(            
 *                 "test",
 *                 "fahri")
 *             .ownerTeamId(testOpsgenieTeam.id())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Heartbeat Integrations can be imported using the `name`, e.g.
 * 
 * ```sh
 * $ pulumi import opsgenie:index/heartbeat:Heartbeat test name`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/heartbeat:Heartbeat")
public class Heartbeat extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is &#34;HeartbeatName is expired&#34;.
     * 
     */
    @Export(name="alertMessage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alertMessage;

    /**
     * @return Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is &#34;HeartbeatName is expired&#34;.
     * 
     */
    public Output<Optional<String>> alertMessage() {
        return Codegen.optional(this.alertMessage);
    }
    /**
     * Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     * 
     */
    @Export(name="alertPriority", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> alertPriority;

    /**
     * @return Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     * 
     */
    public Output<Optional<String>> alertPriority() {
        return Codegen.optional(this.alertPriority);
    }
    /**
     * Specifies the alert tags for heartbeat expiration alert.
     * 
     */
    @Export(name="alertTags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> alertTags;

    /**
     * @return Specifies the alert tags for heartbeat expiration alert.
     * 
     */
    public Output<Optional<List<String>>> alertTags() {
        return Codegen.optional(this.alertTags);
    }
    /**
     * An optional description of the heartbeat
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of the heartbeat
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enable/disable heartbeat monitoring.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Enable/disable heartbeat monitoring.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Specifies how often a heartbeat message should be expected.
     * 
     */
    @Export(name="interval", refs={Integer.class}, tree="[0]")
    private Output<Integer> interval;

    /**
     * @return Specifies how often a heartbeat message should be expected.
     * 
     */
    public Output<Integer> interval() {
        return this.interval;
    }
    /**
     * Interval specified as minutes, hours or days.
     * 
     */
    @Export(name="intervalUnit", refs={String.class}, tree="[0]")
    private Output<String> intervalUnit;

    /**
     * @return Interval specified as minutes, hours or days.
     * 
     */
    public Output<String> intervalUnit() {
        return this.intervalUnit;
    }
    /**
     * Name of the heartbeat
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the heartbeat
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Owner team of the heartbeat.
     * 
     */
    @Export(name="ownerTeamId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ownerTeamId;

    /**
     * @return Owner team of the heartbeat.
     * 
     */
    public Output<Optional<String>> ownerTeamId() {
        return Codegen.optional(this.ownerTeamId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Heartbeat(String name) {
        this(name, HeartbeatArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Heartbeat(String name, HeartbeatArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Heartbeat(String name, HeartbeatArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/heartbeat:Heartbeat", name, args == null ? HeartbeatArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Heartbeat(String name, Output<String> id, @Nullable HeartbeatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/heartbeat:Heartbeat", name, state, makeResourceOptions(options, id));
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
    public static Heartbeat get(String name, Output<String> id, @Nullable HeartbeatState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Heartbeat(name, id, state, options);
    }
}
