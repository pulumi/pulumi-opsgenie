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

__all__ = ['Maintenance']


class Maintenance(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceRuleArgs']]]]] = None,
                 times: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceTimeArgs']]]]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
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

        Maintenance policies can be imported using the `id`, e.g.

        ```sh
         $ pulumi import opsgenie:index/maintenance:Maintenance test 812be1a1-32c8-4666-a7fb-03ecc385106c`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description for the maintenance.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceRuleArgs']]]] rules: Rules of maintenance, which takes a list of rule objects and defines the maintenance rules over integrations and policies.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['MaintenanceTimeArgs']]]] times: Time configuration of maintenance. It takes a time object which has type, startDate and endDate fields
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

            if description is None and not opts.urn:
                raise TypeError("Missing required property 'description'")
            __props__['description'] = description
            if rules is None and not opts.urn:
                raise TypeError("Missing required property 'rules'")
            __props__['rules'] = rules
            __props__['times'] = times
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

        __props__ = dict()

        __props__["description"] = description
        __props__["rules"] = rules
        __props__["times"] = times
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

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

