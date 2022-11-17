// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IntegrationActionCreateResponder {
    /**
     * @return The id of the responder.
     * 
     */
    private String id;
    /**
     * @return The responder type - can be `escalation`, `team` or `user`.
     * 
     */
    private String type;

    private IntegrationActionCreateResponder() {}
    /**
     * @return The id of the responder.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The responder type - can be `escalation`, `team` or `user`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationActionCreateResponder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String type;
        public Builder() {}
        public Builder(IntegrationActionCreateResponder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public IntegrationActionCreateResponder build() {
            final var o = new IntegrationActionCreateResponder();
            o.id = id;
            o.type = type;
            return o;
        }
    }
}
