// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.IntegrationActionIgnoreFilterArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationActionIgnoreArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationActionIgnoreArgs Empty = new IntegrationActionIgnoreArgs();

    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<IntegrationActionIgnoreFilterArgs>> filters;

    /**
     * @return Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    public Optional<Output<List<IntegrationActionIgnoreFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Name of the integration action.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the integration action.
     * 
     */
    public Output<String> name() {
        return this.name;
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

    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private IntegrationActionIgnoreArgs() {}

    private IntegrationActionIgnoreArgs(IntegrationActionIgnoreArgs $) {
        this.filters = $.filters;
        this.name = $.name;
        this.order = $.order;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationActionIgnoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationActionIgnoreArgs $;

        public Builder() {
            $ = new IntegrationActionIgnoreArgs();
        }

        public Builder(IntegrationActionIgnoreArgs defaults) {
            $ = new IntegrationActionIgnoreArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
         * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
         * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
         * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<IntegrationActionIgnoreFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
         * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
         * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
         * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
         * 
         * @return builder
         * 
         */
        public Builder filters(List<IntegrationActionIgnoreFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
         * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
         * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
         * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
         * 
         * @return builder
         * 
         */
        public Builder filters(IntegrationActionIgnoreFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name Name of the integration action.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the integration action.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
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

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public IntegrationActionIgnoreArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("IntegrationActionIgnoreArgs", "name");
            }
            return $;
        }
    }

}
