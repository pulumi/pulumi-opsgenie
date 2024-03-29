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


public final class IntegrationActionAcknowledgeFilterConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationActionAcknowledgeFilterConditionArgs Empty = new IntegrationActionAcknowledgeFilterConditionArgs();

    @Import(name="expectedValue")
    private @Nullable Output<String> expectedValue;

    public Optional<Output<String>> expectedValue() {
        return Optional.ofNullable(this.expectedValue);
    }

    @Import(name="field", required=true)
    private Output<String> field;

    public Output<String> field() {
        return this.field;
    }

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="not")
    private @Nullable Output<Boolean> not;

    public Optional<Output<Boolean>> not() {
        return Optional.ofNullable(this.not);
    }

    @Import(name="operation", required=true)
    private Output<String> operation;

    public Output<String> operation() {
        return this.operation;
    }

    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return Integer value that defines in which order the action will be performed. Default: `1`.
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    private IntegrationActionAcknowledgeFilterConditionArgs() {}

    private IntegrationActionAcknowledgeFilterConditionArgs(IntegrationActionAcknowledgeFilterConditionArgs $) {
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
    public static Builder builder(IntegrationActionAcknowledgeFilterConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationActionAcknowledgeFilterConditionArgs $;

        public Builder() {
            $ = new IntegrationActionAcknowledgeFilterConditionArgs();
        }

        public Builder(IntegrationActionAcknowledgeFilterConditionArgs defaults) {
            $ = new IntegrationActionAcknowledgeFilterConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder expectedValue(@Nullable Output<String> expectedValue) {
            $.expectedValue = expectedValue;
            return this;
        }

        public Builder expectedValue(String expectedValue) {
            return expectedValue(Output.of(expectedValue));
        }

        public Builder field(Output<String> field) {
            $.field = field;
            return this;
        }

        public Builder field(String field) {
            return field(Output.of(field));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder not(@Nullable Output<Boolean> not) {
            $.not = not;
            return this;
        }

        public Builder not(Boolean not) {
            return not(Output.of(not));
        }

        public Builder operation(Output<String> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(String operation) {
            return operation(Output.of(operation));
        }

        /**
         * @param order Integer value that defines in which order the action will be performed. Default: `1`.
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order Integer value that defines in which order the action will be performed. Default: `1`.
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        public IntegrationActionAcknowledgeFilterConditionArgs build() {
            if ($.field == null) {
                throw new MissingRequiredPropertyException("IntegrationActionAcknowledgeFilterConditionArgs", "field");
            }
            if ($.operation == null) {
                throw new MissingRequiredPropertyException("IntegrationActionAcknowledgeFilterConditionArgs", "operation");
            }
            return $;
        }
    }

}
