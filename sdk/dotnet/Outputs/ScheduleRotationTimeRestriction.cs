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
    public sealed class ScheduleRotationTimeRestriction
    {
        /// <summary>
        /// It is a restriction object which is described below. This can be used only if time restriction type is `weekday-and-time-of-day`.
        /// </summary>
        public readonly ImmutableArray<Outputs.ScheduleRotationTimeRestrictionRestriction> Restrictions;
        /// <summary>
        /// This parameter should be set to `time-of-day` or `weekday-and-time-of-day`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private ScheduleRotationTimeRestriction(
            ImmutableArray<Outputs.ScheduleRotationTimeRestrictionRestriction> restrictions,

            string type)
        {
            Restrictions = restrictions;
            Type = type;
        }
    }
}