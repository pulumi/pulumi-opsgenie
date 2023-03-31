// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Email Integration within Opsgenie.
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
//			_, err := opsgenie.NewEmailIntegration(ctx, "testEmailIntegration", &opsgenie.EmailIntegrationArgs{
//				EmailUsername: pulumi.String("fahri"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = opsgenie.NewEmailIntegration(ctx, "testIndex/emailIntegrationEmailIntegration", &opsgenie.EmailIntegrationArgs{
//				Responders: opsgenie.EmailIntegrationResponderArray{
//					&opsgenie.EmailIntegrationResponderArgs{
//						Type: pulumi.String("user"),
//						Id:   pulumi.Any(opsgenie_user.Test.Id),
//					},
//					&opsgenie.EmailIntegrationResponderArgs{
//						Type: pulumi.String("schedule"),
//						Id:   pulumi.Any(opsgenie_schedule.Test.Id),
//					},
//					&opsgenie.EmailIntegrationResponderArgs{
//						Type: pulumi.String("escalation"),
//						Id:   pulumi.Any(opsgenie_escalation.Test.Id),
//					},
//					&opsgenie.EmailIntegrationResponderArgs{
//						Type: pulumi.String("team"),
//						Id:   pulumi.Any(opsgenie_team.Test2.Id),
//					},
//				},
//				EmailUsername:               pulumi.String("test"),
//				Enabled:                     pulumi.Bool(true),
//				IgnoreRespondersFromPayload: pulumi.Bool(true),
//				SuppressNotifications:       pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = opsgenie.NewEmailIntegration(ctx, "testOpsgenieIndex/emailIntegrationEmailIntegration", &opsgenie.EmailIntegrationArgs{
//				Responders: opsgenie.EmailIntegrationResponderArray{
//					&opsgenie.EmailIntegrationResponderArgs{
//						Type: pulumi.String("user"),
//						Id:   pulumi.Any(opsgenie_user.Test.Id),
//					},
//				},
//				EmailUsername:               pulumi.String("test"),
//				Enabled:                     pulumi.Bool(true),
//				IgnoreRespondersFromPayload: pulumi.Bool(true),
//				SuppressNotifications:       pulumi.Bool(true),
//				OwnerTeamId:                 pulumi.Any(opsgenie_team_genies.Id),
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
// Email Integrations can be imported using the `id`, e.g.
//
// ```sh
//
//	$ pulumi import opsgenie:index/emailIntegration:EmailIntegration test id`
//
// ```
type EmailIntegration struct {
	pulumi.CustomResourceState

	// The username part of the email address. It must be unique for each integration.
	EmailUsername pulumi.StringOutput `pulumi:"emailUsername"`
	// A Member block as documented below.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
	IgnoreRespondersFromPayload pulumi.BoolPtrOutput `pulumi:"ignoreRespondersFromPayload"`
	// Name of the integration. Name must be unique for each integration.
	Name pulumi.StringOutput `pulumi:"name"`
	// Owner team id of the integration.
	OwnerTeamId pulumi.StringPtrOutput               `pulumi:"ownerTeamId"`
	Responders  EmailIntegrationResponderArrayOutput `pulumi:"responders"`
	// If enabled, notifications that come from alerts will be suppressed. Default: `false`.
	SuppressNotifications pulumi.BoolPtrOutput `pulumi:"suppressNotifications"`
}

// NewEmailIntegration registers a new resource with the given unique name, arguments, and options.
func NewEmailIntegration(ctx *pulumi.Context,
	name string, args *EmailIntegrationArgs, opts ...pulumi.ResourceOption) (*EmailIntegration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EmailUsername == nil {
		return nil, errors.New("invalid value for required argument 'EmailUsername'")
	}
	var resource EmailIntegration
	err := ctx.RegisterResource("opsgenie:index/emailIntegration:EmailIntegration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEmailIntegration gets an existing EmailIntegration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEmailIntegration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EmailIntegrationState, opts ...pulumi.ResourceOption) (*EmailIntegration, error) {
	var resource EmailIntegration
	err := ctx.ReadResource("opsgenie:index/emailIntegration:EmailIntegration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering EmailIntegration resources.
type emailIntegrationState struct {
	// The username part of the email address. It must be unique for each integration.
	EmailUsername *string `pulumi:"emailUsername"`
	// A Member block as documented below.
	Enabled *bool `pulumi:"enabled"`
	// If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
	IgnoreRespondersFromPayload *bool `pulumi:"ignoreRespondersFromPayload"`
	// Name of the integration. Name must be unique for each integration.
	Name *string `pulumi:"name"`
	// Owner team id of the integration.
	OwnerTeamId *string                     `pulumi:"ownerTeamId"`
	Responders  []EmailIntegrationResponder `pulumi:"responders"`
	// If enabled, notifications that come from alerts will be suppressed. Default: `false`.
	SuppressNotifications *bool `pulumi:"suppressNotifications"`
}

type EmailIntegrationState struct {
	// The username part of the email address. It must be unique for each integration.
	EmailUsername pulumi.StringPtrInput
	// A Member block as documented below.
	Enabled pulumi.BoolPtrInput
	// If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
	IgnoreRespondersFromPayload pulumi.BoolPtrInput
	// Name of the integration. Name must be unique for each integration.
	Name pulumi.StringPtrInput
	// Owner team id of the integration.
	OwnerTeamId pulumi.StringPtrInput
	Responders  EmailIntegrationResponderArrayInput
	// If enabled, notifications that come from alerts will be suppressed. Default: `false`.
	SuppressNotifications pulumi.BoolPtrInput
}

func (EmailIntegrationState) ElementType() reflect.Type {
	return reflect.TypeOf((*emailIntegrationState)(nil)).Elem()
}

type emailIntegrationArgs struct {
	// The username part of the email address. It must be unique for each integration.
	EmailUsername string `pulumi:"emailUsername"`
	// A Member block as documented below.
	Enabled *bool `pulumi:"enabled"`
	// If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
	IgnoreRespondersFromPayload *bool `pulumi:"ignoreRespondersFromPayload"`
	// Name of the integration. Name must be unique for each integration.
	Name *string `pulumi:"name"`
	// Owner team id of the integration.
	OwnerTeamId *string                     `pulumi:"ownerTeamId"`
	Responders  []EmailIntegrationResponder `pulumi:"responders"`
	// If enabled, notifications that come from alerts will be suppressed. Default: `false`.
	SuppressNotifications *bool `pulumi:"suppressNotifications"`
}

// The set of arguments for constructing a EmailIntegration resource.
type EmailIntegrationArgs struct {
	// The username part of the email address. It must be unique for each integration.
	EmailUsername pulumi.StringInput
	// A Member block as documented below.
	Enabled pulumi.BoolPtrInput
	// If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
	IgnoreRespondersFromPayload pulumi.BoolPtrInput
	// Name of the integration. Name must be unique for each integration.
	Name pulumi.StringPtrInput
	// Owner team id of the integration.
	OwnerTeamId pulumi.StringPtrInput
	Responders  EmailIntegrationResponderArrayInput
	// If enabled, notifications that come from alerts will be suppressed. Default: `false`.
	SuppressNotifications pulumi.BoolPtrInput
}

func (EmailIntegrationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*emailIntegrationArgs)(nil)).Elem()
}

type EmailIntegrationInput interface {
	pulumi.Input

	ToEmailIntegrationOutput() EmailIntegrationOutput
	ToEmailIntegrationOutputWithContext(ctx context.Context) EmailIntegrationOutput
}

func (*EmailIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailIntegration)(nil)).Elem()
}

func (i *EmailIntegration) ToEmailIntegrationOutput() EmailIntegrationOutput {
	return i.ToEmailIntegrationOutputWithContext(context.Background())
}

func (i *EmailIntegration) ToEmailIntegrationOutputWithContext(ctx context.Context) EmailIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailIntegrationOutput)
}

// EmailIntegrationArrayInput is an input type that accepts EmailIntegrationArray and EmailIntegrationArrayOutput values.
// You can construct a concrete instance of `EmailIntegrationArrayInput` via:
//
//	EmailIntegrationArray{ EmailIntegrationArgs{...} }
type EmailIntegrationArrayInput interface {
	pulumi.Input

	ToEmailIntegrationArrayOutput() EmailIntegrationArrayOutput
	ToEmailIntegrationArrayOutputWithContext(context.Context) EmailIntegrationArrayOutput
}

type EmailIntegrationArray []EmailIntegrationInput

func (EmailIntegrationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailIntegration)(nil)).Elem()
}

func (i EmailIntegrationArray) ToEmailIntegrationArrayOutput() EmailIntegrationArrayOutput {
	return i.ToEmailIntegrationArrayOutputWithContext(context.Background())
}

func (i EmailIntegrationArray) ToEmailIntegrationArrayOutputWithContext(ctx context.Context) EmailIntegrationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailIntegrationArrayOutput)
}

// EmailIntegrationMapInput is an input type that accepts EmailIntegrationMap and EmailIntegrationMapOutput values.
// You can construct a concrete instance of `EmailIntegrationMapInput` via:
//
//	EmailIntegrationMap{ "key": EmailIntegrationArgs{...} }
type EmailIntegrationMapInput interface {
	pulumi.Input

	ToEmailIntegrationMapOutput() EmailIntegrationMapOutput
	ToEmailIntegrationMapOutputWithContext(context.Context) EmailIntegrationMapOutput
}

type EmailIntegrationMap map[string]EmailIntegrationInput

func (EmailIntegrationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailIntegration)(nil)).Elem()
}

func (i EmailIntegrationMap) ToEmailIntegrationMapOutput() EmailIntegrationMapOutput {
	return i.ToEmailIntegrationMapOutputWithContext(context.Background())
}

func (i EmailIntegrationMap) ToEmailIntegrationMapOutputWithContext(ctx context.Context) EmailIntegrationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailIntegrationMapOutput)
}

type EmailIntegrationOutput struct{ *pulumi.OutputState }

func (EmailIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**EmailIntegration)(nil)).Elem()
}

func (o EmailIntegrationOutput) ToEmailIntegrationOutput() EmailIntegrationOutput {
	return o
}

func (o EmailIntegrationOutput) ToEmailIntegrationOutputWithContext(ctx context.Context) EmailIntegrationOutput {
	return o
}

// The username part of the email address. It must be unique for each integration.
func (o EmailIntegrationOutput) EmailUsername() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailIntegration) pulumi.StringOutput { return v.EmailUsername }).(pulumi.StringOutput)
}

// A Member block as documented below.
func (o EmailIntegrationOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EmailIntegration) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
func (o EmailIntegrationOutput) IgnoreRespondersFromPayload() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EmailIntegration) pulumi.BoolPtrOutput { return v.IgnoreRespondersFromPayload }).(pulumi.BoolPtrOutput)
}

// Name of the integration. Name must be unique for each integration.
func (o EmailIntegrationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *EmailIntegration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Owner team id of the integration.
func (o EmailIntegrationOutput) OwnerTeamId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *EmailIntegration) pulumi.StringPtrOutput { return v.OwnerTeamId }).(pulumi.StringPtrOutput)
}

func (o EmailIntegrationOutput) Responders() EmailIntegrationResponderArrayOutput {
	return o.ApplyT(func(v *EmailIntegration) EmailIntegrationResponderArrayOutput { return v.Responders }).(EmailIntegrationResponderArrayOutput)
}

// If enabled, notifications that come from alerts will be suppressed. Default: `false`.
func (o EmailIntegrationOutput) SuppressNotifications() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *EmailIntegration) pulumi.BoolPtrOutput { return v.SuppressNotifications }).(pulumi.BoolPtrOutput)
}

type EmailIntegrationArrayOutput struct{ *pulumi.OutputState }

func (EmailIntegrationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*EmailIntegration)(nil)).Elem()
}

func (o EmailIntegrationArrayOutput) ToEmailIntegrationArrayOutput() EmailIntegrationArrayOutput {
	return o
}

func (o EmailIntegrationArrayOutput) ToEmailIntegrationArrayOutputWithContext(ctx context.Context) EmailIntegrationArrayOutput {
	return o
}

func (o EmailIntegrationArrayOutput) Index(i pulumi.IntInput) EmailIntegrationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *EmailIntegration {
		return vs[0].([]*EmailIntegration)[vs[1].(int)]
	}).(EmailIntegrationOutput)
}

type EmailIntegrationMapOutput struct{ *pulumi.OutputState }

func (EmailIntegrationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*EmailIntegration)(nil)).Elem()
}

func (o EmailIntegrationMapOutput) ToEmailIntegrationMapOutput() EmailIntegrationMapOutput {
	return o
}

func (o EmailIntegrationMapOutput) ToEmailIntegrationMapOutputWithContext(ctx context.Context) EmailIntegrationMapOutput {
	return o
}

func (o EmailIntegrationMapOutput) MapIndex(k pulumi.StringInput) EmailIntegrationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *EmailIntegration {
		return vs[0].(map[string]*EmailIntegration)[vs[1].(string)]
	}).(EmailIntegrationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EmailIntegrationInput)(nil)).Elem(), &EmailIntegration{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailIntegrationArrayInput)(nil)).Elem(), EmailIntegrationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EmailIntegrationMapInput)(nil)).Elem(), EmailIntegrationMap{})
	pulumi.RegisterOutputType(EmailIntegrationOutput{})
	pulumi.RegisterOutputType(EmailIntegrationArrayOutput{})
	pulumi.RegisterOutputType(EmailIntegrationMapOutput{})
}
