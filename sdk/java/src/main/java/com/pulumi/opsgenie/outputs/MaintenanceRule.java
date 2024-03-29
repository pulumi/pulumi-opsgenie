// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.outputs.MaintenanceRuleEntity;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MaintenanceRule {
    /**
     * @return This field represents the entity that maintenance will be applied. Entity field takes two mandatory fields as id and type.
     * 
     */
    private List<MaintenanceRuleEntity> entities;
    /**
     * @return State of rule that will be defined in maintenance and can take either enabled or disabled for policy type rules. This field has to be disabled for integration type entity rules.
     * 
     */
    private @Nullable String state;

    private MaintenanceRule() {}
    /**
     * @return This field represents the entity that maintenance will be applied. Entity field takes two mandatory fields as id and type.
     * 
     */
    public List<MaintenanceRuleEntity> entities() {
        return this.entities;
    }
    /**
     * @return State of rule that will be defined in maintenance and can take either enabled or disabled for policy type rules. This field has to be disabled for integration type entity rules.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<MaintenanceRuleEntity> entities;
        private @Nullable String state;
        public Builder() {}
        public Builder(MaintenanceRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entities = defaults.entities;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder entities(List<MaintenanceRuleEntity> entities) {
            if (entities == null) {
              throw new MissingRequiredPropertyException("MaintenanceRule", "entities");
            }
            this.entities = entities;
            return this;
        }
        public Builder entities(MaintenanceRuleEntity... entities) {
            return entities(List.of(entities));
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {

            this.state = state;
            return this;
        }
        public MaintenanceRule build() {
            final var _resultValue = new MaintenanceRule();
            _resultValue.entities = entities;
            _resultValue.state = state;
            return _resultValue;
        }
    }
}
