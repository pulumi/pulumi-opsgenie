// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

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
 */
export class NotificationPolicy extends pulumi.CustomResource {
    /**
     * Get an existing NotificationPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NotificationPolicyState, opts?: pulumi.CustomResourceOptions): NotificationPolicy {
        return new NotificationPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/notificationPolicy:NotificationPolicy';

    /**
     * Returns true if the given object is an instance of NotificationPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NotificationPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NotificationPolicy.__pulumiType;
    }

    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    public readonly autoCloseActions!: pulumi.Output<outputs.NotificationPolicyAutoCloseAction[] | undefined>;
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    public readonly autoRestartActions!: pulumi.Output<outputs.NotificationPolicyAutoRestartAction[] | undefined>;
    /**
     * Deduplication Action of the policy. This is a block, structure is documented below.
     */
    public readonly deDuplicationActions!: pulumi.Output<outputs.NotificationPolicyDeDuplicationAction[] | undefined>;
    /**
     * Delay notifications. This is a block, structure is documented below.
     */
    public readonly delayActions!: pulumi.Output<outputs.NotificationPolicyDelayAction[] | undefined>;
    /**
     * If policy should be enabled. Default: `true`
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     */
    public readonly filters!: pulumi.Output<outputs.NotificationPolicyFilter[]>;
    /**
     * Name of the notification policy
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    public readonly policyDescription!: pulumi.Output<string | undefined>;
    /**
     * Suppress value of the policy. Values are: `true`, `false`. Default: `false`
     */
    public readonly suppress!: pulumi.Output<boolean | undefined>;
    /**
     * Id of team that this policy belons to.
     */
    public readonly teamId!: pulumi.Output<string>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    public readonly timeRestrictions!: pulumi.Output<outputs.NotificationPolicyTimeRestriction[] | undefined>;

    /**
     * Create a NotificationPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NotificationPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NotificationPolicyArgs | NotificationPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NotificationPolicyState | undefined;
            resourceInputs["autoCloseActions"] = state ? state.autoCloseActions : undefined;
            resourceInputs["autoRestartActions"] = state ? state.autoRestartActions : undefined;
            resourceInputs["deDuplicationActions"] = state ? state.deDuplicationActions : undefined;
            resourceInputs["delayActions"] = state ? state.delayActions : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["filters"] = state ? state.filters : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyDescription"] = state ? state.policyDescription : undefined;
            resourceInputs["suppress"] = state ? state.suppress : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
            resourceInputs["timeRestrictions"] = state ? state.timeRestrictions : undefined;
        } else {
            const args = argsOrState as NotificationPolicyArgs | undefined;
            if ((!args || args.filters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'filters'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            if ((!args || args.teamId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'teamId'");
            }
            resourceInputs["autoCloseActions"] = args ? args.autoCloseActions : undefined;
            resourceInputs["autoRestartActions"] = args ? args.autoRestartActions : undefined;
            resourceInputs["deDuplicationActions"] = args ? args.deDuplicationActions : undefined;
            resourceInputs["delayActions"] = args ? args.delayActions : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["filters"] = args ? args.filters : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyDescription"] = args ? args.policyDescription : undefined;
            resourceInputs["suppress"] = args ? args.suppress : undefined;
            resourceInputs["teamId"] = args ? args.teamId : undefined;
            resourceInputs["timeRestrictions"] = args ? args.timeRestrictions : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NotificationPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NotificationPolicy resources.
 */
export interface NotificationPolicyState {
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    autoCloseActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoCloseAction>[]>;
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    autoRestartActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoRestartAction>[]>;
    /**
     * Deduplication Action of the policy. This is a block, structure is documented below.
     */
    deDuplicationActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDeDuplicationAction>[]>;
    /**
     * Delay notifications. This is a block, structure is documented below.
     */
    delayActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDelayAction>[]>;
    /**
     * If policy should be enabled. Default: `true`
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     */
    filters?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyFilter>[]>;
    /**
     * Name of the notification policy
     */
    name?: pulumi.Input<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    policyDescription?: pulumi.Input<string>;
    /**
     * Suppress value of the policy. Values are: `true`, `false`. Default: `false`
     */
    suppress?: pulumi.Input<boolean>;
    /**
     * Id of team that this policy belons to.
     */
    teamId?: pulumi.Input<string>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    timeRestrictions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyTimeRestriction>[]>;
}

/**
 * The set of arguments for constructing a NotificationPolicy resource.
 */
export interface NotificationPolicyArgs {
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    autoCloseActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoCloseAction>[]>;
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    autoRestartActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoRestartAction>[]>;
    /**
     * Deduplication Action of the policy. This is a block, structure is documented below.
     */
    deDuplicationActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDeDuplicationAction>[]>;
    /**
     * Delay notifications. This is a block, structure is documented below.
     */
    delayActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDelayAction>[]>;
    /**
     * If policy should be enabled. Default: `true`
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     */
    filters: pulumi.Input<pulumi.Input<inputs.NotificationPolicyFilter>[]>;
    /**
     * Name of the notification policy
     */
    name: pulumi.Input<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    policyDescription?: pulumi.Input<string>;
    /**
     * Suppress value of the policy. Values are: `true`, `false`. Default: `false`
     */
    suppress?: pulumi.Input<boolean>;
    /**
     * Id of team that this policy belons to.
     */
    teamId: pulumi.Input<string>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    timeRestrictions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyTimeRestriction>[]>;
}
