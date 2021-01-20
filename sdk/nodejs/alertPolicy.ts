// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
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
 *         restrictions: [
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
     * Actions to add to the alerts original actions value as a list of strings. If ignoreOriginalActions field is set to true, this will replace the original actions.
     */
    public readonly actions!: pulumi.Output<string[] | undefined>;
    public readonly alertDescription!: pulumi.Output<string | undefined>;
    /**
     * Alias of the alert. You can use {{alias}} to refer to the original alias. Default value is {{alias}}
     */
    public readonly alias!: pulumi.Output<string | undefined>;
    public readonly continuePolicy!: pulumi.Output<boolean | undefined>;
    /**
     * If policy should be enabled. Default: true
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Entity field of the alert. You can use {{entity}} to refer to the original entity. Default value is {{entity}}
     */
    public readonly entity!: pulumi.Output<string | undefined>;
    /**
     * A alert filter which will be applied. This filter can be empty: filter {} - this means 'match-all'. This is a block, structure is documented below.
     */
    public readonly filters!: pulumi.Output<outputs.AlertPolicyFilter[] | undefined>;
    /**
     * If set to true, policy will ignore the original actions of the alert. Default value is false
     */
    public readonly ignoreOriginalActions!: pulumi.Output<boolean | undefined>;
    /**
     * If set to true, policy will ignore the original details of the alert. Default value is false
     */
    public readonly ignoreOriginalDetails!: pulumi.Output<boolean | undefined>;
    /**
     * If set to true, policy will ignore the original responders of the alert. Default value is false
     */
    public readonly ignoreOriginalResponders!: pulumi.Output<boolean | undefined>;
    /**
     * If set to true, policy will ignore the original tags of the alert. Default value is false
     */
    public readonly ignoreOriginalTags!: pulumi.Output<boolean | undefined>;
    /**
     * Message of the alerts
     */
    public readonly message!: pulumi.Output<string>;
    /**
     * Name of the responder
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    public readonly policyDescription!: pulumi.Output<string | undefined>;
    /**
     * Priority of the alert. Should be one of P1, P2, P3, P4, or P5
     */
    public readonly priority!: pulumi.Output<string | undefined>;
    /**
     * Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If ignoreOriginalResponders field is set to true, this will replace the original responders. The possible values for responders are: user, team. This is a block, structure is documented below.
     */
    public readonly responders!: pulumi.Output<outputs.AlertPolicyResponder[] | undefined>;
    /**
     * Source field of the alert. You can use {{source}} to refer to the original source. Default value is {{source}}
     */
    public readonly source!: pulumi.Output<string | undefined>;
    /**
     * Tags to add to the alerts original tags value as a list of strings. If ignoreOriginalResponders field is set to true, this will replace the original responders.
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AlertPolicyState | undefined;
            inputs["actions"] = state ? state.actions : undefined;
            inputs["alertDescription"] = state ? state.alertDescription : undefined;
            inputs["alias"] = state ? state.alias : undefined;
            inputs["continuePolicy"] = state ? state.continuePolicy : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["entity"] = state ? state.entity : undefined;
            inputs["filters"] = state ? state.filters : undefined;
            inputs["ignoreOriginalActions"] = state ? state.ignoreOriginalActions : undefined;
            inputs["ignoreOriginalDetails"] = state ? state.ignoreOriginalDetails : undefined;
            inputs["ignoreOriginalResponders"] = state ? state.ignoreOriginalResponders : undefined;
            inputs["ignoreOriginalTags"] = state ? state.ignoreOriginalTags : undefined;
            inputs["message"] = state ? state.message : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["policyDescription"] = state ? state.policyDescription : undefined;
            inputs["priority"] = state ? state.priority : undefined;
            inputs["responders"] = state ? state.responders : undefined;
            inputs["source"] = state ? state.source : undefined;
            inputs["tags"] = state ? state.tags : undefined;
            inputs["teamId"] = state ? state.teamId : undefined;
            inputs["timeRestrictions"] = state ? state.timeRestrictions : undefined;
        } else {
            const args = argsOrState as AlertPolicyArgs | undefined;
            if ((!args || args.message === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'message'");
            }
            inputs["actions"] = args ? args.actions : undefined;
            inputs["alertDescription"] = args ? args.alertDescription : undefined;
            inputs["alias"] = args ? args.alias : undefined;
            inputs["continuePolicy"] = args ? args.continuePolicy : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["entity"] = args ? args.entity : undefined;
            inputs["filters"] = args ? args.filters : undefined;
            inputs["ignoreOriginalActions"] = args ? args.ignoreOriginalActions : undefined;
            inputs["ignoreOriginalDetails"] = args ? args.ignoreOriginalDetails : undefined;
            inputs["ignoreOriginalResponders"] = args ? args.ignoreOriginalResponders : undefined;
            inputs["ignoreOriginalTags"] = args ? args.ignoreOriginalTags : undefined;
            inputs["message"] = args ? args.message : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["policyDescription"] = args ? args.policyDescription : undefined;
            inputs["priority"] = args ? args.priority : undefined;
            inputs["responders"] = args ? args.responders : undefined;
            inputs["source"] = args ? args.source : undefined;
            inputs["tags"] = args ? args.tags : undefined;
            inputs["teamId"] = args ? args.teamId : undefined;
            inputs["timeRestrictions"] = args ? args.timeRestrictions : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(AlertPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertPolicy resources.
 */
export interface AlertPolicyState {
    /**
     * Actions to add to the alerts original actions value as a list of strings. If ignoreOriginalActions field is set to true, this will replace the original actions.
     */
    readonly actions?: pulumi.Input<pulumi.Input<string>[]>;
    readonly alertDescription?: pulumi.Input<string>;
    /**
     * Alias of the alert. You can use {{alias}} to refer to the original alias. Default value is {{alias}}
     */
    readonly alias?: pulumi.Input<string>;
    readonly continuePolicy?: pulumi.Input<boolean>;
    /**
     * If policy should be enabled. Default: true
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Entity field of the alert. You can use {{entity}} to refer to the original entity. Default value is {{entity}}
     */
    readonly entity?: pulumi.Input<string>;
    /**
     * A alert filter which will be applied. This filter can be empty: filter {} - this means 'match-all'. This is a block, structure is documented below.
     */
    readonly filters?: pulumi.Input<pulumi.Input<inputs.AlertPolicyFilter>[]>;
    /**
     * If set to true, policy will ignore the original actions of the alert. Default value is false
     */
    readonly ignoreOriginalActions?: pulumi.Input<boolean>;
    /**
     * If set to true, policy will ignore the original details of the alert. Default value is false
     */
    readonly ignoreOriginalDetails?: pulumi.Input<boolean>;
    /**
     * If set to true, policy will ignore the original responders of the alert. Default value is false
     */
    readonly ignoreOriginalResponders?: pulumi.Input<boolean>;
    /**
     * If set to true, policy will ignore the original tags of the alert. Default value is false
     */
    readonly ignoreOriginalTags?: pulumi.Input<boolean>;
    /**
     * Message of the alerts
     */
    readonly message?: pulumi.Input<string>;
    /**
     * Name of the responder
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    readonly policyDescription?: pulumi.Input<string>;
    /**
     * Priority of the alert. Should be one of P1, P2, P3, P4, or P5
     */
    readonly priority?: pulumi.Input<string>;
    /**
     * Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If ignoreOriginalResponders field is set to true, this will replace the original responders. The possible values for responders are: user, team. This is a block, structure is documented below.
     */
    readonly responders?: pulumi.Input<pulumi.Input<inputs.AlertPolicyResponder>[]>;
    /**
     * Source field of the alert. You can use {{source}} to refer to the original source. Default value is {{source}}
     */
    readonly source?: pulumi.Input<string>;
    /**
     * Tags to add to the alerts original tags value as a list of strings. If ignoreOriginalResponders field is set to true, this will replace the original responders.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Id of team that this policy belongs to.
     */
    readonly teamId?: pulumi.Input<string>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    readonly timeRestrictions?: pulumi.Input<pulumi.Input<inputs.AlertPolicyTimeRestriction>[]>;
}

/**
 * The set of arguments for constructing a AlertPolicy resource.
 */
export interface AlertPolicyArgs {
    /**
     * Actions to add to the alerts original actions value as a list of strings. If ignoreOriginalActions field is set to true, this will replace the original actions.
     */
    readonly actions?: pulumi.Input<pulumi.Input<string>[]>;
    readonly alertDescription?: pulumi.Input<string>;
    /**
     * Alias of the alert. You can use {{alias}} to refer to the original alias. Default value is {{alias}}
     */
    readonly alias?: pulumi.Input<string>;
    readonly continuePolicy?: pulumi.Input<boolean>;
    /**
     * If policy should be enabled. Default: true
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * Entity field of the alert. You can use {{entity}} to refer to the original entity. Default value is {{entity}}
     */
    readonly entity?: pulumi.Input<string>;
    /**
     * A alert filter which will be applied. This filter can be empty: filter {} - this means 'match-all'. This is a block, structure is documented below.
     */
    readonly filters?: pulumi.Input<pulumi.Input<inputs.AlertPolicyFilter>[]>;
    /**
     * If set to true, policy will ignore the original actions of the alert. Default value is false
     */
    readonly ignoreOriginalActions?: pulumi.Input<boolean>;
    /**
     * If set to true, policy will ignore the original details of the alert. Default value is false
     */
    readonly ignoreOriginalDetails?: pulumi.Input<boolean>;
    /**
     * If set to true, policy will ignore the original responders of the alert. Default value is false
     */
    readonly ignoreOriginalResponders?: pulumi.Input<boolean>;
    /**
     * If set to true, policy will ignore the original tags of the alert. Default value is false
     */
    readonly ignoreOriginalTags?: pulumi.Input<boolean>;
    /**
     * Message of the alerts
     */
    readonly message: pulumi.Input<string>;
    /**
     * Name of the responder
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    readonly policyDescription?: pulumi.Input<string>;
    /**
     * Priority of the alert. Should be one of P1, P2, P3, P4, or P5
     */
    readonly priority?: pulumi.Input<string>;
    /**
     * Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If ignoreOriginalResponders field is set to true, this will replace the original responders. The possible values for responders are: user, team. This is a block, structure is documented below.
     */
    readonly responders?: pulumi.Input<pulumi.Input<inputs.AlertPolicyResponder>[]>;
    /**
     * Source field of the alert. You can use {{source}} to refer to the original source. Default value is {{source}}
     */
    readonly source?: pulumi.Input<string>;
    /**
     * Tags to add to the alerts original tags value as a list of strings. If ignoreOriginalResponders field is set to true, this will replace the original responders.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Id of team that this policy belongs to.
     */
    readonly teamId?: pulumi.Input<string>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    readonly timeRestrictions?: pulumi.Input<pulumi.Input<inputs.AlertPolicyTimeRestriction>[]>;
}
