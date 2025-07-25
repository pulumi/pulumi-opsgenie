// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class TeamRoutingRuleCriteriaArgs : global::Pulumi.ResourceArgs
    {
        [Input("conditions")]
        private InputList<Inputs.TeamRoutingRuleCriteriaConditionArgs>? _conditions;

        /// <summary>
        /// List of conditions will be checked before applying team routing rule. This field declaration should be omitted if the criteria type is set to match-all.
        /// </summary>
        public InputList<Inputs.TeamRoutingRuleCriteriaConditionArgs> Conditions
        {
            get => _conditions ?? (_conditions = new InputList<Inputs.TeamRoutingRuleCriteriaConditionArgs>());
            set => _conditions = value;
        }

        /// <summary>
        /// Type of the operation will be applied on conditions. Should be one of `match-all`, `match-any-condition` or `match-all-conditions`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public TeamRoutingRuleCriteriaArgs()
        {
        }
        public static new TeamRoutingRuleCriteriaArgs Empty => new TeamRoutingRuleCriteriaArgs();
    }
}
