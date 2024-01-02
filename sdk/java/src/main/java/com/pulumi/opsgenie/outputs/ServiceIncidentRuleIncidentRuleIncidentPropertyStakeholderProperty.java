// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty {
    /**
     * @return Description that is generally used to provide a detailed information about the alert.
     * 
     */
    private @Nullable String description;
    /**
     * @return Option to enable stakeholder notifications.Default value is true.
     * 
     */
    private @Nullable Boolean enable;
    /**
     * @return Message that is to be passed to audience that is generally used to provide a content information about the alert.
     * 
     */
    private String message;

    private ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty() {}
    /**
     * @return Description that is generally used to provide a detailed information about the alert.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Option to enable stakeholder notifications.Default value is true.
     * 
     */
    public Optional<Boolean> enable() {
        return Optional.ofNullable(this.enable);
    }
    /**
     * @return Message that is to be passed to audience that is generally used to provide a content information about the alert.
     * 
     */
    public String message() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable Boolean enable;
        private String message;
        public Builder() {}
        public Builder(ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.enable = defaults.enable;
    	      this.message = defaults.message;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder enable(@Nullable Boolean enable) {

            this.enable = enable;
            return this;
        }
        @CustomType.Setter
        public Builder message(String message) {
            if (message == null) {
              throw new MissingRequiredPropertyException("ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty", "message");
            }
            this.message = message;
            return this;
        }
        public ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty build() {
            final var _resultValue = new ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty();
            _resultValue.description = description;
            _resultValue.enable = enable;
            _resultValue.message = message;
            return _resultValue;
        }
    }
}
