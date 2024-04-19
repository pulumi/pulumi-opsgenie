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
    /// Manages a Service Incident Rule within Opsgenie.
    /// 
    /// ## Example Usage
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
    ///     var test = new Opsgenie.Team("test", new()
    ///     {
    ///         Name = "example-team",
    ///         Description = "This team deals with all the things",
    ///     });
    /// 
    ///     var testService = new Opsgenie.Service("test", new()
    ///     {
    ///         Name = "example-service",
    ///         TeamId = test.Id,
    ///     });
    /// 
    ///     var testServiceIncidentRule = new Opsgenie.ServiceIncidentRule("test", new()
    ///     {
    ///         ServiceId = testService.Id,
    ///         IncidentRules = new[]
    ///         {
    ///             new Opsgenie.Inputs.ServiceIncidentRuleIncidentRuleArgs
    ///             {
    ///                 ConditionMatchType = "match-any-condition",
    ///                 Conditions = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.ServiceIncidentRuleIncidentRuleConditionArgs
    ///                     {
    ///                         Field = "message",
    ///                         Not = false,
    ///                         Operation = "contains",
    ///                         ExpectedValue = "expected1",
    ///                     },
    ///                     new Opsgenie.Inputs.ServiceIncidentRuleIncidentRuleConditionArgs
    ///                     {
    ///                         Field = "message",
    ///                         Not = false,
    ///                         Operation = "contains",
    ///                         ExpectedValue = "expected2",
    ///                     },
    ///                 },
    ///                 IncidentProperties = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.ServiceIncidentRuleIncidentRuleIncidentPropertyArgs
    ///                     {
    ///                         Message = "This is a test message",
    ///                         Priority = "P3",
    ///                         StakeholderProperties = new[]
    ///                         {
    ///                             new Opsgenie.Inputs.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs
    ///                             {
    ///                                 Message = "Message for stakeholders",
    ///                                 Enable = true,
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
    /// 
    /// ## Import
    /// 
    /// Service Incident Rule can be imported using the `service_id/service_incident_rule_id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import opsgenie:index/serviceIncidentRule:ServiceIncidentRule this service_id/service_incident_rule_id`
    /// ```
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/serviceIncidentRule:ServiceIncidentRule")]
    public partial class ServiceIncidentRule : global::Pulumi.CustomResource
    {
        /// <summary>
        /// This is the rule configuration for this incident rule. This is a block, structure is documented below.
        /// </summary>
        [Output("incidentRules")]
        public Output<ImmutableArray<Outputs.ServiceIncidentRuleIncidentRule>> IncidentRules { get; private set; } = null!;

        /// <summary>
        /// ID of the service associated
        /// </summary>
        [Output("serviceId")]
        public Output<string> ServiceId { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceIncidentRule resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceIncidentRule(string name, ServiceIncidentRuleArgs args, CustomResourceOptions? options = null)
            : base("opsgenie:index/serviceIncidentRule:ServiceIncidentRule", name, args ?? new ServiceIncidentRuleArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceIncidentRule(string name, Input<string> id, ServiceIncidentRuleState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/serviceIncidentRule:ServiceIncidentRule", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServiceIncidentRule resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceIncidentRule Get(string name, Input<string> id, ServiceIncidentRuleState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceIncidentRule(name, id, state, options);
        }
    }

    public sealed class ServiceIncidentRuleArgs : global::Pulumi.ResourceArgs
    {
        [Input("incidentRules", required: true)]
        private InputList<Inputs.ServiceIncidentRuleIncidentRuleArgs>? _incidentRules;

        /// <summary>
        /// This is the rule configuration for this incident rule. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.ServiceIncidentRuleIncidentRuleArgs> IncidentRules
        {
            get => _incidentRules ?? (_incidentRules = new InputList<Inputs.ServiceIncidentRuleIncidentRuleArgs>());
            set => _incidentRules = value;
        }

        /// <summary>
        /// ID of the service associated
        /// </summary>
        [Input("serviceId", required: true)]
        public Input<string> ServiceId { get; set; } = null!;

        public ServiceIncidentRuleArgs()
        {
        }
        public static new ServiceIncidentRuleArgs Empty => new ServiceIncidentRuleArgs();
    }

    public sealed class ServiceIncidentRuleState : global::Pulumi.ResourceArgs
    {
        [Input("incidentRules")]
        private InputList<Inputs.ServiceIncidentRuleIncidentRuleGetArgs>? _incidentRules;

        /// <summary>
        /// This is the rule configuration for this incident rule. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.ServiceIncidentRuleIncidentRuleGetArgs> IncidentRules
        {
            get => _incidentRules ?? (_incidentRules = new InputList<Inputs.ServiceIncidentRuleIncidentRuleGetArgs>());
            set => _incidentRules = value;
        }

        /// <summary>
        /// ID of the service associated
        /// </summary>
        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        public ServiceIncidentRuleState()
        {
        }
        public static new ServiceIncidentRuleState Empty => new ServiceIncidentRuleState();
    }
}
