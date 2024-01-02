// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyFilterConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPolicyFilterConditionArgs Empty = new NotificationPolicyFilterConditionArgs();

    /**
     * User defined value that will be compared with alert field according to the operation. Default: empty string
     * 
     */
    @Import(name="expectedValue")
    private @Nullable Output<String> expectedValue;

    /**
     * @return User defined value that will be compared with alert field according to the operation. Default: empty string
     * 
     */
    public Optional<Output<String>> expectedValue() {
        return Optional.ofNullable(this.expectedValue);
    }

    /**
     * Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `responders`, `teams`, `priority`
     * 
     */
    @Import(name="field", required=true)
    private Output<String> field;

    /**
     * @return Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `responders`, `teams`, `priority`
     * 
     */
    public Output<String> field() {
        return this.field;
    }

    /**
     * If `field` is set as extra-properties, key could be used for key-value pair
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return If `field` is set as extra-properties, key could be used for key-value pair
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Indicates behaviour of the given operation. Default: `false`
     * 
     */
    @Import(name="not")
    private @Nullable Output<Boolean> not;

    /**
     * @return Indicates behaviour of the given operation. Default: `false`
     * 
     */
    public Optional<Output<Boolean>> not() {
        return Optional.ofNullable(this.not);
    }

    /**
     * It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`.
     * 
     */
    @Import(name="operation", required=true)
    private Output<String> operation;

    /**
     * @return It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`.
     * 
     */
    public Output<String> operation() {
        return this.operation;
    }

    /**
     * Order of the condition in conditions list
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return Order of the condition in conditions list
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    private NotificationPolicyFilterConditionArgs() {}

    private NotificationPolicyFilterConditionArgs(NotificationPolicyFilterConditionArgs $) {
        this.expectedValue = $.expectedValue;
        this.field = $.field;
        this.key = $.key;
        this.not = $.not;
        this.operation = $.operation;
        this.order = $.order;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyFilterConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyFilterConditionArgs $;

        public Builder() {
            $ = new NotificationPolicyFilterConditionArgs();
        }

        public Builder(NotificationPolicyFilterConditionArgs defaults) {
            $ = new NotificationPolicyFilterConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expectedValue User defined value that will be compared with alert field according to the operation. Default: empty string
         * 
         * @return builder
         * 
         */
        public Builder expectedValue(@Nullable Output<String> expectedValue) {
            $.expectedValue = expectedValue;
            return this;
        }

        /**
         * @param expectedValue User defined value that will be compared with alert field according to the operation. Default: empty string
         * 
         * @return builder
         * 
         */
        public Builder expectedValue(String expectedValue) {
            return expectedValue(Output.of(expectedValue));
        }

        /**
         * @param field Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `responders`, `teams`, `priority`
         * 
         * @return builder
         * 
         */
        public Builder field(Output<String> field) {
            $.field = field;
            return this;
        }

        /**
         * @param field Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `responders`, `teams`, `priority`
         * 
         * @return builder
         * 
         */
        public Builder field(String field) {
            return field(Output.of(field));
        }

        /**
         * @param key If `field` is set as extra-properties, key could be used for key-value pair
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key If `field` is set as extra-properties, key could be used for key-value pair
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param not Indicates behaviour of the given operation. Default: `false`
         * 
         * @return builder
         * 
         */
        public Builder not(@Nullable Output<Boolean> not) {
            $.not = not;
            return this;
        }

        /**
         * @param not Indicates behaviour of the given operation. Default: `false`
         * 
         * @return builder
         * 
         */
        public Builder not(Boolean not) {
            return not(Output.of(not));
        }

        /**
         * @param operation It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`.
         * 
         * @return builder
         * 
         */
        public Builder operation(Output<String> operation) {
            $.operation = operation;
            return this;
        }

        /**
         * @param operation It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`.
         * 
         * @return builder
         * 
         */
        public Builder operation(String operation) {
            return operation(Output.of(operation));
        }

        /**
         * @param order Order of the condition in conditions list
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Order of the condition in conditions list
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public NotificationPolicyFilterConditionArgs build() {
            if ($.field == null) {
                throw new MissingRequiredPropertyException("NotificationPolicyFilterConditionArgs", "field");
            }
            if ($.operation == null) {
                throw new MissingRequiredPropertyException("NotificationPolicyFilterConditionArgs", "operation");
            }
            return $;
        }
    }

}
