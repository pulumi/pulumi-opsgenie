// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.TeamRoutingRuleArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.TeamRoutingRuleState;
import com.pulumi.opsgenie.outputs.TeamRoutingRuleCriteria;
import com.pulumi.opsgenie.outputs.TeamRoutingRuleNotify;
import com.pulumi.opsgenie.outputs.TeamRoutingRuleTimeRestriction;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Team Routing Rule within Opsgenie.
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
 * import com.pulumi.opsgenie.Schedule;
 * import com.pulumi.opsgenie.ScheduleArgs;
 * import com.pulumi.opsgenie.Team;
 * import com.pulumi.opsgenie.TeamArgs;
 * import com.pulumi.opsgenie.TeamRoutingRule;
 * import com.pulumi.opsgenie.TeamRoutingRuleArgs;
 * import com.pulumi.opsgenie.inputs.TeamRoutingRuleCriteriaArgs;
 * import com.pulumi.opsgenie.inputs.TeamRoutingRuleTimeRestrictionArgs;
 * import com.pulumi.opsgenie.inputs.TeamRoutingRuleNotifyArgs;
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
 *         var test = new Schedule("test", ScheduleArgs.builder()
 *             .name("genieschedule")
 *             .description("schedule test")
 *             .timezone("Europe/Rome")
 *             .enabled(false)
 *             .build());
 * 
 *         var testTeam = new Team("testTeam", TeamArgs.builder()
 *             .name("example team")
 *             .description("This team deals with all the things")
 *             .build());
 * 
 *         var testTeamRoutingRule = new TeamRoutingRule("testTeamRoutingRule", TeamRoutingRuleArgs.builder()
 *             .name("routing rule example")
 *             .teamId(testTeam.id())
 *             .order(0)
 *             .timezone("America/Los_Angeles")
 *             .criterias(TeamRoutingRuleCriteriaArgs.builder()
 *                 .type("match-any-condition")
 *                 .conditions(TeamRoutingRuleCriteriaConditionArgs.builder()
 *                     .field("message")
 *                     .operation("contains")
 *                     .expectedValue("expected1")
 *                     .not(false)
 *                     .build())
 *                 .build())
 *             .timeRestrictions(TeamRoutingRuleTimeRestrictionArgs.builder()
 *                 .type("weekday-and-time-of-day")
 *                 .restrictionList(TeamRoutingRuleTimeRestrictionRestrictionListArgs.builder()
 *                     .startDay("monday")
 *                     .startHour(8)
 *                     .startMin(0)
 *                     .endDay("tuesday")
 *                     .endHour(18)
 *                     .endMin(30)
 *                     .build())
 *                 .build())
 *             .notifies(TeamRoutingRuleNotifyArgs.builder()
 *                 .name(test.name())
 *                 .type("schedule")
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
 * Team Routing Rules can be imported using the `team_id/routing_rule_id`, e.g.
 * 
 * ```sh
 * $ pulumi import opsgenie:index/teamRoutingRule:TeamRoutingRule ruletest team_id/routing_rule_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/teamRoutingRule:TeamRoutingRule")
public class TeamRoutingRule extends com.pulumi.resources.CustomResource {
    /**
     * You can refer Criteria for detailed information about criteria and its fields
     * 
     */
    @Export(name="criterias", refs={List.class,TeamRoutingRuleCriteria.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TeamRoutingRuleCriteria>> criterias;

    /**
     * @return You can refer Criteria for detailed information about criteria and its fields
     * 
     */
    public Output<Optional<List<TeamRoutingRuleCriteria>>> criterias() {
        return Codegen.optional(this.criterias);
    }
    /**
     * Only use when importing default routing rule
     * 
     */
    @Export(name="isDefault", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isDefault;

    /**
     * @return Only use when importing default routing rule
     * 
     */
    public Output<Optional<Boolean>> isDefault() {
        return Codegen.optional(this.isDefault);
    }
    /**
     * Name of the team routing rule
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the team routing rule
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
     * 
     */
    @Export(name="notifies", refs={List.class,TeamRoutingRuleNotify.class}, tree="[0,1]")
    private Output<List<TeamRoutingRuleNotify>> notifies;

    /**
     * @return Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
     * 
     */
    public Output<List<TeamRoutingRuleNotify>> notifies() {
        return this.notifies;
    }
    /**
     * The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
     * 
     */
    @Export(name="order", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> order;

    /**
     * @return The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
     * 
     */
    public Output<Optional<Integer>> order() {
        return Codegen.optional(this.order);
    }
    /**
     * Id of the team owning the routing rule
     * 
     */
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output<String> teamId;

    /**
     * @return Id of the team owning the routing rule
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }
    /**
     * You can refer Time Restriction for detailed information about time restriction and its fields.
     * 
     */
    @Export(name="timeRestrictions", refs={List.class,TeamRoutingRuleTimeRestriction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TeamRoutingRuleTimeRestriction>> timeRestrictions;

    /**
     * @return You can refer Time Restriction for detailed information about time restriction and its fields.
     * 
     */
    public Output<Optional<List<TeamRoutingRuleTimeRestriction>>> timeRestrictions() {
        return Codegen.optional(this.timeRestrictions);
    }
    /**
     * Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
     * 
     */
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timezone;

    /**
     * @return Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
     * 
     */
    public Output<Optional<String>> timezone() {
        return Codegen.optional(this.timezone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TeamRoutingRule(String name) {
        this(name, TeamRoutingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TeamRoutingRule(String name, TeamRoutingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TeamRoutingRule(String name, TeamRoutingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/teamRoutingRule:TeamRoutingRule", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private TeamRoutingRule(String name, Output<String> id, @Nullable TeamRoutingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/teamRoutingRule:TeamRoutingRule", name, state, makeResourceOptions(options, id));
    }

    private static TeamRoutingRuleArgs makeArgs(TeamRoutingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? TeamRoutingRuleArgs.Empty : args;
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
    public static TeamRoutingRule get(String name, Output<String> id, @Nullable TeamRoutingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TeamRoutingRule(name, id, state, options);
    }
}
