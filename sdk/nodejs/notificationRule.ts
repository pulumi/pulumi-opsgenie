// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Manages a Notification Rule within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const testUser = new opsgenie.User("testUser", {
 *     username: "Example user",
 *     fullName: "Name Lastname",
 *     role: "User",
 * });
 * const testNotificationRule = new opsgenie.NotificationRule("testNotificationRule", {
 *     username: testUser.username,
 *     actionType: "schedule-end",
 *     notificationTimes: [
 *         "just-before",
 *         "15-minutes-ago",
 *     ],
 *     steps: [{
 *         contacts: [{
 *             method: "email",
 *             to: "example@user.com",
 *         }],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Notification policies can be imported using the `user_id/notification_rule_id`, e.g.
 *
 * ```sh
 *  $ pulumi import opsgenie:index/notificationRule:NotificationRule test user_id/notification_rule_id`
 * ```
 */
export class NotificationRule extends pulumi.CustomResource {
    /**
     * Get an existing NotificationRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NotificationRuleState, opts?: pulumi.CustomResourceOptions): NotificationRule {
        return new NotificationRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/notificationRule:NotificationRule';

    /**
     * Returns true if the given object is an instance of NotificationRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NotificationRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NotificationRule.__pulumiType;
    }

    /**
     * Type of the action that notification rule will have. Allowed values: `create-alert`, `acknowledged-alert`, `closed-alert`, `assigned-alert`, `add-note`, `schedule-start`, `schedule-end`, `incoming-call-routing`
     */
    public readonly actionType!: pulumi.Output<string>;
    public readonly criterias!: pulumi.Output<outputs.NotificationRuleCriteria[] | undefined>;
    /**
     * Defined if this step is enabled. Default: `true`
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the notification policy
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `actionType` is `schedule-start` or `schedule-end` then it is required.
     */
    public readonly notificationTimes!: pulumi.Output<string[] | undefined>;
    /**
     * Order of the condition in conditions list
     */
    public readonly order!: pulumi.Output<number>;
    public readonly repeats!: pulumi.Output<outputs.NotificationRuleRepeat[] | undefined>;
    public readonly schedules!: pulumi.Output<outputs.NotificationRuleSchedule[] | undefined>;
    /**
     * Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
     */
    public readonly steps!: pulumi.Output<outputs.NotificationRuleStep[] | undefined>;
    public readonly timeRestrictions!: pulumi.Output<outputs.NotificationRuleTimeRestriction[] | undefined>;
    /**
     * Username of user to which this notification rule belongs to.
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a NotificationRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NotificationRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NotificationRuleArgs | NotificationRuleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NotificationRuleState | undefined;
            inputs["actionType"] = state ? state.actionType : undefined;
            inputs["criterias"] = state ? state.criterias : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["notificationTimes"] = state ? state.notificationTimes : undefined;
            inputs["order"] = state ? state.order : undefined;
            inputs["repeats"] = state ? state.repeats : undefined;
            inputs["schedules"] = state ? state.schedules : undefined;
            inputs["steps"] = state ? state.steps : undefined;
            inputs["timeRestrictions"] = state ? state.timeRestrictions : undefined;
            inputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as NotificationRuleArgs | undefined;
            if ((!args || args.actionType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'actionType'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            inputs["actionType"] = args ? args.actionType : undefined;
            inputs["criterias"] = args ? args.criterias : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["notificationTimes"] = args ? args.notificationTimes : undefined;
            inputs["order"] = args ? args.order : undefined;
            inputs["repeats"] = args ? args.repeats : undefined;
            inputs["schedules"] = args ? args.schedules : undefined;
            inputs["steps"] = args ? args.steps : undefined;
            inputs["timeRestrictions"] = args ? args.timeRestrictions : undefined;
            inputs["username"] = args ? args.username : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(NotificationRule.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NotificationRule resources.
 */
export interface NotificationRuleState {
    /**
     * Type of the action that notification rule will have. Allowed values: `create-alert`, `acknowledged-alert`, `closed-alert`, `assigned-alert`, `add-note`, `schedule-start`, `schedule-end`, `incoming-call-routing`
     */
    actionType?: pulumi.Input<string>;
    criterias?: pulumi.Input<pulumi.Input<inputs.NotificationRuleCriteria>[]>;
    /**
     * Defined if this step is enabled. Default: `true`
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of the notification policy
     */
    name?: pulumi.Input<string>;
    /**
     * List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `actionType` is `schedule-start` or `schedule-end` then it is required.
     */
    notificationTimes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Order of the condition in conditions list
     */
    order?: pulumi.Input<number>;
    repeats?: pulumi.Input<pulumi.Input<inputs.NotificationRuleRepeat>[]>;
    schedules?: pulumi.Input<pulumi.Input<inputs.NotificationRuleSchedule>[]>;
    /**
     * Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
     */
    steps?: pulumi.Input<pulumi.Input<inputs.NotificationRuleStep>[]>;
    timeRestrictions?: pulumi.Input<pulumi.Input<inputs.NotificationRuleTimeRestriction>[]>;
    /**
     * Username of user to which this notification rule belongs to.
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NotificationRule resource.
 */
export interface NotificationRuleArgs {
    /**
     * Type of the action that notification rule will have. Allowed values: `create-alert`, `acknowledged-alert`, `closed-alert`, `assigned-alert`, `add-note`, `schedule-start`, `schedule-end`, `incoming-call-routing`
     */
    actionType: pulumi.Input<string>;
    criterias?: pulumi.Input<pulumi.Input<inputs.NotificationRuleCriteria>[]>;
    /**
     * Defined if this step is enabled. Default: `true`
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of the notification policy
     */
    name?: pulumi.Input<string>;
    /**
     * List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `actionType` is `schedule-start` or `schedule-end` then it is required.
     */
    notificationTimes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Order of the condition in conditions list
     */
    order?: pulumi.Input<number>;
    repeats?: pulumi.Input<pulumi.Input<inputs.NotificationRuleRepeat>[]>;
    schedules?: pulumi.Input<pulumi.Input<inputs.NotificationRuleSchedule>[]>;
    /**
     * Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
     */
    steps?: pulumi.Input<pulumi.Input<inputs.NotificationRuleStep>[]>;
    timeRestrictions?: pulumi.Input<pulumi.Input<inputs.NotificationRuleTimeRestriction>[]>;
    /**
     * Username of user to which this notification rule belongs to.
     */
    username: pulumi.Input<string>;
}
