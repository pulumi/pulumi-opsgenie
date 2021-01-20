// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationRuleStepGetArgs : Pulumi.ResourceArgs
    {
        [Input("contacts", required: true)]
        private InputList<Inputs.NotificationRuleStepContactGetArgs>? _contacts;

        /// <summary>
        /// Defines the contact that notification will be sent to. This is a block, structure is documented below.
        /// </summary>
        public InputList<Inputs.NotificationRuleStepContactGetArgs> Contacts
        {
            get => _contacts ?? (_contacts = new InputList<Inputs.NotificationRuleStepContactGetArgs>());
            set => _contacts = value;
        }

        /// <summary>
        /// Defined if this step is enabled. Default: true
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Minute time period notification will be sent after.
        /// </summary>
        [Input("sendAfter")]
        public Input<int>? SendAfter { get; set; }

        public NotificationRuleStepGetArgs()
        {
        }
    }
}