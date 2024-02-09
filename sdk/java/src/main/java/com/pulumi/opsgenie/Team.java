// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.TeamArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.TeamState;
import com.pulumi.opsgenie.outputs.TeamMember;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Team within Opsgenie.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.opsgenie.User;
 * import com.pulumi.opsgenie.UserArgs;
 * import com.pulumi.opsgenie.Team;
 * import com.pulumi.opsgenie.TeamArgs;
 * import com.pulumi.opsgenie.inputs.TeamMemberArgs;
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
 *         var first = new User(&#34;first&#34;, UserArgs.builder()        
 *             .fullName(&#34;name &#34;)
 *             .role(&#34;User&#34;)
 *             .username(&#34;user@domain.com&#34;)
 *             .build());
 * 
 *         var second = new User(&#34;second&#34;, UserArgs.builder()        
 *             .fullName(&#34;name &#34;)
 *             .role(&#34;User&#34;)
 *             .username(&#34;test@domain.com&#34;)
 *             .build());
 * 
 *         var test = new Team(&#34;test&#34;, TeamArgs.builder()        
 *             .description(&#34;This team deals with all the things&#34;)
 *             .members(            
 *                 TeamMemberArgs.builder()
 *                     .id(first.id())
 *                     .role(&#34;admin&#34;)
 *                     .build(),
 *                 TeamMemberArgs.builder()
 *                     .id(second.id())
 *                     .role(&#34;user&#34;)
 *                     .build())
 *             .build());
 * 
 *         var self_service = new Team(&#34;self-service&#34;, TeamArgs.builder()        
 *             .deleteDefaultResources(true)
 *             .description(&#34;Membership in this team is managed via OpsGenie web UI only&#34;)
 *             .ignoreMembers(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Teams can be imported using the `team_id`, e.g.
 * 
 * ```sh
 * $ pulumi import opsgenie:index/team:Team team1 team_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/team:Team")
public class Team extends com.pulumi.resources.CustomResource {
    /**
     * Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
     * 
     */
    @Export(name="deleteDefaultResources", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> deleteDefaultResources;

    /**
     * @return Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
     * 
     */
    public Output<Optional<Boolean>> deleteDefaultResources() {
        return Codegen.optional(this.deleteDefaultResources);
    }
    /**
     * A description for this team.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for this team.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
     * 
     */
    @Export(name="ignoreMembers", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreMembers;

    /**
     * @return Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
     * 
     */
    public Output<Optional<Boolean>> ignoreMembers() {
        return Codegen.optional(this.ignoreMembers);
    }
    /**
     * A Member block as documented below.
     * 
     */
    @Export(name="members", refs={List.class,TeamMember.class}, tree="[0,1]")
    private Output</* @Nullable */ List<TeamMember>> members;

    /**
     * @return A Member block as documented below.
     * 
     */
    public Output<Optional<List<TeamMember>>> members() {
        return Codegen.optional(this.members);
    }
    /**
     * The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Team(String name) {
        this(name, TeamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Team(String name, @Nullable TeamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Team(String name, @Nullable TeamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/team:Team", name, args == null ? TeamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Team(String name, Output<String> id, @Nullable TeamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/team:Team", name, state, makeResourceOptions(options, id));
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
    public static Team get(String name, Output<String> id, @Nullable TeamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Team(name, id, state, options);
    }
}
