# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
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

__all__ = [
    'GetHeartbeatResult',
    'AwaitableGetHeartbeatResult',
    'get_heartbeat',
    'get_heartbeat_output',
]

@pulumi.output_type
class GetHeartbeatResult:
    """
    A collection of values returned by getHeartbeat.
    """
    def __init__(__self__, alert_message=None, alert_priority=None, alert_tags=None, description=None, enabled=None, id=None, interval=None, interval_unit=None, name=None, owner_team_id=None):
        if alert_message and not isinstance(alert_message, str):
            raise TypeError("Expected argument 'alert_message' to be a str")
        pulumi.set(__self__, "alert_message", alert_message)
        if alert_priority and not isinstance(alert_priority, str):
            raise TypeError("Expected argument 'alert_priority' to be a str")
        pulumi.set(__self__, "alert_priority", alert_priority)
        if alert_tags and not isinstance(alert_tags, list):
            raise TypeError("Expected argument 'alert_tags' to be a list")
        pulumi.set(__self__, "alert_tags", alert_tags)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if enabled and not isinstance(enabled, bool):
            raise TypeError("Expected argument 'enabled' to be a bool")
        pulumi.set(__self__, "enabled", enabled)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if interval and not isinstance(interval, int):
            raise TypeError("Expected argument 'interval' to be a int")
        pulumi.set(__self__, "interval", interval)
        if interval_unit and not isinstance(interval_unit, str):
            raise TypeError("Expected argument 'interval_unit' to be a str")
        pulumi.set(__self__, "interval_unit", interval_unit)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if owner_team_id and not isinstance(owner_team_id, str):
            raise TypeError("Expected argument 'owner_team_id' to be a str")
        pulumi.set(__self__, "owner_team_id", owner_team_id)

    @property
    @pulumi.getter(name="alertMessage")
    def alert_message(self) -> Optional[str]:
        """
        Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        """
        return pulumi.get(self, "alert_message")

    @property
    @pulumi.getter(name="alertPriority")
    def alert_priority(self) -> Optional[str]:
        """
        Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        """
        return pulumi.get(self, "alert_priority")

    @property
    @pulumi.getter(name="alertTags")
    def alert_tags(self) -> Optional[Sequence[str]]:
        """
        Specifies the alert tags for heartbeat expiration alert.
        """
        return pulumi.get(self, "alert_tags")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        """
        An optional description of the heartbeat
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> Optional[bool]:
        """
        Enable/disable heartbeat monitoring.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def interval(self) -> Optional[int]:
        """
        Specifies how often a heartbeat message should be expected.
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter(name="intervalUnit")
    def interval_unit(self) -> Optional[str]:
        """
        Interval specified as minutes, hours or days.
        """
        return pulumi.get(self, "interval_unit")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerTeamId")
    def owner_team_id(self) -> Optional[str]:
        """
        Owner team of the heartbeat.
        """
        return pulumi.get(self, "owner_team_id")


class AwaitableGetHeartbeatResult(GetHeartbeatResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetHeartbeatResult(
            alert_message=self.alert_message,
            alert_priority=self.alert_priority,
            alert_tags=self.alert_tags,
            description=self.description,
            enabled=self.enabled,
            id=self.id,
            interval=self.interval,
            interval_unit=self.interval_unit,
            name=self.name,
            owner_team_id=self.owner_team_id)


def get_heartbeat(alert_message: Optional[str] = None,
                  alert_priority: Optional[str] = None,
                  alert_tags: Optional[Sequence[str]] = None,
                  description: Optional[str] = None,
                  enabled: Optional[bool] = None,
                  interval: Optional[int] = None,
                  interval_unit: Optional[str] = None,
                  name: Optional[str] = None,
                  owner_team_id: Optional[str] = None,
                  opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetHeartbeatResult:
    """
    Manages existing heartbeat within Opsgenie.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_opsgenie as opsgenie

    test = opsgenie.get_heartbeat(name="genieheartbeat-existing")
    ```


    :param str alert_message: Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
    :param str alert_priority: Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
    :param Sequence[str] alert_tags: Specifies the alert tags for heartbeat expiration alert.
    :param str description: An optional description of the heartbeat
    :param bool enabled: Enable/disable heartbeat monitoring.
    :param int interval: Specifies how often a heartbeat message should be expected.
    :param str interval_unit: Interval specified as minutes, hours or days.
    :param str name: Name of the heartbeat
    :param str owner_team_id: Owner team of the heartbeat.
    """
    __args__ = dict()
    __args__['alertMessage'] = alert_message
    __args__['alertPriority'] = alert_priority
    __args__['alertTags'] = alert_tags
    __args__['description'] = description
    __args__['enabled'] = enabled
    __args__['interval'] = interval
    __args__['intervalUnit'] = interval_unit
    __args__['name'] = name
    __args__['ownerTeamId'] = owner_team_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('opsgenie:index/getHeartbeat:getHeartbeat', __args__, opts=opts, typ=GetHeartbeatResult).value

    return AwaitableGetHeartbeatResult(
        alert_message=pulumi.get(__ret__, 'alert_message'),
        alert_priority=pulumi.get(__ret__, 'alert_priority'),
        alert_tags=pulumi.get(__ret__, 'alert_tags'),
        description=pulumi.get(__ret__, 'description'),
        enabled=pulumi.get(__ret__, 'enabled'),
        id=pulumi.get(__ret__, 'id'),
        interval=pulumi.get(__ret__, 'interval'),
        interval_unit=pulumi.get(__ret__, 'interval_unit'),
        name=pulumi.get(__ret__, 'name'),
        owner_team_id=pulumi.get(__ret__, 'owner_team_id'))
def get_heartbeat_output(alert_message: Optional[pulumi.Input[Optional[str]]] = None,
                         alert_priority: Optional[pulumi.Input[Optional[str]]] = None,
                         alert_tags: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                         description: Optional[pulumi.Input[Optional[str]]] = None,
                         enabled: Optional[pulumi.Input[Optional[bool]]] = None,
                         interval: Optional[pulumi.Input[Optional[int]]] = None,
                         interval_unit: Optional[pulumi.Input[Optional[str]]] = None,
                         name: Optional[pulumi.Input[str]] = None,
                         owner_team_id: Optional[pulumi.Input[Optional[str]]] = None,
                         opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetHeartbeatResult]:
    """
    Manages existing heartbeat within Opsgenie.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_opsgenie as opsgenie

    test = opsgenie.get_heartbeat(name="genieheartbeat-existing")
    ```


    :param str alert_message: Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
    :param str alert_priority: Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
    :param Sequence[str] alert_tags: Specifies the alert tags for heartbeat expiration alert.
    :param str description: An optional description of the heartbeat
    :param bool enabled: Enable/disable heartbeat monitoring.
    :param int interval: Specifies how often a heartbeat message should be expected.
    :param str interval_unit: Interval specified as minutes, hours or days.
    :param str name: Name of the heartbeat
    :param str owner_team_id: Owner team of the heartbeat.
    """
    __args__ = dict()
    __args__['alertMessage'] = alert_message
    __args__['alertPriority'] = alert_priority
    __args__['alertTags'] = alert_tags
    __args__['description'] = description
    __args__['enabled'] = enabled
    __args__['interval'] = interval
    __args__['intervalUnit'] = interval_unit
    __args__['name'] = name
    __args__['ownerTeamId'] = owner_team_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('opsgenie:index/getHeartbeat:getHeartbeat', __args__, opts=opts, typ=GetHeartbeatResult)
    return __ret__.apply(lambda __response__: GetHeartbeatResult(
        alert_message=pulumi.get(__response__, 'alert_message'),
        alert_priority=pulumi.get(__response__, 'alert_priority'),
        alert_tags=pulumi.get(__response__, 'alert_tags'),
        description=pulumi.get(__response__, 'description'),
        enabled=pulumi.get(__response__, 'enabled'),
        id=pulumi.get(__response__, 'id'),
        interval=pulumi.get(__response__, 'interval'),
        interval_unit=pulumi.get(__response__, 'interval_unit'),
        name=pulumi.get(__response__, 'name'),
        owner_team_id=pulumi.get(__response__, 'owner_team_id')))
