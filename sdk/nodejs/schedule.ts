// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a Schedule within Opsgenie.
 *
 * ## Import
 *
 * Schedule can be imported using the `schedule_id`, e.g.
 *
 * ```sh
 * $ pulumi import opsgenie:index/schedule:Schedule test schedule_id`
 * ```
 */
export class Schedule extends pulumi.CustomResource {
    /**
     * Get an existing Schedule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ScheduleState, opts?: pulumi.CustomResourceOptions): Schedule {
        return new Schedule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/schedule:Schedule';

    /**
     * Returns true if the given object is an instance of Schedule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Schedule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Schedule.__pulumiType;
    }

    /**
     * The description of schedule.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enable/disable state of schedule
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the schedule.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Owner team id of the schedule.
     */
    public readonly ownerTeamId!: pulumi.Output<string | undefined>;
    /**
     * Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
     */
    public readonly timezone!: pulumi.Output<string | undefined>;

    /**
     * Create a Schedule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ScheduleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ScheduleArgs | ScheduleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ScheduleState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerTeamId"] = state ? state.ownerTeamId : undefined;
            resourceInputs["timezone"] = state ? state.timezone : undefined;
        } else {
            const args = argsOrState as ScheduleArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ownerTeamId"] = args ? args.ownerTeamId : undefined;
            resourceInputs["timezone"] = args ? args.timezone : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Schedule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Schedule resources.
 */
export interface ScheduleState {
    /**
     * The description of schedule.
     */
    description?: pulumi.Input<string>;
    /**
     * Enable/disable state of schedule
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of the schedule.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner team id of the schedule.
     */
    ownerTeamId?: pulumi.Input<string>;
    /**
     * Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
     */
    timezone?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Schedule resource.
 */
export interface ScheduleArgs {
    /**
     * The description of schedule.
     */
    description?: pulumi.Input<string>;
    /**
     * Enable/disable state of schedule
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Name of the schedule.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner team id of the schedule.
     */
    ownerTeamId?: pulumi.Input<string>;
    /**
     * Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
     */
    timezone?: pulumi.Input<string>;
}
