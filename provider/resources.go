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
	"fmt"
	"path/filepath"
	"unicode"

	"github.com/opsgenie/terraform-provider-opsgenie/opsgenie"
	"github.com/pulumi/pulumi-opsgenie/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/tokens"
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

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(opsgenie.Provider())

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
			"api_url": {
				Default: &tfbridge.DefaultInfo{
					EnvVars: []string{"OPSGENIE_API_URL"},
				},
			},
		},
		Resources: map[string]*tfbridge.ResourceInfo{
			"opsgenie_custom_role": {
				Tok: makeResource(mainMod, "CustomRole"),
			},
			"opsgenie_team": {
				Tok: makeResource(mainMod, "Team"),
			},
			"opsgenie_team_routing_rule": {
				Tok: makeResource(mainMod, "TeamRoutingRule"),
				Fields: map[string]*tfbridge.SchemaInfo{
					"time_restriction": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								// Similar to ScheduleRotation below, we have both a `restrictions` and a `restriction`
								// parameter so we need to explicitly declare both here to avoid overwriting one field
								// with the other.
								"restriction":  {Name: "restriction"},
								"restrictions": {Name: "restrictions"},
							},
						},
					},
				},
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
				Fields: map[string]*tfbridge.SchemaInfo{
					"time_restriction": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								// Again, we have both a `restrictions` and a `restriction` parameter so we need
								// to explicitly declare both here to avoid overwriting one field with the other.
								"restriction":  {Name: "restriction"},
								"restrictions": {Name: "restrictions"},
							},
						},
					},
				},
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
				Fields: map[string]*tfbridge.SchemaInfo{
					"time_restriction": {
						Elem: &tfbridge.SchemaInfo{
							Fields: map[string]*tfbridge.SchemaInfo{
								// there is both a restriction and restrictions parameters so we want to stop
								// the bridge automatically pluralising the values to prevent any issues
								"restriction":  {Name: "restriction"},
								"restrictions": {Name: "restrictions"},
							},
						},
					},
				},
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
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/pulumi/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
