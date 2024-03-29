// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.NotificationRuleStepContactArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationRuleStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRuleStepArgs Empty = new NotificationRuleStepArgs();

    /**
     * Defines the contact that notification will be sent to. This is a block, structure is documented below.
     * 
     */
    @Import(name="contacts", required=true)
    private Output<List<NotificationRuleStepContactArgs>> contacts;

    /**
     * @return Defines the contact that notification will be sent to. This is a block, structure is documented below.
     * 
     */
    public Output<List<NotificationRuleStepContactArgs>> contacts() {
        return this.contacts;
    }

    /**
     * Defined if this step is enabled. Default: `true`
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Defined if this step is enabled. Default: `true`
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Time period, in minutes, notification will be sent after.
     * 
     */
    @Import(name="sendAfter")
    private @Nullable Output<Integer> sendAfter;

    /**
     * @return Time period, in minutes, notification will be sent after.
     * 
     */
    public Optional<Output<Integer>> sendAfter() {
        return Optional.ofNullable(this.sendAfter);
    }

    private NotificationRuleStepArgs() {}

    private NotificationRuleStepArgs(NotificationRuleStepArgs $) {
        this.contacts = $.contacts;
        this.enabled = $.enabled;
        this.sendAfter = $.sendAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRuleStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRuleStepArgs $;

        public Builder() {
            $ = new NotificationRuleStepArgs();
        }

        public Builder(NotificationRuleStepArgs defaults) {
            $ = new NotificationRuleStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contacts Defines the contact that notification will be sent to. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder contacts(Output<List<NotificationRuleStepContactArgs>> contacts) {
            $.contacts = contacts;
            return this;
        }

        /**
         * @param contacts Defines the contact that notification will be sent to. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder contacts(List<NotificationRuleStepContactArgs> contacts) {
            return contacts(Output.of(contacts));
        }

        /**
         * @param contacts Defines the contact that notification will be sent to. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder contacts(NotificationRuleStepContactArgs... contacts) {
            return contacts(List.of(contacts));
        }

        /**
         * @param enabled Defined if this step is enabled. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Defined if this step is enabled. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param sendAfter Time period, in minutes, notification will be sent after.
         * 
         * @return builder
         * 
         */
        public Builder sendAfter(@Nullable Output<Integer> sendAfter) {
            $.sendAfter = sendAfter;
            return this;
        }

        /**
         * @param sendAfter Time period, in minutes, notification will be sent after.
         * 
         * @return builder
         * 
         */
        public Builder sendAfter(Integer sendAfter) {
            return sendAfter(Output.of(sendAfter));
        }

        public NotificationRuleStepArgs build() {
            if ($.contacts == null) {
                throw new MissingRequiredPropertyException("NotificationRuleStepArgs", "contacts");
            }
            return $;
        }
    }

}
