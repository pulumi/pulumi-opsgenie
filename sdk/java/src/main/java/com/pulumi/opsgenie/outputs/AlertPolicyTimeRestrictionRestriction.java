// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AlertPolicyTimeRestrictionRestriction {
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
     * @return Starting hour of restriction.
     * 
     */
    private Integer startHour;
    /**
     * @return Staring minute of restriction on defined `start_hour`
     * 
     */
    private Integer startMin;

    private AlertPolicyTimeRestrictionRestriction() {}
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

    public static Builder builder(AlertPolicyTimeRestrictionRestriction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer endHour;
        private Integer endMin;
        private Integer startHour;
        private Integer startMin;
        public Builder() {}
        public Builder(AlertPolicyTimeRestrictionRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endHour = defaults.endHour;
    	      this.endMin = defaults.endMin;
    	      this.startHour = defaults.startHour;
    	      this.startMin = defaults.startMin;
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
        public Builder startHour(Integer startHour) {
            this.startHour = Objects.requireNonNull(startHour);
            return this;
        }
        @CustomType.Setter
        public Builder startMin(Integer startMin) {
            this.startMin = Objects.requireNonNull(startMin);
            return this;
        }
        public AlertPolicyTimeRestrictionRestriction build() {
            final var o = new AlertPolicyTimeRestrictionRestriction();
            o.endHour = endHour;
            o.endMin = endMin;
            o.startHour = startHour;
            o.startMin = startMin;
            return o;
        }
    }
}
