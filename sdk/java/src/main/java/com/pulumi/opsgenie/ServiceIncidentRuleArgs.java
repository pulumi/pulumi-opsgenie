// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.opsgenie;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.opsgenie.inputs.ServiceIncidentRuleIncidentRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ServiceIncidentRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceIncidentRuleArgs Empty = new ServiceIncidentRuleArgs();

    /**
     * This is the rule configuration for this incident rule. This is a block, structure is documented below.
     * 
     */
    @Import(name="incidentRules", required=true)
    private Output<List<ServiceIncidentRuleIncidentRuleArgs>> incidentRules;

    /**
     * @return This is the rule configuration for this incident rule. This is a block, structure is documented below.
     * 
     */
    public Output<List<ServiceIncidentRuleIncidentRuleArgs>> incidentRules() {
        return this.incidentRules;
    }

    /**
     * ID of the service associated
     * 
     */
    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    /**
     * @return ID of the service associated
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }

    private ServiceIncidentRuleArgs() {}

    private ServiceIncidentRuleArgs(ServiceIncidentRuleArgs $) {
        this.incidentRules = $.incidentRules;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceIncidentRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceIncidentRuleArgs $;

        public Builder() {
            $ = new ServiceIncidentRuleArgs();
        }

        public Builder(ServiceIncidentRuleArgs defaults) {
            $ = new ServiceIncidentRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param incidentRules This is the rule configuration for this incident rule. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder incidentRules(Output<List<ServiceIncidentRuleIncidentRuleArgs>> incidentRules) {
            $.incidentRules = incidentRules;
            return this;
        }

        /**
         * @param incidentRules This is the rule configuration for this incident rule. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder incidentRules(List<ServiceIncidentRuleIncidentRuleArgs> incidentRules) {
            return incidentRules(Output.of(incidentRules));
        }

        /**
         * @param incidentRules This is the rule configuration for this incident rule. This is a block, structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder incidentRules(ServiceIncidentRuleIncidentRuleArgs... incidentRules) {
            return incidentRules(List.of(incidentRules));
        }

        /**
         * @param serviceId ID of the service associated
         * 
         * @return builder
         * 
         */
        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        /**
         * @param serviceId ID of the service associated
         * 
         * @return builder
         * 
         */
        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public ServiceIncidentRuleArgs build() {
            if ($.incidentRules == null) {
                throw new MissingRequiredPropertyException("ServiceIncidentRuleArgs", "incidentRules");
            }
            if ($.serviceId == null) {
                throw new MissingRequiredPropertyException("ServiceIncidentRuleArgs", "serviceId");
            }
            return $;
        }
    }

}
