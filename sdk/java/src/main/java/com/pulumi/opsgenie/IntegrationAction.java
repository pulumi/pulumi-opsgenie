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
 * ```java
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
 *         var testAction = new IntegrationAction(&#34;testAction&#34;, IntegrationActionArgs.builder()        
 *             .integrationId(testOpsgenieApiIntegration.id())
 *             .creates(            
 *                 IntegrationActionCreateArgs.builder()
 *                     .name(&#34;create action&#34;)
 *                     .tags(                    
 *                         &#34;CRITICAL&#34;,
 *                         &#34;SEV-0&#34;)
 *                     .user(&#34;Example-service&#34;)
 *                     .note(&#34;{{note}}&#34;)
 *                     .alias(&#34;{{alias}}&#34;)
 *                     .source(&#34;{{source}}&#34;)
 *                     .message(&#34;{{message}}&#34;)
 *                     .description(&#34;{{description}}&#34;)
 *                     .entity(&#34;{{entity}}&#34;)
 *                     .alertActions(&#34;Runbook ID#342&#34;)
 *                     .filters(IntegrationActionCreateFilterArgs.builder()
 *                         .type(&#34;match-all-conditions&#34;)
 *                         .conditions(IntegrationActionCreateFilterConditionArgs.builder()
 *                             .field(&#34;priority&#34;)
 *                             .operation(&#34;equals&#34;)
 *                             .expectedValue(&#34;P1&#34;)
 *                             .build())
 *                         .build())
 *                     .responders(IntegrationActionCreateResponderArgs.builder()
 *                         .id(test.id())
 *                         .type(&#34;team&#34;)
 *                         .build())
 *                     .build(),
 *                 IntegrationActionCreateArgs.builder()
 *                     .name(&#34;create action with multiline description&#34;)
 *                     .message(&#34;{{message}}&#34;)
 *                     .description(StdFunctions.chomp(ChompArgs.builder()
 *                         .input(&#34;&#34;&#34;
 * This
 * is a multiline
 * description.
 *                         &#34;&#34;&#34;)
 *                         .build()).result())
 *                     .filters(IntegrationActionCreateFilterArgs.builder()
 *                         .type(&#34;match-all-conditions&#34;)
 *                         .conditions(IntegrationActionCreateFilterConditionArgs.builder()
 *                             .field(&#34;priority&#34;)
 *                             .operation(&#34;equals&#34;)
 *                             .expectedValue(&#34;P1&#34;)
 *                             .build())
 *                         .build())
 *                     .build(),
 *                 IntegrationActionCreateArgs.builder()
 *                     .name(&#34;Create medium priority alerts&#34;)
 *                     .tags(                    
 *                         &#34;SEVERE&#34;,
 *                         &#34;SEV-1&#34;)
 *                     .priority(&#34;P3&#34;)
 *                     .filters(IntegrationActionCreateFilterArgs.builder()
 *                         .type(&#34;match-all-conditions&#34;)
 *                         .conditions(IntegrationActionCreateFilterConditionArgs.builder()
 *                             .field(&#34;priority&#34;)
 *                             .operation(&#34;equals&#34;)
 *                             .expectedValue(&#34;P2&#34;)
 *                             .build())
 *                         .build())
 *                     .build(),
 *                 IntegrationActionCreateArgs.builder()
 *                     .name(&#34;Create alert with priority from message&#34;)
 *                     .customPriority(&#34;{{message.substringAfter(\&#34;[custom]\&#34;)}}&#34;)
 *                     .filters(IntegrationActionCreateFilterArgs.builder()
 *                         .type(&#34;match-all-conditions&#34;)
 *                         .conditions(                        
 *                             IntegrationActionCreateFilterConditionArgs.builder()
 *                                 .field(&#34;tags&#34;)
 *                                 .operation(&#34;contains&#34;)
 *                                 .expectedValue(&#34;P5&#34;)
 *                                 .build(),
 *                             IntegrationActionCreateFilterConditionArgs.builder()
 *                                 .field(&#34;message&#34;)
 *                                 .operation(&#34;starts-with&#34;)
 *                                 .expectedValue(&#34;[custom]&#34;)
 *                                 .build())
 *                         .build())
 *                     .build())
 *             .closes(IntegrationActionCloseArgs.builder()
 *                 .name(&#34;Low priority alerts&#34;)
 *                 .filters(IntegrationActionCloseFilterArgs.builder()
 *                     .type(&#34;match-any-condition&#34;)
 *                     .conditions(                    
 *                         IntegrationActionCloseFilterConditionArgs.builder()
 *                             .field(&#34;priority&#34;)
 *                             .operation(&#34;equals&#34;)
 *                             .expectedValue(&#34;P5&#34;)
 *                             .build(),
 *                         IntegrationActionCloseFilterConditionArgs.builder()
 *                             .field(&#34;message&#34;)
 *                             .operation(&#34;contains&#34;)
 *                             .expectedValue(&#34;DEBUG&#34;)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .acknowledges(IntegrationActionAcknowledgeArgs.builder()
 *                 .name(&#34;Auto-ack test alerts&#34;)
 *                 .filters(IntegrationActionAcknowledgeFilterArgs.builder()
 *                     .type(&#34;match-all-conditions&#34;)
 *                     .conditions(                    
 *                         IntegrationActionAcknowledgeFilterConditionArgs.builder()
 *                             .field(&#34;message&#34;)
 *                             .not(true)
 *                             .operation(&#34;contains&#34;)
 *                             .expectedValue(&#34;TEST&#34;)
 *                             .build(),
 *                         IntegrationActionAcknowledgeFilterConditionArgs.builder()
 *                             .field(&#34;priority&#34;)
 *                             .operation(&#34;equals&#34;)
 *                             .expectedValue(&#34;P5&#34;)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .addNotes(IntegrationActionAddNoteArgs.builder()
 *                 .name(&#34;Add note to all alerts&#34;)
 *                 .note(&#34;Created from test integration&#34;)
 *                 .filters(IntegrationActionAddNoteFilterArgs.builder()
 *                     .type(&#34;match-all&#34;)
 *                     .build())
 *                 .build())
 *             .ignores(IntegrationActionIgnoreArgs.builder()
 *                 .name(&#34;Ignore alerts with ignore tag&#34;)
 *                 .filters(IntegrationActionIgnoreFilterArgs.builder()
 *                     .type(&#34;match-all-conditions&#34;)
 *                     .conditions(IntegrationActionIgnoreFilterConditionArgs.builder()
 *                         .field(&#34;tags&#34;)
 *                         .operation(&#34;contains&#34;)
 *                         .expectedValue(&#34;ignore&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
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
        super("opsgenie:index/integrationAction:IntegrationAction", name, args == null ? IntegrationActionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationAction(String name, Output<String> id, @Nullable IntegrationActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/integrationAction:IntegrationAction", name, state, makeResourceOptions(options, id));
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
