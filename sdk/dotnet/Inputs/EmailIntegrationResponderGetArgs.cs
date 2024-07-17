// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class EmailIntegrationResponderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Opsgenie Email based Integration.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The responder type.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public EmailIntegrationResponderGetArgs()
        {
        }
        public static new EmailIntegrationResponderGetArgs Empty => new EmailIntegrationResponderGetArgs();
    }
}
