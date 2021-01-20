// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages an Email Integration within Opsgenie.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := opsgenie.NewEmailIntegration(ctx, "testEmailIntegration", &opsgenie.EmailIntegrationArgs{
// 			EmailUsername: pulumi.String("fahri"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = opsgenie.NewEmailIntegration(ctx, "testIndex_emailIntegrationEmailIntegration", &opsgenie.EmailIntegrationArgs{
// 			Responders: opsgenie.EmailIntegrationResponderArray{
// 				&opsgenie.EmailIntegrationResponderArgs{
// 					Type: pulumi.String("user"),
// 					Id:   pulumi.Any(opsgenie_user.Test.Id),
// 				},
// 				&opsgenie.EmailIntegrationResponderArgs{
// 					Type: pulumi.String("schedule"),
// 					Id:   pulumi.Any(opsgenie_schedule.Test.Id),
// 				},
// 				&opsgenie.EmailIntegrationResponderArgs{
// 					Type: pulumi.String("escalation"),
// 					Id:   pulumi.Any(opsgenie_escalation.Test.Id),
// 				},
// 				&opsgenie.EmailIntegrationResponderArgs{
// 					Type: pulumi.String("team"),
// 					Id:   pulumi.Any(opsgenie_team.Test2.Id),
// 				},
// 			},
// 			EmailUsername:               pulumi.String("test"),
// 			Enabled:                     pulumi.Bool(true),
// 			IgnoreRespondersFromPayload: pulumi.Bool(true),
// 			SuppressNotifications:       pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = opsgenie.NewEmailIntegration(ctx, "testOpsgenieIndex_emailIntegrationEmailIntegration", &opsgenie.EmailIntegrationArgs{
// 			Responders: opsgenie.EmailIntegrationResponderArray{
// 				&opsgenie.EmailIntegrationResponderArgs{
// 					Type: pulumi.String("user"),
// 					Id:   pulumi.Any(opsgenie_user.Test.Id),
// 				},
// 			},
// 			EmailUsername:               pulumi.String("test"),
// 			Enabled:                     pulumi.Bool(true),
// 			IgnoreRespondersFromPayload: pulumi.Bool(true),
// 			SuppressNotifications:       pulumi.Bool(true),
// 			OwnerTeamId:                 pulumi.Any(opsgenie_team_genies.Id),
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
// Email Integrations can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/emailIntegration:EmailIntegration test 812be1a1-32c8-4666-a7fb-03ecc385106c`
// ```
type EmailIntegration struct {
	pulumi.CustomResourceState

	// The username part of the email address. It must be unique for each integration.
	EmailUsername pulumi.StringOutput `pulumi:"emailUsername"`
	// A Member block as documented below.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
	IgnoreRespondersFromPayload pulumi.BoolPtrOutput `pulumi:"ignoreRespondersFromPayload"`
	// Name of the integration. Name must be unique for each integration.
	Name pulumi.StringOutput `pulumi:"name"`
	// Owner team id of the integration.
	OwnerTeamId pulumi.StringPtrOutput               `pulumi:"ownerTeamId"`
	Responders  EmailIntegrationResponderArrayOutput `pulumi:"responders"`
	// If enabled, notifications that come from alerts will be suppressed. Defaults to false.
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
	// If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
	IgnoreRespondersFromPayload *bool `pulumi:"ignoreRespondersFromPayload"`
	// Name of the integration. Name must be unique for each integration.
	Name *string `pulumi:"name"`
	// Owner team id of the integration.
	OwnerTeamId *string                     `pulumi:"ownerTeamId"`
	Responders  []EmailIntegrationResponder `pulumi:"responders"`
	// If enabled, notifications that come from alerts will be suppressed. Defaults to false.
	SuppressNotifications *bool `pulumi:"suppressNotifications"`
}

type EmailIntegrationState struct {
	// The username part of the email address. It must be unique for each integration.
	EmailUsername pulumi.StringPtrInput
	// A Member block as documented below.
	Enabled pulumi.BoolPtrInput
	// If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
	IgnoreRespondersFromPayload pulumi.BoolPtrInput
	// Name of the integration. Name must be unique for each integration.
	Name pulumi.StringPtrInput
	// Owner team id of the integration.
	OwnerTeamId pulumi.StringPtrInput
	Responders  EmailIntegrationResponderArrayInput
	// If enabled, notifications that come from alerts will be suppressed. Defaults to false.
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
	// If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
	IgnoreRespondersFromPayload *bool `pulumi:"ignoreRespondersFromPayload"`
	// Name of the integration. Name must be unique for each integration.
	Name *string `pulumi:"name"`
	// Owner team id of the integration.
	OwnerTeamId *string                     `pulumi:"ownerTeamId"`
	Responders  []EmailIntegrationResponder `pulumi:"responders"`
	// If enabled, notifications that come from alerts will be suppressed. Defaults to false.
	SuppressNotifications *bool `pulumi:"suppressNotifications"`
}

// The set of arguments for constructing a EmailIntegration resource.
type EmailIntegrationArgs struct {
	// The username part of the email address. It must be unique for each integration.
	EmailUsername pulumi.StringInput
	// A Member block as documented below.
	Enabled pulumi.BoolPtrInput
	// If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
	IgnoreRespondersFromPayload pulumi.BoolPtrInput
	// Name of the integration. Name must be unique for each integration.
	Name pulumi.StringPtrInput
	// Owner team id of the integration.
	OwnerTeamId pulumi.StringPtrInput
	Responders  EmailIntegrationResponderArrayInput
	// If enabled, notifications that come from alerts will be suppressed. Defaults to false.
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

func (EmailIntegration) ElementType() reflect.Type {
	return reflect.TypeOf((*EmailIntegration)(nil)).Elem()
}

func (i EmailIntegration) ToEmailIntegrationOutput() EmailIntegrationOutput {
	return i.ToEmailIntegrationOutputWithContext(context.Background())
}

func (i EmailIntegration) ToEmailIntegrationOutputWithContext(ctx context.Context) EmailIntegrationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EmailIntegrationOutput)
}

type EmailIntegrationOutput struct {
	*pulumi.OutputState
}

func (EmailIntegrationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*EmailIntegrationOutput)(nil)).Elem()
}

func (o EmailIntegrationOutput) ToEmailIntegrationOutput() EmailIntegrationOutput {
	return o
}

func (o EmailIntegrationOutput) ToEmailIntegrationOutputWithContext(ctx context.Context) EmailIntegrationOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(EmailIntegrationOutput{})
}