// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationPolicyDelayActionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defines until what day to delay or for what duration. Possible values are: "for-duration", "next-time", "next-weekday", "next-monday", "next-tuesday", "next-wednesday", "next-thursday", "next-friday", "next-saturday", "next-sunday"
        /// </summary>
        [Input("delayOption", required: true)]
        public Input<string> DelayOption { get; set; } = null!;

        [Input("durations")]
        private InputList<Inputs.NotificationPolicyDelayActionDurationGetArgs>? _durations;

        /// <summary>
        /// Duration of this action. If `delay_option` = "for-duration" this has to be set. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.NotificationPolicyDelayActionDurationGetArgs> Durations
        {
            get => _durations ?? (_durations = new InputList<Inputs.NotificationPolicyDelayActionDurationGetArgs>());
            set => _durations = value;
        }

        /// <summary>
        /// Until what hour notifications will be delayed. If `delay_option` is set to antyhing else then "for-duration" this has to be set.
        /// </summary>
        [Input("untilHour")]
        public Input<int>? UntilHour { get; set; }

        /// <summary>
        /// Until what minute on `until_hour` notifications will be delayed. If `delay_option` is set to antyhing else then "for-duration" this has to be set.
        /// </summary>
        [Input("untilMinute")]
        public Input<int>? UntilMinute { get; set; }

        public NotificationPolicyDelayActionGetArgs()
        {
        }
    }
}
