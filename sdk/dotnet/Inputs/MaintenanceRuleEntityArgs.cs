// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class MaintenanceRuleEntityArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the entity that maintenance will be applied.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// This parameter defines when the maintenance will be active. It can take one of for-5-minutes, for-30-minutes, for-1-hour, indefinitely or schedule.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public MaintenanceRuleEntityArgs()
        {
        }
    }
}
