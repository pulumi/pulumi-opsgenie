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

__all__ = ['ScheduleRotationArgs', 'ScheduleRotation']

@pulumi.input_type
class ScheduleRotationArgs:
    def __init__(__self__, *,
                 participants: pulumi.Input[Sequence[pulumi.Input['ScheduleRotationParticipantArgs']]],
                 schedule_id: pulumi.Input[str],
                 start_date: pulumi.Input[str],
                 type: pulumi.Input[str],
                 end_date: Optional[pulumi.Input[str]] = None,
                 length: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRotationTimeRestrictionArgs']]]] = None):
        """
        The set of arguments for constructing a ScheduleRotation resource.
        :param pulumi.Input[Sequence[pulumi.Input['ScheduleRotationParticipantArgs']]] participants: List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        :param pulumi.Input[str] schedule_id: Identifier of the schedule.
        :param pulumi.Input[str] start_date: This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        :param pulumi.Input[str] type: Type of rotation. May be one of daily, weekly and hourly.
        :param pulumi.Input[str] end_date: This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        :param pulumi.Input[int] length: Length of the rotation with default value 1.
        :param pulumi.Input[str] name: Name of rotation.
        """
        pulumi.set(__self__, "participants", participants)
        pulumi.set(__self__, "schedule_id", schedule_id)
        pulumi.set(__self__, "start_date", start_date)
        pulumi.set(__self__, "type", type)
        if end_date is not None:
            pulumi.set(__self__, "end_date", end_date)
        if length is not None:
            pulumi.set(__self__, "length", length)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if time_restrictions is not None:
            pulumi.set(__self__, "time_restrictions", time_restrictions)

    @property
    @pulumi.getter
    def participants(self) -> pulumi.Input[Sequence[pulumi.Input['ScheduleRotationParticipantArgs']]]:
        """
        List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        """
        return pulumi.get(self, "participants")

    @participants.setter
    def participants(self, value: pulumi.Input[Sequence[pulumi.Input['ScheduleRotationParticipantArgs']]]):
        pulumi.set(self, "participants", value)

    @property
    @pulumi.getter(name="scheduleId")
    def schedule_id(self) -> pulumi.Input[str]:
        """
        Identifier of the schedule.
        """
        return pulumi.get(self, "schedule_id")

    @schedule_id.setter
    def schedule_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "schedule_id", value)

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> pulumi.Input[str]:
        """
        This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: pulumi.Input[str]):
        pulumi.set(self, "start_date", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        Type of rotation. May be one of daily, weekly and hourly.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> Optional[pulumi.Input[str]]:
        """
        This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        """
        return pulumi.get(self, "end_date")

    @end_date.setter
    def end_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date", value)

    @property
    @pulumi.getter
    def length(self) -> Optional[pulumi.Input[int]]:
        """
        Length of the rotation with default value 1.
        """
        return pulumi.get(self, "length")

    @length.setter
    def length(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "length", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of rotation.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="timeRestrictions")
    def time_restrictions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRotationTimeRestrictionArgs']]]]:
        return pulumi.get(self, "time_restrictions")

    @time_restrictions.setter
    def time_restrictions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRotationTimeRestrictionArgs']]]]):
        pulumi.set(self, "time_restrictions", value)


@pulumi.input_type
class _ScheduleRotationState:
    def __init__(__self__, *,
                 end_date: Optional[pulumi.Input[str]] = None,
                 length: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 participants: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRotationParticipantArgs']]]] = None,
                 schedule_id: Optional[pulumi.Input[str]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRotationTimeRestrictionArgs']]]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ScheduleRotation resources.
        :param pulumi.Input[str] end_date: This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        :param pulumi.Input[int] length: Length of the rotation with default value 1.
        :param pulumi.Input[str] name: Name of rotation.
        :param pulumi.Input[Sequence[pulumi.Input['ScheduleRotationParticipantArgs']]] participants: List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        :param pulumi.Input[str] schedule_id: Identifier of the schedule.
        :param pulumi.Input[str] start_date: This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        :param pulumi.Input[str] type: Type of rotation. May be one of daily, weekly and hourly.
        """
        if end_date is not None:
            pulumi.set(__self__, "end_date", end_date)
        if length is not None:
            pulumi.set(__self__, "length", length)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if participants is not None:
            pulumi.set(__self__, "participants", participants)
        if schedule_id is not None:
            pulumi.set(__self__, "schedule_id", schedule_id)
        if start_date is not None:
            pulumi.set(__self__, "start_date", start_date)
        if time_restrictions is not None:
            pulumi.set(__self__, "time_restrictions", time_restrictions)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> Optional[pulumi.Input[str]]:
        """
        This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        """
        return pulumi.get(self, "end_date")

    @end_date.setter
    def end_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "end_date", value)

    @property
    @pulumi.getter
    def length(self) -> Optional[pulumi.Input[int]]:
        """
        Length of the rotation with default value 1.
        """
        return pulumi.get(self, "length")

    @length.setter
    def length(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "length", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of rotation.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def participants(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRotationParticipantArgs']]]]:
        """
        List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        """
        return pulumi.get(self, "participants")

    @participants.setter
    def participants(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRotationParticipantArgs']]]]):
        pulumi.set(self, "participants", value)

    @property
    @pulumi.getter(name="scheduleId")
    def schedule_id(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the schedule.
        """
        return pulumi.get(self, "schedule_id")

    @schedule_id.setter
    def schedule_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schedule_id", value)

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> Optional[pulumi.Input[str]]:
        """
        This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        """
        return pulumi.get(self, "start_date")

    @start_date.setter
    def start_date(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "start_date", value)

    @property
    @pulumi.getter(name="timeRestrictions")
    def time_restrictions(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRotationTimeRestrictionArgs']]]]:
        return pulumi.get(self, "time_restrictions")

    @time_restrictions.setter
    def time_restrictions(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ScheduleRotationTimeRestrictionArgs']]]]):
        pulumi.set(self, "time_restrictions", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of rotation. May be one of daily, weekly and hourly.
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class ScheduleRotation(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 length: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 participants: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleRotationParticipantArgs']]]]] = None,
                 schedule_id: Optional[pulumi.Input[str]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleRotationTimeRestrictionArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a Schedule Rotation within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.ScheduleRotation("test",
            end_date="2019-06-20T17:30:00Z",
            length=6,
            participants=[opsgenie.ScheduleRotationParticipantArgs(
                id=opsgenie_user["test"]["id"],
                type="user",
            )],
            schedule_id=opsgenie_schedule["test"]["id"],
            start_date="2019-06-18T17:00:00Z",
            time_restrictions=[opsgenie.ScheduleRotationTimeRestrictionArgs(
                restriction=[opsgenie.ScheduleRotationTimeRestrictionRestrictionArgs(
                    end_hour=10,
                    end_min=1,
                    start_hour=1,
                    start_min=1,
                )],
                type="time-of-day",
            )],
            type="hourly")
        ```

        ## Import

        Schedule Rotations can be imported using the `schedule_id/rotation_id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/scheduleRotation:ScheduleRotation * `opsgenie_schedule_rotation.test schedule_id/rotation_id`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] end_date: This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        :param pulumi.Input[int] length: Length of the rotation with default value 1.
        :param pulumi.Input[str] name: Name of rotation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleRotationParticipantArgs']]]] participants: List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        :param pulumi.Input[str] schedule_id: Identifier of the schedule.
        :param pulumi.Input[str] start_date: This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        :param pulumi.Input[str] type: Type of rotation. May be one of daily, weekly and hourly.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ScheduleRotationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Schedule Rotation within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.ScheduleRotation("test",
            end_date="2019-06-20T17:30:00Z",
            length=6,
            participants=[opsgenie.ScheduleRotationParticipantArgs(
                id=opsgenie_user["test"]["id"],
                type="user",
            )],
            schedule_id=opsgenie_schedule["test"]["id"],
            start_date="2019-06-18T17:00:00Z",
            time_restrictions=[opsgenie.ScheduleRotationTimeRestrictionArgs(
                restriction=[opsgenie.ScheduleRotationTimeRestrictionRestrictionArgs(
                    end_hour=10,
                    end_min=1,
                    start_hour=1,
                    start_min=1,
                )],
                type="time-of-day",
            )],
            type="hourly")
        ```

        ## Import

        Schedule Rotations can be imported using the `schedule_id/rotation_id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/scheduleRotation:ScheduleRotation * `opsgenie_schedule_rotation.test schedule_id/rotation_id`
        ```

        :param str resource_name: The name of the resource.
        :param ScheduleRotationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ScheduleRotationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 end_date: Optional[pulumi.Input[str]] = None,
                 length: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 participants: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleRotationParticipantArgs']]]]] = None,
                 schedule_id: Optional[pulumi.Input[str]] = None,
                 start_date: Optional[pulumi.Input[str]] = None,
                 time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleRotationTimeRestrictionArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ScheduleRotationArgs.__new__(ScheduleRotationArgs)

            __props__.__dict__["end_date"] = end_date
            __props__.__dict__["length"] = length
            __props__.__dict__["name"] = name
            if participants is None and not opts.urn:
                raise TypeError("Missing required property 'participants'")
            __props__.__dict__["participants"] = participants
            if schedule_id is None and not opts.urn:
                raise TypeError("Missing required property 'schedule_id'")
            __props__.__dict__["schedule_id"] = schedule_id
            if start_date is None and not opts.urn:
                raise TypeError("Missing required property 'start_date'")
            __props__.__dict__["start_date"] = start_date
            __props__.__dict__["time_restrictions"] = time_restrictions
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(ScheduleRotation, __self__).__init__(
            'opsgenie:index/scheduleRotation:ScheduleRotation',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            end_date: Optional[pulumi.Input[str]] = None,
            length: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            participants: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleRotationParticipantArgs']]]]] = None,
            schedule_id: Optional[pulumi.Input[str]] = None,
            start_date: Optional[pulumi.Input[str]] = None,
            time_restrictions: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleRotationTimeRestrictionArgs']]]]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'ScheduleRotation':
        """
        Get an existing ScheduleRotation resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] end_date: This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        :param pulumi.Input[int] length: Length of the rotation with default value 1.
        :param pulumi.Input[str] name: Name of rotation.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ScheduleRotationParticipantArgs']]]] participants: List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        :param pulumi.Input[str] schedule_id: Identifier of the schedule.
        :param pulumi.Input[str] start_date: This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        :param pulumi.Input[str] type: Type of rotation. May be one of daily, weekly and hourly.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ScheduleRotationState.__new__(_ScheduleRotationState)

        __props__.__dict__["end_date"] = end_date
        __props__.__dict__["length"] = length
        __props__.__dict__["name"] = name
        __props__.__dict__["participants"] = participants
        __props__.__dict__["schedule_id"] = schedule_id
        __props__.__dict__["start_date"] = start_date
        __props__.__dict__["time_restrictions"] = time_restrictions
        __props__.__dict__["type"] = type
        return ScheduleRotation(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="endDate")
    def end_date(self) -> pulumi.Output[Optional[str]]:
        """
        This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        """
        return pulumi.get(self, "end_date")

    @property
    @pulumi.getter
    def length(self) -> pulumi.Output[Optional[int]]:
        """
        Length of the rotation with default value 1.
        """
        return pulumi.get(self, "length")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of rotation.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def participants(self) -> pulumi.Output[Sequence['outputs.ScheduleRotationParticipant']]:
        """
        List of escalations, teams, users or the reserved word none which will be used in schedule. Each of them can be used multiple times and will be rotated in the order they given. "user,escalation,team,none"
        """
        return pulumi.get(self, "participants")

    @property
    @pulumi.getter(name="scheduleId")
    def schedule_id(self) -> pulumi.Output[str]:
        """
        Identifier of the schedule.
        """
        return pulumi.get(self, "schedule_id")

    @property
    @pulumi.getter(name="startDate")
    def start_date(self) -> pulumi.Output[str]:
        """
        This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00). Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically
        """
        return pulumi.get(self, "start_date")

    @property
    @pulumi.getter(name="timeRestrictions")
    def time_restrictions(self) -> pulumi.Output[Optional[Sequence['outputs.ScheduleRotationTimeRestriction']]]:
        return pulumi.get(self, "time_restrictions")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Type of rotation. May be one of daily, weekly and hourly.
        """
        return pulumi.get(self, "type")

