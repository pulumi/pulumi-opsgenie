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

// Manages an Incident Template within Opsgenie.
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
//			testTeam, err := opsgenie.NewTeam(ctx, "testTeam", &opsgenie.TeamArgs{
//				Description: pulumi.String("This team deals with all the things"),
//			})
//			if err != nil {
//				return err
//			}
//			testService, err := opsgenie.NewService(ctx, "testService", &opsgenie.ServiceArgs{
//				TeamId: testTeam.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = opsgenie.NewIncidentTemplate(ctx, "testIncidentTemplate", &opsgenie.IncidentTemplateArgs{
//				Message:  pulumi.String("Incident Message"),
//				Priority: pulumi.String("P2"),
//				StakeholderProperties: opsgenie.IncidentTemplateStakeholderPropertyArray{
//					&opsgenie.IncidentTemplateStakeholderPropertyArgs{
//						Enable:      pulumi.Bool(true),
//						Message:     pulumi.String("Stakeholder Message"),
//						Description: pulumi.String("Stakeholder Description"),
//					},
//				},
//				Tags: pulumi.StringArray{
//					pulumi.String("tag1"),
//					pulumi.String("tag2"),
//				},
//				Description: pulumi.String("Incident Description"),
//				Details: pulumi.StringMap{
//					"key1": pulumi.String("value1"),
//					"key2": pulumi.String("value2"),
//				},
//				ImpactedServices: pulumi.StringArray{
//					testService.ID(),
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
// Service can be imported using the `template_id`, e.g.
//
// ```sh
// $ pulumi import opsgenie:index/incidentTemplate:IncidentTemplate test template_id`
// ```
type IncidentTemplate struct {
	pulumi.CustomResourceState

	// Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
	Details          pulumi.StringMapOutput   `pulumi:"details"`
	ImpactedServices pulumi.StringArrayOutput `pulumi:"impactedServices"`
	// Message that is to be passed to audience that is generally used to provide a content information about the alert.
	Message pulumi.StringOutput `pulumi:"message"`
	// Name of the incident template.
	Name pulumi.StringOutput `pulumi:"name"`
	// Priority level of the incident. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`.
	Priority              pulumi.StringOutput                            `pulumi:"priority"`
	StakeholderProperties IncidentTemplateStakeholderPropertyArrayOutput `pulumi:"stakeholderProperties"`
	// Tags of the incident template.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewIncidentTemplate registers a new resource with the given unique name, arguments, and options.
func NewIncidentTemplate(ctx *pulumi.Context,
	name string, args *IncidentTemplateArgs, opts ...pulumi.ResourceOption) (*IncidentTemplate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Message == nil {
		return nil, errors.New("invalid value for required argument 'Message'")
	}
	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	if args.StakeholderProperties == nil {
		return nil, errors.New("invalid value for required argument 'StakeholderProperties'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource IncidentTemplate
	err := ctx.RegisterResource("opsgenie:index/incidentTemplate:IncidentTemplate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetIncidentTemplate gets an existing IncidentTemplate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetIncidentTemplate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *IncidentTemplateState, opts ...pulumi.ResourceOption) (*IncidentTemplate, error) {
	var resource IncidentTemplate
	err := ctx.ReadResource("opsgenie:index/incidentTemplate:IncidentTemplate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering IncidentTemplate resources.
type incidentTemplateState struct {
	// Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
	Description *string `pulumi:"description"`
	// Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
	Details          map[string]string `pulumi:"details"`
	ImpactedServices []string          `pulumi:"impactedServices"`
	// Message that is to be passed to audience that is generally used to provide a content information about the alert.
	Message *string `pulumi:"message"`
	// Name of the incident template.
	Name *string `pulumi:"name"`
	// Priority level of the incident. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`.
	Priority              *string                               `pulumi:"priority"`
	StakeholderProperties []IncidentTemplateStakeholderProperty `pulumi:"stakeholderProperties"`
	// Tags of the incident template.
	Tags []string `pulumi:"tags"`
}

type IncidentTemplateState struct {
	// Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
	Description pulumi.StringPtrInput
	// Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
	Details          pulumi.StringMapInput
	ImpactedServices pulumi.StringArrayInput
	// Message that is to be passed to audience that is generally used to provide a content information about the alert.
	Message pulumi.StringPtrInput
	// Name of the incident template.
	Name pulumi.StringPtrInput
	// Priority level of the incident. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`.
	Priority              pulumi.StringPtrInput
	StakeholderProperties IncidentTemplateStakeholderPropertyArrayInput
	// Tags of the incident template.
	Tags pulumi.StringArrayInput
}

func (IncidentTemplateState) ElementType() reflect.Type {
	return reflect.TypeOf((*incidentTemplateState)(nil)).Elem()
}

type incidentTemplateArgs struct {
	// Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
	Description *string `pulumi:"description"`
	// Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
	Details          map[string]string `pulumi:"details"`
	ImpactedServices []string          `pulumi:"impactedServices"`
	// Message that is to be passed to audience that is generally used to provide a content information about the alert.
	Message string `pulumi:"message"`
	// Name of the incident template.
	Name *string `pulumi:"name"`
	// Priority level of the incident. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`.
	Priority              string                                `pulumi:"priority"`
	StakeholderProperties []IncidentTemplateStakeholderProperty `pulumi:"stakeholderProperties"`
	// Tags of the incident template.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a IncidentTemplate resource.
type IncidentTemplateArgs struct {
	// Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
	Description pulumi.StringPtrInput
	// Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
	Details          pulumi.StringMapInput
	ImpactedServices pulumi.StringArrayInput
	// Message that is to be passed to audience that is generally used to provide a content information about the alert.
	Message pulumi.StringInput
	// Name of the incident template.
	Name pulumi.StringPtrInput
	// Priority level of the incident. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`.
	Priority              pulumi.StringInput
	StakeholderProperties IncidentTemplateStakeholderPropertyArrayInput
	// Tags of the incident template.
	Tags pulumi.StringArrayInput
}

func (IncidentTemplateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*incidentTemplateArgs)(nil)).Elem()
}

type IncidentTemplateInput interface {
	pulumi.Input

	ToIncidentTemplateOutput() IncidentTemplateOutput
	ToIncidentTemplateOutputWithContext(ctx context.Context) IncidentTemplateOutput
}

func (*IncidentTemplate) ElementType() reflect.Type {
	return reflect.TypeOf((**IncidentTemplate)(nil)).Elem()
}

func (i *IncidentTemplate) ToIncidentTemplateOutput() IncidentTemplateOutput {
	return i.ToIncidentTemplateOutputWithContext(context.Background())
}

func (i *IncidentTemplate) ToIncidentTemplateOutputWithContext(ctx context.Context) IncidentTemplateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentTemplateOutput)
}

// IncidentTemplateArrayInput is an input type that accepts IncidentTemplateArray and IncidentTemplateArrayOutput values.
// You can construct a concrete instance of `IncidentTemplateArrayInput` via:
//
//	IncidentTemplateArray{ IncidentTemplateArgs{...} }
type IncidentTemplateArrayInput interface {
	pulumi.Input

	ToIncidentTemplateArrayOutput() IncidentTemplateArrayOutput
	ToIncidentTemplateArrayOutputWithContext(context.Context) IncidentTemplateArrayOutput
}

type IncidentTemplateArray []IncidentTemplateInput

func (IncidentTemplateArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IncidentTemplate)(nil)).Elem()
}

func (i IncidentTemplateArray) ToIncidentTemplateArrayOutput() IncidentTemplateArrayOutput {
	return i.ToIncidentTemplateArrayOutputWithContext(context.Background())
}

func (i IncidentTemplateArray) ToIncidentTemplateArrayOutputWithContext(ctx context.Context) IncidentTemplateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentTemplateArrayOutput)
}

// IncidentTemplateMapInput is an input type that accepts IncidentTemplateMap and IncidentTemplateMapOutput values.
// You can construct a concrete instance of `IncidentTemplateMapInput` via:
//
//	IncidentTemplateMap{ "key": IncidentTemplateArgs{...} }
type IncidentTemplateMapInput interface {
	pulumi.Input

	ToIncidentTemplateMapOutput() IncidentTemplateMapOutput
	ToIncidentTemplateMapOutputWithContext(context.Context) IncidentTemplateMapOutput
}

type IncidentTemplateMap map[string]IncidentTemplateInput

func (IncidentTemplateMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IncidentTemplate)(nil)).Elem()
}

func (i IncidentTemplateMap) ToIncidentTemplateMapOutput() IncidentTemplateMapOutput {
	return i.ToIncidentTemplateMapOutputWithContext(context.Background())
}

func (i IncidentTemplateMap) ToIncidentTemplateMapOutputWithContext(ctx context.Context) IncidentTemplateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(IncidentTemplateMapOutput)
}

type IncidentTemplateOutput struct{ *pulumi.OutputState }

func (IncidentTemplateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**IncidentTemplate)(nil)).Elem()
}

func (o IncidentTemplateOutput) ToIncidentTemplateOutput() IncidentTemplateOutput {
	return o
}

func (o IncidentTemplateOutput) ToIncidentTemplateOutputWithContext(ctx context.Context) IncidentTemplateOutput {
	return o
}

// Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
func (o IncidentTemplateOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *IncidentTemplate) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Map of key-value pairs to use as custom properties of the incident template. This field must not be longer than 8000 characters.
func (o IncidentTemplateOutput) Details() pulumi.StringMapOutput {
	return o.ApplyT(func(v *IncidentTemplate) pulumi.StringMapOutput { return v.Details }).(pulumi.StringMapOutput)
}

func (o IncidentTemplateOutput) ImpactedServices() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IncidentTemplate) pulumi.StringArrayOutput { return v.ImpactedServices }).(pulumi.StringArrayOutput)
}

// Message that is to be passed to audience that is generally used to provide a content information about the alert.
func (o IncidentTemplateOutput) Message() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentTemplate) pulumi.StringOutput { return v.Message }).(pulumi.StringOutput)
}

// Name of the incident template.
func (o IncidentTemplateOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentTemplate) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Priority level of the incident. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`.
func (o IncidentTemplateOutput) Priority() pulumi.StringOutput {
	return o.ApplyT(func(v *IncidentTemplate) pulumi.StringOutput { return v.Priority }).(pulumi.StringOutput)
}

func (o IncidentTemplateOutput) StakeholderProperties() IncidentTemplateStakeholderPropertyArrayOutput {
	return o.ApplyT(func(v *IncidentTemplate) IncidentTemplateStakeholderPropertyArrayOutput {
		return v.StakeholderProperties
	}).(IncidentTemplateStakeholderPropertyArrayOutput)
}

// Tags of the incident template.
func (o IncidentTemplateOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *IncidentTemplate) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type IncidentTemplateArrayOutput struct{ *pulumi.OutputState }

func (IncidentTemplateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*IncidentTemplate)(nil)).Elem()
}

func (o IncidentTemplateArrayOutput) ToIncidentTemplateArrayOutput() IncidentTemplateArrayOutput {
	return o
}

func (o IncidentTemplateArrayOutput) ToIncidentTemplateArrayOutputWithContext(ctx context.Context) IncidentTemplateArrayOutput {
	return o
}

func (o IncidentTemplateArrayOutput) Index(i pulumi.IntInput) IncidentTemplateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *IncidentTemplate {
		return vs[0].([]*IncidentTemplate)[vs[1].(int)]
	}).(IncidentTemplateOutput)
}

type IncidentTemplateMapOutput struct{ *pulumi.OutputState }

func (IncidentTemplateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*IncidentTemplate)(nil)).Elem()
}

func (o IncidentTemplateMapOutput) ToIncidentTemplateMapOutput() IncidentTemplateMapOutput {
	return o
}

func (o IncidentTemplateMapOutput) ToIncidentTemplateMapOutputWithContext(ctx context.Context) IncidentTemplateMapOutput {
	return o
}

func (o IncidentTemplateMapOutput) MapIndex(k pulumi.StringInput) IncidentTemplateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *IncidentTemplate {
		return vs[0].(map[string]*IncidentTemplate)[vs[1].(string)]
	}).(IncidentTemplateOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentTemplateInput)(nil)).Elem(), &IncidentTemplate{})
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentTemplateArrayInput)(nil)).Elem(), IncidentTemplateArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*IncidentTemplateMapInput)(nil)).Elem(), IncidentTemplateMap{})
	pulumi.RegisterOutputType(IncidentTemplateOutput{})
	pulumi.RegisterOutputType(IncidentTemplateArrayOutput{})
	pulumi.RegisterOutputType(IncidentTemplateMapOutput{})
}
