// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HeartbeatState extends com.pulumi.resources.ResourceArgs {

    public static final HeartbeatState Empty = new HeartbeatState();

    /**
     * Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is &#34;HeartbeatName is expired&#34;.
     * 
     */
    @Import(name="alertMessage")
    private @Nullable Output<String> alertMessage;

    /**
     * @return Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is &#34;HeartbeatName is expired&#34;.
     * 
     */
    public Optional<Output<String>> alertMessage() {
        return Optional.ofNullable(this.alertMessage);
    }

    /**
     * Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     * 
     */
    @Import(name="alertPriority")
    private @Nullable Output<String> alertPriority;

    /**
     * @return Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
     * 
     */
    public Optional<Output<String>> alertPriority() {
        return Optional.ofNullable(this.alertPriority);
    }

    /**
     * Specifies the alert tags for heartbeat expiration alert.
     * 
     */
    @Import(name="alertTags")
    private @Nullable Output<List<String>> alertTags;

    /**
     * @return Specifies the alert tags for heartbeat expiration alert.
     * 
     */
    public Optional<Output<List<String>>> alertTags() {
        return Optional.ofNullable(this.alertTags);
    }

    /**
     * An optional description of the heartbeat
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of the heartbeat
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Enable/disable heartbeat monitoring.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable/disable heartbeat monitoring.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies how often a heartbeat message should be expected.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<Integer> interval;

    /**
     * @return Specifies how often a heartbeat message should be expected.
     * 
     */
    public Optional<Output<Integer>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * Interval specified as minutes, hours or days.
     * 
     */
    @Import(name="intervalUnit")
    private @Nullable Output<String> intervalUnit;

    /**
     * @return Interval specified as minutes, hours or days.
     * 
     */
    public Optional<Output<String>> intervalUnit() {
        return Optional.ofNullable(this.intervalUnit);
    }

    /**
     * Name of the heartbeat
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the heartbeat
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Owner team of the heartbeat.
     * 
     */
    @Import(name="ownerTeamId")
    private @Nullable Output<String> ownerTeamId;

    /**
     * @return Owner team of the heartbeat.
     * 
     */
    public Optional<Output<String>> ownerTeamId() {
        return Optional.ofNullable(this.ownerTeamId);
    }

    private HeartbeatState() {}

    private HeartbeatState(HeartbeatState $) {
        this.alertMessage = $.alertMessage;
        this.alertPriority = $.alertPriority;
        this.alertTags = $.alertTags;
        this.description = $.description;
        this.enabled = $.enabled;
        this.interval = $.interval;
        this.intervalUnit = $.intervalUnit;
        this.name = $.name;
        this.ownerTeamId = $.ownerTeamId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HeartbeatState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HeartbeatState $;

        public Builder() {
            $ = new HeartbeatState();
        }

        public Builder(HeartbeatState defaults) {
            $ = new HeartbeatState(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertMessage Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is &#34;HeartbeatName is expired&#34;.
         * 
         * @return builder
         * 
         */
        public Builder alertMessage(@Nullable Output<String> alertMessage) {
            $.alertMessage = alertMessage;
            return this;
        }

        /**
         * @param alertMessage Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is &#34;HeartbeatName is expired&#34;.
         * 
         * @return builder
         * 
         */
        public Builder alertMessage(String alertMessage) {
            return alertMessage(Output.of(alertMessage));
        }

        /**
         * @param alertPriority Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
         * 
         * @return builder
         * 
         */
        public Builder alertPriority(@Nullable Output<String> alertPriority) {
            $.alertPriority = alertPriority;
            return this;
        }

        /**
         * @param alertPriority Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
         * 
         * @return builder
         * 
         */
        public Builder alertPriority(String alertPriority) {
            return alertPriority(Output.of(alertPriority));
        }

        /**
         * @param alertTags Specifies the alert tags for heartbeat expiration alert.
         * 
         * @return builder
         * 
         */
        public Builder alertTags(@Nullable Output<List<String>> alertTags) {
            $.alertTags = alertTags;
            return this;
        }

        /**
         * @param alertTags Specifies the alert tags for heartbeat expiration alert.
         * 
         * @return builder
         * 
         */
        public Builder alertTags(List<String> alertTags) {
            return alertTags(Output.of(alertTags));
        }

        /**
         * @param alertTags Specifies the alert tags for heartbeat expiration alert.
         * 
         * @return builder
         * 
         */
        public Builder alertTags(String... alertTags) {
            return alertTags(List.of(alertTags));
        }

        /**
         * @param description An optional description of the heartbeat
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of the heartbeat
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Enable/disable heartbeat monitoring.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable/disable heartbeat monitoring.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param interval Specifies how often a heartbeat message should be expected.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<Integer> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Specifies how often a heartbeat message should be expected.
         * 
         * @return builder
         * 
         */
        public Builder interval(Integer interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param intervalUnit Interval specified as minutes, hours or days.
         * 
         * @return builder
         * 
         */
        public Builder intervalUnit(@Nullable Output<String> intervalUnit) {
            $.intervalUnit = intervalUnit;
            return this;
        }

        /**
         * @param intervalUnit Interval specified as minutes, hours or days.
         * 
         * @return builder
         * 
         */
        public Builder intervalUnit(String intervalUnit) {
            return intervalUnit(Output.of(intervalUnit));
        }

        /**
         * @param name Name of the heartbeat
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the heartbeat
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerTeamId Owner team of the heartbeat.
         * 
         * @return builder
         * 
         */
        public Builder ownerTeamId(@Nullable Output<String> ownerTeamId) {
            $.ownerTeamId = ownerTeamId;
            return this;
        }

        /**
         * @param ownerTeamId Owner team of the heartbeat.
         * 
         * @return builder
         * 
         */
        public Builder ownerTeamId(String ownerTeamId) {
            return ownerTeamId(Output.of(ownerTeamId));
        }

        public HeartbeatState build() {
            return $;
        }
    }

}
