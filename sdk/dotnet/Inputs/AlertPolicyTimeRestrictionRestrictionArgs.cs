// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class AlertPolicyTimeRestrictionRestrictionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Ending day of restriction (eg. "wednesday)
        /// </summary>
        [Input("endDay", required: true)]
        public Input<string> EndDay { get; set; } = null!;

        /// <summary>
        /// Ending hour of restriction.
        /// </summary>
        [Input("endHour", required: true)]
        public Input<int> EndHour { get; set; } = null!;

        /// <summary>
        /// Ending minute of restriction on defined `end_hour`
        /// </summary>
        [Input("endMin", required: true)]
        public Input<int> EndMin { get; set; } = null!;

        /// <summary>
        /// Starting day of restriction (eg. "monday")
        /// </summary>
        [Input("startDay", required: true)]
        public Input<string> StartDay { get; set; } = null!;

        /// <summary>
        /// Starting hour of restriction.
        /// </summary>
        [Input("startHour", required: true)]
        public Input<int> StartHour { get; set; } = null!;

        /// <summary>
        /// Staring minute of restriction on defined `start_hour`
        /// </summary>
        [Input("startMin", required: true)]
        public Input<int> StartMin { get; set; } = null!;

        public AlertPolicyTimeRestrictionRestrictionArgs()
        {
        }
    }
}
