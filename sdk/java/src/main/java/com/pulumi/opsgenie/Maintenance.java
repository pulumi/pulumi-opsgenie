// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.MaintenanceArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.MaintenanceState;
import com.pulumi.opsgenie.outputs.MaintenanceRule;
import com.pulumi.opsgenie.outputs.MaintenanceTime;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Maintenance within Opsgenie.
 * 
 * ## Import
 * 
 * Maintenance policies can be imported using the `policy_id`, e.g.
 * 
 * ```sh
 * $ pulumi import opsgenie:index/maintenance:Maintenance test policy_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/maintenance:Maintenance")
public class Maintenance extends com.pulumi.resources.CustomResource {
    /**
     * Description for the maintenance.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description for the maintenance.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
     * 
     */
    @Export(name="rules", refs={List.class,MaintenanceRule.class}, tree="[0,1]")
    private Output<List<MaintenanceRule>> rules;

    /**
     * @return Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
     * 
     */
    public Output<List<MaintenanceRule>> rules() {
        return this.rules;
    }
    /**
     * Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
     * 
     */
    @Export(name="times", refs={List.class,MaintenanceTime.class}, tree="[0,1]")
    private Output</* @Nullable */ List<MaintenanceTime>> times;

    /**
     * @return Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
     * 
     */
    public Output<Optional<List<MaintenanceTime>>> times() {
        return Codegen.optional(this.times);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Maintenance(java.lang.String name) {
        this(name, MaintenanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Maintenance(java.lang.String name, MaintenanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Maintenance(java.lang.String name, MaintenanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/maintenance:Maintenance", name, makeArgs(args, options), makeResourceOptions(options, Codegen.empty()), false);
    }

    private Maintenance(java.lang.String name, Output<java.lang.String> id, @Nullable MaintenanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/maintenance:Maintenance", name, state, makeResourceOptions(options, id), false);
    }

    private static MaintenanceArgs makeArgs(MaintenanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        if (options != null && options.getUrn().isPresent()) {
            return null;
        }
        return args == null ? MaintenanceArgs.Empty : args;
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<java.lang.String> id) {
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
    public static Maintenance get(java.lang.String name, Output<java.lang.String> id, @Nullable MaintenanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Maintenance(name, id, state, options);
    }
}
