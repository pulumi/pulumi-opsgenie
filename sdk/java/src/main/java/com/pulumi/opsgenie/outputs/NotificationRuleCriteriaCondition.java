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
public final class NotificationRuleCriteriaCondition {
    /**
     * @return User defined value that will be compared with alert field according to the operation. Default: empty string
     * 
     */
    private final @Nullable String expectedValue;
    /**
     * @return Possible values: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`
     * 
     */
    private final String field;
    /**
     * @return If &#39;field&#39; is set as &#39;extra-properties&#39;, key could be used for key-value pair
     * 
     */
    private final @Nullable String key;
    /**
     * @return Indicates behaviour of the given operation. Default: `false`
     * 
     */
    private final @Nullable Boolean not;
    /**
     * @return Possible values: `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`
     * 
     */
    private final String operation;
    /**
     * @return Order of the condition in conditions list
     * 
     */
    private final @Nullable Integer order;

    @CustomType.Constructor
    private NotificationRuleCriteriaCondition(
        @CustomType.Parameter("expectedValue") @Nullable String expectedValue,
        @CustomType.Parameter("field") String field,
        @CustomType.Parameter("key") @Nullable String key,
        @CustomType.Parameter("not") @Nullable Boolean not,
        @CustomType.Parameter("operation") String operation,
        @CustomType.Parameter("order") @Nullable Integer order) {
        this.expectedValue = expectedValue;
        this.field = field;
        this.key = key;
        this.not = not;
        this.operation = operation;
        this.order = order;
    }

    /**
     * @return User defined value that will be compared with alert field according to the operation. Default: empty string
     * 
     */
    public Optional<String> expectedValue() {
        return Optional.ofNullable(this.expectedValue);
    }
    /**
     * @return Possible values: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`
     * 
     */
    public String field() {
        return this.field;
    }
    /**
     * @return If &#39;field&#39; is set as &#39;extra-properties&#39;, key could be used for key-value pair
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return Indicates behaviour of the given operation. Default: `false`
     * 
     */
    public Optional<Boolean> not() {
        return Optional.ofNullable(this.not);
    }
    /**
     * @return Possible values: `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`
     * 
     */
    public String operation() {
        return this.operation;
    }
    /**
     * @return Order of the condition in conditions list
     * 
     */
    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleCriteriaCondition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expectedValue;
        private String field;
        private @Nullable String key;
        private @Nullable Boolean not;
        private String operation;
        private @Nullable Integer order;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRuleCriteriaCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expectedValue = defaults.expectedValue;
    	      this.field = defaults.field;
    	      this.key = defaults.key;
    	      this.not = defaults.not;
    	      this.operation = defaults.operation;
    	      this.order = defaults.order;
        }

        public Builder expectedValue(@Nullable String expectedValue) {
            this.expectedValue = expectedValue;
            return this;
        }
        public Builder field(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        public Builder not(@Nullable Boolean not) {
            this.not = not;
            return this;
        }
        public Builder operation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }        public NotificationRuleCriteriaCondition build() {
            return new NotificationRuleCriteriaCondition(expectedValue, field, key, not, operation, order);
        }
    }
}
