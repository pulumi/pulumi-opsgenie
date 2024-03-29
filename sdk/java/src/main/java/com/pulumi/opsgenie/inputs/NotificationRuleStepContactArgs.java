// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;


public final class NotificationRuleStepContactArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRuleStepContactArgs Empty = new NotificationRuleStepContactArgs();

    /**
     * Contact method. Possible values: `email`, `sms`, `voice`, `mobile`
     * 
     */
    @Import(name="method", required=true)
    private Output<String> method;

    /**
     * @return Contact method. Possible values: `email`, `sms`, `voice`, `mobile`
     * 
     */
    public Output<String> method() {
        return this.method;
    }

    /**
     * Address of a given method (eg. email address for `email`, phone number for `sms`/`voice` or mobile application name for `mobile`)
     * 
     */
    @Import(name="to", required=true)
    private Output<String> to;

    /**
     * @return Address of a given method (eg. email address for `email`, phone number for `sms`/`voice` or mobile application name for `mobile`)
     * 
     */
    public Output<String> to() {
        return this.to;
    }

    private NotificationRuleStepContactArgs() {}

    private NotificationRuleStepContactArgs(NotificationRuleStepContactArgs $) {
        this.method = $.method;
        this.to = $.to;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRuleStepContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRuleStepContactArgs $;

        public Builder() {
            $ = new NotificationRuleStepContactArgs();
        }

        public Builder(NotificationRuleStepContactArgs defaults) {
            $ = new NotificationRuleStepContactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param method Contact method. Possible values: `email`, `sms`, `voice`, `mobile`
         * 
         * @return builder
         * 
         */
        public Builder method(Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Contact method. Possible values: `email`, `sms`, `voice`, `mobile`
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param to Address of a given method (eg. email address for `email`, phone number for `sms`/`voice` or mobile application name for `mobile`)
         * 
         * @return builder
         * 
         */
        public Builder to(Output<String> to) {
            $.to = to;
            return this;
        }

        /**
         * @param to Address of a given method (eg. email address for `email`, phone number for `sms`/`voice` or mobile application name for `mobile`)
         * 
         * @return builder
         * 
         */
        public Builder to(String to) {
            return to(Output.of(to));
        }

        public NotificationRuleStepContactArgs build() {
            if ($.method == null) {
                throw new MissingRequiredPropertyException("NotificationRuleStepContactArgs", "method");
            }
            if ($.to == null) {
                throw new MissingRequiredPropertyException("NotificationRuleStepContactArgs", "to");
            }
            return $;
        }
    }

}
