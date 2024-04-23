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
    public sealed class MaintenanceTime
    {
        public readonly string? EndDate;
        public readonly string? StartDate;
        public readonly string Type;

        [OutputConstructor]
        private MaintenanceTime(
            string? endDate,

            string? startDate,

            string type)
        {
            EndDate = endDate;
            StartDate = startDate;
            Type = type;
        }
    }
}
