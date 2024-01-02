// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
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
     * Both `start_day` and `end_day` can assume only `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`, or `sunday` values.
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
     * Both `start_day` and `end_day` can assume only `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`, or `sunday` values.
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
            if (endDay == null) {
              throw new MissingRequiredPropertyException("ScheduleRotationTimeRestrictionRestrictionList", "endDay");
            }
            this.endDay = endDay;
            return this;
        }
        @CustomType.Setter
        public Builder endHour(Integer endHour) {
            if (endHour == null) {
              throw new MissingRequiredPropertyException("ScheduleRotationTimeRestrictionRestrictionList", "endHour");
            }
            this.endHour = endHour;
            return this;
        }
        @CustomType.Setter
        public Builder endMin(Integer endMin) {
            if (endMin == null) {
              throw new MissingRequiredPropertyException("ScheduleRotationTimeRestrictionRestrictionList", "endMin");
            }
            this.endMin = endMin;
            return this;
        }
        @CustomType.Setter
        public Builder startDay(String startDay) {
            if (startDay == null) {
              throw new MissingRequiredPropertyException("ScheduleRotationTimeRestrictionRestrictionList", "startDay");
            }
            this.startDay = startDay;
            return this;
        }
        @CustomType.Setter
        public Builder startHour(Integer startHour) {
            if (startHour == null) {
              throw new MissingRequiredPropertyException("ScheduleRotationTimeRestrictionRestrictionList", "startHour");
            }
            this.startHour = startHour;
            return this;
        }
        @CustomType.Setter
        public Builder startMin(Integer startMin) {
            if (startMin == null) {
              throw new MissingRequiredPropertyException("ScheduleRotationTimeRestrictionRestrictionList", "startMin");
            }
            this.startMin = startMin;
            return this;
        }
        public ScheduleRotationTimeRestrictionRestrictionList build() {
            final var _resultValue = new ScheduleRotationTimeRestrictionRestrictionList();
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
