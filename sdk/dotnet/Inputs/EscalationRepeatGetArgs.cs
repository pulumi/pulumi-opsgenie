// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class EscalationRepeatGetArgs : Pulumi.ResourceArgs
    {
        [Input("closeAlertAfterAll")]
        public Input<bool>? CloseAlertAfterAll { get; set; }

        [Input("count")]
        public Input<int>? Count { get; set; }

        [Input("resetRecipientStates")]
        public Input<bool>? ResetRecipientStates { get; set; }

        [Input("waitInterval")]
        public Input<int>? WaitInterval { get; set; }

        public EscalationRepeatGetArgs()
        {
        }
    }
}
