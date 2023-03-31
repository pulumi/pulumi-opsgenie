// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages custom user roles within Opsgenie.
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
//			_, err := opsgenie.NewCustomRole(ctx, "test", &opsgenie.CustomRoleArgs{
//				DisallowedRights: pulumi.StringArray{
//					pulumi.String("profile-edit"),
//					pulumi.String("contacts-edit"),
//				},
//				ExtendedRole: pulumi.String("user"),
//				GrantedRights: pulumi.StringArray{
//					pulumi.String("alert-delete"),
//				},
//				RoleName: pulumi.String("genierole"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
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

func (*CustomRole) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomRole)(nil)).Elem()
}

func (i *CustomRole) ToCustomRoleOutput() CustomRoleOutput {
	return i.ToCustomRoleOutputWithContext(context.Background())
}

func (i *CustomRole) ToCustomRoleOutputWithContext(ctx context.Context) CustomRoleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoleOutput)
}

// CustomRoleArrayInput is an input type that accepts CustomRoleArray and CustomRoleArrayOutput values.
// You can construct a concrete instance of `CustomRoleArrayInput` via:
//
//	CustomRoleArray{ CustomRoleArgs{...} }
type CustomRoleArrayInput interface {
	pulumi.Input

	ToCustomRoleArrayOutput() CustomRoleArrayOutput
	ToCustomRoleArrayOutputWithContext(context.Context) CustomRoleArrayOutput
}

type CustomRoleArray []CustomRoleInput

func (CustomRoleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomRole)(nil)).Elem()
}

func (i CustomRoleArray) ToCustomRoleArrayOutput() CustomRoleArrayOutput {
	return i.ToCustomRoleArrayOutputWithContext(context.Background())
}

func (i CustomRoleArray) ToCustomRoleArrayOutputWithContext(ctx context.Context) CustomRoleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoleArrayOutput)
}

// CustomRoleMapInput is an input type that accepts CustomRoleMap and CustomRoleMapOutput values.
// You can construct a concrete instance of `CustomRoleMapInput` via:
//
//	CustomRoleMap{ "key": CustomRoleArgs{...} }
type CustomRoleMapInput interface {
	pulumi.Input

	ToCustomRoleMapOutput() CustomRoleMapOutput
	ToCustomRoleMapOutputWithContext(context.Context) CustomRoleMapOutput
}

type CustomRoleMap map[string]CustomRoleInput

func (CustomRoleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomRole)(nil)).Elem()
}

func (i CustomRoleMap) ToCustomRoleMapOutput() CustomRoleMapOutput {
	return i.ToCustomRoleMapOutputWithContext(context.Background())
}

func (i CustomRoleMap) ToCustomRoleMapOutputWithContext(ctx context.Context) CustomRoleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CustomRoleMapOutput)
}

type CustomRoleOutput struct{ *pulumi.OutputState }

func (CustomRoleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CustomRole)(nil)).Elem()
}

func (o CustomRoleOutput) ToCustomRoleOutput() CustomRoleOutput {
	return o
}

func (o CustomRoleOutput) ToCustomRoleOutputWithContext(ctx context.Context) CustomRoleOutput {
	return o
}

// The rights this role cannot have. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
func (o CustomRoleOutput) DisallowedRights() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CustomRole) pulumi.StringArrayOutput { return v.DisallowedRights }).(pulumi.StringArrayOutput)
}

// The role from which this role has been derived. Allowed Values: "user", "observer", "stakeholder".
func (o CustomRoleOutput) ExtendedRole() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *CustomRole) pulumi.StringPtrOutput { return v.ExtendedRole }).(pulumi.StringPtrOutput)
}

// The rights granted to this role. For allowed values please refer [User Right Prerequisites](https://docs.opsgenie.com/docs/custom-user-role-api#section-user-right-prerequisites)
func (o CustomRoleOutput) GrantedRights() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CustomRole) pulumi.StringArrayOutput { return v.GrantedRights }).(pulumi.StringArrayOutput)
}

// Name of the custom role.
func (o CustomRoleOutput) RoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *CustomRole) pulumi.StringOutput { return v.RoleName }).(pulumi.StringOutput)
}

type CustomRoleArrayOutput struct{ *pulumi.OutputState }

func (CustomRoleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CustomRole)(nil)).Elem()
}

func (o CustomRoleArrayOutput) ToCustomRoleArrayOutput() CustomRoleArrayOutput {
	return o
}

func (o CustomRoleArrayOutput) ToCustomRoleArrayOutputWithContext(ctx context.Context) CustomRoleArrayOutput {
	return o
}

func (o CustomRoleArrayOutput) Index(i pulumi.IntInput) CustomRoleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CustomRole {
		return vs[0].([]*CustomRole)[vs[1].(int)]
	}).(CustomRoleOutput)
}

type CustomRoleMapOutput struct{ *pulumi.OutputState }

func (CustomRoleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CustomRole)(nil)).Elem()
}

func (o CustomRoleMapOutput) ToCustomRoleMapOutput() CustomRoleMapOutput {
	return o
}

func (o CustomRoleMapOutput) ToCustomRoleMapOutputWithContext(ctx context.Context) CustomRoleMapOutput {
	return o
}

func (o CustomRoleMapOutput) MapIndex(k pulumi.StringInput) CustomRoleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CustomRole {
		return vs[0].(map[string]*CustomRole)[vs[1].(string)]
	}).(CustomRoleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CustomRoleInput)(nil)).Elem(), &CustomRole{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomRoleArrayInput)(nil)).Elem(), CustomRoleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CustomRoleMapInput)(nil)).Elem(), CustomRoleMap{})
	pulumi.RegisterOutputType(CustomRoleOutput{})
	pulumi.RegisterOutputType(CustomRoleArrayOutput{})
	pulumi.RegisterOutputType(CustomRoleMapOutput{})
}
