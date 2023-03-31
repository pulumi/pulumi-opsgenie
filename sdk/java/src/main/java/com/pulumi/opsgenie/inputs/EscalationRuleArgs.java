// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.opsgenie.inputs.EscalationRuleRecipientArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class EscalationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final EscalationRuleArgs Empty = new EscalationRuleArgs();

    /**
     * The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: `if-not-acked` and `if-not-closed`. Default: `if-not-acked`
     * 
     */
    @Import(name="condition", required=true)
    private Output<String> condition;

    /**
     * @return The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: `if-not-acked` and `if-not-closed`. Default: `if-not-acked`
     * 
     */
    public Output<String> condition() {
        return this.condition;
    }

    /**
     * Time delay of the escalation rule, in minutes.
     * 
     */
    @Import(name="delay", required=true)
    private Output<Integer> delay;

    /**
     * @return Time delay of the escalation rule, in minutes.
     * 
     */
    public Output<Integer> delay() {
        return this.delay;
    }

    /**
     * Recipient calculation logic for schedules. Possible values are:
     * 
     */
    @Import(name="notifyType", required=true)
    private Output<String> notifyType;

    /**
     * @return Recipient calculation logic for schedules. Possible values are:
     * 
     */
    public Output<String> notifyType() {
        return this.notifyType;
    }

    /**
     * Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: `user`, `schedule`, `team`.
     * 
     */
    @Import(name="recipients", required=true)
    private Output<List<EscalationRuleRecipientArgs>> recipients;

    /**
     * @return Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: `user`, `schedule`, `team`.
     * 
     */
    public Output<List<EscalationRuleRecipientArgs>> recipients() {
        return this.recipients;
    }

    private EscalationRuleArgs() {}

    private EscalationRuleArgs(EscalationRuleArgs $) {
        this.condition = $.condition;
        this.delay = $.delay;
        this.notifyType = $.notifyType;
        this.recipients = $.recipients;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EscalationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EscalationRuleArgs $;

        public Builder() {
            $ = new EscalationRuleArgs();
        }

        public Builder(EscalationRuleArgs defaults) {
            $ = new EscalationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param condition The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: `if-not-acked` and `if-not-closed`. Default: `if-not-acked`
         * 
         * @return builder
         * 
         */
        public Builder condition(Output<String> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: `if-not-acked` and `if-not-closed`. Default: `if-not-acked`
         * 
         * @return builder
         * 
         */
        public Builder condition(String condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param delay Time delay of the escalation rule, in minutes.
         * 
         * @return builder
         * 
         */
        public Builder delay(Output<Integer> delay) {
            $.delay = delay;
            return this;
        }

        /**
         * @param delay Time delay of the escalation rule, in minutes.
         * 
         * @return builder
         * 
         */
        public Builder delay(Integer delay) {
            return delay(Output.of(delay));
        }

        /**
         * @param notifyType Recipient calculation logic for schedules. Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder notifyType(Output<String> notifyType) {
            $.notifyType = notifyType;
            return this;
        }

        /**
         * @param notifyType Recipient calculation logic for schedules. Possible values are:
         * 
         * @return builder
         * 
         */
        public Builder notifyType(String notifyType) {
            return notifyType(Output.of(notifyType));
        }

        /**
         * @param recipients Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: `user`, `schedule`, `team`.
         * 
         * @return builder
         * 
         */
        public Builder recipients(Output<List<EscalationRuleRecipientArgs>> recipients) {
            $.recipients = recipients;
            return this;
        }

        /**
         * @param recipients Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: `user`, `schedule`, `team`.
         * 
         * @return builder
         * 
         */
        public Builder recipients(List<EscalationRuleRecipientArgs> recipients) {
            return recipients(Output.of(recipients));
        }

        /**
         * @param recipients Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: `user`, `schedule`, `team`.
         * 
         * @return builder
         * 
         */
        public Builder recipients(EscalationRuleRecipientArgs... recipients) {
            return recipients(List.of(recipients));
        }

        public EscalationRuleArgs build() {
            $.condition = Objects.requireNonNull($.condition, "expected parameter 'condition' to be non-null");
            $.delay = Objects.requireNonNull($.delay, "expected parameter 'delay' to be non-null");
            $.notifyType = Objects.requireNonNull($.notifyType, "expected parameter 'notifyType' to be non-null");
            $.recipients = Objects.requireNonNull($.recipients, "expected parameter 'recipients' to be non-null");
            return $;
        }
    }

}