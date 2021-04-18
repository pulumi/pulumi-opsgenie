// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Outputs
{

    [OutputType]
    public sealed class NotificationPolicyDeDuplicationActionDuration
    {
        /// <summary>
        /// A amount of time in `time_units`. This is a integer attribute.
        /// </summary>
        public readonly int TimeAmount;
        /// <summary>
        /// Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
        /// </summary>
        public readonly string? TimeUnit;

        [OutputConstructor]
        private NotificationPolicyDeDuplicationActionDuration(
            int timeAmount,

            string? timeUnit)
        {
            TimeAmount = timeAmount;
            TimeUnit = timeUnit;
        }
    }
}
