// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Notification Policy within Opsgenie.
//
// ## Import
//
// Notification policies can be imported using the `team_id` and `notification_policy_id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/notificationPolicy:NotificationPolicy test team_id/notification_policy_id`
// ```
type NotificationPolicy struct {
	pulumi.CustomResourceState

	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoCloseActions NotificationPolicyAutoCloseActionArrayOutput `pulumi:"autoCloseActions"`
	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoRestartActions NotificationPolicyAutoRestartActionArrayOutput `pulumi:"autoRestartActions"`
	// Deduplication Action of the policy. This is a block, structure is documented below.
	DeDuplicationActions NotificationPolicyDeDuplicationActionArrayOutput `pulumi:"deDuplicationActions"`
	// Delay notifications. This is a block, structure is documented below.
	DelayActions NotificationPolicyDelayActionArrayOutput `pulumi:"delayActions"`
	// If policy should be enabled. Default: `true`
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters NotificationPolicyFilterArrayOutput `pulumi:"filters"`
	// Name of the notification policy
	Name pulumi.StringOutput `pulumi:"name"`
	// Description of the policy. This can be max 512 characters.
	PolicyDescription pulumi.StringPtrOutput `pulumi:"policyDescription"`
	// Suppress value of the policy. Values are: `true`, `false`. Default: `false`
	Suppress pulumi.BoolPtrOutput `pulumi:"suppress"`
	// Id of team that this policy belons to.
	TeamId pulumi.StringOutput `pulumi:"teamId"`
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions NotificationPolicyTimeRestrictionArrayOutput `pulumi:"timeRestrictions"`
}

// NewNotificationPolicy registers a new resource with the given unique name, arguments, and options.
func NewNotificationPolicy(ctx *pulumi.Context,
	name string, args *NotificationPolicyArgs, opts ...pulumi.ResourceOption) (*NotificationPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Filters == nil {
		return nil, errors.New("invalid value for required argument 'Filters'")
	}
	if args.TeamId == nil {
		return nil, errors.New("invalid value for required argument 'TeamId'")
	}
	var resource NotificationPolicy
	err := ctx.RegisterResource("opsgenie:index/notificationPolicy:NotificationPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNotificationPolicy gets an existing NotificationPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNotificationPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NotificationPolicyState, opts ...pulumi.ResourceOption) (*NotificationPolicy, error) {
	var resource NotificationPolicy
	err := ctx.ReadResource("opsgenie:index/notificationPolicy:NotificationPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NotificationPolicy resources.
type notificationPolicyState struct {
	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoCloseActions []NotificationPolicyAutoCloseAction `pulumi:"autoCloseActions"`
	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoRestartActions []NotificationPolicyAutoRestartAction `pulumi:"autoRestartActions"`
	// Deduplication Action of the policy. This is a block, structure is documented below.
	DeDuplicationActions []NotificationPolicyDeDuplicationAction `pulumi:"deDuplicationActions"`
	// Delay notifications. This is a block, structure is documented below.
	DelayActions []NotificationPolicyDelayAction `pulumi:"delayActions"`
	// If policy should be enabled. Default: `true`
	Enabled *bool `pulumi:"enabled"`
	// A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters []NotificationPolicyFilter `pulumi:"filters"`
	// Name of the notification policy
	Name *string `pulumi:"name"`
	// Description of the policy. This can be max 512 characters.
	PolicyDescription *string `pulumi:"policyDescription"`
	// Suppress value of the policy. Values are: `true`, `false`. Default: `false`
	Suppress *bool `pulumi:"suppress"`
	// Id of team that this policy belons to.
	TeamId *string `pulumi:"teamId"`
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions []NotificationPolicyTimeRestriction `pulumi:"timeRestrictions"`
}

type NotificationPolicyState struct {
	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoCloseActions NotificationPolicyAutoCloseActionArrayInput
	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoRestartActions NotificationPolicyAutoRestartActionArrayInput
	// Deduplication Action of the policy. This is a block, structure is documented below.
	DeDuplicationActions NotificationPolicyDeDuplicationActionArrayInput
	// Delay notifications. This is a block, structure is documented below.
	DelayActions NotificationPolicyDelayActionArrayInput
	// If policy should be enabled. Default: `true`
	Enabled pulumi.BoolPtrInput
	// A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters NotificationPolicyFilterArrayInput
	// Name of the notification policy
	Name pulumi.StringPtrInput
	// Description of the policy. This can be max 512 characters.
	PolicyDescription pulumi.StringPtrInput
	// Suppress value of the policy. Values are: `true`, `false`. Default: `false`
	Suppress pulumi.BoolPtrInput
	// Id of team that this policy belons to.
	TeamId pulumi.StringPtrInput
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions NotificationPolicyTimeRestrictionArrayInput
}

func (NotificationPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationPolicyState)(nil)).Elem()
}

type notificationPolicyArgs struct {
	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoCloseActions []NotificationPolicyAutoCloseAction `pulumi:"autoCloseActions"`
	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoRestartActions []NotificationPolicyAutoRestartAction `pulumi:"autoRestartActions"`
	// Deduplication Action of the policy. This is a block, structure is documented below.
	DeDuplicationActions []NotificationPolicyDeDuplicationAction `pulumi:"deDuplicationActions"`
	// Delay notifications. This is a block, structure is documented below.
	DelayActions []NotificationPolicyDelayAction `pulumi:"delayActions"`
	// If policy should be enabled. Default: `true`
	Enabled *bool `pulumi:"enabled"`
	// A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters []NotificationPolicyFilter `pulumi:"filters"`
	// Name of the notification policy
	Name *string `pulumi:"name"`
	// Description of the policy. This can be max 512 characters.
	PolicyDescription *string `pulumi:"policyDescription"`
	// Suppress value of the policy. Values are: `true`, `false`. Default: `false`
	Suppress *bool `pulumi:"suppress"`
	// Id of team that this policy belons to.
	TeamId string `pulumi:"teamId"`
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions []NotificationPolicyTimeRestriction `pulumi:"timeRestrictions"`
}

// The set of arguments for constructing a NotificationPolicy resource.
type NotificationPolicyArgs struct {
	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoCloseActions NotificationPolicyAutoCloseActionArrayInput
	// Auto Restart Action of the policy. This is a block, structure is documented below.
	AutoRestartActions NotificationPolicyAutoRestartActionArrayInput
	// Deduplication Action of the policy. This is a block, structure is documented below.
	DeDuplicationActions NotificationPolicyDeDuplicationActionArrayInput
	// Delay notifications. This is a block, structure is documented below.
	DelayActions NotificationPolicyDelayActionArrayInput
	// If policy should be enabled. Default: `true`
	Enabled pulumi.BoolPtrInput
	// A notification filter which will be applied. This filter can be empty: `filter {}` - this means `match-all`. This is a block, structure is documented below.
	Filters NotificationPolicyFilterArrayInput
	// Name of the notification policy
	Name pulumi.StringPtrInput
	// Description of the policy. This can be max 512 characters.
	PolicyDescription pulumi.StringPtrInput
	// Suppress value of the policy. Values are: `true`, `false`. Default: `false`
	Suppress pulumi.BoolPtrInput
	// Id of team that this policy belons to.
	TeamId pulumi.StringInput
	// Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
	TimeRestrictions NotificationPolicyTimeRestrictionArrayInput
}

func (NotificationPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*notificationPolicyArgs)(nil)).Elem()
}

type NotificationPolicyInput interface {
	pulumi.Input

	ToNotificationPolicyOutput() NotificationPolicyOutput
	ToNotificationPolicyOutputWithContext(ctx context.Context) NotificationPolicyOutput
}

func (*NotificationPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((*NotificationPolicy)(nil))
}

func (i *NotificationPolicy) ToNotificationPolicyOutput() NotificationPolicyOutput {
	return i.ToNotificationPolicyOutputWithContext(context.Background())
}

func (i *NotificationPolicy) ToNotificationPolicyOutputWithContext(ctx context.Context) NotificationPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyOutput)
}

func (i *NotificationPolicy) ToNotificationPolicyPtrOutput() NotificationPolicyPtrOutput {
	return i.ToNotificationPolicyPtrOutputWithContext(context.Background())
}

func (i *NotificationPolicy) ToNotificationPolicyPtrOutputWithContext(ctx context.Context) NotificationPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyPtrOutput)
}

type NotificationPolicyPtrInput interface {
	pulumi.Input

	ToNotificationPolicyPtrOutput() NotificationPolicyPtrOutput
	ToNotificationPolicyPtrOutputWithContext(ctx context.Context) NotificationPolicyPtrOutput
}

type notificationPolicyPtrType NotificationPolicyArgs

func (*notificationPolicyPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationPolicy)(nil))
}

func (i *notificationPolicyPtrType) ToNotificationPolicyPtrOutput() NotificationPolicyPtrOutput {
	return i.ToNotificationPolicyPtrOutputWithContext(context.Background())
}

func (i *notificationPolicyPtrType) ToNotificationPolicyPtrOutputWithContext(ctx context.Context) NotificationPolicyPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyPtrOutput)
}

// NotificationPolicyArrayInput is an input type that accepts NotificationPolicyArray and NotificationPolicyArrayOutput values.
// You can construct a concrete instance of `NotificationPolicyArrayInput` via:
//
//          NotificationPolicyArray{ NotificationPolicyArgs{...} }
type NotificationPolicyArrayInput interface {
	pulumi.Input

	ToNotificationPolicyArrayOutput() NotificationPolicyArrayOutput
	ToNotificationPolicyArrayOutputWithContext(context.Context) NotificationPolicyArrayOutput
}

type NotificationPolicyArray []NotificationPolicyInput

func (NotificationPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*NotificationPolicy)(nil))
}

func (i NotificationPolicyArray) ToNotificationPolicyArrayOutput() NotificationPolicyArrayOutput {
	return i.ToNotificationPolicyArrayOutputWithContext(context.Background())
}

func (i NotificationPolicyArray) ToNotificationPolicyArrayOutputWithContext(ctx context.Context) NotificationPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyArrayOutput)
}

// NotificationPolicyMapInput is an input type that accepts NotificationPolicyMap and NotificationPolicyMapOutput values.
// You can construct a concrete instance of `NotificationPolicyMapInput` via:
//
//          NotificationPolicyMap{ "key": NotificationPolicyArgs{...} }
type NotificationPolicyMapInput interface {
	pulumi.Input

	ToNotificationPolicyMapOutput() NotificationPolicyMapOutput
	ToNotificationPolicyMapOutputWithContext(context.Context) NotificationPolicyMapOutput
}

type NotificationPolicyMap map[string]NotificationPolicyInput

func (NotificationPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*NotificationPolicy)(nil))
}

func (i NotificationPolicyMap) ToNotificationPolicyMapOutput() NotificationPolicyMapOutput {
	return i.ToNotificationPolicyMapOutputWithContext(context.Background())
}

func (i NotificationPolicyMap) ToNotificationPolicyMapOutputWithContext(ctx context.Context) NotificationPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NotificationPolicyMapOutput)
}

type NotificationPolicyOutput struct {
	*pulumi.OutputState
}

func (NotificationPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*NotificationPolicy)(nil))
}

func (o NotificationPolicyOutput) ToNotificationPolicyOutput() NotificationPolicyOutput {
	return o
}

func (o NotificationPolicyOutput) ToNotificationPolicyOutputWithContext(ctx context.Context) NotificationPolicyOutput {
	return o
}

func (o NotificationPolicyOutput) ToNotificationPolicyPtrOutput() NotificationPolicyPtrOutput {
	return o.ToNotificationPolicyPtrOutputWithContext(context.Background())
}

func (o NotificationPolicyOutput) ToNotificationPolicyPtrOutputWithContext(ctx context.Context) NotificationPolicyPtrOutput {
	return o.ApplyT(func(v NotificationPolicy) *NotificationPolicy {
		return &v
	}).(NotificationPolicyPtrOutput)
}

type NotificationPolicyPtrOutput struct {
	*pulumi.OutputState
}

func (NotificationPolicyPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NotificationPolicy)(nil))
}

func (o NotificationPolicyPtrOutput) ToNotificationPolicyPtrOutput() NotificationPolicyPtrOutput {
	return o
}

func (o NotificationPolicyPtrOutput) ToNotificationPolicyPtrOutputWithContext(ctx context.Context) NotificationPolicyPtrOutput {
	return o
}

type NotificationPolicyArrayOutput struct{ *pulumi.OutputState }

func (NotificationPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]NotificationPolicy)(nil))
}

func (o NotificationPolicyArrayOutput) ToNotificationPolicyArrayOutput() NotificationPolicyArrayOutput {
	return o
}

func (o NotificationPolicyArrayOutput) ToNotificationPolicyArrayOutputWithContext(ctx context.Context) NotificationPolicyArrayOutput {
	return o
}

func (o NotificationPolicyArrayOutput) Index(i pulumi.IntInput) NotificationPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) NotificationPolicy {
		return vs[0].([]NotificationPolicy)[vs[1].(int)]
	}).(NotificationPolicyOutput)
}

type NotificationPolicyMapOutput struct{ *pulumi.OutputState }

func (NotificationPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]NotificationPolicy)(nil))
}

func (o NotificationPolicyMapOutput) ToNotificationPolicyMapOutput() NotificationPolicyMapOutput {
	return o
}

func (o NotificationPolicyMapOutput) ToNotificationPolicyMapOutputWithContext(ctx context.Context) NotificationPolicyMapOutput {
	return o
}

func (o NotificationPolicyMapOutput) MapIndex(k pulumi.StringInput) NotificationPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) NotificationPolicy {
		return vs[0].(map[string]NotificationPolicy)[vs[1].(string)]
	}).(NotificationPolicyOutput)
}

func init() {
	pulumi.RegisterOutputType(NotificationPolicyOutput{})
	pulumi.RegisterOutputType(NotificationPolicyPtrOutput{})
	pulumi.RegisterOutputType(NotificationPolicyArrayOutput{})
	pulumi.RegisterOutputType(NotificationPolicyMapOutput{})
}
