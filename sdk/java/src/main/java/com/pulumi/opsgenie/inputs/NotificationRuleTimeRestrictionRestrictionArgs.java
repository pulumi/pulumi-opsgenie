// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class NotificationRuleTimeRestrictionRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRuleTimeRestrictionRestrictionArgs Empty = new NotificationRuleTimeRestrictionRestrictionArgs();

    @Import(name="endDay", required=true)
    private Output<String> endDay;

    public Output<String> endDay() {
        return this.endDay;
    }

    @Import(name="endHour", required=true)
    private Output<Integer> endHour;

    public Output<Integer> endHour() {
        return this.endHour;
    }

    @Import(name="endMin", required=true)
    private Output<Integer> endMin;

    public Output<Integer> endMin() {
        return this.endMin;
    }

    @Import(name="startDay", required=true)
    private Output<String> startDay;

    public Output<String> startDay() {
        return this.startDay;
    }

    @Import(name="startHour", required=true)
    private Output<Integer> startHour;

    public Output<Integer> startHour() {
        return this.startHour;
    }

    @Import(name="startMin", required=true)
    private Output<Integer> startMin;

    public Output<Integer> startMin() {
        return this.startMin;
    }

    private NotificationRuleTimeRestrictionRestrictionArgs() {}

    private NotificationRuleTimeRestrictionRestrictionArgs(NotificationRuleTimeRestrictionRestrictionArgs $) {
        this.endDay = $.endDay;
        this.endHour = $.endHour;
        this.endMin = $.endMin;
        this.startDay = $.startDay;
        this.startHour = $.startHour;
        this.startMin = $.startMin;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRuleTimeRestrictionRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRuleTimeRestrictionRestrictionArgs $;

        public Builder() {
            $ = new NotificationRuleTimeRestrictionRestrictionArgs();
        }

        public Builder(NotificationRuleTimeRestrictionRestrictionArgs defaults) {
            $ = new NotificationRuleTimeRestrictionRestrictionArgs(Objects.requireNonNull(defaults));
        }

        public Builder endDay(Output<String> endDay) {
            $.endDay = endDay;
            return this;
        }

        public Builder endDay(String endDay) {
            return endDay(Output.of(endDay));
        }

        public Builder endHour(Output<Integer> endHour) {
            $.endHour = endHour;
            return this;
        }

        public Builder endHour(Integer endHour) {
            return endHour(Output.of(endHour));
        }

        public Builder endMin(Output<Integer> endMin) {
            $.endMin = endMin;
            return this;
        }

        public Builder endMin(Integer endMin) {
            return endMin(Output.of(endMin));
        }

        public Builder startDay(Output<String> startDay) {
            $.startDay = startDay;
            return this;
        }

        public Builder startDay(String startDay) {
            return startDay(Output.of(startDay));
        }

        public Builder startHour(Output<Integer> startHour) {
            $.startHour = startHour;
            return this;
        }

        public Builder startHour(Integer startHour) {
            return startHour(Output.of(startHour));
        }

        public Builder startMin(Output<Integer> startMin) {
            $.startMin = startMin;
            return this;
        }

        public Builder startMin(Integer startMin) {
            return startMin(Output.of(startMin));
        }

        public NotificationRuleTimeRestrictionRestrictionArgs build() {
            if ($.endDay == null) {
                throw new MissingRequiredPropertyException("NotificationRuleTimeRestrictionRestrictionArgs", "endDay");
            }
            if ($.endHour == null) {
                throw new MissingRequiredPropertyException("NotificationRuleTimeRestrictionRestrictionArgs", "endHour");
            }
            if ($.endMin == null) {
                throw new MissingRequiredPropertyException("NotificationRuleTimeRestrictionRestrictionArgs", "endMin");
            }
            if ($.startDay == null) {
                throw new MissingRequiredPropertyException("NotificationRuleTimeRestrictionRestrictionArgs", "startDay");
            }
            if ($.startHour == null) {
                throw new MissingRequiredPropertyException("NotificationRuleTimeRestrictionRestrictionArgs", "startHour");
            }
            if ($.startMin == null) {
                throw new MissingRequiredPropertyException("NotificationRuleTimeRestrictionRestrictionArgs", "startMin");
            }
            return $;
        }
    }

}
