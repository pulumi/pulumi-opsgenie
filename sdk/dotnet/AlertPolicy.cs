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
    /// Manages a Alert Policy within Opsgenie.
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
    ///     var testTeam = new Opsgenie.Team("testTeam", new()
    ///     {
    ///         Description = "This team deals with all the things",
    ///     });
    /// 
    ///     var testAlertPolicy = new Opsgenie.AlertPolicy("testAlertPolicy", new()
    ///     {
    ///         TeamId = testTeam.Id,
    ///         PolicyDescription = "This is sample policy",
    ///         Message = "{{message}}",
    ///         Filters = new[]
    ///         {
    ///             null,
    ///         },
    ///         TimeRestrictions = new[]
    ///         {
    ///             new Opsgenie.Inputs.AlertPolicyTimeRestrictionArgs
    ///             {
    ///                 Type = "weekday-and-time-of-day",
    ///                 RestrictionList = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.AlertPolicyTimeRestrictionRestrictionListArgs
    ///                     {
    ///                         EndDay = "monday",
    ///                         EndHour = 7,
    ///                         EndMin = 0,
    ///                         StartDay = "sunday",
    ///                         StartHour = 21,
    ///                         StartMin = 0,
    ///                     },
    ///                     new Opsgenie.Inputs.AlertPolicyTimeRestrictionRestrictionListArgs
    ///                     {
    ///                         EndDay = "tuesday",
    ///                         EndHour = 7,
    ///                         EndMin = 0,
    ///                         StartDay = "monday",
    ///                         StartHour = 22,
    ///                         StartMin = 0,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Alert policies can be imported using the `team_id/policy_id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import opsgenie:index/alertPolicy:AlertPolicy test team_id/policy_id`
    /// ```
    /// 
    ///  You can import global polices using only policy identifier
    /// 
    /// ```sh
    ///  $ pulumi import opsgenie:index/alertPolicy:AlertPolicy test policy_id`
    /// ```
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/alertPolicy:AlertPolicy")]
    public partial class AlertPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Actions to add to the alerts original actions value as a list of strings. If `ignore_original_actions` field is set to `true`, this will replace the original actions.
        /// </summary>
        [Output("actions")]
        public Output<ImmutableArray<string>> Actions { get; private set; } = null!;

        /// <summary>
        /// Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
        /// </summary>
        [Output("alertDescription")]
        public Output<string?> AlertDescription { get; private set; } = null!;

        /// <summary>
        /// Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
        /// </summary>
        [Output("alias")]
        public Output<string?> Alias { get; private set; } = null!;

        /// <summary>
        /// It will trigger other modify policies if set to `true`. Default: `false`
        /// </summary>
        [Output("continuePolicy")]
        public Output<bool?> ContinuePolicy { get; private set; } = null!;

        /// <summary>
        /// If policy should be enabled. Default: `true`
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
        /// </summary>
        [Output("entity")]
        public Output<string?> Entity { get; private set; } = null!;

        /// <summary>
        /// A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
        /// </summary>
        [Output("filters")]
        public Output<ImmutableArray<Outputs.AlertPolicyFilter>> Filters { get; private set; } = null!;

        /// <summary>
        /// If set to `true`, policy will ignore the original actions of the alert. Default: `false`
        /// </summary>
        [Output("ignoreOriginalActions")]
        public Output<bool?> IgnoreOriginalActions { get; private set; } = null!;

        /// <summary>
        /// If set to `true`, policy will ignore the original details of the alert. Default: `false`
        /// </summary>
        [Output("ignoreOriginalDetails")]
        public Output<bool?> IgnoreOriginalDetails { get; private set; } = null!;

        /// <summary>
        /// If set to `true`, policy will ignore the original responders of the alert. Default: `false`
        /// </summary>
        [Output("ignoreOriginalResponders")]
        public Output<bool?> IgnoreOriginalResponders { get; private set; } = null!;

        /// <summary>
        /// If set to `true`, policy will ignore the original tags of the alert. Default: `false`
        /// </summary>
        [Output("ignoreOriginalTags")]
        public Output<bool?> IgnoreOriginalTags { get; private set; } = null!;

        /// <summary>
        /// Message of the alerts
        /// </summary>
        [Output("message")]
        public Output<string> Message { get; private set; } = null!;

        /// <summary>
        /// Name of the alert policy
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Description of the policy. This can be max 512 characters.
        /// </summary>
        [Output("policyDescription")]
        public Output<string?> PolicyDescription { get; private set; } = null!;

        /// <summary>
        /// Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
        /// </summary>
        [Output("priority")]
        public Output<string?> Priority { get; private set; } = null!;

        /// <summary>
        /// Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignore_original_responders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`. This is a block, structure is documented below.
        /// </summary>
        [Output("responders")]
        public Output<ImmutableArray<Outputs.AlertPolicyResponder>> Responders { get; private set; } = null!;

        /// <summary>
        /// Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
        /// </summary>
        [Output("source")]
        public Output<string?> Source { get; private set; } = null!;

        /// <summary>
        /// Tags to add to the alerts original tags value as a list of strings. If `ignore_original_responders` field is set to `true`, this will replace the original responders.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Id of team that this policy belongs to.
        /// </summary>
        [Output("teamId")]
        public Output<string?> TeamId { get; private set; } = null!;

        /// <summary>
        /// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
        /// </summary>
        [Output("timeRestrictions")]
        public Output<ImmutableArray<Outputs.AlertPolicyTimeRestriction>> TimeRestrictions { get; private set; } = null!;


        /// <summary>
        /// Create a AlertPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AlertPolicy(string name, AlertPolicyArgs args, CustomResourceOptions? options = null)
            : base("opsgenie:index/alertPolicy:AlertPolicy", name, args ?? new AlertPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AlertPolicy(string name, Input<string> id, AlertPolicyState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/alertPolicy:AlertPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AlertPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AlertPolicy Get(string name, Input<string> id, AlertPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new AlertPolicy(name, id, state, options);
        }
    }

    public sealed class AlertPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<string>? _actions;

        /// <summary>
        /// Actions to add to the alerts original actions value as a list of strings. If `ignore_original_actions` field is set to `true`, this will replace the original actions.
        /// </summary>
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        /// <summary>
        /// Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
        /// </summary>
        [Input("alertDescription")]
        public Input<string>? AlertDescription { get; set; }

        /// <summary>
        /// Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// It will trigger other modify policies if set to `true`. Default: `false`
        /// </summary>
        [Input("continuePolicy")]
        public Input<bool>? ContinuePolicy { get; set; }

        /// <summary>
        /// If policy should be enabled. Default: `true`
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
        /// </summary>
        [Input("entity")]
        public Input<string>? Entity { get; set; }

        [Input("filters")]
        private InputList<Inputs.AlertPolicyFilterArgs>? _filters;

        /// <summary>
        /// A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.AlertPolicyFilterArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.AlertPolicyFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If set to `true`, policy will ignore the original actions of the alert. Default: `false`
        /// </summary>
        [Input("ignoreOriginalActions")]
        public Input<bool>? IgnoreOriginalActions { get; set; }

        /// <summary>
        /// If set to `true`, policy will ignore the original details of the alert. Default: `false`
        /// </summary>
        [Input("ignoreOriginalDetails")]
        public Input<bool>? IgnoreOriginalDetails { get; set; }

        /// <summary>
        /// If set to `true`, policy will ignore the original responders of the alert. Default: `false`
        /// </summary>
        [Input("ignoreOriginalResponders")]
        public Input<bool>? IgnoreOriginalResponders { get; set; }

        /// <summary>
        /// If set to `true`, policy will ignore the original tags of the alert. Default: `false`
        /// </summary>
        [Input("ignoreOriginalTags")]
        public Input<bool>? IgnoreOriginalTags { get; set; }

        /// <summary>
        /// Message of the alerts
        /// </summary>
        [Input("message", required: true)]
        public Input<string> Message { get; set; } = null!;

        /// <summary>
        /// Name of the alert policy
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Description of the policy. This can be max 512 characters.
        /// </summary>
        [Input("policyDescription")]
        public Input<string>? PolicyDescription { get; set; }

        /// <summary>
        /// Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
        /// </summary>
        [Input("priority")]
        public Input<string>? Priority { get; set; }

        [Input("responders")]
        private InputList<Inputs.AlertPolicyResponderArgs>? _responders;

        /// <summary>
        /// Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignore_original_responders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.AlertPolicyResponderArgs> Responders
        {
            get => _responders ?? (_responders = new InputList<Inputs.AlertPolicyResponderArgs>());
            set => _responders = value;
        }

        /// <summary>
        /// Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to add to the alerts original tags value as a list of strings. If `ignore_original_responders` field is set to `true`, this will replace the original responders.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Id of team that this policy belongs to.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        [Input("timeRestrictions")]
        private InputList<Inputs.AlertPolicyTimeRestrictionArgs>? _timeRestrictions;

        /// <summary>
        /// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.AlertPolicyTimeRestrictionArgs> TimeRestrictions
        {
            get => _timeRestrictions ?? (_timeRestrictions = new InputList<Inputs.AlertPolicyTimeRestrictionArgs>());
            set => _timeRestrictions = value;
        }

        public AlertPolicyArgs()
        {
        }
        public static new AlertPolicyArgs Empty => new AlertPolicyArgs();
    }

    public sealed class AlertPolicyState : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<string>? _actions;

        /// <summary>
        /// Actions to add to the alerts original actions value as a list of strings. If `ignore_original_actions` field is set to `true`, this will replace the original actions.
        /// </summary>
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        /// <summary>
        /// Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
        /// </summary>
        [Input("alertDescription")]
        public Input<string>? AlertDescription { get; set; }

        /// <summary>
        /// Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        /// <summary>
        /// It will trigger other modify policies if set to `true`. Default: `false`
        /// </summary>
        [Input("continuePolicy")]
        public Input<bool>? ContinuePolicy { get; set; }

        /// <summary>
        /// If policy should be enabled. Default: `true`
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
        /// </summary>
        [Input("entity")]
        public Input<string>? Entity { get; set; }

        [Input("filters")]
        private InputList<Inputs.AlertPolicyFilterGetArgs>? _filters;

        /// <summary>
        /// A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.AlertPolicyFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.AlertPolicyFilterGetArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If set to `true`, policy will ignore the original actions of the alert. Default: `false`
        /// </summary>
        [Input("ignoreOriginalActions")]
        public Input<bool>? IgnoreOriginalActions { get; set; }

        /// <summary>
        /// If set to `true`, policy will ignore the original details of the alert. Default: `false`
        /// </summary>
        [Input("ignoreOriginalDetails")]
        public Input<bool>? IgnoreOriginalDetails { get; set; }

        /// <summary>
        /// If set to `true`, policy will ignore the original responders of the alert. Default: `false`
        /// </summary>
        [Input("ignoreOriginalResponders")]
        public Input<bool>? IgnoreOriginalResponders { get; set; }

        /// <summary>
        /// If set to `true`, policy will ignore the original tags of the alert. Default: `false`
        /// </summary>
        [Input("ignoreOriginalTags")]
        public Input<bool>? IgnoreOriginalTags { get; set; }

        /// <summary>
        /// Message of the alerts
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        /// <summary>
        /// Name of the alert policy
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Description of the policy. This can be max 512 characters.
        /// </summary>
        [Input("policyDescription")]
        public Input<string>? PolicyDescription { get; set; }

        /// <summary>
        /// Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
        /// </summary>
        [Input("priority")]
        public Input<string>? Priority { get; set; }

        [Input("responders")]
        private InputList<Inputs.AlertPolicyResponderGetArgs>? _responders;

        /// <summary>
        /// Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignore_original_responders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.AlertPolicyResponderGetArgs> Responders
        {
            get => _responders ?? (_responders = new InputList<Inputs.AlertPolicyResponderGetArgs>());
            set => _responders = value;
        }

        /// <summary>
        /// Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
        /// </summary>
        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to add to the alerts original tags value as a list of strings. If `ignore_original_responders` field is set to `true`, this will replace the original responders.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Id of team that this policy belongs to.
        /// </summary>
        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        [Input("timeRestrictions")]
        private InputList<Inputs.AlertPolicyTimeRestrictionGetArgs>? _timeRestrictions;

        /// <summary>
        /// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.AlertPolicyTimeRestrictionGetArgs> TimeRestrictions
        {
            get => _timeRestrictions ?? (_timeRestrictions = new InputList<Inputs.AlertPolicyTimeRestrictionGetArgs>());
            set => _timeRestrictions = value;
        }

        public AlertPolicyState()
        {
        }
        public static new AlertPolicyState Empty => new AlertPolicyState();
    }
}
