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
    public sealed class IntegrationActionCreateResponder
    {
        /// <summary>
        /// The id of the responder.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The responder type - can be `escalation`, `team` or `user`.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private IntegrationActionCreateResponder(
            string id,

            string type)
        {
            Id = id;
            Type = type;
        }
    }
}
