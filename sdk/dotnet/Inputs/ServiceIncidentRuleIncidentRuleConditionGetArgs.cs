// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class ServiceIncidentRuleIncidentRuleConditionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// User defined value that will be compared with alert field according to the operation. Default: empty string
        /// </summary>
        [Input("expectedValue")]
        public Input<string>? ExpectedValue { get; set; }

        /// <summary>
        /// Specifies which alert field will be used in condition. Possible values are "message", "alias", "description", "source", "entity", "tags", "actions", "details", "extra-properties", "recipients", "teams", "priority"
        /// </summary>
        [Input("field", required: true)]
        public Input<string> Field { get; set; } = null!;

        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Indicates behaviour of the given operation. Default: false
        /// </summary>
        [Input("not")]
        public Input<bool>? Not { get; set; }

        /// <summary>
        /// It is the operation that will be executed for the given field and key. Possible operations are "matches", "contains", "starts-with", "ends-with", "equals", "contains-key", "contains-value", "greater-than", "less-than", "is-empty", "equals-ignore-whitespace".
        /// </summary>
        [Input("operation", required: true)]
        public Input<string> Operation { get; set; } = null!;

        public ServiceIncidentRuleIncidentRuleConditionGetArgs()
        {
        }
    }
}
