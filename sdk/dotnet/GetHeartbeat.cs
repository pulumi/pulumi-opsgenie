// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie
{
    public static class GetHeartbeat
    {
        /// <summary>
        /// Manages existing heartbeat within Opsgenie.
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
        ///     var test = Opsgenie.GetHeartbeat.Invoke(new()
        ///     {
        ///         Name = "genieheartbeat-existing",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Task<GetHeartbeatResult> InvokeAsync(GetHeartbeatArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHeartbeatResult>("opsgenie:index/getHeartbeat:getHeartbeat", args ?? new GetHeartbeatArgs(), options.WithDefaults());

        /// <summary>
        /// Manages existing heartbeat within Opsgenie.
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
        ///     var test = Opsgenie.GetHeartbeat.Invoke(new()
        ///     {
        ///         Name = "genieheartbeat-existing",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetHeartbeatResult> Invoke(GetHeartbeatInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHeartbeatResult>("opsgenie:index/getHeartbeat:getHeartbeat", args ?? new GetHeartbeatInvokeArgs(), options.WithDefaults());

        /// <summary>
        /// Manages existing heartbeat within Opsgenie.
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
        ///     var test = Opsgenie.GetHeartbeat.Invoke(new()
        ///     {
        ///         Name = "genieheartbeat-existing",
        ///     });
        /// 
        /// });
        /// ```
        /// </summary>
        public static Output<GetHeartbeatResult> Invoke(GetHeartbeatInvokeArgs args, InvokeOutputOptions options)
            => global::Pulumi.Deployment.Instance.Invoke<GetHeartbeatResult>("opsgenie:index/getHeartbeat:getHeartbeat", args ?? new GetHeartbeatInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHeartbeatArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        /// </summary>
        [Input("alertMessage")]
        public string? AlertMessage { get; set; }

        /// <summary>
        /// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        /// </summary>
        [Input("alertPriority")]
        public string? AlertPriority { get; set; }

        [Input("alertTags")]
        private List<string>? _alertTags;

        /// <summary>
        /// Specifies the alert tags for heartbeat expiration alert.
        /// </summary>
        public List<string> AlertTags
        {
            get => _alertTags ?? (_alertTags = new List<string>());
            set => _alertTags = value;
        }

        /// <summary>
        /// An optional description of the heartbeat
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        /// <summary>
        /// Enable/disable heartbeat monitoring.
        /// </summary>
        [Input("enabled")]
        public bool? Enabled { get; set; }

        /// <summary>
        /// Specifies how often a heartbeat message should be expected.
        /// </summary>
        [Input("interval")]
        public int? Interval { get; set; }

        /// <summary>
        /// Interval specified as minutes, hours or days.
        /// </summary>
        [Input("intervalUnit")]
        public string? IntervalUnit { get; set; }

        /// <summary>
        /// Name of the heartbeat
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// Owner team of the heartbeat.
        /// </summary>
        [Input("ownerTeamId")]
        public string? OwnerTeamId { get; set; }

        public GetHeartbeatArgs()
        {
        }
        public static new GetHeartbeatArgs Empty => new GetHeartbeatArgs();
    }

    public sealed class GetHeartbeatInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        /// </summary>
        [Input("alertMessage")]
        public Input<string>? AlertMessage { get; set; }

        /// <summary>
        /// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        /// </summary>
        [Input("alertPriority")]
        public Input<string>? AlertPriority { get; set; }

        [Input("alertTags")]
        private InputList<string>? _alertTags;

        /// <summary>
        /// Specifies the alert tags for heartbeat expiration alert.
        /// </summary>
        public InputList<string> AlertTags
        {
            get => _alertTags ?? (_alertTags = new InputList<string>());
            set => _alertTags = value;
        }

        /// <summary>
        /// An optional description of the heartbeat
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Enable/disable heartbeat monitoring.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Specifies how often a heartbeat message should be expected.
        /// </summary>
        [Input("interval")]
        public Input<int>? Interval { get; set; }

        /// <summary>
        /// Interval specified as minutes, hours or days.
        /// </summary>
        [Input("intervalUnit")]
        public Input<string>? IntervalUnit { get; set; }

        /// <summary>
        /// Name of the heartbeat
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Owner team of the heartbeat.
        /// </summary>
        [Input("ownerTeamId")]
        public Input<string>? OwnerTeamId { get; set; }

        public GetHeartbeatInvokeArgs()
        {
        }
        public static new GetHeartbeatInvokeArgs Empty => new GetHeartbeatInvokeArgs();
    }


    [OutputType]
    public sealed class GetHeartbeatResult
    {
        /// <summary>
        /// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        /// </summary>
        public readonly string? AlertMessage;
        /// <summary>
        /// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        /// </summary>
        public readonly string? AlertPriority;
        /// <summary>
        /// Specifies the alert tags for heartbeat expiration alert.
        /// </summary>
        public readonly ImmutableArray<string> AlertTags;
        /// <summary>
        /// An optional description of the heartbeat
        /// </summary>
        public readonly string? Description;
        /// <summary>
        /// Enable/disable heartbeat monitoring.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Specifies how often a heartbeat message should be expected.
        /// </summary>
        public readonly int? Interval;
        /// <summary>
        /// Interval specified as minutes, hours or days.
        /// </summary>
        public readonly string? IntervalUnit;
        public readonly string Name;
        /// <summary>
        /// Owner team of the heartbeat.
        /// </summary>
        public readonly string? OwnerTeamId;

        [OutputConstructor]
        private GetHeartbeatResult(
            string? alertMessage,

            string? alertPriority,

            ImmutableArray<string> alertTags,

            string? description,

            bool? enabled,

            string id,

            int? interval,

            string? intervalUnit,

            string name,

            string? ownerTeamId)
        {
            AlertMessage = alertMessage;
            AlertPriority = alertPriority;
            AlertTags = alertTags;
            Description = description;
            Enabled = enabled;
            Id = id;
            Interval = interval;
            IntervalUnit = intervalUnit;
            Name = name;
            OwnerTeamId = ownerTeamId;
        }
    }
}
