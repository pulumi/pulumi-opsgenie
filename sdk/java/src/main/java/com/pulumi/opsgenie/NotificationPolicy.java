// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.NotificationPolicyArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.NotificationPolicyState;
import com.pulumi.opsgenie.outputs.NotificationPolicyAutoCloseAction;
import com.pulumi.opsgenie.outputs.NotificationPolicyAutoRestartAction;
import com.pulumi.opsgenie.outputs.NotificationPolicyDeDuplicationAction;
import com.pulumi.opsgenie.outputs.NotificationPolicyDelayAction;
import com.pulumi.opsgenie.outputs.NotificationPolicyFilter;
import com.pulumi.opsgenie.outputs.NotificationPolicyTimeRestriction;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Notification Policy within Opsgenie.
 * 
 * ## Import
 * 
 * Notification policies can be imported using the `team_id` and `notification_policy_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import opsgenie:index/notificationPolicy:NotificationPolicy test team_id/notification_policy_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/notificationPolicy:NotificationPolicy")
public class NotificationPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     * 
     */
    @Export(name="autoCloseActions", refs={List.class,NotificationPolicyAutoCloseAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationPolicyAutoCloseAction>> autoCloseActions;

    /**
     * @return Auto Restart Action of the policy. This is a block, structure is documented below.
     * 
     */
    public Output<Optional<List<NotificationPolicyAutoCloseAction>>> autoCloseActions() {
        return Codegen.optional(this.autoCloseActions);
    }
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     * 
     */
    @Export(name="autoRestartActions", refs={List.class,NotificationPolicyAutoRestartAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationPolicyAutoRestartAction>> autoRestartActions;

    /**
     * @return Auto Restart Action of the policy. This is a block, structure is documented below.
     * 
     */
    public Output<Optional<List<NotificationPolicyAutoRestartAction>>> autoRestartActions() {
        return Codegen.optional(this.autoRestartActions);
    }
    /**
     * Deduplication Action of the policy. This is a block, structure is documented below.
     * 
     */
    @Export(name="deDuplicationActions", refs={List.class,NotificationPolicyDeDuplicationAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationPolicyDeDuplicationAction>> deDuplicationActions;

    /**
     * @return Deduplication Action of the policy. This is a block, structure is documented below.
     * 
     */
    public Output<Optional<List<NotificationPolicyDeDuplicationAction>>> deDuplicationActions() {
        return Codegen.optional(this.deDuplicationActions);
    }
    /**
     * Delay notifications. This is a block, structure is documented below.
     * 
     */
    @Export(name="delayActions", refs={List.class,NotificationPolicyDelayAction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationPolicyDelayAction>> delayActions;

    /**
     * @return Delay notifications. This is a block, structure is documented below.
     * 
     */
    public Output<Optional<List<NotificationPolicyDelayAction>>> delayActions() {
        return Codegen.optional(this.delayActions);
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
     * A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     * 
     */
    @Export(name="filters", refs={List.class,NotificationPolicyFilter.class}, tree="[0,1]")
    private Output<List<NotificationPolicyFilter>> filters;

    /**
     * @return A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     * 
     */
    public Output<List<NotificationPolicyFilter>> filters() {
        return this.filters;
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
     * Description of the policy. This can be max 512 characters.
     * 
     */
    @Export(name="policyDescription", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> policyDescription;

    /**
     * @return Description of the policy. This can be max 512 characters.
     * 
     */
    public Output<Optional<String>> policyDescription() {
        return Codegen.optional(this.policyDescription);
    }
    /**
     * Suppress value of the policy. Values are: `true`, `false`. Default: `false`
     * 
     */
    @Export(name="suppress", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> suppress;

    /**
     * @return Suppress value of the policy. Values are: `true`, `false`. Default: `false`
     * 
     */
    public Output<Optional<Boolean>> suppress() {
        return Codegen.optional(this.suppress);
    }
    /**
     * Id of team that this policy belons to.
     * 
     */
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output<String> teamId;

    /**
     * @return Id of team that this policy belons to.
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     * 
     */
    @Export(name="timeRestrictions", refs={List.class,NotificationPolicyTimeRestriction.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationPolicyTimeRestriction>> timeRestrictions;

    /**
     * @return Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     * 
     */
    public Output<Optional<List<NotificationPolicyTimeRestriction>>> timeRestrictions() {
        return Codegen.optional(this.timeRestrictions);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationPolicy(String name) {
        this(name, NotificationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationPolicy(String name, NotificationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationPolicy(String name, NotificationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/notificationPolicy:NotificationPolicy", name, args == null ? NotificationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationPolicy(String name, Output<String> id, @Nullable NotificationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/notificationPolicy:NotificationPolicy", name, state, makeResourceOptions(options, id));
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
    public static NotificationPolicy get(String name, Output<String> id, @Nullable NotificationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationPolicy(name, id, state, options);
    }
}
