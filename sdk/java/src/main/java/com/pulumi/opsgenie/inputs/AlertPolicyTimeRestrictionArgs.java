// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.AlertPolicyTimeRestrictionRestrictionArgs;
import com.pulumi.opsgenie.inputs.AlertPolicyTimeRestrictionRestrictionListArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertPolicyTimeRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertPolicyTimeRestrictionArgs Empty = new AlertPolicyTimeRestrictionArgs();

    /**
     * A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
     * 
     */
    @Import(name="restriction")
    private @Nullable Output<List<AlertPolicyTimeRestrictionRestrictionArgs>> restriction;

    /**
     * @return A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
     * 
     */
    public Optional<Output<List<AlertPolicyTimeRestrictionRestrictionArgs>>> restriction() {
        return Optional.ofNullable(this.restriction);
    }

    /**
     * List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
     * 
     */
    @Import(name="restrictionList")
    private @Nullable Output<List<AlertPolicyTimeRestrictionRestrictionListArgs>> restrictionList;

    /**
     * @return List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
     * 
     */
    public Optional<Output<List<AlertPolicyTimeRestrictionRestrictionListArgs>>> restrictionList() {
        return Optional.ofNullable(this.restrictionList);
    }

    /**
     * Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: `time-of-day`, `weekday-and-time-of-day`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: `time-of-day`, `weekday-and-time-of-day`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private AlertPolicyTimeRestrictionArgs() {}

    private AlertPolicyTimeRestrictionArgs(AlertPolicyTimeRestrictionArgs $) {
        this.restriction = $.restriction;
        this.restrictionList = $.restrictionList;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertPolicyTimeRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertPolicyTimeRestrictionArgs $;

        public Builder() {
            $ = new AlertPolicyTimeRestrictionArgs();
        }

        public Builder(AlertPolicyTimeRestrictionArgs defaults) {
            $ = new AlertPolicyTimeRestrictionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param restriction A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder restriction(@Nullable Output<List<AlertPolicyTimeRestrictionRestrictionArgs>> restriction) {
            $.restriction = restriction;
            return this;
        }

        /**
         * @param restriction A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder restriction(List<AlertPolicyTimeRestrictionRestrictionArgs> restriction) {
            return restriction(Output.of(restriction));
        }

        /**
         * @param restriction A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder restriction(AlertPolicyTimeRestrictionRestrictionArgs... restriction) {
            return restriction(List.of(restriction));
        }

        /**
         * @param restrictionList List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder restrictionList(@Nullable Output<List<AlertPolicyTimeRestrictionRestrictionListArgs>> restrictionList) {
            $.restrictionList = restrictionList;
            return this;
        }

        /**
         * @param restrictionList List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder restrictionList(List<AlertPolicyTimeRestrictionRestrictionListArgs> restrictionList) {
            return restrictionList(Output.of(restrictionList));
        }

        /**
         * @param restrictionList List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder restrictionList(AlertPolicyTimeRestrictionRestrictionListArgs... restrictionList) {
            return restrictionList(List.of(restrictionList));
        }

        /**
         * @param type Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: `time-of-day`, `weekday-and-time-of-day`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: `time-of-day`, `weekday-and-time-of-day`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AlertPolicyTimeRestrictionArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("AlertPolicyTimeRestrictionArgs", "type");
            }
            return $;
        }
    }

}
