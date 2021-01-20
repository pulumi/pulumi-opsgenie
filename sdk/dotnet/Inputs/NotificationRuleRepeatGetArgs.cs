// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationRuleRepeatGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Defined if this step is enabled. Default: true
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("loopAfter", required: true)]
        public Input<int> LoopAfter { get; set; } = null!;

        public NotificationRuleRepeatGetArgs()
        {
        }
    }
}