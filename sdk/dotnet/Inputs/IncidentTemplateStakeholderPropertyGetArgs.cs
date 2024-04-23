// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class IncidentTemplateStakeholderPropertyGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description field of the incident template. This field must not be longer than 10000 characters.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Message of the related incident template. This field must not be longer than 130 characters.
        /// </summary>
        [Input("message", required: true)]
        public Input<string> Message { get; set; } = null!;

        public IncidentTemplateStakeholderPropertyGetArgs()
        {
        }
        public static new IncidentTemplateStakeholderPropertyGetArgs Empty => new IncidentTemplateStakeholderPropertyGetArgs();
    }
}
