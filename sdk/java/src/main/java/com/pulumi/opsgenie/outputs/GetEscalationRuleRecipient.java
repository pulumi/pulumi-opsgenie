// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEscalationRuleRecipient {
    /**
     * @return The ID of the Opsgenie Escalation.
     * 
     */
    private final @Nullable String id;
    private final @Nullable String type;

    @CustomType.Constructor
    private GetEscalationRuleRecipient(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("type") @Nullable String type) {
        this.id = id;
        this.type = type;
    }

    /**
     * @return The ID of the Opsgenie Escalation.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEscalationRuleRecipient defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEscalationRuleRecipient defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public GetEscalationRuleRecipient build() {
            return new GetEscalationRuleRecipient(id, type);
        }
    }
}
