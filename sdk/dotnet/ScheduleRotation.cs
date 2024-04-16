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
    /// Manages a Schedule Rotation within Opsgenie.
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
    ///     var test = new Opsgenie.ScheduleRotation("test", new()
    ///     {
    ///         ScheduleId = testOpsgenieSchedule.Id,
    ///         Name = "test",
    ///         StartDate = "2019-06-18T17:00:00Z",
    ///         EndDate = "2019-06-20T17:30:00Z",
    ///         Type = "hourly",
    ///         Length = 6,
    ///         Participants = new[]
    ///         {
    ///             new Opsgenie.Inputs.ScheduleRotationParticipantArgs
    ///             {
    ///                 Type = "user",
    ///                 Id = testOpsgenieUser.Id,
    ///             },
    ///         },
    ///         TimeRestrictions = new[]
    ///         {
    ///             new Opsgenie.Inputs.ScheduleRotationTimeRestrictionArgs
    ///             {
    ///                 Type = "time-of-day",
    ///                 Restriction = new[]
    ///                 {
    ///                     new Opsgenie.Inputs.ScheduleRotationTimeRestrictionRestrictionArgs
    ///                     {
    ///                         StartHour = 1,
    ///                         StartMin = 1,
    ///                         EndHour = 10,
    ///                         EndMin = 1,
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
    /// Schedule Rotations can be imported using the `schedule_id/rotation_id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import opsgenie:index/scheduleRotation:ScheduleRotation * `opsgenie_schedule_rotation.test schedule_id/rotation_id`
    /// ```
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/scheduleRotation:ScheduleRotation")]
    public partial class ScheduleRotation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        /// </summary>
        [Output("endDate")]
        public Output<string?> EndDate { get; private set; } = null!;

        /// <summary>
        /// Length of the rotation with default value 1.
        /// </summary>
        [Output("length")]
        public Output<int?> Length { get; private set; } = null!;

        /// <summary>
        /// Name of rotation.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        /// </summary>
        [Output("participants")]
        public Output<ImmutableArray<Outputs.ScheduleRotationParticipant>> Participants { get; private set; } = null!;

        /// <summary>
        /// Identifier of the schedule.
        /// </summary>
        [Output("scheduleId")]
        public Output<string> ScheduleId { get; private set; } = null!;

        /// <summary>
        /// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        /// </summary>
        [Output("startDate")]
        public Output<string> StartDate { get; private set; } = null!;

        [Output("timeRestrictions")]
        public Output<ImmutableArray<Outputs.ScheduleRotationTimeRestriction>> TimeRestrictions { get; private set; } = null!;

        /// <summary>
        /// Type of rotation. May be one of daily, weekly and hourly.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ScheduleRotation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScheduleRotation(string name, ScheduleRotationArgs args, CustomResourceOptions? options = null)
            : base("opsgenie:index/scheduleRotation:ScheduleRotation", name, args ?? new ScheduleRotationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ScheduleRotation(string name, Input<string> id, ScheduleRotationState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/scheduleRotation:ScheduleRotation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ScheduleRotation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScheduleRotation Get(string name, Input<string> id, ScheduleRotationState? state = null, CustomResourceOptions? options = null)
        {
            return new ScheduleRotation(name, id, state, options);
        }
    }

    public sealed class ScheduleRotationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        /// </summary>
        [Input("endDate")]
        public Input<string>? EndDate { get; set; }

        /// <summary>
        /// Length of the rotation with default value 1.
        /// </summary>
        [Input("length")]
        public Input<int>? Length { get; set; }

        /// <summary>
        /// Name of rotation.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("participants", required: true)]
        private InputList<Inputs.ScheduleRotationParticipantArgs>? _participants;

        /// <summary>
        /// List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        /// </summary>
        public InputList<Inputs.ScheduleRotationParticipantArgs> Participants
        {
            get => _participants ?? (_participants = new InputList<Inputs.ScheduleRotationParticipantArgs>());
            set => _participants = value;
        }

        /// <summary>
        /// Identifier of the schedule.
        /// </summary>
        [Input("scheduleId", required: true)]
        public Input<string> ScheduleId { get; set; } = null!;

        /// <summary>
        /// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        /// </summary>
        [Input("startDate", required: true)]
        public Input<string> StartDate { get; set; } = null!;

        [Input("timeRestrictions")]
        private InputList<Inputs.ScheduleRotationTimeRestrictionArgs>? _timeRestrictions;
        public InputList<Inputs.ScheduleRotationTimeRestrictionArgs> TimeRestrictions
        {
            get => _timeRestrictions ?? (_timeRestrictions = new InputList<Inputs.ScheduleRotationTimeRestrictionArgs>());
            set => _timeRestrictions = value;
        }

        /// <summary>
        /// Type of rotation. May be one of daily, weekly and hourly.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ScheduleRotationArgs()
        {
        }
        public static new ScheduleRotationArgs Empty => new ScheduleRotationArgs();
    }

    public sealed class ScheduleRotationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        /// </summary>
        [Input("endDate")]
        public Input<string>? EndDate { get; set; }

        /// <summary>
        /// Length of the rotation with default value 1.
        /// </summary>
        [Input("length")]
        public Input<int>? Length { get; set; }

        /// <summary>
        /// Name of rotation.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("participants")]
        private InputList<Inputs.ScheduleRotationParticipantGetArgs>? _participants;

        /// <summary>
        /// List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        /// </summary>
        public InputList<Inputs.ScheduleRotationParticipantGetArgs> Participants
        {
            get => _participants ?? (_participants = new InputList<Inputs.ScheduleRotationParticipantGetArgs>());
            set => _participants = value;
        }

        /// <summary>
        /// Identifier of the schedule.
        /// </summary>
        [Input("scheduleId")]
        public Input<string>? ScheduleId { get; set; }

        /// <summary>
        /// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        /// </summary>
        [Input("startDate")]
        public Input<string>? StartDate { get; set; }

        [Input("timeRestrictions")]
        private InputList<Inputs.ScheduleRotationTimeRestrictionGetArgs>? _timeRestrictions;
        public InputList<Inputs.ScheduleRotationTimeRestrictionGetArgs> TimeRestrictions
        {
            get => _timeRestrictions ?? (_timeRestrictions = new InputList<Inputs.ScheduleRotationTimeRestrictionGetArgs>());
            set => _timeRestrictions = value;
        }

        /// <summary>
        /// Type of rotation. May be one of daily, weekly and hourly.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ScheduleRotationState()
        {
        }
        public static new ScheduleRotationState Empty => new ScheduleRotationState();
    }
}
