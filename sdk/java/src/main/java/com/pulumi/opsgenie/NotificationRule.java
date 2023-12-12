// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.NotificationRuleArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.NotificationRuleState;
import com.pulumi.opsgenie.outputs.NotificationRuleCriteria;
import com.pulumi.opsgenie.outputs.NotificationRuleRepeat;
import com.pulumi.opsgenie.outputs.NotificationRuleSchedule;
import com.pulumi.opsgenie.outputs.NotificationRuleStep;
import com.pulumi.opsgenie.outputs.NotificationRuleTimeRestriction;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Notification Rule within Opsgenie.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.opsgenie.User;
 * import com.pulumi.opsgenie.UserArgs;
 * import com.pulumi.opsgenie.NotificationRule;
 * import com.pulumi.opsgenie.NotificationRuleArgs;
 * import com.pulumi.opsgenie.inputs.NotificationRuleStepArgs;
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
 *         var testUser = new User(&#34;testUser&#34;, UserArgs.builder()        
 *             .username(&#34;Example user&#34;)
 *             .fullName(&#34;Name Lastname&#34;)
 *             .role(&#34;User&#34;)
 *             .build());
 * 
 *         var testNotificationRule = new NotificationRule(&#34;testNotificationRule&#34;, NotificationRuleArgs.builder()        
 *             .username(testUser.username())
 *             .actionType(&#34;schedule-end&#34;)
 *             .notificationTimes(            
 *                 &#34;just-before&#34;,
 *                 &#34;15-minutes-ago&#34;)
 *             .steps(NotificationRuleStepArgs.builder()
 *                 .contacts(NotificationRuleStepContactArgs.builder()
 *                     .method(&#34;email&#34;)
 *                     .to(&#34;example@user.com&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Notification policies can be imported using the `user_id/notification_rule_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import opsgenie:index/notificationRule:NotificationRule test user_id/notification_rule_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/notificationRule:NotificationRule")
public class NotificationRule extends com.pulumi.resources.CustomResource {
    /**
     * Type of the action that notification rule will have. Allowed values: `create-alert`, `acknowledged-alert`, `closed-alert`, `assigned-alert`, `add-note`, `schedule-start`, `schedule-end`, `incoming-call-routing`
     * 
     */
    @Export(name="actionType", refs={String.class}, tree="[0]")
    private Output<String> actionType;

    /**
     * @return Type of the action that notification rule will have. Allowed values: `create-alert`, `acknowledged-alert`, `closed-alert`, `assigned-alert`, `add-note`, `schedule-start`, `schedule-end`, `incoming-call-routing`
     * 
     */
    public Output<String> actionType() {
        return this.actionType;
    }
    @Export(name="criterias", refs={List.class,NotificationRuleCriteria.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationRuleCriteria>> criterias;

    public Output<Optional<List<NotificationRuleCriteria>>> criterias() {
        return Codegen.optional(this.criterias);
    }
    /**
     * If policy should be enabled. Default: `true`
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If policy should be enabled. Default: `true`
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Name of the notification policy
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the notification policy
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `action_type` is `schedule-start` or `schedule-end` then it is required.
     * 
     */
    @Export(name="notificationTimes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> notificationTimes;

    /**
     * @return List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `action_type` is `schedule-start` or `schedule-end` then it is required.
     * 
     */
    public Output<Optional<List<String>>> notificationTimes() {
        return Codegen.optional(this.notificationTimes);
    }
    /**
     * Order of the condition in conditions list
     * 
     */
    @Export(name="order", refs={Integer.class}, tree="[0]")
    private Output<Integer> order;

    /**
     * @return Order of the condition in conditions list
     * 
     */
    public Output<Integer> order() {
        return this.order;
    }
    @Export(name="repeats", refs={List.class,NotificationRuleRepeat.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationRuleRepeat>> repeats;

    public Output<Optional<List<NotificationRuleRepeat>>> repeats() {
        return Codegen.optional(this.repeats);
    }
    @Export(name="schedules", refs={List.class,NotificationRuleSchedule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationRuleSchedule>> schedules;

    public Output<Optional<List<NotificationRuleSchedule>>> schedules() {
        return Codegen.optional(this.schedules);
    }
    /**
     * Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
     * 
     */
    @Export(name="steps", refs={List.class,NotificationRuleStep.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationRuleStep>> steps;

    /**
     * @return Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
     * 
     */
    public Output<Optional<List<NotificationRuleStep>>> steps() {
        return Codegen.optional(this.steps);
    }
    @Export(name="timeRestrictions", refs={List.class,NotificationRuleTimeRestriction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationRuleTimeRestriction>> timeRestrictions;

    public Output<Optional<List<NotificationRuleTimeRestriction>>> timeRestrictions() {
        return Codegen.optional(this.timeRestrictions);
    }
    /**
     * Username of user to which this notification rule belongs to.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return Username of user to which this notification rule belongs to.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationRule(String name) {
        this(name, NotificationRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationRule(String name, NotificationRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationRule(String name, NotificationRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/notificationRule:NotificationRule", name, args == null ? NotificationRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationRule(String name, Output<String> id, @Nullable NotificationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/notificationRule:NotificationRule", name, state, makeResourceOptions(options, id));
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
    public static NotificationRule get(String name, Output<String> id, @Nullable NotificationRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationRule(name, id, state, options);
    }
}
