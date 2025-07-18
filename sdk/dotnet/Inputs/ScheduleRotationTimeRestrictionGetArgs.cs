// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class ScheduleRotationTimeRestrictionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("restriction")]
        private InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionGetArgs>? _restriction;

        /// <summary>
        /// It is a restriction object which is described below. In this case startDay/endDay fields are not supported. This can be used only if time restriction type is `time-of-day`.
        /// </summary>
        public InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionGetArgs> Restriction
        {
            get => _restriction ?? (_restriction = new InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionGetArgs>());
            set => _restriction = value;
        }

        [Input("restrictionList")]
        private InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionListGetArgs>? _restrictionList;

        /// <summary>
        /// It is a restriction object which is described below. This can be used only if time restriction type is `weekday-and-time-of-day`.
        /// </summary>
        public InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionListGetArgs> RestrictionList
        {
            get => _restrictionList ?? (_restrictionList = new InputList<Inputs.ScheduleRotationTimeRestrictionRestrictionListGetArgs>());
            set => _restrictionList = value;
        }

        /// <summary>
        /// This parameter should be set to `time-of-day` or `weekday-and-time-of-day`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ScheduleRotationTimeRestrictionGetArgs()
        {
        }
        public static new ScheduleRotationTimeRestrictionGetArgs Empty => new ScheduleRotationTimeRestrictionGetArgs();
    }
}
