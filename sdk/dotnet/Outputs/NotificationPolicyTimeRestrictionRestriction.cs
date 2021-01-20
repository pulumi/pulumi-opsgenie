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
    public sealed class NotificationPolicyTimeRestrictionRestriction
    {
        /// <summary>
        /// Ending day of restriction (eg. "wednesday)
        /// </summary>
        public readonly string EndDay;
        /// <summary>
        /// Ending hour of restriction.
        /// </summary>
        public readonly int EndHour;
        /// <summary>
        /// Ending minute of restriction on defined `end_hour`
        /// </summary>
        public readonly int EndMin;
        /// <summary>
        /// Starting day of restriction (eg. "monday")
        /// </summary>
        public readonly string StartDay;
        /// <summary>
        /// Starting hour of restriction.
        /// </summary>
        public readonly int StartHour;
        /// <summary>
        /// Staring minute of restriction on defined `start_hour`
        /// </summary>
        public readonly int StartMin;

        [OutputConstructor]
        private NotificationPolicyTimeRestrictionRestriction(
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
