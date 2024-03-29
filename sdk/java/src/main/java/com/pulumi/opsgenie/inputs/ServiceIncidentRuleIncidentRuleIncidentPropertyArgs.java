// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceIncidentRuleIncidentRuleIncidentPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIncidentRuleIncidentRuleIncidentPropertyArgs Empty = new ServiceIncidentRuleIncidentRuleIncidentPropertyArgs();

    /**
     * Description field of the incident rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description field of the incident rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Map of key-value pairs to use as custom properties of the alert.
     * 
     */
    @Import(name="details")
    private @Nullable Output<Map<String,String>> details;

    /**
     * @return Map of key-value pairs to use as custom properties of the alert.
     * 
     */
    public Optional<Output<Map<String,String>>> details() {
        return Optional.ofNullable(this.details);
    }

    /**
     * Message of the related incident rule.
     * 
     */
    @Import(name="message", required=true)
    private Output<String> message;

    /**
     * @return Message of the related incident rule.
     * 
     */
    public Output<String> message() {
        return this.message;
    }

    /**
     * Priority level of the alert. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`
     * 
     */
    @Import(name="priority", required=true)
    private Output<String> priority;

    /**
     * @return Priority level of the alert. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`
     * 
     */
    public Output<String> priority() {
        return this.priority;
    }

    /**
     * DEtails about stakeholders for this rule. This is a block, structure is documented below.
     * 
     */
    @Import(name="stakeholderProperties", required=true)
    private Output<List<ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs>> stakeholderProperties;

    /**
     * @return DEtails about stakeholders for this rule. This is a block, structure is documented below.
     * 
     */
    public Output<List<ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs>> stakeholderProperties() {
        return this.stakeholderProperties;
    }

    /**
     * Tags of the alert.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags of the alert.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private ServiceIncidentRuleIncidentRuleIncidentPropertyArgs() {}

    private ServiceIncidentRuleIncidentRuleIncidentPropertyArgs(ServiceIncidentRuleIncidentRuleIncidentPropertyArgs $) {
        this.description = $.description;
        this.details = $.details;
        this.message = $.message;
        this.priority = $.priority;
        this.stakeholderProperties = $.stakeholderProperties;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIncidentRuleIncidentRuleIncidentPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIncidentRuleIncidentRuleIncidentPropertyArgs $;

        public Builder() {
            $ = new ServiceIncidentRuleIncidentRuleIncidentPropertyArgs();
        }

        public Builder(ServiceIncidentRuleIncidentRuleIncidentPropertyArgs defaults) {
            $ = new ServiceIncidentRuleIncidentRuleIncidentPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description field of the incident rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description field of the incident rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param details Map of key-value pairs to use as custom properties of the alert.
         * 
         * @return builder
         * 
         */
        public Builder details(@Nullable Output<Map<String,String>> details) {
            $.details = details;
            return this;
        }

        /**
         * @param details Map of key-value pairs to use as custom properties of the alert.
         * 
         * @return builder
         * 
         */
        public Builder details(Map<String,String> details) {
            return details(Output.of(details));
        }

        /**
         * @param message Message of the related incident rule.
         * 
         * @return builder
         * 
         */
        public Builder message(Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Message of the related incident rule.
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        /**
         * @param priority Priority level of the alert. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`
         * 
         * @return builder
         * 
         */
        public Builder priority(Output<String> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority level of the alert. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`
         * 
         * @return builder
         * 
         */
        public Builder priority(String priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param stakeholderProperties DEtails about stakeholders for this rule. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder stakeholderProperties(Output<List<ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs>> stakeholderProperties) {
            $.stakeholderProperties = stakeholderProperties;
            return this;
        }

        /**
         * @param stakeholderProperties DEtails about stakeholders for this rule. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder stakeholderProperties(List<ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs> stakeholderProperties) {
            return stakeholderProperties(Output.of(stakeholderProperties));
        }

        /**
         * @param stakeholderProperties DEtails about stakeholders for this rule. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder stakeholderProperties(ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs... stakeholderProperties) {
            return stakeholderProperties(List.of(stakeholderProperties));
        }

        /**
         * @param tags Tags of the alert.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags of the alert.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags of the alert.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public ServiceIncidentRuleIncidentRuleIncidentPropertyArgs build() {
            if ($.message == null) {
                throw new MissingRequiredPropertyException("ServiceIncidentRuleIncidentRuleIncidentPropertyArgs", "message");
            }
            if ($.priority == null) {
                throw new MissingRequiredPropertyException("ServiceIncidentRuleIncidentRuleIncidentPropertyArgs", "priority");
            }
            if ($.stakeholderProperties == null) {
                throw new MissingRequiredPropertyException("ServiceIncidentRuleIncidentRuleIncidentPropertyArgs", "stakeholderProperties");
            }
            return $;
        }
    }

}
