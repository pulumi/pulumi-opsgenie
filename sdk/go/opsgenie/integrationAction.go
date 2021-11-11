// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages advanced actions for Integrations within Opsgenie. This applies for the following resources:
// * `ApiIntegration`
// * `EmailIntegration`
//
// The actions that are supported are:
// * `create`
// * `close`
// * `acknowledge`
// * `addNote`
// * `ignore`
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
// 		_, err := opsgenie.NewIntegrationAction(ctx, "testAction", &opsgenie.IntegrationActionArgs{
// 			IntegrationId: pulumi.Any(opsgenie_api_integration.Test.Id),
// 			Creates: IntegrationActionCreateArray{
// 				&IntegrationActionCreateArgs{
// 					Name: pulumi.String("create action"),
// 					Tags: pulumi.StringArray{
// 						pulumi.String("CRITICAL"),
// 						pulumi.String("SEV-0"),
// 					},
// 					User:        pulumi.String("Example-service"),
// 					Note:        pulumi.String("{{note}}"),
// 					Alias:       pulumi.String("{{alias}}"),
// 					Source:      pulumi.String("{{source}}"),
// 					Message:     pulumi.String("{{message}}"),
// 					Description: pulumi.String("{{description}}"),
// 					Entity:      pulumi.String("{{entity}}"),
// 					AlertActions: pulumi.StringArray{
// 						pulumi.String("Runbook ID#342"),
// 					},
// 					Filters: IntegrationActionCreateFilterArray{
// 						&IntegrationActionCreateFilterArgs{
// 							Type: pulumi.String("match-all-conditions"),
// 							Conditions: IntegrationActionCreateFilterConditionArray{
// 								&IntegrationActionCreateFilterConditionArgs{
// 									Field:         pulumi.String("priority"),
// 									Operation:     pulumi.String("equals"),
// 									ExpectedValue: pulumi.String("P1"),
// 								},
// 							},
// 						},
// 					},
// 					Responders: IntegrationActionCreateResponderArray{
// 						&IntegrationActionCreateResponderArgs{
// 							Id:   pulumi.Any(opsgenie_team.Test.Id),
// 							Type: pulumi.String("team"),
// 						},
// 					},
// 				},
// 				&IntegrationActionCreateArgs{
// 					Name: pulumi.String("Create medium priority alerts"),
// 					Tags: pulumi.StringArray{
// 						pulumi.String("SEVERE"),
// 						pulumi.String("SEV-1"),
// 					},
// 					Priority: pulumi.String("P3"),
// 					Filters: IntegrationActionCreateFilterArray{
// 						&IntegrationActionCreateFilterArgs{
// 							Type: pulumi.String("match-all-conditions"),
// 							Conditions: IntegrationActionCreateFilterConditionArray{
// 								&IntegrationActionCreateFilterConditionArgs{
// 									Field:         pulumi.String("priority"),
// 									Operation:     pulumi.String("equals"),
// 									ExpectedValue: pulumi.String("P2"),
// 								},
// 							},
// 						},
// 					},
// 				},
// 				&IntegrationActionCreateArgs{
// 					Name:           pulumi.String("Create alert with priority from message"),
// 					CustomPriority: pulumi.String("{{message.substringAfter(\"[custom]\")}}"),
// 					Filters: IntegrationActionCreateFilterArray{
// 						&IntegrationActionCreateFilterArgs{
// 							Type: pulumi.String("match-all-conditions"),
// 							Conditions: IntegrationActionCreateFilterConditionArray{
// 								&IntegrationActionCreateFilterConditionArgs{
// 									Field:         pulumi.String("tags"),
// 									Operation:     pulumi.String("contains"),
// 									ExpectedValue: pulumi.String("P5"),
// 								},
// 								&IntegrationActionCreateFilterConditionArgs{
// 									Field:         pulumi.String("message"),
// 									Operation:     pulumi.String("Starts With"),
// 									ExpectedValue: pulumi.String("[custom]"),
// 								},
// 							},
// 						},
// 					},
// 				},
// 			},
// 			Closes: IntegrationActionCloseArray{
// 				&IntegrationActionCloseArgs{
// 					Name: pulumi.String("Low priority alerts"),
// 					Filters: IntegrationActionCloseFilterArray{
// 						&IntegrationActionCloseFilterArgs{
// 							Type: pulumi.String("match-any-condition"),
// 							Conditions: IntegrationActionCloseFilterConditionArray{
// 								&IntegrationActionCloseFilterConditionArgs{
// 									Field:         pulumi.String("priority"),
// 									Operation:     pulumi.String("equals"),
// 									ExpectedValue: pulumi.String("P5"),
// 								},
// 								&IntegrationActionCloseFilterConditionArgs{
// 									Field:         pulumi.String("message"),
// 									Operation:     pulumi.String("contains"),
// 									ExpectedValue: pulumi.String("DEBUG"),
// 								},
// 							},
// 						},
// 					},
// 				},
// 			},
// 			Acknowledges: IntegrationActionAcknowledgeArray{
// 				&IntegrationActionAcknowledgeArgs{
// 					Name: pulumi.String("Auto-ack test alerts"),
// 					Filters: IntegrationActionAcknowledgeFilterArray{
// 						&IntegrationActionAcknowledgeFilterArgs{
// 							Type: pulumi.String("match-all-conditions"),
// 							Conditions: IntegrationActionAcknowledgeFilterConditionArray{
// 								&IntegrationActionAcknowledgeFilterConditionArgs{
// 									Field:         pulumi.String("message"),
// 									Operation:     pulumi.String("contains"),
// 									ExpectedValue: pulumi.String("TEST"),
// 								},
// 								&IntegrationActionAcknowledgeFilterConditionArgs{
// 									Field:         pulumi.String("priority"),
// 									Operation:     pulumi.String("equals"),
// 									ExpectedValue: pulumi.String("P5"),
// 								},
// 							},
// 						},
// 					},
// 				},
// 			},
// 			AddNotes: IntegrationActionAddNoteArray{
// 				&IntegrationActionAddNoteArgs{
// 					Name: pulumi.String("Add note to all alerts"),
// 					Note: pulumi.String("Created from test integration"),
// 					Filters: IntegrationActionAddNoteFilterArray{
// 						&IntegrationActionAddNoteFilterArgs{
// 							Type: pulumi.String("match-all"),
// 						},
// 					},
// 				},
// 			},
// 			Ignores: IntegrationActionIgnoreArray{
// 				&IntegrationActionIgnoreArgs{
// 					Name: pulumi.String("Ignore alerts with ignore tag"),
// 					Filters: IntegrationActionIgnoreFilterArray{
// 						&IntegrationActionIgnoreFilterArgs{
// 							Type: pulumi.String("match-all-conditions"),
// 							Conditions: IntegrationActionIgnoreFilterConditionArray{
// 								&IntegrationActionIgnoreFilterConditionArgs{
// 									Field:         pulumi.String("tags"),
// 									Operation:     pulumi.String("contains"),
// 									ExpectedValue: pulumi.String("ignore"),
// 								},
// 							},
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
type IntegrationAction struct {
	pulumi.CustomResourceState

	Acknowledges IntegrationActionAcknowledgeArrayOutput `pulumi:"acknowledges"`
	AddNotes     IntegrationActionAddNoteArrayOutput     `pulumi:"addNotes"`
	Closes       IntegrationActionCloseArrayOutput       `pulumi:"closes"`
	Creates      IntegrationActionCreateArrayOutput      `pulumi:"creates"`
	Ignores      IntegrationActionIgnoreArrayOutput      `pulumi:"ignores"`
	// ID of the parent integration resource to bind to.
	IntegrationId pulumi.StringOutput `pulumi:"integrationId"`
}

// NewIntegrationAction registers a new resource with the given unique name, arguments, and options.
func NewIntegrationAction(ctx *pulumi.Context,
	name string, args *IntegrationActionArgs, opts ...pulumi.ResourceOption) (*IntegrationAction, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IntegrationId == nil {
		return nil, errors.New("invalid value for required argument 'IntegrationId'")
	}
	var resource IntegrationAction
	err := ctx.RegisterResource("opsgenie:index/integrationAction:IntegrationAction", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIntegrationAction gets an existing IntegrationAction resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIntegrationAction(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IntegrationActionState, opts ...pulumi.ResourceOption) (*IntegrationAction, error) {
	var resource IntegrationAction
	err := ctx.ReadResource("opsgenie:index/integrationAction:IntegrationAction", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IntegrationAction resources.
type integrationActionState struct {
	Acknowledges []IntegrationActionAcknowledge `pulumi:"acknowledges"`
	AddNotes     []IntegrationActionAddNote     `pulumi:"addNotes"`
	Closes       []IntegrationActionClose       `pulumi:"closes"`
	Creates      []IntegrationActionCreate      `pulumi:"creates"`
	Ignores      []IntegrationActionIgnore      `pulumi:"ignores"`
	// ID of the parent integration resource to bind to.
	IntegrationId *string `pulumi:"integrationId"`
}

type IntegrationActionState struct {
	Acknowledges IntegrationActionAcknowledgeArrayInput
	AddNotes     IntegrationActionAddNoteArrayInput
	Closes       IntegrationActionCloseArrayInput
	Creates      IntegrationActionCreateArrayInput
	Ignores      IntegrationActionIgnoreArrayInput
	// ID of the parent integration resource to bind to.
	IntegrationId pulumi.StringPtrInput
}

func (IntegrationActionState) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationActionState)(nil)).Elem()
}

type integrationActionArgs struct {
	Acknowledges []IntegrationActionAcknowledge `pulumi:"acknowledges"`
	AddNotes     []IntegrationActionAddNote     `pulumi:"addNotes"`
	Closes       []IntegrationActionClose       `pulumi:"closes"`
	Creates      []IntegrationActionCreate      `pulumi:"creates"`
	Ignores      []IntegrationActionIgnore      `pulumi:"ignores"`
	// ID of the parent integration resource to bind to.
	IntegrationId string `pulumi:"integrationId"`
}

// The set of arguments for constructing a IntegrationAction resource.
type IntegrationActionArgs struct {
	Acknowledges IntegrationActionAcknowledgeArrayInput
	AddNotes     IntegrationActionAddNoteArrayInput
	Closes       IntegrationActionCloseArrayInput
	Creates      IntegrationActionCreateArrayInput
	Ignores      IntegrationActionIgnoreArrayInput
	// ID of the parent integration resource to bind to.
	IntegrationId pulumi.StringInput
}

func (IntegrationActionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*integrationActionArgs)(nil)).Elem()
}

type IntegrationActionInput interface {
	pulumi.Input

	ToIntegrationActionOutput() IntegrationActionOutput
	ToIntegrationActionOutputWithContext(ctx context.Context) IntegrationActionOutput
}

func (*IntegrationAction) ElementType() reflect.Type {
	return reflect.TypeOf((*IntegrationAction)(nil))
}

func (i *IntegrationAction) ToIntegrationActionOutput() IntegrationActionOutput {
	return i.ToIntegrationActionOutputWithContext(context.Background())
}

func (i *IntegrationAction) ToIntegrationActionOutputWithContext(ctx context.Context) IntegrationActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationActionOutput)
}

func (i *IntegrationAction) ToIntegrationActionPtrOutput() IntegrationActionPtrOutput {
	return i.ToIntegrationActionPtrOutputWithContext(context.Background())
}

func (i *IntegrationAction) ToIntegrationActionPtrOutputWithContext(ctx context.Context) IntegrationActionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationActionPtrOutput)
}

type IntegrationActionPtrInput interface {
	pulumi.Input

	ToIntegrationActionPtrOutput() IntegrationActionPtrOutput
	ToIntegrationActionPtrOutputWithContext(ctx context.Context) IntegrationActionPtrOutput
}

type integrationActionPtrType IntegrationActionArgs

func (*integrationActionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationAction)(nil))
}

func (i *integrationActionPtrType) ToIntegrationActionPtrOutput() IntegrationActionPtrOutput {
	return i.ToIntegrationActionPtrOutputWithContext(context.Background())
}

func (i *integrationActionPtrType) ToIntegrationActionPtrOutputWithContext(ctx context.Context) IntegrationActionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationActionPtrOutput)
}

// IntegrationActionArrayInput is an input type that accepts IntegrationActionArray and IntegrationActionArrayOutput values.
// You can construct a concrete instance of `IntegrationActionArrayInput` via:
//
//          IntegrationActionArray{ IntegrationActionArgs{...} }
type IntegrationActionArrayInput interface {
	pulumi.Input

	ToIntegrationActionArrayOutput() IntegrationActionArrayOutput
	ToIntegrationActionArrayOutputWithContext(context.Context) IntegrationActionArrayOutput
}

type IntegrationActionArray []IntegrationActionInput

func (IntegrationActionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationAction)(nil)).Elem()
}

func (i IntegrationActionArray) ToIntegrationActionArrayOutput() IntegrationActionArrayOutput {
	return i.ToIntegrationActionArrayOutputWithContext(context.Background())
}

func (i IntegrationActionArray) ToIntegrationActionArrayOutputWithContext(ctx context.Context) IntegrationActionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationActionArrayOutput)
}

// IntegrationActionMapInput is an input type that accepts IntegrationActionMap and IntegrationActionMapOutput values.
// You can construct a concrete instance of `IntegrationActionMapInput` via:
//
//          IntegrationActionMap{ "key": IntegrationActionArgs{...} }
type IntegrationActionMapInput interface {
	pulumi.Input

	ToIntegrationActionMapOutput() IntegrationActionMapOutput
	ToIntegrationActionMapOutputWithContext(context.Context) IntegrationActionMapOutput
}

type IntegrationActionMap map[string]IntegrationActionInput

func (IntegrationActionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationAction)(nil)).Elem()
}

func (i IntegrationActionMap) ToIntegrationActionMapOutput() IntegrationActionMapOutput {
	return i.ToIntegrationActionMapOutputWithContext(context.Background())
}

func (i IntegrationActionMap) ToIntegrationActionMapOutputWithContext(ctx context.Context) IntegrationActionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationActionMapOutput)
}

type IntegrationActionOutput struct{ *pulumi.OutputState }

func (IntegrationActionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*IntegrationAction)(nil))
}

func (o IntegrationActionOutput) ToIntegrationActionOutput() IntegrationActionOutput {
	return o
}

func (o IntegrationActionOutput) ToIntegrationActionOutputWithContext(ctx context.Context) IntegrationActionOutput {
	return o
}

func (o IntegrationActionOutput) ToIntegrationActionPtrOutput() IntegrationActionPtrOutput {
	return o.ToIntegrationActionPtrOutputWithContext(context.Background())
}

func (o IntegrationActionOutput) ToIntegrationActionPtrOutputWithContext(ctx context.Context) IntegrationActionPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v IntegrationAction) *IntegrationAction {
		return &v
	}).(IntegrationActionPtrOutput)
}

type IntegrationActionPtrOutput struct{ *pulumi.OutputState }

func (IntegrationActionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IntegrationAction)(nil))
}

func (o IntegrationActionPtrOutput) ToIntegrationActionPtrOutput() IntegrationActionPtrOutput {
	return o
}

func (o IntegrationActionPtrOutput) ToIntegrationActionPtrOutputWithContext(ctx context.Context) IntegrationActionPtrOutput {
	return o
}

func (o IntegrationActionPtrOutput) Elem() IntegrationActionOutput {
	return o.ApplyT(func(v *IntegrationAction) IntegrationAction {
		if v != nil {
			return *v
		}
		var ret IntegrationAction
		return ret
	}).(IntegrationActionOutput)
}

type IntegrationActionArrayOutput struct{ *pulumi.OutputState }

func (IntegrationActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]IntegrationAction)(nil))
}

func (o IntegrationActionArrayOutput) ToIntegrationActionArrayOutput() IntegrationActionArrayOutput {
	return o
}

func (o IntegrationActionArrayOutput) ToIntegrationActionArrayOutputWithContext(ctx context.Context) IntegrationActionArrayOutput {
	return o
}

func (o IntegrationActionArrayOutput) Index(i pulumi.IntInput) IntegrationActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) IntegrationAction {
		return vs[0].([]IntegrationAction)[vs[1].(int)]
	}).(IntegrationActionOutput)
}

type IntegrationActionMapOutput struct{ *pulumi.OutputState }

func (IntegrationActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]IntegrationAction)(nil))
}

func (o IntegrationActionMapOutput) ToIntegrationActionMapOutput() IntegrationActionMapOutput {
	return o
}

func (o IntegrationActionMapOutput) ToIntegrationActionMapOutputWithContext(ctx context.Context) IntegrationActionMapOutput {
	return o
}

func (o IntegrationActionMapOutput) MapIndex(k pulumi.StringInput) IntegrationActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) IntegrationAction {
		return vs[0].(map[string]IntegrationAction)[vs[1].(string)]
	}).(IntegrationActionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationActionInput)(nil)).Elem(), &IntegrationAction{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationActionPtrInput)(nil)).Elem(), &IntegrationAction{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationActionArrayInput)(nil)).Elem(), IntegrationActionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationActionMapInput)(nil)).Elem(), IntegrationActionMap{})
	pulumi.RegisterOutputType(IntegrationActionOutput{})
	pulumi.RegisterOutputType(IntegrationActionPtrOutput{})
	pulumi.RegisterOutputType(IntegrationActionArrayOutput{})
	pulumi.RegisterOutputType(IntegrationActionMapOutput{})
}
