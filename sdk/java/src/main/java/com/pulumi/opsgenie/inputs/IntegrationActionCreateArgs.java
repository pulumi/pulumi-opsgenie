// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.IntegrationActionCreateFilterArgs;
import com.pulumi.opsgenie.inputs.IntegrationActionCreateResponderArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IntegrationActionCreateArgs extends com.pulumi.resources.ResourceArgs {

    public static final IntegrationActionCreateArgs Empty = new IntegrationActionCreateArgs();

    @Import(name="alertActions")
    private @Nullable Output<List<String>> alertActions;

    public Optional<Output<List<String>>> alertActions() {
        return Optional.ofNullable(this.alertActions);
    }

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

    @Import(name="appendAttachments")
    private @Nullable Output<Boolean> appendAttachments;

    public Optional<Output<Boolean>> appendAttachments() {
        return Optional.ofNullable(this.appendAttachments);
    }

    @Import(name="customPriority")
    private @Nullable Output<String> customPriority;

    public Optional<Output<String>> customPriority() {
        return Optional.ofNullable(this.customPriority);
    }

    @Import(name="description")
    private @Nullable Output<String> description;

    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    @Import(name="entity")
    private @Nullable Output<String> entity;

    public Optional<Output<String>> entity() {
        return Optional.ofNullable(this.entity);
    }

    @Import(name="extraProperties")
    private @Nullable Output<Map<String,String>> extraProperties;

    public Optional<Output<Map<String,String>>> extraProperties() {
        return Optional.ofNullable(this.extraProperties);
    }

    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<IntegrationActionCreateFilterArgs>> filters;

    /**
     * @return Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    public Optional<Output<List<IntegrationActionCreateFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="ignoreAlertActionsFromPayload")
    private @Nullable Output<Boolean> ignoreAlertActionsFromPayload;

    public Optional<Output<Boolean>> ignoreAlertActionsFromPayload() {
        return Optional.ofNullable(this.ignoreAlertActionsFromPayload);
    }

    @Import(name="ignoreExtraPropertiesFromPayload")
    private @Nullable Output<Boolean> ignoreExtraPropertiesFromPayload;

    public Optional<Output<Boolean>> ignoreExtraPropertiesFromPayload() {
        return Optional.ofNullable(this.ignoreExtraPropertiesFromPayload);
    }

    @Import(name="ignoreRespondersFromPayload")
    private @Nullable Output<Boolean> ignoreRespondersFromPayload;

    public Optional<Output<Boolean>> ignoreRespondersFromPayload() {
        return Optional.ofNullable(this.ignoreRespondersFromPayload);
    }

    @Import(name="ignoreTagsFromPayload")
    private @Nullable Output<Boolean> ignoreTagsFromPayload;

    public Optional<Output<Boolean>> ignoreTagsFromPayload() {
        return Optional.ofNullable(this.ignoreTagsFromPayload);
    }

    @Import(name="ignoreTeamsFromPayload")
    private @Nullable Output<Boolean> ignoreTeamsFromPayload;

    public Optional<Output<Boolean>> ignoreTeamsFromPayload() {
        return Optional.ofNullable(this.ignoreTeamsFromPayload);
    }

    @Import(name="message")
    private @Nullable Output<String> message;

    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
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

    @Import(name="priority")
    private @Nullable Output<String> priority;

    public Optional<Output<String>> priority() {
        return Optional.ofNullable(this.priority);
    }

    @Import(name="responders")
    private @Nullable Output<List<IntegrationActionCreateResponderArgs>> responders;

    public Optional<Output<List<IntegrationActionCreateResponderArgs>>> responders() {
        return Optional.ofNullable(this.responders);
    }

    @Import(name="source")
    private @Nullable Output<String> source;

    public Optional<Output<String>> source() {
        return Optional.ofNullable(this.source);
    }

    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
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

    private IntegrationActionCreateArgs() {}

    private IntegrationActionCreateArgs(IntegrationActionCreateArgs $) {
        this.alertActions = $.alertActions;
        this.alias = $.alias;
        this.appendAttachments = $.appendAttachments;
        this.customPriority = $.customPriority;
        this.description = $.description;
        this.entity = $.entity;
        this.extraProperties = $.extraProperties;
        this.filters = $.filters;
        this.ignoreAlertActionsFromPayload = $.ignoreAlertActionsFromPayload;
        this.ignoreExtraPropertiesFromPayload = $.ignoreExtraPropertiesFromPayload;
        this.ignoreRespondersFromPayload = $.ignoreRespondersFromPayload;
        this.ignoreTagsFromPayload = $.ignoreTagsFromPayload;
        this.ignoreTeamsFromPayload = $.ignoreTeamsFromPayload;
        this.message = $.message;
        this.name = $.name;
        this.note = $.note;
        this.order = $.order;
        this.priority = $.priority;
        this.responders = $.responders;
        this.source = $.source;
        this.tags = $.tags;
        this.type = $.type;
        this.user = $.user;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IntegrationActionCreateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IntegrationActionCreateArgs $;

        public Builder() {
            $ = new IntegrationActionCreateArgs();
        }

        public Builder(IntegrationActionCreateArgs defaults) {
            $ = new IntegrationActionCreateArgs(Objects.requireNonNull(defaults));
        }

        public Builder alertActions(@Nullable Output<List<String>> alertActions) {
            $.alertActions = alertActions;
            return this;
        }

        public Builder alertActions(List<String> alertActions) {
            return alertActions(Output.of(alertActions));
        }

        public Builder alertActions(String... alertActions) {
            return alertActions(List.of(alertActions));
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

        public Builder appendAttachments(@Nullable Output<Boolean> appendAttachments) {
            $.appendAttachments = appendAttachments;
            return this;
        }

        public Builder appendAttachments(Boolean appendAttachments) {
            return appendAttachments(Output.of(appendAttachments));
        }

        public Builder customPriority(@Nullable Output<String> customPriority) {
            $.customPriority = customPriority;
            return this;
        }

        public Builder customPriority(String customPriority) {
            return customPriority(Output.of(customPriority));
        }

        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        public Builder description(String description) {
            return description(Output.of(description));
        }

        public Builder entity(@Nullable Output<String> entity) {
            $.entity = entity;
            return this;
        }

        public Builder entity(String entity) {
            return entity(Output.of(entity));
        }

        public Builder extraProperties(@Nullable Output<Map<String,String>> extraProperties) {
            $.extraProperties = extraProperties;
            return this;
        }

        public Builder extraProperties(Map<String,String> extraProperties) {
            return extraProperties(Output.of(extraProperties));
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
        public Builder filters(@Nullable Output<List<IntegrationActionCreateFilterArgs>> filters) {
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
        public Builder filters(List<IntegrationActionCreateFilterArgs> filters) {
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
        public Builder filters(IntegrationActionCreateFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public Builder ignoreAlertActionsFromPayload(@Nullable Output<Boolean> ignoreAlertActionsFromPayload) {
            $.ignoreAlertActionsFromPayload = ignoreAlertActionsFromPayload;
            return this;
        }

        public Builder ignoreAlertActionsFromPayload(Boolean ignoreAlertActionsFromPayload) {
            return ignoreAlertActionsFromPayload(Output.of(ignoreAlertActionsFromPayload));
        }

        public Builder ignoreExtraPropertiesFromPayload(@Nullable Output<Boolean> ignoreExtraPropertiesFromPayload) {
            $.ignoreExtraPropertiesFromPayload = ignoreExtraPropertiesFromPayload;
            return this;
        }

        public Builder ignoreExtraPropertiesFromPayload(Boolean ignoreExtraPropertiesFromPayload) {
            return ignoreExtraPropertiesFromPayload(Output.of(ignoreExtraPropertiesFromPayload));
        }

        public Builder ignoreRespondersFromPayload(@Nullable Output<Boolean> ignoreRespondersFromPayload) {
            $.ignoreRespondersFromPayload = ignoreRespondersFromPayload;
            return this;
        }

        public Builder ignoreRespondersFromPayload(Boolean ignoreRespondersFromPayload) {
            return ignoreRespondersFromPayload(Output.of(ignoreRespondersFromPayload));
        }

        public Builder ignoreTagsFromPayload(@Nullable Output<Boolean> ignoreTagsFromPayload) {
            $.ignoreTagsFromPayload = ignoreTagsFromPayload;
            return this;
        }

        public Builder ignoreTagsFromPayload(Boolean ignoreTagsFromPayload) {
            return ignoreTagsFromPayload(Output.of(ignoreTagsFromPayload));
        }

        public Builder ignoreTeamsFromPayload(@Nullable Output<Boolean> ignoreTeamsFromPayload) {
            $.ignoreTeamsFromPayload = ignoreTeamsFromPayload;
            return this;
        }

        public Builder ignoreTeamsFromPayload(Boolean ignoreTeamsFromPayload) {
            return ignoreTeamsFromPayload(Output.of(ignoreTeamsFromPayload));
        }

        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        public Builder message(String message) {
            return message(Output.of(message));
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

        public Builder priority(@Nullable Output<String> priority) {
            $.priority = priority;
            return this;
        }

        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        public Builder responders(@Nullable Output<List<IntegrationActionCreateResponderArgs>> responders) {
            $.responders = responders;
            return this;
        }

        public Builder responders(List<IntegrationActionCreateResponderArgs> responders) {
            return responders(Output.of(responders));
        }

        public Builder responders(IntegrationActionCreateResponderArgs... responders) {
            return responders(List.of(responders));
        }

        public Builder source(@Nullable Output<String> source) {
            $.source = source;
            return this;
        }

        public Builder source(String source) {
            return source(Output.of(source));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
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

        public IntegrationActionCreateArgs build() {
            if ($.name == null) {
                throw new MissingRequiredPropertyException("IntegrationActionCreateArgs", "name");
            }
            return $;
        }
    }

}
