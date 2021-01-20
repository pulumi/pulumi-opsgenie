// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class AlertPolicyFilterArgs : Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.AlertPolicyFilterConditionArgs>? _conditions;

        /// <summary>
        /// Conditions applied to filter. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.AlertPolicyFilterConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.AlertPolicyFilterConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Type of responder. Acceptable values are: user or team
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public AlertPolicyFilterArgs()
        {
        }
    }
}
