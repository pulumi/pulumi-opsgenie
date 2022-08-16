// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationPolicyDelayActionDuration {
    /**
     * @return A amount of time in `time_units`. This is a integer attribute.
     * 
     */
    private final Integer timeAmount;
    /**
     * @return Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
     * 
     */
    private final @Nullable String timeUnit;

    @CustomType.Constructor
    private NotificationPolicyDelayActionDuration(
        @CustomType.Parameter("timeAmount") Integer timeAmount,
        @CustomType.Parameter("timeUnit") @Nullable String timeUnit) {
        this.timeAmount = timeAmount;
        this.timeUnit = timeUnit;
    }

    /**
     * @return A amount of time in `time_units`. This is a integer attribute.
     * 
     */
    public Integer timeAmount() {
        return this.timeAmount;
    }
    /**
     * @return Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
     * 
     */
    public Optional<String> timeUnit() {
        return Optional.ofNullable(this.timeUnit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPolicyDelayActionDuration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer timeAmount;
        private @Nullable String timeUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationPolicyDelayActionDuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeAmount = defaults.timeAmount;
    	      this.timeUnit = defaults.timeUnit;
        }

        public Builder timeAmount(Integer timeAmount) {
            this.timeAmount = Objects.requireNonNull(timeAmount);
            return this;
        }
        public Builder timeUnit(@Nullable String timeUnit) {
            this.timeUnit = timeUnit;
            return this;
        }        public NotificationPolicyDelayActionDuration build() {
            return new NotificationPolicyDelayActionDuration(timeAmount, timeUnit);
        }
    }
}
