// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NotificationRuleSchedule {
    /**
     * @return Name of the notification policy
     * 
     */
    private final String name;
    /**
     * @return Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
     * 
     */
    private final String type;

    @CustomType.Constructor
    private NotificationRuleSchedule(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("type") String type) {
        this.name = name;
        this.type = type;
    }

    /**
     * @return Name of the notification policy
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleSchedule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRuleSchedule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public NotificationRuleSchedule build() {
            return new NotificationRuleSchedule(name, type);
        }
    }
}
