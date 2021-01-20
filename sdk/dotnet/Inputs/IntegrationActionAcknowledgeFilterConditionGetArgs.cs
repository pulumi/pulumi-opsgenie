// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class IntegrationActionAcknowledgeFilterConditionGetArgs : Pulumi.ResourceArgs
    {
        [Input("expectedValue")]
        public Input<string>? ExpectedValue { get; set; }

        [Input("field", required: true)]
        public Input<string> Field { get; set; } = null!;

        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("not")]
        public Input<bool>? Not { get; set; }

        [Input("operation", required: true)]
        public Input<string> Operation { get; set; } = null!;

        /// <summary>
        /// Integer value that defines in which order the action will be performed. Defaults to `1`.
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        public IntegrationActionAcknowledgeFilterConditionGetArgs()
        {
        }
    }
}
