// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class ScheduleRotationTimeRestrictionRestrictionListGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("endDay", required: true)]
        public Input<string> EndDay { get; set; } = null!;

        [Input("endHour", required: true)]
        public Input<int> EndHour { get; set; } = null!;

        [Input("endMin", required: true)]
        public Input<int> EndMin { get; set; } = null!;

        [Input("startDay", required: true)]
        public Input<string> StartDay { get; set; } = null!;

        [Input("startHour", required: true)]
        public Input<int> StartHour { get; set; } = null!;

        [Input("startMin", required: true)]
        public Input<int> StartMin { get; set; } = null!;

        public ScheduleRotationTimeRestrictionRestrictionListGetArgs()
        {
        }
        public static new ScheduleRotationTimeRestrictionRestrictionListGetArgs Empty => new ScheduleRotationTimeRestrictionRestrictionListGetArgs();
    }
}
