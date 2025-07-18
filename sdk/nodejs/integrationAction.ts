// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * Manages advanced actions for Integrations within Opsgenie. This applies for the following resources:
 * * `opsgenie.ApiIntegration`
 * * `opsgenie.EmailIntegration`
 *
 * The actions that are supported are:
 * * `create`
 * * `close`
 * * `acknowledge`
 * * `addNote`
 * * `ignore`
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as opsgenie from "@pulumi/opsgenie";
 * import * as std from "@pulumi/std";
 *
 * const testAction = new opsgenie.IntegrationAction("test_action", {
 *     integrationId: testOpsgenieApiIntegration.id,
 *     creates: [
 *         {
 *             name: "create action",
 *             tags: [
 *                 "CRITICAL",
 *                 "SEV-0",
 *             ],
 *             user: "Example-service",
 *             note: "{{note}}",
 *             alias: "{{alias}}",
 *             source: "{{source}}",
 *             message: "{{message}}",
 *             description: "{{description}}",
 *             entity: "{{entity}}",
 *             alertActions: ["Runbook ID#342"],
 *             filters: [{
 *                 type: "match-all-conditions",
 *                 conditions: [{
 *                     field: "priority",
 *                     operation: "equals",
 *                     expectedValue: "P1",
 *                 }],
 *             }],
 *             responders: [{
 *                 id: test.id,
 *                 type: "team",
 *             }],
 *         },
 *         {
 *             name: "create action with multiline description",
 *             message: "{{message}}",
 *             description: std.chomp({
 *                 input: `This
 * is a multiline
 * description.
 * `,
 *             }).then(invoke => invoke.result),
 *             filters: [{
 *                 type: "match-all-conditions",
 *                 conditions: [{
 *                     field: "priority",
 *                     operation: "equals",
 *                     expectedValue: "P1",
 *                 }],
 *             }],
 *         },
 *         {
 *             name: "Create medium priority alerts",
 *             tags: [
 *                 "SEVERE",
 *                 "SEV-1",
 *             ],
 *             priority: "P3",
 *             filters: [{
 *                 type: "match-all-conditions",
 *                 conditions: [{
 *                     field: "priority",
 *                     operation: "equals",
 *                     expectedValue: "P2",
 *                 }],
 *             }],
 *         },
 *         {
 *             name: "Create alert with priority from message",
 *             customPriority: "{{message.substringAfter(\"[custom]\")}}",
 *             filters: [{
 *                 type: "match-all-conditions",
 *                 conditions: [
 *                     {
 *                         field: "tags",
 *                         operation: "contains",
 *                         expectedValue: "P5",
 *                     },
 *                     {
 *                         field: "message",
 *                         operation: "starts-with",
 *                         expectedValue: "[custom]",
 *                     },
 *                 ],
 *             }],
 *         },
 *     ],
 *     closes: [{
 *         name: "Low priority alerts",
 *         filters: [{
 *             type: "match-any-condition",
 *             conditions: [
 *                 {
 *                     field: "priority",
 *                     operation: "equals",
 *                     expectedValue: "P5",
 *                 },
 *                 {
 *                     field: "message",
 *                     operation: "contains",
 *                     expectedValue: "DEBUG",
 *                 },
 *             ],
 *         }],
 *     }],
 *     acknowledges: [{
 *         name: "Auto-ack test alerts",
 *         filters: [{
 *             type: "match-all-conditions",
 *             conditions: [
 *                 {
 *                     field: "message",
 *                     not: true,
 *                     operation: "contains",
 *                     expectedValue: "TEST",
 *                 },
 *                 {
 *                     field: "priority",
 *                     operation: "equals",
 *                     expectedValue: "P5",
 *                 },
 *             ],
 *         }],
 *     }],
 *     addNotes: [{
 *         name: "Add note to all alerts",
 *         note: "Created from test integration",
 *         filters: [{
 *             type: "match-all",
 *         }],
 *     }],
 *     ignores: [{
 *         name: "Ignore alerts with ignore tag",
 *         filters: [{
 *             type: "match-all-conditions",
 *             conditions: [{
 *                 field: "tags",
 *                 operation: "contains",
 *                 expectedValue: "ignore",
 *             }],
 *         }],
 *     }],
 * });
 * ```
 */
export class IntegrationAction extends pulumi.CustomResource {
    /**
     * Get an existing IntegrationAction resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: IntegrationActionState, opts?: pulumi.CustomResourceOptions): IntegrationAction {
        return new IntegrationAction(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'opsgenie:index/integrationAction:IntegrationAction';

    /**
     * Returns true if the given object is an instance of IntegrationAction.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is IntegrationAction {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === IntegrationAction.__pulumiType;
    }

    public readonly acknowledges!: pulumi.Output<outputs.IntegrationActionAcknowledge[] | undefined>;
    public readonly addNotes!: pulumi.Output<outputs.IntegrationActionAddNote[] | undefined>;
    public readonly closes!: pulumi.Output<outputs.IntegrationActionClose[] | undefined>;
    public readonly creates!: pulumi.Output<outputs.IntegrationActionCreate[] | undefined>;
    public readonly ignores!: pulumi.Output<outputs.IntegrationActionIgnore[] | undefined>;
    /**
     * ID of the parent integration resource to bind to.
     */
    public readonly integrationId!: pulumi.Output<string>;

    /**
     * Create a IntegrationAction resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: IntegrationActionArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: IntegrationActionArgs | IntegrationActionState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as IntegrationActionState | undefined;
            resourceInputs["acknowledges"] = state ? state.acknowledges : undefined;
            resourceInputs["addNotes"] = state ? state.addNotes : undefined;
            resourceInputs["closes"] = state ? state.closes : undefined;
            resourceInputs["creates"] = state ? state.creates : undefined;
            resourceInputs["ignores"] = state ? state.ignores : undefined;
            resourceInputs["integrationId"] = state ? state.integrationId : undefined;
        } else {
            const args = argsOrState as IntegrationActionArgs | undefined;
            if ((!args || args.integrationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'integrationId'");
            }
            resourceInputs["acknowledges"] = args ? args.acknowledges : undefined;
            resourceInputs["addNotes"] = args ? args.addNotes : undefined;
            resourceInputs["closes"] = args ? args.closes : undefined;
            resourceInputs["creates"] = args ? args.creates : undefined;
            resourceInputs["ignores"] = args ? args.ignores : undefined;
            resourceInputs["integrationId"] = args ? args.integrationId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(IntegrationAction.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering IntegrationAction resources.
 */
export interface IntegrationActionState {
    acknowledges?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAcknowledge>[]>;
    addNotes?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAddNote>[]>;
    closes?: pulumi.Input<pulumi.Input<inputs.IntegrationActionClose>[]>;
    creates?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCreate>[]>;
    ignores?: pulumi.Input<pulumi.Input<inputs.IntegrationActionIgnore>[]>;
    /**
     * ID of the parent integration resource to bind to.
     */
    integrationId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a IntegrationAction resource.
 */
export interface IntegrationActionArgs {
    acknowledges?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAcknowledge>[]>;
    addNotes?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAddNote>[]>;
    closes?: pulumi.Input<pulumi.Input<inputs.IntegrationActionClose>[]>;
    creates?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCreate>[]>;
    ignores?: pulumi.Input<pulumi.Input<inputs.IntegrationActionIgnore>[]>;
    /**
     * ID of the parent integration resource to bind to.
     */
    integrationId: pulumi.Input<string>;
}
