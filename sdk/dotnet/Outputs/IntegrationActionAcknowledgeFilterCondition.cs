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
    public sealed class IntegrationActionAcknowledgeFilterCondition
    {
        public readonly string? ExpectedValue;
        public readonly string Field;
        public readonly string? Key;
        public readonly bool? Not;
        public readonly string Operation;
        /// <summary>
        /// Integer value that defines in which order the action will be performed. Defaults to `1`.
        /// </summary>
        public readonly int? Order;

        [OutputConstructor]
        private IntegrationActionAcknowledgeFilterCondition(
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
