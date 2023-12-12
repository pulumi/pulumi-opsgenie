// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.IntegrationActionCloseFilter;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationActionClose {
    /**
     * @return An identifier that is used for alert deduplication. Default: `{{alias}}`.
     * 
     */
    private @Nullable String alias;
    /**
     * @return Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    private @Nullable List<IntegrationActionCloseFilter> filters;
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
     * @return The responder type - can be `escalation`, `team` or `user`.
     * 
     */
    private @Nullable String type;
    /**
     * @return Owner of the execution for integration action.
     * 
     */
    private @Nullable String user;

    private IntegrationActionClose() {}
    /**
     * @return An identifier that is used for alert deduplication. Default: `{{alias}}`.
     * 
     */
    public Optional<String> alias() {
        return Optional.ofNullable(this.alias);
    }
    /**
     * @return Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    public List<IntegrationActionCloseFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
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

    public static Builder builder(IntegrationActionClose defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String alias;
        private @Nullable List<IntegrationActionCloseFilter> filters;
        private String name;
        private @Nullable String note;
        private @Nullable Integer order;
        private @Nullable String type;
        private @Nullable String user;
        public Builder() {}
        public Builder(IntegrationActionClose defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alias = defaults.alias;
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
    	      this.note = defaults.note;
    	      this.order = defaults.order;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        @CustomType.Setter
        public Builder alias(@Nullable String alias) {
            this.alias = alias;
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<IntegrationActionCloseFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(IntegrationActionCloseFilter... filters) {
            return filters(List.of(filters));
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
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        @CustomType.Setter
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }
        public IntegrationActionClose build() {
            final var _resultValue = new IntegrationActionClose();
            _resultValue.alias = alias;
            _resultValue.filters = filters;
            _resultValue.name = name;
            _resultValue.note = note;
            _resultValue.order = order;
            _resultValue.type = type;
            _resultValue.user = user;
            return _resultValue;
        }
    }
}
