# coding=utf-8
# *** WARNING: this file was generated by pulumi-language-python. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins as _builtins
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['TeamRoutingRuleArgs', 'TeamRoutingRule']

@pulumi.input_type
class TeamRoutingRuleArgs:
    def __init__(__self__, *,
                 notifies: pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleNotifyArgs']]],
                 team_id: pulumi.Input[_builtins.str],
                 criterias: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleCriteriaArgs']]]] = None,
                 is_default: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 order: Optional[pulumi.Input[_builtins.int]] = None,
                 time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleTimeRestrictionArgs']]]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        The set of arguments for constructing a TeamRoutingRule resource.
        :param pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleNotifyArgs']]] notifies: Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        :param pulumi.Input[_builtins.str] team_id: Id of the team owning the routing rule
        :param pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleCriteriaArgs']]] criterias: You can refer Criteria for detailed information about criteria and its fields
        :param pulumi.Input[_builtins.bool] is_default: Only use when importing default routing rule
        :param pulumi.Input[_builtins.str] name: Name of the team routing rule
        :param pulumi.Input[_builtins.int] order: The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        :param pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleTimeRestrictionArgs']]] time_restrictions: You can refer Time Restriction for detailed information about time restriction and its fields.
        :param pulumi.Input[_builtins.str] timezone: Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        """
        pulumi.set(__self__, "notifies", notifies)
        pulumi.set(__self__, "team_id", team_id)
        if criterias is not None:
            pulumi.set(__self__, "criterias", criterias)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if order is not None:
            pulumi.set(__self__, "order", order)
        if time_restrictions is not None:
            pulumi.set(__self__, "time_restrictions", time_restrictions)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @_builtins.property
    @pulumi.getter
    def notifies(self) -> pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleNotifyArgs']]]:
        """
        Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        """
        return pulumi.get(self, "notifies")

    @notifies.setter
    def notifies(self, value: pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleNotifyArgs']]]):
        pulumi.set(self, "notifies", value)

    @_builtins.property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Input[_builtins.str]:
        """
        Id of the team owning the routing rule
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "team_id", value)

    @_builtins.property
    @pulumi.getter
    def criterias(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleCriteriaArgs']]]]:
        """
        You can refer Criteria for detailed information about criteria and its fields
        """
        return pulumi.get(self, "criterias")

    @criterias.setter
    def criterias(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleCriteriaArgs']]]]):
        pulumi.set(self, "criterias", value)

    @_builtins.property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Only use when importing default routing rule
        """
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "is_default", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the team routing rule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "order", value)

    @_builtins.property
    @pulumi.getter(name="timeRestrictions")
    def time_restrictions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleTimeRestrictionArgs']]]]:
        """
        You can refer Time Restriction for detailed information about time restriction and its fields.
        """
        return pulumi.get(self, "time_restrictions")

    @time_restrictions.setter
    def time_restrictions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleTimeRestrictionArgs']]]]):
        pulumi.set(self, "time_restrictions", value)

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "timezone", value)


@pulumi.input_type
class _TeamRoutingRuleState:
    def __init__(__self__, *,
                 criterias: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleCriteriaArgs']]]] = None,
                 is_default: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 notifies: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleNotifyArgs']]]] = None,
                 order: Optional[pulumi.Input[_builtins.int]] = None,
                 team_id: Optional[pulumi.Input[_builtins.str]] = None,
                 time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleTimeRestrictionArgs']]]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering TeamRoutingRule resources.
        :param pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleCriteriaArgs']]] criterias: You can refer Criteria for detailed information about criteria and its fields
        :param pulumi.Input[_builtins.bool] is_default: Only use when importing default routing rule
        :param pulumi.Input[_builtins.str] name: Name of the team routing rule
        :param pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleNotifyArgs']]] notifies: Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        :param pulumi.Input[_builtins.int] order: The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        :param pulumi.Input[_builtins.str] team_id: Id of the team owning the routing rule
        :param pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleTimeRestrictionArgs']]] time_restrictions: You can refer Time Restriction for detailed information about time restriction and its fields.
        :param pulumi.Input[_builtins.str] timezone: Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        """
        if criterias is not None:
            pulumi.set(__self__, "criterias", criterias)
        if is_default is not None:
            pulumi.set(__self__, "is_default", is_default)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notifies is not None:
            pulumi.set(__self__, "notifies", notifies)
        if order is not None:
            pulumi.set(__self__, "order", order)
        if team_id is not None:
            pulumi.set(__self__, "team_id", team_id)
        if time_restrictions is not None:
            pulumi.set(__self__, "time_restrictions", time_restrictions)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)

    @_builtins.property
    @pulumi.getter
    def criterias(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleCriteriaArgs']]]]:
        """
        You can refer Criteria for detailed information about criteria and its fields
        """
        return pulumi.get(self, "criterias")

    @criterias.setter
    def criterias(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleCriteriaArgs']]]]):
        pulumi.set(self, "criterias", value)

    @_builtins.property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> Optional[pulumi.Input[_builtins.bool]]:
        """
        Only use when importing default routing rule
        """
        return pulumi.get(self, "is_default")

    @is_default.setter
    def is_default(self, value: Optional[pulumi.Input[_builtins.bool]]):
        pulumi.set(self, "is_default", value)

    @_builtins.property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Name of the team routing rule
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "name", value)

    @_builtins.property
    @pulumi.getter
    def notifies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleNotifyArgs']]]]:
        """
        Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        """
        return pulumi.get(self, "notifies")

    @notifies.setter
    def notifies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleNotifyArgs']]]]):
        pulumi.set(self, "notifies", value)

    @_builtins.property
    @pulumi.getter
    def order(self) -> Optional[pulumi.Input[_builtins.int]]:
        """
        The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        """
        return pulumi.get(self, "order")

    @order.setter
    def order(self, value: Optional[pulumi.Input[_builtins.int]]):
        pulumi.set(self, "order", value)

    @_builtins.property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Id of the team owning the routing rule
        """
        return pulumi.get(self, "team_id")

    @team_id.setter
    def team_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "team_id", value)

    @_builtins.property
    @pulumi.getter(name="timeRestrictions")
    def time_restrictions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleTimeRestrictionArgs']]]]:
        """
        You can refer Time Restriction for detailed information about time restriction and its fields.
        """
        return pulumi.get(self, "time_restrictions")

    @time_restrictions.setter
    def time_restrictions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['TeamRoutingRuleTimeRestrictionArgs']]]]):
        pulumi.set(self, "time_restrictions", value)

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "timezone", value)


@pulumi.type_token("opsgenie:index/teamRoutingRule:TeamRoutingRule")
class TeamRoutingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 criterias: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleCriteriaArgs', 'TeamRoutingRuleCriteriaArgsDict']]]]] = None,
                 is_default: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 notifies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleNotifyArgs', 'TeamRoutingRuleNotifyArgsDict']]]]] = None,
                 order: Optional[pulumi.Input[_builtins.int]] = None,
                 team_id: Optional[pulumi.Input[_builtins.str]] = None,
                 time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleTimeRestrictionArgs', 'TeamRoutingRuleTimeRestrictionArgsDict']]]]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Team Routing Rule within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.Schedule("test",
            name="genieschedule",
            description="schedule test",
            timezone="Europe/Rome",
            enabled=False)
        test_team = opsgenie.Team("test",
            name="example team",
            description="This team deals with all the things")
        test_team_routing_rule = opsgenie.TeamRoutingRule("test",
            name="routing rule example",
            team_id=test_team.id,
            order=0,
            timezone="America/Los_Angeles",
            criterias=[{
                "type": "match-any-condition",
                "conditions": [{
                    "field": "message",
                    "operation": "contains",
                    "expected_value": "expected1",
                    "not_": False,
                }],
            }],
            time_restrictions=[{
                "type": "weekday-and-time-of-day",
                "restriction_list": [{
                    "start_day": "monday",
                    "start_hour": 8,
                    "start_min": 0,
                    "end_day": "tuesday",
                    "end_hour": 18,
                    "end_min": 30,
                }],
            }],
            notifies=[{
                "name": test.name,
                "type": "schedule",
            }])
        ```

        ## Import

        Team Routing Rules can be imported using the `team_id/routing_rule_id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/teamRoutingRule:TeamRoutingRule ruletest team_id/routing_rule_id`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleCriteriaArgs', 'TeamRoutingRuleCriteriaArgsDict']]]] criterias: You can refer Criteria for detailed information about criteria and its fields
        :param pulumi.Input[_builtins.bool] is_default: Only use when importing default routing rule
        :param pulumi.Input[_builtins.str] name: Name of the team routing rule
        :param pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleNotifyArgs', 'TeamRoutingRuleNotifyArgsDict']]]] notifies: Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        :param pulumi.Input[_builtins.int] order: The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        :param pulumi.Input[_builtins.str] team_id: Id of the team owning the routing rule
        :param pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleTimeRestrictionArgs', 'TeamRoutingRuleTimeRestrictionArgsDict']]]] time_restrictions: You can refer Time Restriction for detailed information about time restriction and its fields.
        :param pulumi.Input[_builtins.str] timezone: Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: TeamRoutingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Team Routing Rule within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.Schedule("test",
            name="genieschedule",
            description="schedule test",
            timezone="Europe/Rome",
            enabled=False)
        test_team = opsgenie.Team("test",
            name="example team",
            description="This team deals with all the things")
        test_team_routing_rule = opsgenie.TeamRoutingRule("test",
            name="routing rule example",
            team_id=test_team.id,
            order=0,
            timezone="America/Los_Angeles",
            criterias=[{
                "type": "match-any-condition",
                "conditions": [{
                    "field": "message",
                    "operation": "contains",
                    "expected_value": "expected1",
                    "not_": False,
                }],
            }],
            time_restrictions=[{
                "type": "weekday-and-time-of-day",
                "restriction_list": [{
                    "start_day": "monday",
                    "start_hour": 8,
                    "start_min": 0,
                    "end_day": "tuesday",
                    "end_hour": 18,
                    "end_min": 30,
                }],
            }],
            notifies=[{
                "name": test.name,
                "type": "schedule",
            }])
        ```

        ## Import

        Team Routing Rules can be imported using the `team_id/routing_rule_id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/teamRoutingRule:TeamRoutingRule ruletest team_id/routing_rule_id`
        ```

        :param str resource_name: The name of the resource.
        :param TeamRoutingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(TeamRoutingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 criterias: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleCriteriaArgs', 'TeamRoutingRuleCriteriaArgsDict']]]]] = None,
                 is_default: Optional[pulumi.Input[_builtins.bool]] = None,
                 name: Optional[pulumi.Input[_builtins.str]] = None,
                 notifies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleNotifyArgs', 'TeamRoutingRuleNotifyArgsDict']]]]] = None,
                 order: Optional[pulumi.Input[_builtins.int]] = None,
                 team_id: Optional[pulumi.Input[_builtins.str]] = None,
                 time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleTimeRestrictionArgs', 'TeamRoutingRuleTimeRestrictionArgsDict']]]]] = None,
                 timezone: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = TeamRoutingRuleArgs.__new__(TeamRoutingRuleArgs)

            __props__.__dict__["criterias"] = criterias
            __props__.__dict__["is_default"] = is_default
            __props__.__dict__["name"] = name
            if notifies is None and not opts.urn:
                raise TypeError("Missing required property 'notifies'")
            __props__.__dict__["notifies"] = notifies
            __props__.__dict__["order"] = order
            if team_id is None and not opts.urn:
                raise TypeError("Missing required property 'team_id'")
            __props__.__dict__["team_id"] = team_id
            __props__.__dict__["time_restrictions"] = time_restrictions
            __props__.__dict__["timezone"] = timezone
        super(TeamRoutingRule, __self__).__init__(
            'opsgenie:index/teamRoutingRule:TeamRoutingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            criterias: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleCriteriaArgs', 'TeamRoutingRuleCriteriaArgsDict']]]]] = None,
            is_default: Optional[pulumi.Input[_builtins.bool]] = None,
            name: Optional[pulumi.Input[_builtins.str]] = None,
            notifies: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleNotifyArgs', 'TeamRoutingRuleNotifyArgsDict']]]]] = None,
            order: Optional[pulumi.Input[_builtins.int]] = None,
            team_id: Optional[pulumi.Input[_builtins.str]] = None,
            time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleTimeRestrictionArgs', 'TeamRoutingRuleTimeRestrictionArgsDict']]]]] = None,
            timezone: Optional[pulumi.Input[_builtins.str]] = None) -> 'TeamRoutingRule':
        """
        Get an existing TeamRoutingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleCriteriaArgs', 'TeamRoutingRuleCriteriaArgsDict']]]] criterias: You can refer Criteria for detailed information about criteria and its fields
        :param pulumi.Input[_builtins.bool] is_default: Only use when importing default routing rule
        :param pulumi.Input[_builtins.str] name: Name of the team routing rule
        :param pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleNotifyArgs', 'TeamRoutingRuleNotifyArgsDict']]]] notifies: Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        :param pulumi.Input[_builtins.int] order: The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        :param pulumi.Input[_builtins.str] team_id: Id of the team owning the routing rule
        :param pulumi.Input[Sequence[pulumi.Input[Union['TeamRoutingRuleTimeRestrictionArgs', 'TeamRoutingRuleTimeRestrictionArgsDict']]]] time_restrictions: You can refer Time Restriction for detailed information about time restriction and its fields.
        :param pulumi.Input[_builtins.str] timezone: Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _TeamRoutingRuleState.__new__(_TeamRoutingRuleState)

        __props__.__dict__["criterias"] = criterias
        __props__.__dict__["is_default"] = is_default
        __props__.__dict__["name"] = name
        __props__.__dict__["notifies"] = notifies
        __props__.__dict__["order"] = order
        __props__.__dict__["team_id"] = team_id
        __props__.__dict__["time_restrictions"] = time_restrictions
        __props__.__dict__["timezone"] = timezone
        return TeamRoutingRule(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter
    def criterias(self) -> pulumi.Output[Optional[Sequence['outputs.TeamRoutingRuleCriteria']]]:
        """
        You can refer Criteria for detailed information about criteria and its fields
        """
        return pulumi.get(self, "criterias")

    @_builtins.property
    @pulumi.getter(name="isDefault")
    def is_default(self) -> pulumi.Output[Optional[_builtins.bool]]:
        """
        Only use when importing default routing rule
        """
        return pulumi.get(self, "is_default")

    @_builtins.property
    @pulumi.getter
    def name(self) -> pulumi.Output[_builtins.str]:
        """
        Name of the team routing rule
        """
        return pulumi.get(self, "name")

    @_builtins.property
    @pulumi.getter
    def notifies(self) -> pulumi.Output[Sequence['outputs.TeamRoutingRuleNotify']]:
        """
        Target entity of schedule, escalation, or the reserved word none which will be notified in routing rule. The possible values are: `schedule`, `escalation`, `none`
        """
        return pulumi.get(self, "notifies")

    @_builtins.property
    @pulumi.getter
    def order(self) -> pulumi.Output[Optional[_builtins.int]]:
        """
        The order of the team routing rule within the rules. order value is actually the index of the team routing rule whose minimum value is 0 and whose maximum value is n-1 (number of team routing rules is n)
        """
        return pulumi.get(self, "order")

    @_builtins.property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Output[_builtins.str]:
        """
        Id of the team owning the routing rule
        """
        return pulumi.get(self, "team_id")

    @_builtins.property
    @pulumi.getter(name="timeRestrictions")
    def time_restrictions(self) -> pulumi.Output[Optional[Sequence['outputs.TeamRoutingRuleTimeRestriction']]]:
        """
        You can refer Time Restriction for detailed information about time restriction and its fields.
        """
        return pulumi.get(self, "time_restrictions")

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[Optional[_builtins.str]]:
        """
        Timezone of team routing rule. If timezone field is not given, account timezone is used as default.You can refer to Supported Locale IDs for available timezones
        """
        return pulumi.get(self, "timezone")

