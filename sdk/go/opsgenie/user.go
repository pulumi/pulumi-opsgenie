// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages a User within Opsgenie.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie"
// 	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := opsgenie.NewUser(ctx, "test", &opsgenie.UserArgs{
// 			FullName:      pulumi.String("Test User"),
// 			Locale:        pulumi.String("en_US"),
// 			Role:          pulumi.String("User"),
// 			SkypeUsername: pulumi.String("skypename"),
// 			Tags: pulumi.StringArray{
// 				pulumi.String("sre"),
// 				pulumi.String("opsgenie"),
// 			},
// 			Timezone: pulumi.String("America/New_York"),
// 			UserAddresses: opsgenie.UserUserAddressArray{
// 				&opsgenie.UserUserAddressArgs{
// 					City:    pulumi.String("City"),
// 					Country: pulumi.String("Country"),
// 					Line:    pulumi.String("Line"),
// 					State:   pulumi.String("State"),
// 					Zipcode: pulumi.String("998877"),
// 				},
// 			},
// 			UserDetails: pulumi.StringMap{
// 				"key1": pulumi.String("val1,val2"),
// 				"key2": pulumi.String("val3,val4"),
// 			},
// 			Username: pulumi.String("user@domain.com"),
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
// Users can be imported using the `id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/user:User user da4faf16-5546-41e4-8330-4d0002b74048s`
// ```
type User struct {
	pulumi.CustomResourceState

	// The Full Name of the User.
	FullName pulumi.StringOutput `pulumi:"fullName"`
	// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
	Locale pulumi.StringPtrOutput `pulumi:"locale"`
	// The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
	Role pulumi.StringOutput `pulumi:"role"`
	// Skype username of the user.
	SkypeUsername pulumi.StringPtrOutput `pulumi:"skypeUsername"`
	// A list of tags to be associated with the user.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
	Timezone pulumi.StringPtrOutput `pulumi:"timezone"`
	// Address of the user.
	UserAddresses UserUserAddressArrayOutput `pulumi:"userAddresses"`
	// Details about the user in form of key and list. of values.
	UserDetails pulumi.StringMapOutput `pulumi:"userDetails"`
	// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewUser registers a new resource with the given unique name, arguments, and options.
func NewUser(ctx *pulumi.Context,
	name string, args *UserArgs, opts ...pulumi.ResourceOption) (*User, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FullName == nil {
		return nil, errors.New("invalid value for required argument 'FullName'")
	}
	if args.Role == nil {
		return nil, errors.New("invalid value for required argument 'Role'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	var resource User
	err := ctx.RegisterResource("opsgenie:index/user:User", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUser gets an existing User resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUser(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserState, opts ...pulumi.ResourceOption) (*User, error) {
	var resource User
	err := ctx.ReadResource("opsgenie:index/user:User", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering User resources.
type userState struct {
	// The Full Name of the User.
	FullName *string `pulumi:"fullName"`
	// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
	Locale *string `pulumi:"locale"`
	// The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
	Role *string `pulumi:"role"`
	// Skype username of the user.
	SkypeUsername *string `pulumi:"skypeUsername"`
	// A list of tags to be associated with the user.
	Tags []string `pulumi:"tags"`
	// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
	Timezone *string `pulumi:"timezone"`
	// Address of the user.
	UserAddresses []UserUserAddress `pulumi:"userAddresses"`
	// Details about the user in form of key and list. of values.
	UserDetails map[string]string `pulumi:"userDetails"`
	// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
	Username *string `pulumi:"username"`
}

type UserState struct {
	// The Full Name of the User.
	FullName pulumi.StringPtrInput
	// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
	Locale pulumi.StringPtrInput
	// The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
	Role pulumi.StringPtrInput
	// Skype username of the user.
	SkypeUsername pulumi.StringPtrInput
	// A list of tags to be associated with the user.
	Tags pulumi.StringArrayInput
	// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
	Timezone pulumi.StringPtrInput
	// Address of the user.
	UserAddresses UserUserAddressArrayInput
	// Details about the user in form of key and list. of values.
	UserDetails pulumi.StringMapInput
	// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
	Username pulumi.StringPtrInput
}

func (UserState) ElementType() reflect.Type {
	return reflect.TypeOf((*userState)(nil)).Elem()
}

type userArgs struct {
	// The Full Name of the User.
	FullName string `pulumi:"fullName"`
	// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
	Locale *string `pulumi:"locale"`
	// The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
	Role string `pulumi:"role"`
	// Skype username of the user.
	SkypeUsername *string `pulumi:"skypeUsername"`
	// A list of tags to be associated with the user.
	Tags []string `pulumi:"tags"`
	// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
	Timezone *string `pulumi:"timezone"`
	// Address of the user.
	UserAddresses []UserUserAddress `pulumi:"userAddresses"`
	// Details about the user in form of key and list. of values.
	UserDetails map[string]string `pulumi:"userDetails"`
	// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a User resource.
type UserArgs struct {
	// The Full Name of the User.
	FullName pulumi.StringInput
	// Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
	Locale pulumi.StringPtrInput
	// The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
	Role pulumi.StringInput
	// Skype username of the user.
	SkypeUsername pulumi.StringPtrInput
	// A list of tags to be associated with the user.
	Tags pulumi.StringArrayInput
	// Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
	Timezone pulumi.StringPtrInput
	// Address of the user.
	UserAddresses UserUserAddressArrayInput
	// Details about the user in form of key and list. of values.
	UserDetails pulumi.StringMapInput
	// The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
	Username pulumi.StringInput
}

func (UserArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userArgs)(nil)).Elem()
}

type UserInput interface {
	pulumi.Input

	ToUserOutput() UserOutput
	ToUserOutputWithContext(ctx context.Context) UserOutput
}

func (*User) ElementType() reflect.Type {
	return reflect.TypeOf((*User)(nil))
}

func (i *User) ToUserOutput() UserOutput {
	return i.ToUserOutputWithContext(context.Background())
}

func (i *User) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOutput)
}

type UserOutput struct {
	*pulumi.OutputState
}

func (UserOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*User)(nil))
}

func (o UserOutput) ToUserOutput() UserOutput {
	return o
}

func (o UserOutput) ToUserOutputWithContext(ctx context.Context) UserOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(UserOutput{})
}
