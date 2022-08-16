// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.opsgenie.inputs.TeamMemberArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamState extends com.pulumi.resources.ResourceArgs {

    public static final TeamState Empty = new TeamState();

    /**
     * Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
     * 
     */
    @Import(name="deleteDefaultResources")
    private @Nullable Output<Boolean> deleteDefaultResources;

    /**
     * @return Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
     * 
     */
    public Optional<Output<Boolean>> deleteDefaultResources() {
        return Optional.ofNullable(this.deleteDefaultResources);
    }

    /**
     * A description for this team.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description for this team.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
     * 
     */
    @Import(name="ignoreMembers")
    private @Nullable Output<Boolean> ignoreMembers;

    /**
     * @return Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
     * 
     */
    public Optional<Output<Boolean>> ignoreMembers() {
        return Optional.ofNullable(this.ignoreMembers);
    }

    /**
     * A Member block as documented below.
     * 
     */
    @Import(name="members")
    private @Nullable Output<List<TeamMemberArgs>> members;

    /**
     * @return A Member block as documented below.
     * 
     */
    public Optional<Output<List<TeamMemberArgs>>> members() {
        return Optional.ofNullable(this.members);
    }

    /**
     * The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private TeamState() {}

    private TeamState(TeamState $) {
        this.deleteDefaultResources = $.deleteDefaultResources;
        this.description = $.description;
        this.ignoreMembers = $.ignoreMembers;
        this.members = $.members;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamState $;

        public Builder() {
            $ = new TeamState();
        }

        public Builder(TeamState defaults) {
            $ = new TeamState(Objects.requireNonNull(defaults));
        }

        /**
         * @param deleteDefaultResources Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
         * 
         * @return builder
         * 
         */
        public Builder deleteDefaultResources(@Nullable Output<Boolean> deleteDefaultResources) {
            $.deleteDefaultResources = deleteDefaultResources;
            return this;
        }

        /**
         * @param deleteDefaultResources Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
         * 
         * @return builder
         * 
         */
        public Builder deleteDefaultResources(Boolean deleteDefaultResources) {
            return deleteDefaultResources(Output.of(deleteDefaultResources));
        }

        /**
         * @param description A description for this team.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description for this team.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ignoreMembers Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMembers(@Nullable Output<Boolean> ignoreMembers) {
            $.ignoreMembers = ignoreMembers;
            return this;
        }

        /**
         * @param ignoreMembers Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
         * 
         * @return builder
         * 
         */
        public Builder ignoreMembers(Boolean ignoreMembers) {
            return ignoreMembers(Output.of(ignoreMembers));
        }

        /**
         * @param members A Member block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder members(@Nullable Output<List<TeamMemberArgs>> members) {
            $.members = members;
            return this;
        }

        /**
         * @param members A Member block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder members(List<TeamMemberArgs> members) {
            return members(Output.of(members));
        }

        /**
         * @param members A Member block as documented below.
         * 
         * @return builder
         * 
         */
        public Builder members(TeamMemberArgs... members) {
            return members(List.of(members));
        }

        /**
         * @param name The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public TeamState build() {
            return $;
        }
    }

}
