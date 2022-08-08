// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
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
// 			Criterias: TeamRoutingRuleCriteriaArray{
// 				&TeamRoutingRuleCriteriaArgs{
// 					Conditions: TeamRoutingRuleCriteriaConditionArray{
// 						&TeamRoutingRuleCriteriaConditionArgs{
// 							ExpectedValue: pulumi.String("expected1"),
// 							Field:         pulumi.String("message"),
// 							Not:           pulumi.Bool(false),
// 							Operation:     pulumi.String("contains"),
// 						},
// 					},
// 					Type: pulumi.String("match-any-condition"),
// 				},
// 			},
// 			Notifies: TeamRoutingRuleNotifyArray{
// 				&TeamRoutingRuleNotifyArgs{
// 					Name: testSchedule.Name,
// 					Type: pulumi.String("schedule"),
// 				},
// 			},
// 			Order:  pulumi.Int(0),
// 			TeamId: testTeam.ID(),
// 			TimeRestrictions: TeamRoutingRuleTimeRestrictionArray{
// 				&TeamRoutingRuleTimeRestrictionArgs{
// 					RestrictionList: TeamRoutingRuleTimeRestrictionRestrictionListArray{
// 						&TeamRoutingRuleTimeRestrictionRestrictionListArgs{
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
// Team Routing Rules can be imported using the `team_id/routing_rule_id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/teamRoutingRule:TeamRoutingRule ruletest team_id/routing_rule_id`
// ```
type TeamRoutingRule struct {
	pulumi.CustomResourceState

	// You can refer Criteria for detailed information about criteria and its fields
	Criterias TeamRoutingRuleCriteriaArrayOutput `pulumi:"criterias"`
	// Only use when importing default routing rule
	IsDefault pulumi.BoolPtrOutput `pulumi:"isDefault"`
	// Name of the team routing rule
	Name pulumi.StringOutput `pulumi:"name"`
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
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
	// Only use when importing default routing rule
	IsDefault *bool `pulumi:"isDefault"`
	// Name of the team routing rule
	Name *string `pulumi:"name"`
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
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
	// Only use when importing default routing rule
	IsDefault pulumi.BoolPtrInput
	// Name of the team routing rule
	Name pulumi.StringPtrInput
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
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
	// Only use when importing default routing rule
	IsDefault *bool `pulumi:"isDefault"`
	// Name of the team routing rule
	Name *string `pulumi:"name"`
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
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
	// Only use when importing default routing rule
	IsDefault pulumi.BoolPtrInput
	// Name of the team routing rule
	Name pulumi.StringPtrInput
	// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
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

func (*TeamRoutingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamRoutingRule)(nil)).Elem()
}

func (i *TeamRoutingRule) ToTeamRoutingRuleOutput() TeamRoutingRuleOutput {
	return i.ToTeamRoutingRuleOutputWithContext(context.Background())
}

func (i *TeamRoutingRule) ToTeamRoutingRuleOutputWithContext(ctx context.Context) TeamRoutingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamRoutingRuleOutput)
}

// TeamRoutingRuleArrayInput is an input type that accepts TeamRoutingRuleArray and TeamRoutingRuleArrayOutput values.
// You can construct a concrete instance of `TeamRoutingRuleArrayInput` via:
//
//          TeamRoutingRuleArray{ TeamRoutingRuleArgs{...} }
type TeamRoutingRuleArrayInput interface {
	pulumi.Input

	ToTeamRoutingRuleArrayOutput() TeamRoutingRuleArrayOutput
	ToTeamRoutingRuleArrayOutputWithContext(context.Context) TeamRoutingRuleArrayOutput
}

type TeamRoutingRuleArray []TeamRoutingRuleInput

func (TeamRoutingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamRoutingRule)(nil)).Elem()
}

func (i TeamRoutingRuleArray) ToTeamRoutingRuleArrayOutput() TeamRoutingRuleArrayOutput {
	return i.ToTeamRoutingRuleArrayOutputWithContext(context.Background())
}

func (i TeamRoutingRuleArray) ToTeamRoutingRuleArrayOutputWithContext(ctx context.Context) TeamRoutingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamRoutingRuleArrayOutput)
}

// TeamRoutingRuleMapInput is an input type that accepts TeamRoutingRuleMap and TeamRoutingRuleMapOutput values.
// You can construct a concrete instance of `TeamRoutingRuleMapInput` via:
//
//          TeamRoutingRuleMap{ "key": TeamRoutingRuleArgs{...} }
type TeamRoutingRuleMapInput interface {
	pulumi.Input

	ToTeamRoutingRuleMapOutput() TeamRoutingRuleMapOutput
	ToTeamRoutingRuleMapOutputWithContext(context.Context) TeamRoutingRuleMapOutput
}

type TeamRoutingRuleMap map[string]TeamRoutingRuleInput

func (TeamRoutingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamRoutingRule)(nil)).Elem()
}

func (i TeamRoutingRuleMap) ToTeamRoutingRuleMapOutput() TeamRoutingRuleMapOutput {
	return i.ToTeamRoutingRuleMapOutputWithContext(context.Background())
}

func (i TeamRoutingRuleMap) ToTeamRoutingRuleMapOutputWithContext(ctx context.Context) TeamRoutingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamRoutingRuleMapOutput)
}

type TeamRoutingRuleOutput struct{ *pulumi.OutputState }

func (TeamRoutingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TeamRoutingRule)(nil)).Elem()
}

func (o TeamRoutingRuleOutput) ToTeamRoutingRuleOutput() TeamRoutingRuleOutput {
	return o
}

func (o TeamRoutingRuleOutput) ToTeamRoutingRuleOutputWithContext(ctx context.Context) TeamRoutingRuleOutput {
	return o
}

// You can refer Criteria for detailed information about criteria and its fields
func (o TeamRoutingRuleOutput) Criterias() TeamRoutingRuleCriteriaArrayOutput {
	return o.ApplyT(func(v *TeamRoutingRule) TeamRoutingRuleCriteriaArrayOutput { return v.Criterias }).(TeamRoutingRuleCriteriaArrayOutput)
}

// Only use when importing default routing rule
func (o TeamRoutingRuleOutput) IsDefault() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TeamRoutingRule) pulumi.BoolPtrOutput { return v.IsDefault }).(pulumi.BoolPtrOutput)
}

// Name of the team routing rule
func (o TeamRoutingRuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamRoutingRule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
func (o TeamRoutingRuleOutput) Notifies() TeamRoutingRuleNotifyArrayOutput {
	return o.ApplyT(func(v *TeamRoutingRule) TeamRoutingRuleNotifyArrayOutput { return v.Notifies }).(TeamRoutingRuleNotifyArrayOutput)
}

// The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
func (o TeamRoutingRuleOutput) Order() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *TeamRoutingRule) pulumi.IntPtrOutput { return v.Order }).(pulumi.IntPtrOutput)
}

// Id of the team owning the routing rule
func (o TeamRoutingRuleOutput) TeamId() pulumi.StringOutput {
	return o.ApplyT(func(v *TeamRoutingRule) pulumi.StringOutput { return v.TeamId }).(pulumi.StringOutput)
}

func (o TeamRoutingRuleOutput) TimeRestrictions() TeamRoutingRuleTimeRestrictionArrayOutput {
	return o.ApplyT(func(v *TeamRoutingRule) TeamRoutingRuleTimeRestrictionArrayOutput { return v.TimeRestrictions }).(TeamRoutingRuleTimeRestrictionArrayOutput)
}

// Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
func (o TeamRoutingRuleOutput) Timezone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TeamRoutingRule) pulumi.StringPtrOutput { return v.Timezone }).(pulumi.StringPtrOutput)
}

type TeamRoutingRuleArrayOutput struct{ *pulumi.OutputState }

func (TeamRoutingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TeamRoutingRule)(nil)).Elem()
}

func (o TeamRoutingRuleArrayOutput) ToTeamRoutingRuleArrayOutput() TeamRoutingRuleArrayOutput {
	return o
}

func (o TeamRoutingRuleArrayOutput) ToTeamRoutingRuleArrayOutputWithContext(ctx context.Context) TeamRoutingRuleArrayOutput {
	return o
}

func (o TeamRoutingRuleArrayOutput) Index(i pulumi.IntInput) TeamRoutingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TeamRoutingRule {
		return vs[0].([]*TeamRoutingRule)[vs[1].(int)]
	}).(TeamRoutingRuleOutput)
}

type TeamRoutingRuleMapOutput struct{ *pulumi.OutputState }

func (TeamRoutingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TeamRoutingRule)(nil)).Elem()
}

func (o TeamRoutingRuleMapOutput) ToTeamRoutingRuleMapOutput() TeamRoutingRuleMapOutput {
	return o
}

func (o TeamRoutingRuleMapOutput) ToTeamRoutingRuleMapOutputWithContext(ctx context.Context) TeamRoutingRuleMapOutput {
	return o
}

func (o TeamRoutingRuleMapOutput) MapIndex(k pulumi.StringInput) TeamRoutingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TeamRoutingRule {
		return vs[0].(map[string]*TeamRoutingRule)[vs[1].(string)]
	}).(TeamRoutingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamRoutingRuleInput)(nil)).Elem(), &TeamRoutingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamRoutingRuleArrayInput)(nil)).Elem(), TeamRoutingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamRoutingRuleMapInput)(nil)).Elem(), TeamRoutingRuleMap{})
	pulumi.RegisterOutputType(TeamRoutingRuleOutput{})
	pulumi.RegisterOutputType(TeamRoutingRuleArrayOutput{})
	pulumi.RegisterOutputType(TeamRoutingRuleMapOutput{})
}
