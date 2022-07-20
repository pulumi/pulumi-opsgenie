// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Alert Policy within Opsgenie.
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
// 		testTeam, err := opsgenie.NewTeam(ctx, "testTeam", &opsgenie.TeamArgs{
// 			Description: pulumi.String("This team deals with all the things"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = opsgenie.NewAlertPolicy(ctx, "testAlertPolicy", &opsgenie.AlertPolicyArgs{
// 			TeamId:            testTeam.ID(),
// 			PolicyDescription: pulumi.String("This is sample policy"),
// 			Message:           pulumi.String("{{message}}"),
// 			Filters: AlertPolicyFilterArray{
// 				nil,
// 			},
// 			TimeRestrictions: AlertPolicyTimeRestrictionArray{
// 				&AlertPolicyTimeRestrictionArgs{
// 					Type: pulumi.String("weekday-and-time-of-day"),
// 					RestrictionList: AlertPolicyTimeRestrictionRestrictionListArray{
// 						&AlertPolicyTimeRestrictionRestrictionListArgs{
// 							EndDay:    pulumi.String("monday"),
// 							EndHour:   pulumi.Int(7),
// 							EndMin:    pulumi.Int(0),
// 							StartDay:  pulumi.String("sunday"),
// 							StartHour: pulumi.Int(21),
// 							StartMin:  pulumi.Int(0),
// 						},
// 						&AlertPolicyTimeRestrictionRestrictionListArgs{
// 							EndDay:    pulumi.String("tuesday"),
// 							EndHour:   pulumi.Int(7),
// 							EndMin:    pulumi.Int(0),
// 							StartDay:  pulumi.String("monday"),
// 							StartHour: pulumi.Int(22),
// 							StartMin:  pulumi.Int(0),
// 						},
// 					},
// 				},
// 			},
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
// Alert policies can be imported using the `team_id/policy_id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/alertPolicy:AlertPolicy test team_id/policy_id`
// ```
//
//  You can import global polices using only policy identifier
//
// ```sh
//  $ pulumi import opsgenie:index/alertPolicy:AlertPolicy test policy_id`
// ```
type AlertPolicy struct {
	pulumi.CustomResourceState

	// Actions to add to the alerts original actions value as a list of strings. If `ignoreOriginalActions` field is set to `true`, this will replace the original actions.
	Actions pulumi.StringArrayOutput `pulumi:"actions"`
	// Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
	AlertDescription pulumi.StringPtrOutput `pulumi:"alertDescription"`
	// Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
	Alias pulumi.StringPtrOutput `pulumi:"alias"`
	// It will trigger other modify policies if set to `true`. Default: `false`
	ContinuePolicy pulumi.BoolPtrOutput `pulumi:"continuePolicy"`
	// If policy should be enabled. Default: `true`
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
	Entity pulumi.StringPtrOutput `pulumi:"entity"`
	// A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters AlertPolicyFilterArrayOutput `pulumi:"filters"`
	// If set to `true`, policy will ignore the original actions of the alert. Default: `false`
	IgnoreOriginalActions pulumi.BoolPtrOutput `pulumi:"ignoreOriginalActions"`
	// If set to `true`, policy will ignore the original details of the alert. Default: `false`
	IgnoreOriginalDetails pulumi.BoolPtrOutput `pulumi:"ignoreOriginalDetails"`
	// If set to `true`, policy will ignore the original responders of the alert. Default: `false`
	IgnoreOriginalResponders pulumi.BoolPtrOutput `pulumi:"ignoreOriginalResponders"`
	// If set to `true`, policy will ignore the original tags of the alert. Default: `false`
	IgnoreOriginalTags pulumi.BoolPtrOutput `pulumi:"ignoreOriginalTags"`
	// Message of the alerts
	Message pulumi.StringOutput `pulumi:"message"`
	// Name of the responder
	Name pulumi.StringOutput `pulumi:"name"`
	// Description of the policy. This can be max 512 characters.
	PolicyDescription pulumi.StringPtrOutput `pulumi:"policyDescription"`
	// Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
	Priority pulumi.StringPtrOutput `pulumi:"priority"`
	// Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`. This is a block, structure is documented below.
	Responders AlertPolicyResponderArrayOutput `pulumi:"responders"`
	// Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
	Source pulumi.StringPtrOutput `pulumi:"source"`
	// Tags to add to the alerts original tags value as a list of strings. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Id of team that this policy belongs to.
	TeamId pulumi.StringPtrOutput `pulumi:"teamId"`
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions AlertPolicyTimeRestrictionArrayOutput `pulumi:"timeRestrictions"`
}

// NewAlertPolicy registers a new resource with the given unique name, arguments, and options.
func NewAlertPolicy(ctx *pulumi.Context,
	name string, args *AlertPolicyArgs, opts ...pulumi.ResourceOption) (*AlertPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Message == nil {
		return nil, errors.New("invalid value for required argument 'Message'")
	}
	var resource AlertPolicy
	err := ctx.RegisterResource("opsgenie:index/alertPolicy:AlertPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertPolicy gets an existing AlertPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertPolicyState, opts ...pulumi.ResourceOption) (*AlertPolicy, error) {
	var resource AlertPolicy
	err := ctx.ReadResource("opsgenie:index/alertPolicy:AlertPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertPolicy resources.
type alertPolicyState struct {
	// Actions to add to the alerts original actions value as a list of strings. If `ignoreOriginalActions` field is set to `true`, this will replace the original actions.
	Actions []string `pulumi:"actions"`
	// Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
	AlertDescription *string `pulumi:"alertDescription"`
	// Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
	Alias *string `pulumi:"alias"`
	// It will trigger other modify policies if set to `true`. Default: `false`
	ContinuePolicy *bool `pulumi:"continuePolicy"`
	// If policy should be enabled. Default: `true`
	Enabled *bool `pulumi:"enabled"`
	// Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
	Entity *string `pulumi:"entity"`
	// A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters []AlertPolicyFilter `pulumi:"filters"`
	// If set to `true`, policy will ignore the original actions of the alert. Default: `false`
	IgnoreOriginalActions *bool `pulumi:"ignoreOriginalActions"`
	// If set to `true`, policy will ignore the original details of the alert. Default: `false`
	IgnoreOriginalDetails *bool `pulumi:"ignoreOriginalDetails"`
	// If set to `true`, policy will ignore the original responders of the alert. Default: `false`
	IgnoreOriginalResponders *bool `pulumi:"ignoreOriginalResponders"`
	// If set to `true`, policy will ignore the original tags of the alert. Default: `false`
	IgnoreOriginalTags *bool `pulumi:"ignoreOriginalTags"`
	// Message of the alerts
	Message *string `pulumi:"message"`
	// Name of the responder
	Name *string `pulumi:"name"`
	// Description of the policy. This can be max 512 characters.
	PolicyDescription *string `pulumi:"policyDescription"`
	// Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
	Priority *string `pulumi:"priority"`
	// Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`. This is a block, structure is documented below.
	Responders []AlertPolicyResponder `pulumi:"responders"`
	// Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
	Source *string `pulumi:"source"`
	// Tags to add to the alerts original tags value as a list of strings. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders.
	Tags []string `pulumi:"tags"`
	// Id of team that this policy belongs to.
	TeamId *string `pulumi:"teamId"`
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions []AlertPolicyTimeRestriction `pulumi:"timeRestrictions"`
}

type AlertPolicyState struct {
	// Actions to add to the alerts original actions value as a list of strings. If `ignoreOriginalActions` field is set to `true`, this will replace the original actions.
	Actions pulumi.StringArrayInput
	// Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
	AlertDescription pulumi.StringPtrInput
	// Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
	Alias pulumi.StringPtrInput
	// It will trigger other modify policies if set to `true`. Default: `false`
	ContinuePolicy pulumi.BoolPtrInput
	// If policy should be enabled. Default: `true`
	Enabled pulumi.BoolPtrInput
	// Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
	Entity pulumi.StringPtrInput
	// A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters AlertPolicyFilterArrayInput
	// If set to `true`, policy will ignore the original actions of the alert. Default: `false`
	IgnoreOriginalActions pulumi.BoolPtrInput
	// If set to `true`, policy will ignore the original details of the alert. Default: `false`
	IgnoreOriginalDetails pulumi.BoolPtrInput
	// If set to `true`, policy will ignore the original responders of the alert. Default: `false`
	IgnoreOriginalResponders pulumi.BoolPtrInput
	// If set to `true`, policy will ignore the original tags of the alert. Default: `false`
	IgnoreOriginalTags pulumi.BoolPtrInput
	// Message of the alerts
	Message pulumi.StringPtrInput
	// Name of the responder
	Name pulumi.StringPtrInput
	// Description of the policy. This can be max 512 characters.
	PolicyDescription pulumi.StringPtrInput
	// Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
	Priority pulumi.StringPtrInput
	// Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`. This is a block, structure is documented below.
	Responders AlertPolicyResponderArrayInput
	// Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
	Source pulumi.StringPtrInput
	// Tags to add to the alerts original tags value as a list of strings. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders.
	Tags pulumi.StringArrayInput
	// Id of team that this policy belongs to.
	TeamId pulumi.StringPtrInput
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions AlertPolicyTimeRestrictionArrayInput
}

func (AlertPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertPolicyState)(nil)).Elem()
}

type alertPolicyArgs struct {
	// Actions to add to the alerts original actions value as a list of strings. If `ignoreOriginalActions` field is set to `true`, this will replace the original actions.
	Actions []string `pulumi:"actions"`
	// Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
	AlertDescription *string `pulumi:"alertDescription"`
	// Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
	Alias *string `pulumi:"alias"`
	// It will trigger other modify policies if set to `true`. Default: `false`
	ContinuePolicy *bool `pulumi:"continuePolicy"`
	// If policy should be enabled. Default: `true`
	Enabled *bool `pulumi:"enabled"`
	// Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
	Entity *string `pulumi:"entity"`
	// A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters []AlertPolicyFilter `pulumi:"filters"`
	// If set to `true`, policy will ignore the original actions of the alert. Default: `false`
	IgnoreOriginalActions *bool `pulumi:"ignoreOriginalActions"`
	// If set to `true`, policy will ignore the original details of the alert. Default: `false`
	IgnoreOriginalDetails *bool `pulumi:"ignoreOriginalDetails"`
	// If set to `true`, policy will ignore the original responders of the alert. Default: `false`
	IgnoreOriginalResponders *bool `pulumi:"ignoreOriginalResponders"`
	// If set to `true`, policy will ignore the original tags of the alert. Default: `false`
	IgnoreOriginalTags *bool `pulumi:"ignoreOriginalTags"`
	// Message of the alerts
	Message string `pulumi:"message"`
	// Name of the responder
	Name *string `pulumi:"name"`
	// Description of the policy. This can be max 512 characters.
	PolicyDescription *string `pulumi:"policyDescription"`
	// Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
	Priority *string `pulumi:"priority"`
	// Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`. This is a block, structure is documented below.
	Responders []AlertPolicyResponder `pulumi:"responders"`
	// Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
	Source *string `pulumi:"source"`
	// Tags to add to the alerts original tags value as a list of strings. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders.
	Tags []string `pulumi:"tags"`
	// Id of team that this policy belongs to.
	TeamId *string `pulumi:"teamId"`
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions []AlertPolicyTimeRestriction `pulumi:"timeRestrictions"`
}

// The set of arguments for constructing a AlertPolicy resource.
type AlertPolicyArgs struct {
	// Actions to add to the alerts original actions value as a list of strings. If `ignoreOriginalActions` field is set to `true`, this will replace the original actions.
	Actions pulumi.StringArrayInput
	// Description of the alert. You can use `{{description}}` to refer to the original alert description. Default: `{{description}}`
	AlertDescription pulumi.StringPtrInput
	// Alias of the alert. You can use `{{alias}}` to refer to the original alias. Default: `{{alias}}`
	Alias pulumi.StringPtrInput
	// It will trigger other modify policies if set to `true`. Default: `false`
	ContinuePolicy pulumi.BoolPtrInput
	// If policy should be enabled. Default: `true`
	Enabled pulumi.BoolPtrInput
	// Entity field of the alert. You can use `{{entity}}` to refer to the original entity. Default: `{{entity}}`
	Entity pulumi.StringPtrInput
	// A alert filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters AlertPolicyFilterArrayInput
	// If set to `true`, policy will ignore the original actions of the alert. Default: `false`
	IgnoreOriginalActions pulumi.BoolPtrInput
	// If set to `true`, policy will ignore the original details of the alert. Default: `false`
	IgnoreOriginalDetails pulumi.BoolPtrInput
	// If set to `true`, policy will ignore the original responders of the alert. Default: `false`
	IgnoreOriginalResponders pulumi.BoolPtrInput
	// If set to `true`, policy will ignore the original tags of the alert. Default: `false`
	IgnoreOriginalTags pulumi.BoolPtrInput
	// Message of the alerts
	Message pulumi.StringInput
	// Name of the responder
	Name pulumi.StringPtrInput
	// Description of the policy. This can be max 512 characters.
	PolicyDescription pulumi.StringPtrInput
	// Priority of the alert. Should be one of `P1`, `P2`, `P3`, `P4`, or `P5`
	Priority pulumi.StringPtrInput
	// Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders. The possible values for responders are: `user`, `team`. This is a block, structure is documented below.
	Responders AlertPolicyResponderArrayInput
	// Source field of the alert. You can use `{{source}}` to refer to the original source. Default: `{{source}}`
	Source pulumi.StringPtrInput
	// Tags to add to the alerts original tags value as a list of strings. If `ignoreOriginalResponders` field is set to `true`, this will replace the original responders.
	Tags pulumi.StringArrayInput
	// Id of team that this policy belongs to.
	TeamId pulumi.StringPtrInput
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions AlertPolicyTimeRestrictionArrayInput
}

func (AlertPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertPolicyArgs)(nil)).Elem()
}

type AlertPolicyInput interface {
	pulumi.Input

	ToAlertPolicyOutput() AlertPolicyOutput
	ToAlertPolicyOutputWithContext(ctx context.Context) AlertPolicyOutput
}

func (*AlertPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertPolicy)(nil)).Elem()
}

func (i *AlertPolicy) ToAlertPolicyOutput() AlertPolicyOutput {
	return i.ToAlertPolicyOutputWithContext(context.Background())
}

func (i *AlertPolicy) ToAlertPolicyOutputWithContext(ctx context.Context) AlertPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyOutput)
}

// AlertPolicyArrayInput is an input type that accepts AlertPolicyArray and AlertPolicyArrayOutput values.
// You can construct a concrete instance of `AlertPolicyArrayInput` via:
//
//          AlertPolicyArray{ AlertPolicyArgs{...} }
type AlertPolicyArrayInput interface {
	pulumi.Input

	ToAlertPolicyArrayOutput() AlertPolicyArrayOutput
	ToAlertPolicyArrayOutputWithContext(context.Context) AlertPolicyArrayOutput
}

type AlertPolicyArray []AlertPolicyInput

func (AlertPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertPolicy)(nil)).Elem()
}

func (i AlertPolicyArray) ToAlertPolicyArrayOutput() AlertPolicyArrayOutput {
	return i.ToAlertPolicyArrayOutputWithContext(context.Background())
}

func (i AlertPolicyArray) ToAlertPolicyArrayOutputWithContext(ctx context.Context) AlertPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyArrayOutput)
}

// AlertPolicyMapInput is an input type that accepts AlertPolicyMap and AlertPolicyMapOutput values.
// You can construct a concrete instance of `AlertPolicyMapInput` via:
//
//          AlertPolicyMap{ "key": AlertPolicyArgs{...} }
type AlertPolicyMapInput interface {
	pulumi.Input

	ToAlertPolicyMapOutput() AlertPolicyMapOutput
	ToAlertPolicyMapOutputWithContext(context.Context) AlertPolicyMapOutput
}

type AlertPolicyMap map[string]AlertPolicyInput

func (AlertPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertPolicy)(nil)).Elem()
}

func (i AlertPolicyMap) ToAlertPolicyMapOutput() AlertPolicyMapOutput {
	return i.ToAlertPolicyMapOutputWithContext(context.Background())
}

func (i AlertPolicyMap) ToAlertPolicyMapOutputWithContext(ctx context.Context) AlertPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyMapOutput)
}

type AlertPolicyOutput struct{ *pulumi.OutputState }

func (AlertPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertPolicy)(nil)).Elem()
}

func (o AlertPolicyOutput) ToAlertPolicyOutput() AlertPolicyOutput {
	return o
}

func (o AlertPolicyOutput) ToAlertPolicyOutputWithContext(ctx context.Context) AlertPolicyOutput {
	return o
}

type AlertPolicyArrayOutput struct{ *pulumi.OutputState }

func (AlertPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertPolicy)(nil)).Elem()
}

func (o AlertPolicyArrayOutput) ToAlertPolicyArrayOutput() AlertPolicyArrayOutput {
	return o
}

func (o AlertPolicyArrayOutput) ToAlertPolicyArrayOutputWithContext(ctx context.Context) AlertPolicyArrayOutput {
	return o
}

func (o AlertPolicyArrayOutput) Index(i pulumi.IntInput) AlertPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlertPolicy {
		return vs[0].([]*AlertPolicy)[vs[1].(int)]
	}).(AlertPolicyOutput)
}

type AlertPolicyMapOutput struct{ *pulumi.OutputState }

func (AlertPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertPolicy)(nil)).Elem()
}

func (o AlertPolicyMapOutput) ToAlertPolicyMapOutput() AlertPolicyMapOutput {
	return o
}

func (o AlertPolicyMapOutput) ToAlertPolicyMapOutputWithContext(ctx context.Context) AlertPolicyMapOutput {
	return o
}

func (o AlertPolicyMapOutput) MapIndex(k pulumi.StringInput) AlertPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlertPolicy {
		return vs[0].(map[string]*AlertPolicy)[vs[1].(string)]
	}).(AlertPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertPolicyInput)(nil)).Elem(), &AlertPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertPolicyArrayInput)(nil)).Elem(), AlertPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertPolicyMapInput)(nil)).Elem(), AlertPolicyMap{})
	pulumi.RegisterOutputType(AlertPolicyOutput{})
	pulumi.RegisterOutputType(AlertPolicyArrayOutput{})
	pulumi.RegisterOutputType(AlertPolicyMapOutput{})
}
