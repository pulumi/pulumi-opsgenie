module github.com/pulumi/pulumi-opsgenie/provider

go 1.15

replace (
	github.com/Azure/go-autorest => github.com/Azure/go-autorest v12.4.3+incompatible
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20201218231525-9cca98608a5e
)

require (
	github.com/hashicorp/terraform-plugin-sdk v1.15.0 // indirect
	github.com/opsgenie/terraform-provider-opsgenie v0.6.3
	github.com/pulumi/pulumi-terraform-bridge/v2 v2.19.0
	github.com/pulumi/pulumi/sdk/v2 v2.20.1-0.20210212181059-f4b0fa86fedc
)
