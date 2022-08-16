# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['HeartbeatArgs', 'Heartbeat']

@pulumi.input_type
class HeartbeatArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 interval: pulumi.Input[int],
                 interval_unit: pulumi.Input[str],
                 alert_message: Optional[pulumi.Input[str]] = None,
                 alert_priority: Optional[pulumi.Input[str]] = None,
                 alert_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Heartbeat resource.
        :param pulumi.Input[bool] enabled: Enable/disable heartbeat monitoring.
        :param pulumi.Input[int] interval: Specifies how often a heartbeat message should be expected.
        :param pulumi.Input[str] interval_unit: Interval specified as minutes, hours or days.
        :param pulumi.Input[str] alert_message: Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        :param pulumi.Input[str] alert_priority: Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alert_tags: Specifies the alert tags for heartbeat expiration alert.
        :param pulumi.Input[str] description: An optional description of the heartbeat
        :param pulumi.Input[str] name: Name of the heartbeat
        :param pulumi.Input[str] owner_team_id: Owner team of the heartbeat.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "interval", interval)
        pulumi.set(__self__, "interval_unit", interval_unit)
        if alert_message is not None:
            pulumi.set(__self__, "alert_message", alert_message)
        if alert_priority is not None:
            pulumi.set(__self__, "alert_priority", alert_priority)
        if alert_tags is not None:
            pulumi.set(__self__, "alert_tags", alert_tags)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner_team_id is not None:
            pulumi.set(__self__, "owner_team_id", owner_team_id)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Enable/disable heartbeat monitoring.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Input[int]:
        """
        Specifies how often a heartbeat message should be expected.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: pulumi.Input[int]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter(name="intervalUnit")
    def interval_unit(self) -> pulumi.Input[str]:
        """
        Interval specified as minutes, hours or days.
        """
        return pulumi.get(self, "interval_unit")

    @interval_unit.setter
    def interval_unit(self, value: pulumi.Input[str]):
        pulumi.set(self, "interval_unit", value)

    @property
    @pulumi.getter(name="alertMessage")
    def alert_message(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        """
        return pulumi.get(self, "alert_message")

    @alert_message.setter
    def alert_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_message", value)

    @property
    @pulumi.getter(name="alertPriority")
    def alert_priority(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        """
        return pulumi.get(self, "alert_priority")

    @alert_priority.setter
    def alert_priority(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_priority", value)

    @property
    @pulumi.getter(name="alertTags")
    def alert_tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the alert tags for heartbeat expiration alert.
        """
        return pulumi.get(self, "alert_tags")

    @alert_tags.setter
    def alert_tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "alert_tags", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description of the heartbeat
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the heartbeat
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ownerTeamId")
    def owner_team_id(self) -> Optional[pulumi.Input[str]]:
        """
        Owner team of the heartbeat.
        """
        return pulumi.get(self, "owner_team_id")

    @owner_team_id.setter
    def owner_team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_team_id", value)


@pulumi.input_type
class _HeartbeatState:
    def __init__(__self__, *,
                 alert_message: Optional[pulumi.Input[str]] = None,
                 alert_priority: Optional[pulumi.Input[str]] = None,
                 alert_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 interval_unit: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Heartbeat resources.
        :param pulumi.Input[str] alert_message: Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        :param pulumi.Input[str] alert_priority: Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alert_tags: Specifies the alert tags for heartbeat expiration alert.
        :param pulumi.Input[str] description: An optional description of the heartbeat
        :param pulumi.Input[bool] enabled: Enable/disable heartbeat monitoring.
        :param pulumi.Input[int] interval: Specifies how often a heartbeat message should be expected.
        :param pulumi.Input[str] interval_unit: Interval specified as minutes, hours or days.
        :param pulumi.Input[str] name: Name of the heartbeat
        :param pulumi.Input[str] owner_team_id: Owner team of the heartbeat.
        """
        if alert_message is not None:
            pulumi.set(__self__, "alert_message", alert_message)
        if alert_priority is not None:
            pulumi.set(__self__, "alert_priority", alert_priority)
        if alert_tags is not None:
            pulumi.set(__self__, "alert_tags", alert_tags)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if interval_unit is not None:
            pulumi.set(__self__, "interval_unit", interval_unit)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner_team_id is not None:
            pulumi.set(__self__, "owner_team_id", owner_team_id)

    @property
    @pulumi.getter(name="alertMessage")
    def alert_message(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        """
        return pulumi.get(self, "alert_message")

    @alert_message.setter
    def alert_message(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_message", value)

    @property
    @pulumi.getter(name="alertPriority")
    def alert_priority(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        """
        return pulumi.get(self, "alert_priority")

    @alert_priority.setter
    def alert_priority(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_priority", value)

    @property
    @pulumi.getter(name="alertTags")
    def alert_tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Specifies the alert tags for heartbeat expiration alert.
        """
        return pulumi.get(self, "alert_tags")

    @alert_tags.setter
    def alert_tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "alert_tags", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description of the heartbeat
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Enable/disable heartbeat monitoring.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies how often a heartbeat message should be expected.
        """
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter(name="intervalUnit")
    def interval_unit(self) -> Optional[pulumi.Input[str]]:
        """
        Interval specified as minutes, hours or days.
        """
        return pulumi.get(self, "interval_unit")

    @interval_unit.setter
    def interval_unit(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interval_unit", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the heartbeat
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ownerTeamId")
    def owner_team_id(self) -> Optional[pulumi.Input[str]]:
        """
        Owner team of the heartbeat.
        """
        return pulumi.get(self, "owner_team_id")

    @owner_team_id.setter
    def owner_team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_team_id", value)


class Heartbeat(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_message: Optional[pulumi.Input[str]] = None,
                 alert_priority: Optional[pulumi.Input[str]] = None,
                 alert_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 interval_unit: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages heartbeat within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.Heartbeat("test",
            alert_message="Test",
            alert_priority="P3",
            alert_tags=[
                "test",
                "fahri",
            ],
            description="test opsgenie heartbeat terraform",
            enabled=False,
            interval=10,
            interval_unit="minutes",
            owner_team_id=opsgenie_team["test"]["id"])
        ```

        ## Import

        Heartbeat Integrations can be imported using the `name`, e.g.

        ```sh
         $ pulumi import opsgenie:index/heartbeat:Heartbeat test name`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alert_message: Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        :param pulumi.Input[str] alert_priority: Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alert_tags: Specifies the alert tags for heartbeat expiration alert.
        :param pulumi.Input[str] description: An optional description of the heartbeat
        :param pulumi.Input[bool] enabled: Enable/disable heartbeat monitoring.
        :param pulumi.Input[int] interval: Specifies how often a heartbeat message should be expected.
        :param pulumi.Input[str] interval_unit: Interval specified as minutes, hours or days.
        :param pulumi.Input[str] name: Name of the heartbeat
        :param pulumi.Input[str] owner_team_id: Owner team of the heartbeat.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: HeartbeatArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages heartbeat within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.Heartbeat("test",
            alert_message="Test",
            alert_priority="P3",
            alert_tags=[
                "test",
                "fahri",
            ],
            description="test opsgenie heartbeat terraform",
            enabled=False,
            interval=10,
            interval_unit="minutes",
            owner_team_id=opsgenie_team["test"]["id"])
        ```

        ## Import

        Heartbeat Integrations can be imported using the `name`, e.g.

        ```sh
         $ pulumi import opsgenie:index/heartbeat:Heartbeat test name`
        ```

        :param str resource_name: The name of the resource.
        :param HeartbeatArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(HeartbeatArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 alert_message: Optional[pulumi.Input[str]] = None,
                 alert_priority: Optional[pulumi.Input[str]] = None,
                 alert_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 interval: Optional[pulumi.Input[int]] = None,
                 interval_unit: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = HeartbeatArgs.__new__(HeartbeatArgs)

            __props__.__dict__["alert_message"] = alert_message
            __props__.__dict__["alert_priority"] = alert_priority
            __props__.__dict__["alert_tags"] = alert_tags
            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            if interval is None and not opts.urn:
                raise TypeError("Missing required property 'interval'")
            __props__.__dict__["interval"] = interval
            if interval_unit is None and not opts.urn:
                raise TypeError("Missing required property 'interval_unit'")
            __props__.__dict__["interval_unit"] = interval_unit
            __props__.__dict__["name"] = name
            __props__.__dict__["owner_team_id"] = owner_team_id
        super(Heartbeat, __self__).__init__(
            'opsgenie:index/heartbeat:Heartbeat',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            alert_message: Optional[pulumi.Input[str]] = None,
            alert_priority: Optional[pulumi.Input[str]] = None,
            alert_tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            interval: Optional[pulumi.Input[int]] = None,
            interval_unit: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner_team_id: Optional[pulumi.Input[str]] = None) -> 'Heartbeat':
        """
        Get an existing Heartbeat resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] alert_message: Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        :param pulumi.Input[str] alert_priority: Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] alert_tags: Specifies the alert tags for heartbeat expiration alert.
        :param pulumi.Input[str] description: An optional description of the heartbeat
        :param pulumi.Input[bool] enabled: Enable/disable heartbeat monitoring.
        :param pulumi.Input[int] interval: Specifies how often a heartbeat message should be expected.
        :param pulumi.Input[str] interval_unit: Interval specified as minutes, hours or days.
        :param pulumi.Input[str] name: Name of the heartbeat
        :param pulumi.Input[str] owner_team_id: Owner team of the heartbeat.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _HeartbeatState.__new__(_HeartbeatState)

        __props__.__dict__["alert_message"] = alert_message
        __props__.__dict__["alert_priority"] = alert_priority
        __props__.__dict__["alert_tags"] = alert_tags
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["interval"] = interval
        __props__.__dict__["interval_unit"] = interval_unit
        __props__.__dict__["name"] = name
        __props__.__dict__["owner_team_id"] = owner_team_id
        return Heartbeat(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="alertMessage")
    def alert_message(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
        """
        return pulumi.get(self, "alert_message")

    @property
    @pulumi.getter(name="alertPriority")
    def alert_priority(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
        """
        return pulumi.get(self, "alert_priority")

    @property
    @pulumi.getter(name="alertTags")
    def alert_tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Specifies the alert tags for heartbeat expiration alert.
        """
        return pulumi.get(self, "alert_tags")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        An optional description of the heartbeat
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Enable/disable heartbeat monitoring.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Output[int]:
        """
        Specifies how often a heartbeat message should be expected.
        """
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter(name="intervalUnit")
    def interval_unit(self) -> pulumi.Output[str]:
        """
        Interval specified as minutes, hours or days.
        """
        return pulumi.get(self, "interval_unit")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the heartbeat
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerTeamId")
    def owner_team_id(self) -> pulumi.Output[Optional[str]]:
        """
        Owner team of the heartbeat.
        """
        return pulumi.get(self, "owner_team_id")

