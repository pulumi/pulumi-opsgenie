// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie
{
    public static class GetTeam
    {
        /// <summary>
        /// Manages existing Team within Opsgenie.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Opsgenie = Pulumi.Opsgenie;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var sre_team = Opsgenie.GetTeam.Invoke(new()
        ///     {
        ///         Name = "sre-team",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTeamResult> InvokeAsync(GetTeamArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetTeamResult>("opsgenie:index/getTeam:getTeam", args ?? new GetTeamArgs(), options.WithDefaults());

        /// <summary>
        /// Manages existing Team within Opsgenie.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Opsgenie = Pulumi.Opsgenie;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var sre_team = Opsgenie.GetTeam.Invoke(new()
        ///     {
        ///         Name = "sre-team",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTeamResult> Invoke(GetTeamInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetTeamResult>("opsgenie:index/getTeam:getTeam", args ?? new GetTeamInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTeamArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A description for this team.
        /// </summary>
        [Input("description")]
        public string? Description { get; set; }

        [Input("members")]
        private List<Inputs.GetTeamMemberArgs>? _members;

        /// <summary>
        /// A Member block as documented below.
        /// </summary>
        public List<Inputs.GetTeamMemberArgs> Members
        {
            get => _members ?? (_members = new List<Inputs.GetTeamMemberArgs>());
            set => _members = value;
        }

        /// <summary>
        /// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetTeamArgs()
        {
        }
        public static new GetTeamArgs Empty => new GetTeamArgs();
    }

    public sealed class GetTeamInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// A description for this team.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("members")]
        private InputList<Inputs.GetTeamMemberInputArgs>? _members;

        /// <summary>
        /// A Member block as documented below.
        /// </summary>
        public InputList<Inputs.GetTeamMemberInputArgs> Members
        {
            get => _members ?? (_members = new InputList<Inputs.GetTeamMemberInputArgs>());
            set => _members = value;
        }

        /// <summary>
        /// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetTeamInvokeArgs()
        {
        }
        public static new GetTeamInvokeArgs Empty => new GetTeamInvokeArgs();
    }


    [OutputType]
    public sealed class GetTeamResult
    {
        public readonly string? Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetTeamMemberResult> Members;
        public readonly string Name;

        [OutputConstructor]
        private GetTeamResult(
            string? description,

            string id,

            ImmutableArray<Outputs.GetTeamMemberResult> members,

            string name)
        {
            Description = description;
            Id = id;
            Members = members;
            Name = name;
        }
    }
}
