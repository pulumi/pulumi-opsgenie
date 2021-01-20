// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Manages a Schedule Rotation within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = new opsgenie.ScheduleRotation("test", {
 *     endDate: "2019-06-20T17:30:00Z",
 *     length: 6,
 *     participants: [{
 *         id: opsgenie_user_test.id,
 *         type: "user",
 *     }],
 *     scheduleId: opsgenie_schedule_test.id,
 *     startDate: "2019-06-18T17:00:00Z",
 *     timeRestrictions: [{
 *         restrictions: [{
 *             endHour: 10,
 *             endMin: 1,
 *             startHour: 1,
 *             startMin: 1,
 *         }],
 *         type: "time-of-day",
 *     }],
 *     type: "hourly",
 * });
 * ```
 *
 * ## Import
 *
 * Schedule Rotations can be imported using the `id` and `schedule_id`, e.g.
 *
 * ```sh
 *  $ pulumi import opsgenie:index/scheduleRotation:ScheduleRotation * `opsgenie_schedule_rotation.test schedule_id/id`
 * ```
 *
 *  For this example- Schedule Id = `c827c472-31f2-497b-9ec6-8ec855d7d94c`
 *
 * - Rotation Id = `2d1a78d0-c13e-47d3-af0a-8b6d0cc2b7b1`
 *
 * ```sh
 *  $ pulumi import opsgenie:index/scheduleRotation:ScheduleRotation test c827c472-31f2-497b-9ec6-8ec855d7d94c/2d1a78d0-c13e-47d3-af0a-8b6d0cc2b7b1`
 * ```
 */
export class ScheduleRotation extends pulumi.CustomResource {
    /**
     * Get an existing ScheduleRotation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScheduleRotationState, opts?: pulumi.CustomResourceOptions): ScheduleRotation {
        return new ScheduleRotation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/scheduleRotation:ScheduleRotation';

    /**
     * Returns true if the given object is an instance of ScheduleRotation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ScheduleRotation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ScheduleRotation.__pulumiType;
    }

    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     */
    public readonly endDate!: pulumi.Output<string | undefined>;
    /**
     * Length of the rotation with default value 1.
     */
    public readonly length!: pulumi.Output<number | undefined>;
    /**
     * Name of rotation.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
     */
    public readonly participants!: pulumi.Output<outputs.ScheduleRotationParticipant[]>;
    /**
     * Identifier of the schedule.
     */
    public readonly scheduleId!: pulumi.Output<string>;
    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     */
    public readonly startDate!: pulumi.Output<string>;
    public readonly timeRestrictions!: pulumi.Output<outputs.ScheduleRotationTimeRestriction[] | undefined>;
    /**
     * Type of rotation. May be one of daily, weekly and hourly.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ScheduleRotation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ScheduleRotationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScheduleRotationArgs | ScheduleRotationState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ScheduleRotationState | undefined;
            inputs["endDate"] = state ? state.endDate : undefined;
            inputs["length"] = state ? state.length : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["participants"] = state ? state.participants : undefined;
            inputs["scheduleId"] = state ? state.scheduleId : undefined;
            inputs["startDate"] = state ? state.startDate : undefined;
            inputs["timeRestrictions"] = state ? state.timeRestrictions : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ScheduleRotationArgs | undefined;
            if ((!args || args.participants === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'participants'");
            }
            if ((!args || args.scheduleId === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'scheduleId'");
            }
            if ((!args || args.startDate === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'startDate'");
            }
            if ((!args || args.type === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'type'");
            }
            inputs["endDate"] = args ? args.endDate : undefined;
            inputs["length"] = args ? args.length : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["participants"] = args ? args.participants : undefined;
            inputs["scheduleId"] = args ? args.scheduleId : undefined;
            inputs["startDate"] = args ? args.startDate : undefined;
            inputs["timeRestrictions"] = args ? args.timeRestrictions : undefined;
            inputs["type"] = args ? args.type : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ScheduleRotation.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ScheduleRotation resources.
 */
export interface ScheduleRotationState {
    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     */
    readonly endDate?: pulumi.Input<string>;
    /**
     * Length of the rotation with default value 1.
     */
    readonly length?: pulumi.Input<number>;
    /**
     * Name of rotation.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
     */
    readonly participants?: pulumi.Input<pulumi.Input<inputs.ScheduleRotationParticipant>[]>;
    /**
     * Identifier of the schedule.
     */
    readonly scheduleId?: pulumi.Input<string>;
    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     */
    readonly startDate?: pulumi.Input<string>;
    readonly timeRestrictions?: pulumi.Input<pulumi.Input<inputs.ScheduleRotationTimeRestriction>[]>;
    /**
     * Type of rotation. May be one of daily, weekly and hourly.
     */
    readonly type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ScheduleRotation resource.
 */
export interface ScheduleRotationArgs {
    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     */
    readonly endDate?: pulumi.Input<string>;
    /**
     * Length of the rotation with default value 1.
     */
    readonly length?: pulumi.Input<number>;
    /**
     * Name of rotation.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
     */
    readonly participants: pulumi.Input<pulumi.Input<inputs.ScheduleRotationParticipant>[]>;
    /**
     * Identifier of the schedule.
     */
    readonly scheduleId: pulumi.Input<string>;
    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     */
    readonly startDate: pulumi.Input<string>;
    readonly timeRestrictions?: pulumi.Input<pulumi.Input<inputs.ScheduleRotationTimeRestriction>[]>;
    /**
     * Type of rotation. May be one of daily, weekly and hourly.
     */
    readonly type: pulumi.Input<string>;
}
