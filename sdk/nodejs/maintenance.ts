// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Maintenance within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = new opsgenie.Maintenance("test", {
 *     description: "geniemaintenance-%s",
 *     rules: [{
 *         entities: [{
 *             id: opsgenie_email_integration.test.id,
 *             type: "integration",
 *         }],
 *         state: "enabled",
 *     }],
 *     times: [{
 *         endDate: "2019-06-%dT17:50:00Z",
 *         startDate: "2019-06-20T17:45:00Z",
 *         type: "schedule",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Maintenance policies can be imported using the `policy_id`, e.g.
 *
 * ```sh
 *  $ pulumi import opsgenie:index/maintenance:Maintenance test policy_id`
 * ```
 */
export class Maintenance extends pulumi.CustomResource {
    /**
     * Get an existing Maintenance resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: MaintenanceState, opts?: pulumi.CustomResourceOptions): Maintenance {
        return new Maintenance(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/maintenance:Maintenance';

    /**
     * Returns true if the given object is an instance of Maintenance.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Maintenance {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Maintenance.__pulumiType;
    }

    /**
     * Description for the maintenance.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
     */
    public readonly rules!: pulumi.Output<outputs.MaintenanceRule[]>;
    /**
     * Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
     */
    public readonly times!: pulumi.Output<outputs.MaintenanceTime[] | undefined>;

    /**
     * Create a Maintenance resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: MaintenanceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: MaintenanceArgs | MaintenanceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as MaintenanceState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["rules"] = state ? state.rules : undefined;
            resourceInputs["times"] = state ? state.times : undefined;
        } else {
            const args = argsOrState as MaintenanceArgs | undefined;
            if ((!args || args.description === undefined) && !opts.urn) {
                throw new Error("Missing required property 'description'");
            }
            if ((!args || args.rules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rules'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["rules"] = args ? args.rules : undefined;
            resourceInputs["times"] = args ? args.times : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Maintenance.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Maintenance resources.
 */
export interface MaintenanceState {
    /**
     * Description for the maintenance.
     */
    description?: pulumi.Input<string>;
    /**
     * Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
     */
    rules?: pulumi.Input<pulumi.Input<inputs.MaintenanceRule>[]>;
    /**
     * Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
     */
    times?: pulumi.Input<pulumi.Input<inputs.MaintenanceTime>[]>;
}

/**
 * The set of arguments for constructing a Maintenance resource.
 */
export interface MaintenanceArgs {
    /**
     * Description for the maintenance.
     */
    description: pulumi.Input<string>;
    /**
     * Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
     */
    rules: pulumi.Input<pulumi.Input<inputs.MaintenanceRule>[]>;
    /**
     * Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
     */
    times?: pulumi.Input<pulumi.Input<inputs.MaintenanceTime>[]>;
}
