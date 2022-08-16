// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.opsgenie.inputs.NotificationRuleTimeRestrictionRestrictionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationRuleTimeRestrictionArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRuleTimeRestrictionArgs Empty = new NotificationRuleTimeRestrictionArgs();

    @Import(name="restrictions")
    private @Nullable Output<List<NotificationRuleTimeRestrictionRestrictionArgs>> restrictions;

    public Optional<Output<List<NotificationRuleTimeRestrictionRestrictionArgs>>> restrictions() {
        return Optional.ofNullable(this.restrictions);
    }

    /**
     * Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private NotificationRuleTimeRestrictionArgs() {}

    private NotificationRuleTimeRestrictionArgs(NotificationRuleTimeRestrictionArgs $) {
        this.restrictions = $.restrictions;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRuleTimeRestrictionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRuleTimeRestrictionArgs $;

        public Builder() {
            $ = new NotificationRuleTimeRestrictionArgs();
        }

        public Builder(NotificationRuleTimeRestrictionArgs defaults) {
            $ = new NotificationRuleTimeRestrictionArgs(Objects.requireNonNull(defaults));
        }

        public Builder restrictions(@Nullable Output<List<NotificationRuleTimeRestrictionRestrictionArgs>> restrictions) {
            $.restrictions = restrictions;
            return this;
        }

        public Builder restrictions(List<NotificationRuleTimeRestrictionRestrictionArgs> restrictions) {
            return restrictions(Output.of(restrictions));
        }

        public Builder restrictions(NotificationRuleTimeRestrictionRestrictionArgs... restrictions) {
            return restrictions(List.of(restrictions));
        }

        /**
         * @param type Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NotificationRuleTimeRestrictionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
