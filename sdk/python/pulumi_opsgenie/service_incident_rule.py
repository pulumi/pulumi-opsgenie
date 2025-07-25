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

__all__ = ['ServiceIncidentRuleArgs', 'ServiceIncidentRule']

@pulumi.input_type
class ServiceIncidentRuleArgs:
    def __init__(__self__, *,
                 incident_rules: pulumi.Input[Sequence[pulumi.Input['ServiceIncidentRuleIncidentRuleArgs']]],
                 service_id: pulumi.Input[_builtins.str]):
        """
        The set of arguments for constructing a ServiceIncidentRule resource.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceIncidentRuleIncidentRuleArgs']]] incident_rules: This is the rule configuration for this incident rule. This is a block, structure is documented below.
        :param pulumi.Input[_builtins.str] service_id: ID of the service associated
        """
        pulumi.set(__self__, "incident_rules", incident_rules)
        pulumi.set(__self__, "service_id", service_id)

    @_builtins.property
    @pulumi.getter(name="incidentRules")
    def incident_rules(self) -> pulumi.Input[Sequence[pulumi.Input['ServiceIncidentRuleIncidentRuleArgs']]]:
        """
        This is the rule configuration for this incident rule. This is a block, structure is documented below.
        """
        return pulumi.get(self, "incident_rules")

    @incident_rules.setter
    def incident_rules(self, value: pulumi.Input[Sequence[pulumi.Input['ServiceIncidentRuleIncidentRuleArgs']]]):
        pulumi.set(self, "incident_rules", value)

    @_builtins.property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Input[_builtins.str]:
        """
        ID of the service associated
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: pulumi.Input[_builtins.str]):
        pulumi.set(self, "service_id", value)


@pulumi.input_type
class _ServiceIncidentRuleState:
    def __init__(__self__, *,
                 incident_rules: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceIncidentRuleIncidentRuleArgs']]]] = None,
                 service_id: Optional[pulumi.Input[_builtins.str]] = None):
        """
        Input properties used for looking up and filtering ServiceIncidentRule resources.
        :param pulumi.Input[Sequence[pulumi.Input['ServiceIncidentRuleIncidentRuleArgs']]] incident_rules: This is the rule configuration for this incident rule. This is a block, structure is documented below.
        :param pulumi.Input[_builtins.str] service_id: ID of the service associated
        """
        if incident_rules is not None:
            pulumi.set(__self__, "incident_rules", incident_rules)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)

    @_builtins.property
    @pulumi.getter(name="incidentRules")
    def incident_rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServiceIncidentRuleIncidentRuleArgs']]]]:
        """
        This is the rule configuration for this incident rule. This is a block, structure is documented below.
        """
        return pulumi.get(self, "incident_rules")

    @incident_rules.setter
    def incident_rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServiceIncidentRuleIncidentRuleArgs']]]]):
        pulumi.set(self, "incident_rules", value)

    @_builtins.property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[_builtins.str]]:
        """
        ID of the service associated
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[_builtins.str]]):
        pulumi.set(self, "service_id", value)


@pulumi.type_token("opsgenie:index/serviceIncidentRule:ServiceIncidentRule")
class ServiceIncidentRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 incident_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ServiceIncidentRuleIncidentRuleArgs', 'ServiceIncidentRuleIncidentRuleArgsDict']]]]] = None,
                 service_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        """
        Manages a Service Incident Rule within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.Team("test",
            name="example-team",
            description="This team deals with all the things")
        test_service = opsgenie.Service("test",
            name="example-service",
            team_id=test.id)
        test_service_incident_rule = opsgenie.ServiceIncidentRule("test",
            service_id=test_service.id,
            incident_rules=[{
                "condition_match_type": "match-any-condition",
                "conditions": [
                    {
                        "field": "message",
                        "not_": False,
                        "operation": "contains",
                        "expected_value": "expected1",
                    },
                    {
                        "field": "message",
                        "not_": False,
                        "operation": "contains",
                        "expected_value": "expected2",
                    },
                ],
                "incident_properties": [{
                    "message": "This is a test message",
                    "priority": "P3",
                    "stakeholder_properties": [{
                        "message": "Message for stakeholders",
                        "enable": True,
                    }],
                }],
            }])
        ```

        ## Import

        Service Incident Rule can be imported using the `service_id/service_incident_rule_id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/serviceIncidentRule:ServiceIncidentRule this service_id/service_incident_rule_id`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ServiceIncidentRuleIncidentRuleArgs', 'ServiceIncidentRuleIncidentRuleArgsDict']]]] incident_rules: This is the rule configuration for this incident rule. This is a block, structure is documented below.
        :param pulumi.Input[_builtins.str] service_id: ID of the service associated
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceIncidentRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a Service Incident Rule within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.Team("test",
            name="example-team",
            description="This team deals with all the things")
        test_service = opsgenie.Service("test",
            name="example-service",
            team_id=test.id)
        test_service_incident_rule = opsgenie.ServiceIncidentRule("test",
            service_id=test_service.id,
            incident_rules=[{
                "condition_match_type": "match-any-condition",
                "conditions": [
                    {
                        "field": "message",
                        "not_": False,
                        "operation": "contains",
                        "expected_value": "expected1",
                    },
                    {
                        "field": "message",
                        "not_": False,
                        "operation": "contains",
                        "expected_value": "expected2",
                    },
                ],
                "incident_properties": [{
                    "message": "This is a test message",
                    "priority": "P3",
                    "stakeholder_properties": [{
                        "message": "Message for stakeholders",
                        "enable": True,
                    }],
                }],
            }])
        ```

        ## Import

        Service Incident Rule can be imported using the `service_id/service_incident_rule_id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/serviceIncidentRule:ServiceIncidentRule this service_id/service_incident_rule_id`
        ```

        :param str resource_name: The name of the resource.
        :param ServiceIncidentRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceIncidentRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 incident_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ServiceIncidentRuleIncidentRuleArgs', 'ServiceIncidentRuleIncidentRuleArgsDict']]]]] = None,
                 service_id: Optional[pulumi.Input[_builtins.str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceIncidentRuleArgs.__new__(ServiceIncidentRuleArgs)

            if incident_rules is None and not opts.urn:
                raise TypeError("Missing required property 'incident_rules'")
            __props__.__dict__["incident_rules"] = incident_rules
            if service_id is None and not opts.urn:
                raise TypeError("Missing required property 'service_id'")
            __props__.__dict__["service_id"] = service_id
        super(ServiceIncidentRule, __self__).__init__(
            'opsgenie:index/serviceIncidentRule:ServiceIncidentRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            incident_rules: Optional[pulumi.Input[Sequence[pulumi.Input[Union['ServiceIncidentRuleIncidentRuleArgs', 'ServiceIncidentRuleIncidentRuleArgsDict']]]]] = None,
            service_id: Optional[pulumi.Input[_builtins.str]] = None) -> 'ServiceIncidentRule':
        """
        Get an existing ServiceIncidentRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[Sequence[pulumi.Input[Union['ServiceIncidentRuleIncidentRuleArgs', 'ServiceIncidentRuleIncidentRuleArgsDict']]]] incident_rules: This is the rule configuration for this incident rule. This is a block, structure is documented below.
        :param pulumi.Input[_builtins.str] service_id: ID of the service associated
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceIncidentRuleState.__new__(_ServiceIncidentRuleState)

        __props__.__dict__["incident_rules"] = incident_rules
        __props__.__dict__["service_id"] = service_id
        return ServiceIncidentRule(resource_name, opts=opts, __props__=__props__)

    @_builtins.property
    @pulumi.getter(name="incidentRules")
    def incident_rules(self) -> pulumi.Output[Sequence['outputs.ServiceIncidentRuleIncidentRule']]:
        """
        This is the rule configuration for this incident rule. This is a block, structure is documented below.
        """
        return pulumi.get(self, "incident_rules")

    @_builtins.property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[_builtins.str]:
        """
        ID of the service associated
        """
        return pulumi.get(self, "service_id")

