// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages existing heartbeat within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = opsgenie.getHeartbeat({
 *     name: "genieheartbeat-existing",
 * });
 * ```
 */
export function getHeartbeat(args: GetHeartbeatArgs, opts?: pulumi.InvokeOptions): Promise<GetHeartbeatResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("opsgenie:index/getHeartbeat:getHeartbeat", {
        "alertMessage": args.alertMessage,
        "alertPriority": args.alertPriority,
        "alertTags": args.alertTags,
        "description": args.description,
        "enabled": args.enabled,
        "interval": args.interval,
        "intervalUnit": args.intervalUnit,
        "name": args.name,
        "ownerTeamId": args.ownerTeamId,
    }, opts);
}

/**
 * A collection of arguments for invoking getHeartbeat.
 */
export interface GetHeartbeatArgs {
    /**
     * Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
     */
    alertMessage?: string;
    /**
     * Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     */
    alertPriority?: string;
    /**
     * Specifies the alert tags for heartbeat expiration alert.
     */
    alertTags?: string[];
    /**
     * An optional description of the heartbeat
     */
    description?: string;
    /**
     * Enable/disable heartbeat monitoring.
     */
    enabled?: boolean;
    /**
     * Specifies how often a heartbeat message should be expected.
     */
    interval?: number;
    /**
     * Interval specified as minutes, hours or days.
     */
    intervalUnit?: string;
    /**
     * Name of the heartbeat
     */
    name: string;
    /**
     * Owner team of the heartbeat.
     */
    ownerTeamId?: string;
}

/**
 * A collection of values returned by getHeartbeat.
 */
export interface GetHeartbeatResult {
    /**
     * Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
     */
    readonly alertMessage?: string;
    /**
     * Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     */
    readonly alertPriority?: string;
    /**
     * Specifies the alert tags for heartbeat expiration alert.
     */
    readonly alertTags?: string[];
    /**
     * An optional description of the heartbeat
     */
    readonly description?: string;
    /**
     * Enable/disable heartbeat monitoring.
     */
    readonly enabled?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Specifies how often a heartbeat message should be expected.
     */
    readonly interval?: number;
    /**
     * Interval specified as minutes, hours or days.
     */
    readonly intervalUnit?: string;
    readonly name: string;
    /**
     * Owner team of the heartbeat.
     */
    readonly ownerTeamId?: string;
}
/**
 * Manages existing heartbeat within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = opsgenie.getHeartbeat({
 *     name: "genieheartbeat-existing",
 * });
 * ```
 */
export function getHeartbeatOutput(args: GetHeartbeatOutputArgs, opts?: pulumi.InvokeOutputOptions): pulumi.Output<GetHeartbeatResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("opsgenie:index/getHeartbeat:getHeartbeat", {
        "alertMessage": args.alertMessage,
        "alertPriority": args.alertPriority,
        "alertTags": args.alertTags,
        "description": args.description,
        "enabled": args.enabled,
        "interval": args.interval,
        "intervalUnit": args.intervalUnit,
        "name": args.name,
        "ownerTeamId": args.ownerTeamId,
    }, opts);
}

/**
 * A collection of arguments for invoking getHeartbeat.
 */
export interface GetHeartbeatOutputArgs {
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
    name: pulumi.Input<string>;
    /**
     * Owner team of the heartbeat.
     */
    ownerTeamId?: pulumi.Input<string>;
}
