// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a Schedule within Opsgenie.
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
// 		_, err := opsgenie.NewSchedule(ctx, "test", &opsgenie.ScheduleArgs{
// 			Description: pulumi.String("schedule test"),
// 			Enabled:     pulumi.Bool(false),
// 			OwnerTeamId: pulumi.Any(opsgenie_team.Test.Id),
// 			Timezone:    pulumi.String("Europe/Rome"),
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
// Schedule can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/schedule:Schedule test 812be1a1-32c8-4666-a7fb-03ecc385106c`
// ```
type Schedule struct {
	pulumi.CustomResourceState

	// The description of schedule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Enable/disable state of schedule
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// Name of the schedule.
	Name pulumi.StringOutput `pulumi:"name"`
	// Owner team id of the schedule.
	OwnerTeamId pulumi.StringPtrOutput `pulumi:"ownerTeamId"`
	// Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Defaults to "America/New_York".
	Timezone pulumi.StringPtrOutput `pulumi:"timezone"`
}

// NewSchedule registers a new resource with the given unique name, arguments, and options.
func NewSchedule(ctx *pulumi.Context,
	name string, args *ScheduleArgs, opts ...pulumi.ResourceOption) (*Schedule, error) {
	if args == nil {
		args = &ScheduleArgs{}
	}

	var resource Schedule
	err := ctx.RegisterResource("opsgenie:index/schedule:Schedule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchedule gets an existing Schedule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchedule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ScheduleState, opts ...pulumi.ResourceOption) (*Schedule, error) {
	var resource Schedule
	err := ctx.ReadResource("opsgenie:index/schedule:Schedule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Schedule resources.
type scheduleState struct {
	// The description of schedule.
	Description *string `pulumi:"description"`
	// Enable/disable state of schedule
	Enabled *bool `pulumi:"enabled"`
	// Name of the schedule.
	Name *string `pulumi:"name"`
	// Owner team id of the schedule.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
	// Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Defaults to "America/New_York".
	Timezone *string `pulumi:"timezone"`
}

type ScheduleState struct {
	// The description of schedule.
	Description pulumi.StringPtrInput
	// Enable/disable state of schedule
	Enabled pulumi.BoolPtrInput
	// Name of the schedule.
	Name pulumi.StringPtrInput
	// Owner team id of the schedule.
	OwnerTeamId pulumi.StringPtrInput
	// Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Defaults to "America/New_York".
	Timezone pulumi.StringPtrInput
}

func (ScheduleState) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleState)(nil)).Elem()
}

type scheduleArgs struct {
	// The description of schedule.
	Description *string `pulumi:"description"`
	// Enable/disable state of schedule
	Enabled *bool `pulumi:"enabled"`
	// Name of the schedule.
	Name *string `pulumi:"name"`
	// Owner team id of the schedule.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
	// Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Defaults to "America/New_York".
	Timezone *string `pulumi:"timezone"`
}

// The set of arguments for constructing a Schedule resource.
type ScheduleArgs struct {
	// The description of schedule.
	Description pulumi.StringPtrInput
	// Enable/disable state of schedule
	Enabled pulumi.BoolPtrInput
	// Name of the schedule.
	Name pulumi.StringPtrInput
	// Owner team id of the schedule.
	OwnerTeamId pulumi.StringPtrInput
	// Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Defaults to "America/New_York".
	Timezone pulumi.StringPtrInput
}

func (ScheduleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*scheduleArgs)(nil)).Elem()
}

type ScheduleInput interface {
	pulumi.Input

	ToScheduleOutput() ScheduleOutput
	ToScheduleOutputWithContext(ctx context.Context) ScheduleOutput
}

func (Schedule) ElementType() reflect.Type {
	return reflect.TypeOf((*Schedule)(nil)).Elem()
}

func (i Schedule) ToScheduleOutput() ScheduleOutput {
	return i.ToScheduleOutputWithContext(context.Background())
}

func (i Schedule) ToScheduleOutputWithContext(ctx context.Context) ScheduleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ScheduleOutput)
}

type ScheduleOutput struct {
	*pulumi.OutputState
}

func (ScheduleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ScheduleOutput)(nil)).Elem()
}

func (o ScheduleOutput) ToScheduleOutput() ScheduleOutput {
	return o
}

func (o ScheduleOutput) ToScheduleOutputWithContext(ctx context.Context) ScheduleOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(ScheduleOutput{})
}
