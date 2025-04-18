// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.ServiceIncidentRuleArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.ServiceIncidentRuleState;
import com.pulumi.opsgenie.outputs.ServiceIncidentRuleIncidentRule;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Manages a Service Incident Rule within Opsgenie.
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
 * import com.pulumi.opsgenie.Team;
 * import com.pulumi.opsgenie.TeamArgs;
 * import com.pulumi.opsgenie.Service;
 * import com.pulumi.opsgenie.ServiceArgs;
 * import com.pulumi.opsgenie.ServiceIncidentRule;
 * import com.pulumi.opsgenie.ServiceIncidentRuleArgs;
 * import com.pulumi.opsgenie.inputs.ServiceIncidentRuleIncidentRuleArgs;
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
 *         var test = new Team("test", TeamArgs.builder()
 *             .name("example-team")
 *             .description("This team deals with all the things")
 *             .build());
 * 
 *         var testService = new Service("testService", ServiceArgs.builder()
 *             .name("example-service")
 *             .teamId(test.id())
 *             .build());
 * 
 *         var testServiceIncidentRule = new ServiceIncidentRule("testServiceIncidentRule", ServiceIncidentRuleArgs.builder()
 *             .serviceId(testService.id())
 *             .incidentRules(ServiceIncidentRuleIncidentRuleArgs.builder()
 *                 .conditionMatchType("match-any-condition")
 *                 .conditions(                
 *                     ServiceIncidentRuleIncidentRuleConditionArgs.builder()
 *                         .field("message")
 *                         .not(false)
 *                         .operation("contains")
 *                         .expectedValue("expected1")
 *                         .build(),
 *                     ServiceIncidentRuleIncidentRuleConditionArgs.builder()
 *                         .field("message")
 *                         .not(false)
 *                         .operation("contains")
 *                         .expectedValue("expected2")
 *                         .build())
 *                 .incidentProperties(ServiceIncidentRuleIncidentRuleIncidentPropertyArgs.builder()
 *                     .message("This is a test message")
 *                     .priority("P3")
 *                     .stakeholderProperties(ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs.builder()
 *                         .message("Message for stakeholders")
 *                         .enable(true)
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
 * ## Import
 * 
 * Service Incident Rule can be imported using the `service_id/service_incident_rule_id`, e.g.
 * 
 * ```sh
 * $ pulumi import opsgenie:index/serviceIncidentRule:ServiceIncidentRule this service_id/service_incident_rule_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/serviceIncidentRule:ServiceIncidentRule")
public class ServiceIncidentRule extends com.pulumi.resources.CustomResource {
    /**
     * This is the rule configuration for this incident rule. This is a block, structure is documented below.
     * 
     */
    @Export(name="incidentRules", refs={List.class,ServiceIncidentRuleIncidentRule.class}, tree="[0,1]")
    private Output<List<ServiceIncidentRuleIncidentRule>> incidentRules;

    /**
     * @return This is the rule configuration for this incident rule. This is a block, structure is documented below.
     * 
     */
    public Output<List<ServiceIncidentRuleIncidentRule>> incidentRules() {
        return this.incidentRules;
    }
    /**
     * ID of the service associated
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return ID of the service associated
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceIncidentRule(java.lang.String name) {
        this(name, ServiceIncidentRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceIncidentRule(java.lang.String name, ServiceIncidentRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceIncidentRule(java.lang.String name, ServiceIncidentRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/serviceIncidentRule:ServiceIncidentRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private ServiceIncidentRule(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceIncidentRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/serviceIncidentRule:ServiceIncidentRule", name, state, makeResourceOptions(options, id), false);
    }

    private static ServiceIncidentRuleArgs makeArgs(ServiceIncidentRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? ServiceIncidentRuleArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static ServiceIncidentRule get(java.lang.String name, Output<java.lang.String> id, @Nullable ServiceIncidentRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceIncidentRule(name, id, state, options);
    }
}
