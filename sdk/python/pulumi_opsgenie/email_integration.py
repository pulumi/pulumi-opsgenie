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

__all__ = ['EmailIntegrationArgs', 'EmailIntegration']

@pulumi.input_type
class EmailIntegrationArgs:
    def __init__(__self__, *,
                 email_username: pulumi.Input[str],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 responders: Optional[pulumi.Input[Sequence[pulumi.Input['EmailIntegrationResponderArgs']]]] = None,
                 suppress_notifications: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a EmailIntegration resource.
        :param pulumi.Input[str] email_username: The username part of the email address. It must be unique for each integration.
        :param pulumi.Input[bool] enabled: A Member block as documented below.
        :param pulumi.Input[bool] ignore_responders_from_payload: If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
        :param pulumi.Input[str] name: Name of the integration. Name must be unique for each integration.
        :param pulumi.Input[str] owner_team_id: Owner team id of the integration.
        :param pulumi.Input[bool] suppress_notifications: If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        """
        pulumi.set(__self__, "email_username", email_username)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
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

    @property
    @pulumi.getter(name="emailUsername")
    def email_username(self) -> pulumi.Input[str]:
        """
        The username part of the email address. It must be unique for each integration.
        """
        return pulumi.get(self, "email_username")

    @email_username.setter
    def email_username(self, value: pulumi.Input[str]):
        pulumi.set(self, "email_username", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        A Member block as documented below.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="ignoreRespondersFromPayload")
    def ignore_responders_from_payload(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
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
    def responders(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EmailIntegrationResponderArgs']]]]:
        return pulumi.get(self, "responders")

    @responders.setter
    def responders(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EmailIntegrationResponderArgs']]]]):
        pulumi.set(self, "responders", value)

    @property
    @pulumi.getter(name="suppressNotifications")
    def suppress_notifications(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        """
        return pulumi.get(self, "suppress_notifications")

    @suppress_notifications.setter
    def suppress_notifications(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "suppress_notifications", value)


@pulumi.input_type
class _EmailIntegrationState:
    def __init__(__self__, *,
                 email_username: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 responders: Optional[pulumi.Input[Sequence[pulumi.Input['EmailIntegrationResponderArgs']]]] = None,
                 suppress_notifications: Optional[pulumi.Input[bool]] = None):
        """
        Input properties used for looking up and filtering EmailIntegration resources.
        :param pulumi.Input[str] email_username: The username part of the email address. It must be unique for each integration.
        :param pulumi.Input[bool] enabled: A Member block as documented below.
        :param pulumi.Input[bool] ignore_responders_from_payload: If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
        :param pulumi.Input[str] name: Name of the integration. Name must be unique for each integration.
        :param pulumi.Input[str] owner_team_id: Owner team id of the integration.
        :param pulumi.Input[bool] suppress_notifications: If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        """
        if email_username is not None:
            pulumi.set(__self__, "email_username", email_username)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
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

    @property
    @pulumi.getter(name="emailUsername")
    def email_username(self) -> Optional[pulumi.Input[str]]:
        """
        The username part of the email address. It must be unique for each integration.
        """
        return pulumi.get(self, "email_username")

    @email_username.setter
    def email_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "email_username", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        A Member block as documented below.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="ignoreRespondersFromPayload")
    def ignore_responders_from_payload(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
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
    def responders(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['EmailIntegrationResponderArgs']]]]:
        return pulumi.get(self, "responders")

    @responders.setter
    def responders(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['EmailIntegrationResponderArgs']]]]):
        pulumi.set(self, "responders", value)

    @property
    @pulumi.getter(name="suppressNotifications")
    def suppress_notifications(self) -> Optional[pulumi.Input[bool]]:
        """
        If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        """
        return pulumi.get(self, "suppress_notifications")

    @suppress_notifications.setter
    def suppress_notifications(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "suppress_notifications", value)


class EmailIntegration(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email_username: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 responders: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailIntegrationResponderArgs']]]]] = None,
                 suppress_notifications: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        Manages an Email Integration within Opsgenie.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test_email_integration = opsgenie.EmailIntegration("testEmailIntegration", email_username="fahri")
        test_index_email_integration_email_integration = opsgenie.EmailIntegration("testIndex/emailIntegrationEmailIntegration",
            responders=[
                opsgenie.EmailIntegrationResponderArgs(
                    type="user",
                    id=opsgenie_user["test"]["id"],
                ),
                opsgenie.EmailIntegrationResponderArgs(
                    type="schedule",
                    id=opsgenie_schedule["test"]["id"],
                ),
                opsgenie.EmailIntegrationResponderArgs(
                    type="escalation",
                    id=opsgenie_escalation["test"]["id"],
                ),
                opsgenie.EmailIntegrationResponderArgs(
                    type="team",
                    id=opsgenie_team["test2"]["id"],
                ),
            ],
            email_username="test",
            enabled=True,
            ignore_responders_from_payload=True,
            suppress_notifications=True)
        test_opsgenie_index_email_integration_email_integration = opsgenie.EmailIntegration("testOpsgenieIndex/emailIntegrationEmailIntegration",
            responders=[opsgenie.EmailIntegrationResponderArgs(
                type="user",
                id=opsgenie_user["test"]["id"],
            )],
            email_username="test",
            enabled=True,
            ignore_responders_from_payload=True,
            suppress_notifications=True,
            owner_team_id=opsgenie_team_genies["id"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Email Integrations can be imported using the `id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/emailIntegration:EmailIntegration test id`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email_username: The username part of the email address. It must be unique for each integration.
        :param pulumi.Input[bool] enabled: A Member block as documented below.
        :param pulumi.Input[bool] ignore_responders_from_payload: If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
        :param pulumi.Input[str] name: Name of the integration. Name must be unique for each integration.
        :param pulumi.Input[str] owner_team_id: Owner team id of the integration.
        :param pulumi.Input[bool] suppress_notifications: If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailIntegrationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages an Email Integration within Opsgenie.

        ## Example Usage

        <!--Start PulumiCodeChooser -->
        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test_email_integration = opsgenie.EmailIntegration("testEmailIntegration", email_username="fahri")
        test_index_email_integration_email_integration = opsgenie.EmailIntegration("testIndex/emailIntegrationEmailIntegration",
            responders=[
                opsgenie.EmailIntegrationResponderArgs(
                    type="user",
                    id=opsgenie_user["test"]["id"],
                ),
                opsgenie.EmailIntegrationResponderArgs(
                    type="schedule",
                    id=opsgenie_schedule["test"]["id"],
                ),
                opsgenie.EmailIntegrationResponderArgs(
                    type="escalation",
                    id=opsgenie_escalation["test"]["id"],
                ),
                opsgenie.EmailIntegrationResponderArgs(
                    type="team",
                    id=opsgenie_team["test2"]["id"],
                ),
            ],
            email_username="test",
            enabled=True,
            ignore_responders_from_payload=True,
            suppress_notifications=True)
        test_opsgenie_index_email_integration_email_integration = opsgenie.EmailIntegration("testOpsgenieIndex/emailIntegrationEmailIntegration",
            responders=[opsgenie.EmailIntegrationResponderArgs(
                type="user",
                id=opsgenie_user["test"]["id"],
            )],
            email_username="test",
            enabled=True,
            ignore_responders_from_payload=True,
            suppress_notifications=True,
            owner_team_id=opsgenie_team_genies["id"])
        ```
        <!--End PulumiCodeChooser -->

        ## Import

        Email Integrations can be imported using the `id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/emailIntegration:EmailIntegration test id`
        ```

        :param str resource_name: The name of the resource.
        :param EmailIntegrationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailIntegrationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email_username: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner_team_id: Optional[pulumi.Input[str]] = None,
                 responders: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailIntegrationResponderArgs']]]]] = None,
                 suppress_notifications: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailIntegrationArgs.__new__(EmailIntegrationArgs)

            if email_username is None and not opts.urn:
                raise TypeError("Missing required property 'email_username'")
            __props__.__dict__["email_username"] = email_username
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["ignore_responders_from_payload"] = ignore_responders_from_payload
            __props__.__dict__["name"] = name
            __props__.__dict__["owner_team_id"] = owner_team_id
            __props__.__dict__["responders"] = responders
            __props__.__dict__["suppress_notifications"] = suppress_notifications
        super(EmailIntegration, __self__).__init__(
            'opsgenie:index/emailIntegration:EmailIntegration',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            email_username: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            ignore_responders_from_payload: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            owner_team_id: Optional[pulumi.Input[str]] = None,
            responders: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['EmailIntegrationResponderArgs']]]]] = None,
            suppress_notifications: Optional[pulumi.Input[bool]] = None) -> 'EmailIntegration':
        """
        Get an existing EmailIntegration resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] email_username: The username part of the email address. It must be unique for each integration.
        :param pulumi.Input[bool] enabled: A Member block as documented below.
        :param pulumi.Input[bool] ignore_responders_from_payload: If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
        :param pulumi.Input[str] name: Name of the integration. Name must be unique for each integration.
        :param pulumi.Input[str] owner_team_id: Owner team id of the integration.
        :param pulumi.Input[bool] suppress_notifications: If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailIntegrationState.__new__(_EmailIntegrationState)

        __props__.__dict__["email_username"] = email_username
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["ignore_responders_from_payload"] = ignore_responders_from_payload
        __props__.__dict__["name"] = name
        __props__.__dict__["owner_team_id"] = owner_team_id
        __props__.__dict__["responders"] = responders
        __props__.__dict__["suppress_notifications"] = suppress_notifications
        return EmailIntegration(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="emailUsername")
    def email_username(self) -> pulumi.Output[str]:
        """
        The username part of the email address. It must be unique for each integration.
        """
        return pulumi.get(self, "email_username")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        A Member block as documented below.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="ignoreRespondersFromPayload")
    def ignore_responders_from_payload(self) -> pulumi.Output[Optional[bool]]:
        """
        If enabled, the integration will ignore recipients sent in request payloads. Default: `false`.
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
    def responders(self) -> pulumi.Output[Optional[Sequence['outputs.EmailIntegrationResponder']]]:
        return pulumi.get(self, "responders")

    @property
    @pulumi.getter(name="suppressNotifications")
    def suppress_notifications(self) -> pulumi.Output[Optional[bool]]:
        """
        If enabled, notifications that come from alerts will be suppressed. Default: `false`.
        """
        return pulumi.get(self, "suppress_notifications")

