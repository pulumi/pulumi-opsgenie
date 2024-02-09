// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Alert Policy within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const testTeam = new opsgenie.Team("testTeam", {description: "This team deals with all the things"});
 * const testAlertPolicy = new opsgenie.AlertPolicy("testAlertPolicy", {
 *     teamId: testTeam.id,
 *     policyDescription: "This is sample policy",
 *     message: "{{message}}",
 *     filters: [{}],
 *     timeRestrictions: [{
 *         type: "weekday-and-time-of-day",
 *         restrictionList: [
 *             {
 *                 endDay: "monday",
 *                 endHour: 7,
 *                 endMin: 0,
 *                 startDay: "sunday",
 *                 startHour: 21,
 *                 startMin: 0,
 *             },
 *             {
 *                 endDay: "tuesday",
 *                 endHour: 7,
 *                 endMin: 0,
 *                 startDay: "monday",
 *                 startHour: 22,
 *                 startMin: 0,
 *             },
 *         ],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Alert policies can be imported using the `team_id/policy_id`, e.g.
 *
 * ```sh
 * $ pulumi import opsgenie:index/alertPolicy:AlertPolicy test team_id/policy_id`
 * ```
 *
 *  You can import global polices using only policy identifier
 *
 * ```sh
 * $ pulumi import opsgenie:index/alertPolicy:AlertPolicy test policy_id`
 * ```
 */
export class AlertPolicy extends pulumi.CustomResource {
    /**
     * Get an existing AlertPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertPolicyState, opts?: pulumi.CustomResourceOptions): AlertPolicy {
        return new AlertPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/alertPolicy:AlertPolicy';

    /**
     * Returns true if the given object is an instance of AlertPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertPolicy.__pulumiType;
    }

    /**
     * Actions to add to the alerts original actions value as a list of strings. If `ignoreOriginalActions` field is set to `true`, this will replace the original actions.
     */
    public readonly actions!: pulumi.Output<string[] | undefined>;
    /**
     * Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
     */
    public readonly alertDescription!: pulumi.Output<string | undefined>;
    /**
     * Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
     */
    public readonly alias!: pulumi.Output<string | undefined>;
    /**
     * It will trigger other modify policies if set to `true`. Default: `false`
     */
    public readonly continuePolicy!: pulumi.Output<boolean | undefined>;
    /**
     * If policy should be enabled. Default: `true`
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
     */
    public readonly entity!: pulumi.Output<string | undefined>;
    /**
     * A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     */
    public readonly filters!: pulumi.Output<outputs.AlertPolicyFilter[] | undefined>;
    /**
     * If set to `true`, policy will ignore the original actions of the alert. Default: `false`
     */
    public readonly ignoreOriginalActions!: pulumi.Output<boolean | undefined>;
    /**
     * If set to `true`, policy will ignore the original details of the alert. Default: `false`
     */
    public readonly ignoreOriginalDetails!: pulumi.Output<boolean | undefined>;
    /**
     * If set to `true`, policy will ignore the original responders of the alert. Default: `false`
     */
    public readonly ignoreOriginalResponders!: pulumi.Output<boolean | undefined>;
    /**
     * If set to `true`, policy will ignore the original tags of the alert. Default: `false`
     */
    public readonly ignoreOriginalTags!: pulumi.Output<boolean | undefined>;
    /**
     * Message of the alerts
     */
    public readonly message!: pulumi.Output<string>;
    /**
     * Name of the alert policy
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    public readonly policyDescription!: pulumi.Output<string | undefined>;
    /**
     * Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
     */
    public readonly priority!: pulumi.Output<string | undefined>;
    /**
     * Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`, `escalation`, `schedule`. This is a block, structure is documented below.
     */
    public readonly responders!: pulumi.Output<outputs.AlertPolicyResponder[] | undefined>;
    /**
     * Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
     */
    public readonly source!: pulumi.Output<string | undefined>;
    /**
     * Tags to add to the alerts original tags value as a list of strings. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Id of team that this policy belongs to.
     */
    public readonly teamId!: pulumi.Output<string | undefined>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    public readonly timeRestrictions!: pulumi.Output<outputs.AlertPolicyTimeRestriction[] | undefined>;

    /**
     * Create a AlertPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertPolicyArgs | AlertPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertPolicyState | undefined;
            resourceInputs["actions"] = state ? state.actions : undefined;
            resourceInputs["alertDescription"] = state ? state.alertDescription : undefined;
            resourceInputs["alias"] = state ? state.alias : undefined;
            resourceInputs["continuePolicy"] = state ? state.continuePolicy : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["entity"] = state ? state.entity : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["ignoreOriginalActions"] = state ? state.ignoreOriginalActions : undefined;
            resourceInputs["ignoreOriginalDetails"] = state ? state.ignoreOriginalDetails : undefined;
            resourceInputs["ignoreOriginalResponders"] = state ? state.ignoreOriginalResponders : undefined;
            resourceInputs["ignoreOriginalTags"] = state ? state.ignoreOriginalTags : undefined;
            resourceInputs["message"] = state ? state.message : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyDescription"] = state ? state.policyDescription : undefined;
            resourceInputs["priority"] = state ? state.priority : undefined;
            resourceInputs["responders"] = state ? state.responders : undefined;
            resourceInputs["source"] = state ? state.source : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
            resourceInputs["timeRestrictions"] = state ? state.timeRestrictions : undefined;
        } else {
            const args = argsOrState as AlertPolicyArgs | undefined;
            if ((!args || args.message === undefined) && !opts.urn) {
                throw new Error("Missing required property 'message'");
            }
            resourceInputs["actions"] = args ? args.actions : undefined;
            resourceInputs["alertDescription"] = args ? args.alertDescription : undefined;
            resourceInputs["alias"] = args ? args.alias : undefined;
            resourceInputs["continuePolicy"] = args ? args.continuePolicy : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["entity"] = args ? args.entity : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["ignoreOriginalActions"] = args ? args.ignoreOriginalActions : undefined;
            resourceInputs["ignoreOriginalDetails"] = args ? args.ignoreOriginalDetails : undefined;
            resourceInputs["ignoreOriginalResponders"] = args ? args.ignoreOriginalResponders : undefined;
            resourceInputs["ignoreOriginalTags"] = args ? args.ignoreOriginalTags : undefined;
            resourceInputs["message"] = args ? args.message : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyDescription"] = args ? args.policyDescription : undefined;
            resourceInputs["priority"] = args ? args.priority : undefined;
            resourceInputs["responders"] = args ? args.responders : undefined;
            resourceInputs["source"] = args ? args.source : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["teamId"] = args ? args.teamId : undefined;
            resourceInputs["timeRestrictions"] = args ? args.timeRestrictions : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertPolicy resources.
 */
export interface AlertPolicyState {
    /**
     * Actions to add to the alerts original actions value as a list of strings. If `ignoreOriginalActions` field is set to `true`, this will replace the original actions.
     */
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
     */
    alertDescription?: pulumi.Input<string>;
    /**
     * Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
     */
    alias?: pulumi.Input<string>;
    /**
     * It will trigger other modify policies if set to `true`. Default: `false`
     */
    continuePolicy?: pulumi.Input<boolean>;
    /**
     * If policy should be enabled. Default: `true`
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
     */
    entity?: pulumi.Input<string>;
    /**
     * A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.AlertPolicyFilter>[]>;
    /**
     * If set to `true`, policy will ignore the original actions of the alert. Default: `false`
     */
    ignoreOriginalActions?: pulumi.Input<boolean>;
    /**
     * If set to `true`, policy will ignore the original details of the alert. Default: `false`
     */
    ignoreOriginalDetails?: pulumi.Input<boolean>;
    /**
     * If set to `true`, policy will ignore the original responders of the alert. Default: `false`
     */
    ignoreOriginalResponders?: pulumi.Input<boolean>;
    /**
     * If set to `true`, policy will ignore the original tags of the alert. Default: `false`
     */
    ignoreOriginalTags?: pulumi.Input<boolean>;
    /**
     * Message of the alerts
     */
    message?: pulumi.Input<string>;
    /**
     * Name of the alert policy
     */
    name?: pulumi.Input<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    policyDescription?: pulumi.Input<string>;
    /**
     * Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
     */
    priority?: pulumi.Input<string>;
    /**
     * Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`, `escalation`, `schedule`. This is a block, structure is documented below.
     */
    responders?: pulumi.Input<pulumi.Input<inputs.AlertPolicyResponder>[]>;
    /**
     * Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
     */
    source?: pulumi.Input<string>;
    /**
     * Tags to add to the alerts original tags value as a list of strings. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Id of team that this policy belongs to.
     */
    teamId?: pulumi.Input<string>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    timeRestrictions?: pulumi.Input<pulumi.Input<inputs.AlertPolicyTimeRestriction>[]>;
}

/**
 * The set of arguments for constructing a AlertPolicy resource.
 */
export interface AlertPolicyArgs {
    /**
     * Actions to add to the alerts original actions value as a list of strings. If `ignoreOriginalActions` field is set to `true`, this will replace the original actions.
     */
    actions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
     */
    alertDescription?: pulumi.Input<string>;
    /**
     * Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
     */
    alias?: pulumi.Input<string>;
    /**
     * It will trigger other modify policies if set to `true`. Default: `false`
     */
    continuePolicy?: pulumi.Input<boolean>;
    /**
     * If policy should be enabled. Default: `true`
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
     */
    entity?: pulumi.Input<string>;
    /**
     * A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.AlertPolicyFilter>[]>;
    /**
     * If set to `true`, policy will ignore the original actions of the alert. Default: `false`
     */
    ignoreOriginalActions?: pulumi.Input<boolean>;
    /**
     * If set to `true`, policy will ignore the original details of the alert. Default: `false`
     */
    ignoreOriginalDetails?: pulumi.Input<boolean>;
    /**
     * If set to `true`, policy will ignore the original responders of the alert. Default: `false`
     */
    ignoreOriginalResponders?: pulumi.Input<boolean>;
    /**
     * If set to `true`, policy will ignore the original tags of the alert. Default: `false`
     */
    ignoreOriginalTags?: pulumi.Input<boolean>;
    /**
     * Message of the alerts
     */
    message: pulumi.Input<string>;
    /**
     * Name of the alert policy
     */
    name?: pulumi.Input<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    policyDescription?: pulumi.Input<string>;
    /**
     * Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
     */
    priority?: pulumi.Input<string>;
    /**
     * Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`, `escalation`, `schedule`. This is a block, structure is documented below.
     */
    responders?: pulumi.Input<pulumi.Input<inputs.AlertPolicyResponder>[]>;
    /**
     * Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
     */
    source?: pulumi.Input<string>;
    /**
     * Tags to add to the alerts original tags value as a list of strings. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Id of team that this policy belongs to.
     */
    teamId?: pulumi.Input<string>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    timeRestrictions?: pulumi.Input<pulumi.Input<inputs.AlertPolicyTimeRestriction>[]>;
}
