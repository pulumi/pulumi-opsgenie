// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages a Service Incident Rule within Opsgenie.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 *
 * const test = new opsgenie.Team("test", {
 *     name: "example-team",
 *     description: "This team deals with all the things",
 * });
 * const testService = new opsgenie.Service("test", {
 *     name: "example-service",
 *     teamId: test.id,
 * });
 * const testServiceIncidentRule = new opsgenie.ServiceIncidentRule("test", {
 *     serviceId: testService.id,
 *     incidentRules: [{
 *         conditionMatchType: "match-any-condition",
 *         conditions: [
 *             {
 *                 field: "message",
 *                 not: false,
 *                 operation: "contains",
 *                 expectedValue: "expected1",
 *             },
 *             {
 *                 field: "message",
 *                 not: false,
 *                 operation: "contains",
 *                 expectedValue: "expected2",
 *             },
 *         ],
 *         incidentProperties: [{
 *             message: "This is a test message",
 *             priority: "P3",
 *             stakeholderProperties: [{
 *                 message: "Message for stakeholders",
 *                 enable: true,
 *             }],
 *         }],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Service Incident Rule can be imported using the `service_id/service_incident_rule_id`, e.g.
 *
 * ```sh
 * $ pulumi import opsgenie:index/serviceIncidentRule:ServiceIncidentRule this service_id/service_incident_rule_id`
 * ```
 */
export class ServiceIncidentRule extends pulumi.CustomResource {
    /**
     * Get an existing ServiceIncidentRule resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceIncidentRuleState, opts?: pulumi.CustomResourceOptions): ServiceIncidentRule {
        return new ServiceIncidentRule(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/serviceIncidentRule:ServiceIncidentRule';

    /**
     * Returns true if the given object is an instance of ServiceIncidentRule.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceIncidentRule {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceIncidentRule.__pulumiType;
    }

    /**
     * This is the rule configuration for this incident rule. This is a block, structure is documented below.
     */
    public readonly incidentRules!: pulumi.Output<outputs.ServiceIncidentRuleIncidentRule[]>;
    /**
     * ID of the service associated
     */
    public readonly serviceId!: pulumi.Output<string>;

    /**
     * Create a ServiceIncidentRule resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceIncidentRuleArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceIncidentRuleArgs | ServiceIncidentRuleState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceIncidentRuleState | undefined;
            resourceInputs["incidentRules"] = state ? state.incidentRules : undefined;
            resourceInputs["serviceId"] = state ? state.serviceId : undefined;
        } else {
            const args = argsOrState as ServiceIncidentRuleArgs | undefined;
            if ((!args || args.incidentRules === undefined) && !opts.urn) {
                throw new Error("Missing required property 'incidentRules'");
            }
            if ((!args || args.serviceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'serviceId'");
            }
            resourceInputs["incidentRules"] = args ? args.incidentRules : undefined;
            resourceInputs["serviceId"] = args ? args.serviceId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceIncidentRule.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceIncidentRule resources.
 */
export interface ServiceIncidentRuleState {
    /**
     * This is the rule configuration for this incident rule. This is a block, structure is documented below.
     */
    incidentRules?: pulumi.Input<pulumi.Input<inputs.ServiceIncidentRuleIncidentRule>[]>;
    /**
     * ID of the service associated
     */
    serviceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceIncidentRule resource.
 */
export interface ServiceIncidentRuleArgs {
    /**
     * This is the rule configuration for this incident rule. This is a block, structure is documented below.
     */
    incidentRules: pulumi.Input<pulumi.Input<inputs.ServiceIncidentRuleIncidentRule>[]>;
    /**
     * ID of the service associated
     */
    serviceId: pulumi.Input<string>;
}
