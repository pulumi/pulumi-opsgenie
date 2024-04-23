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

// Manages a Service Incident Rule within Opsgenie.
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
//			test, err := opsgenie.NewTeam(ctx, "test", &opsgenie.TeamArgs{
//				Name:        pulumi.String("example-team"),
//				Description: pulumi.String("This team deals with all the things"),
//			})
//			if err != nil {
//				return err
//			}
//			testService, err := opsgenie.NewService(ctx, "test", &opsgenie.ServiceArgs{
//				Name:   pulumi.String("example-service"),
//				TeamId: test.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = opsgenie.NewServiceIncidentRule(ctx, "test", &opsgenie.ServiceIncidentRuleArgs{
//				ServiceId: testService.ID(),
//				IncidentRules: opsgenie.ServiceIncidentRuleIncidentRuleArray{
//					&opsgenie.ServiceIncidentRuleIncidentRuleArgs{
//						ConditionMatchType: pulumi.String("match-any-condition"),
//						Conditions: opsgenie.ServiceIncidentRuleIncidentRuleConditionArray{
//							&opsgenie.ServiceIncidentRuleIncidentRuleConditionArgs{
//								Field:         pulumi.String("message"),
//								Not:           pulumi.Bool(false),
//								Operation:     pulumi.String("contains"),
//								ExpectedValue: pulumi.String("expected1"),
//							},
//							&opsgenie.ServiceIncidentRuleIncidentRuleConditionArgs{
//								Field:         pulumi.String("message"),
//								Not:           pulumi.Bool(false),
//								Operation:     pulumi.String("contains"),
//								ExpectedValue: pulumi.String("expected2"),
//							},
//						},
//						IncidentProperties: opsgenie.ServiceIncidentRuleIncidentRuleIncidentPropertyArray{
//							&opsgenie.ServiceIncidentRuleIncidentRuleIncidentPropertyArgs{
//								Message:  pulumi.String("This is a test message"),
//								Priority: pulumi.String("P3"),
//								StakeholderProperties: opsgenie.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArray{
//									&opsgenie.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderPropertyArgs{
//										Message: pulumi.String("Message for stakeholders"),
//										Enable:  pulumi.Bool(true),
//									},
//								},
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
//
// ## Import
//
// Service Incident Rule can be imported using the `service_id/service_incident_rule_id`, e.g.
//
// ```sh
// $ pulumi import opsgenie:index/serviceIncidentRule:ServiceIncidentRule this service_id/service_incident_rule_id`
// ```
type ServiceIncidentRule struct {
	pulumi.CustomResourceState

	// This is the rule configuration for this incident rule. This is a block, structure is documented below.
	IncidentRules ServiceIncidentRuleIncidentRuleArrayOutput `pulumi:"incidentRules"`
	// ID of the service associated
	ServiceId pulumi.StringOutput `pulumi:"serviceId"`
}

// NewServiceIncidentRule registers a new resource with the given unique name, arguments, and options.
func NewServiceIncidentRule(ctx *pulumi.Context,
	name string, args *ServiceIncidentRuleArgs, opts ...pulumi.ResourceOption) (*ServiceIncidentRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IncidentRules == nil {
		return nil, errors.New("invalid value for required argument 'IncidentRules'")
	}
	if args.ServiceId == nil {
		return nil, errors.New("invalid value for required argument 'ServiceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServiceIncidentRule
	err := ctx.RegisterResource("opsgenie:index/serviceIncidentRule:ServiceIncidentRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServiceIncidentRule gets an existing ServiceIncidentRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServiceIncidentRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServiceIncidentRuleState, opts ...pulumi.ResourceOption) (*ServiceIncidentRule, error) {
	var resource ServiceIncidentRule
	err := ctx.ReadResource("opsgenie:index/serviceIncidentRule:ServiceIncidentRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServiceIncidentRule resources.
type serviceIncidentRuleState struct {
	// This is the rule configuration for this incident rule. This is a block, structure is documented below.
	IncidentRules []ServiceIncidentRuleIncidentRule `pulumi:"incidentRules"`
	// ID of the service associated
	ServiceId *string `pulumi:"serviceId"`
}

type ServiceIncidentRuleState struct {
	// This is the rule configuration for this incident rule. This is a block, structure is documented below.
	IncidentRules ServiceIncidentRuleIncidentRuleArrayInput
	// ID of the service associated
	ServiceId pulumi.StringPtrInput
}

func (ServiceIncidentRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIncidentRuleState)(nil)).Elem()
}

type serviceIncidentRuleArgs struct {
	// This is the rule configuration for this incident rule. This is a block, structure is documented below.
	IncidentRules []ServiceIncidentRuleIncidentRule `pulumi:"incidentRules"`
	// ID of the service associated
	ServiceId string `pulumi:"serviceId"`
}

// The set of arguments for constructing a ServiceIncidentRule resource.
type ServiceIncidentRuleArgs struct {
	// This is the rule configuration for this incident rule. This is a block, structure is documented below.
	IncidentRules ServiceIncidentRuleIncidentRuleArrayInput
	// ID of the service associated
	ServiceId pulumi.StringInput
}

func (ServiceIncidentRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serviceIncidentRuleArgs)(nil)).Elem()
}

type ServiceIncidentRuleInput interface {
	pulumi.Input

	ToServiceIncidentRuleOutput() ServiceIncidentRuleOutput
	ToServiceIncidentRuleOutputWithContext(ctx context.Context) ServiceIncidentRuleOutput
}

func (*ServiceIncidentRule) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIncidentRule)(nil)).Elem()
}

func (i *ServiceIncidentRule) ToServiceIncidentRuleOutput() ServiceIncidentRuleOutput {
	return i.ToServiceIncidentRuleOutputWithContext(context.Background())
}

func (i *ServiceIncidentRule) ToServiceIncidentRuleOutputWithContext(ctx context.Context) ServiceIncidentRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIncidentRuleOutput)
}

// ServiceIncidentRuleArrayInput is an input type that accepts ServiceIncidentRuleArray and ServiceIncidentRuleArrayOutput values.
// You can construct a concrete instance of `ServiceIncidentRuleArrayInput` via:
//
//	ServiceIncidentRuleArray{ ServiceIncidentRuleArgs{...} }
type ServiceIncidentRuleArrayInput interface {
	pulumi.Input

	ToServiceIncidentRuleArrayOutput() ServiceIncidentRuleArrayOutput
	ToServiceIncidentRuleArrayOutputWithContext(context.Context) ServiceIncidentRuleArrayOutput
}

type ServiceIncidentRuleArray []ServiceIncidentRuleInput

func (ServiceIncidentRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceIncidentRule)(nil)).Elem()
}

func (i ServiceIncidentRuleArray) ToServiceIncidentRuleArrayOutput() ServiceIncidentRuleArrayOutput {
	return i.ToServiceIncidentRuleArrayOutputWithContext(context.Background())
}

func (i ServiceIncidentRuleArray) ToServiceIncidentRuleArrayOutputWithContext(ctx context.Context) ServiceIncidentRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIncidentRuleArrayOutput)
}

// ServiceIncidentRuleMapInput is an input type that accepts ServiceIncidentRuleMap and ServiceIncidentRuleMapOutput values.
// You can construct a concrete instance of `ServiceIncidentRuleMapInput` via:
//
//	ServiceIncidentRuleMap{ "key": ServiceIncidentRuleArgs{...} }
type ServiceIncidentRuleMapInput interface {
	pulumi.Input

	ToServiceIncidentRuleMapOutput() ServiceIncidentRuleMapOutput
	ToServiceIncidentRuleMapOutputWithContext(context.Context) ServiceIncidentRuleMapOutput
}

type ServiceIncidentRuleMap map[string]ServiceIncidentRuleInput

func (ServiceIncidentRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceIncidentRule)(nil)).Elem()
}

func (i ServiceIncidentRuleMap) ToServiceIncidentRuleMapOutput() ServiceIncidentRuleMapOutput {
	return i.ToServiceIncidentRuleMapOutputWithContext(context.Background())
}

func (i ServiceIncidentRuleMap) ToServiceIncidentRuleMapOutputWithContext(ctx context.Context) ServiceIncidentRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServiceIncidentRuleMapOutput)
}

type ServiceIncidentRuleOutput struct{ *pulumi.OutputState }

func (ServiceIncidentRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServiceIncidentRule)(nil)).Elem()
}

func (o ServiceIncidentRuleOutput) ToServiceIncidentRuleOutput() ServiceIncidentRuleOutput {
	return o
}

func (o ServiceIncidentRuleOutput) ToServiceIncidentRuleOutputWithContext(ctx context.Context) ServiceIncidentRuleOutput {
	return o
}

// This is the rule configuration for this incident rule. This is a block, structure is documented below.
func (o ServiceIncidentRuleOutput) IncidentRules() ServiceIncidentRuleIncidentRuleArrayOutput {
	return o.ApplyT(func(v *ServiceIncidentRule) ServiceIncidentRuleIncidentRuleArrayOutput { return v.IncidentRules }).(ServiceIncidentRuleIncidentRuleArrayOutput)
}

// ID of the service associated
func (o ServiceIncidentRuleOutput) ServiceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServiceIncidentRule) pulumi.StringOutput { return v.ServiceId }).(pulumi.StringOutput)
}

type ServiceIncidentRuleArrayOutput struct{ *pulumi.OutputState }

func (ServiceIncidentRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServiceIncidentRule)(nil)).Elem()
}

func (o ServiceIncidentRuleArrayOutput) ToServiceIncidentRuleArrayOutput() ServiceIncidentRuleArrayOutput {
	return o
}

func (o ServiceIncidentRuleArrayOutput) ToServiceIncidentRuleArrayOutputWithContext(ctx context.Context) ServiceIncidentRuleArrayOutput {
	return o
}

func (o ServiceIncidentRuleArrayOutput) Index(i pulumi.IntInput) ServiceIncidentRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServiceIncidentRule {
		return vs[0].([]*ServiceIncidentRule)[vs[1].(int)]
	}).(ServiceIncidentRuleOutput)
}

type ServiceIncidentRuleMapOutput struct{ *pulumi.OutputState }

func (ServiceIncidentRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServiceIncidentRule)(nil)).Elem()
}

func (o ServiceIncidentRuleMapOutput) ToServiceIncidentRuleMapOutput() ServiceIncidentRuleMapOutput {
	return o
}

func (o ServiceIncidentRuleMapOutput) ToServiceIncidentRuleMapOutputWithContext(ctx context.Context) ServiceIncidentRuleMapOutput {
	return o
}

func (o ServiceIncidentRuleMapOutput) MapIndex(k pulumi.StringInput) ServiceIncidentRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServiceIncidentRule {
		return vs[0].(map[string]*ServiceIncidentRule)[vs[1].(string)]
	}).(ServiceIncidentRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIncidentRuleInput)(nil)).Elem(), &ServiceIncidentRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIncidentRuleArrayInput)(nil)).Elem(), ServiceIncidentRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServiceIncidentRuleMapInput)(nil)).Elem(), ServiceIncidentRuleMap{})
	pulumi.RegisterOutputType(ServiceIncidentRuleOutput{})
	pulumi.RegisterOutputType(ServiceIncidentRuleArrayOutput{})
	pulumi.RegisterOutputType(ServiceIncidentRuleMapOutput{})
}
