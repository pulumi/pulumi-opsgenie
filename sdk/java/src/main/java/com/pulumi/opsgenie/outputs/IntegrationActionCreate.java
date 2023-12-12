// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.IntegrationActionCreateFilter;
import com.pulumi.opsgenie.outputs.IntegrationActionCreateResponder;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationActionCreate {
    private @Nullable List<String> alertActions;
    /**
     * @return An identifier that is used for alert deduplication. Default: `{{alias}}`.
     * 
     */
    private @Nullable String alias;
    private @Nullable Boolean appendAttachments;
    /**
     * @return Custom alert priority. e.g. ``{{message.substring(0,2)}}``
     * 
     */
    private @Nullable String customPriority;
    /**
     * @return Detailed description of the alert, anything that may not have fit in the `message` field.
     * 
     */
    private @Nullable String description;
    /**
     * @return The entity the alert is related to.
     * 
     */
    private @Nullable String entity;
    /**
     * @return Set of user defined properties specified as a map.
     * 
     */
    private @Nullable Map<String,String> extraProperties;
    /**
     * @return Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    private @Nullable List<IntegrationActionCreateFilter> filters;
    private @Nullable Boolean ignoreAlertActionsFromPayload;
    private @Nullable Boolean ignoreExtraPropertiesFromPayload;
    /**
     * @return If enabled, the integration will ignore responders sent in request payloads.
     * 
     */
    private @Nullable Boolean ignoreRespondersFromPayload;
    private @Nullable Boolean ignoreTagsFromPayload;
    /**
     * @return If enabled, the integration will ignore teams sent in request payloads.
     * 
     */
    private @Nullable Boolean ignoreTeamsFromPayload;
    /**
     * @return Alert text limited to 130 characters.
     * 
     */
    private @Nullable String message;
    /**
     * @return Name of the integration action.
     * 
     */
    private String name;
    /**
     * @return Additional alert action note.
     * 
     */
    private @Nullable String note;
    /**
     * @return Integer value that defines in which order the action will be performed. Default: `1`.
     * 
     */
    private @Nullable Integer order;
    /**
     * @return Alert priority.
     * 
     */
    private @Nullable String priority;
    /**
     * @return User, schedule, teams or escalation names to calculate which users will receive notifications of the alert.
     * 
     */
    private @Nullable List<IntegrationActionCreateResponder> responders;
    /**
     * @return User defined field to specify source of action.
     * 
     */
    private @Nullable String source;
    /**
     * @return Comma separated list of labels to be attached to the alert.
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return The responder type - can be `escalation`, `team` or `user`.
     * 
     */
    private @Nullable String type;
    /**
     * @return Owner of the execution for integration action.
     * 
     */
    private @Nullable String user;

    private IntegrationActionCreate() {}
    public List<String> alertActions() {
        return this.alertActions == null ? List.of() : this.alertActions;
    }
    /**
     * @return An identifier that is used for alert deduplication. Default: `{{alias}}`.
     * 
     */
    public Optional<String> alias() {
        return Optional.ofNullable(this.alias);
    }
    public Optional<Boolean> appendAttachments() {
        return Optional.ofNullable(this.appendAttachments);
    }
    /**
     * @return Custom alert priority. e.g. ``{{message.substring(0,2)}}``
     * 
     */
    public Optional<String> customPriority() {
        return Optional.ofNullable(this.customPriority);
    }
    /**
     * @return Detailed description of the alert, anything that may not have fit in the `message` field.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The entity the alert is related to.
     * 
     */
    public Optional<String> entity() {
        return Optional.ofNullable(this.entity);
    }
    /**
     * @return Set of user defined properties specified as a map.
     * 
     */
    public Map<String,String> extraProperties() {
        return this.extraProperties == null ? Map.of() : this.extraProperties;
    }
    /**
     * @return Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    public List<IntegrationActionCreateFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public Optional<Boolean> ignoreAlertActionsFromPayload() {
        return Optional.ofNullable(this.ignoreAlertActionsFromPayload);
    }
    public Optional<Boolean> ignoreExtraPropertiesFromPayload() {
        return Optional.ofNullable(this.ignoreExtraPropertiesFromPayload);
    }
    /**
     * @return If enabled, the integration will ignore responders sent in request payloads.
     * 
     */
    public Optional<Boolean> ignoreRespondersFromPayload() {
        return Optional.ofNullable(this.ignoreRespondersFromPayload);
    }
    public Optional<Boolean> ignoreTagsFromPayload() {
        return Optional.ofNullable(this.ignoreTagsFromPayload);
    }
    /**
     * @return If enabled, the integration will ignore teams sent in request payloads.
     * 
     */
    public Optional<Boolean> ignoreTeamsFromPayload() {
        return Optional.ofNullable(this.ignoreTeamsFromPayload);
    }
    /**
     * @return Alert text limited to 130 characters.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return Name of the integration action.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Additional alert action note.
     * 
     */
    public Optional<String> note() {
        return Optional.ofNullable(this.note);
    }
    /**
     * @return Integer value that defines in which order the action will be performed. Default: `1`.
     * 
     */
    public Optional<Integer> order() {
        return Optional.ofNullable(this.order);
    }
    /**
     * @return Alert priority.
     * 
     */
    public Optional<String> priority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * @return User, schedule, teams or escalation names to calculate which users will receive notifications of the alert.
     * 
     */
    public List<IntegrationActionCreateResponder> responders() {
        return this.responders == null ? List.of() : this.responders;
    }
    /**
     * @return User defined field to specify source of action.
     * 
     */
    public Optional<String> source() {
        return Optional.ofNullable(this.source);
    }
    /**
     * @return Comma separated list of labels to be attached to the alert.
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return The responder type - can be `escalation`, `team` or `user`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return Owner of the execution for integration action.
     * 
     */
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationActionCreate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> alertActions;
        private @Nullable String alias;
        private @Nullable Boolean appendAttachments;
        private @Nullable String customPriority;
        private @Nullable String description;
        private @Nullable String entity;
        private @Nullable Map<String,String> extraProperties;
        private @Nullable List<IntegrationActionCreateFilter> filters;
        private @Nullable Boolean ignoreAlertActionsFromPayload;
        private @Nullable Boolean ignoreExtraPropertiesFromPayload;
        private @Nullable Boolean ignoreRespondersFromPayload;
        private @Nullable Boolean ignoreTagsFromPayload;
        private @Nullable Boolean ignoreTeamsFromPayload;
        private @Nullable String message;
        private String name;
        private @Nullable String note;
        private @Nullable Integer order;
        private @Nullable String priority;
        private @Nullable List<IntegrationActionCreateResponder> responders;
        private @Nullable String source;
        private @Nullable List<String> tags;
        private @Nullable String type;
        private @Nullable String user;
        public Builder() {}
        public Builder(IntegrationActionCreate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alertActions = defaults.alertActions;
    	      this.alias = defaults.alias;
    	      this.appendAttachments = defaults.appendAttachments;
    	      this.customPriority = defaults.customPriority;
    	      this.description = defaults.description;
    	      this.entity = defaults.entity;
    	      this.extraProperties = defaults.extraProperties;
    	      this.filters = defaults.filters;
    	      this.ignoreAlertActionsFromPayload = defaults.ignoreAlertActionsFromPayload;
    	      this.ignoreExtraPropertiesFromPayload = defaults.ignoreExtraPropertiesFromPayload;
    	      this.ignoreRespondersFromPayload = defaults.ignoreRespondersFromPayload;
    	      this.ignoreTagsFromPayload = defaults.ignoreTagsFromPayload;
    	      this.ignoreTeamsFromPayload = defaults.ignoreTeamsFromPayload;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.note = defaults.note;
    	      this.order = defaults.order;
    	      this.priority = defaults.priority;
    	      this.responders = defaults.responders;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder alertActions(@Nullable List<String> alertActions) {
            this.alertActions = alertActions;
            return this;
        }
        public Builder alertActions(String... alertActions) {
            return alertActions(List.of(alertActions));
        }
        @CustomType.Setter
        public Builder alias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }
        @CustomType.Setter
        public Builder appendAttachments(@Nullable Boolean appendAttachments) {
            this.appendAttachments = appendAttachments;
            return this;
        }
        @CustomType.Setter
        public Builder customPriority(@Nullable String customPriority) {
            this.customPriority = customPriority;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder entity(@Nullable String entity) {
            this.entity = entity;
            return this;
        }
        @CustomType.Setter
        public Builder extraProperties(@Nullable Map<String,String> extraProperties) {
            this.extraProperties = extraProperties;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<IntegrationActionCreateFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(IntegrationActionCreateFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder ignoreAlertActionsFromPayload(@Nullable Boolean ignoreAlertActionsFromPayload) {
            this.ignoreAlertActionsFromPayload = ignoreAlertActionsFromPayload;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreExtraPropertiesFromPayload(@Nullable Boolean ignoreExtraPropertiesFromPayload) {
            this.ignoreExtraPropertiesFromPayload = ignoreExtraPropertiesFromPayload;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreRespondersFromPayload(@Nullable Boolean ignoreRespondersFromPayload) {
            this.ignoreRespondersFromPayload = ignoreRespondersFromPayload;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreTagsFromPayload(@Nullable Boolean ignoreTagsFromPayload) {
            this.ignoreTagsFromPayload = ignoreTagsFromPayload;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreTeamsFromPayload(@Nullable Boolean ignoreTeamsFromPayload) {
            this.ignoreTeamsFromPayload = ignoreTeamsFromPayload;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder note(@Nullable String note) {
            this.note = note;
            return this;
        }
        @CustomType.Setter
        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }
        @CustomType.Setter
        public Builder priority(@Nullable String priority) {
            this.priority = priority;
            return this;
        }
        @CustomType.Setter
        public Builder responders(@Nullable List<IntegrationActionCreateResponder> responders) {
            this.responders = responders;
            return this;
        }
        public Builder responders(IntegrationActionCreateResponder... responders) {
            return responders(List.of(responders));
        }
        @CustomType.Setter
        public Builder source(@Nullable String source) {
            this.source = source;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }
        public IntegrationActionCreate build() {
            final var _resultValue = new IntegrationActionCreate();
            _resultValue.alertActions = alertActions;
            _resultValue.alias = alias;
            _resultValue.appendAttachments = appendAttachments;
            _resultValue.customPriority = customPriority;
            _resultValue.description = description;
            _resultValue.entity = entity;
            _resultValue.extraProperties = extraProperties;
            _resultValue.filters = filters;
            _resultValue.ignoreAlertActionsFromPayload = ignoreAlertActionsFromPayload;
            _resultValue.ignoreExtraPropertiesFromPayload = ignoreExtraPropertiesFromPayload;
            _resultValue.ignoreRespondersFromPayload = ignoreRespondersFromPayload;
            _resultValue.ignoreTagsFromPayload = ignoreTagsFromPayload;
            _resultValue.ignoreTeamsFromPayload = ignoreTeamsFromPayload;
            _resultValue.message = message;
            _resultValue.name = name;
            _resultValue.note = note;
            _resultValue.order = order;
            _resultValue.priority = priority;
            _resultValue.responders = responders;
            _resultValue.source = source;
            _resultValue.tags = tags;
            _resultValue.type = type;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
