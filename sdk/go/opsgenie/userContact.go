// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a User Contact.
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
// 		_, err := opsgenie.NewUserContact(ctx, "sms", &opsgenie.UserContactArgs{
// 			Method:   pulumi.String("sms"),
// 			To:       pulumi.String("39-123"),
// 			Username: pulumi.Any(opsgenie_user.Exampleuser.Username),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = opsgenie.NewUserContact(ctx, "email", &opsgenie.UserContactArgs{
// 			Method:   pulumi.String("email"),
// 			To:       pulumi.String("fahri@opsgenie.com"),
// 			Username: pulumi.Any(opsgenie_user.Exampleuser.Username),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = opsgenie.NewUserContact(ctx, "voice", &opsgenie.UserContactArgs{
// 			Method:   pulumi.String("voice"),
// 			To:       pulumi.String("39-123"),
// 			Username: pulumi.Any(opsgenie_user.Exampleuser.Username),
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
// Users can be imported using the `username/contact_id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/userContact:UserContact testcontact username/contact_id`
// ```
type UserContact struct {
	pulumi.CustomResourceState

	// Enable contact of the user in OpsGenie. Default value is true.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
	Method pulumi.StringOutput `pulumi:"method"`
	// to field is the address of given method.
	To pulumi.StringOutput `pulumi:"to"`
	// The username for contact.(reference)
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewUserContact registers a new resource with the given unique name, arguments, and options.
func NewUserContact(ctx *pulumi.Context,
	name string, args *UserContactArgs, opts ...pulumi.ResourceOption) (*UserContact, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Method == nil {
		return nil, errors.New("invalid value for required argument 'Method'")
	}
	if args.To == nil {
		return nil, errors.New("invalid value for required argument 'To'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	var resource UserContact
	err := ctx.RegisterResource("opsgenie:index/userContact:UserContact", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserContact gets an existing UserContact resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserContact(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserContactState, opts ...pulumi.ResourceOption) (*UserContact, error) {
	var resource UserContact
	err := ctx.ReadResource("opsgenie:index/userContact:UserContact", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserContact resources.
type userContactState struct {
	// Enable contact of the user in OpsGenie. Default value is true.
	Enabled *bool `pulumi:"enabled"`
	// This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
	Method *string `pulumi:"method"`
	// to field is the address of given method.
	To *string `pulumi:"to"`
	// The username for contact.(reference)
	Username *string `pulumi:"username"`
}

type UserContactState struct {
	// Enable contact of the user in OpsGenie. Default value is true.
	Enabled pulumi.BoolPtrInput
	// This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
	Method pulumi.StringPtrInput
	// to field is the address of given method.
	To pulumi.StringPtrInput
	// The username for contact.(reference)
	Username pulumi.StringPtrInput
}

func (UserContactState) ElementType() reflect.Type {
	return reflect.TypeOf((*userContactState)(nil)).Elem()
}

type userContactArgs struct {
	// Enable contact of the user in OpsGenie. Default value is true.
	Enabled *bool `pulumi:"enabled"`
	// This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
	Method string `pulumi:"method"`
	// to field is the address of given method.
	To string `pulumi:"to"`
	// The username for contact.(reference)
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a UserContact resource.
type UserContactArgs struct {
	// Enable contact of the user in OpsGenie. Default value is true.
	Enabled pulumi.BoolPtrInput
	// This parameter is the contact method of user and should be one of email, sms or voice. Please note that adding mobile is not supported from API.
	Method pulumi.StringInput
	// to field is the address of given method.
	To pulumi.StringInput
	// The username for contact.(reference)
	Username pulumi.StringInput
}

func (UserContactArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userContactArgs)(nil)).Elem()
}

type UserContactInput interface {
	pulumi.Input

	ToUserContactOutput() UserContactOutput
	ToUserContactOutputWithContext(ctx context.Context) UserContactOutput
}

func (*UserContact) ElementType() reflect.Type {
	return reflect.TypeOf((**UserContact)(nil)).Elem()
}

func (i *UserContact) ToUserContactOutput() UserContactOutput {
	return i.ToUserContactOutputWithContext(context.Background())
}

func (i *UserContact) ToUserContactOutputWithContext(ctx context.Context) UserContactOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserContactOutput)
}

// UserContactArrayInput is an input type that accepts UserContactArray and UserContactArrayOutput values.
// You can construct a concrete instance of `UserContactArrayInput` via:
//
//          UserContactArray{ UserContactArgs{...} }
type UserContactArrayInput interface {
	pulumi.Input

	ToUserContactArrayOutput() UserContactArrayOutput
	ToUserContactArrayOutputWithContext(context.Context) UserContactArrayOutput
}

type UserContactArray []UserContactInput

func (UserContactArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserContact)(nil)).Elem()
}

func (i UserContactArray) ToUserContactArrayOutput() UserContactArrayOutput {
	return i.ToUserContactArrayOutputWithContext(context.Background())
}

func (i UserContactArray) ToUserContactArrayOutputWithContext(ctx context.Context) UserContactArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserContactArrayOutput)
}

// UserContactMapInput is an input type that accepts UserContactMap and UserContactMapOutput values.
// You can construct a concrete instance of `UserContactMapInput` via:
//
//          UserContactMap{ "key": UserContactArgs{...} }
type UserContactMapInput interface {
	pulumi.Input

	ToUserContactMapOutput() UserContactMapOutput
	ToUserContactMapOutputWithContext(context.Context) UserContactMapOutput
}

type UserContactMap map[string]UserContactInput

func (UserContactMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserContact)(nil)).Elem()
}

func (i UserContactMap) ToUserContactMapOutput() UserContactMapOutput {
	return i.ToUserContactMapOutputWithContext(context.Background())
}

func (i UserContactMap) ToUserContactMapOutputWithContext(ctx context.Context) UserContactMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserContactMapOutput)
}

type UserContactOutput struct{ *pulumi.OutputState }

func (UserContactOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserContact)(nil)).Elem()
}

func (o UserContactOutput) ToUserContactOutput() UserContactOutput {
	return o
}

func (o UserContactOutput) ToUserContactOutputWithContext(ctx context.Context) UserContactOutput {
	return o
}

type UserContactArrayOutput struct{ *pulumi.OutputState }

func (UserContactArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserContact)(nil)).Elem()
}

func (o UserContactArrayOutput) ToUserContactArrayOutput() UserContactArrayOutput {
	return o
}

func (o UserContactArrayOutput) ToUserContactArrayOutputWithContext(ctx context.Context) UserContactArrayOutput {
	return o
}

func (o UserContactArrayOutput) Index(i pulumi.IntInput) UserContactOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserContact {
		return vs[0].([]*UserContact)[vs[1].(int)]
	}).(UserContactOutput)
}

type UserContactMapOutput struct{ *pulumi.OutputState }

func (UserContactMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserContact)(nil)).Elem()
}

func (o UserContactMapOutput) ToUserContactMapOutput() UserContactMapOutput {
	return o
}

func (o UserContactMapOutput) ToUserContactMapOutputWithContext(ctx context.Context) UserContactMapOutput {
	return o
}

func (o UserContactMapOutput) MapIndex(k pulumi.StringInput) UserContactOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserContact {
		return vs[0].(map[string]*UserContact)[vs[1].(string)]
	}).(UserContactOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserContactInput)(nil)).Elem(), &UserContact{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserContactArrayInput)(nil)).Elem(), UserContactArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserContactMapInput)(nil)).Elem(), UserContactMap{})
	pulumi.RegisterOutputType(UserContactOutput{})
	pulumi.RegisterOutputType(UserContactArrayOutput{})
	pulumi.RegisterOutputType(UserContactMapOutput{})
}
