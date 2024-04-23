// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.IntegrationActionAcknowledgeFilterArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationActionAcknowledgeArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationActionAcknowledgeArgs Empty = new IntegrationActionAcknowledgeArgs();

    /**
     * An identifier that is used for alert deduplication. Default: `{{alias}}`.
     * 
     */
    @Import(name="alias")
    private @Nullable Output<String> alias;

    /**
     * @return An identifier that is used for alert deduplication. Default: `{{alias}}`.
     * 
     */
    public Optional<Output<String>> alias() {
        return Optional.ofNullable(this.alias);
    }

    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<IntegrationActionAcknowledgeFilterArgs>> filters;

    /**
     * @return Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    public Optional<Output<List<IntegrationActionAcknowledgeFilterArgs>>> filters() {
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
     * Additional alert action note.
     * 
     */
    @Import(name="note")
    private @Nullable Output<String> note;

    /**
     * @return Additional alert action note.
     * 
     */
    public Optional<Output<String>> note() {
        return Optional.ofNullable(this.note);
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

    /**
     * Owner of the execution for integration action.
     * 
     */
    @Import(name="user")
    private @Nullable Output<String> user;

    /**
     * @return Owner of the execution for integration action.
     * 
     */
    public Optional<Output<String>> user() {
        return Optional.ofNullable(this.user);
    }

    private IntegrationActionAcknowledgeArgs() {}

    private IntegrationActionAcknowledgeArgs(IntegrationActionAcknowledgeArgs $) {
        this.alias = $.alias;
        this.filters = $.filters;
        this.name = $.name;
        this.note = $.note;
        this.order = $.order;
        this.type = $.type;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationActionAcknowledgeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationActionAcknowledgeArgs $;

        public Builder() {
            $ = new IntegrationActionAcknowledgeArgs();
        }

        public Builder(IntegrationActionAcknowledgeArgs defaults) {
            $ = new IntegrationActionAcknowledgeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alias An identifier that is used for alert deduplication. Default: `{{alias}}`.
         * 
         * @return builder
         * 
         */
        public Builder alias(@Nullable Output<String> alias) {
            $.alias = alias;
            return this;
        }

        /**
         * @param alias An identifier that is used for alert deduplication. Default: `{{alias}}`.
         * 
         * @return builder
         * 
         */
        public Builder alias(String alias) {
            return alias(Output.of(alias));
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
        public Builder filters(@Nullable Output<List<IntegrationActionAcknowledgeFilterArgs>> filters) {
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
        public Builder filters(List<IntegrationActionAcknowledgeFilterArgs> filters) {
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
        public Builder filters(IntegrationActionAcknowledgeFilterArgs... filters) {
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
         * @param note Additional alert action note.
         * 
         * @return builder
         * 
         */
        public Builder note(@Nullable Output<String> note) {
            $.note = note;
            return this;
        }

        /**
         * @param note Additional alert action note.
         * 
         * @return builder
         * 
         */
        public Builder note(String note) {
            return note(Output.of(note));
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

        /**
         * @param user Owner of the execution for integration action.
         * 
         * @return builder
         * 
         */
        public Builder user(@Nullable Output<String> user) {
            $.user = user;
            return this;
        }

        /**
         * @param user Owner of the execution for integration action.
         * 
         * @return builder
         * 
         */
        public Builder user(String user) {
            return user(Output.of(user));
        }

        public IntegrationActionAcknowledgeArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("IntegrationActionAcknowledgeArgs", "name");
            }
            return $;
        }
    }

}
