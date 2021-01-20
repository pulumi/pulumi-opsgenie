// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationPolicyFilterArgs : Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.NotificationPolicyFilterConditionArgs>? _conditions;

        /// <summary>
        /// Conditions applied to filter. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.NotificationPolicyFilterConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.NotificationPolicyFilterConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: "time-of-day", "weekday-and-time-of-day"
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public NotificationPolicyFilterArgs()
        {
        }
    }
}