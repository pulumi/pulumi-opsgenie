// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class GetEscalationRuleRecipientArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The ID of the Opsgenie Escalation.
        /// </summary>
        [Input("id")]
        public string? Id { get; set; }

        [Input("type")]
        public string? Type { get; set; }

        public GetEscalationRuleRecipientArgs()
        {
        }
    }
}