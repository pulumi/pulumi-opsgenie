// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyDeDuplicationActionDurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPolicyDeDuplicationActionDurationArgs Empty = new NotificationPolicyDeDuplicationActionDurationArgs();

    /**
     * A amount of time in `time_units`. This is a integer attribute.
     * 
     */
    @Import(name="timeAmount", required=true)
    private Output<Integer> timeAmount;

    /**
     * @return A amount of time in `time_units`. This is a integer attribute.
     * 
     */
    public Output<Integer> timeAmount() {
        return this.timeAmount;
    }

    /**
     * Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
     * 
     */
    @Import(name="timeUnit")
    private @Nullable Output<String> timeUnit;

    /**
     * @return Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
     * 
     */
    public Optional<Output<String>> timeUnit() {
        return Optional.ofNullable(this.timeUnit);
    }

    private NotificationPolicyDeDuplicationActionDurationArgs() {}

    private NotificationPolicyDeDuplicationActionDurationArgs(NotificationPolicyDeDuplicationActionDurationArgs $) {
        this.timeAmount = $.timeAmount;
        this.timeUnit = $.timeUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyDeDuplicationActionDurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyDeDuplicationActionDurationArgs $;

        public Builder() {
            $ = new NotificationPolicyDeDuplicationActionDurationArgs();
        }

        public Builder(NotificationPolicyDeDuplicationActionDurationArgs defaults) {
            $ = new NotificationPolicyDeDuplicationActionDurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param timeAmount A amount of time in `time_units`. This is a integer attribute.
         * 
         * @return builder
         * 
         */
        public Builder timeAmount(Output<Integer> timeAmount) {
            $.timeAmount = timeAmount;
            return this;
        }

        /**
         * @param timeAmount A amount of time in `time_units`. This is a integer attribute.
         * 
         * @return builder
         * 
         */
        public Builder timeAmount(Integer timeAmount) {
            return timeAmount(Output.of(timeAmount));
        }

        /**
         * @param timeUnit Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
         * 
         * @return builder
         * 
         */
        public Builder timeUnit(@Nullable Output<String> timeUnit) {
            $.timeUnit = timeUnit;
            return this;
        }

        /**
         * @param timeUnit Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
         * 
         * @return builder
         * 
         */
        public Builder timeUnit(String timeUnit) {
            return timeUnit(Output.of(timeUnit));
        }

        public NotificationPolicyDeDuplicationActionDurationArgs build() {
            $.timeAmount = Objects.requireNonNull($.timeAmount, "expected parameter 'timeAmount' to be non-null");
            return $;
        }
    }

}
