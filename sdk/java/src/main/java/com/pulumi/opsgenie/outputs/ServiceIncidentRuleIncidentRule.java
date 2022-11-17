// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.ServiceIncidentRuleIncidentRuleCondition;
import com.pulumi.opsgenie.outputs.ServiceIncidentRuleIncidentRuleIncidentProperty;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceIncidentRuleIncidentRule {
    /**
     * @return A Condition type, supported types are: `match-all`, `match-any-condition`, `match-all-conditions`. Default: `match-all`
     * 
     */
    private @Nullable String conditionMatchType;
    /**
     * @return Conditions applied to incident. This is a block, structure is documented below.
     * 
     */
    private @Nullable List<ServiceIncidentRuleIncidentRuleCondition> conditions;
    /**
     * @return Properties for incident rule. This is a block, structure is documented below.
     * 
     */
    private List<ServiceIncidentRuleIncidentRuleIncidentProperty> incidentProperties;

    private ServiceIncidentRuleIncidentRule() {}
    /**
     * @return A Condition type, supported types are: `match-all`, `match-any-condition`, `match-all-conditions`. Default: `match-all`
     * 
     */
    public Optional<String> conditionMatchType() {
        return Optional.ofNullable(this.conditionMatchType);
    }
    /**
     * @return Conditions applied to incident. This is a block, structure is documented below.
     * 
     */
    public List<ServiceIncidentRuleIncidentRuleCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return Properties for incident rule. This is a block, structure is documented below.
     * 
     */
    public List<ServiceIncidentRuleIncidentRuleIncidentProperty> incidentProperties() {
        return this.incidentProperties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceIncidentRuleIncidentRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String conditionMatchType;
        private @Nullable List<ServiceIncidentRuleIncidentRuleCondition> conditions;
        private List<ServiceIncidentRuleIncidentRuleIncidentProperty> incidentProperties;
        public Builder() {}
        public Builder(ServiceIncidentRuleIncidentRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditionMatchType = defaults.conditionMatchType;
    	      this.conditions = defaults.conditions;
    	      this.incidentProperties = defaults.incidentProperties;
        }

        @CustomType.Setter
        public Builder conditionMatchType(@Nullable String conditionMatchType) {
            this.conditionMatchType = conditionMatchType;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(@Nullable List<ServiceIncidentRuleIncidentRuleCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(ServiceIncidentRuleIncidentRuleCondition... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder incidentProperties(List<ServiceIncidentRuleIncidentRuleIncidentProperty> incidentProperties) {
            this.incidentProperties = Objects.requireNonNull(incidentProperties);
            return this;
        }
        public Builder incidentProperties(ServiceIncidentRuleIncidentRuleIncidentProperty... incidentProperties) {
            return incidentProperties(List.of(incidentProperties));
        }
        public ServiceIncidentRuleIncidentRule build() {
            final var o = new ServiceIncidentRuleIncidentRule();
            o.conditionMatchType = conditionMatchType;
            o.conditions = conditions;
            o.incidentProperties = incidentProperties;
            return o;
        }
    }
}
