// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationPolicyDelayActionDurationArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A amount of time in `time_units`. This is a integer attribute.
        /// </summary>
        [Input("timeAmount", required: true)]
        public Input<int> TimeAmount { get; set; } = null!;

        /// <summary>
        /// Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
        /// </summary>
        [Input("timeUnit")]
        public Input<string>? TimeUnit { get; set; }

        public NotificationPolicyDelayActionDurationArgs()
        {
        }
    }
}
