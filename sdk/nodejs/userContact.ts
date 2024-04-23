// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Manages a User Contact.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const sms = new opsgenie.UserContact("sms", {
 *     username: exampleuser.username,
 *     to: "39-123",
 *     method: "sms",
 * });
 * const email = new opsgenie.UserContact("email", {
 *     username: exampleuser.username,
 *     to: "fahri@opsgenie.com",
 *     method: "email",
 * });
 * const voice = new opsgenie.UserContact("voice", {
 *     username: exampleuser.username,
 *     to: "39-123",
 *     method: "voice",
 * });
 * ```
 *
 * ## Import
 *
 * Users can be imported using the `username/contact_id`, e.g.
 *
 * ```sh
 * $ pulumi import opsgenie:index/userContact:UserContact testcontact username/contact_id`
 * ```
 */
export class UserContact extends pulumi.CustomResource {
    /**
     * Get an existing UserContact resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: UserContactState, opts?: pulumi.CustomResourceOptions): UserContact {
        return new UserContact(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/userContact:UserContact';

    /**
     * Returns true if the given object is an instance of UserContact.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is UserContact {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === UserContact.__pulumiType;
    }

    /**
     * Enable contact of the user in OpsGenie. Default value is true.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
     */
    public readonly method!: pulumi.Output<string>;
    /**
     * to field is the address of given method.
     */
    public readonly to!: pulumi.Output<string>;
    /**
     * The username for contact.(reference)
     */
    public readonly username!: pulumi.Output<string>;

    /**
     * Create a UserContact resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: UserContactArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: UserContactArgs | UserContactState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as UserContactState | undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["method"] = state ? state.method : undefined;
            resourceInputs["to"] = state ? state.to : undefined;
            resourceInputs["username"] = state ? state.username : undefined;
        } else {
            const args = argsOrState as UserContactArgs | undefined;
            if ((!args || args.method === undefined) && !opts.urn) {
                throw new Error("Missing required property 'method'");
            }
            if ((!args || args.to === undefined) && !opts.urn) {
                throw new Error("Missing required property 'to'");
            }
            if ((!args || args.username === undefined) && !opts.urn) {
                throw new Error("Missing required property 'username'");
            }
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["method"] = args ? args.method : undefined;
            resourceInputs["to"] = args ? args.to : undefined;
            resourceInputs["username"] = args ? args.username : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(UserContact.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering UserContact resources.
 */
export interface UserContactState {
    /**
     * Enable contact of the user in OpsGenie. Default value is true.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
     */
    method?: pulumi.Input<string>;
    /**
     * to field is the address of given method.
     */
    to?: pulumi.Input<string>;
    /**
     * The username for contact.(reference)
     */
    username?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a UserContact resource.
 */
export interface UserContactArgs {
    /**
     * Enable contact of the user in OpsGenie. Default value is true.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
     */
    method: pulumi.Input<string>;
    /**
     * to field is the address of given method.
     */
    to: pulumi.Input<string>;
    /**
     * The username for contact.(reference)
     */
    username: pulumi.Input<string>;
}
