// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduleRotationTimeRestrictionRestrictionList {
    /**
     * @return Value of the day that frame will end.
     * 
     */
    private String endDay;
    /**
     * @return Value of the hour that frame will end.
     * 
     */
    private Integer endHour;
    /**
     * @return Value of the minute that frame will end. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     * 
     */
    private Integer endMin;
    /**
     * @return Value of the day that frame will start.
     * 
     */
    private String startDay;
    /**
     * @return Value of the hour that frame will start
     * 
     */
    private Integer startHour;
    /**
     * @return Value of the minute that frame will start. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     * 
     */
    private Integer startMin;

    private ScheduleRotationTimeRestrictionRestrictionList() {}
    /**
     * @return Value of the day that frame will end.
     * 
     */
    public String endDay() {
        return this.endDay;
    }
    /**
     * @return Value of the hour that frame will end.
     * 
     */
    public Integer endHour() {
        return this.endHour;
    }
    /**
     * @return Value of the minute that frame will end. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     * 
     */
    public Integer endMin() {
        return this.endMin;
    }
    /**
     * @return Value of the day that frame will start.
     * 
     */
    public String startDay() {
        return this.startDay;
    }
    /**
     * @return Value of the hour that frame will start
     * 
     */
    public Integer startHour() {
        return this.startHour;
    }
    /**
     * @return Value of the minute that frame will start. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     * 
     */
    public Integer startMin() {
        return this.startMin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduleRotationTimeRestrictionRestrictionList defaults) {
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
        public Builder(ScheduleRotationTimeRestrictionRestrictionList defaults) {
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
        public ScheduleRotationTimeRestrictionRestrictionList build() {
            final var o = new ScheduleRotationTimeRestrictionRestrictionList();
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