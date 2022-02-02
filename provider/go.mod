module github.com/pulumi/pulumi-opsgenie/provider

go 1.16

replace github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0 // indirect
	github.com/opsgenie/terraform-provider-opsgenie v0.6.8
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.18.0
	github.com/pulumi/pulumi/sdk/v3 v3.23.2
)
