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
    /// Manages a Team within Opsgenie.
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
    ///     var first = new Opsgenie.User("first", new()
    ///     {
    ///         Username = "user@domain.com",
    ///         FullName = "name ",
    ///         Role = "User",
    ///     });
    /// 
    ///     var second = new Opsgenie.User("second", new()
    ///     {
    ///         Username = "test@domain.com",
    ///         FullName = "name ",
    ///         Role = "User",
    ///     });
    /// 
    ///     var test = new Opsgenie.Team("test", new()
    ///     {
    ///         Name = "example",
    ///         Description = "This team deals with all the things",
    ///         Members = new[]
    ///         {
    ///             new Opsgenie.Inputs.TeamMemberArgs
    ///             {
    ///                 Id = first.Id,
    ///                 Role = "admin",
    ///             },
    ///             new Opsgenie.Inputs.TeamMemberArgs
    ///             {
    ///                 Id = second.Id,
    ///                 Role = "user",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var self_service = new Opsgenie.Team("self-service", new()
    ///     {
    ///         Name = "Self Service",
    ///         Description = "Membership in this team is managed via OpsGenie web UI only",
    ///         IgnoreMembers = true,
    ///         DeleteDefaultResources = true,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Teams can be imported using the `team_id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import opsgenie:index/team:Team team1 team_id`
    /// ```
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/team:Team")]
    public partial class Team : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        /// </summary>
        [Output("deleteDefaultResources")]
        public Output<bool?> DeleteDefaultResources { get; private set; } = null!;

        /// <summary>
        /// A description for this team.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        /// </summary>
        [Output("ignoreMembers")]
        public Output<bool?> IgnoreMembers { get; private set; } = null!;

        /// <summary>
        /// A Member block as documented below.
        /// </summary>
        [Output("members")]
        public Output<ImmutableArray<Outputs.TeamMember>> Members { get; private set; } = null!;

        /// <summary>
        /// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Team resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Team(string name, TeamArgs? args = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/team:Team", name, args ?? new TeamArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Team(string name, Input<string> id, TeamState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/team:Team", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Team resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Team Get(string name, Input<string> id, TeamState? state = null, CustomResourceOptions? options = null)
        {
            return new Team(name, id, state, options);
        }
    }

    public sealed class TeamArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        /// </summary>
        [Input("deleteDefaultResources")]
        public Input<bool>? DeleteDefaultResources { get; set; }

        /// <summary>
        /// A description for this team.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        /// </summary>
        [Input("ignoreMembers")]
        public Input<bool>? IgnoreMembers { get; set; }

        [Input("members")]
        private InputList<Inputs.TeamMemberArgs>? _members;

        /// <summary>
        /// A Member block as documented below.
        /// </summary>
        public InputList<Inputs.TeamMemberArgs> Members
        {
            get => _members ?? (_members = new InputList<Inputs.TeamMemberArgs>());
            set => _members = value;
        }

        /// <summary>
        /// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public TeamArgs()
        {
        }
        public static new TeamArgs Empty => new TeamArgs();
    }

    public sealed class TeamState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        /// </summary>
        [Input("deleteDefaultResources")]
        public Input<bool>? DeleteDefaultResources { get; set; }

        /// <summary>
        /// A description for this team.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        /// </summary>
        [Input("ignoreMembers")]
        public Input<bool>? IgnoreMembers { get; set; }

        [Input("members")]
        private InputList<Inputs.TeamMemberGetArgs>? _members;

        /// <summary>
        /// A Member block as documented below.
        /// </summary>
        public InputList<Inputs.TeamMemberGetArgs> Members
        {
            get => _members ?? (_members = new InputList<Inputs.TeamMemberGetArgs>());
            set => _members = value;
        }

        /// <summary>
        /// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public TeamState()
        {
        }
        public static new TeamState Empty => new TeamState();
    }
}
