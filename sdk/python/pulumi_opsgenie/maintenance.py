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

__all__ = ['MaintenanceArgs', 'Maintenance']

@pulumi.input_type
class MaintenanceArgs:
    def __init__(__self__, *,
                 description: pulumi.Input[str],
                 rules: pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]],
                 times: Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]]] = None):
        """
        The set of arguments for constructing a Maintenance resource.
        :param pulumi.Input[str] description: Description for the maintenance.
        :param pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]] rules: Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
        :param pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]] times: Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
        """
        MaintenanceArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            rules=rules,
            times=times,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: pulumi.Input[str],
             rules: pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]],
             times: Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):

        _setter("description", description)
        _setter("rules", rules)
        if times is not None:
            _setter("times", times)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Input[str]:
        """
        Description for the maintenance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: pulumi.Input[str]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]]:
        """
        Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def times(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]]]:
        """
        Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
        """
        return pulumi.get(self, "times")

    @times.setter
    def times(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]]]):
        pulumi.set(self, "times", value)


@pulumi.input_type
class _MaintenanceState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]]] = None,
                 times: Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]]] = None):
        """
        Input properties used for looking up and filtering Maintenance resources.
        :param pulumi.Input[str] description: Description for the maintenance.
        :param pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]] rules: Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
        :param pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]] times: Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
        """
        _MaintenanceState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            description=description,
            rules=rules,
            times=times,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             description: Optional[pulumi.Input[str]] = None,
             rules: Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]]] = None,
             times: Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):

        if description is not None:
            _setter("description", description)
        if rules is not None:
            _setter("rules", rules)
        if times is not None:
            _setter("times", times)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description for the maintenance.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]]]:
        """
        Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceRuleArgs']]]]):
        pulumi.set(self, "rules", value)

    @property
    @pulumi.getter
    def times(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]]]:
        """
        Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
        """
        return pulumi.get(self, "times")

    @times.setter
    def times(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['MaintenanceTimeArgs']]]]):
        pulumi.set(self, "times", value)


class Maintenance(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceRuleArgs']]]]] = None,
                 times: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceTimeArgs']]]]] = None,
                 __props__=None):
        """
        Manages a Maintenance within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.Maintenance("test",
            description="geniemaintenance-%s",
            rules=[opsgenie.MaintenanceRuleArgs(
                entities=[opsgenie.MaintenanceRuleEntityArgs(
                    id=opsgenie_email_integration["test"]["id"],
                    type="integration",
                )],
                state="enabled",
            )],
            times=[opsgenie.MaintenanceTimeArgs(
                end_date="2019-06-%dT17:50:00Z",
                start_date="2019-06-20T17:45:00Z",
                type="schedule",
            )])
        ```

        ## Import

        Maintenance policies can be imported using the `policy_id`, e.g.

        ```sh
         $ pulumi import opsgenie:index/maintenance:Maintenance test policy_id`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description for the maintenance.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceRuleArgs']]]] rules: Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceTimeArgs']]]] times: Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MaintenanceArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Maintenance within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.Maintenance("test",
            description="geniemaintenance-%s",
            rules=[opsgenie.MaintenanceRuleArgs(
                entities=[opsgenie.MaintenanceRuleEntityArgs(
                    id=opsgenie_email_integration["test"]["id"],
                    type="integration",
                )],
                state="enabled",
            )],
            times=[opsgenie.MaintenanceTimeArgs(
                end_date="2019-06-%dT17:50:00Z",
                start_date="2019-06-20T17:45:00Z",
                type="schedule",
            )])
        ```

        ## Import

        Maintenance policies can be imported using the `policy_id`, e.g.

        ```sh
         $ pulumi import opsgenie:index/maintenance:Maintenance test policy_id`
        ```

        :param str resource_name: The name of the resource.
        :param MaintenanceArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MaintenanceArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            MaintenanceArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceRuleArgs']]]]] = None,
                 times: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceTimeArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MaintenanceArgs.__new__(MaintenanceArgs)

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__.__dict__["description"] = description
            if rules is None and not opts.urn:
                raise TypeError("Missing required property 'rules'")
            __props__.__dict__["rules"] = rules
            __props__.__dict__["times"] = times
        super(Maintenance, __self__).__init__(
            'opsgenie:index/maintenance:Maintenance',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceRuleArgs']]]]] = None,
            times: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceTimeArgs']]]]] = None) -> 'Maintenance':
        """
        Get an existing Maintenance resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description for the maintenance.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceRuleArgs']]]] rules: Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceTimeArgs']]]] times: Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MaintenanceState.__new__(_MaintenanceState)

        __props__.__dict__["description"] = description
        __props__.__dict__["rules"] = rules
        __props__.__dict__["times"] = times
        return Maintenance(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Description for the maintenance.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def rules(self) -> pulumi.Output[Sequence['outputs.MaintenanceRule']]:
        """
        Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
        """
        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def times(self) -> pulumi.Output[Optional[Sequence['outputs.MaintenanceTime']]]:
        """
        Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
        """
        return pulumi.get(self, "times")

