// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Outputs
{

    [OutputType]
    public sealed class UserUserAddress
    {
        public readonly string City;
        public readonly string Country;
        public readonly string Line;
        public readonly string State;
        public readonly string Zipcode;

        [OutputConstructor]
        private UserUserAddress(
            string city,

            string country,

            string line,

            string state,

            string zipcode)
        {
            City = city;
            Country = country;
            Line = line;
            State = state;
            Zipcode = zipcode;
        }
    }
}
