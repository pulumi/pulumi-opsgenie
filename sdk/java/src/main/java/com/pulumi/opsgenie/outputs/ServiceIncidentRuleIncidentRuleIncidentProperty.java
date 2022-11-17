// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIncidentRuleIncidentRuleIncidentProperty {
    /**
     * @return Description that is generally used to provide a detailed information about the alert.
     * 
     */
    private @Nullable String description;
    /**
     * @return Map of key-value pairs to use as custom properties of the alert.
     * 
     */
    private @Nullable Map<String,String> details;
    /**
     * @return Message that is to be passed to audience that is generally used to provide a content information about the alert.
     * 
     */
    private String message;
    /**
     * @return Priority level of the alert. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`
     * 
     */
    private String priority;
    /**
     * @return DEtails about stakeholders for this rule. This is a block, structure is documented below.
     * 
     */
    private List<ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty> stakeholderProperties;
    /**
     * @return Tags of the alert.
     * 
     */
    private @Nullable List<String> tags;

    private ServiceIncidentRuleIncidentRuleIncidentProperty() {}
    /**
     * @return Description that is generally used to provide a detailed information about the alert.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Map of key-value pairs to use as custom properties of the alert.
     * 
     */
    public Map<String,String> details() {
        return this.details == null ? Map.of() : this.details;
    }
    /**
     * @return Message that is to be passed to audience that is generally used to provide a content information about the alert.
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return Priority level of the alert. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`
     * 
     */
    public String priority() {
        return this.priority;
    }
    /**
     * @return DEtails about stakeholders for this rule. This is a block, structure is documented below.
     * 
     */
    public List<ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty> stakeholderProperties() {
        return this.stakeholderProperties;
    }
    /**
     * @return Tags of the alert.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIncidentRuleIncidentRuleIncidentProperty defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable Map<String,String> details;
        private String message;
        private String priority;
        private List<ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty> stakeholderProperties;
        private @Nullable List<String> tags;
        public Builder() {}
        public Builder(ServiceIncidentRuleIncidentRuleIncidentProperty defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.priority = defaults.priority;
    	      this.stakeholderProperties = defaults.stakeholderProperties;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder details(@Nullable Map<String,String> details) {
            this.details = details;
            return this;
        }
        @CustomType.Setter
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        @CustomType.Setter
        public Builder priority(String priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        @CustomType.Setter
        public Builder stakeholderProperties(List<ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty> stakeholderProperties) {
            this.stakeholderProperties = Objects.requireNonNull(stakeholderProperties);
            return this;
        }
        public Builder stakeholderProperties(ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty... stakeholderProperties) {
            return stakeholderProperties(List.of(stakeholderProperties));
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public ServiceIncidentRuleIncidentRuleIncidentProperty build() {
            final var o = new ServiceIncidentRuleIncidentRuleIncidentProperty();
            o.description = description;
            o.details = details;
            o.message = message;
            o.priority = priority;
            o.stakeholderProperties = stakeholderProperties;
            o.tags = tags;
            return o;
        }
    }
}
