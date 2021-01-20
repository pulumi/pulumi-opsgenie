module github.com/pulumi/pulumi-opsgenie/provider

go 1.15

replace github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0
	github.com/opsgenie/terraform-provider-opsgenie v0.5.7
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.17.0
	github.com/pulumi/pulumi/sdk/v2 v2.15.1-0.20201202214525-260620430c4c
	github.com/satori/go.uuid v1.2.0 // indirect
)