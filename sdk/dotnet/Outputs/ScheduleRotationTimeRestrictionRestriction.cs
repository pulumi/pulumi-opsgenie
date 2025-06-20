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
    public sealed class ScheduleRotationTimeRestrictionRestriction
    {
        /// <summary>
        /// Value of the hour that frame will end.
        /// </summary>
        public readonly int EndHour;
        /// <summary>
        /// Value of the minute that frame will end. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
        /// </summary>
        public readonly int EndMin;
        /// <summary>
        /// Value of the hour that frame will start.
        /// </summary>
        public readonly int StartHour;
        /// <summary>
        /// Value of the minute that frame will start. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
        /// </summary>
        public readonly int StartMin;

        [OutputConstructor]
        private ScheduleRotationTimeRestrictionRestriction(
            int endHour,

            int endMin,

            int startHour,

            int startMin)
        {
            EndHour = endHour;
            EndMin = endMin;
            StartHour = startHour;
            StartMin = startMin;
        }
    }
}
