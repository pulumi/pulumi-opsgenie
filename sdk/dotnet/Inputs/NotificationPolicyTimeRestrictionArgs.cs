// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationPolicyTimeRestrictionArgs : Pulumi.ResourceArgs
    {
        [Input("restriction")]
        private InputList<Inputs.NotificationPolicyTimeRestrictionRestrictionArgs>? _restriction;

        /// <summary>
        /// A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.NotificationPolicyTimeRestrictionRestrictionArgs> Restriction
        {
            get => _restriction ?? (_restriction = new InputList<Inputs.NotificationPolicyTimeRestrictionRestrictionArgs>());
            set => _restriction = value;
        }

        [Input("restrictions")]
        private InputList<Inputs.NotificationPolicyTimeRestrictionRestrictionArgs>? _restrictions;

        /// <summary>
        /// List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.NotificationPolicyTimeRestrictionRestrictionArgs> Restrictions
        {
            get => _restrictions ?? (_restrictions = new InputList<Inputs.NotificationPolicyTimeRestrictionRestrictionArgs>());
            set => _restrictions = value;
        }

        /// <summary>
        /// Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: `time-of-day`, `weekday-and-time-of-day`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NotificationPolicyTimeRestrictionArgs()
        {
        }
    }
}
