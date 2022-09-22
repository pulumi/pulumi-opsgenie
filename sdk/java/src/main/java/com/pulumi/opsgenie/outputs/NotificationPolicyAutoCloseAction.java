// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.NotificationPolicyAutoCloseActionDuration;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NotificationPolicyAutoCloseAction {
    /**
     * @return Duration of this action. If `delay_option` = `for-duration` this has to be set. This is a block, structure is documented below.
     * 
     */
    private List<NotificationPolicyAutoCloseActionDuration> durations;

    private NotificationPolicyAutoCloseAction() {}
    /**
     * @return Duration of this action. If `delay_option` = `for-duration` this has to be set. This is a block, structure is documented below.
     * 
     */
    public List<NotificationPolicyAutoCloseActionDuration> durations() {
        return this.durations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationPolicyAutoCloseAction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<NotificationPolicyAutoCloseActionDuration> durations;
        public Builder() {}
        public Builder(NotificationPolicyAutoCloseAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durations = defaults.durations;
        }

        @CustomType.Setter
        public Builder durations(List<NotificationPolicyAutoCloseActionDuration> durations) {
            this.durations = Objects.requireNonNull(durations);
            return this;
        }
        public Builder durations(NotificationPolicyAutoCloseActionDuration... durations) {
            return durations(List.of(durations));
        }
        public NotificationPolicyAutoCloseAction build() {
            final var o = new NotificationPolicyAutoCloseAction();
            o.durations = durations;
            return o;
        }
    }
}
