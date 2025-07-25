// Code generated by pulumi-language-go DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages existing Service within Opsgenie.
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
//			_, err := opsgenie.LookupService(ctx, &opsgenie.LookupServiceArgs{
//				Name: "Payment",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupService(ctx *pulumi.Context, args *LookupServiceArgs, opts ...pulumi.InvokeOption) (*LookupServiceResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupServiceResult
	err := ctx.Invoke("opsgenie:index/getService:getService", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getService.
type LookupServiceArgs struct {
	// Description field of the service that is generally used to provide a detailed information about the service.
	Description *string `pulumi:"description"`
	// Name of the service. This field must not be longer than 100 characters.
	//
	// The following attributes are exported:
	Name string `pulumi:"name"`
	// Team id of the service.
	TeamId *string `pulumi:"teamId"`
}

// A collection of values returned by getService.
type LookupServiceResult struct {
	Description *string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id     string  `pulumi:"id"`
	Name   string  `pulumi:"name"`
	TeamId *string `pulumi:"teamId"`
}

func LookupServiceOutput(ctx *pulumi.Context, args LookupServiceOutputArgs, opts ...pulumi.InvokeOption) LookupServiceResultOutput {
	return pulumi.ToOutputWithContext(ctx.Context(), args).
		ApplyT(func(v interface{}) (LookupServiceResultOutput, error) {
			args := v.(LookupServiceArgs)
			options := pulumi.InvokeOutputOptions{InvokeOptions: internal.PkgInvokeDefaultOpts(opts)}
			return ctx.InvokeOutput("opsgenie:index/getService:getService", args, LookupServiceResultOutput{}, options).(LookupServiceResultOutput), nil
		}).(LookupServiceResultOutput)
}

// A collection of arguments for invoking getService.
type LookupServiceOutputArgs struct {
	// Description field of the service that is generally used to provide a detailed information about the service.
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Name of the service. This field must not be longer than 100 characters.
	//
	// The following attributes are exported:
	Name pulumi.StringInput `pulumi:"name"`
	// Team id of the service.
	TeamId pulumi.StringPtrInput `pulumi:"teamId"`
}

func (LookupServiceOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceArgs)(nil)).Elem()
}

// A collection of values returned by getService.
type LookupServiceResultOutput struct{ *pulumi.OutputState }

func (LookupServiceResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupServiceResult)(nil)).Elem()
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutput() LookupServiceResultOutput {
	return o
}

func (o LookupServiceResultOutput) ToLookupServiceResultOutputWithContext(ctx context.Context) LookupServiceResultOutput {
	return o
}

func (o LookupServiceResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupServiceResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupServiceResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupServiceResultOutput) TeamId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupServiceResult) *string { return v.TeamId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupServiceResultOutput{})
}
