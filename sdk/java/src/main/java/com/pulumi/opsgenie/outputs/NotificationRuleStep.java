// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.outputs.NotificationRuleStepContact;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationRuleStep {
    /**
     * @return Defines the contact that notification will be sent to. This is a block, structure is documented below.
     * 
     */
    private List<NotificationRuleStepContact> contacts;
    /**
     * @return Defined if this step is enabled. Default: `true`
     * 
     */
    private @Nullable Boolean enabled;
    /**
     * @return Time period, in minutes, notification will be sent after.
     * 
     */
    private @Nullable Integer sendAfter;

    private NotificationRuleStep() {}
    /**
     * @return Defines the contact that notification will be sent to. This is a block, structure is documented below.
     * 
     */
    public List<NotificationRuleStepContact> contacts() {
        return this.contacts;
    }
    /**
     * @return Defined if this step is enabled. Default: `true`
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Time period, in minutes, notification will be sent after.
     * 
     */
    public Optional<Integer> sendAfter() {
        return Optional.ofNullable(this.sendAfter);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<NotificationRuleStepContact> contacts;
        private @Nullable Boolean enabled;
        private @Nullable Integer sendAfter;
        public Builder() {}
        public Builder(NotificationRuleStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contacts = defaults.contacts;
    	      this.enabled = defaults.enabled;
    	      this.sendAfter = defaults.sendAfter;
        }

        @CustomType.Setter
        public Builder contacts(List<NotificationRuleStepContact> contacts) {
            if (contacts == null) {
              throw new MissingRequiredPropertyException("NotificationRuleStep", "contacts");
            }
            this.contacts = contacts;
            return this;
        }
        public Builder contacts(NotificationRuleStepContact... contacts) {
            return contacts(List.of(contacts));
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder sendAfter(@Nullable Integer sendAfter) {

            this.sendAfter = sendAfter;
            return this;
        }
        public NotificationRuleStep build() {
            final var _resultValue = new NotificationRuleStep();
            _resultValue.contacts = contacts;
            _resultValue.enabled = enabled;
            _resultValue.sendAfter = sendAfter;
            return _resultValue;
        }
    }
}
