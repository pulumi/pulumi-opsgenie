// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AlertPolicyTimeRestrictionRestrictionList {
    /**
     * @return Ending day of restriction (eg. `wednesday`)
     * 
     */
    private String endDay;
    /**
     * @return Ending hour of restriction.
     * 
     */
    private Integer endHour;
    /**
     * @return Ending minute of restriction on defined `end_hour`
     * 
     */
    private Integer endMin;
    /**
     * @return Starting day of restriction (eg. `monday`)
     * 
     */
    private String startDay;
    /**
     * @return Starting hour of restriction.
     * 
     */
    private Integer startHour;
    /**
     * @return Staring minute of restriction on defined `start_hour`
     * 
     */
    private Integer startMin;

    private AlertPolicyTimeRestrictionRestrictionList() {}
    /**
     * @return Ending day of restriction (eg. `wednesday`)
     * 
     */
    public String endDay() {
        return this.endDay;
    }
    /**
     * @return Ending hour of restriction.
     * 
     */
    public Integer endHour() {
        return this.endHour;
    }
    /**
     * @return Ending minute of restriction on defined `end_hour`
     * 
     */
    public Integer endMin() {
        return this.endMin;
    }
    /**
     * @return Starting day of restriction (eg. `monday`)
     * 
     */
    public String startDay() {
        return this.startDay;
    }
    /**
     * @return Starting hour of restriction.
     * 
     */
    public Integer startHour() {
        return this.startHour;
    }
    /**
     * @return Staring minute of restriction on defined `start_hour`
     * 
     */
    public Integer startMin() {
        return this.startMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyTimeRestrictionRestrictionList defaults) {
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
        public Builder(AlertPolicyTimeRestrictionRestrictionList defaults) {
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
        public AlertPolicyTimeRestrictionRestrictionList build() {
            final var o = new AlertPolicyTimeRestrictionRestrictionList();
            o.endDay = endDay;
            o.endHour = endHour;
            o.endMin = endMin;
            o.startDay = startDay;
            o.startHour = startHour;
            o.startMin = startMin;
            return o;
        }
    }
}
