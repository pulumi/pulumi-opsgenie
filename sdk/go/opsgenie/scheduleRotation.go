// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Schedule Rotation within Opsgenie.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := opsgenie.NewScheduleRotation(ctx, "test", &opsgenie.ScheduleRotationArgs{
//				ScheduleId: pulumi.Any(testOpsgenieSchedule.Id),
//				Name:       pulumi.String("test"),
//				StartDate:  pulumi.String("2019-06-18T17:00:00Z"),
//				EndDate:    pulumi.String("2019-06-20T17:30:00Z"),
//				Type:       pulumi.String("hourly"),
//				Length:     pulumi.Int(6),
//				Participants: opsgenie.ScheduleRotationParticipantArray{
//					&opsgenie.ScheduleRotationParticipantArgs{
//						Type: pulumi.String("user"),
//						Id:   pulumi.Any(testOpsgenieUser.Id),
//					},
//				},
//				TimeRestrictions: opsgenie.ScheduleRotationTimeRestrictionArray{
//					&opsgenie.ScheduleRotationTimeRestrictionArgs{
//						Type: pulumi.String("time-of-day"),
//						Restriction: opsgenie.ScheduleRotationTimeRestrictionRestrictionArray{
//							&opsgenie.ScheduleRotationTimeRestrictionRestrictionArgs{
//								StartHour: pulumi.Int(1),
//								StartMin:  pulumi.Int(1),
//								EndHour:   pulumi.Int(10),
//								EndMin:    pulumi.Int(1),
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Schedule Rotations can be imported using the `schedule_id/rotation_id`, e.g.
//
// ```sh
// $ pulumi import opsgenie:index/scheduleRotation:ScheduleRotation * `opsgenie_schedule_rotation.test schedule_id/rotation_id`
// ```
type ScheduleRotation struct {
	pulumi.CustomResourceState

	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	EndDate pulumi.StringPtrOutput `pulumi:"endDate"`
	// Length of the rotation with default value 1.
	Length pulumi.IntPtrOutput `pulumi:"length"`
	// Name of rotation.
	Name pulumi.StringOutput `pulumi:"name"`
	// List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
	Participants ScheduleRotationParticipantArrayOutput `pulumi:"participants"`
	// Identifier of the schedule.
	ScheduleId pulumi.StringOutput `pulumi:"scheduleId"`
	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	StartDate        pulumi.StringOutput                        `pulumi:"startDate"`
	TimeRestrictions ScheduleRotationTimeRestrictionArrayOutput `pulumi:"timeRestrictions"`
	// Type of rotation. May be one of daily, weekly and hourly.
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewScheduleRotation registers a new resource with the given unique name, arguments, and options.
func NewScheduleRotation(ctx *pulumi.Context,
	name string, args *ScheduleRotationArgs, opts ...pulumi.ResourceOption) (*ScheduleRotation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Participants == nil {
		return nil, errors.New("invalid value for required argument 'Participants'")
	}
	if args.ScheduleId == nil {
		return nil, errors.New("invalid value for required argument 'ScheduleId'")
	}
	if args.StartDate == nil {
		return nil, errors.New("invalid value for required argument 'StartDate'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ScheduleRotation
	err := ctx.RegisterResource("opsgenie:index/scheduleRotation:ScheduleRotation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetScheduleRotation gets an existing ScheduleRotation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetScheduleRotation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScheduleRotationState, opts ...pulumi.ResourceOption) (*ScheduleRotation, error) {
	var resource ScheduleRotation
	err := ctx.ReadResource("opsgenie:index/scheduleRotation:ScheduleRotation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ScheduleRotation resources.
type scheduleRotationState struct {
	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	EndDate *string `pulumi:"endDate"`
	// Length of the rotation with default value 1.
	Length *int `pulumi:"length"`
	// Name of rotation.
	Name *string `pulumi:"name"`
	// List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
	Participants []ScheduleRotationParticipant `pulumi:"participants"`
	// Identifier of the schedule.
	ScheduleId *string `pulumi:"scheduleId"`
	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	StartDate        *string                           `pulumi:"startDate"`
	TimeRestrictions []ScheduleRotationTimeRestriction `pulumi:"timeRestrictions"`
	// Type of rotation. May be one of daily, weekly and hourly.
	Type *string `pulumi:"type"`
}

type ScheduleRotationState struct {
	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	EndDate pulumi.StringPtrInput
	// Length of the rotation with default value 1.
	Length pulumi.IntPtrInput
	// Name of rotation.
	Name pulumi.StringPtrInput
	// List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
	Participants ScheduleRotationParticipantArrayInput
	// Identifier of the schedule.
	ScheduleId pulumi.StringPtrInput
	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	StartDate        pulumi.StringPtrInput
	TimeRestrictions ScheduleRotationTimeRestrictionArrayInput
	// Type of rotation. May be one of daily, weekly and hourly.
	Type pulumi.StringPtrInput
}

func (ScheduleRotationState) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleRotationState)(nil)).Elem()
}

type scheduleRotationArgs struct {
	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	EndDate *string `pulumi:"endDate"`
	// Length of the rotation with default value 1.
	Length *int `pulumi:"length"`
	// Name of rotation.
	Name *string `pulumi:"name"`
	// List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
	Participants []ScheduleRotationParticipant `pulumi:"participants"`
	// Identifier of the schedule.
	ScheduleId string `pulumi:"scheduleId"`
	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	StartDate        string                            `pulumi:"startDate"`
	TimeRestrictions []ScheduleRotationTimeRestriction `pulumi:"timeRestrictions"`
	// Type of rotation. May be one of daily, weekly and hourly.
	Type string `pulumi:"type"`
}

// The set of arguments for constructing a ScheduleRotation resource.
type ScheduleRotationArgs struct {
	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	EndDate pulumi.StringPtrInput
	// Length of the rotation with default value 1.
	Length pulumi.IntPtrInput
	// Name of rotation.
	Name pulumi.StringPtrInput
	// List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
	Participants ScheduleRotationParticipantArrayInput
	// Identifier of the schedule.
	ScheduleId pulumi.StringInput
	// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
	StartDate        pulumi.StringInput
	TimeRestrictions ScheduleRotationTimeRestrictionArrayInput
	// Type of rotation. May be one of daily, weekly and hourly.
	Type pulumi.StringInput
}

func (ScheduleRotationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleRotationArgs)(nil)).Elem()
}

type ScheduleRotationInput interface {
	pulumi.Input

	ToScheduleRotationOutput() ScheduleRotationOutput
	ToScheduleRotationOutputWithContext(ctx context.Context) ScheduleRotationOutput
}

func (*ScheduleRotation) ElementType() reflect.Type {
	return reflect.TypeOf((**ScheduleRotation)(nil)).Elem()
}

func (i *ScheduleRotation) ToScheduleRotationOutput() ScheduleRotationOutput {
	return i.ToScheduleRotationOutputWithContext(context.Background())
}

func (i *ScheduleRotation) ToScheduleRotationOutputWithContext(ctx context.Context) ScheduleRotationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleRotationOutput)
}

// ScheduleRotationArrayInput is an input type that accepts ScheduleRotationArray and ScheduleRotationArrayOutput values.
// You can construct a concrete instance of `ScheduleRotationArrayInput` via:
//
//	ScheduleRotationArray{ ScheduleRotationArgs{...} }
type ScheduleRotationArrayInput interface {
	pulumi.Input

	ToScheduleRotationArrayOutput() ScheduleRotationArrayOutput
	ToScheduleRotationArrayOutputWithContext(context.Context) ScheduleRotationArrayOutput
}

type ScheduleRotationArray []ScheduleRotationInput

func (ScheduleRotationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScheduleRotation)(nil)).Elem()
}

func (i ScheduleRotationArray) ToScheduleRotationArrayOutput() ScheduleRotationArrayOutput {
	return i.ToScheduleRotationArrayOutputWithContext(context.Background())
}

func (i ScheduleRotationArray) ToScheduleRotationArrayOutputWithContext(ctx context.Context) ScheduleRotationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleRotationArrayOutput)
}

// ScheduleRotationMapInput is an input type that accepts ScheduleRotationMap and ScheduleRotationMapOutput values.
// You can construct a concrete instance of `ScheduleRotationMapInput` via:
//
//	ScheduleRotationMap{ "key": ScheduleRotationArgs{...} }
type ScheduleRotationMapInput interface {
	pulumi.Input

	ToScheduleRotationMapOutput() ScheduleRotationMapOutput
	ToScheduleRotationMapOutputWithContext(context.Context) ScheduleRotationMapOutput
}

type ScheduleRotationMap map[string]ScheduleRotationInput

func (ScheduleRotationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScheduleRotation)(nil)).Elem()
}

func (i ScheduleRotationMap) ToScheduleRotationMapOutput() ScheduleRotationMapOutput {
	return i.ToScheduleRotationMapOutputWithContext(context.Background())
}

func (i ScheduleRotationMap) ToScheduleRotationMapOutputWithContext(ctx context.Context) ScheduleRotationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleRotationMapOutput)
}

type ScheduleRotationOutput struct{ *pulumi.OutputState }

func (ScheduleRotationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ScheduleRotation)(nil)).Elem()
}

func (o ScheduleRotationOutput) ToScheduleRotationOutput() ScheduleRotationOutput {
	return o
}

func (o ScheduleRotationOutput) ToScheduleRotationOutputWithContext(ctx context.Context) ScheduleRotationOutput {
	return o
}

// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
func (o ScheduleRotationOutput) EndDate() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ScheduleRotation) pulumi.StringPtrOutput { return v.EndDate }).(pulumi.StringPtrOutput)
}

// Length of the rotation with default value 1.
func (o ScheduleRotationOutput) Length() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ScheduleRotation) pulumi.IntPtrOutput { return v.Length }).(pulumi.IntPtrOutput)
}

// Name of rotation.
func (o ScheduleRotationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleRotation) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
func (o ScheduleRotationOutput) Participants() ScheduleRotationParticipantArrayOutput {
	return o.ApplyT(func(v *ScheduleRotation) ScheduleRotationParticipantArrayOutput { return v.Participants }).(ScheduleRotationParticipantArrayOutput)
}

// Identifier of the schedule.
func (o ScheduleRotationOutput) ScheduleId() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleRotation) pulumi.StringOutput { return v.ScheduleId }).(pulumi.StringOutput)
}

// This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
func (o ScheduleRotationOutput) StartDate() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleRotation) pulumi.StringOutput { return v.StartDate }).(pulumi.StringOutput)
}

func (o ScheduleRotationOutput) TimeRestrictions() ScheduleRotationTimeRestrictionArrayOutput {
	return o.ApplyT(func(v *ScheduleRotation) ScheduleRotationTimeRestrictionArrayOutput { return v.TimeRestrictions }).(ScheduleRotationTimeRestrictionArrayOutput)
}

// Type of rotation. May be one of daily, weekly and hourly.
func (o ScheduleRotationOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ScheduleRotation) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ScheduleRotationArrayOutput struct{ *pulumi.OutputState }

func (ScheduleRotationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ScheduleRotation)(nil)).Elem()
}

func (o ScheduleRotationArrayOutput) ToScheduleRotationArrayOutput() ScheduleRotationArrayOutput {
	return o
}

func (o ScheduleRotationArrayOutput) ToScheduleRotationArrayOutputWithContext(ctx context.Context) ScheduleRotationArrayOutput {
	return o
}

func (o ScheduleRotationArrayOutput) Index(i pulumi.IntInput) ScheduleRotationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ScheduleRotation {
		return vs[0].([]*ScheduleRotation)[vs[1].(int)]
	}).(ScheduleRotationOutput)
}

type ScheduleRotationMapOutput struct{ *pulumi.OutputState }

func (ScheduleRotationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ScheduleRotation)(nil)).Elem()
}

func (o ScheduleRotationMapOutput) ToScheduleRotationMapOutput() ScheduleRotationMapOutput {
	return o
}

func (o ScheduleRotationMapOutput) ToScheduleRotationMapOutputWithContext(ctx context.Context) ScheduleRotationMapOutput {
	return o
}

func (o ScheduleRotationMapOutput) MapIndex(k pulumi.StringInput) ScheduleRotationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ScheduleRotation {
		return vs[0].(map[string]*ScheduleRotation)[vs[1].(string)]
	}).(ScheduleRotationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduleRotationInput)(nil)).Elem(), &ScheduleRotation{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduleRotationArrayInput)(nil)).Elem(), ScheduleRotationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ScheduleRotationMapInput)(nil)).Elem(), ScheduleRotationMap{})
	pulumi.RegisterOutputType(ScheduleRotationOutput{})
	pulumi.RegisterOutputType(ScheduleRotationArrayOutput{})
	pulumi.RegisterOutputType(ScheduleRotationMapOutput{})
}
