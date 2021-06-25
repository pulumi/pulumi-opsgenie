// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class TeamRoutingRuleCriteriaConditionGetArgs : Pulumi.ResourceArgs
    {
        [Input("expectedValue")]
        public Input<string>? ExpectedValue { get; set; }

        /// <summary>
        /// Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `extra-properties`, `recipients`, `teams` or `priority`.
        /// </summary>
        [Input("field", required: true)]
        public Input<string> Field { get; set; } = null!;

        /// <summary>
        /// If field is set as extra-properties, key could be used for key-value pair.
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Indicates behaviour of the given operation. Default value is false.
        /// </summary>
        [Input("not")]
        public Input<bool>? Not { get; set; }

        /// <summary>
        /// It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty` and `equals-ignore-whitespace`.
        /// </summary>
        [Input("operation", required: true)]
        public Input<string> Operation { get; set; } = null!;

        /// <summary>
        /// Order of the condition in conditions list.
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        public TeamRoutingRuleCriteriaConditionGetArgs()
        {
        }
    }
}
