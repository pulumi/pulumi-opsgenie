// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"context"
	"reflect"

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
// 	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		first, err := opsgenie.NewUser(ctx, "first", &opsgenie.UserArgs{
// 			FullName: pulumi.String("name "),
// 			Role:     pulumi.String("User"),
// 			Username: pulumi.String("user@domain.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		second, err := opsgenie.NewUser(ctx, "second", &opsgenie.UserArgs{
// 			FullName: pulumi.String("name "),
// 			Role:     pulumi.String("User"),
// 			Username: pulumi.String("test@domain.com"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = opsgenie.NewTeam(ctx, "test", &opsgenie.TeamArgs{
// 			Description: pulumi.String("This team deals with all the things"),
// 			Members: TeamMemberArray{
// 				&TeamMemberArgs{
// 					Id:   first.ID(),
// 					Role: pulumi.String("admin"),
// 				},
// 				&TeamMemberArgs{
// 					Id:   second.ID(),
// 					Role: pulumi.String("user"),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = opsgenie.NewTeam(ctx, "self_service", &opsgenie.TeamArgs{
// 			DeleteDefaultResources: pulumi.Bool(true),
// 			Description:            pulumi.String("Membership in this team is managed via OpsGenie web UI only"),
// 			IgnoreMembers:          pulumi.Bool(true),
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
// Teams can be imported using the `team_id`, e.g.
//
// ```sh
//  $ pulumi import opsgenie:index/team:Team team1 team_id`
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
	return reflect.TypeOf((*Team)(nil))
}

func (i *Team) ToTeamOutput() TeamOutput {
	return i.ToTeamOutputWithContext(context.Background())
}

func (i *Team) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamOutput)
}

func (i *Team) ToTeamPtrOutput() TeamPtrOutput {
	return i.ToTeamPtrOutputWithContext(context.Background())
}

func (i *Team) ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamPtrOutput)
}

type TeamPtrInput interface {
	pulumi.Input

	ToTeamPtrOutput() TeamPtrOutput
	ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput
}

type teamPtrType TeamArgs

func (*teamPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**Team)(nil))
}

func (i *teamPtrType) ToTeamPtrOutput() TeamPtrOutput {
	return i.ToTeamPtrOutputWithContext(context.Background())
}

func (i *teamPtrType) ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TeamPtrOutput)
}

// TeamArrayInput is an input type that accepts TeamArray and TeamArrayOutput values.
// You can construct a concrete instance of `TeamArrayInput` via:
//
//          TeamArray{ TeamArgs{...} }
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
//          TeamMap{ "key": TeamArgs{...} }
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
	return reflect.TypeOf((*Team)(nil))
}

func (o TeamOutput) ToTeamOutput() TeamOutput {
	return o
}

func (o TeamOutput) ToTeamOutputWithContext(ctx context.Context) TeamOutput {
	return o
}

func (o TeamOutput) ToTeamPtrOutput() TeamPtrOutput {
	return o.ToTeamPtrOutputWithContext(context.Background())
}

func (o TeamOutput) ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v Team) *Team {
		return &v
	}).(TeamPtrOutput)
}

type TeamPtrOutput struct{ *pulumi.OutputState }

func (TeamPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Team)(nil))
}

func (o TeamPtrOutput) ToTeamPtrOutput() TeamPtrOutput {
	return o
}

func (o TeamPtrOutput) ToTeamPtrOutputWithContext(ctx context.Context) TeamPtrOutput {
	return o
}

func (o TeamPtrOutput) Elem() TeamOutput {
	return o.ApplyT(func(v *Team) Team {
		if v != nil {
			return *v
		}
		var ret Team
		return ret
	}).(TeamOutput)
}

type TeamArrayOutput struct{ *pulumi.OutputState }

func (TeamArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]Team)(nil))
}

func (o TeamArrayOutput) ToTeamArrayOutput() TeamArrayOutput {
	return o
}

func (o TeamArrayOutput) ToTeamArrayOutputWithContext(ctx context.Context) TeamArrayOutput {
	return o
}

func (o TeamArrayOutput) Index(i pulumi.IntInput) TeamOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) Team {
		return vs[0].([]Team)[vs[1].(int)]
	}).(TeamOutput)
}

type TeamMapOutput struct{ *pulumi.OutputState }

func (TeamMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]Team)(nil))
}

func (o TeamMapOutput) ToTeamMapOutput() TeamMapOutput {
	return o
}

func (o TeamMapOutput) ToTeamMapOutputWithContext(ctx context.Context) TeamMapOutput {
	return o
}

func (o TeamMapOutput) MapIndex(k pulumi.StringInput) TeamOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) Team {
		return vs[0].(map[string]Team)[vs[1].(string)]
	}).(TeamOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TeamInput)(nil)).Elem(), &Team{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamPtrInput)(nil)).Elem(), &Team{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamArrayInput)(nil)).Elem(), TeamArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TeamMapInput)(nil)).Elem(), TeamMap{})
	pulumi.RegisterOutputType(TeamOutput{})
	pulumi.RegisterOutputType(TeamPtrOutput{})
	pulumi.RegisterOutputType(TeamArrayOutput{})
	pulumi.RegisterOutputType(TeamMapOutput{})
}
