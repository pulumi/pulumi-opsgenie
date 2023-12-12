// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NotificationRuleTimeRestrictionRestriction {
    private String endDay;
    private Integer endHour;
    private Integer endMin;
    private String startDay;
    private Integer startHour;
    private Integer startMin;

    private NotificationRuleTimeRestrictionRestriction() {}
    public String endDay() {
        return this.endDay;
    }
    public Integer endHour() {
        return this.endHour;
    }
    public Integer endMin() {
        return this.endMin;
    }
    public String startDay() {
        return this.startDay;
    }
    public Integer startHour() {
        return this.startHour;
    }
    public Integer startMin() {
        return this.startMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRuleTimeRestrictionRestriction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String endDay;
        private Integer endHour;
        private Integer endMin;
        private String startDay;
        private Integer startHour;
        private Integer startMin;
        public Builder() {}
        public Builder(NotificationRuleTimeRestrictionRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endDay = defaults.endDay;
    	      this.endHour = defaults.endHour;
    	      this.endMin = defaults.endMin;
    	      this.startDay = defaults.startDay;
    	      this.startHour = defaults.startHour;
    	      this.startMin = defaults.startMin;
        }

        @CustomType.Setter
        public Builder endDay(String endDay) {
            this.endDay = Objects.requireNonNull(endDay);
            return this;
        }
        @CustomType.Setter
        public Builder endHour(Integer endHour) {
            this.endHour = Objects.requireNonNull(endHour);
            return this;
        }
        @CustomType.Setter
        public Builder endMin(Integer endMin) {
            this.endMin = Objects.requireNonNull(endMin);
            return this;
        }
        @CustomType.Setter
        public Builder startDay(String startDay) {
            this.startDay = Objects.requireNonNull(startDay);
            return this;
        }
        @CustomType.Setter
        public Builder startHour(Integer startHour) {
            this.startHour = Objects.requireNonNull(startHour);
            return this;
        }
        @CustomType.Setter
        public Builder startMin(Integer startMin) {
            this.startMin = Objects.requireNonNull(startMin);
            return this;
        }
        public NotificationRuleTimeRestrictionRestriction build() {
            final var _resultValue = new NotificationRuleTimeRestrictionRestriction();
            _resultValue.endDay = endDay;
            _resultValue.endHour = endHour;
            _resultValue.endMin = endMin;
            _resultValue.startDay = startDay;
            _resultValue.startHour = startHour;
            _resultValue.startMin = startMin;
            return _resultValue;
        }
    }
}
