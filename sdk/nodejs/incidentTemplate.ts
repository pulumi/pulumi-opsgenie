// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Manages an Incident Template within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const testTeam = new opsgenie.Team("testTeam", {description: "This team deals with all the things"});
 * const testService = new opsgenie.Service("testService", {teamId: testTeam.id});
 * const testIncidentTemplate = new opsgenie.IncidentTemplate("testIncidentTemplate", {
 *     message: "Incident Message",
 *     priority: "P2",
 *     stakeholderProperties: [{
 *         enable: true,
 *         message: "Stakeholder Message",
 *         description: "Stakeholder Description",
 *     }],
 *     tags: [
 *         "tag1",
 *         "tag2",
 *     ],
 *     description: "Incident Description",
 *     details: {
 *         key1: "value1",
 *         key2: "value2",
 *     },
 *     impactedServices: [testService.id],
 * });
 * ```
 *
 * ## Import
 *
 * Service can be imported using the `id`, e.g.
 *
 * ```sh
 *  $ pulumi import opsgenie:index/incidentTemplate:IncidentTemplate test 812be1a1-32c8-4666-a7fb-03ecc385106c`
 * ```
 */
export class IncidentTemplate extends pulumi.CustomResource {
    /**
     * Get an existing IncidentTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IncidentTemplateState, opts?: pulumi.CustomResourceOptions): IncidentTemplate {
        return new IncidentTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/incidentTemplate:IncidentTemplate';

    /**
     * Returns true if the given object is an instance of IncidentTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IncidentTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IncidentTemplate.__pulumiType;
    }

    /**
     * Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
     */
    public readonly details!: pulumi.Output<{[key: string]: string} | undefined>;
    public readonly impactedServices!: pulumi.Output<string[] | undefined>;
    /**
     * Message that is to be passed to audience that is generally used to provide a content information about the alert.
     */
    public readonly message!: pulumi.Output<string>;
    /**
     * Name of the incident template.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Priority level of the incident. Possible values are P1, P2, P3, P4 and P5.
     */
    public readonly priority!: pulumi.Output<string>;
    public readonly stakeholderProperties!: pulumi.Output<outputs.IncidentTemplateStakeholderProperty[]>;
    /**
     * Tags of the incident template.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a IncidentTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IncidentTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IncidentTemplateArgs | IncidentTemplateState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as IncidentTemplateState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["details"] = state ? state.details : undefined;
            inputs["impactedServices"] = state ? state.impactedServices : undefined;
            inputs["message"] = state ? state.message : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["priority"] = state ? state.priority : undefined;
            inputs["stakeholderProperties"] = state ? state.stakeholderProperties : undefined;
            inputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as IncidentTemplateArgs | undefined;
            if ((!args || args.message === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'message'");
            }
            if ((!args || args.priority === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'priority'");
            }
            if ((!args || args.stakeholderProperties === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'stakeholderProperties'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["details"] = args ? args.details : undefined;
            inputs["impactedServices"] = args ? args.impactedServices : undefined;
            inputs["message"] = args ? args.message : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["priority"] = args ? args.priority : undefined;
            inputs["stakeholderProperties"] = args ? args.stakeholderProperties : undefined;
            inputs["tags"] = args ? args.tags : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(IncidentTemplate.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IncidentTemplate resources.
 */
export interface IncidentTemplateState {
    /**
     * Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
     */
    readonly details?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    readonly impactedServices?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Message that is to be passed to audience that is generally used to provide a content information about the alert.
     */
    readonly message?: pulumi.Input<string>;
    /**
     * Name of the incident template.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Priority level of the incident. Possible values are P1, P2, P3, P4 and P5.
     */
    readonly priority?: pulumi.Input<string>;
    readonly stakeholderProperties?: pulumi.Input<pulumi.Input<inputs.IncidentTemplateStakeholderProperty>[]>;
    /**
     * Tags of the incident template.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a IncidentTemplate resource.
 */
export interface IncidentTemplateArgs {
    /**
     * Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
     */
    readonly details?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    readonly impactedServices?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Message that is to be passed to audience that is generally used to provide a content information about the alert.
     */
    readonly message: pulumi.Input<string>;
    /**
     * Name of the incident template.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Priority level of the incident. Possible values are P1, P2, P3, P4 and P5.
     */
    readonly priority: pulumi.Input<string>;
    readonly stakeholderProperties: pulumi.Input<pulumi.Input<inputs.IncidentTemplateStakeholderProperty>[]>;
    /**
     * Tags of the incident template.
     */
    readonly tags?: pulumi.Input<pulumi.Input<string>[]>;
}
