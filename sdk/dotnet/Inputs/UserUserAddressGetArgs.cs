// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class UserUserAddressGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("city", required: true)]
        public Input<string> City { get; set; } = null!;

        [Input("country", required: true)]
        public Input<string> Country { get; set; } = null!;

        [Input("line", required: true)]
        public Input<string> Line { get; set; } = null!;

        [Input("state", required: true)]
        public Input<string> State { get; set; } = null!;

        [Input("zipcode", required: true)]
        public Input<string> Zipcode { get; set; } = null!;

        public UserUserAddressGetArgs()
        {
        }
        public static new UserUserAddressGetArgs Empty => new UserUserAddressGetArgs();
    }
}
