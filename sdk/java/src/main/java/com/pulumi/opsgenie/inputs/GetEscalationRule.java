// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.GetEscalationRuleRecipient;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetEscalationRule extends com.pulumi.resources.InvokeArgs {

    public static final GetEscalationRule Empty = new GetEscalationRule();

    @Import(name="condition", required=true)
    private String condition;

    public String condition() {
        return this.condition;
    }

    @Import(name="delay", required=true)
    private Integer delay;

    public Integer delay() {
        return this.delay;
    }

    @Import(name="notifyType", required=true)
    private String notifyType;

    public String notifyType() {
        return this.notifyType;
    }

    @Import(name="recipients", required=true)
    private List<GetEscalationRuleRecipient> recipients;

    public List<GetEscalationRuleRecipient> recipients() {
        return this.recipients;
    }

    private GetEscalationRule() {}

    private GetEscalationRule(GetEscalationRule $) {
        this.condition = $.condition;
        this.delay = $.delay;
        this.notifyType = $.notifyType;
        this.recipients = $.recipients;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEscalationRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEscalationRule $;

        public Builder() {
            $ = new GetEscalationRule();
        }

        public Builder(GetEscalationRule defaults) {
            $ = new GetEscalationRule(Objects.requireNonNull(defaults));
        }

        public Builder condition(String condition) {
            $.condition = condition;
            return this;
        }

        public Builder delay(Integer delay) {
            $.delay = delay;
            return this;
        }

        public Builder notifyType(String notifyType) {
            $.notifyType = notifyType;
            return this;
        }

        public Builder recipients(List<GetEscalationRuleRecipient> recipients) {
            $.recipients = recipients;
            return this;
        }

        public Builder recipients(GetEscalationRuleRecipient... recipients) {
            return recipients(List.of(recipients));
        }

        public GetEscalationRule build() {
            if ($.condition == null) {
                throw new MissingRequiredPropertyException("GetEscalationRule", "condition");
            }
            if ($.delay == null) {
                throw new MissingRequiredPropertyException("GetEscalationRule", "delay");
            }
            if ($.notifyType == null) {
                throw new MissingRequiredPropertyException("GetEscalationRule", "notifyType");
            }
            if ($.recipients == null) {
                throw new MissingRequiredPropertyException("GetEscalationRule", "recipients");
            }
            return $;
        }
    }

}
