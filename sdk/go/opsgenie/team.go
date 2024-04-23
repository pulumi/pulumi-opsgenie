// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Team within Opsgenie.
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
//			first, err := opsgenie.NewUser(ctx, "first", &opsgenie.UserArgs{
//				Username: pulumi.String("user@domain.com"),
//				FullName: pulumi.String("name "),
//				Role:     pulumi.String("User"),
//			})
//			if err != nil {
//				return err
//			}
//			second, err := opsgenie.NewUser(ctx, "second", &opsgenie.UserArgs{
//				Username: pulumi.String("test@domain.com"),
//				FullName: pulumi.String("name "),
//				Role:     pulumi.String("User"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = opsgenie.NewTeam(ctx, "test", &opsgenie.TeamArgs{
//				Name:        pulumi.String("example"),
//				Description: pulumi.String("This team deals with all the things"),
//				Members: opsgenie.TeamMemberArray{
//					&opsgenie.TeamMemberArgs{
//						Id:   first.ID(),
//						Role: pulumi.String("admin"),
//					},
//					&opsgenie.TeamMemberArgs{
//						Id:   second.ID(),
//						Role: pulumi.String("user"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = opsgenie.NewTeam(ctx, "self-service", &opsgenie.TeamArgs{
//				Name:                   pulumi.String("Self Service"),
//				Description:            pulumi.String("Membership in this team is managed via OpsGenie web UI only"),
//				IgnoreMembers:          pulumi.Bool(true),
//				DeleteDefaultResources: pulumi.Bool(true),
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
// Teams can be imported using the `team_id`, e.g.
//
// ```sh
// $ pulumi import opsgenie:index/team:Team team1 team_id`
// ```
type Team struct {
	pulumi.CustomResourceState

	// Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
	DeleteDefaultResources pulumi.BoolPtrOutput `pulumi:"deleteDefaultResources"`
	// A description for this team.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
	IgnoreMembers pulumi.BoolPtrOutput `pulumi:"ignoreMembers"`
	// A Member block as documented below.
	Members TeamMemberArrayOutput `pulumi:"members"`
	// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
	Name pulumi.StringOutput `pulumi:"name"`
}

// NewTeam registers a new resource with the given unique name, arguments, and options.
func NewTeam(ctx *pulumi.Context,
	name string, args *TeamArgs, opts ...pulumi.ResourceOption) (*Team, error) {
	if args == nil {
		args = &TeamArgs{}
	}

	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Team
	err := ctx.RegisterResource("opsgenie:index/team:Team", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTeam gets an existing Team resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTeam(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TeamState, opts ...pulumi.ResourceOption) (*Team, error) {
	var resource Team
	err := ctx.ReadResource("opsgenie:index/team:Team", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Team resources.
type teamState struct {
	// Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
	DeleteDefaultResources *bool `pulumi:"deleteDefaultResources"`
	// A description for this team.
	Description *string `pulumi:"description"`
	// Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
	IgnoreMembers *bool `pulumi:"ignoreMembers"`
	// A Member block as documented below.
	Members []TeamMember `pulumi:"members"`
	// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
	Name *string `pulumi:"name"`
}

type TeamState struct {
	// Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
	DeleteDefaultResources pulumi.BoolPtrInput
	// A description for this team.
	Description pulumi.StringPtrInput
	// Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
	IgnoreMembers pulumi.BoolPtrInput
	// A Member block as documented below.
	Members TeamMemberArrayInput
	// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
	Name pulumi.StringPtrInput
}

func (TeamState) ElementType() reflect.Type {
	return reflect.TypeOf((*teamState)(nil)).Elem()
}

type teamArgs struct {
	// Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
	DeleteDefaultResources *bool `pulumi:"deleteDefaultResources"`
	// A description for this team.
	Description *string `pulumi:"description"`
	// Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
	IgnoreMembers *bool `pulumi:"ignoreMembers"`
	// A Member block as documented below.
	Members []TeamMember `pulumi:"members"`
	// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Team resource.
type TeamArgs struct {
	// Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
	DeleteDefaultResources pulumi.BoolPtrInput
	// A description for this team.
	Description pulumi.StringPtrInput
	// Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
	IgnoreMembers pulumi.BoolPtrInput
	// A Member block as documented below.
	Members TeamMemberArrayInput
	// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
	Name pulumi.StringPtrInput
}

func (TeamArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*teamArgs)(nil)).Elem()
}

type TeamInput interface {
	pulumi.Input

	ToTeamOutput() TeamOutput
	ToTeamOutputWithContext(ctx context.Context) TeamOutput
}

func (*Team) ElementType() reflect.Type {
	return reflect.TypeOf((**Team)(nil)).Elem()
}

func (i *Team) ToTeamOutput() TeamOutput {
	return i.ToTeamOutputWithContext(context.Background())
}

func (i *Team) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamOutput)
}

// TeamArrayInput is an input type that accepts TeamArray and TeamArrayOutput values.
// You can construct a concrete instance of `TeamArrayInput` via:
//
//	TeamArray{ TeamArgs{...} }
type TeamArrayInput interface {
	pulumi.Input

	ToTeamArrayOutput() TeamArrayOutput
	ToTeamArrayOutputWithContext(context.Context) TeamArrayOutput
}

type TeamArray []TeamInput

func (TeamArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Team)(nil)).Elem()
}

func (i TeamArray) ToTeamArrayOutput() TeamArrayOutput {
	return i.ToTeamArrayOutputWithContext(context.Background())
}

func (i TeamArray) ToTeamArrayOutputWithContext(ctx context.Context) TeamArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamArrayOutput)
}

// TeamMapInput is an input type that accepts TeamMap and TeamMapOutput values.
// You can construct a concrete instance of `TeamMapInput` via:
//
//	TeamMap{ "key": TeamArgs{...} }
type TeamMapInput interface {
	pulumi.Input

	ToTeamMapOutput() TeamMapOutput
	ToTeamMapOutputWithContext(context.Context) TeamMapOutput
}

type TeamMap map[string]TeamInput

func (TeamMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Team)(nil)).Elem()
}

func (i TeamMap) ToTeamMapOutput() TeamMapOutput {
	return i.ToTeamMapOutputWithContext(context.Background())
}

func (i TeamMap) ToTeamMapOutputWithContext(ctx context.Context) TeamMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamMapOutput)
}

type TeamOutput struct{ *pulumi.OutputState }

func (TeamOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Team)(nil)).Elem()
}

func (o TeamOutput) ToTeamOutput() TeamOutput {
	return o
}

func (o TeamOutput) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return o
}

// Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
func (o TeamOutput) DeleteDefaultResources() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Team) pulumi.BoolPtrOutput { return v.DeleteDefaultResources }).(pulumi.BoolPtrOutput)
}

// A description for this team.
func (o TeamOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Team) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
func (o TeamOutput) IgnoreMembers() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Team) pulumi.BoolPtrOutput { return v.IgnoreMembers }).(pulumi.BoolPtrOutput)
}

// A Member block as documented below.
func (o TeamOutput) Members() TeamMemberArrayOutput {
	return o.ApplyT(func(v *Team) TeamMemberArrayOutput { return v.Members }).(TeamMemberArrayOutput)
}

// The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
func (o TeamOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Team) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

type TeamArrayOutput struct{ *pulumi.OutputState }

func (TeamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Team)(nil)).Elem()
}

func (o TeamArrayOutput) ToTeamArrayOutput() TeamArrayOutput {
	return o
}

func (o TeamArrayOutput) ToTeamArrayOutputWithContext(ctx context.Context) TeamArrayOutput {
	return o
}

func (o TeamArrayOutput) Index(i pulumi.IntInput) TeamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Team {
		return vs[0].([]*Team)[vs[1].(int)]
	}).(TeamOutput)
}

type TeamMapOutput struct{ *pulumi.OutputState }

func (TeamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Team)(nil)).Elem()
}

func (o TeamMapOutput) ToTeamMapOutput() TeamMapOutput {
	return o
}

func (o TeamMapOutput) ToTeamMapOutputWithContext(ctx context.Context) TeamMapOutput {
	return o
}

func (o TeamMapOutput) MapIndex(k pulumi.StringInput) TeamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Team {
		return vs[0].(map[string]*Team)[vs[1].(string)]
	}).(TeamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamInput)(nil)).Elem(), &Team{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamArrayInput)(nil)).Elem(), TeamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamMapInput)(nil)).Elem(), TeamMap{})
	pulumi.RegisterOutputType(TeamOutput{})
	pulumi.RegisterOutputType(TeamArrayOutput{})
	pulumi.RegisterOutputType(TeamMapOutput{})
}
