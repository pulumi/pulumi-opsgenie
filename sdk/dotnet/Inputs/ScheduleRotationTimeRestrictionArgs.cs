// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class ScheduleRotationTimeRestrictionArgs : Pulumi.ResourceArgs
    {
        [Input("restriction")]
        private InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionArgs>? _restriction;

        /// <summary>
        /// It is a restriction object which is described below. In this case startDay/endDay fields are not supported. This can be used only if time restriction type is `time-of-day`.
        /// </summary>
        public InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionArgs> Restriction
        {
            get => _restriction ?? (_restriction = new InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionArgs>());
            set => _restriction = value;
        }

        [Input("restrictionList")]
        private InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionListArgs>? _restrictionList;

        /// <summary>
        /// It is a restriction object which is described below. This can be used only if time restriction type is `weekday-and-time-of-day`.
        /// </summary>
        public InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionListArgs> RestrictionList
        {
            get => _restrictionList ?? (_restrictionList = new InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionListArgs>());
            set => _restrictionList = value;
        }

        /// <summary>
        /// This parameter should be set to `time-of-day` or `weekday-and-time-of-day`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ScheduleRotationTimeRestrictionArgs()
        {
        }
    }
}
