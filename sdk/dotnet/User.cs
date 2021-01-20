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
    /// Manages a User within Opsgenie.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Opsgenie = Pulumi.Opsgenie;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var test = new Opsgenie.User("test", new Opsgenie.UserArgs
    ///         {
    ///             FullName = "Test User",
    ///             Locale = "en_US",
    ///             Role = "User",
    ///             SkypeUsername = "skypename",
    ///             Tags = 
    ///             {
    ///                 "sre",
    ///                 "opsgenie",
    ///             },
    ///             Timezone = "America/New_York",
    ///             UserAddresses = 
    ///             {
    ///                 new Opsgenie.Inputs.UserUserAddressArgs
    ///                 {
    ///                     City = "City",
    ///                     Country = "Country",
    ///                     Line = "Line",
    ///                     State = "State",
    ///                     Zipcode = "998877",
    ///                 },
    ///             },
    ///             UserDetails = 
    ///             {
    ///                 { "key1", "val1,val2" },
    ///                 { "key2", "val3,val4" },
    ///             },
    ///             Username = "user@domain.com",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Users can be imported using the `id`, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import opsgenie:index/user:User user da4faf16-5546-41e4-8330-4d0002b74048s`
    /// ```
    /// </summary>
    public partial class User : Pulumi.CustomResource
    {
        /// <summary>
        /// The Full Name of the User.
        /// </summary>
        [Output("fullName")]
        public Output<string> FullName { get; private set; } = null!;

        /// <summary>
        /// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        /// </summary>
        [Output("locale")]
        public Output<string?> Locale { get; private set; } = null!;

        /// <summary>
        /// The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        /// </summary>
        [Output("role")]
        public Output<string> Role { get; private set; } = null!;

        /// <summary>
        /// Skype username of the user.
        /// </summary>
        [Output("skypeUsername")]
        public Output<string?> SkypeUsername { get; private set; } = null!;

        /// <summary>
        /// A list of tags to be associated with the user.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        /// </summary>
        [Output("timezone")]
        public Output<string?> Timezone { get; private set; } = null!;

        /// <summary>
        /// Address of the user.
        /// </summary>
        [Output("userAddresses")]
        public Output<ImmutableArray<Outputs.UserUserAddress>> UserAddresses { get; private set; } = null!;

        /// <summary>
        /// Details about the user in form of key and list. of values.
        /// </summary>
        [Output("userDetails")]
        public Output<ImmutableDictionary<string, string>?> UserDetails { get; private set; } = null!;

        /// <summary>
        /// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("opsgenie:index/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Full Name of the User.
        /// </summary>
        [Input("fullName", required: true)]
        public Input<string> FullName { get; set; } = null!;

        /// <summary>
        /// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        /// </summary>
        [Input("locale")]
        public Input<string>? Locale { get; set; }

        /// <summary>
        /// The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        /// </summary>
        [Input("role", required: true)]
        public Input<string> Role { get; set; } = null!;

        /// <summary>
        /// Skype username of the user.
        /// </summary>
        [Input("skypeUsername")]
        public Input<string>? SkypeUsername { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags to be associated with the user.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        /// </summary>
        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        [Input("userAddresses")]
        private InputList<Inputs.UserUserAddressArgs>? _userAddresses;

        /// <summary>
        /// Address of the user.
        /// </summary>
        public InputList<Inputs.UserUserAddressArgs> UserAddresses
        {
            get => _userAddresses ?? (_userAddresses = new InputList<Inputs.UserUserAddressArgs>());
            set => _userAddresses = value;
        }

        [Input("userDetails")]
        private InputMap<string>? _userDetails;

        /// <summary>
        /// Details about the user in form of key and list. of values.
        /// </summary>
        public InputMap<string> UserDetails
        {
            get => _userDetails ?? (_userDetails = new InputMap<string>());
            set => _userDetails = value;
        }

        /// <summary>
        /// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public UserArgs()
        {
        }
    }

    public sealed class UserState : Pulumi.ResourceArgs
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
        /// The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        /// </summary>
        [Input("role")]
        public Input<string>? Role { get; set; }

        /// <summary>
        /// Skype username of the user.
        /// </summary>
        [Input("skypeUsername")]
        public Input<string>? SkypeUsername { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// A list of tags to be associated with the user.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        /// </summary>
        [Input("timezone")]
        public Input<string>? Timezone { get; set; }

        [Input("userAddresses")]
        private InputList<Inputs.UserUserAddressGetArgs>? _userAddresses;

        /// <summary>
        /// Address of the user.
        /// </summary>
        public InputList<Inputs.UserUserAddressGetArgs> UserAddresses
        {
            get => _userAddresses ?? (_userAddresses = new InputList<Inputs.UserUserAddressGetArgs>());
            set => _userAddresses = value;
        }

        [Input("userDetails")]
        private InputMap<string>? _userDetails;

        /// <summary>
        /// Details about the user in form of key and list. of values.
        /// </summary>
        public InputMap<string> UserDetails
        {
            get => _userDetails ?? (_userDetails = new InputMap<string>());
            set => _userDetails = value;
        }

        /// <summary>
        /// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public UserState()
        {
        }
    }
}
