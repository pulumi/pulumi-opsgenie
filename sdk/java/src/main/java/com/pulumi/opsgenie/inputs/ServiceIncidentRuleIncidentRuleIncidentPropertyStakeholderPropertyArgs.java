// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs Empty = new ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs();

    /**
     * Description that is generally used to provide a detailed information about the alert.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description that is generally used to provide a detailed information about the alert.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Option to enable stakeholder notifications.Default value is true.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Option to enable stakeholder notifications.Default value is true.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Message that is to be passed to audience that is generally used to provide a content information about the alert.
     * 
     */
    @Import(name="message", required=true)
    private Output<String> message;

    /**
     * @return Message that is to be passed to audience that is generally used to provide a content information about the alert.
     * 
     */
    public Output<String> message() {
        return this.message;
    }

    private ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs() {}

    private ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs(ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs $) {
        this.description = $.description;
        this.enable = $.enable;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs $;

        public Builder() {
            $ = new ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs();
        }

        public Builder(ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs defaults) {
            $ = new ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description that is generally used to provide a detailed information about the alert.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description that is generally used to provide a detailed information about the alert.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enable Option to enable stakeholder notifications.Default value is true.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Option to enable stakeholder notifications.Default value is true.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param message Message that is to be passed to audience that is generally used to provide a content information about the alert.
         * 
         * @return builder
         * 
         */
        public Builder message(Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Message that is to be passed to audience that is generally used to provide a content information about the alert.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        public ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs build() {
            if ($.message == null) {
                throw new MissingRequiredPropertyException("ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs", "message");
            }
            return $;
        }
    }

}
