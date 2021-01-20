// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages custom user roles within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = new opsgenie.CustomRole("test", {
 *     disallowedRights: [
 *         "profile-edit",
 *         "contacts-edit",
 *     ],
 *     extendedRole: "user",
 *     grantedRights: ["alert-delete"],
 *     roleName: "genierole",
 * });
 * ```
 */
export class CustomRole extends pulumi.CustomResource {
    /**
     * Get an existing CustomRole resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CustomRoleState, opts?: pulumi.CustomResourceOptions): CustomRole {
        return new CustomRole(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/customRole:CustomRole';

    /**
     * Returns true if the given object is an instance of CustomRole.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CustomRole {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CustomRole.__pulumiType;
    }

    /**
     * The rights this role cannot have. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
     */
    public readonly disallowedRights!: pulumi.Output<string[] | undefined>;
    /**
     * The role from which this role has been derived. Allowed Values: "user", "observer", "stakeholder".
     */
    public readonly extendedRole!: pulumi.Output<string | undefined>;
    /**
     * The rights granted to this role. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
     */
    public readonly grantedRights!: pulumi.Output<string[] | undefined>;
    /**
     * Name of the custom role.
     */
    public readonly roleName!: pulumi.Output<string>;

    /**
     * Create a CustomRole resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CustomRoleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CustomRoleArgs | CustomRoleState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as CustomRoleState | undefined;
            inputs["disallowedRights"] = state ? state.disallowedRights : undefined;
            inputs["extendedRole"] = state ? state.extendedRole : undefined;
            inputs["grantedRights"] = state ? state.grantedRights : undefined;
            inputs["roleName"] = state ? state.roleName : undefined;
        } else {
            const args = argsOrState as CustomRoleArgs | undefined;
            if ((!args || args.roleName === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'roleName'");
            }
            inputs["disallowedRights"] = args ? args.disallowedRights : undefined;
            inputs["extendedRole"] = args ? args.extendedRole : undefined;
            inputs["grantedRights"] = args ? args.grantedRights : undefined;
            inputs["roleName"] = args ? args.roleName : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(CustomRole.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CustomRole resources.
 */
export interface CustomRoleState {
    /**
     * The rights this role cannot have. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
     */
    readonly disallowedRights?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The role from which this role has been derived. Allowed Values: "user", "observer", "stakeholder".
     */
    readonly extendedRole?: pulumi.Input<string>;
    /**
     * The rights granted to this role. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
     */
    readonly grantedRights?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the custom role.
     */
    readonly roleName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a CustomRole resource.
 */
export interface CustomRoleArgs {
    /**
     * The rights this role cannot have. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
     */
    readonly disallowedRights?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The role from which this role has been derived. Allowed Values: "user", "observer", "stakeholder".
     */
    readonly extendedRole?: pulumi.Input<string>;
    /**
     * The rights granted to this role. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
     */
    readonly grantedRights?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Name of the custom role.
     */
    readonly roleName: pulumi.Input<string>;
}
