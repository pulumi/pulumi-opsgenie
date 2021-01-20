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
    public sealed class ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty
    {
        /// <summary>
        /// Description that is generally used to provide a detailed information about the alert.
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Option to enable stakeholder notifications.Default value is true.
        /// </summary>
        public readonly bool? Enable;
        /// <summary>
        /// Message that is to be passed to audience that is generally used to provide a content information about the alert.
        /// </summary>
        public readonly string Message;

        [OutputConstructor]
        private ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty(
            string? description,

            bool? enable,

            string message)
        {
            Description = description;
            Enable = enable;
            Message = message;
        }
    }
}
