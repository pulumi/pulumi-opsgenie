// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a Team Routing Rule within Opsgenie.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		testSchedule, err := opsgenie.NewSchedule(ctx, "testSchedule", &opsgenie.ScheduleArgs{
// 			Description: pulumi.String("schedule test"),
// 			Enabled:     pulumi.Bool(false),
// 			Timezone:    pulumi.String("Europe/Rome"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		testTeam, err := opsgenie.NewTeam(ctx, "testTeam", &opsgenie.TeamArgs{
// 			Description: pulumi.String("This team deals with all the things"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = opsgenie.NewTeamRoutingRule(ctx, "testTeamRoutingRule", &opsgenie.TeamRoutingRuleArgs{
// 			Criterias: opsgenie.TeamRoutingRuleCriteriaArray{
// 				&opsgenie.TeamRoutingRuleCriteriaArgs{
// 					Conditions: opsgenie.TeamRoutingRuleCriteriaConditionArray{
// 						&opsgenie.TeamRoutingRuleCriteriaConditionArgs{
// 							ExpectedValue: pulumi.String("expected1"),
// 							Field:         pulumi.String("message"),
// 							Not:           pulumi.Bool(false),
// 							Operation:     pulumi.String("contains"),
// 						},
// 					},
// 					Type: pulumi.String("match-any-condition"),
// 				},
// 			},
// 			Notifies: opsgenie.TeamRoutingRuleNotifyArray{
// 				&opsgenie.TeamRoutingRuleNotifyArgs{
// 					Name: testSchedule.Name,
// 					Type: pulumi.String("schedule"),
// 				},
// 			},
// 			Order:  pulumi.Int(0),
// 			TeamId: testTeam.ID(),
// 			TimeRestrictions: opsgenie.TeamRoutingRuleTimeRestrictionArray{
// 				&opsgenie.TeamRoutingRuleTimeRestrictionArgs{
// 					Restrictions: opsgenie.TeamRoutingRuleTimeRestrictionRestrictionArray{
// 						&opsgenie.TeamRoutingRuleTimeRestrictionRestrictionArgs{
// 							EndDay:    pulumi.String("tuesday"),
// 							EndHour:   pulumi.Int(18),
// 							EndMin:    pulumi.Int(30),
// 							StartDay:  pulumi.String("monday"),
// 							StartHour: pulumi.Int(8),
// 							StartMin:  pulumi.Int(0),
// 						},
// 					},
// 					Type: pulumi.String("weekday-and-time-of-day"),
// 				},
// 			},
// 			Timezone: pulumi.String("America/Los_Angeles"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Team Routing Rules can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/teamRoutingRule:TeamRoutingRule ruletest teamId/routingRuleId`
// ```
//
//  For this example- Team Id = `c827c472-31f2-497b-9ec6-8ec855d7d94c`
//
// - Routing Rule Id = `2d1a78d0-c13e-47d3-af0a-8b6d0cc2b7b1`
//
// ```sh
//  $ pulumi import opsgenie:index/teamRoutingRule:TeamRoutingRule ruletest c827c472-31f2-497b-9ec6-8ec855d7d94c/2d1a78d0-c13e-47d3-af0a-8b6d0cc2b7b1`
// ```
type TeamRoutingRule struct {
	pulumi.CustomResourceState

	// You can refer Criteria for detailed information about criteria and its fields
	Criterias TeamRoutingRuleCriteriaArrayOutput `pulumi:"criterias"`
	// Name of the team routing rule
	Name pulumi.StringOutput `pulumi:"name"`
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values for notify type : schedule, escalation, none
	Notifies TeamRoutingRuleNotifyArrayOutput `pulumi:"notifies"`
	// The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
	Order pulumi.IntPtrOutput `pulumi:"order"`
	// Id of the team owning the routing rule
	TeamId           pulumi.StringOutput                       `pulumi:"teamId"`
	TimeRestrictions TeamRoutingRuleTimeRestrictionArrayOutput `pulumi:"timeRestrictions"`
	// Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
	Timezone pulumi.StringPtrOutput `pulumi:"timezone"`
}

// NewTeamRoutingRule registers a new resource with the given unique name, arguments, and options.
func NewTeamRoutingRule(ctx *pulumi.Context,
	name string, args *TeamRoutingRuleArgs, opts ...pulumi.ResourceOption) (*TeamRoutingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Notifies == nil {
		return nil, errors.New("invalid value for required argument 'Notifies'")
	}
	if args.TeamId == nil {
		return nil, errors.New("invalid value for required argument 'TeamId'")
	}
	var resource TeamRoutingRule
	err := ctx.RegisterResource("opsgenie:index/teamRoutingRule:TeamRoutingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeamRoutingRule gets an existing TeamRoutingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeamRoutingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamRoutingRuleState, opts ...pulumi.ResourceOption) (*TeamRoutingRule, error) {
	var resource TeamRoutingRule
	err := ctx.ReadResource("opsgenie:index/teamRoutingRule:TeamRoutingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TeamRoutingRule resources.
type teamRoutingRuleState struct {
	// You can refer Criteria for detailed information about criteria and its fields
	Criterias []TeamRoutingRuleCriteria `pulumi:"criterias"`
	// Name of the team routing rule
	Name *string `pulumi:"name"`
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values for notify type : schedule, escalation, none
	Notifies []TeamRoutingRuleNotify `pulumi:"notifies"`
	// The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
	Order *int `pulumi:"order"`
	// Id of the team owning the routing rule
	TeamId           *string                          `pulumi:"teamId"`
	TimeRestrictions []TeamRoutingRuleTimeRestriction `pulumi:"timeRestrictions"`
	// Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
	Timezone *string `pulumi:"timezone"`
}

type TeamRoutingRuleState struct {
	// You can refer Criteria for detailed information about criteria and its fields
	Criterias TeamRoutingRuleCriteriaArrayInput
	// Name of the team routing rule
	Name pulumi.StringPtrInput
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values for notify type : schedule, escalation, none
	Notifies TeamRoutingRuleNotifyArrayInput
	// The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
	Order pulumi.IntPtrInput
	// Id of the team owning the routing rule
	TeamId           pulumi.StringPtrInput
	TimeRestrictions TeamRoutingRuleTimeRestrictionArrayInput
	// Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
	Timezone pulumi.StringPtrInput
}

func (TeamRoutingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamRoutingRuleState)(nil)).Elem()
}

type teamRoutingRuleArgs struct {
	// You can refer Criteria for detailed information about criteria and its fields
	Criterias []TeamRoutingRuleCriteria `pulumi:"criterias"`
	// Name of the team routing rule
	Name *string `pulumi:"name"`
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values for notify type : schedule, escalation, none
	Notifies []TeamRoutingRuleNotify `pulumi:"notifies"`
	// The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
	Order *int `pulumi:"order"`
	// Id of the team owning the routing rule
	TeamId           string                           `pulumi:"teamId"`
	TimeRestrictions []TeamRoutingRuleTimeRestriction `pulumi:"timeRestrictions"`
	// Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
	Timezone *string `pulumi:"timezone"`
}

// The set of arguments for constructing a TeamRoutingRule resource.
type TeamRoutingRuleArgs struct {
	// You can refer Criteria for detailed information about criteria and its fields
	Criterias TeamRoutingRuleCriteriaArrayInput
	// Name of the team routing rule
	Name pulumi.StringPtrInput
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values for notify type : schedule, escalation, none
	Notifies TeamRoutingRuleNotifyArrayInput
	// The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
	Order pulumi.IntPtrInput
	// Id of the team owning the routing rule
	TeamId           pulumi.StringInput
	TimeRestrictions TeamRoutingRuleTimeRestrictionArrayInput
	// Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
	Timezone pulumi.StringPtrInput
}

func (TeamRoutingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamRoutingRuleArgs)(nil)).Elem()
}

type TeamRoutingRuleInput interface {
	pulumi.Input

	ToTeamRoutingRuleOutput() TeamRoutingRuleOutput
	ToTeamRoutingRuleOutputWithContext(ctx context.Context) TeamRoutingRuleOutput
}

func (TeamRoutingRule) ElementType() reflect.Type {
	return reflect.TypeOf((*TeamRoutingRule)(nil)).Elem()
}

func (i TeamRoutingRule) ToTeamRoutingRuleOutput() TeamRoutingRuleOutput {
	return i.ToTeamRoutingRuleOutputWithContext(context.Background())
}

func (i TeamRoutingRule) ToTeamRoutingRuleOutputWithContext(ctx context.Context) TeamRoutingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamRoutingRuleOutput)
}

type TeamRoutingRuleOutput struct {
	*pulumi.OutputState
}

func (TeamRoutingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*TeamRoutingRuleOutput)(nil)).Elem()
}

func (o TeamRoutingRuleOutput) ToTeamRoutingRuleOutput() TeamRoutingRuleOutput {
	return o
}

func (o TeamRoutingRuleOutput) ToTeamRoutingRuleOutputWithContext(ctx context.Context) TeamRoutingRuleOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(TeamRoutingRuleOutput{})
}
