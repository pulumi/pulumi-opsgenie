// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.outputs.GetEscalationRuleRecipient;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEscalationRule {
    private String condition;
    private Integer delay;
    private String notifyType;
    private List<GetEscalationRuleRecipient> recipients;

    private GetEscalationRule() {}
    public String condition() {
        return this.condition;
    }
    public Integer delay() {
        return this.delay;
    }
    public String notifyType() {
        return this.notifyType;
    }
    public List<GetEscalationRuleRecipient> recipients() {
        return this.recipients;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEscalationRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String condition;
        private Integer delay;
        private String notifyType;
        private List<GetEscalationRuleRecipient> recipients;
        public Builder() {}
        public Builder(GetEscalationRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.delay = defaults.delay;
    	      this.notifyType = defaults.notifyType;
    	      this.recipients = defaults.recipients;
        }

        @CustomType.Setter
        public Builder condition(String condition) {
            if (condition == null) {
              throw new MissingRequiredPropertyException("GetEscalationRule", "condition");
            }
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder delay(Integer delay) {
            if (delay == null) {
              throw new MissingRequiredPropertyException("GetEscalationRule", "delay");
            }
            this.delay = delay;
            return this;
        }
        @CustomType.Setter
        public Builder notifyType(String notifyType) {
            if (notifyType == null) {
              throw new MissingRequiredPropertyException("GetEscalationRule", "notifyType");
            }
            this.notifyType = notifyType;
            return this;
        }
        @CustomType.Setter
        public Builder recipients(List<GetEscalationRuleRecipient> recipients) {
            if (recipients == null) {
              throw new MissingRequiredPropertyException("GetEscalationRule", "recipients");
            }
            this.recipients = recipients;
            return this;
        }
        public Builder recipients(GetEscalationRuleRecipient... recipients) {
            return recipients(List.of(recipients));
        }
        public GetEscalationRule build() {
            final var _resultValue = new GetEscalationRule();
            _resultValue.condition = condition;
            _resultValue.delay = delay;
            _resultValue.notifyType = notifyType;
            _resultValue.recipients = recipients;
            return _resultValue;
        }
    }
}
