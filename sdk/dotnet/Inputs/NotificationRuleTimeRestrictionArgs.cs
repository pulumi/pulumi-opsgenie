// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationRuleTimeRestrictionArgs : Pulumi.ResourceArgs
    {
        [Input("restrictions")]
        private InputList<Inputs.NotificationRuleTimeRestrictionRestrictionArgs>? _restrictions;
        public InputList<Inputs.NotificationRuleTimeRestrictionRestrictionArgs> Restrictions
        {
            get => _restrictions ?? (_restrictions = new InputList<Inputs.NotificationRuleTimeRestrictionRestrictionArgs>());
            set => _restrictions = value;
        }

        /// <summary>
        /// Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NotificationRuleTimeRestrictionArgs()
        {
        }
    }
}
