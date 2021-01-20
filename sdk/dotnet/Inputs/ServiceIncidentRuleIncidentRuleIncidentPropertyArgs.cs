// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class ServiceIncidentRuleIncidentRuleIncidentPropertyArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description that is generally used to provide a detailed information about the alert.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("details")]
        private InputList<string>? _details;

        /// <summary>
        /// Map of key-value pairs to use as custom properties of the alert.
        /// </summary>
        public InputList<string> Details
        {
            get => _details ?? (_details = new InputList<string>());
            set => _details = value;
        }

        /// <summary>
        /// Message that is to be passed to audience that is generally used to provide a content information about the alert.
        /// </summary>
        [Input("message", required: true)]
        public Input<string> Message { get; set; } = null!;

        /// <summary>
        /// Priority level of the alert. Possible values are P1, P2, P3, P4 and P5
        /// </summary>
        [Input("priority", required: true)]
        public Input<string> Priority { get; set; } = null!;

        [Input("stakeholderProperties", required: true)]
        private InputList<Inputs.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs>? _stakeholderProperties;

        /// <summary>
        /// DEtails about stakeholders for this rule. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs> StakeholderProperties
        {
            get => _stakeholderProperties ?? (_stakeholderProperties = new InputList<Inputs.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs>());
            set => _stakeholderProperties = value;
        }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags of the alert.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public ServiceIncidentRuleIncidentRuleIncidentPropertyArgs()
        {
        }
    }
}
