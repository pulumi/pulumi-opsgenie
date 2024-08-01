// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.IntegrationActionArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.IntegrationActionState;
import com.pulumi.opsgenie.outputs.IntegrationActionAcknowledge;
import com.pulumi.opsgenie.outputs.IntegrationActionAddNote;
import com.pulumi.opsgenie.outputs.IntegrationActionClose;
import com.pulumi.opsgenie.outputs.IntegrationActionCreate;
import com.pulumi.opsgenie.outputs.IntegrationActionIgnore;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages advanced actions for Integrations within Opsgenie. This applies for the following resources:
 * * `opsgenie.ApiIntegration`
 * * `opsgenie.EmailIntegration`
 * 
 * The actions that are supported are:
 * * `create`
 * * `close`
 * * `acknowledge`
 * * `add_note`
 * * `ignore`
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
 * import com.pulumi.opsgenie.IntegrationAction;
 * import com.pulumi.opsgenie.IntegrationActionArgs;
 * import com.pulumi.opsgenie.inputs.IntegrationActionCreateArgs;
 * import com.pulumi.opsgenie.inputs.IntegrationActionCloseArgs;
 * import com.pulumi.opsgenie.inputs.IntegrationActionAcknowledgeArgs;
 * import com.pulumi.opsgenie.inputs.IntegrationActionAddNoteArgs;
 * import com.pulumi.opsgenie.inputs.IntegrationActionIgnoreArgs;
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
 *         var testAction = new IntegrationAction("testAction", IntegrationActionArgs.builder()
 *             .integrationId(testOpsgenieApiIntegration.id())
 *             .creates(            
 *                 IntegrationActionCreateArgs.builder()
 *                     .name("create action")
 *                     .tags(                    
 *                         "CRITICAL",
 *                         "SEV-0")
 *                     .user("Example-service")
 *                     .note("{{note}}")
 *                     .alias("{{alias}}")
 *                     .source("{{source}}")
 *                     .message("{{message}}")
 *                     .description("{{description}}")
 *                     .entity("{{entity}}")
 *                     .alertActions("Runbook ID#342")
 *                     .filters(IntegrationActionCreateFilterArgs.builder()
 *                         .type("match-all-conditions")
 *                         .conditions(IntegrationActionCreateFilterConditionArgs.builder()
 *                             .field("priority")
 *                             .operation("equals")
 *                             .expectedValue("P1")
 *                             .build())
 *                         .build())
 *                     .responders(IntegrationActionCreateResponderArgs.builder()
 *                         .id(test.id())
 *                         .type("team")
 *                         .build())
 *                     .build(),
 *                 IntegrationActionCreateArgs.builder()
 *                     .name("create action with multiline description")
 *                     .message("{{message}}")
 *                     .description(StdFunctions.chomp(ChompArgs.builder()
 *                         .input("""
 * This
 * is a multiline
 * description.
 *                         """)
 *                         .build()).result())
 *                     .filters(IntegrationActionCreateFilterArgs.builder()
 *                         .type("match-all-conditions")
 *                         .conditions(IntegrationActionCreateFilterConditionArgs.builder()
 *                             .field("priority")
 *                             .operation("equals")
 *                             .expectedValue("P1")
 *                             .build())
 *                         .build())
 *                     .build(),
 *                 IntegrationActionCreateArgs.builder()
 *                     .name("Create medium priority alerts")
 *                     .tags(                    
 *                         "SEVERE",
 *                         "SEV-1")
 *                     .priority("P3")
 *                     .filters(IntegrationActionCreateFilterArgs.builder()
 *                         .type("match-all-conditions")
 *                         .conditions(IntegrationActionCreateFilterConditionArgs.builder()
 *                             .field("priority")
 *                             .operation("equals")
 *                             .expectedValue("P2")
 *                             .build())
 *                         .build())
 *                     .build(),
 *                 IntegrationActionCreateArgs.builder()
 *                     .name("Create alert with priority from message")
 *                     .customPriority("{{message.substringAfter(\"[custom]\")}}")
 *                     .filters(IntegrationActionCreateFilterArgs.builder()
 *                         .type("match-all-conditions")
 *                         .conditions(                        
 *                             IntegrationActionCreateFilterConditionArgs.builder()
 *                                 .field("tags")
 *                                 .operation("contains")
 *                                 .expectedValue("P5")
 *                                 .build(),
 *                             IntegrationActionCreateFilterConditionArgs.builder()
 *                                 .field("message")
 *                                 .operation("starts-with")
 *                                 .expectedValue("[custom]")
 *                                 .build())
 *                         .build())
 *                     .build())
 *             .closes(IntegrationActionCloseArgs.builder()
 *                 .name("Low priority alerts")
 *                 .filters(IntegrationActionCloseFilterArgs.builder()
 *                     .type("match-any-condition")
 *                     .conditions(                    
 *                         IntegrationActionCloseFilterConditionArgs.builder()
 *                             .field("priority")
 *                             .operation("equals")
 *                             .expectedValue("P5")
 *                             .build(),
 *                         IntegrationActionCloseFilterConditionArgs.builder()
 *                             .field("message")
 *                             .operation("contains")
 *                             .expectedValue("DEBUG")
 *                             .build())
 *                     .build())
 *                 .build())
 *             .acknowledges(IntegrationActionAcknowledgeArgs.builder()
 *                 .name("Auto-ack test alerts")
 *                 .filters(IntegrationActionAcknowledgeFilterArgs.builder()
 *                     .type("match-all-conditions")
 *                     .conditions(                    
 *                         IntegrationActionAcknowledgeFilterConditionArgs.builder()
 *                             .field("message")
 *                             .not(true)
 *                             .operation("contains")
 *                             .expectedValue("TEST")
 *                             .build(),
 *                         IntegrationActionAcknowledgeFilterConditionArgs.builder()
 *                             .field("priority")
 *                             .operation("equals")
 *                             .expectedValue("P5")
 *                             .build())
 *                     .build())
 *                 .build())
 *             .addNotes(IntegrationActionAddNoteArgs.builder()
 *                 .name("Add note to all alerts")
 *                 .note("Created from test integration")
 *                 .filters(IntegrationActionAddNoteFilterArgs.builder()
 *                     .type("match-all")
 *                     .build())
 *                 .build())
 *             .ignores(IntegrationActionIgnoreArgs.builder()
 *                 .name("Ignore alerts with ignore tag")
 *                 .filters(IntegrationActionIgnoreFilterArgs.builder()
 *                     .type("match-all-conditions")
 *                     .conditions(IntegrationActionIgnoreFilterConditionArgs.builder()
 *                         .field("tags")
 *                         .operation("contains")
 *                         .expectedValue("ignore")
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="opsgenie:index/integrationAction:IntegrationAction")
public class IntegrationAction extends com.pulumi.resources.CustomResource {
    @Export(name="acknowledges", refs={List.class,IntegrationActionAcknowledge.class}, tree="[0,1]")
    private Output</* @Nullable */ List<IntegrationActionAcknowledge>> acknowledges;

    public Output<Optional<List<IntegrationActionAcknowledge>>> acknowledges() {
        return Codegen.optional(this.acknowledges);
    }
    @Export(name="addNotes", refs={List.class,IntegrationActionAddNote.class}, tree="[0,1]")
    private Output</* @Nullable */ List<IntegrationActionAddNote>> addNotes;

    public Output<Optional<List<IntegrationActionAddNote>>> addNotes() {
        return Codegen.optional(this.addNotes);
    }
    @Export(name="closes", refs={List.class,IntegrationActionClose.class}, tree="[0,1]")
    private Output</* @Nullable */ List<IntegrationActionClose>> closes;

    public Output<Optional<List<IntegrationActionClose>>> closes() {
        return Codegen.optional(this.closes);
    }
    @Export(name="creates", refs={List.class,IntegrationActionCreate.class}, tree="[0,1]")
    private Output</* @Nullable */ List<IntegrationActionCreate>> creates;

    public Output<Optional<List<IntegrationActionCreate>>> creates() {
        return Codegen.optional(this.creates);
    }
    @Export(name="ignores", refs={List.class,IntegrationActionIgnore.class}, tree="[0,1]")
    private Output</* @Nullable */ List<IntegrationActionIgnore>> ignores;

    public Output<Optional<List<IntegrationActionIgnore>>> ignores() {
        return Codegen.optional(this.ignores);
    }
    /**
     * ID of the parent integration resource to bind to.
     * 
     */
    @Export(name="integrationId", refs={String.class}, tree="[0]")
    private Output<String> integrationId;

    /**
     * @return ID of the parent integration resource to bind to.
     * 
     */
    public Output<String> integrationId() {
        return this.integrationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationAction(String name) {
        this(name, IntegrationActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationAction(String name, IntegrationActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationAction(String name, IntegrationActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/integrationAction:IntegrationAction", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationAction(String name, Output<String> id, @Nullable IntegrationActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/integrationAction:IntegrationAction", name, state, makeResourceOptions(options, id));
    }

    private static IntegrationActionArgs makeArgs(IntegrationActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? IntegrationActionArgs.Empty : args;
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
    public static IntegrationAction get(String name, Output<String> id, @Nullable IntegrationActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationAction(name, id, state, options);
    }
}
