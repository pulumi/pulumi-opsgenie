// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Manages a Schedule within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = pulumi.output(opsgenie.getSchedule({
 *     name: "sre-team schedule",
 * }, { async: true }));
 * ```
 */
export function getSchedule(args: GetScheduleArgs, opts?: pulumi.InvokeOptions): Promise<GetScheduleResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("opsgenie:index/getSchedule:getSchedule", {
        "description": args.description,
        "enabled": args.enabled,
        "name": args.name,
        "ownerTeamId": args.ownerTeamId,
        "timezone": args.timezone,
    }, opts);
}

/**
 * A collection of arguments for invoking getSchedule.
 */
export interface GetScheduleArgs {
    /**
     * Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
     */
    readonly description?: string;
    /**
     * Enable/disable state of schedule
     */
    readonly enabled?: boolean;
    /**
     * Name of the schedule.
     */
    readonly name: string;
    /**
     * Owner team id of the schedule.
     */
    readonly ownerTeamId?: string;
    /**
     * The description of schedule.
     */
    readonly timezone?: string;
}

/**
 * A collection of values returned by getSchedule.
 */
export interface GetScheduleResult {
    /**
     * Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
     */
    readonly description?: string;
    /**
     * Enable/disable state of schedule
     */
    readonly enabled?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly name: string;
    /**
     * Owner team id of the schedule.
     */
    readonly ownerTeamId?: string;
    /**
     * The description of schedule.
     */
    readonly timezone?: string;
}
