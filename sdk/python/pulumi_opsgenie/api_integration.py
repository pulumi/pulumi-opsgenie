# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ApiIntegrationArgs', 'ApiIntegration']

@pulumi.input_type
class ApiIntegrationArgs:
    def __init__(__self__, *,
                 allow_write_access: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 headers: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 responders: Optional[pulumi.Input[Sequence[pulumi.Input['ApiIntegrationResponderArgs']]]] = None,
                 suppress_notifications: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 webhook_url: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ApiIntegration resource.
        :param pulumi.Input[bool] allow_write_access: This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Defaults to true.
        :param pulumi.Input[bool] enabled: This parameter is for specifying whether the integration will be enabled or not. Defaults to true
        :param pulumi.Input[bool] ignore_responders_from_payload: If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
        :param pulumi.Input[str] name: Name of the integration. Name must be unique for each integration.
        :param pulumi.Input[str] owner_team_id: Owner team id of the integration.
        :param pulumi.Input[Sequence[pulumi.Input['ApiIntegrationResponderArgs']]] responders: User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        :param pulumi.Input[bool] suppress_notifications: If enabled, notifications that come from alerts will be suppressed. Defaults to false.
        :param pulumi.Input[str] type: Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        :param pulumi.Input[str] webhook_url: It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        """
        if allow_write_access is not None:
            pulumi.set(__self__, "allow_write_access", allow_write_access)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if headers is not None:
            pulumi.set(__self__, "headers", headers)
        if ignore_responders_from_payload is not None:
            pulumi.set(__self__, "ignore_responders_from_payload", ignore_responders_from_payload)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner_team_id is not None:
            pulumi.set(__self__, "owner_team_id", owner_team_id)
        if responders is not None:
            pulumi.set(__self__, "responders", responders)
        if suppress_notifications is not None:
            pulumi.set(__self__, "suppress_notifications", suppress_notifications)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if webhook_url is not None:
            pulumi.set(__self__, "webhook_url", webhook_url)

    @property
    @pulumi.getter(name="allowWriteAccess")
    def allow_write_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Defaults to true.
        """
        return pulumi.get(self, "allow_write_access")

    @allow_write_access.setter
    def allow_write_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_write_access", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        This parameter is for specifying whether the integration will be enabled or not. Defaults to true
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def headers(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "headers")

    @headers.setter
    def headers(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "headers", value)

    @property
    @pulumi.getter(name="ignoreRespondersFromPayload")
    def ignore_responders_from_payload(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
        """
        return pulumi.get(self, "ignore_responders_from_payload")

    @ignore_responders_from_payload.setter
    def ignore_responders_from_payload(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_responders_from_payload", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the integration. Name must be unique for each integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ownerTeamId")
    def owner_team_id(self) -> Optional[pulumi.Input[str]]:
        """
        Owner team id of the integration.
        """
        return pulumi.get(self, "owner_team_id")

    @owner_team_id.setter
    def owner_team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_team_id", value)

    @property
    @pulumi.getter
    def responders(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApiIntegrationResponderArgs']]]]:
        """
        User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        """
        return pulumi.get(self, "responders")

    @responders.setter
    def responders(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApiIntegrationResponderArgs']]]]):
        pulumi.set(self, "responders", value)

    @property
    @pulumi.getter(name="suppressNotifications")
    def suppress_notifications(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, notifications that come from alerts will be suppressed. Defaults to false.
        """
        return pulumi.get(self, "suppress_notifications")

    @suppress_notifications.setter
    def suppress_notifications(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "suppress_notifications", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="webhookUrl")
    def webhook_url(self) -> Optional[pulumi.Input[str]]:
        """
        It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        """
        return pulumi.get(self, "webhook_url")

    @webhook_url.setter
    def webhook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "webhook_url", value)


@pulumi.input_type
class _ApiIntegrationState:
    def __init__(__self__, *,
                 allow_write_access: Optional[pulumi.Input[bool]] = None,
                 api_key: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 headers: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 responders: Optional[pulumi.Input[Sequence[pulumi.Input['ApiIntegrationResponderArgs']]]] = None,
                 suppress_notifications: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 webhook_url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ApiIntegration resources.
        :param pulumi.Input[bool] allow_write_access: This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Defaults to true.
        :param pulumi.Input[str] api_key: (Computed) API key of the created integration
        :param pulumi.Input[bool] enabled: This parameter is for specifying whether the integration will be enabled or not. Defaults to true
        :param pulumi.Input[bool] ignore_responders_from_payload: If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
        :param pulumi.Input[str] name: Name of the integration. Name must be unique for each integration.
        :param pulumi.Input[str] owner_team_id: Owner team id of the integration.
        :param pulumi.Input[Sequence[pulumi.Input['ApiIntegrationResponderArgs']]] responders: User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        :param pulumi.Input[bool] suppress_notifications: If enabled, notifications that come from alerts will be suppressed. Defaults to false.
        :param pulumi.Input[str] type: Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        :param pulumi.Input[str] webhook_url: It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        """
        if allow_write_access is not None:
            pulumi.set(__self__, "allow_write_access", allow_write_access)
        if api_key is not None:
            pulumi.set(__self__, "api_key", api_key)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if headers is not None:
            pulumi.set(__self__, "headers", headers)
        if ignore_responders_from_payload is not None:
            pulumi.set(__self__, "ignore_responders_from_payload", ignore_responders_from_payload)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner_team_id is not None:
            pulumi.set(__self__, "owner_team_id", owner_team_id)
        if responders is not None:
            pulumi.set(__self__, "responders", responders)
        if suppress_notifications is not None:
            pulumi.set(__self__, "suppress_notifications", suppress_notifications)
        if type is not None:
            pulumi.set(__self__, "type", type)
        if webhook_url is not None:
            pulumi.set(__self__, "webhook_url", webhook_url)

    @property
    @pulumi.getter(name="allowWriteAccess")
    def allow_write_access(self) -> Optional[pulumi.Input[bool]]:
        """
        This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Defaults to true.
        """
        return pulumi.get(self, "allow_write_access")

    @allow_write_access.setter
    def allow_write_access(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "allow_write_access", value)

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> Optional[pulumi.Input[str]]:
        """
        (Computed) API key of the created integration
        """
        return pulumi.get(self, "api_key")

    @api_key.setter
    def api_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_key", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        This parameter is for specifying whether the integration will be enabled or not. Defaults to true
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def headers(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "headers")

    @headers.setter
    def headers(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "headers", value)

    @property
    @pulumi.getter(name="ignoreRespondersFromPayload")
    def ignore_responders_from_payload(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
        """
        return pulumi.get(self, "ignore_responders_from_payload")

    @ignore_responders_from_payload.setter
    def ignore_responders_from_payload(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "ignore_responders_from_payload", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the integration. Name must be unique for each integration.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="ownerTeamId")
    def owner_team_id(self) -> Optional[pulumi.Input[str]]:
        """
        Owner team id of the integration.
        """
        return pulumi.get(self, "owner_team_id")

    @owner_team_id.setter
    def owner_team_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner_team_id", value)

    @property
    @pulumi.getter
    def responders(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ApiIntegrationResponderArgs']]]]:
        """
        User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        """
        return pulumi.get(self, "responders")

    @responders.setter
    def responders(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ApiIntegrationResponderArgs']]]]):
        pulumi.set(self, "responders", value)

    @property
    @pulumi.getter(name="suppressNotifications")
    def suppress_notifications(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, notifications that come from alerts will be suppressed. Defaults to false.
        """
        return pulumi.get(self, "suppress_notifications")

    @suppress_notifications.setter
    def suppress_notifications(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "suppress_notifications", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="webhookUrl")
    def webhook_url(self) -> Optional[pulumi.Input[str]]:
        """
        It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        """
        return pulumi.get(self, "webhook_url")

    @webhook_url.setter
    def webhook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "webhook_url", value)


class ApiIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_write_access: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 headers: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 responders: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiIntegrationResponderArgs']]]]] = None,
                 suppress_notifications: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 webhook_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages an API Integration within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        example_api_integration_api_integration = opsgenie.ApiIntegration("example-api-integrationApiIntegration",
            type="API",
            responders=[
                opsgenie.ApiIntegrationResponderArgs(
                    type="user",
                    id=opsgenie_user["user"]["id"],
                ),
                opsgenie.ApiIntegrationResponderArgs(
                    type="user",
                    id=opsgenie_user["fahri"]["id"],
                ),
            ])
        example_api_integration_index_api_integration_api_integration = opsgenie.ApiIntegration("example-api-integrationIndex/apiIntegrationApiIntegration",
            type="Prometheus",
            responders=[opsgenie.ApiIntegrationResponderArgs(
                type="user",
                id=opsgenie_user["user"]["id"],
            )],
            enabled=False,
            allow_write_access=False,
            ignore_responders_from_payload=True,
            suppress_notifications=True,
            owner_team_id=opsgenie_team["team"]["id"])
        test3 = opsgenie.ApiIntegration("test3",
            type="Webhook",
            responders=[opsgenie.ApiIntegrationResponderArgs(
                type="user",
                id=opsgenie_user["user"]["id"],
            )],
            enabled=False,
            allow_write_access=False,
            suppress_notifications=True,
            webhook_url="https://api.example.com/v1",
            headers={
                "header1": value1,
            })
        ```

        ## Import

        API Integrations can be imported using the `id`, e.g.

        ```sh
         $ pulumi import opsgenie:index/apiIntegration:ApiIntegration defaultintegration 812be1a1-32c8-4666-a7fb-03ecc385106c`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_write_access: This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Defaults to true.
        :param pulumi.Input[bool] enabled: This parameter is for specifying whether the integration will be enabled or not. Defaults to true
        :param pulumi.Input[bool] ignore_responders_from_payload: If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
        :param pulumi.Input[str] name: Name of the integration. Name must be unique for each integration.
        :param pulumi.Input[str] owner_team_id: Owner team id of the integration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiIntegrationResponderArgs']]]] responders: User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        :param pulumi.Input[bool] suppress_notifications: If enabled, notifications that come from alerts will be suppressed. Defaults to false.
        :param pulumi.Input[str] type: Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        :param pulumi.Input[str] webhook_url: It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ApiIntegrationArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an API Integration within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        example_api_integration_api_integration = opsgenie.ApiIntegration("example-api-integrationApiIntegration",
            type="API",
            responders=[
                opsgenie.ApiIntegrationResponderArgs(
                    type="user",
                    id=opsgenie_user["user"]["id"],
                ),
                opsgenie.ApiIntegrationResponderArgs(
                    type="user",
                    id=opsgenie_user["fahri"]["id"],
                ),
            ])
        example_api_integration_index_api_integration_api_integration = opsgenie.ApiIntegration("example-api-integrationIndex/apiIntegrationApiIntegration",
            type="Prometheus",
            responders=[opsgenie.ApiIntegrationResponderArgs(
                type="user",
                id=opsgenie_user["user"]["id"],
            )],
            enabled=False,
            allow_write_access=False,
            ignore_responders_from_payload=True,
            suppress_notifications=True,
            owner_team_id=opsgenie_team["team"]["id"])
        test3 = opsgenie.ApiIntegration("test3",
            type="Webhook",
            responders=[opsgenie.ApiIntegrationResponderArgs(
                type="user",
                id=opsgenie_user["user"]["id"],
            )],
            enabled=False,
            allow_write_access=False,
            suppress_notifications=True,
            webhook_url="https://api.example.com/v1",
            headers={
                "header1": value1,
            })
        ```

        ## Import

        API Integrations can be imported using the `id`, e.g.

        ```sh
         $ pulumi import opsgenie:index/apiIntegration:ApiIntegration defaultintegration 812be1a1-32c8-4666-a7fb-03ecc385106c`
        ```

        :param str resource_name: The name of the resource.
        :param ApiIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ApiIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 allow_write_access: Optional[pulumi.Input[bool]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 headers: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 responders: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiIntegrationResponderArgs']]]]] = None,
                 suppress_notifications: Optional[pulumi.Input[bool]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 webhook_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ApiIntegrationArgs.__new__(ApiIntegrationArgs)

            __props__.__dict__["allow_write_access"] = allow_write_access
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["headers"] = headers
            __props__.__dict__["ignore_responders_from_payload"] = ignore_responders_from_payload
            __props__.__dict__["name"] = name
            __props__.__dict__["owner_team_id"] = owner_team_id
            __props__.__dict__["responders"] = responders
            __props__.__dict__["suppress_notifications"] = suppress_notifications
            __props__.__dict__["type"] = type
            __props__.__dict__["webhook_url"] = webhook_url
            __props__.__dict__["api_key"] = None
        super(ApiIntegration, __self__).__init__(
            'opsgenie:index/apiIntegration:ApiIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            allow_write_access: Optional[pulumi.Input[bool]] = None,
            api_key: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            headers: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner_team_id: Optional[pulumi.Input[str]] = None,
            responders: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiIntegrationResponderArgs']]]]] = None,
            suppress_notifications: Optional[pulumi.Input[bool]] = None,
            type: Optional[pulumi.Input[str]] = None,
            webhook_url: Optional[pulumi.Input[str]] = None) -> 'ApiIntegration':
        """
        Get an existing ApiIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] allow_write_access: This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Defaults to true.
        :param pulumi.Input[str] api_key: (Computed) API key of the created integration
        :param pulumi.Input[bool] enabled: This parameter is for specifying whether the integration will be enabled or not. Defaults to true
        :param pulumi.Input[bool] ignore_responders_from_payload: If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
        :param pulumi.Input[str] name: Name of the integration. Name must be unique for each integration.
        :param pulumi.Input[str] owner_team_id: Owner team id of the integration.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ApiIntegrationResponderArgs']]]] responders: User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        :param pulumi.Input[bool] suppress_notifications: If enabled, notifications that come from alerts will be suppressed. Defaults to false.
        :param pulumi.Input[str] type: Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        :param pulumi.Input[str] webhook_url: It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ApiIntegrationState.__new__(_ApiIntegrationState)

        __props__.__dict__["allow_write_access"] = allow_write_access
        __props__.__dict__["api_key"] = api_key
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["headers"] = headers
        __props__.__dict__["ignore_responders_from_payload"] = ignore_responders_from_payload
        __props__.__dict__["name"] = name
        __props__.__dict__["owner_team_id"] = owner_team_id
        __props__.__dict__["responders"] = responders
        __props__.__dict__["suppress_notifications"] = suppress_notifications
        __props__.__dict__["type"] = type
        __props__.__dict__["webhook_url"] = webhook_url
        return ApiIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="allowWriteAccess")
    def allow_write_access(self) -> pulumi.Output[Optional[bool]]:
        """
        This parameter is for configuring the write access of integration. If write access is restricted, the integration will not be authorized to write within any domain. Defaults to true.
        """
        return pulumi.get(self, "allow_write_access")

    @property
    @pulumi.getter(name="apiKey")
    def api_key(self) -> pulumi.Output[str]:
        """
        (Computed) API key of the created integration
        """
        return pulumi.get(self, "api_key")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        This parameter is for specifying whether the integration will be enabled or not. Defaults to true
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def headers(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        return pulumi.get(self, "headers")

    @property
    @pulumi.getter(name="ignoreRespondersFromPayload")
    def ignore_responders_from_payload(self) -> pulumi.Output[Optional[bool]]:
        """
        If enabled, the integration will ignore recipients sent in request payloads. Defaults to false.
        """
        return pulumi.get(self, "ignore_responders_from_payload")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the integration. Name must be unique for each integration.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="ownerTeamId")
    def owner_team_id(self) -> pulumi.Output[Optional[str]]:
        """
        Owner team id of the integration.
        """
        return pulumi.get(self, "owner_team_id")

    @property
    @pulumi.getter
    def responders(self) -> pulumi.Output[Optional[Sequence['outputs.ApiIntegrationResponder']]]:
        """
        User, schedule, teams or escalation names to calculate which users will receive the notifications of the alert.
        """
        return pulumi.get(self, "responders")

    @property
    @pulumi.getter(name="suppressNotifications")
    def suppress_notifications(self) -> pulumi.Output[Optional[bool]]:
        """
        If enabled, notifications that come from alerts will be suppressed. Defaults to false.
        """
        return pulumi.get(self, "suppress_notifications")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[Optional[str]]:
        """
        Type of the integration (API, Marid, Prometheus, etc). The full list of options can be found [here](https://docs.opsgenie.com/docs/integration-types-to-use-with-api).
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="webhookUrl")
    def webhook_url(self) -> pulumi.Output[Optional[str]]:
        """
        It is required if type is `Webhook`. This is the url Opsgenie will be sending request to.
        """
        return pulumi.get(self, "webhook_url")

