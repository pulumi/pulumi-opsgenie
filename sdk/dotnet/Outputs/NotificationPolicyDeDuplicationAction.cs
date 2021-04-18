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
    public sealed class NotificationPolicyDeDuplicationAction
    {
        /// <summary>
        /// - Count
        /// </summary>
        public readonly int Count;
        /// <summary>
        /// Deduplication type. Possible values are: "value-based", "frequency-based"
        /// </summary>
        public readonly string DeDuplicationActionType;
        /// <summary>
        /// Duration of this action. If `delay_option` = `for-duration` this has to be set. This is a block, structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.NotificationPolicyDeDuplicationActionDuration> Durations;

        [OutputConstructor]
        private NotificationPolicyDeDuplicationAction(
            int count,

            string deDuplicationActionType,

            ImmutableArray<Outputs.NotificationPolicyDeDuplicationActionDuration> durations)
        {
            Count = count;
            DeDuplicationActionType = deDuplicationActionType;
            Durations = durations;
        }
    }
}
