// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie
{
    /// <summary>
    /// Manages a Team Routing Rule within Opsgenie.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Opsgenie = Pulumi.Opsgenie;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testSchedule = new Opsgenie.Schedule("testSchedule", new()
    ///     {
    ///         Description = "schedule test",
    ///         Enabled = false,
    ///         Timezone = "Europe/Rome",
    ///     });
    /// 
    ///     var testTeam = new Opsgenie.Team("testTeam", new()
    ///     {
    ///         Description = "This team deals with all the things",
    ///     });
    /// 
    ///     var testTeamRoutingRule = new Opsgenie.TeamRoutingRule("testTeamRoutingRule", new()
    ///     {
    ///         Criterias = new[]
    ///         {
    ///             new Opsgenie.Inputs.TeamRoutingRuleCriteriaArgs
    ///             {
    ///                 Conditions = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.TeamRoutingRuleCriteriaConditionArgs
    ///                     {
    ///                         ExpectedValue = "expected1",
    ///                         Field = "message",
    ///                         Not = false,
    ///                         Operation = "contains",
    ///                     },
    ///                 },
    ///                 Type = "match-any-condition",
    ///             },
    ///         },
    ///         Notifies = new[]
    ///         {
    ///             new Opsgenie.Inputs.TeamRoutingRuleNotifyArgs
    ///             {
    ///                 Name = testSchedule.Name,
    ///                 Type = "schedule",
    ///             },
    ///         },
    ///         Order = 0,
    ///         TeamId = testTeam.Id,
    ///         TimeRestrictions = new[]
    ///         {
    ///             new Opsgenie.Inputs.TeamRoutingRuleTimeRestrictionArgs
    ///             {
    ///                 RestrictionList = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.TeamRoutingRuleTimeRestrictionRestrictionListArgs
    ///                     {
    ///                         EndDay = "tuesday",
    ///                         EndHour = 18,
    ///                         EndMin = 30,
    ///                         StartDay = "monday",
    ///                         StartHour = 8,
    ///                         StartMin = 0,
    ///                     },
    ///                 },
    ///                 Type = "weekday-and-time-of-day",
    ///             },
    ///         },
    ///         Timezone = "America/Los_Angeles",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Team Routing Rules can be imported using the `team_id/routing_rule_id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import opsgenie:index/teamRoutingRule:TeamRoutingRule ruletest team_id/routing_rule_id`
    /// ```
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/teamRoutingRule:TeamRoutingRule")]
    public partial class TeamRoutingRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// You can refer Criteria for detailed information about criteria and its fields
        /// </summary>
        [Output("criterias")]
        public Output<ImmutableArray<Outputs.TeamRoutingRuleCriteria>> Criterias { get; private set; } = null!;

        /// <summary>
        /// Only use when importing default routing rule
        /// </summary>
        [Output("isDefault")]
        public Output<bool?> IsDefault { get; private set; } = null!;

        /// <summary>
        /// Name of the team routing rule
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        /// </summary>
        [Output("notifies")]
        public Output<ImmutableArray<Outputs.TeamRoutingRuleNotify>> Notifies { get; private set; } = null!;

        /// <summary>
        /// The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        /// </summary>
        [Output("order")]
        public Output<int?> Order { get; private set; } = null!;

        /// <summary>
        /// Id of the team owning the routing rule
        /// </summary>
        [Output("teamId")]
        public Output<string> TeamId { get; private set; } = null!;

        /// <summary>
        /// You can refer Time Restriction for detailed information about time restriction and its fields.
        /// </summary>
        [Output("timeRestrictions")]
        public Output<ImmutableArray<Outputs.TeamRoutingRuleTimeRestriction>> TimeRestrictions { get; private set; } = null!;

        /// <summary>
        /// Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        /// </summary>
        [Output("timezone")]
        public Output<string?> Timezone { get; private set; } = null!;


        /// <summary>
        /// Create a TeamRoutingRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TeamRoutingRule(string name, TeamRoutingRuleArgs args, CustomResourceOptions? options = null)
            : base("opsgenie:index/teamRoutingRule:TeamRoutingRule", name, args ?? new TeamRoutingRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TeamRoutingRule(string name, Input<string> id, TeamRoutingRuleState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/teamRoutingRule:TeamRoutingRule", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TeamRoutingRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TeamRoutingRule Get(string name, Input<string> id, TeamRoutingRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new TeamRoutingRule(name, id, state, options);
        }
    }

    public sealed class TeamRoutingRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("criterias")]
        private InputList<Inputs.TeamRoutingRuleCriteriaArgs>? _criterias;

        /// <summary>
        /// You can refer Criteria for detailed information about criteria and its fields
        /// </summary>
        public InputList<Inputs.TeamRoutingRuleCriteriaArgs> Criterias
        {
            get => _criterias ?? (_criterias = new InputList<Inputs.TeamRoutingRuleCriteriaArgs>());
            set => _criterias = value;
        }

        /// <summary>
        /// Only use when importing default routing rule
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        /// <summary>
        /// Name of the team routing rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifies", required: true)]
        private InputList<Inputs.TeamRoutingRuleNotifyArgs>? _notifies;

        /// <summary>
        /// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        /// </summary>
        public InputList<Inputs.TeamRoutingRuleNotifyArgs> Notifies
        {
            get => _notifies ?? (_notifies = new InputList<Inputs.TeamRoutingRuleNotifyArgs>());
            set => _notifies = value;
        }

        /// <summary>
        /// The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        /// <summary>
        /// Id of the team owning the routing rule
        /// </summary>
        [Input("teamId", required: true)]
        public Input<string> TeamId { get; set; } = null!;

        [Input("timeRestrictions")]
        private InputList<Inputs.TeamRoutingRuleTimeRestrictionArgs>? _timeRestrictions;

        /// <summary>
        /// You can refer Time Restriction for detailed information about time restriction and its fields.
        /// </summary>
        public InputList<Inputs.TeamRoutingRuleTimeRestrictionArgs> TimeRestrictions
        {
            get => _timeRestrictions ?? (_timeRestrictions = new InputList<Inputs.TeamRoutingRuleTimeRestrictionArgs>());
            set => _timeRestrictions = value;
        }

        /// <summary>
        /// Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        /// </summary>
        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        public TeamRoutingRuleArgs()
        {
        }
        public static new TeamRoutingRuleArgs Empty => new TeamRoutingRuleArgs();
    }

    public sealed class TeamRoutingRuleState : global::Pulumi.ResourceArgs
    {
        [Input("criterias")]
        private InputList<Inputs.TeamRoutingRuleCriteriaGetArgs>? _criterias;

        /// <summary>
        /// You can refer Criteria for detailed information about criteria and its fields
        /// </summary>
        public InputList<Inputs.TeamRoutingRuleCriteriaGetArgs> Criterias
        {
            get => _criterias ?? (_criterias = new InputList<Inputs.TeamRoutingRuleCriteriaGetArgs>());
            set => _criterias = value;
        }

        /// <summary>
        /// Only use when importing default routing rule
        /// </summary>
        [Input("isDefault")]
        public Input<bool>? IsDefault { get; set; }

        /// <summary>
        /// Name of the team routing rule
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notifies")]
        private InputList<Inputs.TeamRoutingRuleNotifyGetArgs>? _notifies;

        /// <summary>
        /// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        /// </summary>
        public InputList<Inputs.TeamRoutingRuleNotifyGetArgs> Notifies
        {
            get => _notifies ?? (_notifies = new InputList<Inputs.TeamRoutingRuleNotifyGetArgs>());
            set => _notifies = value;
        }

        /// <summary>
        /// The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        /// <summary>
        /// Id of the team owning the routing rule
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        [Input("timeRestrictions")]
        private InputList<Inputs.TeamRoutingRuleTimeRestrictionGetArgs>? _timeRestrictions;

        /// <summary>
        /// You can refer Time Restriction for detailed information about time restriction and its fields.
        /// </summary>
        public InputList<Inputs.TeamRoutingRuleTimeRestrictionGetArgs> TimeRestrictions
        {
            get => _timeRestrictions ?? (_timeRestrictions = new InputList<Inputs.TeamRoutingRuleTimeRestrictionGetArgs>());
            set => _timeRestrictions = value;
        }

        /// <summary>
        /// Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        /// </summary>
        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        public TeamRoutingRuleState()
        {
        }
        public static new TeamRoutingRuleState Empty => new TeamRoutingRuleState();
    }
}
