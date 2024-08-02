// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.UserContactArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.UserContactState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a User Contact.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.opsgenie.UserContact;
 * import com.pulumi.opsgenie.UserContactArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var sms = new UserContact("sms", UserContactArgs.builder()
 *             .username(exampleuser.username())
 *             .to("39-123")
 *             .method("sms")
 *             .build());
 * 
 *         var email = new UserContact("email", UserContactArgs.builder()
 *             .username(exampleuser.username())
 *             .to("fahri{@literal @}opsgenie.com")
 *             .method("email")
 *             .build());
 * 
 *         var voice = new UserContact("voice", UserContactArgs.builder()
 *             .username(exampleuser.username())
 *             .to("39-123")
 *             .method("voice")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Users can be imported using the `username/contact_id`, e.g.
 * 
 * ```sh
 * $ pulumi import opsgenie:index/userContact:UserContact testcontact username/contact_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/userContact:UserContact")
public class UserContact extends com.pulumi.resources.CustomResource {
    /**
     * Enable contact of the user in OpsGenie. Default value is true.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Enable contact of the user in OpsGenie. Default value is true.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
     * 
     */
    @Export(name="method", refs={String.class}, tree="[0]")
    private Output<String> method;

    /**
     * @return This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
     * 
     */
    public Output<String> method() {
        return this.method;
    }
    /**
     * to field is the address of given method.
     * 
     */
    @Export(name="to", refs={String.class}, tree="[0]")
    private Output<String> to;

    /**
     * @return to field is the address of given method.
     * 
     */
    public Output<String> to() {
        return this.to;
    }
    /**
     * The username for contact.(reference)
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return The username for contact.(reference)
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserContact(String name) {
        this(name, UserContactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserContact(String name, UserContactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserContact(String name, UserContactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/userContact:UserContact", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()));
    }

    private UserContact(String name, Output<String> id, @Nullable UserContactState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/userContact:UserContact", name, state, makeResourceOptions(options, id));
    }

    private static UserContactArgs makeArgs(UserContactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? UserContactArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UserContact get(String name, Output<String> id, @Nullable UserContactState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserContact(name, id, state, options);
    }
}
