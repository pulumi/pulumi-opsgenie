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
    public sealed class AlertPolicyTimeRestriction
    {
        /// <summary>
        /// List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.AlertPolicyTimeRestrictionRestriction> Restrictions;
        /// <summary>
        /// Type of responder. Acceptable values are: `user` or `team`
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private AlertPolicyTimeRestriction(
            ImmutableArray<Outputs.AlertPolicyTimeRestrictionRestriction> restrictions,

            string type)
        {
            Restrictions = restrictions;
            Type = type;
        }
    }
}
