// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.outputs.AlertPolicyTimeRestrictionRestriction;
import com.pulumi.opsgenie.outputs.AlertPolicyTimeRestrictionRestrictionList;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class AlertPolicyTimeRestriction {
    /**
     * @return A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
     * 
     */
    private @Nullable List<AlertPolicyTimeRestrictionRestriction> restriction;
    /**
     * @return List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
     * 
     */
    private @Nullable List<AlertPolicyTimeRestrictionRestrictionList> restrictionList;
    /**
     * @return Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: `time-of-day`, `weekday-and-time-of-day`
     * 
     */
    private String type;

    private AlertPolicyTimeRestriction() {}
    /**
     * @return A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
     * 
     */
    public List<AlertPolicyTimeRestrictionRestriction> restriction() {
        return this.restriction == null ? List.of() : this.restriction;
    }
    /**
     * @return List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
     * 
     */
    public List<AlertPolicyTimeRestrictionRestrictionList> restrictionList() {
        return this.restrictionList == null ? List.of() : this.restrictionList;
    }
    /**
     * @return Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: `time-of-day`, `weekday-and-time-of-day`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyTimeRestriction defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AlertPolicyTimeRestrictionRestriction> restriction;
        private @Nullable List<AlertPolicyTimeRestrictionRestrictionList> restrictionList;
        private String type;
        public Builder() {}
        public Builder(AlertPolicyTimeRestriction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restriction = defaults.restriction;
    	      this.restrictionList = defaults.restrictionList;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder restriction(@Nullable List<AlertPolicyTimeRestrictionRestriction> restriction) {

            this.restriction = restriction;
            return this;
        }
        public Builder restriction(AlertPolicyTimeRestrictionRestriction... restriction) {
            return restriction(List.of(restriction));
        }
        @CustomType.Setter
        public Builder restrictionList(@Nullable List<AlertPolicyTimeRestrictionRestrictionList> restrictionList) {

            this.restrictionList = restrictionList;
            return this;
        }
        public Builder restrictionList(AlertPolicyTimeRestrictionRestrictionList... restrictionList) {
            return restrictionList(List.of(restrictionList));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("AlertPolicyTimeRestriction", "type");
            }
            this.type = type;
            return this;
        }
        public AlertPolicyTimeRestriction build() {
            final var _resultValue = new AlertPolicyTimeRestriction();
            _resultValue.restriction = restriction;
            _resultValue.restrictionList = restrictionList;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
