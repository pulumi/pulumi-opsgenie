// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Outputs
{

    [OutputType]
    public sealed class NotificationPolicyDelayAction
    {
        /// <summary>
        /// Defines until what day to delay or for what duration. Possible values are: `for-duration`, `next-time`, `next-weekday`, `next-monday`, `next-tuesday`, `next-wednesday`, `next-thursday`, `next-friday`, `next-saturday`, `next-sunday`
        /// </summary>
        public readonly string DelayOption;
        /// <summary>
        /// Duration of this action. If `delay_option` = `for-duration` this has to be set. This is a block, structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.NotificationPolicyDelayActionDuration> Durations;
        /// <summary>
        /// Until what hour notifications will be delayed. If `delay_option` is set to antyhing else then `for-duration` this has to be set.
        /// </summary>
        public readonly int? UntilHour;
        /// <summary>
        /// Until what minute on `until_hour` notifications will be delayed. If `delay_option` is set to antyhing else then `for-duration` this has to be set.
        /// </summary>
        public readonly int? UntilMinute;

        [OutputConstructor]
        private NotificationPolicyDelayAction(
            string delayOption,

            ImmutableArray<Outputs.NotificationPolicyDelayActionDuration> durations,

            int? untilHour,

            int? untilMinute)
        {
            DelayOption = delayOption;
            Durations = durations;
            UntilHour = untilHour;
            UntilMinute = untilMinute;
        }
    }
}
