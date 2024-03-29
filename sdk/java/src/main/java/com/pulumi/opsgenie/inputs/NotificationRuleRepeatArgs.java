// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationRuleRepeatArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationRuleRepeatArgs Empty = new NotificationRuleRepeatArgs();

    /**
     * If policy should be enabled. Default: `true`
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return If policy should be enabled. Default: `true`
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="loopAfter", required=true)
    private Output<Integer> loopAfter;

    public Output<Integer> loopAfter() {
        return this.loopAfter;
    }

    private NotificationRuleRepeatArgs() {}

    private NotificationRuleRepeatArgs(NotificationRuleRepeatArgs $) {
        this.enabled = $.enabled;
        this.loopAfter = $.loopAfter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationRuleRepeatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationRuleRepeatArgs $;

        public Builder() {
            $ = new NotificationRuleRepeatArgs();
        }

        public Builder(NotificationRuleRepeatArgs defaults) {
            $ = new NotificationRuleRepeatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled If policy should be enabled. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled If policy should be enabled. Default: `true`
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder loopAfter(Output<Integer> loopAfter) {
            $.loopAfter = loopAfter;
            return this;
        }

        public Builder loopAfter(Integer loopAfter) {
            return loopAfter(Output.of(loopAfter));
        }

        public NotificationRuleRepeatArgs build() {
            if ($.loopAfter == null) {
                throw new MissingRequiredPropertyException("NotificationRuleRepeatArgs", "loopAfter");
            }
            return $;
        }
    }

}
