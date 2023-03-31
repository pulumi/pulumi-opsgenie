// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTeamMember {
    /**
     * @return The ID of the Opsgenie Team.
     * 
     */
    private @Nullable String id;
    private @Nullable String role;

    private GetTeamMember() {}
    /**
     * @return The ID of the Opsgenie Team.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTeamMember defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String id;
        private @Nullable String role;
        public Builder() {}
        public Builder(GetTeamMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.role = defaults.role;
        }

        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }
        public GetTeamMember build() {
            final var o = new GetTeamMember();
            o.id = id;
            o.role = role;
            return o;
        }
    }
}