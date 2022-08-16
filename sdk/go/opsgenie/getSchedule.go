// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Schedule within Opsgenie.
//
// ## Example Usage
//
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
//			_, err := opsgenie.LookupSchedule(ctx, &GetScheduleArgs{
//				Name: "sre-team schedule",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupSchedule(ctx *pulumi.Context, args *LookupScheduleArgs, opts ...pulumi.InvokeOption) (*LookupScheduleResult, error) {
	var rv LookupScheduleResult
	err := ctx.Invoke("opsgenie:index/getSchedule:getSchedule", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSchedule.
type LookupScheduleArgs struct {
	// Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
	Description *string `pulumi:"description"`
	// Enable/disable state of schedule
	Enabled *bool `pulumi:"enabled"`
	// Name of the schedule.
	Name string `pulumi:"name"`
	// Owner team id of the schedule.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
	// The description of schedule.
	Timezone *string `pulumi:"timezone"`
}

// A collection of values returned by getSchedule.
type LookupScheduleResult struct {
	// Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
	Description *string `pulumi:"description"`
	// Enable/disable state of schedule
	Enabled *bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// Owner team id of the schedule.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
	// The description of schedule.
	Timezone *string `pulumi:"timezone"`
}

func LookupScheduleOutput(ctx *pulumi.Context, args LookupScheduleOutputArgs, opts ...pulumi.InvokeOption) LookupScheduleResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupScheduleResult, error) {
			args := v.(LookupScheduleArgs)
			r, err := LookupSchedule(ctx, &args, opts...)
			var s LookupScheduleResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupScheduleResultOutput)
}

// A collection of arguments for invoking getSchedule.
type LookupScheduleOutputArgs struct {
	// Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Enable/disable state of schedule
	Enabled pulumi.BoolPtrInput `pulumi:"enabled"`
	// Name of the schedule.
	Name pulumi.StringInput `pulumi:"name"`
	// Owner team id of the schedule.
	OwnerTeamId pulumi.StringPtrInput `pulumi:"ownerTeamId"`
	// The description of schedule.
	Timezone pulumi.StringPtrInput `pulumi:"timezone"`
}

func (LookupScheduleOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupScheduleArgs)(nil)).Elem()
}

// A collection of values returned by getSchedule.
type LookupScheduleResultOutput struct{ *pulumi.OutputState }

func (LookupScheduleResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupScheduleResult)(nil)).Elem()
}

func (o LookupScheduleResultOutput) ToLookupScheduleResultOutput() LookupScheduleResultOutput {
	return o
}

func (o LookupScheduleResultOutput) ToLookupScheduleResultOutputWithContext(ctx context.Context) LookupScheduleResultOutput {
	return o
}

// Timezone of schedule. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones - Default: `America/New_York`.
func (o LookupScheduleResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupScheduleResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// Enable/disable state of schedule
func (o LookupScheduleResultOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupScheduleResult) *bool { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupScheduleResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupScheduleResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupScheduleResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupScheduleResult) string { return v.Name }).(pulumi.StringOutput)
}

// Owner team id of the schedule.
func (o LookupScheduleResultOutput) OwnerTeamId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupScheduleResult) *string { return v.OwnerTeamId }).(pulumi.StringPtrOutput)
}

// The description of schedule.
func (o LookupScheduleResultOutput) Timezone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupScheduleResult) *string { return v.Timezone }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupScheduleResultOutput{})
}
