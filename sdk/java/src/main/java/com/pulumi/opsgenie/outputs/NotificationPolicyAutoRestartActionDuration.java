// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationPolicyAutoRestartActionDuration {
    /**
     * @return A amount of time in `time_units`. This is a integer attribute.
     * 
     */
    private Integer timeAmount;
    /**
     * @return Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
     * 
     */
    private @Nullable String timeUnit;

    private NotificationPolicyAutoRestartActionDuration() {}
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

    public static Builder builder(NotificationPolicyAutoRestartActionDuration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer timeAmount;
        private @Nullable String timeUnit;
        public Builder() {}
        public Builder(NotificationPolicyAutoRestartActionDuration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeAmount = defaults.timeAmount;
    	      this.timeUnit = defaults.timeUnit;
        }

        @CustomType.Setter
        public Builder timeAmount(Integer timeAmount) {
            if (timeAmount == null) {
              throw new MissingRequiredPropertyException("NotificationPolicyAutoRestartActionDuration", "timeAmount");
            }
            this.timeAmount = timeAmount;
            return this;
        }
        @CustomType.Setter
        public Builder timeUnit(@Nullable String timeUnit) {

            this.timeUnit = timeUnit;
            return this;
        }
        public NotificationPolicyAutoRestartActionDuration build() {
            final var _resultValue = new NotificationPolicyAutoRestartActionDuration();
            _resultValue.timeAmount = timeAmount;
            _resultValue.timeUnit = timeUnit;
            return _resultValue;
        }
    }
}
