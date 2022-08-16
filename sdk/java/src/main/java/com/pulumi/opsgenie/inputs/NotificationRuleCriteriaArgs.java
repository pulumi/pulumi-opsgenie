// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.opsgenie.inputs.NotificationRuleCriteriaConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationRuleCriteriaArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRuleCriteriaArgs Empty = new NotificationRuleCriteriaArgs();

    /**
     * Defines the fields and values when the condition applies
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<NotificationRuleCriteriaConditionArgs>> conditions;

    /**
     * @return Defines the fields and values when the condition applies
     * 
     */
    public Optional<Output<List<NotificationRuleCriteriaConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
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

    private NotificationRuleCriteriaArgs() {}

    private NotificationRuleCriteriaArgs(NotificationRuleCriteriaArgs $) {
        this.conditions = $.conditions;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRuleCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRuleCriteriaArgs $;

        public Builder() {
            $ = new NotificationRuleCriteriaArgs();
        }

        public Builder(NotificationRuleCriteriaArgs defaults) {
            $ = new NotificationRuleCriteriaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param conditions Defines the fields and values when the condition applies
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<NotificationRuleCriteriaConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Defines the fields and values when the condition applies
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<NotificationRuleCriteriaConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Defines the fields and values when the condition applies
         * 
         * @return builder
         * 
         */
        public Builder conditions(NotificationRuleCriteriaConditionArgs... conditions) {
            return conditions(List.of(conditions));
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

        public NotificationRuleCriteriaArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
