// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class IntegrationActionAcknowledgeFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.IntegrationActionAcknowledgeFilterConditionArgs>? _conditions;
        public InputList<Inputs.IntegrationActionAcknowledgeFilterConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.IntegrationActionAcknowledgeFilterConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// The responder type - can be `escalation`, `team` or `user`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public IntegrationActionAcknowledgeFilterArgs()
        {
        }
        public static new IntegrationActionAcknowledgeFilterArgs Empty => new IntegrationActionAcknowledgeFilterArgs();
    }
}
