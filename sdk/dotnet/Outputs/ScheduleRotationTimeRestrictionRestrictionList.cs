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
    public sealed class ScheduleRotationTimeRestrictionRestrictionList
    {
        /// <summary>
        /// Value of the day that frame will end.
        /// </summary>
        public readonly string EndDay;
        /// <summary>
        /// Value of the hour that frame will end.
        /// </summary>
        public readonly int EndHour;
        /// <summary>
        /// Value of the minute that frame will end. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
        /// 
        /// Both `start_day` and `end_day` can assume only `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`, or `sunday` values.
        /// </summary>
        public readonly int EndMin;
        /// <summary>
        /// Value of the day that frame will start.
        /// </summary>
        public readonly string StartDay;
        /// <summary>
        /// Value of the hour that frame will start
        /// </summary>
        public readonly int StartHour;
        /// <summary>
        /// Value of the minute that frame will start. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
        /// </summary>
        public readonly int StartMin;

        [OutputConstructor]
        private ScheduleRotationTimeRestrictionRestrictionList(
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
