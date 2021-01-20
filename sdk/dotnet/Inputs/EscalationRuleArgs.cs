// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class EscalationRuleArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: if-not-acked and if-not-closed. If not given, if-not-acked is used.
        /// </summary>
        [Input("condition", required: true)]
        public Input<string> Condition { get; set; } = null!;

        /// <summary>
        /// Time delay of the escalation rule. This parameter takes an object that consists timeAmount field that takes time amount in minutes.
        /// </summary>
        [Input("delay", required: true)]
        public Input<int> Delay { get; set; } = null!;

        /// <summary>
        /// Recipient calculation logic for schedules. Possible values are:
        /// ```csharp
        /// using Pulumi;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///     }
        /// 
        /// }
        /// ```
        /// </summary>
        [Input("notifyType", required: true)]
        public Input<string> NotifyType { get; set; } = null!;

        [Input("recipients", required: true)]
        private InputList<Inputs.EscalationRuleRecipientArgs>? _recipients;

        /// <summary>
        /// Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: user, schedule, team.
        /// </summary>
        public InputList<Inputs.EscalationRuleRecipientArgs> Recipients
        {
            get => _recipients ?? (_recipients = new InputList<Inputs.EscalationRuleRecipientArgs>());
            set => _recipients = value;
        }

        public EscalationRuleArgs()
        {
        }
    }
}
