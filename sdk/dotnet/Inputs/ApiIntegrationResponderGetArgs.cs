// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class ApiIntegrationResponderGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The id of the responder.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// The responder type.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ApiIntegrationResponderGetArgs()
        {
        }
        public static new ApiIntegrationResponderGetArgs Empty => new ApiIntegrationResponderGetArgs();
    }
}
