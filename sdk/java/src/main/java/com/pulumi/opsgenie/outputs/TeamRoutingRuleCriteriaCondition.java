// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamRoutingRuleCriteriaCondition {
    private @Nullable String expectedValue;
    /**
     * @return Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `extra-properties`, `recipients`, `teams` or `priority`.
     * 
     */
    private String field;
    /**
     * @return If field is set as extra-properties, key could be used for key-value pair.
     * 
     */
    private @Nullable String key;
    /**
     * @return Indicates behaviour of the given operation. Default value is false.
     * 
     */
    private @Nullable Boolean not;
    /**
     * @return (true) It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty` and `equals-ignore-whitespace`.
     * 
     */
    private String operation;
    /**
     * @return Order of the condition in conditions list.
     * 
     */
    private @Nullable Integer order;

    private TeamRoutingRuleCriteriaCondition() {}
    public Optional<String> expectedValue() {
        return Optional.ofNullable(this.expectedValue);
    }
    /**
     * @return Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `extra-properties`, `recipients`, `teams` or `priority`.
     * 
     */
    public String field() {
        return this.field;
    }
    /**
     * @return If field is set as extra-properties, key could be used for key-value pair.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Indicates behaviour of the given operation. Default value is false.
     * 
     */
    public Optional<Boolean> not() {
        return Optional.ofNullable(this.not);
    }
    /**
     * @return (true) It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty` and `equals-ignore-whitespace`.
     * 
     */
    public String operation() {
        return this.operation;
    }
    /**
     * @return Order of the condition in conditions list.
     * 
     */
    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamRoutingRuleCriteriaCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expectedValue;
        private String field;
        private @Nullable String key;
        private @Nullable Boolean not;
        private String operation;
        private @Nullable Integer order;
        public Builder() {}
        public Builder(TeamRoutingRuleCriteriaCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedValue = defaults.expectedValue;
    	      this.field = defaults.field;
    	      this.key = defaults.key;
    	      this.not = defaults.not;
    	      this.operation = defaults.operation;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder expectedValue(@Nullable String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        @CustomType.Setter
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder not(@Nullable Boolean not) {
            this.not = not;
            return this;
        }
        @CustomType.Setter
        public Builder operation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }
        public TeamRoutingRuleCriteriaCondition build() {
            final var o = new TeamRoutingRuleCriteriaCondition();
            o.expectedValue = expectedValue;
            o.field = field;
            o.key = key;
            o.not = not;
            o.operation = operation;
            o.order = order;
            return o;
        }
    }
}
