// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages an Email Integration within Opsgenie.
 *
 * ## Import
 *
 * Email Integrations can be imported using the `id`, e.g.
 *
 * ```sh
 * $ pulumi import opsgenie:index/emailIntegration:EmailIntegration test id`
 * ```
 */
export class EmailIntegration extends pulumi.CustomResource {
    /**
     * Get an existing EmailIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: EmailIntegrationState, opts?: pulumi.CustomResourceOptions): EmailIntegration {
        return new EmailIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/emailIntegration:EmailIntegration';

    /**
     * Returns true if the given object is an instance of EmailIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is EmailIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === EmailIntegration.__pulumiType;
    }

    /**
     * The username part of the email address. It must be unique for each integration.
     */
    public readonly emailUsername!: pulumi.Output<string>;
    /**
     * A Member block as documented below.
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
     */
    public readonly ignoreRespondersFromPayload!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the integration. Name must be unique for each integration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Owner team id of the integration.
     */
    public readonly ownerTeamId!: pulumi.Output<string | undefined>;
    public readonly responders!: pulumi.Output<outputs.EmailIntegrationResponder[] | undefined>;
    /**
     * If enabled, notifications that come from alerts will be suppressed. Default: `false`.
     */
    public readonly suppressNotifications!: pulumi.Output<boolean | undefined>;

    /**
     * Create a EmailIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: EmailIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: EmailIntegrationArgs | EmailIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as EmailIntegrationState | undefined;
            resourceInputs["emailUsername"] = state ? state.emailUsername : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["ignoreRespondersFromPayload"] = state ? state.ignoreRespondersFromPayload : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerTeamId"] = state ? state.ownerTeamId : undefined;
            resourceInputs["responders"] = state ? state.responders : undefined;
            resourceInputs["suppressNotifications"] = state ? state.suppressNotifications : undefined;
        } else {
            const args = argsOrState as EmailIntegrationArgs | undefined;
            if ((!args || args.emailUsername === undefined) && !opts.urn) {
                throw new Error("Missing required property 'emailUsername'");
            }
            resourceInputs["emailUsername"] = args ? args.emailUsername : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["ignoreRespondersFromPayload"] = args ? args.ignoreRespondersFromPayload : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ownerTeamId"] = args ? args.ownerTeamId : undefined;
            resourceInputs["responders"] = args ? args.responders : undefined;
            resourceInputs["suppressNotifications"] = args ? args.suppressNotifications : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(EmailIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering EmailIntegration resources.
 */
export interface EmailIntegrationState {
    /**
     * The username part of the email address. It must be unique for each integration.
     */
    emailUsername?: pulumi.Input<string>;
    /**
     * A Member block as documented below.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
     */
    ignoreRespondersFromPayload?: pulumi.Input<boolean>;
    /**
     * Name of the integration. Name must be unique for each integration.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner team id of the integration.
     */
    ownerTeamId?: pulumi.Input<string>;
    responders?: pulumi.Input<pulumi.Input<inputs.EmailIntegrationResponder>[]>;
    /**
     * If enabled, notifications that come from alerts will be suppressed. Default: `false`.
     */
    suppressNotifications?: pulumi.Input<boolean>;
}

/**
 * The set of arguments for constructing a EmailIntegration resource.
 */
export interface EmailIntegrationArgs {
    /**
     * The username part of the email address. It must be unique for each integration.
     */
    emailUsername: pulumi.Input<string>;
    /**
     * A Member block as documented below.
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
     */
    ignoreRespondersFromPayload?: pulumi.Input<boolean>;
    /**
     * Name of the integration. Name must be unique for each integration.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner team id of the integration.
     */
    ownerTeamId?: pulumi.Input<string>;
    responders?: pulumi.Input<pulumi.Input<inputs.EmailIntegrationResponder>[]>;
    /**
     * If enabled, notifications that come from alerts will be suppressed. Default: `false`.
     */
    suppressNotifications?: pulumi.Input<boolean>;
}
