// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.IncidentTemplateArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.IncidentTemplateState;
import com.pulumi.opsgenie.outputs.IncidentTemplateStakeholderProperty;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Incident Template within Opsgenie.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.opsgenie.Team;
 * import com.pulumi.opsgenie.TeamArgs;
 * import com.pulumi.opsgenie.Service;
 * import com.pulumi.opsgenie.ServiceArgs;
 * import com.pulumi.opsgenie.IncidentTemplate;
 * import com.pulumi.opsgenie.IncidentTemplateArgs;
 * import com.pulumi.opsgenie.inputs.IncidentTemplateStakeholderPropertyArgs;
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
 *         var testTeam = new Team(&#34;testTeam&#34;, TeamArgs.builder()        
 *             .description(&#34;This team deals with all the things&#34;)
 *             .build());
 * 
 *         var testService = new Service(&#34;testService&#34;, ServiceArgs.builder()        
 *             .teamId(testTeam.id())
 *             .build());
 * 
 *         var testIncidentTemplate = new IncidentTemplate(&#34;testIncidentTemplate&#34;, IncidentTemplateArgs.builder()        
 *             .message(&#34;Incident Message&#34;)
 *             .priority(&#34;P2&#34;)
 *             .stakeholderProperties(IncidentTemplateStakeholderPropertyArgs.builder()
 *                 .enable(true)
 *                 .message(&#34;Stakeholder Message&#34;)
 *                 .description(&#34;Stakeholder Description&#34;)
 *                 .build())
 *             .tags(            
 *                 &#34;tag1&#34;,
 *                 &#34;tag2&#34;)
 *             .description(&#34;Incident Description&#34;)
 *             .details(Map.ofEntries(
 *                 Map.entry(&#34;key1&#34;, &#34;value1&#34;),
 *                 Map.entry(&#34;key2&#34;, &#34;value2&#34;)
 *             ))
 *             .impactedServices(testService.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Service can be imported using the `template_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import opsgenie:index/incidentTemplate:IncidentTemplate test template_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/incidentTemplate:IncidentTemplate")
public class IncidentTemplate extends com.pulumi.resources.CustomResource {
    /**
     * Description field of the incident template. This field must not be longer than 10000 characters.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description field of the incident template. This field must not be longer than 10000 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
     * 
     */
    @Export(name="details", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> details;

    /**
     * @return Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
     * 
     */
    public Output<Optional<Map<String,String>>> details() {
        return Codegen.optional(this.details);
    }
    @Export(name="impactedServices", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> impactedServices;

    public Output<Optional<List<String>>> impactedServices() {
        return Codegen.optional(this.impactedServices);
    }
    /**
     * Message of the related incident template. This field must not be longer than 130 characters.
     * 
     */
    @Export(name="message", type=String.class, parameters={})
    private Output<String> message;

    /**
     * @return Message of the related incident template. This field must not be longer than 130 characters.
     * 
     */
    public Output<String> message() {
        return this.message;
    }
    /**
     * Name of the incident template.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the incident template.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Priority level of the incident. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`.
     * 
     */
    @Export(name="priority", type=String.class, parameters={})
    private Output<String> priority;

    /**
     * @return Priority level of the incident. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`.
     * 
     */
    public Output<String> priority() {
        return this.priority;
    }
    @Export(name="stakeholderProperties", type=List.class, parameters={IncidentTemplateStakeholderProperty.class})
    private Output<List<IncidentTemplateStakeholderProperty>> stakeholderProperties;

    public Output<List<IncidentTemplateStakeholderProperty>> stakeholderProperties() {
        return this.stakeholderProperties;
    }
    /**
     * Tags of the incident template.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags of the incident template.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IncidentTemplate(String name) {
        this(name, IncidentTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IncidentTemplate(String name, IncidentTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IncidentTemplate(String name, IncidentTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/incidentTemplate:IncidentTemplate", name, args == null ? IncidentTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IncidentTemplate(String name, Output<String> id, @Nullable IncidentTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/incidentTemplate:IncidentTemplate", name, state, makeResourceOptions(options, id));
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
    public static IncidentTemplate get(String name, Output<String> id, @Nullable IncidentTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IncidentTemplate(name, id, state, options);
    }
}
