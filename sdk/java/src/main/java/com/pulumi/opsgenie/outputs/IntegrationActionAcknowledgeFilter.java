// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.IntegrationActionAcknowledgeFilterCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationActionAcknowledgeFilter {
    private final @Nullable List<IntegrationActionAcknowledgeFilterCondition> conditions;
    /**
     * @return The responder type - can be `escalation`, `team` or `user`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private IntegrationActionAcknowledgeFilter(
        @CustomType.Parameter("conditions") @Nullable List<IntegrationActionAcknowledgeFilterCondition> conditions,
        @CustomType.Parameter("type") String type) {
        this.conditions = conditions;
        this.type = type;
    }

    public List<IntegrationActionAcknowledgeFilterCondition> conditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * @return The responder type - can be `escalation`, `team` or `user`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationActionAcknowledgeFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IntegrationActionAcknowledgeFilterCondition> conditions;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationActionAcknowledgeFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
    	      this.type = defaults.type;
        }

        public Builder conditions(@Nullable List<IntegrationActionAcknowledgeFilterCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public Builder conditions(IntegrationActionAcknowledgeFilterCondition... conditions) {
            return conditions(List.of(conditions));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public IntegrationActionAcknowledgeFilter build() {
            return new IntegrationActionAcknowledgeFilter(conditions, type);
        }
    }
}
