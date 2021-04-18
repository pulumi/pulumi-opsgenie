// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Outputs
{

    [OutputType]
    public sealed class NotificationPolicyFilterCondition
    {
        /// <summary>
        /// User defined value that will be compared with alert field according to the operation. Default: empty string
        /// </summary>
        public readonly string? ExpectedValue;
        /// <summary>
        /// Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`
        /// </summary>
        public readonly string Field;
        /// <summary>
        /// If `field` is set as extra-properties, key could be used for key-value pair
        /// </summary>
        public readonly string? Key;
        /// <summary>
        /// Indicates behaviour of the given operation. Default: `false`
        /// </summary>
        public readonly bool? Not;
        /// <summary>
        /// It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`.
        /// </summary>
        public readonly string Operation;
        /// <summary>
        /// Order of the condition in conditions list
        /// </summary>
        public readonly int? Order;

        [OutputConstructor]
        private NotificationPolicyFilterCondition(
            string? expectedValue,

            string field,

            string? key,

            bool? not,

            string operation,

            int? order)
        {
            ExpectedValue = expectedValue;
            Field = field;
            Key = key;
            Not = not;
            Operation = operation;
            Order = order;
        }
    }
}
