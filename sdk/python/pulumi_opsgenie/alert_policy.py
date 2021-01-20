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

__all__ = ['AlertPolicy']


class AlertPolicy(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 actions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 alert_description: Optional[pulumi.Input[str]] = None,
                 alias: Optional[pulumi.Input[str]] = None,
                 continue_policy: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 entity: Optional[pulumi.Input[str]] = None,
                 filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyFilterArgs']]]]] = None,
                 ignore_original_actions: Optional[pulumi.Input[bool]] = None,
                 ignore_original_details: Optional[pulumi.Input[bool]] = None,
                 ignore_original_responders: Optional[pulumi.Input[bool]] = None,
                 ignore_original_tags: Optional[pulumi.Input[bool]] = None,
                 message: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_description: Optional[pulumi.Input[str]] = None,
                 priority: Optional[pulumi.Input[str]] = None,
                 responders: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyResponderArgs']]]]] = None,
                 source: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 team_id: Optional[pulumi.Input[str]] = None,
                 time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyTimeRestrictionArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a Alert Policy within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test_team = opsgenie.Team("testTeam", description="This team deals with all the things")
        test_alert_policy = opsgenie.AlertPolicy("testAlertPolicy",
            team_id=test_team.id,
            policy_description="This is sample policy",
            message="{{message}}",
            filters=[opsgenie.AlertPolicyFilterArgs()],
            time_restrictions=[opsgenie.AlertPolicyTimeRestrictionArgs(
                type="weekday-and-time-of-day",
                restrictions=[
                    opsgenie.AlertPolicyTimeRestrictionRestrictionArgs(
                        end_day="monday",
                        end_hour=7,
                        end_min=0,
                        start_day="sunday",
                        start_hour=21,
                        start_min=0,
                    ),
                    opsgenie.AlertPolicyTimeRestrictionRestrictionArgs(
                        end_day="tuesday",
                        end_hour=7,
                        end_min=0,
                        start_day="monday",
                        start_hour=22,
                        start_min=0,
                    ),
                ],
            )])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] actions: Actions to add to the alerts original actions value as a list of strings. If ignore_original_actions field is set to true, this will replace the original actions.
        :param pulumi.Input[str] alias: Alias of the alert. You can use {{alias}} to refer to the original alias. Default value is {{alias}}
        :param pulumi.Input[bool] enabled: If policy should be enabled. Default: true
        :param pulumi.Input[str] entity: Entity field of the alert. You can use {{entity}} to refer to the original entity. Default value is {{entity}}
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyFilterArgs']]]] filters: A alert filter which will be applied. This filter can be empty: filter {} - this means 'match-all'. This is a block, structure is documented below.
        :param pulumi.Input[bool] ignore_original_actions: If set to true, policy will ignore the original actions of the alert. Default value is false
        :param pulumi.Input[bool] ignore_original_details: If set to true, policy will ignore the original details of the alert. Default value is false
        :param pulumi.Input[bool] ignore_original_responders: If set to true, policy will ignore the original responders of the alert. Default value is false
        :param pulumi.Input[bool] ignore_original_tags: If set to true, policy will ignore the original tags of the alert. Default value is false
        :param pulumi.Input[str] message: Message of the alerts
        :param pulumi.Input[str] name: Name of the responder
        :param pulumi.Input[str] policy_description: Description of the policy. This can be max 512 characters.
        :param pulumi.Input[str] priority: Priority of the alert. Should be one of P1, P2, P3, P4, or P5
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyResponderArgs']]]] responders: Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If ignoreOriginalResponders field is set to true, this will replace the original responders. The possible values for responders are: user, team. This is a block, structure is documented below.
        :param pulumi.Input[str] source: Source field of the alert. You can use {{source}} to refer to the original source. Default value is {{source}}
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to add to the alerts original tags value as a list of strings. If ignoreOriginalResponders field is set to true, this will replace the original responders.
        :param pulumi.Input[str] team_id: Id of team that this policy belongs to.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyTimeRestrictionArgs']]]] time_restrictions: Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
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

            __props__['actions'] = actions
            __props__['alert_description'] = alert_description
            __props__['alias'] = alias
            __props__['continue_policy'] = continue_policy
            __props__['enabled'] = enabled
            __props__['entity'] = entity
            __props__['filters'] = filters
            __props__['ignore_original_actions'] = ignore_original_actions
            __props__['ignore_original_details'] = ignore_original_details
            __props__['ignore_original_responders'] = ignore_original_responders
            __props__['ignore_original_tags'] = ignore_original_tags
            if message is None and not opts.urn:
                raise TypeError("Missing required property 'message'")
            __props__['message'] = message
            __props__['name'] = name
            __props__['policy_description'] = policy_description
            __props__['priority'] = priority
            __props__['responders'] = responders
            __props__['source'] = source
            __props__['tags'] = tags
            __props__['team_id'] = team_id
            __props__['time_restrictions'] = time_restrictions
        super(AlertPolicy, __self__).__init__(
            'opsgenie:index/alertPolicy:AlertPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            actions: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            alert_description: Optional[pulumi.Input[str]] = None,
            alias: Optional[pulumi.Input[str]] = None,
            continue_policy: Optional[pulumi.Input[bool]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            entity: Optional[pulumi.Input[str]] = None,
            filters: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyFilterArgs']]]]] = None,
            ignore_original_actions: Optional[pulumi.Input[bool]] = None,
            ignore_original_details: Optional[pulumi.Input[bool]] = None,
            ignore_original_responders: Optional[pulumi.Input[bool]] = None,
            ignore_original_tags: Optional[pulumi.Input[bool]] = None,
            message: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policy_description: Optional[pulumi.Input[str]] = None,
            priority: Optional[pulumi.Input[str]] = None,
            responders: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyResponderArgs']]]]] = None,
            source: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            team_id: Optional[pulumi.Input[str]] = None,
            time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyTimeRestrictionArgs']]]]] = None) -> 'AlertPolicy':
        """
        Get an existing AlertPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] actions: Actions to add to the alerts original actions value as a list of strings. If ignore_original_actions field is set to true, this will replace the original actions.
        :param pulumi.Input[str] alias: Alias of the alert. You can use {{alias}} to refer to the original alias. Default value is {{alias}}
        :param pulumi.Input[bool] enabled: If policy should be enabled. Default: true
        :param pulumi.Input[str] entity: Entity field of the alert. You can use {{entity}} to refer to the original entity. Default value is {{entity}}
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyFilterArgs']]]] filters: A alert filter which will be applied. This filter can be empty: filter {} - this means 'match-all'. This is a block, structure is documented below.
        :param pulumi.Input[bool] ignore_original_actions: If set to true, policy will ignore the original actions of the alert. Default value is false
        :param pulumi.Input[bool] ignore_original_details: If set to true, policy will ignore the original details of the alert. Default value is false
        :param pulumi.Input[bool] ignore_original_responders: If set to true, policy will ignore the original responders of the alert. Default value is false
        :param pulumi.Input[bool] ignore_original_tags: If set to true, policy will ignore the original tags of the alert. Default value is false
        :param pulumi.Input[str] message: Message of the alerts
        :param pulumi.Input[str] name: Name of the responder
        :param pulumi.Input[str] policy_description: Description of the policy. This can be max 512 characters.
        :param pulumi.Input[str] priority: Priority of the alert. Should be one of P1, P2, P3, P4, or P5
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyResponderArgs']]]] responders: Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If ignoreOriginalResponders field is set to true, this will replace the original responders. The possible values for responders are: user, team. This is a block, structure is documented below.
        :param pulumi.Input[str] source: Source field of the alert. You can use {{source}} to refer to the original source. Default value is {{source}}
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to add to the alerts original tags value as a list of strings. If ignoreOriginalResponders field is set to true, this will replace the original responders.
        :param pulumi.Input[str] team_id: Id of team that this policy belongs to.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['AlertPolicyTimeRestrictionArgs']]]] time_restrictions: Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["actions"] = actions
        __props__["alert_description"] = alert_description
        __props__["alias"] = alias
        __props__["continue_policy"] = continue_policy
        __props__["enabled"] = enabled
        __props__["entity"] = entity
        __props__["filters"] = filters
        __props__["ignore_original_actions"] = ignore_original_actions
        __props__["ignore_original_details"] = ignore_original_details
        __props__["ignore_original_responders"] = ignore_original_responders
        __props__["ignore_original_tags"] = ignore_original_tags
        __props__["message"] = message
        __props__["name"] = name
        __props__["policy_description"] = policy_description
        __props__["priority"] = priority
        __props__["responders"] = responders
        __props__["source"] = source
        __props__["tags"] = tags
        __props__["team_id"] = team_id
        __props__["time_restrictions"] = time_restrictions
        return AlertPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def actions(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Actions to add to the alerts original actions value as a list of strings. If ignore_original_actions field is set to true, this will replace the original actions.
        """
        return pulumi.get(self, "actions")

    @property
    @pulumi.getter(name="alertDescription")
    def alert_description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "alert_description")

    @property
    @pulumi.getter
    def alias(self) -> pulumi.Output[Optional[str]]:
        """
        Alias of the alert. You can use {{alias}} to refer to the original alias. Default value is {{alias}}
        """
        return pulumi.get(self, "alias")

    @property
    @pulumi.getter(name="continuePolicy")
    def continue_policy(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "continue_policy")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        If policy should be enabled. Default: true
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def entity(self) -> pulumi.Output[Optional[str]]:
        """
        Entity field of the alert. You can use {{entity}} to refer to the original entity. Default value is {{entity}}
        """
        return pulumi.get(self, "entity")

    @property
    @pulumi.getter
    def filters(self) -> pulumi.Output[Optional[Sequence['outputs.AlertPolicyFilter']]]:
        """
        A alert filter which will be applied. This filter can be empty: filter {} - this means 'match-all'. This is a block, structure is documented below.
        """
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter(name="ignoreOriginalActions")
    def ignore_original_actions(self) -> pulumi.Output[Optional[bool]]:
        """
        If set to true, policy will ignore the original actions of the alert. Default value is false
        """
        return pulumi.get(self, "ignore_original_actions")

    @property
    @pulumi.getter(name="ignoreOriginalDetails")
    def ignore_original_details(self) -> pulumi.Output[Optional[bool]]:
        """
        If set to true, policy will ignore the original details of the alert. Default value is false
        """
        return pulumi.get(self, "ignore_original_details")

    @property
    @pulumi.getter(name="ignoreOriginalResponders")
    def ignore_original_responders(self) -> pulumi.Output[Optional[bool]]:
        """
        If set to true, policy will ignore the original responders of the alert. Default value is false
        """
        return pulumi.get(self, "ignore_original_responders")

    @property
    @pulumi.getter(name="ignoreOriginalTags")
    def ignore_original_tags(self) -> pulumi.Output[Optional[bool]]:
        """
        If set to true, policy will ignore the original tags of the alert. Default value is false
        """
        return pulumi.get(self, "ignore_original_tags")

    @property
    @pulumi.getter
    def message(self) -> pulumi.Output[str]:
        """
        Message of the alerts
        """
        return pulumi.get(self, "message")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the responder
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyDescription")
    def policy_description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the policy. This can be max 512 characters.
        """
        return pulumi.get(self, "policy_description")

    @property
    @pulumi.getter
    def priority(self) -> pulumi.Output[Optional[str]]:
        """
        Priority of the alert. Should be one of P1, P2, P3, P4, or P5
        """
        return pulumi.get(self, "priority")

    @property
    @pulumi.getter
    def responders(self) -> pulumi.Output[Optional[Sequence['outputs.AlertPolicyResponder']]]:
        """
        Responders to add to the alerts original responders value as a list of teams, users or the reserved word none or all. If ignoreOriginalResponders field is set to true, this will replace the original responders. The possible values for responders are: user, team. This is a block, structure is documented below.
        """
        return pulumi.get(self, "responders")

    @property
    @pulumi.getter
    def source(self) -> pulumi.Output[Optional[str]]:
        """
        Source field of the alert. You can use {{source}} to refer to the original source. Default value is {{source}}
        """
        return pulumi.get(self, "source")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to add to the alerts original tags value as a list of strings. If ignoreOriginalResponders field is set to true, this will replace the original responders.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> pulumi.Output[Optional[str]]:
        """
        Id of team that this policy belongs to.
        """
        return pulumi.get(self, "team_id")

    @property
    @pulumi.getter(name="timeRestrictions")
    def time_restrictions(self) -> pulumi.Output[Optional[Sequence['outputs.AlertPolicyTimeRestriction']]]:
        """
        Time restrictions specified in this field must be met for this policy to work. This is a block, structure is documented below.
        """
        return pulumi.get(self, "time_restrictions")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

