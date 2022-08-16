// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.opsgenie.inputs.ScheduleRotationParticipantArgs;
import com.pulumi.opsgenie.inputs.ScheduleRotationTimeRestrictionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScheduleRotationState extends com.pulumi.resources.ResourceArgs {

    public static final ScheduleRotationState Empty = new ScheduleRotationState();

    /**
     * This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     * 
     */
    @Import(name="endDate")
    private @Nullable Output<String> endDate;

    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     * 
     */
    public Optional<Output<String>> endDate() {
        return Optional.ofNullable(this.endDate);
    }

    /**
     * Length of the rotation with default value 1.
     * 
     */
    @Import(name="length")
    private @Nullable Output<Integer> length;

    /**
     * @return Length of the rotation with default value 1.
     * 
     */
    public Optional<Output<Integer>> length() {
        return Optional.ofNullable(this.length);
    }

    /**
     * Name of rotation.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of rotation.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. &#34;user,escalation,team,none&#34;
     * 
     */
    @Import(name="participants")
    private @Nullable Output<List<ScheduleRotationParticipantArgs>> participants;

    /**
     * @return List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. &#34;user,escalation,team,none&#34;
     * 
     */
    public Optional<Output<List<ScheduleRotationParticipantArgs>>> participants() {
        return Optional.ofNullable(this.participants);
    }

    /**
     * Identifier of the schedule.
     * 
     */
    @Import(name="scheduleId")
    private @Nullable Output<String> scheduleId;

    /**
     * @return Identifier of the schedule.
     * 
     */
    public Optional<Output<String>> scheduleId() {
        return Optional.ofNullable(this.scheduleId);
    }

    /**
     * This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     * 
     */
    @Import(name="startDate")
    private @Nullable Output<String> startDate;

    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
     * 
     */
    public Optional<Output<String>> startDate() {
        return Optional.ofNullable(this.startDate);
    }

    @Import(name="timeRestrictions")
    private @Nullable Output<List<ScheduleRotationTimeRestrictionArgs>> timeRestrictions;

    public Optional<Output<List<ScheduleRotationTimeRestrictionArgs>>> timeRestrictions() {
        return Optional.ofNullable(this.timeRestrictions);
    }

    /**
     * Type of rotation. May be one of daily, weekly and hourly.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of rotation. May be one of daily, weekly and hourly.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ScheduleRotationState() {}

    private ScheduleRotationState(ScheduleRotationState $) {
        this.endDate = $.endDate;
        this.length = $.length;
        this.name = $.name;
        this.participants = $.participants;
        this.scheduleId = $.scheduleId;
        this.startDate = $.startDate;
        this.timeRestrictions = $.timeRestrictions;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScheduleRotationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScheduleRotationState $;

        public Builder() {
            $ = new ScheduleRotationState();
        }

        public Builder(ScheduleRotationState defaults) {
            $ = new ScheduleRotationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endDate This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
         * 
         * @return builder
         * 
         */
        public Builder endDate(@Nullable Output<String> endDate) {
            $.endDate = endDate;
            return this;
        }

        /**
         * @param endDate This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
         * 
         * @return builder
         * 
         */
        public Builder endDate(String endDate) {
            return endDate(Output.of(endDate));
        }

        /**
         * @param length Length of the rotation with default value 1.
         * 
         * @return builder
         * 
         */
        public Builder length(@Nullable Output<Integer> length) {
            $.length = length;
            return this;
        }

        /**
         * @param length Length of the rotation with default value 1.
         * 
         * @return builder
         * 
         */
        public Builder length(Integer length) {
            return length(Output.of(length));
        }

        /**
         * @param name Name of rotation.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of rotation.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param participants List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. &#34;user,escalation,team,none&#34;
         * 
         * @return builder
         * 
         */
        public Builder participants(@Nullable Output<List<ScheduleRotationParticipantArgs>> participants) {
            $.participants = participants;
            return this;
        }

        /**
         * @param participants List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. &#34;user,escalation,team,none&#34;
         * 
         * @return builder
         * 
         */
        public Builder participants(List<ScheduleRotationParticipantArgs> participants) {
            return participants(Output.of(participants));
        }

        /**
         * @param participants List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. &#34;user,escalation,team,none&#34;
         * 
         * @return builder
         * 
         */
        public Builder participants(ScheduleRotationParticipantArgs... participants) {
            return participants(List.of(participants));
        }

        /**
         * @param scheduleId Identifier of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder scheduleId(@Nullable Output<String> scheduleId) {
            $.scheduleId = scheduleId;
            return this;
        }

        /**
         * @param scheduleId Identifier of the schedule.
         * 
         * @return builder
         * 
         */
        public Builder scheduleId(String scheduleId) {
            return scheduleId(Output.of(scheduleId));
        }

        /**
         * @param startDate This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
         * 
         * @return builder
         * 
         */
        public Builder startDate(@Nullable Output<String> startDate) {
            $.startDate = startDate;
            return this;
        }

        /**
         * @param startDate This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
         * 
         * @return builder
         * 
         */
        public Builder startDate(String startDate) {
            return startDate(Output.of(startDate));
        }

        public Builder timeRestrictions(@Nullable Output<List<ScheduleRotationTimeRestrictionArgs>> timeRestrictions) {
            $.timeRestrictions = timeRestrictions;
            return this;
        }

        public Builder timeRestrictions(List<ScheduleRotationTimeRestrictionArgs> timeRestrictions) {
            return timeRestrictions(Output.of(timeRestrictions));
        }

        public Builder timeRestrictions(ScheduleRotationTimeRestrictionArgs... timeRestrictions) {
            return timeRestrictions(List.of(timeRestrictions));
        }

        /**
         * @param type Type of rotation. May be one of daily, weekly and hourly.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of rotation. May be one of daily, weekly and hourly.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ScheduleRotationState build() {
            return $;
        }
    }

}
