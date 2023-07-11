// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.EscalationArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.EscalationState;
import com.pulumi.opsgenie.outputs.EscalationRepeat;
import com.pulumi.opsgenie.outputs.EscalationRule;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Escalation within Opsgenie.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.opsgenie.Escalation;
 * import com.pulumi.opsgenie.EscalationArgs;
 * import com.pulumi.opsgenie.inputs.EscalationRepeatArgs;
 * import com.pulumi.opsgenie.inputs.EscalationRuleArgs;
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
 *         var test = new Escalation(&#34;test&#34;, EscalationArgs.builder()        
 *             .description(&#34;test&#34;)
 *             .name(&#34;genieescalation-%s&#34;)
 *             .ownerTeamId(opsgenie_team.test().id())
 *             .repeats(EscalationRepeatArgs.builder()
 *                 .closeAlertAfterAll(false)
 *                 .count(1)
 *                 .resetRecipientStates(true)
 *                 .waitInterval(10)
 *                 .build())
 *             .rules(EscalationRuleArgs.builder()
 *                 .condition(&#34;if-not-acked&#34;)
 *                 .delay(1)
 *                 .notifyType(&#34;default&#34;)
 *                 .recipients(                
 *                     EscalationRuleRecipientArgs.builder()
 *                         .id(opsgenie_user.test().id())
 *                         .type(&#34;user&#34;)
 *                         .build(),
 *                     EscalationRuleRecipientArgs.builder()
 *                         .id(opsgenie_team.test().id())
 *                         .type(&#34;team&#34;)
 *                         .build(),
 *                     EscalationRuleRecipientArgs.builder()
 *                         .id(opsgenie_schedule.test().id())
 *                         .type(&#34;schedule&#34;)
 *                         .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Escalations can be imported using the `escalation_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import opsgenie:index/escalation:Escalation test escalation_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/escalation:Escalation")
public class Escalation extends com.pulumi.resources.CustomResource {
    /**
     * Description of the escalation.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the escalation.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the escalation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the escalation.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Owner team id of the escalation.
     * 
     */
    @Export(name="ownerTeamId", type=String.class, parameters={})
    private Output</* @Nullable */ String> ownerTeamId;

    /**
     * @return Owner team id of the escalation.
     * 
     */
    public Output<Optional<String>> ownerTeamId() {
        return Codegen.optional(this.ownerTeamId);
    }
    /**
     * Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
     * 
     */
    @Export(name="repeats", type=List.class, parameters={EscalationRepeat.class})
    private Output</* @Nullable */ List<EscalationRepeat>> repeats;

    /**
     * @return Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
     * 
     */
    public Output<Optional<List<EscalationRepeat>>> repeats() {
        return Codegen.optional(this.repeats);
    }
    /**
     * List of the escalation rules.
     * 
     */
    @Export(name="rules", type=List.class, parameters={EscalationRule.class})
    private Output<List<EscalationRule>> rules;

    /**
     * @return List of the escalation rules.
     * 
     */
    public Output<List<EscalationRule>> rules() {
        return this.rules;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Escalation(String name) {
        this(name, EscalationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Escalation(String name, EscalationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Escalation(String name, EscalationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/escalation:Escalation", name, args == null ? EscalationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Escalation(String name, Output<String> id, @Nullable EscalationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/escalation:Escalation", name, state, makeResourceOptions(options, id));
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
    public static Escalation get(String name, Output<String> id, @Nullable EscalationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Escalation(name, id, state, options);
    }
}
