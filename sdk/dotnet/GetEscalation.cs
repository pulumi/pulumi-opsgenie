// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.Opsgenie
{
    public static class GetEscalation
    {
        /// <summary>
        /// Manages an Escalation within Opsgenie.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Opsgenie = Pulumi.Opsgenie;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Opsgenie.GetEscalation.InvokeAsync(new Opsgenie.GetEscalationArgs
        ///         {
        ///             Name = "existing-escalation",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetEscalationResult> InvokeAsync(GetEscalationArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetEscalationResult>("opsgenie:index/getEscalation:getEscalation", args ?? new GetEscalationArgs(), options.WithVersion());

        /// <summary>
        /// Manages an Escalation within Opsgenie.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Opsgenie = Pulumi.Opsgenie;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var test = Output.Create(Opsgenie.GetEscalation.InvokeAsync(new Opsgenie.GetEscalationArgs
        ///         {
        ///             Name = "existing-escalation",
        ///         }));
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetEscalationResult> Invoke(GetEscalationInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetEscalationResult>("opsgenie:index/getEscalation:getEscalation", args ?? new GetEscalationInvokeArgs(), options.WithVersion());
    }


    public sealed class GetEscalationArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Escalation Description
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// Name of the escalation.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// If owner team exist the id of the team is exported
        /// </summary>
        [Input("ownerTeamId")]
        public string? OwnerTeamId { get; set; }

        [Input("repeats")]
        private List<Inputs.GetEscalationRepeatArgs>? _repeats;

        /// <summary>
        /// Escalation repeat preferences
        /// </summary>
        public List<Inputs.GetEscalationRepeatArgs> Repeats
        {
            get => _repeats ?? (_repeats = new List<Inputs.GetEscalationRepeatArgs>());
            set => _repeats = value;
        }

        [Input("rules")]
        private List<Inputs.GetEscalationRuleArgs>? _rules;

        /// <summary>
        /// Escalation rules
        /// </summary>
        public List<Inputs.GetEscalationRuleArgs> Rules
        {
            get => _rules ?? (_rules = new List<Inputs.GetEscalationRuleArgs>());
            set => _rules = value;
        }

        public GetEscalationArgs()
        {
        }
    }

    public sealed class GetEscalationInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Escalation Description
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the escalation.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// If owner team exist the id of the team is exported
        /// </summary>
        [Input("ownerTeamId")]
        public Input<string>? OwnerTeamId { get; set; }

        [Input("repeats")]
        private InputList<Inputs.GetEscalationRepeatInputArgs>? _repeats;

        /// <summary>
        /// Escalation repeat preferences
        /// </summary>
        public InputList<Inputs.GetEscalationRepeatInputArgs> Repeats
        {
            get => _repeats ?? (_repeats = new InputList<Inputs.GetEscalationRepeatInputArgs>());
            set => _repeats = value;
        }

        [Input("rules")]
        private InputList<Inputs.GetEscalationRuleInputArgs>? _rules;

        /// <summary>
        /// Escalation rules
        /// </summary>
        public InputList<Inputs.GetEscalationRuleInputArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.GetEscalationRuleInputArgs>());
            set => _rules = value;
        }

        public GetEscalationInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetEscalationResult
    {
        /// <summary>
        /// Escalation Description
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        /// <summary>
        /// If owner team exist the id of the team is exported
        /// </summary>
        public readonly string? OwnerTeamId;
        /// <summary>
        /// Escalation repeat preferences
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEscalationRepeatResult> Repeats;
        /// <summary>
        /// Escalation rules
        /// </summary>
        public readonly ImmutableArray<Outputs.GetEscalationRuleResult> Rules;

        [OutputConstructor]
        private GetEscalationResult(
            string? description,

            string id,

            string name,

            string? ownerTeamId,

            ImmutableArray<Outputs.GetEscalationRepeatResult> repeats,

            ImmutableArray<Outputs.GetEscalationRuleResult> rules)
        {
            Description = description;
            Id = id;
            Name = name;
            OwnerTeamId = ownerTeamId;
            Repeats = repeats;
            Rules = rules;
        }
    }
}
