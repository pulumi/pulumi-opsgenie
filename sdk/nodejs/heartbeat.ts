// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages heartbeat within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = new opsgenie.Heartbeat("test", {
 *     alertMessage: "Test",
 *     alertPriority: "P3",
 *     alertTags: [
 *         "test",
 *         "fahri",
 *     ],
 *     description: "test opsgenie heartbeat terraform",
 *     enabled: false,
 *     interval: 10,
 *     intervalUnit: "minutes",
 *     name: "genieheartbeat-test",
 *     ownerTeamId: opsgenie_team.test.id,
 * });
 * ```
 *
 * ## Import
 *
 * Heartbeat Integrations can be imported using the `name`, e.g.
 *
 * ```sh
 *  $ pulumi import opsgenie:index/heartbeat:Heartbeat test name`
 * ```
 */
export class Heartbeat extends pulumi.CustomResource {
    /**
     * Get an existing Heartbeat resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HeartbeatState, opts?: pulumi.CustomResourceOptions): Heartbeat {
        return new Heartbeat(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/heartbeat:Heartbeat';

    /**
     * Returns true if the given object is an instance of Heartbeat.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Heartbeat {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Heartbeat.__pulumiType;
    }

    /**
     * Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
     */
    public readonly alertMessage!: pulumi.Output<string | undefined>;
    /**
     * Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     */
    public readonly alertPriority!: pulumi.Output<string | undefined>;
    /**
     * Specifies the alert tags for heartbeat expiration alert.
     */
    public readonly alertTags!: pulumi.Output<string[] | undefined>;
    /**
     * An optional description of the heartbeat
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable/disable heartbeat monitoring.
     */
    public readonly enabled!: pulumi.Output<boolean>;
    /**
     * Specifies how often a heartbeat message should be expected.
     */
    public readonly interval!: pulumi.Output<number>;
    /**
     * Interval specified as minutes, hours or days.
     */
    public readonly intervalUnit!: pulumi.Output<string>;
    /**
     * Name of the heartbeat
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Owner team of the heartbeat.
     */
    public readonly ownerTeamId!: pulumi.Output<string | undefined>;

    /**
     * Create a Heartbeat resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HeartbeatArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HeartbeatArgs | HeartbeatState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HeartbeatState | undefined;
            resourceInputs["alertMessage"] = state ? state.alertMessage : undefined;
            resourceInputs["alertPriority"] = state ? state.alertPriority : undefined;
            resourceInputs["alertTags"] = state ? state.alertTags : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["interval"] = state ? state.interval : undefined;
            resourceInputs["intervalUnit"] = state ? state.intervalUnit : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerTeamId"] = state ? state.ownerTeamId : undefined;
        } else {
            const args = argsOrState as HeartbeatArgs | undefined;
            if ((!args || args.enabled === undefined) && !opts.urn) {
                throw new Error("Missing required property 'enabled'");
            }
            if ((!args || args.interval === undefined) && !opts.urn) {
                throw new Error("Missing required property 'interval'");
            }
            if ((!args || args.intervalUnit === undefined) && !opts.urn) {
                throw new Error("Missing required property 'intervalUnit'");
            }
            if ((!args || args.name === undefined) && !opts.urn) {
                throw new Error("Missing required property 'name'");
            }
            resourceInputs["alertMessage"] = args ? args.alertMessage : undefined;
            resourceInputs["alertPriority"] = args ? args.alertPriority : undefined;
            resourceInputs["alertTags"] = args ? args.alertTags : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["interval"] = args ? args.interval : undefined;
            resourceInputs["intervalUnit"] = args ? args.intervalUnit : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ownerTeamId"] = args ? args.ownerTeamId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Heartbeat.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Heartbeat resources.
 */
export interface HeartbeatState {
    /**
     * Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
     */
    alertMessage?: pulumi.Input<string>;
    /**
     * Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     */
    alertPriority?: pulumi.Input<string>;
    /**
     * Specifies the alert tags for heartbeat expiration alert.
     */
    alertTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An optional description of the heartbeat
     */
    description?: pulumi.Input<string>;
    /**
     * Enable/disable heartbeat monitoring.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies how often a heartbeat message should be expected.
     */
    interval?: pulumi.Input<number>;
    /**
     * Interval specified as minutes, hours or days.
     */
    intervalUnit?: pulumi.Input<string>;
    /**
     * Name of the heartbeat
     */
    name?: pulumi.Input<string>;
    /**
     * Owner team of the heartbeat.
     */
    ownerTeamId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Heartbeat resource.
 */
export interface HeartbeatArgs {
    /**
     * Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
     */
    alertMessage?: pulumi.Input<string>;
    /**
     * Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     */
    alertPriority?: pulumi.Input<string>;
    /**
     * Specifies the alert tags for heartbeat expiration alert.
     */
    alertTags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An optional description of the heartbeat
     */
    description?: pulumi.Input<string>;
    /**
     * Enable/disable heartbeat monitoring.
     */
    enabled: pulumi.Input<boolean>;
    /**
     * Specifies how often a heartbeat message should be expected.
     */
    interval: pulumi.Input<number>;
    /**
     * Interval specified as minutes, hours or days.
     */
    intervalUnit: pulumi.Input<string>;
    /**
     * Name of the heartbeat
     */
    name: pulumi.Input<string>;
    /**
     * Owner team of the heartbeat.
     */
    ownerTeamId?: pulumi.Input<string>;
}
