// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
)

func GetApiKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "opsgenie:apiKey")
}
func GetApiUrl(ctx *pulumi.Context) string {
	v, err := config.Try(ctx, "opsgenie:apiUrl")
	if err == nil {
		return v
	}
	return getEnvOrDefault("", nil, "OPSGENIE_API_URL").(string)
}
