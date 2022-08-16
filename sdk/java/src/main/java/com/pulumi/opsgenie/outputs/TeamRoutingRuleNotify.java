// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TeamRoutingRuleNotify {
    /**
     * @return The ID of the Opsgenie Team Routing Rule.
     * 
     */
    private final @Nullable String id;
    /**
     * @return Name of the team routing rule
     * 
     */
    private final @Nullable String name;
    private final String type;

    @CustomType.Constructor
    private TeamRoutingRuleNotify(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    /**
     * @return The ID of the Opsgenie Team Routing Rule.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return Name of the team routing rule
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TeamRoutingRuleNotify defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TeamRoutingRuleNotify defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public TeamRoutingRuleNotify build() {
            return new TeamRoutingRuleNotify(id, name, type);
        }
    }
}
