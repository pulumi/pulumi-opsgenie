// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.TeamRoutingRuleTimeRestrictionRestrictionArgs;
import com.pulumi.opsgenie.inputs.TeamRoutingRuleTimeRestrictionRestrictionListArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamRoutingRuleTimeRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamRoutingRuleTimeRestrictionArgs Empty = new TeamRoutingRuleTimeRestrictionArgs();

    @Import(name="restriction")
    private @Nullable Output<List<TeamRoutingRuleTimeRestrictionRestrictionArgs>> restriction;

    public Optional<Output<List<TeamRoutingRuleTimeRestrictionRestrictionArgs>>> restriction() {
        return Optional.ofNullable(this.restriction);
    }

    @Import(name="restrictionList")
    private @Nullable Output<List<TeamRoutingRuleTimeRestrictionRestrictionListArgs>> restrictionList;

    public Optional<Output<List<TeamRoutingRuleTimeRestrictionRestrictionListArgs>>> restrictionList() {
        return Optional.ofNullable(this.restrictionList);
    }

    /**
     * Type of the operation will be applied on conditions. Should be one of `match-all`, `match-any-condition` or `match-all-conditions`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the operation will be applied on conditions. Should be one of `match-all`, `match-any-condition` or `match-all-conditions`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private TeamRoutingRuleTimeRestrictionArgs() {}

    private TeamRoutingRuleTimeRestrictionArgs(TeamRoutingRuleTimeRestrictionArgs $) {
        this.restriction = $.restriction;
        this.restrictionList = $.restrictionList;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamRoutingRuleTimeRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamRoutingRuleTimeRestrictionArgs $;

        public Builder() {
            $ = new TeamRoutingRuleTimeRestrictionArgs();
        }

        public Builder(TeamRoutingRuleTimeRestrictionArgs defaults) {
            $ = new TeamRoutingRuleTimeRestrictionArgs(Objects.requireNonNull(defaults));
        }

        public Builder restriction(@Nullable Output<List<TeamRoutingRuleTimeRestrictionRestrictionArgs>> restriction) {
            $.restriction = restriction;
            return this;
        }

        public Builder restriction(List<TeamRoutingRuleTimeRestrictionRestrictionArgs> restriction) {
            return restriction(Output.of(restriction));
        }

        public Builder restriction(TeamRoutingRuleTimeRestrictionRestrictionArgs... restriction) {
            return restriction(List.of(restriction));
        }

        public Builder restrictionList(@Nullable Output<List<TeamRoutingRuleTimeRestrictionRestrictionListArgs>> restrictionList) {
            $.restrictionList = restrictionList;
            return this;
        }

        public Builder restrictionList(List<TeamRoutingRuleTimeRestrictionRestrictionListArgs> restrictionList) {
            return restrictionList(Output.of(restrictionList));
        }

        public Builder restrictionList(TeamRoutingRuleTimeRestrictionRestrictionListArgs... restrictionList) {
            return restrictionList(List.of(restrictionList));
        }

        /**
         * @param type Type of the operation will be applied on conditions. Should be one of `match-all`, `match-any-condition` or `match-all-conditions`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the operation will be applied on conditions. Should be one of `match-all`, `match-any-condition` or `match-all-conditions`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public TeamRoutingRuleTimeRestrictionArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("TeamRoutingRuleTimeRestrictionArgs", "type");
            }
            return $;
        }
    }

}
