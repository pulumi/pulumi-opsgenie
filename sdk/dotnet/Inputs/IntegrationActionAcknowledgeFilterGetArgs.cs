// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class IntegrationActionAcknowledgeFilterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.IntegrationActionAcknowledgeFilterConditionGetArgs>? _conditions;
        public InputList<Inputs.IntegrationActionAcknowledgeFilterConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.IntegrationActionAcknowledgeFilterConditionGetArgs>());
            set => _conditions = value;
        }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public IntegrationActionAcknowledgeFilterGetArgs()
        {
        }
        public static new IntegrationActionAcknowledgeFilterGetArgs Empty => new IntegrationActionAcknowledgeFilterGetArgs();
    }
}
