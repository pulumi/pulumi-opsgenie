// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages an API Integration within Opsgenie.
 *
 * ## Import
 *
 * API Integrations can be imported using the `integration_id`, e.g.
 *
 * ```sh
 * $ pulumi import opsgenie:index/apiIntegration:ApiIntegration this integration_id`
 * ```
 */
export class ApiIntegration extends pulumi.CustomResource {
    /**
     * Get an existing ApiIntegration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiIntegrationState, opts?: pulumi.CustomResourceOptions): ApiIntegration {
        return new ApiIntegration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/apiIntegration:ApiIntegration';

    /**
     * Returns true if the given object is an instance of ApiIntegration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiIntegration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiIntegration.__pulumiType;
    }

    public readonly allowConfigurationAccess!: pulumi.Output<boolean | undefined>;
    /**
     * This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Default: `true`.
     */
    public readonly allowWriteAccess!: pulumi.Output<boolean | undefined>;
    /**
     * (Computed) API key of the created integration
     */
    public /*out*/ readonly apiKey!: pulumi.Output<string>;
    /**
     * This parameter is for specifying whether the integration will be enabled or not. Default: `true`
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    public readonly headers!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
     */
    public readonly ignoreRespondersFromPayload!: pulumi.Output<boolean | undefined>;
    /**
     * Name of the integration. Name must be unique for each integration.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Owner team id of the integration. If changed, this will recreate a new API integration, which will probably have a different API key.
     */
    public readonly ownerTeamId!: pulumi.Output<string | undefined>;
    /**
     * User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
     */
    public readonly responders!: pulumi.Output<outputs.ApiIntegrationResponder[] | undefined>;
    /**
     * If enabled, notifications that come from alerts will be suppressed. Default: `false`.
     */
    public readonly suppressNotifications!: pulumi.Output<boolean | undefined>;
    /**
     * Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
     */
    public readonly type!: pulumi.Output<string | undefined>;
    /**
     * It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
     */
    public readonly webhookUrl!: pulumi.Output<string | undefined>;

    /**
     * Create a ApiIntegration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ApiIntegrationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiIntegrationArgs | ApiIntegrationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiIntegrationState | undefined;
            resourceInputs["allowConfigurationAccess"] = state ? state.allowConfigurationAccess : undefined;
            resourceInputs["allowWriteAccess"] = state ? state.allowWriteAccess : undefined;
            resourceInputs["apiKey"] = state ? state.apiKey : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["headers"] = state ? state.headers : undefined;
            resourceInputs["ignoreRespondersFromPayload"] = state ? state.ignoreRespondersFromPayload : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["ownerTeamId"] = state ? state.ownerTeamId : undefined;
            resourceInputs["responders"] = state ? state.responders : undefined;
            resourceInputs["suppressNotifications"] = state ? state.suppressNotifications : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["webhookUrl"] = state ? state.webhookUrl : undefined;
        } else {
            const args = argsOrState as ApiIntegrationArgs | undefined;
            resourceInputs["allowConfigurationAccess"] = args ? args.allowConfigurationAccess : undefined;
            resourceInputs["allowWriteAccess"] = args ? args.allowWriteAccess : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["headers"] = args ? args.headers : undefined;
            resourceInputs["ignoreRespondersFromPayload"] = args ? args.ignoreRespondersFromPayload : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["ownerTeamId"] = args ? args.ownerTeamId : undefined;
            resourceInputs["responders"] = args ? args.responders : undefined;
            resourceInputs["suppressNotifications"] = args ? args.suppressNotifications : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
            resourceInputs["webhookUrl"] = args ? args.webhookUrl : undefined;
            resourceInputs["apiKey"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["apiKey"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(ApiIntegration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiIntegration resources.
 */
export interface ApiIntegrationState {
    allowConfigurationAccess?: pulumi.Input<boolean>;
    /**
     * This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Default: `true`.
     */
    allowWriteAccess?: pulumi.Input<boolean>;
    /**
     * (Computed) API key of the created integration
     */
    apiKey?: pulumi.Input<string>;
    /**
     * This parameter is for specifying whether the integration will be enabled or not. Default: `true`
     */
    enabled?: pulumi.Input<boolean>;
    headers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
     */
    ignoreRespondersFromPayload?: pulumi.Input<boolean>;
    /**
     * Name of the integration. Name must be unique for each integration.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner team id of the integration. If changed, this will recreate a new API integration, which will probably have a different API key.
     */
    ownerTeamId?: pulumi.Input<string>;
    /**
     * User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
     */
    responders?: pulumi.Input<pulumi.Input<inputs.ApiIntegrationResponder>[]>;
    /**
     * If enabled, notifications that come from alerts will be suppressed. Default: `false`.
     */
    suppressNotifications?: pulumi.Input<boolean>;
    /**
     * Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
     */
    type?: pulumi.Input<string>;
    /**
     * It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
     */
    webhookUrl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiIntegration resource.
 */
export interface ApiIntegrationArgs {
    allowConfigurationAccess?: pulumi.Input<boolean>;
    /**
     * This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Default: `true`.
     */
    allowWriteAccess?: pulumi.Input<boolean>;
    /**
     * This parameter is for specifying whether the integration will be enabled or not. Default: `true`
     */
    enabled?: pulumi.Input<boolean>;
    headers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
     */
    ignoreRespondersFromPayload?: pulumi.Input<boolean>;
    /**
     * Name of the integration. Name must be unique for each integration.
     */
    name?: pulumi.Input<string>;
    /**
     * Owner team id of the integration. If changed, this will recreate a new API integration, which will probably have a different API key.
     */
    ownerTeamId?: pulumi.Input<string>;
    /**
     * User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
     */
    responders?: pulumi.Input<pulumi.Input<inputs.ApiIntegrationResponder>[]>;
    /**
     * If enabled, notifications that come from alerts will be suppressed. Default: `false`.
     */
    suppressNotifications?: pulumi.Input<boolean>;
    /**
     * Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
     */
    type?: pulumi.Input<string>;
    /**
     * It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
     */
    webhookUrl?: pulumi.Input<string>;
}
