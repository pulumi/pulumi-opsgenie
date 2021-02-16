// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a Maintenance within Opsgenie.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := opsgenie.NewMaintenance(ctx, "test", &opsgenie.MaintenanceArgs{
// 			Description: pulumi.String(fmt.Sprintf("%v%v%v", "geniemaintenance-", "%", "s")),
// 			Rules: opsgenie.MaintenanceRuleArray{
// 				&opsgenie.MaintenanceRuleArgs{
// 					Entities: opsgenie.MaintenanceRuleEntityArray{
// 						&opsgenie.MaintenanceRuleEntityArgs{
// 							Id:   pulumi.Any(opsgenie_email_integration.Test.Id),
// 							Type: pulumi.String("integration"),
// 						},
// 					},
// 					State: pulumi.String("enabled"),
// 				},
// 			},
// 			Times: opsgenie.MaintenanceTimeArray{
// 				&opsgenie.MaintenanceTimeArgs{
// 					EndDate:   pulumi.String(fmt.Sprintf("%v%v%v", "2019-06-", "%", "dT17:50:00Z")),
// 					StartDate: pulumi.String("2019-06-20T17:45:00Z"),
// 					Type:      pulumi.String("schedule"),
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
//
// ## Import
//
// Maintenance policies can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/maintenance:Maintenance test 812be1a1-32c8-4666-a7fb-03ecc385106c`
// ```
type Maintenance struct {
	pulumi.CustomResourceState

	// Description for the maintenance.
	Description pulumi.StringOutput `pulumi:"description"`
	// Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
	Rules MaintenanceRuleArrayOutput `pulumi:"rules"`
	// Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
	Times MaintenanceTimeArrayOutput `pulumi:"times"`
}

// NewMaintenance registers a new resource with the given unique name, arguments, and options.
func NewMaintenance(ctx *pulumi.Context,
	name string, args *MaintenanceArgs, opts ...pulumi.ResourceOption) (*Maintenance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Description == nil {
		return nil, errors.New("invalid value for required argument 'Description'")
	}
	if args.Rules == nil {
		return nil, errors.New("invalid value for required argument 'Rules'")
	}
	var resource Maintenance
	err := ctx.RegisterResource("opsgenie:index/maintenance:Maintenance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMaintenance gets an existing Maintenance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMaintenance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MaintenanceState, opts ...pulumi.ResourceOption) (*Maintenance, error) {
	var resource Maintenance
	err := ctx.ReadResource("opsgenie:index/maintenance:Maintenance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Maintenance resources.
type maintenanceState struct {
	// Description for the maintenance.
	Description *string `pulumi:"description"`
	// Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
	Rules []MaintenanceRule `pulumi:"rules"`
	// Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
	Times []MaintenanceTime `pulumi:"times"`
}

type MaintenanceState struct {
	// Description for the maintenance.
	Description pulumi.StringPtrInput
	// Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
	Rules MaintenanceRuleArrayInput
	// Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
	Times MaintenanceTimeArrayInput
}

func (MaintenanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*maintenanceState)(nil)).Elem()
}

type maintenanceArgs struct {
	// Description for the maintenance.
	Description string `pulumi:"description"`
	// Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
	Rules []MaintenanceRule `pulumi:"rules"`
	// Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
	Times []MaintenanceTime `pulumi:"times"`
}

// The set of arguments for constructing a Maintenance resource.
type MaintenanceArgs struct {
	// Description for the maintenance.
	Description pulumi.StringInput
	// Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
	Rules MaintenanceRuleArrayInput
	// Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
	Times MaintenanceTimeArrayInput
}

func (MaintenanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*maintenanceArgs)(nil)).Elem()
}

type MaintenanceInput interface {
	pulumi.Input

	ToMaintenanceOutput() MaintenanceOutput
	ToMaintenanceOutputWithContext(ctx context.Context) MaintenanceOutput
}

func (*Maintenance) ElementType() reflect.Type {
	return reflect.TypeOf((*Maintenance)(nil))
}

func (i *Maintenance) ToMaintenanceOutput() MaintenanceOutput {
	return i.ToMaintenanceOutputWithContext(context.Background())
}

func (i *Maintenance) ToMaintenanceOutputWithContext(ctx context.Context) MaintenanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaintenanceOutput)
}

func (i *Maintenance) ToMaintenancePtrOutput() MaintenancePtrOutput {
	return i.ToMaintenancePtrOutputWithContext(context.Background())
}

func (i *Maintenance) ToMaintenancePtrOutputWithContext(ctx context.Context) MaintenancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaintenancePtrOutput)
}

type MaintenancePtrInput interface {
	pulumi.Input

	ToMaintenancePtrOutput() MaintenancePtrOutput
	ToMaintenancePtrOutputWithContext(ctx context.Context) MaintenancePtrOutput
}

type maintenancePtrType MaintenanceArgs

func (*maintenancePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Maintenance)(nil))
}

func (i *maintenancePtrType) ToMaintenancePtrOutput() MaintenancePtrOutput {
	return i.ToMaintenancePtrOutputWithContext(context.Background())
}

func (i *maintenancePtrType) ToMaintenancePtrOutputWithContext(ctx context.Context) MaintenancePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaintenancePtrOutput)
}

// MaintenanceArrayInput is an input type that accepts MaintenanceArray and MaintenanceArrayOutput values.
// You can construct a concrete instance of `MaintenanceArrayInput` via:
//
//          MaintenanceArray{ MaintenanceArgs{...} }
type MaintenanceArrayInput interface {
	pulumi.Input

	ToMaintenanceArrayOutput() MaintenanceArrayOutput
	ToMaintenanceArrayOutputWithContext(context.Context) MaintenanceArrayOutput
}

type MaintenanceArray []MaintenanceInput

func (MaintenanceArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*Maintenance)(nil))
}

func (i MaintenanceArray) ToMaintenanceArrayOutput() MaintenanceArrayOutput {
	return i.ToMaintenanceArrayOutputWithContext(context.Background())
}

func (i MaintenanceArray) ToMaintenanceArrayOutputWithContext(ctx context.Context) MaintenanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaintenanceArrayOutput)
}

// MaintenanceMapInput is an input type that accepts MaintenanceMap and MaintenanceMapOutput values.
// You can construct a concrete instance of `MaintenanceMapInput` via:
//
//          MaintenanceMap{ "key": MaintenanceArgs{...} }
type MaintenanceMapInput interface {
	pulumi.Input

	ToMaintenanceMapOutput() MaintenanceMapOutput
	ToMaintenanceMapOutputWithContext(context.Context) MaintenanceMapOutput
}

type MaintenanceMap map[string]MaintenanceInput

func (MaintenanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*Maintenance)(nil))
}

func (i MaintenanceMap) ToMaintenanceMapOutput() MaintenanceMapOutput {
	return i.ToMaintenanceMapOutputWithContext(context.Background())
}

func (i MaintenanceMap) ToMaintenanceMapOutputWithContext(ctx context.Context) MaintenanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MaintenanceMapOutput)
}

type MaintenanceOutput struct {
	*pulumi.OutputState
}

func (MaintenanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*Maintenance)(nil))
}

func (o MaintenanceOutput) ToMaintenanceOutput() MaintenanceOutput {
	return o
}

func (o MaintenanceOutput) ToMaintenanceOutputWithContext(ctx context.Context) MaintenanceOutput {
	return o
}

func (o MaintenanceOutput) ToMaintenancePtrOutput() MaintenancePtrOutput {
	return o.ToMaintenancePtrOutputWithContext(context.Background())
}

func (o MaintenanceOutput) ToMaintenancePtrOutputWithContext(ctx context.Context) MaintenancePtrOutput {
	return o.ApplyT(func(v Maintenance) *Maintenance {
		return &v
	}).(MaintenancePtrOutput)
}

type MaintenancePtrOutput struct {
	*pulumi.OutputState
}

func (MaintenancePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Maintenance)(nil))
}

func (o MaintenancePtrOutput) ToMaintenancePtrOutput() MaintenancePtrOutput {
	return o
}

func (o MaintenancePtrOutput) ToMaintenancePtrOutputWithContext(ctx context.Context) MaintenancePtrOutput {
	return o
}

type MaintenanceArrayOutput struct{ *pulumi.OutputState }

func (MaintenanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Maintenance)(nil))
}

func (o MaintenanceArrayOutput) ToMaintenanceArrayOutput() MaintenanceArrayOutput {
	return o
}

func (o MaintenanceArrayOutput) ToMaintenanceArrayOutputWithContext(ctx context.Context) MaintenanceArrayOutput {
	return o
}

func (o MaintenanceArrayOutput) Index(i pulumi.IntInput) MaintenanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Maintenance {
		return vs[0].([]Maintenance)[vs[1].(int)]
	}).(MaintenanceOutput)
}

type MaintenanceMapOutput struct{ *pulumi.OutputState }

func (MaintenanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Maintenance)(nil))
}

func (o MaintenanceMapOutput) ToMaintenanceMapOutput() MaintenanceMapOutput {
	return o
}

func (o MaintenanceMapOutput) ToMaintenanceMapOutputWithContext(ctx context.Context) MaintenanceMapOutput {
	return o
}

func (o MaintenanceMapOutput) MapIndex(k pulumi.StringInput) MaintenanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Maintenance {
		return vs[0].(map[string]Maintenance)[vs[1].(string)]
	}).(MaintenanceOutput)
}

func init() {
	pulumi.RegisterOutputType(MaintenanceOutput{})
	pulumi.RegisterOutputType(MaintenancePtrOutput{})
	pulumi.RegisterOutputType(MaintenanceArrayOutput{})
	pulumi.RegisterOutputType(MaintenanceMapOutput{})
}
