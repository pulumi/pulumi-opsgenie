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
    public sealed class IntegrationActionAddNoteFilter
    {
        public readonly ImmutableArray<Outputs.IntegrationActionAddNoteFilterCondition> Conditions;
        public readonly string Type;

        [OutputConstructor]
        private IntegrationActionAddNoteFilter(
            ImmutableArray<Outputs.IntegrationActionAddNoteFilterCondition> conditions,

            string type)
        {
            Conditions = conditions;
            Type = type;
        }
    }
}
