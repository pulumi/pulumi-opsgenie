// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Team within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const first = new opsgenie.User("first", {
 *     fullName: "name ",
 *     role: "User",
 *     username: "user@domain.com",
 * });
 * const second = new opsgenie.User("second", {
 *     fullName: "name ",
 *     role: "User",
 *     username: "test@domain.com",
 * });
 * const test = new opsgenie.Team("test", {
 *     description: "This team deals with all the things",
 *     members: [
 *         {
 *             id: first.id,
 *             role: "admin",
 *         },
 *         {
 *             id: second.id,
 *             role: "user",
 *         },
 *     ],
 * });
 * const self_service = new opsgenie.Team("self-service", {
 *     deleteDefaultResources: true,
 *     description: "Membership in this team is managed via OpsGenie web UI only",
 *     ignoreMembers: true,
 * });
 * ```
 *
 * ## Import
 *
 * Teams can be imported using the `team_id`, e.g.
 *
 * ```sh
 * $ pulumi import opsgenie:index/team:Team team1 team_id`
 * ```
 */
export class Team extends pulumi.CustomResource {
    /**
     * Get an existing Team resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TeamState, opts?: pulumi.CustomResourceOptions): Team {
        return new Team(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/team:Team';

    /**
     * Returns true if the given object is an instance of Team.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Team {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Team.__pulumiType;
    }

    /**
     * Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
     */
    public readonly deleteDefaultResources!: pulumi.Output<boolean | undefined>;
    /**
     * A description for this team.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
     */
    public readonly ignoreMembers!: pulumi.Output<boolean | undefined>;
    /**
     * A Member block as documented below.
     */
    public readonly members!: pulumi.Output<outputs.TeamMember[] | undefined>;
    /**
     * The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a Team resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: TeamArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TeamArgs | TeamState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TeamState | undefined;
            resourceInputs["deleteDefaultResources"] = state ? state.deleteDefaultResources : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["ignoreMembers"] = state ? state.ignoreMembers : undefined;
            resourceInputs["members"] = state ? state.members : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as TeamArgs | undefined;
            resourceInputs["deleteDefaultResources"] = args ? args.deleteDefaultResources : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["ignoreMembers"] = args ? args.ignoreMembers : undefined;
            resourceInputs["members"] = args ? args.members : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Team.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Team resources.
 */
export interface TeamState {
    /**
     * Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
     */
    deleteDefaultResources?: pulumi.Input<boolean>;
    /**
     * A description for this team.
     */
    description?: pulumi.Input<string>;
    /**
     * Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
     */
    ignoreMembers?: pulumi.Input<boolean>;
    /**
     * A Member block as documented below.
     */
    members?: pulumi.Input<pulumi.Input<inputs.TeamMember>[]>;
    /**
     * The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Team resource.
 */
export interface TeamArgs {
    /**
     * Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
     */
    deleteDefaultResources?: pulumi.Input<boolean>;
    /**
     * A description for this team.
     */
    description?: pulumi.Input<string>;
    /**
     * Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
     */
    ignoreMembers?: pulumi.Input<boolean>;
    /**
     * A Member block as documented below.
     */
    members?: pulumi.Input<pulumi.Input<inputs.TeamMember>[]>;
    /**
     * The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
     */
    name?: pulumi.Input<string>;
}
