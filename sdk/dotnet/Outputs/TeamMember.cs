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
    public sealed class TeamMember
    {
        /// <summary>
        /// The UUID for the member to add to this Team.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The role for the user within the Team - can be either `admin` or `user`. Default: `user`.
        /// </summary>
        public readonly string? Role;
        public readonly string? Username;

        [OutputConstructor]
        private TeamMember(
            string id,

            string? role,

            string? username)
        {
            Id = id;
            Role = role;
            Username = username;
        }
    }
}
