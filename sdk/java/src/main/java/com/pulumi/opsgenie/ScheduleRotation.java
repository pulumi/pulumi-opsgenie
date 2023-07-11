// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.opsgenie.ScheduleRotationArgs;
import com.pulumi.opsgenie.Utilities;
import com.pulumi.opsgenie.inputs.ScheduleRotationState;
import com.pulumi.opsgenie.outputs.ScheduleRotationParticipant;
import com.pulumi.opsgenie.outputs.ScheduleRotationTimeRestriction;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Schedule Rotation within Opsgenie.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.opsgenie.ScheduleRotation;
 * import com.pulumi.opsgenie.ScheduleRotationArgs;
 * import com.pulumi.opsgenie.inputs.ScheduleRotationParticipantArgs;
 * import com.pulumi.opsgenie.inputs.ScheduleRotationTimeRestrictionArgs;
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
 *         var test = new ScheduleRotation(&#34;test&#34;, ScheduleRotationArgs.builder()        
 *             .endDate(&#34;2019-06-20T17:30:00Z&#34;)
 *             .length(6)
 *             .name(&#34;test&#34;)
 *             .participants(ScheduleRotationParticipantArgs.builder()
 *                 .id(opsgenie_user.test().id())
 *                 .type(&#34;user&#34;)
 *                 .build())
 *             .scheduleId(opsgenie_schedule.test().id())
 *             .startDate(&#34;2019-06-18T17:00:00Z&#34;)
 *             .timeRestrictions(ScheduleRotationTimeRestrictionArgs.builder()
 *                 .restriction(ScheduleRotationTimeRestrictionRestrictionArgs.builder()
 *                     .endHour(10)
 *                     .endMin(1)
 *                     .startHour(1)
 *                     .startMin(1)
 *                     .build())
 *                 .type(&#34;time-of-day&#34;)
 *                 .build())
 *             .type(&#34;hourly&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Schedule Rotations can be imported using the `schedule_id/rotation_id`, e.g.
 * 
 * ```sh
 *  $ pulumi import opsgenie:index/scheduleRotation:ScheduleRotation * `opsgenie_schedule_rotation.test schedule_id/rotation_id`
 * ```
 * 
 */
@ResourceType(type="opsgenie:index/scheduleRotation:ScheduleRotation")
public class ScheduleRotation extends com.pulumi.resources.CustomResource {
    /**
     * This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     * 
     */
    @Export(name="endDate", type=String.class, parameters={})
    private Output</* @Nullable */ String> endDate;

    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     * 
     */
    public Output<Optional<String>> endDate() {
        return Codegen.optional(this.endDate);
    }
    /**
     * Length of the rotation with default value 1.
     * 
     */
    @Export(name="length", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> length;

    /**
     * @return Length of the rotation with default value 1.
     * 
     */
    public Output<Optional<Integer>> length() {
        return Codegen.optional(this.length);
    }
    /**
     * Name of rotation.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return Name of rotation.
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. &#34;user,escalation,team,none&#34;
     * 
     */
    @Export(name="participants", type=List.class, parameters={ScheduleRotationParticipant.class})
    private Output<List<ScheduleRotationParticipant>> participants;

    /**
     * @return List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. &#34;user,escalation,team,none&#34;
     * 
     */
    public Output<List<ScheduleRotationParticipant>> participants() {
        return this.participants;
    }
    /**
     * Identifier of the schedule.
     * 
     */
    @Export(name="scheduleId", type=String.class, parameters={})
    private Output<String> scheduleId;

    /**
     * @return Identifier of the schedule.
     * 
     */
    public Output<String> scheduleId() {
        return this.scheduleId;
    }
    /**
     * This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     * 
     */
    @Export(name="startDate", type=String.class, parameters={})
    private Output<String> startDate;

    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     * 
     */
    public Output<String> startDate() {
        return this.startDate;
    }
    @Export(name="timeRestrictions", type=List.class, parameters={ScheduleRotationTimeRestriction.class})
    private Output</* @Nullable */ List<ScheduleRotationTimeRestriction>> timeRestrictions;

    public Output<Optional<List<ScheduleRotationTimeRestriction>>> timeRestrictions() {
        return Codegen.optional(this.timeRestrictions);
    }
    /**
     * Type of rotation. May be one of daily, weekly and hourly.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of rotation. May be one of daily, weekly and hourly.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScheduleRotation(String name) {
        this(name, ScheduleRotationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScheduleRotation(String name, ScheduleRotationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScheduleRotation(String name, ScheduleRotationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/scheduleRotation:ScheduleRotation", name, args == null ? ScheduleRotationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScheduleRotation(String name, Output<String> id, @Nullable ScheduleRotationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("opsgenie:index/scheduleRotation:ScheduleRotation", name, state, makeResourceOptions(options, id));
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
    public static ScheduleRotation get(String name, Output<String> id, @Nullable ScheduleRotationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScheduleRotation(name, id, state, options);
    }
}
