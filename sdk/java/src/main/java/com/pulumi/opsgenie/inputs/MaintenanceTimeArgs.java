// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MaintenanceTimeArgs extends com.pulumi.resources.ResourceArgs {

    public static final MaintenanceTimeArgs Empty = new MaintenanceTimeArgs();

    /**
     * This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     * 
     */
    @Import(name="endDate")
    private @Nullable Output<String> endDate;

    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     * 
     */
    public Optional<Output<String>> endDate() {
        return Optional.ofNullable(this.endDate);
    }

    /**
     * This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     * 
     */
    @Import(name="startDate")
    private @Nullable Output<String> startDate;

    /**
     * @return This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     * 
     */
    public Optional<Output<String>> startDate() {
        return Optional.ofNullable(this.startDate);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private MaintenanceTimeArgs() {}

    private MaintenanceTimeArgs(MaintenanceTimeArgs $) {
        this.endDate = $.endDate;
        this.startDate = $.startDate;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MaintenanceTimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MaintenanceTimeArgs $;

        public Builder() {
            $ = new MaintenanceTimeArgs();
        }

        public Builder(MaintenanceTimeArgs defaults) {
            $ = new MaintenanceTimeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param endDate This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
         * 
         * @return builder
         * 
         */
        public Builder endDate(@Nullable Output<String> endDate) {
            $.endDate = endDate;
            return this;
        }

        /**
         * @param endDate This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
         * 
         * @return builder
         * 
         */
        public Builder endDate(String endDate) {
            return endDate(Output.of(endDate));
        }

        /**
         * @param startDate This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
         * 
         * @return builder
         * 
         */
        public Builder startDate(@Nullable Output<String> startDate) {
            $.startDate = startDate;
            return this;
        }

        /**
         * @param startDate This parameter takes a date format as (yyyy-MM-dd&#39;T&#39;HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
         * 
         * @return builder
         * 
         */
        public Builder startDate(String startDate) {
            return startDate(Output.of(startDate));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MaintenanceTimeArgs build() {
            if ($.type == null) {
                throw new MissingRequiredPropertyException("MaintenanceTimeArgs", "type");
            }
            return $;
        }
    }

}
