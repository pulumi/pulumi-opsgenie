// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a Service within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const payment = new opsgenie.Team("payment", {description: "This team deals with all the things"});
 * const _this = new opsgenie.Service("this", {teamId: "$opsgenie_team.payment.id"});
 * ```
 *
 * ## Import
 *
 * Teams can be imported using the `service_id`, e.g.
 *
 * ```sh
 * $ pulumi import opsgenie:index/service:Service this service_id`
 * ```
 */
export class Service extends pulumi.CustomResource {
    /**
     * Get an existing Service resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceState, opts?: pulumi.CustomResourceOptions): Service {
        return new Service(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/service:Service';

    /**
     * Returns true if the given object is an instance of Service.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Service {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Service.__pulumiType;
    }

    /**
     * Description field of the service that is generally used to provide a detailed information about the service.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the service. This field must not be longer than 100 characters.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Tags for the service, with a maximum of 20 tags per service.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Team id of the service. This field must not be longer than 512 characters.
     */
    public readonly teamId!: pulumi.Output<string>;

    /**
     * Create a Service resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceArgs | ServiceState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["teamId"] = state ? state.teamId : undefined;
        } else {
            const args = argsOrState as ServiceArgs | undefined;
            if ((!args || args.teamId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'teamId'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["teamId"] = args ? args.teamId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Service.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Service resources.
 */
export interface ServiceState {
    /**
     * Description field of the service that is generally used to provide a detailed information about the service.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the service. This field must not be longer than 100 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Tags for the service, with a maximum of 20 tags per service.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Team id of the service. This field must not be longer than 512 characters.
     */
    teamId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Service resource.
 */
export interface ServiceArgs {
    /**
     * Description field of the service that is generally used to provide a detailed information about the service.
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the service. This field must not be longer than 100 characters.
     */
    name?: pulumi.Input<string>;
    /**
     * Tags for the service, with a maximum of 20 tags per service.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Team id of the service. This field must not be longer than 512 characters.
     */
    teamId: pulumi.Input<string>;
}
