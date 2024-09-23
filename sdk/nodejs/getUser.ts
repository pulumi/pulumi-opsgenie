// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages existing User within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = opsgenie.getUser({
 *     username: "user@domain.com",
 * });
 * ```
 */
export function getUser(args: GetUserArgs, opts?: pulumi.InvokeOptions): Promise<GetUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("opsgenie:index/getUser:getUser", {
        "fullName": args.fullName,
        "locale": args.locale,
        "role": args.role,
        "timezone": args.timezone,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserArgs {
    /**
     * The Full Name of the User.
     */
    fullName?: string;
    /**
     * Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
     */
    locale?: string;
    /**
     * The Role assigned to the User. Either a built-in such as 'Owner', 'Admin' or 'User' - or the name of a custom role.
     */
    role?: string;
    /**
     * Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
     */
    timezone?: string;
    /**
     * The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters.
     */
    username: string;
}

/**
 * A collection of values returned by getUser.
 */
export interface GetUserResult {
    /**
     * The Full Name of the User.
     */
    readonly fullName?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
     */
    readonly locale?: string;
    /**
     * The Role assigned to the User. Either a built-in such as 'Owner', 'Admin' or 'User' - or the name of a custom role.
     */
    readonly role?: string;
    /**
     * Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
     */
    readonly timezone?: string;
    readonly username: string;
}
/**
 * Manages existing User within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = opsgenie.getUser({
 *     username: "user@domain.com",
 * });
 * ```
 */
export function getUserOutput(args: GetUserOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUserResult> {
    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invokeOutput("opsgenie:index/getUser:getUser", {
        "fullName": args.fullName,
        "locale": args.locale,
        "role": args.role,
        "timezone": args.timezone,
        "username": args.username,
    }, opts);
}

/**
 * A collection of arguments for invoking getUser.
 */
export interface GetUserOutputArgs {
    /**
     * The Full Name of the User.
     */
    fullName?: pulumi.Input<string>;
    /**
     * Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
     */
    locale?: pulumi.Input<string>;
    /**
     * The Role assigned to the User. Either a built-in such as 'Owner', 'Admin' or 'User' - or the name of a custom role.
     */
    role?: pulumi.Input<string>;
    /**
     * Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
     */
    timezone?: pulumi.Input<string>;
    /**
     * The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters.
     */
    username: pulumi.Input<string>;
}
