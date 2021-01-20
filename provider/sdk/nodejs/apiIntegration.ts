// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

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

    public readonly allowWriteAccess!: pulumi.Output<boolean | undefined>;
    public /*out*/ readonly apiKey!: pulumi.Output<string>;
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    public readonly headers!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly ignoreRespondersFromPayload!: pulumi.Output<boolean | undefined>;
    public readonly name!: pulumi.Output<string>;
    public readonly ownerTeamId!: pulumi.Output<string | undefined>;
    public readonly responders!: pulumi.Output<outputs.ApiIntegrationResponder[] | undefined>;
    public readonly suppressNotifications!: pulumi.Output<boolean | undefined>;
    public readonly type!: pulumi.Output<string | undefined>;
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
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as ApiIntegrationState | undefined;
            inputs["allowWriteAccess"] = state ? state.allowWriteAccess : undefined;
            inputs["apiKey"] = state ? state.apiKey : undefined;
            inputs["enabled"] = state ? state.enabled : undefined;
            inputs["headers"] = state ? state.headers : undefined;
            inputs["ignoreRespondersFromPayload"] = state ? state.ignoreRespondersFromPayload : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["ownerTeamId"] = state ? state.ownerTeamId : undefined;
            inputs["responders"] = state ? state.responders : undefined;
            inputs["suppressNotifications"] = state ? state.suppressNotifications : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["webhookUrl"] = state ? state.webhookUrl : undefined;
        } else {
            const args = argsOrState as ApiIntegrationArgs | undefined;
            inputs["allowWriteAccess"] = args ? args.allowWriteAccess : undefined;
            inputs["enabled"] = args ? args.enabled : undefined;
            inputs["headers"] = args ? args.headers : undefined;
            inputs["ignoreRespondersFromPayload"] = args ? args.ignoreRespondersFromPayload : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["ownerTeamId"] = args ? args.ownerTeamId : undefined;
            inputs["responders"] = args ? args.responders : undefined;
            inputs["suppressNotifications"] = args ? args.suppressNotifications : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["webhookUrl"] = args ? args.webhookUrl : undefined;
            inputs["apiKey"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(ApiIntegration.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiIntegration resources.
 */
export interface ApiIntegrationState {
    readonly allowWriteAccess?: pulumi.Input<boolean>;
    readonly apiKey?: pulumi.Input<string>;
    readonly enabled?: pulumi.Input<boolean>;
    readonly headers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    readonly ignoreRespondersFromPayload?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    readonly ownerTeamId?: pulumi.Input<string>;
    readonly responders?: pulumi.Input<pulumi.Input<inputs.ApiIntegrationResponder>[]>;
    readonly suppressNotifications?: pulumi.Input<boolean>;
    readonly type?: pulumi.Input<string>;
    readonly webhookUrl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ApiIntegration resource.
 */
export interface ApiIntegrationArgs {
    readonly allowWriteAccess?: pulumi.Input<boolean>;
    readonly enabled?: pulumi.Input<boolean>;
    readonly headers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    readonly ignoreRespondersFromPayload?: pulumi.Input<boolean>;
    readonly name?: pulumi.Input<string>;
    readonly ownerTeamId?: pulumi.Input<string>;
    readonly responders?: pulumi.Input<pulumi.Input<inputs.ApiIntegrationResponder>[]>;
    readonly suppressNotifications?: pulumi.Input<boolean>;
    readonly type?: pulumi.Input<string>;
    readonly webhookUrl?: pulumi.Input<string>;
}