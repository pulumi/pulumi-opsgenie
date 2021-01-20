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
    public sealed class TeamRoutingRuleCriteria
    {
        /// <summary>
        /// List of conditions will be checked before applying team routing rule. This field declaration should be omitted if the criteria type is set to match-all.
        /// </summary>
        public readonly ImmutableArray<Outputs.TeamRoutingRuleCriteriaCondition> Conditions;
        /// <summary>
        /// Type of the operation will be applied on conditions. Should be one of match-all, match-any-condition or match-all-conditions.
        /// </summary>
        public readonly string Type;

        [OutputConstructor]
        private TeamRoutingRuleCriteria(
            ImmutableArray<Outputs.TeamRoutingRuleCriteriaCondition> conditions,

            string type)
        {
            Conditions = conditions;
            Type = type;
        }
    }
}
