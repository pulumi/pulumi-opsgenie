// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.ScheduleArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.ScheduleState;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Schedule within Opsgenie.
 * 
 * ## Import
 * 
 * Schedule can be imported using the `schedule_id`, e.g.
 * 
 * ```sh
 * $ pulumi import opsgenie:index/schedule:Schedule test schedule_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/schedule:Schedule")
public class Schedule extends com.pulumi.resources.CustomResource {
    /**
     * The description of schedule.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of schedule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Enable/disable state of schedule
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Enable/disable state of schedule
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Name of the schedule.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the schedule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Owner team id of the schedule.
     * 
     */
    @Export(name="ownerTeamId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ownerTeamId;

    /**
     * @return Owner team id of the schedule.
     * 
     */
    public Output<Optional<String>> ownerTeamId() {
        return Codegen.optional(this.ownerTeamId);
    }
    /**
     * Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
     * 
     */
    @Export(name="timezone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timezone;

    /**
     * @return Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
     * 
     */
    public Output<Optional<String>> timezone() {
        return Codegen.optional(this.timezone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Schedule(String name) {
        this(name, ScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Schedule(String name, @Nullable ScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Schedule(String name, @Nullable ScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/schedule:Schedule", name, args == null ? ScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Schedule(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/schedule:Schedule", name, state, makeResourceOptions(options, id));
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
    public static Schedule get(String name, Output<String> id, @Nullable ScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Schedule(name, id, state, options);
    }
}
