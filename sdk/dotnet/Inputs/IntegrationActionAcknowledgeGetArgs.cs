// *** WARNING: this file was generated by pulumi-language-dotnet. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Opsgenie.Inputs
{

    public sealed class IntegrationActionAcknowledgeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An identifier that is used for alert deduplication. Default: `{{alias}}`.
        /// </summary>
        [Input("alias")]
        public Input<string>? Alias { get; set; }

        [Input("filters")]
        private InputList<Inputs.IntegrationActionAcknowledgeFilterGetArgs>? _filters;

        /// <summary>
        /// Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
        /// * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
        /// * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
        /// * For Email integration: `from_address`, `from_name`, `conversationSubject`, `subject`
        /// </summary>
        public InputList<Inputs.IntegrationActionAcknowledgeFilterGetArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.IntegrationActionAcknowledgeFilterGetArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// Name of the integration action.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// Additional alert action note.
        /// </summary>
        [Input("note")]
        public Input<string>? Note { get; set; }

        /// <summary>
        /// Integer value that defines in which order the action will be performed. Default: `1`.
        /// </summary>
        [Input("order")]
        public Input<int>? Order { get; set; }

        /// <summary>
        /// The responder type - can be `escalation`, `team` or `user`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Owner of the execution for integration action.
        /// </summary>
        [Input("user")]
        public Input<string>? User { get; set; }

        public IntegrationActionAcknowledgeGetArgs()
        {
        }
        public static new IntegrationActionAcknowledgeGetArgs Empty => new IntegrationActionAcknowledgeGetArgs();
    }
}
