// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages existing heartbeat within Opsgenie.
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
//			_, err := opsgenie.LookupHeartbeat(ctx, &opsgenie.LookupHeartbeatArgs{
//				Name: "genieheartbeat-existing",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupHeartbeat(ctx *pulumi.Context, args *LookupHeartbeatArgs, opts ...pulumi.InvokeOption) (*LookupHeartbeatResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupHeartbeatResult
	err := ctx.Invoke("opsgenie:index/getHeartbeat:getHeartbeat", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHeartbeat.
type LookupHeartbeatArgs struct {
	// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
	AlertMessage *string `pulumi:"alertMessage"`
	// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
	AlertPriority *string `pulumi:"alertPriority"`
	// Specifies the alert tags for heartbeat expiration alert.
	AlertTags []string `pulumi:"alertTags"`
	// An optional description of the heartbeat
	Description *string `pulumi:"description"`
	// Enable/disable heartbeat monitoring.
	Enabled *bool `pulumi:"enabled"`
	// Specifies how often a heartbeat message should be expected.
	Interval *int `pulumi:"interval"`
	// Interval specified as minutes, hours or days.
	IntervalUnit *string `pulumi:"intervalUnit"`
	// Name of the heartbeat
	Name string `pulumi:"name"`
	// Owner team of the heartbeat.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
}

// A collection of values returned by getHeartbeat.
type LookupHeartbeatResult struct {
	// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
	AlertMessage *string `pulumi:"alertMessage"`
	// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
	AlertPriority *string `pulumi:"alertPriority"`
	// Specifies the alert tags for heartbeat expiration alert.
	AlertTags []string `pulumi:"alertTags"`
	// An optional description of the heartbeat
	Description *string `pulumi:"description"`
	// Enable/disable heartbeat monitoring.
	Enabled *bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Specifies how often a heartbeat message should be expected.
	Interval *int `pulumi:"interval"`
	// Interval specified as minutes, hours or days.
	IntervalUnit *string `pulumi:"intervalUnit"`
	Name         string  `pulumi:"name"`
	// Owner team of the heartbeat.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
}

func LookupHeartbeatOutput(ctx *pulumi.Context, args LookupHeartbeatOutputArgs, opts ...pulumi.InvokeOption) LookupHeartbeatResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupHeartbeatResultOutput, error) {
			args := v.(LookupHeartbeatArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("opsgenie:index/getHeartbeat:getHeartbeat", args, LookupHeartbeatResultOutput{}, options).(LookupHeartbeatResultOutput), nil
		}).(LookupHeartbeatResultOutput)
}

// A collection of arguments for invoking getHeartbeat.
type LookupHeartbeatOutputArgs struct {
	// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
	AlertMessage pulumi.StringPtrInput `pulumi:"alertMessage"`
	// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
	AlertPriority pulumi.StringPtrInput `pulumi:"alertPriority"`
	// Specifies the alert tags for heartbeat expiration alert.
	AlertTags pulumi.StringArrayInput `pulumi:"alertTags"`
	// An optional description of the heartbeat
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Enable/disable heartbeat monitoring.
	Enabled pulumi.BoolPtrInput `pulumi:"enabled"`
	// Specifies how often a heartbeat message should be expected.
	Interval pulumi.IntPtrInput `pulumi:"interval"`
	// Interval specified as minutes, hours or days.
	IntervalUnit pulumi.StringPtrInput `pulumi:"intervalUnit"`
	// Name of the heartbeat
	Name pulumi.StringInput `pulumi:"name"`
	// Owner team of the heartbeat.
	OwnerTeamId pulumi.StringPtrInput `pulumi:"ownerTeamId"`
}

func (LookupHeartbeatOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHeartbeatArgs)(nil)).Elem()
}

// A collection of values returned by getHeartbeat.
type LookupHeartbeatResultOutput struct{ *pulumi.OutputState }

func (LookupHeartbeatResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupHeartbeatResult)(nil)).Elem()
}

func (o LookupHeartbeatResultOutput) ToLookupHeartbeatResultOutput() LookupHeartbeatResultOutput {
	return o
}

func (o LookupHeartbeatResultOutput) ToLookupHeartbeatResultOutputWithContext(ctx context.Context) LookupHeartbeatResultOutput {
	return o
}

// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
func (o LookupHeartbeatResultOutput) AlertMessage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) *string { return v.AlertMessage }).(pulumi.StringPtrOutput)
}

// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
func (o LookupHeartbeatResultOutput) AlertPriority() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) *string { return v.AlertPriority }).(pulumi.StringPtrOutput)
}

// Specifies the alert tags for heartbeat expiration alert.
func (o LookupHeartbeatResultOutput) AlertTags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) []string { return v.AlertTags }).(pulumi.StringArrayOutput)
}

// An optional description of the heartbeat
func (o LookupHeartbeatResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// Enable/disable heartbeat monitoring.
func (o LookupHeartbeatResultOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) *bool { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupHeartbeatResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) string { return v.Id }).(pulumi.StringOutput)
}

// Specifies how often a heartbeat message should be expected.
func (o LookupHeartbeatResultOutput) Interval() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) *int { return v.Interval }).(pulumi.IntPtrOutput)
}

// Interval specified as minutes, hours or days.
func (o LookupHeartbeatResultOutput) IntervalUnit() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) *string { return v.IntervalUnit }).(pulumi.StringPtrOutput)
}

func (o LookupHeartbeatResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) string { return v.Name }).(pulumi.StringOutput)
}

// Owner team of the heartbeat.
func (o LookupHeartbeatResultOutput) OwnerTeamId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupHeartbeatResult) *string { return v.OwnerTeamId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupHeartbeatResultOutput{})
}
