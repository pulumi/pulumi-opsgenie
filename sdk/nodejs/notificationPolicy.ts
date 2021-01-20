// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Manages a Notification Policy within Opsgenie.
 *
 * ## Import
 *
 * Notification policies can be imported using the `team id` and `id`, e.g.
 *
 * ```sh
 *  $ pulumi import opsgenie:index/notificationPolicy:NotificationPolicy test teamId/Id`
 * ```
 *
 *  For this example- Team Id = `c827c472-31f2-497b-9ec6-8ec855d7d94c`
 *
 * - Notification Policy Id = `2d1a78d0-c13e-47d3-af0a-8b6d0cc2b7b1`
 *
 * ```sh
 *  $ pulumi import opsgenie:index/notificationPolicy:NotificationPolicy test c827c472-31f2-497b-9ec6-8ec855d7d94c/2d1a78d0-c13e-47d3-af0a-8b6d0cc2b7b1`
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
     * If policy should be enabled. Default: true
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * A notification filter which will be applied. This filter can be empty: filter {} - this means 'match-all'. This is a block, structure is documented below.
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
     * Suppress value of the policy. Values are: true, false. Default: false
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as NotificationPolicyState | undefined;
            inputs["autoCloseActions"] = state ? state.autoCloseActions : undefined;
            inputs["autoRestartActions"] = state ? state.autoRestartActions : undefined;
            inputs["deDuplicationActions"] = state ? state.deDuplicationActions : undefined;
            inputs["delayActions"] = state ? state.delayActions : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["filters"] = state ? state.filters : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["policyDescription"] = state ? state.policyDescription : undefined;
            inputs["suppress"] = state ? state.suppress : undefined;
            inputs["teamId"] = state ? state.teamId : undefined;
            inputs["timeRestrictions"] = state ? state.timeRestrictions : undefined;
        } else {
            const args = argsOrState as NotificationPolicyArgs | undefined;
            if ((!args || args.filters === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'filters'");
            }
            if ((!args || args.teamId === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'teamId'");
            }
            inputs["autoCloseActions"] = args ? args.autoCloseActions : undefined;
            inputs["autoRestartActions"] = args ? args.autoRestartActions : undefined;
            inputs["deDuplicationActions"] = args ? args.deDuplicationActions : undefined;
            inputs["delayActions"] = args ? args.delayActions : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["filters"] = args ? args.filters : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["policyDescription"] = args ? args.policyDescription : undefined;
            inputs["suppress"] = args ? args.suppress : undefined;
            inputs["teamId"] = args ? args.teamId : undefined;
            inputs["timeRestrictions"] = args ? args.timeRestrictions : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(NotificationPolicy.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NotificationPolicy resources.
 */
export interface NotificationPolicyState {
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    readonly autoCloseActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoCloseAction>[]>;
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    readonly autoRestartActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoRestartAction>[]>;
    /**
     * Deduplication Action of the policy. This is a block, structure is documented below.
     */
    readonly deDuplicationActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDeDuplicationAction>[]>;
    /**
     * Delay notifications. This is a block, structure is documented below.
     */
    readonly delayActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDelayAction>[]>;
    /**
     * If policy should be enabled. Default: true
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * A notification filter which will be applied. This filter can be empty: filter {} - this means 'match-all'. This is a block, structure is documented below.
     */
    readonly filters?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyFilter>[]>;
    /**
     * Name of the notification policy
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    readonly policyDescription?: pulumi.Input<string>;
    /**
     * Suppress value of the policy. Values are: true, false. Default: false
     */
    readonly suppress?: pulumi.Input<boolean>;
    /**
     * Id of team that this policy belons to.
     */
    readonly teamId?: pulumi.Input<string>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    readonly timeRestrictions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyTimeRestriction>[]>;
}

/**
 * The set of arguments for constructing a NotificationPolicy resource.
 */
export interface NotificationPolicyArgs {
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    readonly autoCloseActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoCloseAction>[]>;
    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     */
    readonly autoRestartActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoRestartAction>[]>;
    /**
     * Deduplication Action of the policy. This is a block, structure is documented below.
     */
    readonly deDuplicationActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDeDuplicationAction>[]>;
    /**
     * Delay notifications. This is a block, structure is documented below.
     */
    readonly delayActions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDelayAction>[]>;
    /**
     * If policy should be enabled. Default: true
     */
    readonly enabled?: pulumi.Input<boolean>;
    /**
     * A notification filter which will be applied. This filter can be empty: filter {} - this means 'match-all'. This is a block, structure is documented below.
     */
    readonly filters: pulumi.Input<pulumi.Input<inputs.NotificationPolicyFilter>[]>;
    /**
     * Name of the notification policy
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Description of the policy. This can be max 512 characters.
     */
    readonly policyDescription?: pulumi.Input<string>;
    /**
     * Suppress value of the policy. Values are: true, false. Default: false
     */
    readonly suppress?: pulumi.Input<boolean>;
    /**
     * Id of team that this policy belons to.
     */
    readonly teamId: pulumi.Input<string>;
    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     */
    readonly timeRestrictions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyTimeRestriction>[]>;
}