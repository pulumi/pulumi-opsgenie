// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;

namespace Pulumi.Opsgenie
{
    public static class Config
    {
        private static readonly Pulumi.Config __config = new Pulumi.Config("opsgenie");
        public static string? ApiKey { get; set; } = __config.Get("apiKey") ?? Utilities.GetEnv("OPSGENIE_API_KEY");

        public static string? ApiUrl { get; set; } = __config.Get("apiUrl") ?? Utilities.GetEnv("OPSGENIE_API_URL");

    }
}