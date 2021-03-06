// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Manages existing Team within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const sre_team = pulumi.output(opsgenie.getTeam({
 *     name: "sre-team",
 * }, { async: true }));
 * ```
 */
export function getTeam(args: GetTeamArgs, opts?: pulumi.InvokeOptions): Promise<GetTeamResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("opsgenie:index/getTeam:getTeam", {
        "description": args.description,
        "members": args.members,
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getTeam.
 */
export interface GetTeamArgs {
    /**
     * A description for this team.
     */
    readonly description?: string;
    /**
     * A Member block as documented below.
     */
    readonly members?: inputs.GetTeamMember[];
    /**
     * The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getTeam.
 */
export interface GetTeamResult {
    readonly description?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly members?: outputs.GetTeamMember[];
    readonly name: string;
}
