# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['Team']


class Team(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 delete_default_resources: Optional[pulumi.Input[bool]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 ignore_members: Optional[pulumi.Input[bool]] = None,
                 members: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamMemberArgs']]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

        Teams can be imported using the `id`, e.g.

        ```sh
         $ pulumi import opsgenie:index/team:Team team1 812be1a1-32c8-4666-a7fb-03ecc385106c`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] delete_default_resources: Set to true to remove default escalation and schedule for newly created team. **Be careful its also changes that team routing rule to None. That means you have to define routing rule as well**
        :param pulumi.Input[str] description: A description for this team.
        :param pulumi.Input[bool] ignore_members: Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Defaults to false.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamMemberArgs']]]] members: A Member block as documented below.
        :param pulumi.Input[str] name: The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['delete_default_resources'] = delete_default_resources
            __props__['description'] = description
            __props__['ignore_members'] = ignore_members
            __props__['members'] = members
            __props__['name'] = name
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
        :param pulumi.Input[bool] ignore_members: Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Defaults to false.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['TeamMemberArgs']]]] members: A Member block as documented below.
        :param pulumi.Input[str] name: The name associated with this team. Opsgenie defines that this must not be longer than 100 characters.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["delete_default_resources"] = delete_default_resources
        __props__["description"] = description
        __props__["ignore_members"] = ignore_members
        __props__["members"] = members
        __props__["name"] = name
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
        Set to true to ignore any configured member blocks and any team member added/updated/removed via OpsGenie web UI. Use this option e.g. to maintain membership via web UI only and use it only for new teams. Changing the value for existing teams might lead to strange behaviour. Defaults to false.
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

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
