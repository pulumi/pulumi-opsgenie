// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class IntegrationActionCreateFilterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.IntegrationActionCreateFilterConditionGetArgs>? _conditions;
        public InputList<Inputs.IntegrationActionCreateFilterConditionGetArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.IntegrationActionCreateFilterConditionGetArgs>());
            set => _conditions = value;
        }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public IntegrationActionCreateFilterGetArgs()
        {
        }
        public static new IntegrationActionCreateFilterGetArgs Empty => new IntegrationActionCreateFilterGetArgs();
    }
}
