// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationRuleCriteriaConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User defined value that will be compared with alert field according to the operation. Default: empty string
        /// </summary>
        [Input("expectedValue")]
        public Input<string>? ExpectedValue { get; set; }

        /// <summary>
        /// Possible values: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`
        /// </summary>
        [Input("field", required: true)]
        public Input<string> Field { get; set; } = null!;

        /// <summary>
        /// If 'field' is set as 'extra-properties', key could be used for key-value pair
        /// </summary>
        [Input("key")]
        public Input<string>? Key { get; set; }

        /// <summary>
        /// Indicates behaviour of the given operation. Default: `false`
        /// </summary>
        [Input("not")]
        public Input<bool>? Not { get; set; }

        /// <summary>
        /// Possible values: `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`
        /// </summary>
        [Input("operation", required: true)]
        public Input<string> Operation { get; set; } = null!;

        /// <summary>
        /// Order of the condition in conditions list
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        public NotificationRuleCriteriaConditionArgs()
        {
        }
        public static new NotificationRuleCriteriaConditionArgs Empty => new NotificationRuleCriteriaConditionArgs();
    }
}
