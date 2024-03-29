// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.NotificationPolicyAutoCloseActionArgs;
import com.pulumi.opsgenie.inputs.NotificationPolicyAutoRestartActionArgs;
import com.pulumi.opsgenie.inputs.NotificationPolicyDeDuplicationActionArgs;
import com.pulumi.opsgenie.inputs.NotificationPolicyDelayActionArgs;
import com.pulumi.opsgenie.inputs.NotificationPolicyFilterArgs;
import com.pulumi.opsgenie.inputs.NotificationPolicyTimeRestrictionArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPolicyArgs Empty = new NotificationPolicyArgs();

    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     * 
     */
    @Import(name="autoCloseActions")
    private @Nullable Output<List<NotificationPolicyAutoCloseActionArgs>> autoCloseActions;

    /**
     * @return Auto Restart Action of the policy. This is a block, structure is documented below.
     * 
     */
    public Optional<Output<List<NotificationPolicyAutoCloseActionArgs>>> autoCloseActions() {
        return Optional.ofNullable(this.autoCloseActions);
    }

    /**
     * Auto Restart Action of the policy. This is a block, structure is documented below.
     * 
     */
    @Import(name="autoRestartActions")
    private @Nullable Output<List<NotificationPolicyAutoRestartActionArgs>> autoRestartActions;

    /**
     * @return Auto Restart Action of the policy. This is a block, structure is documented below.
     * 
     */
    public Optional<Output<List<NotificationPolicyAutoRestartActionArgs>>> autoRestartActions() {
        return Optional.ofNullable(this.autoRestartActions);
    }

    /**
     * Deduplication Action of the policy. This is a block, structure is documented below.
     * 
     */
    @Import(name="deDuplicationActions")
    private @Nullable Output<List<NotificationPolicyDeDuplicationActionArgs>> deDuplicationActions;

    /**
     * @return Deduplication Action of the policy. This is a block, structure is documented below.
     * 
     */
    public Optional<Output<List<NotificationPolicyDeDuplicationActionArgs>>> deDuplicationActions() {
        return Optional.ofNullable(this.deDuplicationActions);
    }

    /**
     * Delay notifications. This is a block, structure is documented below.
     * 
     */
    @Import(name="delayActions")
    private @Nullable Output<List<NotificationPolicyDelayActionArgs>> delayActions;

    /**
     * @return Delay notifications. This is a block, structure is documented below.
     * 
     */
    public Optional<Output<List<NotificationPolicyDelayActionArgs>>> delayActions() {
        return Optional.ofNullable(this.delayActions);
    }

    /**
     * If policy should be enabled. Default: `true`
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return If policy should be enabled. Default: `true`
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     * 
     */
    @Import(name="filters", required=true)
    private Output<List<NotificationPolicyFilterArgs>> filters;

    /**
     * @return A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
     * 
     */
    public Output<List<NotificationPolicyFilterArgs>> filters() {
        return this.filters;
    }

    /**
     * Name of the notification policy
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the notification policy
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Description of the policy. This can be max 512 characters.
     * 
     */
    @Import(name="policyDescription")
    private @Nullable Output<String> policyDescription;

    /**
     * @return Description of the policy. This can be max 512 characters.
     * 
     */
    public Optional<Output<String>> policyDescription() {
        return Optional.ofNullable(this.policyDescription);
    }

    /**
     * Suppress value of the policy. Values are: `true`, `false`. Default: `false`
     * 
     */
    @Import(name="suppress")
    private @Nullable Output<Boolean> suppress;

    /**
     * @return Suppress value of the policy. Values are: `true`, `false`. Default: `false`
     * 
     */
    public Optional<Output<Boolean>> suppress() {
        return Optional.ofNullable(this.suppress);
    }

    /**
     * Id of team that this policy belons to.
     * 
     */
    @Import(name="teamId", required=true)
    private Output<String> teamId;

    /**
     * @return Id of team that this policy belons to.
     * 
     */
    public Output<String> teamId() {
        return this.teamId;
    }

    /**
     * Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     * 
     */
    @Import(name="timeRestrictions")
    private @Nullable Output<List<NotificationPolicyTimeRestrictionArgs>> timeRestrictions;

    /**
     * @return Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
     * 
     */
    public Optional<Output<List<NotificationPolicyTimeRestrictionArgs>>> timeRestrictions() {
        return Optional.ofNullable(this.timeRestrictions);
    }

    private NotificationPolicyArgs() {}

    private NotificationPolicyArgs(NotificationPolicyArgs $) {
        this.autoCloseActions = $.autoCloseActions;
        this.autoRestartActions = $.autoRestartActions;
        this.deDuplicationActions = $.deDuplicationActions;
        this.delayActions = $.delayActions;
        this.enabled = $.enabled;
        this.filters = $.filters;
        this.name = $.name;
        this.policyDescription = $.policyDescription;
        this.suppress = $.suppress;
        this.teamId = $.teamId;
        this.timeRestrictions = $.timeRestrictions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyArgs $;

        public Builder() {
            $ = new NotificationPolicyArgs();
        }

        public Builder(NotificationPolicyArgs defaults) {
            $ = new NotificationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoCloseActions Auto Restart Action of the policy. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoCloseActions(@Nullable Output<List<NotificationPolicyAutoCloseActionArgs>> autoCloseActions) {
            $.autoCloseActions = autoCloseActions;
            return this;
        }

        /**
         * @param autoCloseActions Auto Restart Action of the policy. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoCloseActions(List<NotificationPolicyAutoCloseActionArgs> autoCloseActions) {
            return autoCloseActions(Output.of(autoCloseActions));
        }

        /**
         * @param autoCloseActions Auto Restart Action of the policy. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoCloseActions(NotificationPolicyAutoCloseActionArgs... autoCloseActions) {
            return autoCloseActions(List.of(autoCloseActions));
        }

        /**
         * @param autoRestartActions Auto Restart Action of the policy. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoRestartActions(@Nullable Output<List<NotificationPolicyAutoRestartActionArgs>> autoRestartActions) {
            $.autoRestartActions = autoRestartActions;
            return this;
        }

        /**
         * @param autoRestartActions Auto Restart Action of the policy. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoRestartActions(List<NotificationPolicyAutoRestartActionArgs> autoRestartActions) {
            return autoRestartActions(Output.of(autoRestartActions));
        }

        /**
         * @param autoRestartActions Auto Restart Action of the policy. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder autoRestartActions(NotificationPolicyAutoRestartActionArgs... autoRestartActions) {
            return autoRestartActions(List.of(autoRestartActions));
        }

        /**
         * @param deDuplicationActions Deduplication Action of the policy. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder deDuplicationActions(@Nullable Output<List<NotificationPolicyDeDuplicationActionArgs>> deDuplicationActions) {
            $.deDuplicationActions = deDuplicationActions;
            return this;
        }

        /**
         * @param deDuplicationActions Deduplication Action of the policy. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder deDuplicationActions(List<NotificationPolicyDeDuplicationActionArgs> deDuplicationActions) {
            return deDuplicationActions(Output.of(deDuplicationActions));
        }

        /**
         * @param deDuplicationActions Deduplication Action of the policy. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder deDuplicationActions(NotificationPolicyDeDuplicationActionArgs... deDuplicationActions) {
            return deDuplicationActions(List.of(deDuplicationActions));
        }

        /**
         * @param delayActions Delay notifications. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder delayActions(@Nullable Output<List<NotificationPolicyDelayActionArgs>> delayActions) {
            $.delayActions = delayActions;
            return this;
        }

        /**
         * @param delayActions Delay notifications. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder delayActions(List<NotificationPolicyDelayActionArgs> delayActions) {
            return delayActions(Output.of(delayActions));
        }

        /**
         * @param delayActions Delay notifications. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder delayActions(NotificationPolicyDelayActionArgs... delayActions) {
            return delayActions(List.of(delayActions));
        }

        /**
         * @param enabled If policy should be enabled. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If policy should be enabled. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param filters A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(Output<List<NotificationPolicyFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<NotificationPolicyFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder filters(NotificationPolicyFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param name Name of the notification policy
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the notification policy
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyDescription Description of the policy. This can be max 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder policyDescription(@Nullable Output<String> policyDescription) {
            $.policyDescription = policyDescription;
            return this;
        }

        /**
         * @param policyDescription Description of the policy. This can be max 512 characters.
         * 
         * @return builder
         * 
         */
        public Builder policyDescription(String policyDescription) {
            return policyDescription(Output.of(policyDescription));
        }

        /**
         * @param suppress Suppress value of the policy. Values are: `true`, `false`. Default: `false`
         * 
         * @return builder
         * 
         */
        public Builder suppress(@Nullable Output<Boolean> suppress) {
            $.suppress = suppress;
            return this;
        }

        /**
         * @param suppress Suppress value of the policy. Values are: `true`, `false`. Default: `false`
         * 
         * @return builder
         * 
         */
        public Builder suppress(Boolean suppress) {
            return suppress(Output.of(suppress));
        }

        /**
         * @param teamId Id of team that this policy belons to.
         * 
         * @return builder
         * 
         */
        public Builder teamId(Output<String> teamId) {
            $.teamId = teamId;
            return this;
        }

        /**
         * @param teamId Id of team that this policy belons to.
         * 
         * @return builder
         * 
         */
        public Builder teamId(String teamId) {
            return teamId(Output.of(teamId));
        }

        /**
         * @param timeRestrictions Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeRestrictions(@Nullable Output<List<NotificationPolicyTimeRestrictionArgs>> timeRestrictions) {
            $.timeRestrictions = timeRestrictions;
            return this;
        }

        /**
         * @param timeRestrictions Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeRestrictions(List<NotificationPolicyTimeRestrictionArgs> timeRestrictions) {
            return timeRestrictions(Output.of(timeRestrictions));
        }

        /**
         * @param timeRestrictions Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder timeRestrictions(NotificationPolicyTimeRestrictionArgs... timeRestrictions) {
            return timeRestrictions(List.of(timeRestrictions));
        }

        public NotificationPolicyArgs build() {
            if ($.filters == null) {
                throw new MissingRequiredPropertyException("NotificationPolicyArgs", "filters");
            }
            if ($.teamId == null) {
                throw new MissingRequiredPropertyException("NotificationPolicyArgs", "teamId");
            }
            return $;
        }
    }

}
