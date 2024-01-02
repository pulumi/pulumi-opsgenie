// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationRuleRepeat {
    /**
     * @return If policy should be enabled. Default: `true`
     * 
     */
    private @Nullable Boolean enabled;
    private Integer loopAfter;

    private NotificationRuleRepeat() {}
    /**
     * @return If policy should be enabled. Default: `true`
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Integer loopAfter() {
        return this.loopAfter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleRepeat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        private Integer loopAfter;
        public Builder() {}
        public Builder(NotificationRuleRepeat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.loopAfter = defaults.loopAfter;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder loopAfter(Integer loopAfter) {
            if (loopAfter == null) {
              throw new MissingRequiredPropertyException("NotificationRuleRepeat", "loopAfter");
            }
            this.loopAfter = loopAfter;
            return this;
        }
        public NotificationRuleRepeat build() {
            final var _resultValue = new NotificationRuleRepeat();
            _resultValue.enabled = enabled;
            _resultValue.loopAfter = loopAfter;
            return _resultValue;
        }
    }
}
