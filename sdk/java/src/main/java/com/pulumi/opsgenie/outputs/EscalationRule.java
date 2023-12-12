// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.opsgenie.outputs.EscalationRuleRecipient;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class EscalationRule {
    /**
     * @return The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: `if-not-acked` and `if-not-closed`. Default: `if-not-acked`
     * 
     */
    private String condition;
    /**
     * @return Time delay of the escalation rule, in minutes.
     * 
     */
    private Integer delay;
    /**
     * @return Recipient calculation logic for schedules. Possible values are:
     * 
     */
    private String notifyType;
    /**
     * @return Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: `user`, `schedule`, `team`. There can only be one recipient per each `rules`.
     * 
     */
    private List<EscalationRuleRecipient> recipients;

    private EscalationRule() {}
    /**
     * @return The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: `if-not-acked` and `if-not-closed`. Default: `if-not-acked`
     * 
     */
    public String condition() {
        return this.condition;
    }
    /**
     * @return Time delay of the escalation rule, in minutes.
     * 
     */
    public Integer delay() {
        return this.delay;
    }
    /**
     * @return Recipient calculation logic for schedules. Possible values are:
     * 
     */
    public String notifyType() {
        return this.notifyType;
    }
    /**
     * @return Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: `user`, `schedule`, `team`. There can only be one recipient per each `rules`.
     * 
     */
    public List<EscalationRuleRecipient> recipients() {
        return this.recipients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EscalationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String condition;
        private Integer delay;
        private String notifyType;
        private List<EscalationRuleRecipient> recipients;
        public Builder() {}
        public Builder(EscalationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.delay = defaults.delay;
    	      this.notifyType = defaults.notifyType;
    	      this.recipients = defaults.recipients;
        }

        @CustomType.Setter
        public Builder condition(String condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }
        @CustomType.Setter
        public Builder delay(Integer delay) {
            this.delay = Objects.requireNonNull(delay);
            return this;
        }
        @CustomType.Setter
        public Builder notifyType(String notifyType) {
            this.notifyType = Objects.requireNonNull(notifyType);
            return this;
        }
        @CustomType.Setter
        public Builder recipients(List<EscalationRuleRecipient> recipients) {
            this.recipients = Objects.requireNonNull(recipients);
            return this;
        }
        public Builder recipients(EscalationRuleRecipient... recipients) {
            return recipients(List.of(recipients));
        }
        public EscalationRule build() {
            final var _resultValue = new EscalationRule();
            _resultValue.condition = condition;
            _resultValue.delay = delay;
            _resultValue.notifyType = notifyType;
            _resultValue.recipients = recipients;
            return _resultValue;
        }
    }
}
