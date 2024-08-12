# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetEscalationResult',
    'AwaitableGetEscalationResult',
    'get_escalation',
    'get_escalation_output',
]

@pulumi.output_type
class GetEscalationResult:
    """
    A collection of values returned by getEscalation.
    """
    def __init__(__self__, description=None, id=None, name=None, owner_team_id=None, repeats=None, rules=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner_team_id and not isinstance(owner_team_id, str):
            raise TypeError("Expected argument 'owner_team_id' to be a str")
        pulumi.set(__self__, "owner_team_id", owner_team_id)
        if repeats and not isinstance(repeats, list):
            raise TypeError("Expected argument 'repeats' to be a list")
        pulumi.set(__self__, "repeats", repeats)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        Escalation Description
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerTeamId")
    def owner_team_id(self) -> Optional[str]:
        """
        If owner team exist the id of the team is exported
        """
        return pulumi.get(self, "owner_team_id")

    @property
    @pulumi.getter
    def repeats(self) -> Optional[Sequence['outputs.GetEscalationRepeatResult']]:
        """
        Escalation repeat preferences
        """
        return pulumi.get(self, "repeats")

    @property
    @pulumi.getter
    def rules(self) -> Optional[Sequence['outputs.GetEscalationRuleResult']]:
        """
        Escalation rules
        """
        return pulumi.get(self, "rules")


class AwaitableGetEscalationResult(GetEscalationResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetEscalationResult(
            description=self.description,
            id=self.id,
            name=self.name,
            owner_team_id=self.owner_team_id,
            repeats=self.repeats,
            rules=self.rules)


def get_escalation(description: Optional[str] = None,
                   name: Optional[str] = None,
                   owner_team_id: Optional[str] = None,
                   repeats: Optional[Sequence[Union['GetEscalationRepeatArgs', 'GetEscalationRepeatArgsDict']]] = None,
                   rules: Optional[Sequence[Union['GetEscalationRuleArgs', 'GetEscalationRuleArgsDict']]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetEscalationResult:
    """
    Manages an Escalation within Opsgenie.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_opsgenie as opsgenie

    test = opsgenie.get_escalation(name="existing-escalation")
    ```


    :param str description: Escalation Description
    :param str name: Name of the escalation.
    :param str owner_team_id: If owner team exist the id of the team is exported
    :param Sequence[Union['GetEscalationRepeatArgs', 'GetEscalationRepeatArgsDict']] repeats: Escalation repeat preferences
    :param Sequence[Union['GetEscalationRuleArgs', 'GetEscalationRuleArgsDict']] rules: Escalation rules
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['name'] = name
    __args__['ownerTeamId'] = owner_team_id
    __args__['repeats'] = repeats
    __args__['rules'] = rules
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('opsgenie:index/getEscalation:getEscalation', __args__, opts=opts, typ=GetEscalationResult).value

    return AwaitableGetEscalationResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        owner_team_id=pulumi.get(__ret__, 'owner_team_id'),
        repeats=pulumi.get(__ret__, 'repeats'),
        rules=pulumi.get(__ret__, 'rules'))


@_utilities.lift_output_func(get_escalation)
def get_escalation_output(description: Optional[pulumi.Input[Optional[str]]] = None,
                          name: Optional[pulumi.Input[str]] = None,
                          owner_team_id: Optional[pulumi.Input[Optional[str]]] = None,
                          repeats: Optional[pulumi.Input[Optional[Sequence[Union['GetEscalationRepeatArgs', 'GetEscalationRepeatArgsDict']]]]] = None,
                          rules: Optional[pulumi.Input[Optional[Sequence[Union['GetEscalationRuleArgs', 'GetEscalationRuleArgsDict']]]]] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetEscalationResult]:
    """
    Manages an Escalation within Opsgenie.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_opsgenie as opsgenie

    test = opsgenie.get_escalation(name="existing-escalation")
    ```


    :param str description: Escalation Description
    :param str name: Name of the escalation.
    :param str owner_team_id: If owner team exist the id of the team is exported
    :param Sequence[Union['GetEscalationRepeatArgs', 'GetEscalationRepeatArgsDict']] repeats: Escalation repeat preferences
    :param Sequence[Union['GetEscalationRuleArgs', 'GetEscalationRuleArgsDict']] rules: Escalation rules
    """
    ...
