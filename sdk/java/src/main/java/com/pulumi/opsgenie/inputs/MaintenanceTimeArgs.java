// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
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

    /**
     * This parameter defines when the maintenance will be active. It can take one of for-5-minutes, for-30-minutes, for-1-hour, indefinitely or schedule.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return This parameter defines when the maintenance will be active. It can take one of for-5-minutes, for-30-minutes, for-1-hour, indefinitely or schedule.
     * 
     */
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

        /**
         * @param type This parameter defines when the maintenance will be active. It can take one of for-5-minutes, for-30-minutes, for-1-hour, indefinitely or schedule.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type This parameter defines when the maintenance will be active. It can take one of for-5-minutes, for-30-minutes, for-1-hour, indefinitely or schedule.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MaintenanceTimeArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
