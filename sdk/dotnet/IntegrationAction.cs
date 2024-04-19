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
    /// Manages advanced actions for Integrations within Opsgenie. This applies for the following resources:
    /// * `opsgenie.ApiIntegration`
    /// * `opsgenie.EmailIntegration`
    /// 
    /// The actions that are supported are:
    /// * `create`
    /// * `close`
    /// * `acknowledge`
    /// * `add_note`
    /// * `ignore`
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Opsgenie = Pulumi.Opsgenie;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var testAction = new Opsgenie.IntegrationAction("test_action", new()
    ///     {
    ///         IntegrationId = testOpsgenieApiIntegration.Id,
    ///         Creates = new[]
    ///         {
    ///             new Opsgenie.Inputs.IntegrationActionCreateArgs
    ///             {
    ///                 Name = "create action",
    ///                 Tags = new[]
    ///                 {
    ///                     "CRITICAL",
    ///                     "SEV-0",
    ///                 },
    ///                 User = "Example-service",
    ///                 Note = "{{note}}",
    ///                 Alias = "{{alias}}",
    ///                 Source = "{{source}}",
    ///                 Message = "{{message}}",
    ///                 Description = "{{description}}",
    ///                 Entity = "{{entity}}",
    ///                 AlertActions = new[]
    ///                 {
    ///                     "Runbook ID#342",
    ///                 },
    ///                 Filters = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.IntegrationActionCreateFilterArgs
    ///                     {
    ///                         Type = "match-all-conditions",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Opsgenie.Inputs.IntegrationActionCreateFilterConditionArgs
    ///                             {
    ///                                 Field = "priority",
    ///                                 Operation = "equals",
    ///                                 ExpectedValue = "P1",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 Responders = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.IntegrationActionCreateResponderArgs
    ///                     {
    ///                         Id = test.Id,
    ///                         Type = "team",
    ///                     },
    ///                 },
    ///             },
    ///             new Opsgenie.Inputs.IntegrationActionCreateArgs
    ///             {
    ///                 Name = "create action with multiline description",
    ///                 Message = "{{message}}",
    ///                 Description = Std.Chomp.Invoke(new()
    ///                 {
    ///                     Input = @"This
    /// is a multiline
    /// description.
    /// ",
    ///                 }).Apply(invoke =&gt; invoke.Result),
    ///                 Filters = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.IntegrationActionCreateFilterArgs
    ///                     {
    ///                         Type = "match-all-conditions",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Opsgenie.Inputs.IntegrationActionCreateFilterConditionArgs
    ///                             {
    ///                                 Field = "priority",
    ///                                 Operation = "equals",
    ///                                 ExpectedValue = "P1",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             new Opsgenie.Inputs.IntegrationActionCreateArgs
    ///             {
    ///                 Name = "Create medium priority alerts",
    ///                 Tags = new[]
    ///                 {
    ///                     "SEVERE",
    ///                     "SEV-1",
    ///                 },
    ///                 Priority = "P3",
    ///                 Filters = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.IntegrationActionCreateFilterArgs
    ///                     {
    ///                         Type = "match-all-conditions",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Opsgenie.Inputs.IntegrationActionCreateFilterConditionArgs
    ///                             {
    ///                                 Field = "priority",
    ///                                 Operation = "equals",
    ///                                 ExpectedValue = "P2",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///             new Opsgenie.Inputs.IntegrationActionCreateArgs
    ///             {
    ///                 Name = "Create alert with priority from message",
    ///                 CustomPriority = "{{message.substringAfter(\"[custom]\")}}",
    ///                 Filters = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.IntegrationActionCreateFilterArgs
    ///                     {
    ///                         Type = "match-all-conditions",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Opsgenie.Inputs.IntegrationActionCreateFilterConditionArgs
    ///                             {
    ///                                 Field = "tags",
    ///                                 Operation = "contains",
    ///                                 ExpectedValue = "P5",
    ///                             },
    ///                             new Opsgenie.Inputs.IntegrationActionCreateFilterConditionArgs
    ///                             {
    ///                                 Field = "message",
    ///                                 Operation = "starts-with",
    ///                                 ExpectedValue = "[custom]",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Closes = new[]
    ///         {
    ///             new Opsgenie.Inputs.IntegrationActionCloseArgs
    ///             {
    ///                 Name = "Low priority alerts",
    ///                 Filters = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.IntegrationActionCloseFilterArgs
    ///                     {
    ///                         Type = "match-any-condition",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Opsgenie.Inputs.IntegrationActionCloseFilterConditionArgs
    ///                             {
    ///                                 Field = "priority",
    ///                                 Operation = "equals",
    ///                                 ExpectedValue = "P5",
    ///                             },
    ///                             new Opsgenie.Inputs.IntegrationActionCloseFilterConditionArgs
    ///                             {
    ///                                 Field = "message",
    ///                                 Operation = "contains",
    ///                                 ExpectedValue = "DEBUG",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Acknowledges = new[]
    ///         {
    ///             new Opsgenie.Inputs.IntegrationActionAcknowledgeArgs
    ///             {
    ///                 Name = "Auto-ack test alerts",
    ///                 Filters = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.IntegrationActionAcknowledgeFilterArgs
    ///                     {
    ///                         Type = "match-all-conditions",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Opsgenie.Inputs.IntegrationActionAcknowledgeFilterConditionArgs
    ///                             {
    ///                                 Field = "message",
    ///                                 Not = true,
    ///                                 Operation = "contains",
    ///                                 ExpectedValue = "TEST",
    ///                             },
    ///                             new Opsgenie.Inputs.IntegrationActionAcknowledgeFilterConditionArgs
    ///                             {
    ///                                 Field = "priority",
    ///                                 Operation = "equals",
    ///                                 ExpectedValue = "P5",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         AddNotes = new[]
    ///         {
    ///             new Opsgenie.Inputs.IntegrationActionAddNoteArgs
    ///             {
    ///                 Name = "Add note to all alerts",
    ///                 Note = "Created from test integration",
    ///                 Filters = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.IntegrationActionAddNoteFilterArgs
    ///                     {
    ///                         Type = "match-all",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Ignores = new[]
    ///         {
    ///             new Opsgenie.Inputs.IntegrationActionIgnoreArgs
    ///             {
    ///                 Name = "Ignore alerts with ignore tag",
    ///                 Filters = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.IntegrationActionIgnoreFilterArgs
    ///                     {
    ///                         Type = "match-all-conditions",
    ///                         Conditions = new[]
    ///                         {
    ///                             new Opsgenie.Inputs.IntegrationActionIgnoreFilterConditionArgs
    ///                             {
    ///                                 Field = "tags",
    ///                                 Operation = "contains",
    ///                                 ExpectedValue = "ignore",
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/integrationAction:IntegrationAction")]
    public partial class IntegrationAction : global::Pulumi.CustomResource
    {
        [Output("acknowledges")]
        public Output<ImmutableArray<Outputs.IntegrationActionAcknowledge>> Acknowledges { get; private set; } = null!;

        [Output("addNotes")]
        public Output<ImmutableArray<Outputs.IntegrationActionAddNote>> AddNotes { get; private set; } = null!;

        [Output("closes")]
        public Output<ImmutableArray<Outputs.IntegrationActionClose>> Closes { get; private set; } = null!;

        [Output("creates")]
        public Output<ImmutableArray<Outputs.IntegrationActionCreate>> Creates { get; private set; } = null!;

        [Output("ignores")]
        public Output<ImmutableArray<Outputs.IntegrationActionIgnore>> Ignores { get; private set; } = null!;

        /// <summary>
        /// ID of the parent integration resource to bind to.
        /// </summary>
        [Output("integrationId")]
        public Output<string> IntegrationId { get; private set; } = null!;


        /// <summary>
        /// Create a IntegrationAction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public IntegrationAction(string name, IntegrationActionArgs args, CustomResourceOptions? options = null)
            : base("opsgenie:index/integrationAction:IntegrationAction", name, args ?? new IntegrationActionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private IntegrationAction(string name, Input<string> id, IntegrationActionState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/integrationAction:IntegrationAction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing IntegrationAction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static IntegrationAction Get(string name, Input<string> id, IntegrationActionState? state = null, CustomResourceOptions? options = null)
        {
            return new IntegrationAction(name, id, state, options);
        }
    }

    public sealed class IntegrationActionArgs : global::Pulumi.ResourceArgs
    {
        [Input("acknowledges")]
        private InputList<Inputs.IntegrationActionAcknowledgeArgs>? _acknowledges;
        public InputList<Inputs.IntegrationActionAcknowledgeArgs> Acknowledges
        {
            get => _acknowledges ?? (_acknowledges = new InputList<Inputs.IntegrationActionAcknowledgeArgs>());
            set => _acknowledges = value;
        }

        [Input("addNotes")]
        private InputList<Inputs.IntegrationActionAddNoteArgs>? _addNotes;
        public InputList<Inputs.IntegrationActionAddNoteArgs> AddNotes
        {
            get => _addNotes ?? (_addNotes = new InputList<Inputs.IntegrationActionAddNoteArgs>());
            set => _addNotes = value;
        }

        [Input("closes")]
        private InputList<Inputs.IntegrationActionCloseArgs>? _closes;
        public InputList<Inputs.IntegrationActionCloseArgs> Closes
        {
            get => _closes ?? (_closes = new InputList<Inputs.IntegrationActionCloseArgs>());
            set => _closes = value;
        }

        [Input("creates")]
        private InputList<Inputs.IntegrationActionCreateArgs>? _creates;
        public InputList<Inputs.IntegrationActionCreateArgs> Creates
        {
            get => _creates ?? (_creates = new InputList<Inputs.IntegrationActionCreateArgs>());
            set => _creates = value;
        }

        [Input("ignores")]
        private InputList<Inputs.IntegrationActionIgnoreArgs>? _ignores;
        public InputList<Inputs.IntegrationActionIgnoreArgs> Ignores
        {
            get => _ignores ?? (_ignores = new InputList<Inputs.IntegrationActionIgnoreArgs>());
            set => _ignores = value;
        }

        /// <summary>
        /// ID of the parent integration resource to bind to.
        /// </summary>
        [Input("integrationId", required: true)]
        public Input<string> IntegrationId { get; set; } = null!;

        public IntegrationActionArgs()
        {
        }
        public static new IntegrationActionArgs Empty => new IntegrationActionArgs();
    }

    public sealed class IntegrationActionState : global::Pulumi.ResourceArgs
    {
        [Input("acknowledges")]
        private InputList<Inputs.IntegrationActionAcknowledgeGetArgs>? _acknowledges;
        public InputList<Inputs.IntegrationActionAcknowledgeGetArgs> Acknowledges
        {
            get => _acknowledges ?? (_acknowledges = new InputList<Inputs.IntegrationActionAcknowledgeGetArgs>());
            set => _acknowledges = value;
        }

        [Input("addNotes")]
        private InputList<Inputs.IntegrationActionAddNoteGetArgs>? _addNotes;
        public InputList<Inputs.IntegrationActionAddNoteGetArgs> AddNotes
        {
            get => _addNotes ?? (_addNotes = new InputList<Inputs.IntegrationActionAddNoteGetArgs>());
            set => _addNotes = value;
        }

        [Input("closes")]
        private InputList<Inputs.IntegrationActionCloseGetArgs>? _closes;
        public InputList<Inputs.IntegrationActionCloseGetArgs> Closes
        {
            get => _closes ?? (_closes = new InputList<Inputs.IntegrationActionCloseGetArgs>());
            set => _closes = value;
        }

        [Input("creates")]
        private InputList<Inputs.IntegrationActionCreateGetArgs>? _creates;
        public InputList<Inputs.IntegrationActionCreateGetArgs> Creates
        {
            get => _creates ?? (_creates = new InputList<Inputs.IntegrationActionCreateGetArgs>());
            set => _creates = value;
        }

        [Input("ignores")]
        private InputList<Inputs.IntegrationActionIgnoreGetArgs>? _ignores;
        public InputList<Inputs.IntegrationActionIgnoreGetArgs> Ignores
        {
            get => _ignores ?? (_ignores = new InputList<Inputs.IntegrationActionIgnoreGetArgs>());
            set => _ignores = value;
        }

        /// <summary>
        /// ID of the parent integration resource to bind to.
        /// </summary>
        [Input("integrationId")]
        public Input<string>? IntegrationId { get; set; }

        public IntegrationActionState()
        {
        }
        public static new IntegrationActionState Empty => new IntegrationActionState();
    }
}
