// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package opsgenie

import (
	"unicode"

	"github.com/hashicorp/terraform-plugin-sdk/helper/schema"
	"github.com/opsgenie/terraform-provider-opsgenie/opsgenie"
	"github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim"
	shimv1 "github.com/pulumi/pulumi-terraform-bridge/v2/pkg/tfshim/sdk-v1"
	"github.com/pulumi/pulumi/sdk/v2/go/common/resource"
	"github.com/pulumi/pulumi/sdk/v2/go/common/tokens"
)

// all of the token components used below.
const (
	// packages:
	mainPkg = "opsgenie"
	// modules:
	mainMod = "index"
)

// makeMember manufactures a type token for the package and the given module and type.
func makeMember(mod string, mem string) tokens.ModuleMember {
	return tokens.ModuleMember(mainPkg + ":" + mod + ":" + mem)
}

// makeType manufactures a type token for the package and the given module and type.
func makeType(mod string, typ string) tokens.Type {
	return tokens.Type(makeMember(mod, typ))
}

// makeDataSource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the data source's
// first character.
func makeDataSource(mod string, res string) tokens.ModuleMember {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeMember(mod+"/"+fn, res)
}

// makeResource manufactures a standard resource token given a module and resource name.  It
// automatically uses the main package and names the file by simply lower casing the resource's
// first character.
func makeResource(mod string, res string) tokens.Type {
	fn := string(unicode.ToLower(rune(res[0]))) + res[1:]
	return makeType(mod+"/"+fn, res)
}

// boolRef returns a reference to the bool argument.
func boolRef(b bool) *bool {
	return &b
}

// stringValue gets a string value from a property map if present, else ""
func stringValue(vars resource.PropertyMap, prop resource.PropertyKey) string {
	val, ok := vars[prop]
	if ok && val.IsString() {
		return val.StringValue()
	}
	return ""
}

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// managedByPulumi is a default used for some managed resources, in the absence of something more meaningful.
var managedByPulumi = &tfbridge.DefaultInfo{Value: "Managed by Pulumi"}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv1.NewProvider(opsgenie.Provider().(*schema.Provider))

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:           p,
		Name:        "opsgenie",
		Description: "A Pulumi package for creating and managing opsgenie cloud resources.",
		Keywords:    []string{"pulumi", "opsgenie"},
		License:     "Apache-2.0",
		Homepage:    "https://pulumi.io",
		Repository:  "https://github.com/pulumi/pulumi-opsgenie",
		GitHubOrg:   "opsgenie",
		Config: map[string]*tfbridge.SchemaInfo{
			"api_key": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"OPSGENIE_API_KEY"},
				},
			},
			"api_url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"OPSGENIE_API_URL"},
				},
			},
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			"opsgenie_custom_role": {
				Tok: makeResource(mainMod, "CustomRole"),
			},
			"opsgenie_team": {
				Tok: makeResource(mainMod, "Team"),
			},
			"opsgenie_team_routing_rule": {
				Tok: makeResource(mainMod, "TeamRoutingRule"),
			},
			"opsgenie_user": {
				Tok: makeResource(mainMod, "User"),
				Docs: &tfbridge.DocInfo{
					Source: "user.html.markdown",
				},
			},
			"opsgenie_user_contact": {
				Tok: makeResource(mainMod, "UserContact"),
			},
			"opsgenie_notification_policy": {
				Tok: makeResource(mainMod, "NotificationPolicy"),
			},
			"opsgenie_notification_rule": {
				Tok: makeResource(mainMod, "NotificationRule"),
			},
			"opsgenie_escalation": {
				Tok: makeResource(mainMod, "Escalation"),
			},
			"opsgenie_api_integration": {
				Tok: makeResource(mainMod, "ApiIntegration"),
			},
			"opsgenie_email_integration": {
				Tok: makeResource(mainMod, "EmailIntegration"),
			},
			"opsgenie_integration_action": {
				Tok: makeResource(mainMod, "IntegrationAction"),
			},
			"opsgenie_service": {
				Tok: makeResource(mainMod, "Service"),
			},
			"opsgenie_schedule": {
				Tok: makeResource(mainMod, "Schedule"),
			},
			"opsgenie_schedule_rotation": {
				Tok: makeResource(mainMod, "ScheduleRotation"),
			},
			"opsgenie_maintenance": {
				Tok: makeResource(mainMod, "Maintenance"),
			},
			"opsgenie_heartbeat": {
				Tok: makeResource(mainMod, "Heartbeat"),
			},
			"opsgenie_alert_policy": {
				Tok: makeResource(mainMod, "AlertPolicy"),
			},
			"opsgenie_service_incident_rule": {
				Tok: makeResource(mainMod, "ServiceIncidentRule"),
			},
			"opsgenie_incident_template": {
				Tok: makeResource(mainMod, "IncidentTemplate"),
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"opsgenie_team":       {Tok: makeDataSource(mainMod, "getTeam")},
			"opsgenie_user":       {Tok: makeDataSource(mainMod, "getUser")},
			"opsgenie_escalation": {Tok: makeDataSource(mainMod, "getEscalation")},
			"opsgenie_schedule":   {Tok: makeDataSource(mainMod, "getSchedule")},
			"opsgenie_heartbeat":  {Tok: makeDataSource(mainMod, "getHeartbeat")},
			"opsgenie_service":    {Tok: makeDataSource(mainMod, "getService")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^2.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^8.0.25", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			PackageName: "@pulumi/opsgenie",
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=2.9.0,<3.0.0",
			},
			UsesIOClasses: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi":                       "2.*",
				"System.Collections.Immutable": "1.6.0",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
