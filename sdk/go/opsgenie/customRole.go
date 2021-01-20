// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages custom user roles within Opsgenie.
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
// 		_, err := opsgenie.NewCustomRole(ctx, "test", &opsgenie.CustomRoleArgs{
// 			DisallowedRights: pulumi.StringArray{
// 				pulumi.String("profile-edit"),
// 				pulumi.String("contacts-edit"),
// 			},
// 			ExtendedRole: pulumi.String("user"),
// 			GrantedRights: pulumi.StringArray{
// 				pulumi.String("alert-delete"),
// 			},
// 			RoleName: pulumi.String("genierole"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
type CustomRole struct {
	pulumi.CustomResourceState

	// The rights this role cannot have. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	DisallowedRights pulumi.StringArrayOutput `pulumi:"disallowedRights"`
	// The role from which this role has been derived. Allowed Values: "user", "observer", "stakeholder".
	ExtendedRole pulumi.StringPtrOutput `pulumi:"extendedRole"`
	// The rights granted to this role. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	GrantedRights pulumi.StringArrayOutput `pulumi:"grantedRights"`
	// Name of the custom role.
	RoleName pulumi.StringOutput `pulumi:"roleName"`
}

// NewCustomRole registers a new resource with the given unique name, arguments, and options.
func NewCustomRole(ctx *pulumi.Context,
	name string, args *CustomRoleArgs, opts ...pulumi.ResourceOption) (*CustomRole, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.RoleName == nil {
		return nil, errors.New("invalid value for required argument 'RoleName'")
	}
	var resource CustomRole
	err := ctx.RegisterResource("opsgenie:index/customRole:CustomRole", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCustomRole gets an existing CustomRole resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCustomRole(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CustomRoleState, opts ...pulumi.ResourceOption) (*CustomRole, error) {
	var resource CustomRole
	err := ctx.ReadResource("opsgenie:index/customRole:CustomRole", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CustomRole resources.
type customRoleState struct {
	// The rights this role cannot have. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	DisallowedRights []string `pulumi:"disallowedRights"`
	// The role from which this role has been derived. Allowed Values: "user", "observer", "stakeholder".
	ExtendedRole *string `pulumi:"extendedRole"`
	// The rights granted to this role. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	GrantedRights []string `pulumi:"grantedRights"`
	// Name of the custom role.
	RoleName *string `pulumi:"roleName"`
}

type CustomRoleState struct {
	// The rights this role cannot have. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	DisallowedRights pulumi.StringArrayInput
	// The role from which this role has been derived. Allowed Values: "user", "observer", "stakeholder".
	ExtendedRole pulumi.StringPtrInput
	// The rights granted to this role. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	GrantedRights pulumi.StringArrayInput
	// Name of the custom role.
	RoleName pulumi.StringPtrInput
}

func (CustomRoleState) ElementType() reflect.Type {
	return reflect.TypeOf((*customRoleState)(nil)).Elem()
}

type customRoleArgs struct {
	// The rights this role cannot have. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	DisallowedRights []string `pulumi:"disallowedRights"`
	// The role from which this role has been derived. Allowed Values: "user", "observer", "stakeholder".
	ExtendedRole *string `pulumi:"extendedRole"`
	// The rights granted to this role. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	GrantedRights []string `pulumi:"grantedRights"`
	// Name of the custom role.
	RoleName string `pulumi:"roleName"`
}

// The set of arguments for constructing a CustomRole resource.
type CustomRoleArgs struct {
	// The rights this role cannot have. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	DisallowedRights pulumi.StringArrayInput
	// The role from which this role has been derived. Allowed Values: "user", "observer", "stakeholder".
	ExtendedRole pulumi.StringPtrInput
	// The rights granted to this role. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
	GrantedRights pulumi.StringArrayInput
	// Name of the custom role.
	RoleName pulumi.StringInput
}

func (CustomRoleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*customRoleArgs)(nil)).Elem()
}

type CustomRoleInput interface {
	pulumi.Input

	ToCustomRoleOutput() CustomRoleOutput
	ToCustomRoleOutputWithContext(ctx context.Context) CustomRoleOutput
}

func (CustomRole) ElementType() reflect.Type {
	return reflect.TypeOf((*CustomRole)(nil)).Elem()
}

func (i CustomRole) ToCustomRoleOutput() CustomRoleOutput {
	return i.ToCustomRoleOutputWithContext(context.Background())
}

func (i CustomRole) ToCustomRoleOutputWithContext(ctx context.Context) CustomRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoleOutput)
}

type CustomRoleOutput struct {
	*pulumi.OutputState
}

func (CustomRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*CustomRoleOutput)(nil)).Elem()
}

func (o CustomRoleOutput) ToCustomRoleOutput() CustomRoleOutput {
	return o
}

func (o CustomRoleOutput) ToCustomRoleOutputWithContext(ctx context.Context) CustomRoleOutput {
	return o
}

func init() {
	pulumi.RegisterOutputType(CustomRoleOutput{})
}