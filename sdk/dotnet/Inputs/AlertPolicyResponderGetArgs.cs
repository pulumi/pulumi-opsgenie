// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class AlertPolicyResponderGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// ID of the responder
        /// </summary>
        [Input("id", required: true)]
        public Input<string> Id { get; set; } = null!;

        /// <summary>
        /// Name of the responder
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Type of responder. Acceptable values are: `user` or `team`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// Username of the responder
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public AlertPolicyResponderGetArgs()
        {
        }
    }
}
