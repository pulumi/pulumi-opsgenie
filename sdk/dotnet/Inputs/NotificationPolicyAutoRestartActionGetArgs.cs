// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationPolicyAutoRestartActionGetArgs : Pulumi.ResourceArgs
    {
        [Input("durations", required: true)]
        private InputList<Inputs.NotificationPolicyAutoRestartActionDurationGetArgs>? _durations;

        /// <summary>
        /// Duration of this action. If `delay_option` = `for-duration` this has to be set. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.NotificationPolicyAutoRestartActionDurationGetArgs> Durations
        {
            get => _durations ?? (_durations = new InputList<Inputs.NotificationPolicyAutoRestartActionDurationGetArgs>());
            set => _durations = value;
        }

        /// <summary>
        /// How many times to repeat. This is a integer attribute.
        /// </summary>
        [Input("maxRepeatCount", required: true)]
        public Input<int> MaxRepeatCount { get; set; } = null!;

        public NotificationPolicyAutoRestartActionGetArgs()
        {
        }
    }
}
