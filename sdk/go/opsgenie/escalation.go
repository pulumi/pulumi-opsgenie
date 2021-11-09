// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Escalation within Opsgenie.
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
// 		_, err := opsgenie.NewEscalation(ctx, "test", &opsgenie.EscalationArgs{
// 			Description: pulumi.String("test"),
// 			OwnerTeamId: pulumi.Any(opsgenie_team.Test.Id),
// 			Repeats: EscalationRepeatArray{
// 				&EscalationRepeatArgs{
// 					CloseAlertAfterAll:   pulumi.Bool(false),
// 					Count:                pulumi.Int(1),
// 					ResetRecipientStates: pulumi.Bool(true),
// 					WaitInterval:         pulumi.Int(10),
// 				},
// 			},
// 			Rules: EscalationRuleArray{
// 				&EscalationRuleArgs{
// 					Condition:  pulumi.String("if-not-acked"),
// 					Delay:      pulumi.Int(1),
// 					NotifyType: pulumi.String("default"),
// 					Recipients: EscalationRuleRecipientArray{
// 						&EscalationRuleRecipientArgs{
// 							Id:   pulumi.Any(opsgenie_user.Test.Id),
// 							Type: pulumi.String("user"),
// 						},
// 						&EscalationRuleRecipientArgs{
// 							Id:   pulumi.Any(opsgenie_team.Test.Id),
// 							Type: pulumi.String("team"),
// 						},
// 						&EscalationRuleRecipientArgs{
// 							Id:   pulumi.Any(opsgenie_schedule.Test.Id),
// 							Type: pulumi.String("schedule"),
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
// Escalations can be imported using the `escalation_id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/escalation:Escalation test escalation_id`
// ```
type Escalation struct {
	pulumi.CustomResourceState

	// Description of the escalation.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the escalation.
	Name pulumi.StringOutput `pulumi:"name"`
	// Owner team id of the escalation.
	OwnerTeamId pulumi.StringPtrOutput `pulumi:"ownerTeamId"`
	// Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
	Repeats EscalationRepeatArrayOutput `pulumi:"repeats"`
	// List of the escalation rules.
	Rules EscalationRuleArrayOutput `pulumi:"rules"`
}

// NewEscalation registers a new resource with the given unique name, arguments, and options.
func NewEscalation(ctx *pulumi.Context,
	name string, args *EscalationArgs, opts ...pulumi.ResourceOption) (*Escalation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	var resource Escalation
	err := ctx.RegisterResource("opsgenie:index/escalation:Escalation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEscalation gets an existing Escalation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEscalation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EscalationState, opts ...pulumi.ResourceOption) (*Escalation, error) {
	var resource Escalation
	err := ctx.ReadResource("opsgenie:index/escalation:Escalation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Escalation resources.
type escalationState struct {
	// Description of the escalation.
	Description *string `pulumi:"description"`
	// Name of the escalation.
	Name *string `pulumi:"name"`
	// Owner team id of the escalation.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
	// Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
	Repeats []EscalationRepeat `pulumi:"repeats"`
	// List of the escalation rules.
	Rules []EscalationRule `pulumi:"rules"`
}

type EscalationState struct {
	// Description of the escalation.
	Description pulumi.StringPtrInput
	// Name of the escalation.
	Name pulumi.StringPtrInput
	// Owner team id of the escalation.
	OwnerTeamId pulumi.StringPtrInput
	// Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
	Repeats EscalationRepeatArrayInput
	// List of the escalation rules.
	Rules EscalationRuleArrayInput
}

func (EscalationState) ElementType() reflect.Type {
	return reflect.TypeOf((*escalationState)(nil)).Elem()
}

type escalationArgs struct {
	// Description of the escalation.
	Description *string `pulumi:"description"`
	// Name of the escalation.
	Name *string `pulumi:"name"`
	// Owner team id of the escalation.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
	// Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
	Repeats []EscalationRepeat `pulumi:"repeats"`
	// List of the escalation rules.
	Rules []EscalationRule `pulumi:"rules"`
}

// The set of arguments for constructing a Escalation resource.
type EscalationArgs struct {
	// Description of the escalation.
	Description pulumi.StringPtrInput
	// Name of the escalation.
	Name pulumi.StringPtrInput
	// Owner team id of the escalation.
	OwnerTeamId pulumi.StringPtrInput
	// Repeat preferences of the escalation including repeat interval, count, reverting acknowledge and seen states back and closing an alert automatically as soon as repeats are completed
	Repeats EscalationRepeatArrayInput
	// List of the escalation rules.
	Rules EscalationRuleArrayInput
}

func (EscalationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*escalationArgs)(nil)).Elem()
}

type EscalationInput interface {
	pulumi.Input

	ToEscalationOutput() EscalationOutput
	ToEscalationOutputWithContext(ctx context.Context) EscalationOutput
}

func (*Escalation) ElementType() reflect.Type {
	return reflect.TypeOf((*Escalation)(nil))
}

func (i *Escalation) ToEscalationOutput() EscalationOutput {
	return i.ToEscalationOutputWithContext(context.Background())
}

func (i *Escalation) ToEscalationOutputWithContext(ctx context.Context) EscalationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EscalationOutput)
}

func (i *Escalation) ToEscalationPtrOutput() EscalationPtrOutput {
	return i.ToEscalationPtrOutputWithContext(context.Background())
}

func (i *Escalation) ToEscalationPtrOutputWithContext(ctx context.Context) EscalationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EscalationPtrOutput)
}

type EscalationPtrInput interface {
	pulumi.Input

	ToEscalationPtrOutput() EscalationPtrOutput
	ToEscalationPtrOutputWithContext(ctx context.Context) EscalationPtrOutput
}

type escalationPtrType EscalationArgs

func (*escalationPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Escalation)(nil))
}

func (i *escalationPtrType) ToEscalationPtrOutput() EscalationPtrOutput {
	return i.ToEscalationPtrOutputWithContext(context.Background())
}

func (i *escalationPtrType) ToEscalationPtrOutputWithContext(ctx context.Context) EscalationPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EscalationPtrOutput)
}

// EscalationArrayInput is an input type that accepts EscalationArray and EscalationArrayOutput values.
// You can construct a concrete instance of `EscalationArrayInput` via:
//
//          EscalationArray{ EscalationArgs{...} }
type EscalationArrayInput interface {
	pulumi.Input

	ToEscalationArrayOutput() EscalationArrayOutput
	ToEscalationArrayOutputWithContext(context.Context) EscalationArrayOutput
}

type EscalationArray []EscalationInput

func (EscalationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Escalation)(nil)).Elem()
}

func (i EscalationArray) ToEscalationArrayOutput() EscalationArrayOutput {
	return i.ToEscalationArrayOutputWithContext(context.Background())
}

func (i EscalationArray) ToEscalationArrayOutputWithContext(ctx context.Context) EscalationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EscalationArrayOutput)
}

// EscalationMapInput is an input type that accepts EscalationMap and EscalationMapOutput values.
// You can construct a concrete instance of `EscalationMapInput` via:
//
//          EscalationMap{ "key": EscalationArgs{...} }
type EscalationMapInput interface {
	pulumi.Input

	ToEscalationMapOutput() EscalationMapOutput
	ToEscalationMapOutputWithContext(context.Context) EscalationMapOutput
}

type EscalationMap map[string]EscalationInput

func (EscalationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Escalation)(nil)).Elem()
}

func (i EscalationMap) ToEscalationMapOutput() EscalationMapOutput {
	return i.ToEscalationMapOutputWithContext(context.Background())
}

func (i EscalationMap) ToEscalationMapOutputWithContext(ctx context.Context) EscalationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EscalationMapOutput)
}

type EscalationOutput struct{ *pulumi.OutputState }

func (EscalationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Escalation)(nil))
}

func (o EscalationOutput) ToEscalationOutput() EscalationOutput {
	return o
}

func (o EscalationOutput) ToEscalationOutputWithContext(ctx context.Context) EscalationOutput {
	return o
}

func (o EscalationOutput) ToEscalationPtrOutput() EscalationPtrOutput {
	return o.ToEscalationPtrOutputWithContext(context.Background())
}

func (o EscalationOutput) ToEscalationPtrOutputWithContext(ctx context.Context) EscalationPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Escalation) *Escalation {
		return &v
	}).(EscalationPtrOutput)
}

type EscalationPtrOutput struct{ *pulumi.OutputState }

func (EscalationPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Escalation)(nil))
}

func (o EscalationPtrOutput) ToEscalationPtrOutput() EscalationPtrOutput {
	return o
}

func (o EscalationPtrOutput) ToEscalationPtrOutputWithContext(ctx context.Context) EscalationPtrOutput {
	return o
}

func (o EscalationPtrOutput) Elem() EscalationOutput {
	return o.ApplyT(func(v *Escalation) Escalation {
		if v != nil {
			return *v
		}
		var ret Escalation
		return ret
	}).(EscalationOutput)
}

type EscalationArrayOutput struct{ *pulumi.OutputState }

func (EscalationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Escalation)(nil))
}

func (o EscalationArrayOutput) ToEscalationArrayOutput() EscalationArrayOutput {
	return o
}

func (o EscalationArrayOutput) ToEscalationArrayOutputWithContext(ctx context.Context) EscalationArrayOutput {
	return o
}

func (o EscalationArrayOutput) Index(i pulumi.IntInput) EscalationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Escalation {
		return vs[0].([]Escalation)[vs[1].(int)]
	}).(EscalationOutput)
}

type EscalationMapOutput struct{ *pulumi.OutputState }

func (EscalationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Escalation)(nil))
}

func (o EscalationMapOutput) ToEscalationMapOutput() EscalationMapOutput {
	return o
}

func (o EscalationMapOutput) ToEscalationMapOutputWithContext(ctx context.Context) EscalationMapOutput {
	return o
}

func (o EscalationMapOutput) MapIndex(k pulumi.StringInput) EscalationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Escalation {
		return vs[0].(map[string]Escalation)[vs[1].(string)]
	}).(EscalationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EscalationInput)(nil)).Elem(), &Escalation{})
	pulumi.RegisterInputType(reflect.TypeOf((*EscalationPtrInput)(nil)).Elem(), &Escalation{})
	pulumi.RegisterInputType(reflect.TypeOf((*EscalationArrayInput)(nil)).Elem(), EscalationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EscalationMapInput)(nil)).Elem(), EscalationMap{})
	pulumi.RegisterOutputType(EscalationOutput{})
	pulumi.RegisterOutputType(EscalationPtrOutput{})
	pulumi.RegisterOutputType(EscalationArrayOutput{})
	pulumi.RegisterOutputType(EscalationMapOutput{})
}
