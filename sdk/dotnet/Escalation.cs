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
    /// Manages an Escalation within Opsgenie.
    /// 
    /// ## Example Usage
    /// 
    /// An escalation with a single rule
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Opsgenie = Pulumi.Opsgenie;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Opsgenie.Escalation("default", new()
    ///     {
    ///         Name = "genieescalation",
    ///         Rules = new[]
    ///         {
    ///             new Opsgenie.Inputs.EscalationRuleArgs
    ///             {
    ///                 Condition = "if-not-acked",
    ///                 NotifyType = "default",
    ///                 Delay = 1,
    ///                 Recipients = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.EscalationRuleRecipientArgs
    ///                     {
    ///                         Type = "user",
    ///                         Id = test.Id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// An escalation with a multiple rules
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Opsgenie = Pulumi.Opsgenie;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var @default = new Opsgenie.Escalation("default", new()
    ///     {
    ///         Name = "genieescalation",
    ///         Description = "test",
    ///         OwnerTeamId = testOpsgenieTeam.Id,
    ///         Rules = new[]
    ///         {
    ///             new Opsgenie.Inputs.EscalationRuleArgs
    ///             {
    ///                 Condition = "if-not-acked",
    ///                 NotifyType = "default",
    ///                 Delay = 1,
    ///                 Recipients = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.EscalationRuleRecipientArgs
    ///                     {
    ///                         Type = "user",
    ///                         Id = test.Id,
    ///                     },
    ///                 },
    ///             },
    ///             new Opsgenie.Inputs.EscalationRuleArgs
    ///             {
    ///                 Condition = "if-not-acked",
    ///                 NotifyType = "default",
    ///                 Delay = 1,
    ///                 Recipients = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.EscalationRuleRecipientArgs
    ///                     {
    ///                         Type = "team",
    ///                         Id = testOpsgenieTeam.Id,
    ///                     },
    ///                 },
    ///             },
    ///             new Opsgenie.Inputs.EscalationRuleArgs
    ///             {
    ///                 Condition = "if-not-acked",
    ///                 NotifyType = "default",
    ///                 Delay = 1,
    ///                 Recipients = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.EscalationRuleRecipientArgs
    ///                     {
    ///                         Type = "schedule",
    ///                         Id = testOpsgenieSchedule.Id,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Repeats = new[]
    ///         {
    ///             new Opsgenie.Inputs.EscalationRepeatArgs
    ///             {
    ///                 WaitInterval = 10,
    ///                 Count = 1,
    ///                 ResetRecipientStates = true,
    ///                 CloseAlertAfterAll = false,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Escalations can be imported using the `escalation_id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import opsgenie:index/escalation:Escalation test escalation_id`
    /// ```
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/escalation:Escalation")]
    public partial class Escalation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the escalation.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the escalation.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Owner team id of the escalation.
        /// </summary>
        [Output("ownerTeamId")]
        public Output<string?> OwnerTeamId { get; private set; } = null!;

        /// <summary>
        /// Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
        /// </summary>
        [Output("repeats")]
        public Output<ImmutableArray<Outputs.EscalationRepeat>> Repeats { get; private set; } = null!;

        /// <summary>
        /// List of the escalation rules. See below for how rules are defined.
        /// </summary>
        [Output("rules")]
        public Output<ImmutableArray<Outputs.EscalationRule>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a Escalation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Escalation(string name, EscalationArgs args, CustomResourceOptions? options = null)
            : base("opsgenie:index/escalation:Escalation", name, args ?? new EscalationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Escalation(string name, Input<string> id, EscalationState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/escalation:Escalation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Escalation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Escalation Get(string name, Input<string> id, EscalationState? state = null, CustomResourceOptions? options = null)
        {
            return new Escalation(name, id, state, options);
        }
    }

    public sealed class EscalationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the escalation.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the escalation.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Owner team id of the escalation.
        /// </summary>
        [Input("ownerTeamId")]
        public Input<string>? OwnerTeamId { get; set; }

        [Input("repeats")]
        private InputList<Inputs.EscalationRepeatArgs>? _repeats;

        /// <summary>
        /// Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
        /// </summary>
        public InputList<Inputs.EscalationRepeatArgs> Repeats
        {
            get => _repeats ?? (_repeats = new InputList<Inputs.EscalationRepeatArgs>());
            set => _repeats = value;
        }

        [Input("rules", required: true)]
        private InputList<Inputs.EscalationRuleArgs>? _rules;

        /// <summary>
        /// List of the escalation rules. See below for how rules are defined.
        /// </summary>
        public InputList<Inputs.EscalationRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.EscalationRuleArgs>());
            set => _rules = value;
        }

        public EscalationArgs()
        {
        }
        public static new EscalationArgs Empty => new EscalationArgs();
    }

    public sealed class EscalationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the escalation.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the escalation.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Owner team id of the escalation.
        /// </summary>
        [Input("ownerTeamId")]
        public Input<string>? OwnerTeamId { get; set; }

        [Input("repeats")]
        private InputList<Inputs.EscalationRepeatGetArgs>? _repeats;

        /// <summary>
        /// Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
        /// </summary>
        public InputList<Inputs.EscalationRepeatGetArgs> Repeats
        {
            get => _repeats ?? (_repeats = new InputList<Inputs.EscalationRepeatGetArgs>());
            set => _repeats = value;
        }

        [Input("rules")]
        private InputList<Inputs.EscalationRuleGetArgs>? _rules;

        /// <summary>
        /// List of the escalation rules. See below for how rules are defined.
        /// </summary>
        public InputList<Inputs.EscalationRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.EscalationRuleGetArgs>());
            set => _rules = value;
        }

        public EscalationState()
        {
        }
        public static new EscalationState Empty => new EscalationState();
    }
}
