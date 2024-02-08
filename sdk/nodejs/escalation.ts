// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages an Escalation within Opsgenie.
 *
 * ## Example Usage
 *
 * An escalation with a single rule
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const _default = new opsgenie.Escalation("default", {rules: [{
 *     condition: "if-not-acked",
 *     notifyType: "default",
 *     delay: 1,
 *     recipients: [{
 *         type: "user",
 *         id: opsgenie_user.test.id,
 *     }],
 * }]});
 * ```
 *
 * An escalation with a multiple rules
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const _default = new opsgenie.Escalation("default", {
 *     description: "test",
 *     ownerTeamId: opsgenie_team.test.id,
 *     rules: [
 *         {
 *             condition: "if-not-acked",
 *             notifyType: "default",
 *             delay: 1,
 *             recipients: [{
 *                 type: "user",
 *                 id: opsgenie_user.test.id,
 *             }],
 *         },
 *         {
 *             condition: "if-not-acked",
 *             notifyType: "default",
 *             delay: 1,
 *             recipients: [{
 *                 type: "team",
 *                 id: opsgenie_team.test.id,
 *             }],
 *         },
 *         {
 *             condition: "if-not-acked",
 *             notifyType: "default",
 *             delay: 1,
 *             recipients: [{
 *                 type: "schedule",
 *                 id: opsgenie_schedule.test.id,
 *             }],
 *         },
 *     ],
 *     repeats: [{
 *         waitInterval: 10,
 *         count: 1,
 *         resetRecipientStates: true,
 *         closeAlertAfterAll: false,
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Escalations can be imported using the `escalation_id`, e.g.
 *
 * ```sh
 * $ pulumi import opsgenie:index/escalation:Escalation test escalation_id`
 * ```
 */
export class Escalation extends pulumi.CustomResource {
    /**
     * Get an existing Escalation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EscalationState, opts?: pulumi.CustomResourceOptions): Escalation {
        return new Escalation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/escalation:Escalation';

    /**
     * Returns true if the given object is an instance of Escalation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Escalation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Escalation.__pulumiType;
    }

    /**
     * Description of the escalation.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the escalation.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Owner team id of the escalation.
     */
    public readonly ownerTeamId!: pulumi.Output<string | undefined>;
    /**
     * Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
     */
    public readonly repeats!: pulumi.Output<outputs.EscalationRepeat[] | undefined>;
    /**
     * List of the escalation rules. See below for how rules are defined.
     */
    public readonly rules!: pulumi.Output<outputs.EscalationRule[]>;

    /**
     * Create a Escalation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EscalationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EscalationArgs | EscalationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EscalationState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerTeamId"] = state ? state.ownerTeamId : undefined;
            resourceInputs["repeats"] = state ? state.repeats : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
        } else {
            const args = argsOrState as EscalationArgs | undefined;
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ownerTeamId"] = args ? args.ownerTeamId : undefined;
            resourceInputs["repeats"] = args ? args.repeats : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Escalation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Escalation resources.
 */
export interface EscalationState {
    /**
     * Description of the escalation.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the escalation.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner team id of the escalation.
     */
    ownerTeamId?: pulumi.Input<string>;
    /**
     * Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
     */
    repeats?: pulumi.Input<pulumi.Input<inputs.EscalationRepeat>[]>;
    /**
     * List of the escalation rules. See below for how rules are defined.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.EscalationRule>[]>;
}

/**
 * The set of arguments for constructing a Escalation resource.
 */
export interface EscalationArgs {
    /**
     * Description of the escalation.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the escalation.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner team id of the escalation.
     */
    ownerTeamId?: pulumi.Input<string>;
    /**
     * Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
     */
    repeats?: pulumi.Input<pulumi.Input<inputs.EscalationRepeat>[]>;
    /**
     * List of the escalation rules. See below for how rules are defined.
     */
    rules: pulumi.Input<pulumi.Input<inputs.EscalationRule>[]>;
}
