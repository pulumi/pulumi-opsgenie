// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.opsgenie.inputs.TeamRoutingRuleCriteriaArgs;
import com.pulumi.opsgenie.inputs.TeamRoutingRuleNotifyArgs;
import com.pulumi.opsgenie.inputs.TeamRoutingRuleTimeRestrictionArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TeamRoutingRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TeamRoutingRuleArgs Empty = new TeamRoutingRuleArgs();

    /**
     * You can refer Criteria for detailed information about criteria and its fields
     * 
     */
    @Import(name="criterias")
    private @Nullable Output<List<TeamRoutingRuleCriteriaArgs>> criterias;

    /**
     * @return You can refer Criteria for detailed information about criteria and its fields
     * 
     */
    public Optional<Output<List<TeamRoutingRuleCriteriaArgs>>> criterias() {
        return Optional.ofNullable(this.criterias);
    }

    /**
     * Only use when importing default routing rule
     * 
     */
    @Import(name="isDefault")
    private @Nullable Output<Boolean> isDefault;

    /**
     * @return Only use when importing default routing rule
     * 
     */
    public Optional<Output<Boolean>> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }

    /**
     * Name of the team routing rule
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the team routing rule
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
     * 
     */
    @Import(name="notifies", required=true)
    private Output<List<TeamRoutingRuleNotifyArgs>> notifies;

    /**
     * @return Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
     * 
     */
    public Output<List<TeamRoutingRuleNotifyArgs>> notifies() {
        return this.notifies;
    }

    /**
     * The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
     * 
     */
    @Import(name="order")
    private @Nullable Output<Integer> order;

    /**
     * @return The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
     * 
     */
    public Optional<Output<Integer>> order() {
        return Optional.ofNullable(this.order);
    }

    /**
     * Id of the team owning the routing rule
     * 
     */
    @Import(name="teamId", required=true)
    private Output<String> teamId;

    /**
     * @return Id of the team owning the routing rule
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }

    @Import(name="timeRestrictions")
    private @Nullable Output<List<TeamRoutingRuleTimeRestrictionArgs>> timeRestrictions;

    public Optional<Output<List<TeamRoutingRuleTimeRestrictionArgs>>> timeRestrictions() {
        return Optional.ofNullable(this.timeRestrictions);
    }

    /**
     * Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
     * 
     */
    @Import(name="timezone")
    private @Nullable Output<String> timezone;

    /**
     * @return Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
     * 
     */
    public Optional<Output<String>> timezone() {
        return Optional.ofNullable(this.timezone);
    }

    private TeamRoutingRuleArgs() {}

    private TeamRoutingRuleArgs(TeamRoutingRuleArgs $) {
        this.criterias = $.criterias;
        this.isDefault = $.isDefault;
        this.name = $.name;
        this.notifies = $.notifies;
        this.order = $.order;
        this.teamId = $.teamId;
        this.timeRestrictions = $.timeRestrictions;
        this.timezone = $.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TeamRoutingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TeamRoutingRuleArgs $;

        public Builder() {
            $ = new TeamRoutingRuleArgs();
        }

        public Builder(TeamRoutingRuleArgs defaults) {
            $ = new TeamRoutingRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param criterias You can refer Criteria for detailed information about criteria and its fields
         * 
         * @return builder
         * 
         */
        public Builder criterias(@Nullable Output<List<TeamRoutingRuleCriteriaArgs>> criterias) {
            $.criterias = criterias;
            return this;
        }

        /**
         * @param criterias You can refer Criteria for detailed information about criteria and its fields
         * 
         * @return builder
         * 
         */
        public Builder criterias(List<TeamRoutingRuleCriteriaArgs> criterias) {
            return criterias(Output.of(criterias));
        }

        /**
         * @param criterias You can refer Criteria for detailed information about criteria and its fields
         * 
         * @return builder
         * 
         */
        public Builder criterias(TeamRoutingRuleCriteriaArgs... criterias) {
            return criterias(List.of(criterias));
        }

        /**
         * @param isDefault Only use when importing default routing rule
         * 
         * @return builder
         * 
         */
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            $.isDefault = isDefault;
            return this;
        }

        /**
         * @param isDefault Only use when importing default routing rule
         * 
         * @return builder
         * 
         */
        public Builder isDefault(Boolean isDefault) {
            return isDefault(Output.of(isDefault));
        }

        /**
         * @param name Name of the team routing rule
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the team routing rule
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notifies Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
         * 
         * @return builder
         * 
         */
        public Builder notifies(Output<List<TeamRoutingRuleNotifyArgs>> notifies) {
            $.notifies = notifies;
            return this;
        }

        /**
         * @param notifies Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
         * 
         * @return builder
         * 
         */
        public Builder notifies(List<TeamRoutingRuleNotifyArgs> notifies) {
            return notifies(Output.of(notifies));
        }

        /**
         * @param notifies Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
         * 
         * @return builder
         * 
         */
        public Builder notifies(TeamRoutingRuleNotifyArgs... notifies) {
            return notifies(List.of(notifies));
        }

        /**
         * @param order The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
         * 
         * @return builder
         * 
         */
        public Builder order(@Nullable Output<Integer> order) {
            $.order = order;
            return this;
        }

        /**
         * @param order The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
         * 
         * @return builder
         * 
         */
        public Builder order(Integer order) {
            return order(Output.of(order));
        }

        /**
         * @param teamId Id of the team owning the routing rule
         * 
         * @return builder
         * 
         */
        public Builder teamId(Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId Id of the team owning the routing rule
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        public Builder timeRestrictions(@Nullable Output<List<TeamRoutingRuleTimeRestrictionArgs>> timeRestrictions) {
            $.timeRestrictions = timeRestrictions;
            return this;
        }

        public Builder timeRestrictions(List<TeamRoutingRuleTimeRestrictionArgs> timeRestrictions) {
            return timeRestrictions(Output.of(timeRestrictions));
        }

        public Builder timeRestrictions(TeamRoutingRuleTimeRestrictionArgs... timeRestrictions) {
            return timeRestrictions(List.of(timeRestrictions));
        }

        /**
         * @param timezone Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
         * 
         * @return builder
         * 
         */
        public Builder timezone(@Nullable Output<String> timezone) {
            $.timezone = timezone;
            return this;
        }

        /**
         * @param timezone Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
         * 
         * @return builder
         * 
         */
        public Builder timezone(String timezone) {
            return timezone(Output.of(timezone));
        }

        public TeamRoutingRuleArgs build() {
            $.notifies = Objects.requireNonNull($.notifies, "expected parameter 'notifies' to be non-null");
            $.teamId = Objects.requireNonNull($.teamId, "expected parameter 'teamId' to be non-null");
            return $;
        }
    }

}
