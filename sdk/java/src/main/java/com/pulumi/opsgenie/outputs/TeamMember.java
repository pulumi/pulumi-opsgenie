// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamMember {
    /**
     * @return The UUID for the member to add to this Team.
     * 
     */
    private final String id;
    /**
     * @return The role for the user within the Team - can be either `admin` or `user`. Default: `user`.
     * 
     */
    private final @Nullable String role;

    @CustomType.Constructor
    private TeamMember(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("role") @Nullable String role) {
        this.id = id;
        this.role = role;
    }

    /**
     * @return The UUID for the member to add to this Team.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The role for the user within the Team - can be either `admin` or `user`. Default: `user`.
     * 
     */
    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String role;

        public Builder() {
    	      // Empty
        }

        public Builder(TeamMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.role = defaults.role;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }        public TeamMember build() {
            return new TeamMember(id, role);
        }
    }
}
