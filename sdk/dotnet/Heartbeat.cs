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
    /// Manages heartbeat within Opsgenie.
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
    ///     var test = new Opsgenie.Heartbeat("test", new()
    ///     {
    ///         AlertMessage = "Test",
    ///         AlertPriority = "P3",
    ///         AlertTags = new[]
    ///         {
    ///             "test",
    ///             "fahri",
    ///         },
    ///         Description = "test opsgenie heartbeat terraform",
    ///         Enabled = false,
    ///         Interval = 10,
    ///         IntervalUnit = "minutes",
    ///         OwnerTeamId = opsgenie_team.Test.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Heartbeat Integrations can be imported using the `name`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import opsgenie:index/heartbeat:Heartbeat test name`
    /// ```
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/heartbeat:Heartbeat")]
    public partial class Heartbeat : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        /// </summary>
        [Output("alertMessage")]
        public Output<string?> AlertMessage { get; private set; } = null!;

        /// <summary>
        /// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        /// </summary>
        [Output("alertPriority")]
        public Output<string?> AlertPriority { get; private set; } = null!;

        /// <summary>
        /// Specifies the alert tags for heartbeat expiration alert.
        /// </summary>
        [Output("alertTags")]
        public Output<ImmutableArray<string>> AlertTags { get; private set; } = null!;

        /// <summary>
        /// An optional description of the heartbeat
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Enable/disable heartbeat monitoring.
        /// </summary>
        [Output("enabled")]
        public Output<bool> Enabled { get; private set; } = null!;

        /// <summary>
        /// Specifies how often a heartbeat message should be expected.
        /// </summary>
        [Output("interval")]
        public Output<int> Interval { get; private set; } = null!;

        /// <summary>
        /// Interval specified as minutes, hours or days.
        /// </summary>
        [Output("intervalUnit")]
        public Output<string> IntervalUnit { get; private set; } = null!;

        /// <summary>
        /// Name of the heartbeat
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Owner team of the heartbeat.
        /// </summary>
        [Output("ownerTeamId")]
        public Output<string?> OwnerTeamId { get; private set; } = null!;


        /// <summary>
        /// Create a Heartbeat resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Heartbeat(string name, HeartbeatArgs args, CustomResourceOptions? options = null)
            : base("opsgenie:index/heartbeat:Heartbeat", name, args ?? new HeartbeatArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Heartbeat(string name, Input<string> id, HeartbeatState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/heartbeat:Heartbeat", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Heartbeat resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Heartbeat Get(string name, Input<string> id, HeartbeatState? state = null, CustomResourceOptions? options = null)
        {
            return new Heartbeat(name, id, state, options);
        }
    }

    public sealed class HeartbeatArgs : global::Pulumi.ResourceArgs
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
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// Specifies how often a heartbeat message should be expected.
        /// </summary>
        [Input("interval", required: true)]
        public Input<int> Interval { get; set; } = null!;

        /// <summary>
        /// Interval specified as minutes, hours or days.
        /// </summary>
        [Input("intervalUnit", required: true)]
        public Input<string> IntervalUnit { get; set; } = null!;

        /// <summary>
        /// Name of the heartbeat
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Owner team of the heartbeat.
        /// </summary>
        [Input("ownerTeamId")]
        public Input<string>? OwnerTeamId { get; set; }

        public HeartbeatArgs()
        {
        }
        public static new HeartbeatArgs Empty => new HeartbeatArgs();
    }

    public sealed class HeartbeatState : global::Pulumi.ResourceArgs
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
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Owner team of the heartbeat.
        /// </summary>
        [Input("ownerTeamId")]
        public Input<string>? OwnerTeamId { get; set; }

        public HeartbeatState()
        {
        }
        public static new HeartbeatState Empty => new HeartbeatState();
    }
}
