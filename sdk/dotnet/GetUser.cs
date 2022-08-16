// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie
{
    public static class GetUser
    {
        /// <summary>
        /// Manages existing User within Opsgenie.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Opsgenie = Pulumi.Opsgenie;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Opsgenie.GetUser.Invoke(new()
        ///     {
        ///         Username = "user@domain.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetUserResult> InvokeAsync(GetUserArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetUserResult>("opsgenie:index/getUser:getUser", args ?? new GetUserArgs(), options.WithDefaults());

        /// <summary>
        /// Manages existing User within Opsgenie.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Opsgenie = Pulumi.Opsgenie;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Opsgenie.GetUser.Invoke(new()
        ///     {
        ///         Username = "user@domain.com",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetUserResult> Invoke(GetUserInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetUserResult>("opsgenie:index/getUser:getUser", args ?? new GetUserInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetUserArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Full Name of the User.
        /// </summary>
        [Input("fullName")]
        public string? FullName { get; set; }

        /// <summary>
        /// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        /// </summary>
        [Input("locale")]
        public string? Locale { get; set; }

        /// <summary>
        /// The Role assigned to the User. Either a built-in such as 'Owner', 'Admin' or 'User' - or the name of a custom role.
        /// </summary>
        [Input("role")]
        public string? Role { get; set; }

        /// <summary>
        /// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        /// </summary>
        [Input("timezone")]
        public string? Timezone { get; set; }

        /// <summary>
        /// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters.
        /// </summary>
        [Input("username", required: true)]
        public string Username { get; set; } = null!;

        public GetUserArgs()
        {
        }
        public static new GetUserArgs Empty => new GetUserArgs();
    }

    public sealed class GetUserInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The Full Name of the User.
        /// </summary>
        [Input("fullName")]
        public Input<string>? FullName { get; set; }

        /// <summary>
        /// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        /// </summary>
        [Input("locale")]
        public Input<string>? Locale { get; set; }

        /// <summary>
        /// The Role assigned to the User. Either a built-in such as 'Owner', 'Admin' or 'User' - or the name of a custom role.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        /// </summary>
        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        /// <summary>
        /// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public GetUserInvokeArgs()
        {
        }
        public static new GetUserInvokeArgs Empty => new GetUserInvokeArgs();
    }


    [OutputType]
    public sealed class GetUserResult
    {
        /// <summary>
        /// The Full Name of the User.
        /// </summary>
        public readonly string? FullName;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        /// </summary>
        public readonly string? Locale;
        /// <summary>
        /// The Role assigned to the User. Either a built-in such as 'Owner', 'Admin' or 'User' - or the name of a custom role.
        /// </summary>
        public readonly string? Role;
        /// <summary>
        /// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        /// </summary>
        public readonly string? Timezone;
        public readonly string Username;

        [OutputConstructor]
        private GetUserResult(
            string? fullName,

            string id,

            string? locale,

            string? role,

            string? timezone,

            string username)
        {
            FullName = fullName;
            Id = id;
            Locale = locale;
            Role = role;
            Timezone = timezone;
            Username = username;
        }
    }
}
