// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Outputs
{

    [OutputType]
    public sealed class EscalationRule
    {
        /// <summary>
        /// The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: `if-not-acked` and `if-not-closed`. Default: `if-not-acked`
        /// </summary>
        public readonly string Condition;
        /// <summary>
        /// Time delay of the escalation rule, in minutes.
        /// </summary>
        public readonly int Delay;
        /// <summary>
        /// Recipient calculation logic for schedules. Possible values are:
        /// </summary>
        public readonly string NotifyType;
        /// <summary>
        /// Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: `user`, `schedule`, `team`. There can only be one recipient per each `rules`.
        /// </summary>
        public readonly ImmutableArray<Outputs.EscalationRuleRecipient> Recipients;

        [OutputConstructor]
        private EscalationRule(
            string condition,

            int delay,

            string notifyType,

            ImmutableArray<Outputs.EscalationRuleRecipient> recipients)
        {
            Condition = condition;
            Delay = delay;
            NotifyType = notifyType;
            Recipients = recipients;
        }
    }
}
