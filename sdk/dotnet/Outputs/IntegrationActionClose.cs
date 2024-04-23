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
    public sealed class IntegrationActionClose
    {
        /// <summary>
        /// An identifier that is used for alert deduplication. Default: `{{alias}}`.
        /// </summary>
        public readonly string? Alias;
        /// <summary>
        /// Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
        /// * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
        /// * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
        /// * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
        /// </summary>
        public readonly ImmutableArray<Outputs.IntegrationActionCloseFilter> Filters;
        /// <summary>
        /// Name of the integration action.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Additional alert action note.
        /// </summary>
        public readonly string? Note;
        /// <summary>
        /// Integer value that defines in which order the action will be performed. Default: `1`.
        /// </summary>
        public readonly int? Order;
        public readonly string? Type;
        /// <summary>
        /// Owner of the execution for integration action.
        /// </summary>
        public readonly string? User;

        [OutputConstructor]
        private IntegrationActionClose(
            string? alias,

            ImmutableArray<Outputs.IntegrationActionCloseFilter> filters,

            string name,

            string? note,

            int? order,

            string? type,

            string? user)
        {
            Alias = alias;
            Filters = filters;
            Name = name;
            Note = note;
            Order = order;
            Type = type;
            User = user;
        }
    }
}
