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
    public sealed class NotificationRuleTimeRestrictionRestriction
    {
        public readonly string EndDay;
        public readonly int EndHour;
        public readonly int EndMin;
        public readonly string StartDay;
        public readonly int StartHour;
        public readonly int StartMin;

        [OutputConstructor]
        private NotificationRuleTimeRestrictionRestriction(
            string endDay,

            int endHour,

            int endMin,

            string startDay,

            int startHour,

            int startMin)
        {
            EndDay = endDay;
            EndHour = endHour;
            EndMin = endMin;
            StartDay = startDay;
            StartHour = startHour;
            StartMin = startMin;
        }
    }
}
