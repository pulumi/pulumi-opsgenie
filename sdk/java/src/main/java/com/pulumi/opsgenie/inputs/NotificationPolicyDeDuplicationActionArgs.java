// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.opsgenie.inputs.NotificationPolicyDeDuplicationActionDurationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationPolicyDeDuplicationActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationPolicyDeDuplicationActionArgs Empty = new NotificationPolicyDeDuplicationActionArgs();

    /**
     * Count
     * 
     */
    @Import(name="count", required=true)
    private Output<Integer> count;

    /**
     * @return Count
     * 
     */
    public Output<Integer> count() {
        return this.count;
    }

    /**
     * Deduplication type. Possible values are: &#34;value-based&#34;, &#34;frequency-based&#34;
     * 
     */
    @Import(name="deDuplicationActionType", required=true)
    private Output<String> deDuplicationActionType;

    /**
     * @return Deduplication type. Possible values are: &#34;value-based&#34;, &#34;frequency-based&#34;
     * 
     */
    public Output<String> deDuplicationActionType() {
        return this.deDuplicationActionType;
    }

    /**
     * Duration of this action (only required for &#34;frequency-based&#34; de-duplication action). This is a block, structure is documented below.
     * 
     */
    @Import(name="durations")
    private @Nullable Output<List<NotificationPolicyDeDuplicationActionDurationArgs>> durations;

    /**
     * @return Duration of this action (only required for &#34;frequency-based&#34; de-duplication action). This is a block, structure is documented below.
     * 
     */
    public Optional<Output<List<NotificationPolicyDeDuplicationActionDurationArgs>>> durations() {
        return Optional.ofNullable(this.durations);
    }

    private NotificationPolicyDeDuplicationActionArgs() {}

    private NotificationPolicyDeDuplicationActionArgs(NotificationPolicyDeDuplicationActionArgs $) {
        this.count = $.count;
        this.deDuplicationActionType = $.deDuplicationActionType;
        this.durations = $.durations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationPolicyDeDuplicationActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationPolicyDeDuplicationActionArgs $;

        public Builder() {
            $ = new NotificationPolicyDeDuplicationActionArgs();
        }

        public Builder(NotificationPolicyDeDuplicationActionArgs defaults) {
            $ = new NotificationPolicyDeDuplicationActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Count
         * 
         * @return builder
         * 
         */
        public Builder count(Output<Integer> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Count
         * 
         * @return builder
         * 
         */
        public Builder count(Integer count) {
            return count(Output.of(count));
        }

        /**
         * @param deDuplicationActionType Deduplication type. Possible values are: &#34;value-based&#34;, &#34;frequency-based&#34;
         * 
         * @return builder
         * 
         */
        public Builder deDuplicationActionType(Output<String> deDuplicationActionType) {
            $.deDuplicationActionType = deDuplicationActionType;
            return this;
        }

        /**
         * @param deDuplicationActionType Deduplication type. Possible values are: &#34;value-based&#34;, &#34;frequency-based&#34;
         * 
         * @return builder
         * 
         */
        public Builder deDuplicationActionType(String deDuplicationActionType) {
            return deDuplicationActionType(Output.of(deDuplicationActionType));
        }

        /**
         * @param durations Duration of this action (only required for &#34;frequency-based&#34; de-duplication action). This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder durations(@Nullable Output<List<NotificationPolicyDeDuplicationActionDurationArgs>> durations) {
            $.durations = durations;
            return this;
        }

        /**
         * @param durations Duration of this action (only required for &#34;frequency-based&#34; de-duplication action). This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder durations(List<NotificationPolicyDeDuplicationActionDurationArgs> durations) {
            return durations(Output.of(durations));
        }

        /**
         * @param durations Duration of this action (only required for &#34;frequency-based&#34; de-duplication action). This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder durations(NotificationPolicyDeDuplicationActionDurationArgs... durations) {
            return durations(List.of(durations));
        }

        public NotificationPolicyDeDuplicationActionArgs build() {
            $.count = Objects.requireNonNull($.count, "expected parameter 'count' to be non-null");
            $.deDuplicationActionType = Objects.requireNonNull($.deDuplicationActionType, "expected parameter 'deDuplicationActionType' to be non-null");
            return $;
        }
    }

}