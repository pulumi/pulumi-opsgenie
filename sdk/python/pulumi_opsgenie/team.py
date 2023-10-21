# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TeamArgs', 'Team']

@pulumi.input_type
class TeamArgs:
    def __init__(__self__, *,
                 delete_default_resources: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ignore_members: Optional[pulumi.Input[bool]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Team resource.
        :param pulumi.Input[bool] delete_default_resources: Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        :param pulumi.Input[str] description: A description for this team.
        :param pulumi.Input[bool] ignore_members: Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        :param pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]] members: A Member block as documented below.
        :param pulumi.Input[str] name: The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        """
        TeamArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            delete_default_resources=delete_default_resources,
            description=description,
            ignore_members=ignore_members,
            members=members,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             delete_default_resources: Optional[pulumi.Input[bool]] = None,
             description: Optional[pulumi.Input[str]] = None,
             ignore_members: Optional[pulumi.Input[bool]] = None,
             members: Optional[pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'deleteDefaultResources' in kwargs:
            delete_default_resources = kwargs['deleteDefaultResources']
        if 'ignoreMembers' in kwargs:
            ignore_members = kwargs['ignoreMembers']

        if delete_default_resources is not None:
            _setter("delete_default_resources", delete_default_resources)
        if description is not None:
            _setter("description", description)
        if ignore_members is not None:
            _setter("ignore_members", ignore_members)
        if members is not None:
            _setter("members", members)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter(name="deleteDefaultResources")
    def delete_default_resources(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        """
        return pulumi.get(self, "delete_default_resources")

    @delete_default_resources.setter
    def delete_default_resources(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_default_resources", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for this team.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ignoreMembers")
    def ignore_members(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        """
        return pulumi.get(self, "ignore_members")

    @ignore_members.setter
    def ignore_members(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_members", value)

    @property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]]]:
        """
        A Member block as documented below.
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _TeamState:
    def __init__(__self__, *,
                 delete_default_resources: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ignore_members: Optional[pulumi.Input[bool]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Team resources.
        :param pulumi.Input[bool] delete_default_resources: Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        :param pulumi.Input[str] description: A description for this team.
        :param pulumi.Input[bool] ignore_members: Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        :param pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]] members: A Member block as documented below.
        :param pulumi.Input[str] name: The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        """
        _TeamState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            delete_default_resources=delete_default_resources,
            description=description,
            ignore_members=ignore_members,
            members=members,
            name=name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             delete_default_resources: Optional[pulumi.Input[bool]] = None,
             description: Optional[pulumi.Input[str]] = None,
             ignore_members: Optional[pulumi.Input[bool]] = None,
             members: Optional[pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]]] = None,
             name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if 'deleteDefaultResources' in kwargs:
            delete_default_resources = kwargs['deleteDefaultResources']
        if 'ignoreMembers' in kwargs:
            ignore_members = kwargs['ignoreMembers']

        if delete_default_resources is not None:
            _setter("delete_default_resources", delete_default_resources)
        if description is not None:
            _setter("description", description)
        if ignore_members is not None:
            _setter("ignore_members", ignore_members)
        if members is not None:
            _setter("members", members)
        if name is not None:
            _setter("name", name)

    @property
    @pulumi.getter(name="deleteDefaultResources")
    def delete_default_resources(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        """
        return pulumi.get(self, "delete_default_resources")

    @delete_default_resources.setter
    def delete_default_resources(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "delete_default_resources", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        A description for this team.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="ignoreMembers")
    def ignore_members(self) -> Optional[pulumi.Input[bool]]:
        """
        Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        """
        return pulumi.get(self, "ignore_members")

    @ignore_members.setter
    def ignore_members(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_members", value)

    @property
    @pulumi.getter
    def members(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]]]:
        """
        A Member block as documented below.
        """
        return pulumi.get(self, "members")

    @members.setter
    def members(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamMemberArgs']]]]):
        pulumi.set(self, "members", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


class Team(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_default_resources: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ignore_members: Optional[pulumi.Input[bool]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamMemberArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Team within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        first = opsgenie.User("first",
            full_name="name ",
            role="User",
            username="user@domain.com")
        second = opsgenie.User("second",
            full_name="name ",
            role="User",
            username="test@domain.com")
        test = opsgenie.Team("test",
            description="This team deals with all the things",
            members=[
                opsgenie.TeamMemberArgs(
                    id=first.id,
                    role="admin",
                ),
                opsgenie.TeamMemberArgs(
                    id=second.id,
                    role="user",
                ),
            ])
        self_service = opsgenie.Team("self-service",
            delete_default_resources=True,
            description="Membership in this team is managed via OpsGenie web UI only",
            ignore_members=True)
        ```

        ## Import

        Teams can be imported using the `team_id`, e.g.

        ```sh
         $ pulumi import opsgenie:index/team:Team team1 team_id`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_default_resources: Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        :param pulumi.Input[str] description: A description for this team.
        :param pulumi.Input[bool] ignore_members: Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamMemberArgs']]]] members: A Member block as documented below.
        :param pulumi.Input[str] name: The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[TeamArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Team within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        first = opsgenie.User("first",
            full_name="name ",
            role="User",
            username="user@domain.com")
        second = opsgenie.User("second",
            full_name="name ",
            role="User",
            username="test@domain.com")
        test = opsgenie.Team("test",
            description="This team deals with all the things",
            members=[
                opsgenie.TeamMemberArgs(
                    id=first.id,
                    role="admin",
                ),
                opsgenie.TeamMemberArgs(
                    id=second.id,
                    role="user",
                ),
            ])
        self_service = opsgenie.Team("self-service",
            delete_default_resources=True,
            description="Membership in this team is managed via OpsGenie web UI only",
            ignore_members=True)
        ```

        ## Import

        Teams can be imported using the `team_id`, e.g.

        ```sh
         $ pulumi import opsgenie:index/team:Team team1 team_id`
        ```

        :param str resource_name: The name of the resource.
        :param TeamArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            TeamArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_default_resources: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ignore_members: Optional[pulumi.Input[bool]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamMemberArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamArgs.__new__(TeamArgs)

            __props__.__dict__["delete_default_resources"] = delete_default_resources
            __props__.__dict__["description"] = description
            __props__.__dict__["ignore_members"] = ignore_members
            __props__.__dict__["members"] = members
            __props__.__dict__["name"] = name
        super(Team, __self__).__init__(
            'opsgenie:index/team:Team',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            delete_default_resources: Optional[pulumi.Input[bool]] = None,
            description: Optional[pulumi.Input[str]] = None,
            ignore_members: Optional[pulumi.Input[bool]] = None,
            members: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamMemberArgs']]]]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'Team':
        """
        Get an existing Team resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_default_resources: Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        :param pulumi.Input[str] description: A description for this team.
        :param pulumi.Input[bool] ignore_members: Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamMemberArgs']]]] members: A Member block as documented below.
        :param pulumi.Input[str] name: The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamState.__new__(_TeamState)

        __props__.__dict__["delete_default_resources"] = delete_default_resources
        __props__.__dict__["description"] = description
        __props__.__dict__["ignore_members"] = ignore_members
        __props__.__dict__["members"] = members
        __props__.__dict__["name"] = name
        return Team(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="deleteDefaultResources")
    def delete_default_resources(self) -> pulumi.Output[Optional[bool]]:
        """
        Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        """
        return pulumi.get(self, "delete_default_resources")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        A description for this team.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="ignoreMembers")
    def ignore_members(self) -> pulumi.Output[Optional[bool]]:
        """
        Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Default: `false`.
        """
        return pulumi.get(self, "ignore_members")

    @property
    @pulumi.getter
    def members(self) -> pulumi.Output[Optional[Sequence['outputs.TeamMember']]]:
        """
        A Member block as documented below.
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        """
        return pulumi.get(self, "name")

