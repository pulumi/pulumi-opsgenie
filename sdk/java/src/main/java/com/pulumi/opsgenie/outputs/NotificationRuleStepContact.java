// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NotificationRuleStepContact {
    /**
     * @return Contact method. Possible values: `email`, `sms`, `voice`, `mobile`
     * 
     */
    private String method;
    /**
     * @return Address of a given method (eg. email address for `email`, phone number for `sms`/`voice` or mobile application name for `mobile`)
     * 
     */
    private String to;

    private NotificationRuleStepContact() {}
    /**
     * @return Contact method. Possible values: `email`, `sms`, `voice`, `mobile`
     * 
     */
    public String method() {
        return this.method;
    }
    /**
     * @return Address of a given method (eg. email address for `email`, phone number for `sms`/`voice` or mobile application name for `mobile`)
     * 
     */
    public String to() {
        return this.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleStepContact defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String method;
        private String to;
        public Builder() {}
        public Builder(NotificationRuleStepContact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.to = defaults.to;
        }

        @CustomType.Setter
        public Builder method(String method) {
            if (method == null) {
              throw new MissingRequiredPropertyException("NotificationRuleStepContact", "method");
            }
            this.method = method;
            return this;
        }
        @CustomType.Setter
        public Builder to(String to) {
            if (to == null) {
              throw new MissingRequiredPropertyException("NotificationRuleStepContact", "to");
            }
            this.to = to;
            return this;
        }
        public NotificationRuleStepContact build() {
            final var _resultValue = new NotificationRuleStepContact();
            _resultValue.method = method;
            _resultValue.to = to;
            return _resultValue;
        }
    }
}
