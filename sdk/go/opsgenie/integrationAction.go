// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"errors"
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
	return reflect.TypeOf((**IntegrationAction)(nil)).Elem()
}

func (i *IntegrationAction) ToIntegrationActionOutput() IntegrationActionOutput {
	return i.ToIntegrationActionOutputWithContext(context.Background())
}

func (i *IntegrationAction) ToIntegrationActionOutputWithContext(ctx context.Context) IntegrationActionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IntegrationActionOutput)
}

// IntegrationActionArrayInput is an input type that accepts IntegrationActionArray and IntegrationActionArrayOutput values.
// You can construct a concrete instance of `IntegrationActionArrayInput` via:
//
//	IntegrationActionArray{ IntegrationActionArgs{...} }
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
//	IntegrationActionMap{ "key": IntegrationActionArgs{...} }
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
	return reflect.TypeOf((**IntegrationAction)(nil)).Elem()
}

func (o IntegrationActionOutput) ToIntegrationActionOutput() IntegrationActionOutput {
	return o
}

func (o IntegrationActionOutput) ToIntegrationActionOutputWithContext(ctx context.Context) IntegrationActionOutput {
	return o
}

func (o IntegrationActionOutput) Acknowledges() IntegrationActionAcknowledgeArrayOutput {
	return o.ApplyT(func(v *IntegrationAction) IntegrationActionAcknowledgeArrayOutput { return v.Acknowledges }).(IntegrationActionAcknowledgeArrayOutput)
}

func (o IntegrationActionOutput) AddNotes() IntegrationActionAddNoteArrayOutput {
	return o.ApplyT(func(v *IntegrationAction) IntegrationActionAddNoteArrayOutput { return v.AddNotes }).(IntegrationActionAddNoteArrayOutput)
}

func (o IntegrationActionOutput) Closes() IntegrationActionCloseArrayOutput {
	return o.ApplyT(func(v *IntegrationAction) IntegrationActionCloseArrayOutput { return v.Closes }).(IntegrationActionCloseArrayOutput)
}

func (o IntegrationActionOutput) Creates() IntegrationActionCreateArrayOutput {
	return o.ApplyT(func(v *IntegrationAction) IntegrationActionCreateArrayOutput { return v.Creates }).(IntegrationActionCreateArrayOutput)
}

func (o IntegrationActionOutput) Ignores() IntegrationActionIgnoreArrayOutput {
	return o.ApplyT(func(v *IntegrationAction) IntegrationActionIgnoreArrayOutput { return v.Ignores }).(IntegrationActionIgnoreArrayOutput)
}

// ID of the parent integration resource to bind to.
func (o IntegrationActionOutput) IntegrationId() pulumi.StringOutput {
	return o.ApplyT(func(v *IntegrationAction) pulumi.StringOutput { return v.IntegrationId }).(pulumi.StringOutput)
}

type IntegrationActionArrayOutput struct{ *pulumi.OutputState }

func (IntegrationActionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IntegrationAction)(nil)).Elem()
}

func (o IntegrationActionArrayOutput) ToIntegrationActionArrayOutput() IntegrationActionArrayOutput {
	return o
}

func (o IntegrationActionArrayOutput) ToIntegrationActionArrayOutputWithContext(ctx context.Context) IntegrationActionArrayOutput {
	return o
}

func (o IntegrationActionArrayOutput) Index(i pulumi.IntInput) IntegrationActionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IntegrationAction {
		return vs[0].([]*IntegrationAction)[vs[1].(int)]
	}).(IntegrationActionOutput)
}

type IntegrationActionMapOutput struct{ *pulumi.OutputState }

func (IntegrationActionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IntegrationAction)(nil)).Elem()
}

func (o IntegrationActionMapOutput) ToIntegrationActionMapOutput() IntegrationActionMapOutput {
	return o
}

func (o IntegrationActionMapOutput) ToIntegrationActionMapOutputWithContext(ctx context.Context) IntegrationActionMapOutput {
	return o
}

func (o IntegrationActionMapOutput) MapIndex(k pulumi.StringInput) IntegrationActionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IntegrationAction {
		return vs[0].(map[string]*IntegrationAction)[vs[1].(string)]
	}).(IntegrationActionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationActionInput)(nil)).Elem(), &IntegrationAction{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationActionArrayInput)(nil)).Elem(), IntegrationActionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IntegrationActionMapInput)(nil)).Elem(), IntegrationActionMap{})
	pulumi.RegisterOutputType(IntegrationActionOutput{})
	pulumi.RegisterOutputType(IntegrationActionArrayOutput{})
	pulumi.RegisterOutputType(IntegrationActionMapOutput{})
}
