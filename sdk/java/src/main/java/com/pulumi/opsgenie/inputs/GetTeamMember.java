// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTeamMember extends com.pulumi.resources.InvokeArgs {

    public static final GetTeamMember Empty = new GetTeamMember();

    /**
     * The ID of the Opsgenie Team.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the Opsgenie Team.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    @Import(name="role")
    private @Nullable String role;

    public Optional<String> role() {
        return Optional.ofNullable(this.role);
    }

    @Import(name="username")
    private @Nullable String username;

    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    private GetTeamMember() {}

    private GetTeamMember(GetTeamMember $) {
        this.id = $.id;
        this.role = $.role;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTeamMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTeamMember $;

        public Builder() {
            $ = new GetTeamMember();
        }

        public Builder(GetTeamMember defaults) {
            $ = new GetTeamMember(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The ID of the Opsgenie Team.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder role(@Nullable String role) {
            $.role = role;
            return this;
        }

        public Builder username(@Nullable String username) {
            $.username = username;
            return this;
        }

        public GetTeamMember build() {
            return $;
        }
    }

}
