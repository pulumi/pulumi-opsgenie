// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class NotificationRuleStepContactGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Contact method. Possible values: `email`, `sms`, `voice`, `mobile`
        /// </summary>
        [Input("method", required: true)]
        public Input<string> Method { get; set; } = null!;

        /// <summary>
        /// Address of a given method (eg. email address for `email`, phone number for `sms`/`voice` or mobile application name for `mobile`)
        /// </summary>
        [Input("to", required: true)]
        public Input<string> To { get; set; } = null!;

        public NotificationRuleStepContactGetArgs()
        {
        }
        public static new NotificationRuleStepContactGetArgs Empty => new NotificationRuleStepContactGetArgs();
    }
}
