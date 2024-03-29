// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamMemberArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamMemberArgs Empty = new TeamMemberArgs();

    /**
     * The UUID for the member to add to this Team.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The UUID for the member to add to this Team.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * The role for the user within the Team - can be either `admin` or `user`. Default: `user`.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The role for the user within the Team - can be either `admin` or `user`. Default: `user`.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private TeamMemberArgs() {}

    private TeamMemberArgs(TeamMemberArgs $) {
        this.id = $.id;
        this.role = $.role;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamMemberArgs $;

        public Builder() {
            $ = new TeamMemberArgs();
        }

        public Builder(TeamMemberArgs defaults) {
            $ = new TeamMemberArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id The UUID for the member to add to this Team.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The UUID for the member to add to this Team.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param role The role for the user within the Team - can be either `admin` or `user`. Default: `user`.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role for the user within the Team - can be either `admin` or `user`. Default: `user`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public TeamMemberArgs build() {
            if ($.id == null) {
                throw new MissingRequiredPropertyException("TeamMemberArgs", "id");
            }
            return $;
        }
    }

}
