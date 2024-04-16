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
    /// Manages a User Contact.
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
    ///     var sms = new Opsgenie.UserContact("sms", new()
    ///     {
    ///         Username = exampleuser.Username,
    ///         To = "39-123",
    ///         Method = "sms",
    ///     });
    /// 
    ///     var email = new Opsgenie.UserContact("email", new()
    ///     {
    ///         Username = exampleuser.Username,
    ///         To = "fahri@opsgenie.com",
    ///         Method = "email",
    ///     });
    /// 
    ///     var voice = new Opsgenie.UserContact("voice", new()
    ///     {
    ///         Username = exampleuser.Username,
    ///         To = "39-123",
    ///         Method = "voice",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Users can be imported using the `username/contact_id`, e.g.
    /// 
    /// ```sh
    /// $ pulumi import opsgenie:index/userContact:UserContact testcontact username/contact_id`
    /// ```
    /// </summary>
    [OpsgenieResourceType("opsgenie:index/userContact:UserContact")]
    public partial class UserContact : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Enable contact of the user in OpsGenie. Default value is true.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
        /// </summary>
        [Output("method")]
        public Output<string> Method { get; private set; } = null!;

        /// <summary>
        /// to field is the address of given method.
        /// </summary>
        [Output("to")]
        public Output<string> To { get; private set; } = null!;

        /// <summary>
        /// The username for contact.(reference)
        /// </summary>
        [Output("username")]
        public Output<string> Username { get; private set; } = null!;


        /// <summary>
        /// Create a UserContact resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserContact(string name, UserContactArgs args, CustomResourceOptions? options = null)
            : base("opsgenie:index/userContact:UserContact", name, args ?? new UserContactArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserContact(string name, Input<string> id, UserContactState? state = null, CustomResourceOptions? options = null)
            : base("opsgenie:index/userContact:UserContact", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserContact resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserContact Get(string name, Input<string> id, UserContactState? state = null, CustomResourceOptions? options = null)
        {
            return new UserContact(name, id, state, options);
        }
    }

    public sealed class UserContactArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable contact of the user in OpsGenie. Default value is true.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        /// <summary>
        /// to field is the address of given method.
        /// </summary>
        [Input("to", required: true)]
        public Input<string> To { get; set; } = null!;

        /// <summary>
        /// The username for contact.(reference)
        /// </summary>
        [Input("username", required: true)]
        public Input<string> Username { get; set; } = null!;

        public UserContactArgs()
        {
        }
        public static new UserContactArgs Empty => new UserContactArgs();
    }

    public sealed class UserContactState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable contact of the user in OpsGenie. Default value is true.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        /// <summary>
        /// to field is the address of given method.
        /// </summary>
        [Input("to")]
        public Input<string>? To { get; set; }

        /// <summary>
        /// The username for contact.(reference)
        /// </summary>
        [Input("username")]
        public Input<string>? Username { get; set; }

        public UserContactState()
        {
        }
        public static new UserContactState Empty => new UserContactState();
    }
}
