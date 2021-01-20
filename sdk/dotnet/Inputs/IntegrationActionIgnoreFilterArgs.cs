// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class IntegrationActionIgnoreFilterArgs : Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.IntegrationActionIgnoreFilterConditionArgs>? _conditions;
        public InputList<Inputs.IntegrationActionIgnoreFilterConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.IntegrationActionIgnoreFilterConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// The responder type - can be escalation, team or user.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public IntegrationActionIgnoreFilterArgs()
        {
        }
    }
}
