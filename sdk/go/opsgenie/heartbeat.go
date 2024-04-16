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

// Manages heartbeat within Opsgenie.
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
//			_, err := opsgenie.NewHeartbeat(ctx, "test", &opsgenie.HeartbeatArgs{
//				Name:          pulumi.String("genieheartbeat-test"),
//				Description:   pulumi.String("test opsgenie heartbeat terraform"),
//				IntervalUnit:  pulumi.String("minutes"),
//				Interval:      pulumi.Int(10),
//				Enabled:       pulumi.Bool(false),
//				AlertMessage:  pulumi.String("Test"),
//				AlertPriority: pulumi.String("P3"),
//				AlertTags: pulumi.StringArray{
//					pulumi.String("test"),
//					pulumi.String("fahri"),
//				},
//				OwnerTeamId: pulumi.Any(testOpsgenieTeam.Id),
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
// Heartbeat Integrations can be imported using the `name`, e.g.
//
// ```sh
// $ pulumi import opsgenie:index/heartbeat:Heartbeat test name`
// ```
type Heartbeat struct {
	pulumi.CustomResourceState

	// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
	AlertMessage pulumi.StringPtrOutput `pulumi:"alertMessage"`
	// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
	AlertPriority pulumi.StringPtrOutput `pulumi:"alertPriority"`
	// Specifies the alert tags for heartbeat expiration alert.
	AlertTags pulumi.StringArrayOutput `pulumi:"alertTags"`
	// An optional description of the heartbeat
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Enable/disable heartbeat monitoring.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Specifies how often a heartbeat message should be expected.
	Interval pulumi.IntOutput `pulumi:"interval"`
	// Interval specified as minutes, hours or days.
	IntervalUnit pulumi.StringOutput `pulumi:"intervalUnit"`
	// Name of the heartbeat
	Name pulumi.StringOutput `pulumi:"name"`
	// Owner team of the heartbeat.
	OwnerTeamId pulumi.StringPtrOutput `pulumi:"ownerTeamId"`
}

// NewHeartbeat registers a new resource with the given unique name, arguments, and options.
func NewHeartbeat(ctx *pulumi.Context,
	name string, args *HeartbeatArgs, opts ...pulumi.ResourceOption) (*Heartbeat, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.Interval == nil {
		return nil, errors.New("invalid value for required argument 'Interval'")
	}
	if args.IntervalUnit == nil {
		return nil, errors.New("invalid value for required argument 'IntervalUnit'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Heartbeat
	err := ctx.RegisterResource("opsgenie:index/heartbeat:Heartbeat", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHeartbeat gets an existing Heartbeat resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHeartbeat(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HeartbeatState, opts ...pulumi.ResourceOption) (*Heartbeat, error) {
	var resource Heartbeat
	err := ctx.ReadResource("opsgenie:index/heartbeat:Heartbeat", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Heartbeat resources.
type heartbeatState struct {
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
	Name *string `pulumi:"name"`
	// Owner team of the heartbeat.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
}

type HeartbeatState struct {
	// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
	AlertMessage pulumi.StringPtrInput
	// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
	AlertPriority pulumi.StringPtrInput
	// Specifies the alert tags for heartbeat expiration alert.
	AlertTags pulumi.StringArrayInput
	// An optional description of the heartbeat
	Description pulumi.StringPtrInput
	// Enable/disable heartbeat monitoring.
	Enabled pulumi.BoolPtrInput
	// Specifies how often a heartbeat message should be expected.
	Interval pulumi.IntPtrInput
	// Interval specified as minutes, hours or days.
	IntervalUnit pulumi.StringPtrInput
	// Name of the heartbeat
	Name pulumi.StringPtrInput
	// Owner team of the heartbeat.
	OwnerTeamId pulumi.StringPtrInput
}

func (HeartbeatState) ElementType() reflect.Type {
	return reflect.TypeOf((*heartbeatState)(nil)).Elem()
}

type heartbeatArgs struct {
	// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
	AlertMessage *string `pulumi:"alertMessage"`
	// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
	AlertPriority *string `pulumi:"alertPriority"`
	// Specifies the alert tags for heartbeat expiration alert.
	AlertTags []string `pulumi:"alertTags"`
	// An optional description of the heartbeat
	Description *string `pulumi:"description"`
	// Enable/disable heartbeat monitoring.
	Enabled bool `pulumi:"enabled"`
	// Specifies how often a heartbeat message should be expected.
	Interval int `pulumi:"interval"`
	// Interval specified as minutes, hours or days.
	IntervalUnit string `pulumi:"intervalUnit"`
	// Name of the heartbeat
	Name *string `pulumi:"name"`
	// Owner team of the heartbeat.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
}

// The set of arguments for constructing a Heartbeat resource.
type HeartbeatArgs struct {
	// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
	AlertMessage pulumi.StringPtrInput
	// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
	AlertPriority pulumi.StringPtrInput
	// Specifies the alert tags for heartbeat expiration alert.
	AlertTags pulumi.StringArrayInput
	// An optional description of the heartbeat
	Description pulumi.StringPtrInput
	// Enable/disable heartbeat monitoring.
	Enabled pulumi.BoolInput
	// Specifies how often a heartbeat message should be expected.
	Interval pulumi.IntInput
	// Interval specified as minutes, hours or days.
	IntervalUnit pulumi.StringInput
	// Name of the heartbeat
	Name pulumi.StringPtrInput
	// Owner team of the heartbeat.
	OwnerTeamId pulumi.StringPtrInput
}

func (HeartbeatArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*heartbeatArgs)(nil)).Elem()
}

type HeartbeatInput interface {
	pulumi.Input

	ToHeartbeatOutput() HeartbeatOutput
	ToHeartbeatOutputWithContext(ctx context.Context) HeartbeatOutput
}

func (*Heartbeat) ElementType() reflect.Type {
	return reflect.TypeOf((**Heartbeat)(nil)).Elem()
}

func (i *Heartbeat) ToHeartbeatOutput() HeartbeatOutput {
	return i.ToHeartbeatOutputWithContext(context.Background())
}

func (i *Heartbeat) ToHeartbeatOutputWithContext(ctx context.Context) HeartbeatOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HeartbeatOutput)
}

// HeartbeatArrayInput is an input type that accepts HeartbeatArray and HeartbeatArrayOutput values.
// You can construct a concrete instance of `HeartbeatArrayInput` via:
//
//	HeartbeatArray{ HeartbeatArgs{...} }
type HeartbeatArrayInput interface {
	pulumi.Input

	ToHeartbeatArrayOutput() HeartbeatArrayOutput
	ToHeartbeatArrayOutputWithContext(context.Context) HeartbeatArrayOutput
}

type HeartbeatArray []HeartbeatInput

func (HeartbeatArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Heartbeat)(nil)).Elem()
}

func (i HeartbeatArray) ToHeartbeatArrayOutput() HeartbeatArrayOutput {
	return i.ToHeartbeatArrayOutputWithContext(context.Background())
}

func (i HeartbeatArray) ToHeartbeatArrayOutputWithContext(ctx context.Context) HeartbeatArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HeartbeatArrayOutput)
}

// HeartbeatMapInput is an input type that accepts HeartbeatMap and HeartbeatMapOutput values.
// You can construct a concrete instance of `HeartbeatMapInput` via:
//
//	HeartbeatMap{ "key": HeartbeatArgs{...} }
type HeartbeatMapInput interface {
	pulumi.Input

	ToHeartbeatMapOutput() HeartbeatMapOutput
	ToHeartbeatMapOutputWithContext(context.Context) HeartbeatMapOutput
}

type HeartbeatMap map[string]HeartbeatInput

func (HeartbeatMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Heartbeat)(nil)).Elem()
}

func (i HeartbeatMap) ToHeartbeatMapOutput() HeartbeatMapOutput {
	return i.ToHeartbeatMapOutputWithContext(context.Background())
}

func (i HeartbeatMap) ToHeartbeatMapOutputWithContext(ctx context.Context) HeartbeatMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HeartbeatMapOutput)
}

type HeartbeatOutput struct{ *pulumi.OutputState }

func (HeartbeatOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Heartbeat)(nil)).Elem()
}

func (o HeartbeatOutput) ToHeartbeatOutput() HeartbeatOutput {
	return o
}

func (o HeartbeatOutput) ToHeartbeatOutputWithContext(ctx context.Context) HeartbeatOutput {
	return o
}

// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
func (o HeartbeatOutput) AlertMessage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Heartbeat) pulumi.StringPtrOutput { return v.AlertMessage }).(pulumi.StringPtrOutput)
}

// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
func (o HeartbeatOutput) AlertPriority() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Heartbeat) pulumi.StringPtrOutput { return v.AlertPriority }).(pulumi.StringPtrOutput)
}

// Specifies the alert tags for heartbeat expiration alert.
func (o HeartbeatOutput) AlertTags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Heartbeat) pulumi.StringArrayOutput { return v.AlertTags }).(pulumi.StringArrayOutput)
}

// An optional description of the heartbeat
func (o HeartbeatOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Heartbeat) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Enable/disable heartbeat monitoring.
func (o HeartbeatOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Heartbeat) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Specifies how often a heartbeat message should be expected.
func (o HeartbeatOutput) Interval() pulumi.IntOutput {
	return o.ApplyT(func(v *Heartbeat) pulumi.IntOutput { return v.Interval }).(pulumi.IntOutput)
}

// Interval specified as minutes, hours or days.
func (o HeartbeatOutput) IntervalUnit() pulumi.StringOutput {
	return o.ApplyT(func(v *Heartbeat) pulumi.StringOutput { return v.IntervalUnit }).(pulumi.StringOutput)
}

// Name of the heartbeat
func (o HeartbeatOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Heartbeat) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Owner team of the heartbeat.
func (o HeartbeatOutput) OwnerTeamId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Heartbeat) pulumi.StringPtrOutput { return v.OwnerTeamId }).(pulumi.StringPtrOutput)
}

type HeartbeatArrayOutput struct{ *pulumi.OutputState }

func (HeartbeatArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Heartbeat)(nil)).Elem()
}

func (o HeartbeatArrayOutput) ToHeartbeatArrayOutput() HeartbeatArrayOutput {
	return o
}

func (o HeartbeatArrayOutput) ToHeartbeatArrayOutputWithContext(ctx context.Context) HeartbeatArrayOutput {
	return o
}

func (o HeartbeatArrayOutput) Index(i pulumi.IntInput) HeartbeatOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Heartbeat {
		return vs[0].([]*Heartbeat)[vs[1].(int)]
	}).(HeartbeatOutput)
}

type HeartbeatMapOutput struct{ *pulumi.OutputState }

func (HeartbeatMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Heartbeat)(nil)).Elem()
}

func (o HeartbeatMapOutput) ToHeartbeatMapOutput() HeartbeatMapOutput {
	return o
}

func (o HeartbeatMapOutput) ToHeartbeatMapOutputWithContext(ctx context.Context) HeartbeatMapOutput {
	return o
}

func (o HeartbeatMapOutput) MapIndex(k pulumi.StringInput) HeartbeatOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Heartbeat {
		return vs[0].(map[string]*Heartbeat)[vs[1].(string)]
	}).(HeartbeatOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HeartbeatInput)(nil)).Elem(), &Heartbeat{})
	pulumi.RegisterInputType(reflect.TypeOf((*HeartbeatArrayInput)(nil)).Elem(), HeartbeatArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HeartbeatMapInput)(nil)).Elem(), HeartbeatMap{})
	pulumi.RegisterOutputType(HeartbeatOutput{})
	pulumi.RegisterOutputType(HeartbeatArrayOutput{})
	pulumi.RegisterOutputType(HeartbeatMapOutput{})
}
