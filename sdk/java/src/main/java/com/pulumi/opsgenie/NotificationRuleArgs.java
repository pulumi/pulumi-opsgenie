// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.opsgenie.inputs.NotificationRuleCriteriaArgs;
import com.pulumi.opsgenie.inputs.NotificationRuleRepeatArgs;
import com.pulumi.opsgenie.inputs.NotificationRuleScheduleArgs;
import com.pulumi.opsgenie.inputs.NotificationRuleStepArgs;
import com.pulumi.opsgenie.inputs.NotificationRuleTimeRestrictionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRuleArgs Empty = new NotificationRuleArgs();

    /**
     * Type of the action that notification rule will have. Allowed values: `create-alert`, `acknowledged-alert`, `closed-alert`, `assigned-alert`, `add-note`, `schedule-start`, `schedule-end`, `incoming-call-routing`
     * 
     */
    @Import(name="actionType", required=true)
    private Output<String> actionType;

    /**
     * @return Type of the action that notification rule will have. Allowed values: `create-alert`, `acknowledged-alert`, `closed-alert`, `assigned-alert`, `add-note`, `schedule-start`, `schedule-end`, `incoming-call-routing`
     * 
     */
    public Output<String> actionType() {
        return this.actionType;
    }

    @Import(name="criterias")
    private @Nullable Output<List<NotificationRuleCriteriaArgs>> criterias;

    public Optional<Output<List<NotificationRuleCriteriaArgs>>> criterias() {
        return Optional.ofNullable(this.criterias);
    }

    /**
     * If policy should be enabled. Default: `true`
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return If policy should be enabled. Default: `true`
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Name of the notification policy
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the notification policy
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `action_type` is `schedule-start` or `schedule-end` then it is required.
     * 
     */
    @Import(name="notificationTimes")
    private @Nullable Output<List<String>> notificationTimes;

    /**
     * @return List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `action_type` is `schedule-start` or `schedule-end` then it is required.
     * 
     */
    public Optional<Output<List<String>>> notificationTimes() {
        return Optional.ofNullable(this.notificationTimes);
    }

    /**
     * Order of the condition in conditions list
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return Order of the condition in conditions list
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    @Import(name="repeats")
    private @Nullable Output<List<NotificationRuleRepeatArgs>> repeats;

    public Optional<Output<List<NotificationRuleRepeatArgs>>> repeats() {
        return Optional.ofNullable(this.repeats);
    }

    @Import(name="schedules")
    private @Nullable Output<List<NotificationRuleScheduleArgs>> schedules;

    public Optional<Output<List<NotificationRuleScheduleArgs>>> schedules() {
        return Optional.ofNullable(this.schedules);
    }

    /**
     * Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
     * 
     */
    @Import(name="steps")
    private @Nullable Output<List<NotificationRuleStepArgs>> steps;

    /**
     * @return Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
     * 
     */
    public Optional<Output<List<NotificationRuleStepArgs>>> steps() {
        return Optional.ofNullable(this.steps);
    }

    @Import(name="timeRestrictions")
    private @Nullable Output<List<NotificationRuleTimeRestrictionArgs>> timeRestrictions;

    public Optional<Output<List<NotificationRuleTimeRestrictionArgs>>> timeRestrictions() {
        return Optional.ofNullable(this.timeRestrictions);
    }

    /**
     * Username of user to which this notification rule belongs to.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username of user to which this notification rule belongs to.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private NotificationRuleArgs() {}

    private NotificationRuleArgs(NotificationRuleArgs $) {
        this.actionType = $.actionType;
        this.criterias = $.criterias;
        this.enabled = $.enabled;
        this.name = $.name;
        this.notificationTimes = $.notificationTimes;
        this.order = $.order;
        this.repeats = $.repeats;
        this.schedules = $.schedules;
        this.steps = $.steps;
        this.timeRestrictions = $.timeRestrictions;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRuleArgs $;

        public Builder() {
            $ = new NotificationRuleArgs();
        }

        public Builder(NotificationRuleArgs defaults) {
            $ = new NotificationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionType Type of the action that notification rule will have. Allowed values: `create-alert`, `acknowledged-alert`, `closed-alert`, `assigned-alert`, `add-note`, `schedule-start`, `schedule-end`, `incoming-call-routing`
         * 
         * @return builder
         * 
         */
        public Builder actionType(Output<String> actionType) {
            $.actionType = actionType;
            return this;
        }

        /**
         * @param actionType Type of the action that notification rule will have. Allowed values: `create-alert`, `acknowledged-alert`, `closed-alert`, `assigned-alert`, `add-note`, `schedule-start`, `schedule-end`, `incoming-call-routing`
         * 
         * @return builder
         * 
         */
        public Builder actionType(String actionType) {
            return actionType(Output.of(actionType));
        }

        public Builder criterias(@Nullable Output<List<NotificationRuleCriteriaArgs>> criterias) {
            $.criterias = criterias;
            return this;
        }

        public Builder criterias(List<NotificationRuleCriteriaArgs> criterias) {
            return criterias(Output.of(criterias));
        }

        public Builder criterias(NotificationRuleCriteriaArgs... criterias) {
            return criterias(List.of(criterias));
        }

        /**
         * @param enabled If policy should be enabled. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If policy should be enabled. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Name of the notification policy
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the notification policy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationTimes List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `action_type` is `schedule-start` or `schedule-end` then it is required.
         * 
         * @return builder
         * 
         */
        public Builder notificationTimes(@Nullable Output<List<String>> notificationTimes) {
            $.notificationTimes = notificationTimes;
            return this;
        }

        /**
         * @param notificationTimes List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `action_type` is `schedule-start` or `schedule-end` then it is required.
         * 
         * @return builder
         * 
         */
        public Builder notificationTimes(List<String> notificationTimes) {
            return notificationTimes(Output.of(notificationTimes));
        }

        /**
         * @param notificationTimes List of Time Periods that notification for schedule start/end will be sent. Allowed values: `just-before`, `15-minutes-ago`, `1-hour-ago`, `1-day-ago`. If `action_type` is `schedule-start` or `schedule-end` then it is required.
         * 
         * @return builder
         * 
         */
        public Builder notificationTimes(String... notificationTimes) {
            return notificationTimes(List.of(notificationTimes));
        }

        /**
         * @param order Order of the condition in conditions list
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Order of the condition in conditions list
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public Builder repeats(@Nullable Output<List<NotificationRuleRepeatArgs>> repeats) {
            $.repeats = repeats;
            return this;
        }

        public Builder repeats(List<NotificationRuleRepeatArgs> repeats) {
            return repeats(Output.of(repeats));
        }

        public Builder repeats(NotificationRuleRepeatArgs... repeats) {
            return repeats(List.of(repeats));
        }

        public Builder schedules(@Nullable Output<List<NotificationRuleScheduleArgs>> schedules) {
            $.schedules = schedules;
            return this;
        }

        public Builder schedules(List<NotificationRuleScheduleArgs> schedules) {
            return schedules(Output.of(schedules));
        }

        public Builder schedules(NotificationRuleScheduleArgs... schedules) {
            return schedules(List.of(schedules));
        }

        /**
         * @param steps Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder steps(@Nullable Output<List<NotificationRuleStepArgs>> steps) {
            $.steps = steps;
            return this;
        }

        /**
         * @param steps Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder steps(List<NotificationRuleStepArgs> steps) {
            return steps(Output.of(steps));
        }

        /**
         * @param steps Notification rule steps to take (eg. SMS or email message). This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder steps(NotificationRuleStepArgs... steps) {
            return steps(List.of(steps));
        }

        public Builder timeRestrictions(@Nullable Output<List<NotificationRuleTimeRestrictionArgs>> timeRestrictions) {
            $.timeRestrictions = timeRestrictions;
            return this;
        }

        public Builder timeRestrictions(List<NotificationRuleTimeRestrictionArgs> timeRestrictions) {
            return timeRestrictions(Output.of(timeRestrictions));
        }

        public Builder timeRestrictions(NotificationRuleTimeRestrictionArgs... timeRestrictions) {
            return timeRestrictions(List.of(timeRestrictions));
        }

        /**
         * @param username Username of user to which this notification rule belongs to.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username of user to which this notification rule belongs to.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public NotificationRuleArgs build() {
            $.actionType = Objects.requireNonNull($.actionType, "expected parameter 'actionType' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
