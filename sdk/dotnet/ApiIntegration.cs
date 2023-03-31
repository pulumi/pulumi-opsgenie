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
    /// Manages an API Integration within Opsgenie.
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
    ///     var example_api_integrationApiIntegration = new Opsgenie.ApiIntegration("example-api-integrationApiIntegration", new()
    ///     {
    ///         Type = "API",
    ///         Responders = new[]
    ///         {
    ///             new Opsgenie.Inputs.ApiIntegrationResponderArgs
    ///             {
    ///                 Type = "user",
    ///                 Id = opsgenie_user.User.Id,
    ///             },
    ///             new Opsgenie.Inputs.ApiIntegrationResponderArgs
    ///             {
    ///                 Type = "user",
    ///                 Id = opsgenie_user.Fahri.Id,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var example_api_integrationIndex_apiIntegrationApiIntegration = new Opsgenie.ApiIntegration("example-api-integrationIndex/apiIntegrationApiIntegration", new()
    ///     {
    ///         Type = "Prometheus",
    ///         Responders = new[]
    ///         {
    ///             new Opsgenie.Inputs.ApiIntegrationResponderArgs
    ///             {
    ///                 Type = "user",
    ///                 Id = opsgenie_user.User.Id,
    ///             },
    ///         },
    ///         Enabled = false,
    ///         AllowWriteAccess = false,
    ///         IgnoreRespondersFromPayload = true,
    ///         SuppressNotifications = true,
    ///         OwnerTeamId = opsgenie_team.Team.Id,
    ///     });
    /// 
    ///     var test3 = new Opsgenie.ApiIntegration("test3", new()
    ///     {
    ///         Type = "Webhook",
    ///         Responders = new[]
    ///         {
    ///             new Opsgenie.Inputs.ApiIntegrationResponderArgs
    ///             {
    ///                 Type = "user",
    ///                 Id = opsgenie_user.User.Id,
    ///             },
    ///         },
    ///         Enabled = false,
    ///         AllowWriteAccess = false,
    ///         SuppressNotifications = true,
    ///         WebhookUrl = "https://api.example.com/v1",
    ///         Headers = 
    ///         {
    ///             { "header1", value1 },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// API Integrations can be imported using the `integration_id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import opsgenie:index/apiIntegration:ApiIntegration this integration_id`
    /// ```
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/apiIntegration:ApiIntegration")]
    public partial class ApiIntegration : global::Pulumi.CustomResource
    {
        /// <summary>
        /// This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Default: `true`.
        /// </summary>
        [Output("allowWriteAccess")]
        public Output<bool?> AllowWriteAccess { get; private set; } = null!;

        /// <summary>
        /// (Computed) API key of the created integration
        /// </summary>
        [Output("apiKey")]
        public Output<string> ApiKey { get; private set; } = null!;

        /// <summary>
        /// This parameter is for specifying whether the integration will be enabled or not. Default: `true`
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        [Output("headers")]
        public Output<ImmutableDictionary<string, string>?> Headers { get; private set; } = null!;

        /// <summary>
        /// If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
        /// </summary>
        [Output("ignoreRespondersFromPayload")]
        public Output<bool?> IgnoreRespondersFromPayload { get; private set; } = null!;

        /// <summary>
        /// Name of the integration. Name must be unique for each integration.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Owner team id of the integration.
        /// </summary>
        [Output("ownerTeamId")]
        public Output<string?> OwnerTeamId { get; private set; } = null!;

        /// <summary>
        /// User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        /// </summary>
        [Output("responders")]
        public Output<ImmutableArray<Outputs.ApiIntegrationResponder>> Responders { get; private set; } = null!;

        /// <summary>
        /// If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        /// </summary>
        [Output("suppressNotifications")]
        public Output<bool?> SuppressNotifications { get; private set; } = null!;

        /// <summary>
        /// Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        /// </summary>
        [Output("webhookUrl")]
        public Output<string?> WebhookUrl { get; private set; } = null!;


        /// <summary>
        /// Create a ApiIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApiIntegration(string name, ApiIntegrationArgs? args = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/apiIntegration:ApiIntegration", name, args ?? new ApiIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApiIntegration(string name, Input<string> id, ApiIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/apiIntegration:ApiIntegration", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "apiKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApiIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApiIntegration Get(string name, Input<string> id, ApiIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new ApiIntegration(name, id, state, options);
        }
    }

    public sealed class ApiIntegrationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Default: `true`.
        /// </summary>
        [Input("allowWriteAccess")]
        public Input<bool>? AllowWriteAccess { get; set; }

        /// <summary>
        /// This parameter is for specifying whether the integration will be enabled or not. Default: `true`
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        /// <summary>
        /// If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
        /// </summary>
        [Input("ignoreRespondersFromPayload")]
        public Input<bool>? IgnoreRespondersFromPayload { get; set; }

        /// <summary>
        /// Name of the integration. Name must be unique for each integration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Owner team id of the integration.
        /// </summary>
        [Input("ownerTeamId")]
        public Input<string>? OwnerTeamId { get; set; }

        [Input("responders")]
        private InputList<Inputs.ApiIntegrationResponderArgs>? _responders;

        /// <summary>
        /// User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        /// </summary>
        public InputList<Inputs.ApiIntegrationResponderArgs> Responders
        {
            get => _responders ?? (_responders = new InputList<Inputs.ApiIntegrationResponderArgs>());
            set => _responders = value;
        }

        /// <summary>
        /// If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        /// </summary>
        [Input("suppressNotifications")]
        public Input<bool>? SuppressNotifications { get; set; }

        /// <summary>
        /// Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        /// </summary>
        [Input("webhookUrl")]
        public Input<string>? WebhookUrl { get; set; }

        public ApiIntegrationArgs()
        {
        }
        public static new ApiIntegrationArgs Empty => new ApiIntegrationArgs();
    }

    public sealed class ApiIntegrationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Default: `true`.
        /// </summary>
        [Input("allowWriteAccess")]
        public Input<bool>? AllowWriteAccess { get; set; }

        [Input("apiKey")]
        private Input<string>? _apiKey;

        /// <summary>
        /// (Computed) API key of the created integration
        /// </summary>
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// This parameter is for specifying whether the integration will be enabled or not. Default: `true`
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("headers")]
        private InputMap<string>? _headers;
        public InputMap<string> Headers
        {
            get => _headers ?? (_headers = new InputMap<string>());
            set => _headers = value;
        }

        /// <summary>
        /// If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
        /// </summary>
        [Input("ignoreRespondersFromPayload")]
        public Input<bool>? IgnoreRespondersFromPayload { get; set; }

        /// <summary>
        /// Name of the integration. Name must be unique for each integration.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Owner team id of the integration.
        /// </summary>
        [Input("ownerTeamId")]
        public Input<string>? OwnerTeamId { get; set; }

        [Input("responders")]
        private InputList<Inputs.ApiIntegrationResponderGetArgs>? _responders;

        /// <summary>
        /// User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        /// </summary>
        public InputList<Inputs.ApiIntegrationResponderGetArgs> Responders
        {
            get => _responders ?? (_responders = new InputList<Inputs.ApiIntegrationResponderGetArgs>());
            set => _responders = value;
        }

        /// <summary>
        /// If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        /// </summary>
        [Input("suppressNotifications")]
        public Input<bool>? SuppressNotifications { get; set; }

        /// <summary>
        /// Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        /// </summary>
        [Input("webhookUrl")]
        public Input<string>? WebhookUrl { get; set; }

        public ApiIntegrationState()
        {
        }
        public static new ApiIntegrationState Empty => new ApiIntegrationState();
    }
}
