// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.NotificationPolicyDelayActionDuration;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationPolicyDelayAction {
    /**
     * @return Defines until what day to delay or for what duration. Possible values are: `for-duration`, `next-time`, `next-weekday`, `next-monday`, `next-tuesday`, `next-wednesday`, `next-thursday`, `next-friday`, `next-saturday`, `next-sunday`
     * 
     */
    private final String delayOption;
    /**
     * @return Duration of this action. If `delay_option` = `for-duration` this has to be set. This is a block, structure is documented below.
     * 
     */
    private final @Nullable List<NotificationPolicyDelayActionDuration> durations;
    /**
     * @return Until what hour notifications will be delayed. If `delay_option` is set to antyhing else then `for-duration` this has to be set.
     * 
     */
    private final @Nullable Integer untilHour;
    /**
     * @return Until what minute on `until_hour` notifications will be delayed. If `delay_option` is set to antyhing else then `for-duration` this has to be set.
     * 
     */
    private final @Nullable Integer untilMinute;

    @CustomType.Constructor
    private NotificationPolicyDelayAction(
        @CustomType.Parameter("delayOption") String delayOption,
        @CustomType.Parameter("durations") @Nullable List<NotificationPolicyDelayActionDuration> durations,
        @CustomType.Parameter("untilHour") @Nullable Integer untilHour,
        @CustomType.Parameter("untilMinute") @Nullable Integer untilMinute) {
        this.delayOption = delayOption;
        this.durations = durations;
        this.untilHour = untilHour;
        this.untilMinute = untilMinute;
    }

    /**
     * @return Defines until what day to delay or for what duration. Possible values are: `for-duration`, `next-time`, `next-weekday`, `next-monday`, `next-tuesday`, `next-wednesday`, `next-thursday`, `next-friday`, `next-saturday`, `next-sunday`
     * 
     */
    public String delayOption() {
        return this.delayOption;
    }
    /**
     * @return Duration of this action. If `delay_option` = `for-duration` this has to be set. This is a block, structure is documented below.
     * 
     */
    public List<NotificationPolicyDelayActionDuration> durations() {
        return this.durations == null ? List.of() : this.durations;
    }
    /**
     * @return Until what hour notifications will be delayed. If `delay_option` is set to antyhing else then `for-duration` this has to be set.
     * 
     */
    public Optional<Integer> untilHour() {
        return Optional.ofNullable(this.untilHour);
    }
    /**
     * @return Until what minute on `until_hour` notifications will be delayed. If `delay_option` is set to antyhing else then `for-duration` this has to be set.
     * 
     */
    public Optional<Integer> untilMinute() {
        return Optional.ofNullable(this.untilMinute);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPolicyDelayAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String delayOption;
        private @Nullable List<NotificationPolicyDelayActionDuration> durations;
        private @Nullable Integer untilHour;
        private @Nullable Integer untilMinute;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationPolicyDelayAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delayOption = defaults.delayOption;
    	      this.durations = defaults.durations;
    	      this.untilHour = defaults.untilHour;
    	      this.untilMinute = defaults.untilMinute;
        }

        public Builder delayOption(String delayOption) {
            this.delayOption = Objects.requireNonNull(delayOption);
            return this;
        }
        public Builder durations(@Nullable List<NotificationPolicyDelayActionDuration> durations) {
            this.durations = durations;
            return this;
        }
        public Builder durations(NotificationPolicyDelayActionDuration... durations) {
            return durations(List.of(durations));
        }
        public Builder untilHour(@Nullable Integer untilHour) {
            this.untilHour = untilHour;
            return this;
        }
        public Builder untilMinute(@Nullable Integer untilMinute) {
            this.untilMinute = untilMinute;
            return this;
        }        public NotificationPolicyDelayAction build() {
            return new NotificationPolicyDelayAction(delayOption, durations, untilHour, untilMinute);
        }
    }
}
