// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

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
//
//	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := opsgenie.LookupEscalation(ctx, &opsgenie.LookupEscalationArgs{
//				Name: "existing-escalation",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupEscalation(ctx *pulumi.Context, args *LookupEscalationArgs, opts ...pulumi.InvokeOption) (*LookupEscalationResult, error) {
	var rv LookupEscalationResult
	err := ctx.Invoke("opsgenie:index/getEscalation:getEscalation", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEscalation.
type LookupEscalationArgs struct {
	// Escalation Description
	Description *string `pulumi:"description"`
	// Name of the escalation.
	Name string `pulumi:"name"`
	// If owner team exist the id of the team is exported
	OwnerTeamId *string `pulumi:"ownerTeamId"`
	// Escalation repeat preferences
	Repeats []GetEscalationRepeat `pulumi:"repeats"`
	// Escalation rules
	Rules []GetEscalationRule `pulumi:"rules"`
}

// A collection of values returned by getEscalation.
type LookupEscalationResult struct {
	// Escalation Description
	Description *string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id   string `pulumi:"id"`
	Name string `pulumi:"name"`
	// If owner team exist the id of the team is exported
	OwnerTeamId *string `pulumi:"ownerTeamId"`
	// Escalation repeat preferences
	Repeats []GetEscalationRepeat `pulumi:"repeats"`
	// Escalation rules
	Rules []GetEscalationRule `pulumi:"rules"`
}

func LookupEscalationOutput(ctx *pulumi.Context, args LookupEscalationOutputArgs, opts ...pulumi.InvokeOption) LookupEscalationResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEscalationResult, error) {
			args := v.(LookupEscalationArgs)
			r, err := LookupEscalation(ctx, &args, opts...)
			var s LookupEscalationResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEscalationResultOutput)
}

// A collection of arguments for invoking getEscalation.
type LookupEscalationOutputArgs struct {
	// Escalation Description
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Name of the escalation.
	Name pulumi.StringInput `pulumi:"name"`
	// If owner team exist the id of the team is exported
	OwnerTeamId pulumi.StringPtrInput `pulumi:"ownerTeamId"`
	// Escalation repeat preferences
	Repeats GetEscalationRepeatArrayInput `pulumi:"repeats"`
	// Escalation rules
	Rules GetEscalationRuleArrayInput `pulumi:"rules"`
}

func (LookupEscalationOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEscalationArgs)(nil)).Elem()
}

// A collection of values returned by getEscalation.
type LookupEscalationResultOutput struct{ *pulumi.OutputState }

func (LookupEscalationResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEscalationResult)(nil)).Elem()
}

func (o LookupEscalationResultOutput) ToLookupEscalationResultOutput() LookupEscalationResultOutput {
	return o
}

func (o LookupEscalationResultOutput) ToLookupEscalationResultOutputWithContext(ctx context.Context) LookupEscalationResultOutput {
	return o
}

// Escalation Description
func (o LookupEscalationResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEscalationResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEscalationResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEscalationResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupEscalationResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEscalationResult) string { return v.Name }).(pulumi.StringOutput)
}

// If owner team exist the id of the team is exported
func (o LookupEscalationResultOutput) OwnerTeamId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEscalationResult) *string { return v.OwnerTeamId }).(pulumi.StringPtrOutput)
}

// Escalation repeat preferences
func (o LookupEscalationResultOutput) Repeats() GetEscalationRepeatArrayOutput {
	return o.ApplyT(func(v LookupEscalationResult) []GetEscalationRepeat { return v.Repeats }).(GetEscalationRepeatArrayOutput)
}

// Escalation rules
func (o LookupEscalationResultOutput) Rules() GetEscalationRuleArrayOutput {
	return o.ApplyT(func(v LookupEscalationResult) []GetEscalationRule { return v.Rules }).(GetEscalationRuleArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEscalationResultOutput{})
}
