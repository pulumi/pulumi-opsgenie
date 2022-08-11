// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.GetTeamMember;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTeamResult {
    private final @Nullable String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable List<GetTeamMember> members;
    private final String name;

    @CustomType.Constructor
    private GetTeamResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("members") @Nullable List<GetTeamMember> members,
        @CustomType.Parameter("name") String name) {
        this.description = description;
        this.id = id;
        this.members = members;
        this.name = name;
    }

    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetTeamMember> members() {
        return this.members == null ? List.of() : this.members;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTeamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String id;
        private @Nullable List<GetTeamMember> members;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTeamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.members = defaults.members;
    	      this.name = defaults.name;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder members(@Nullable List<GetTeamMember> members) {
            this.members = members;
            return this;
        }
        public Builder members(GetTeamMember... members) {
            return members(List.of(members));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetTeamResult build() {
            return new GetTeamResult(description, id, members, name);
        }
    }
}
