// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.IntegrationActionIgnoreFilter;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IntegrationActionIgnore {
    /**
     * @return Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    private @Nullable List<IntegrationActionIgnoreFilter> filters;
    /**
     * @return Name of the integration action.
     * 
     */
    private String name;
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

    private IntegrationActionIgnore() {}
    /**
     * @return Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
     * 
     */
    public List<IntegrationActionIgnoreFilter> filters() {
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationActionIgnore defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<IntegrationActionIgnoreFilter> filters;
        private String name;
        private @Nullable Integer order;
        private @Nullable String type;
        public Builder() {}
        public Builder(IntegrationActionIgnore defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.name = defaults.name;
    	      this.order = defaults.order;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder filters(@Nullable List<IntegrationActionIgnoreFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(IntegrationActionIgnoreFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
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
        public IntegrationActionIgnore build() {
            final var _resultValue = new IntegrationActionIgnore();
            _resultValue.filters = filters;
            _resultValue.name = name;
            _resultValue.order = order;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
