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

__all__ = ['IntegrationActionArgs', 'IntegrationAction']

@pulumi.input_type
class IntegrationActionArgs:
    def __init__(__self__, *,
                 integration_id: pulumi.Input[str],
                 acknowledges: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAcknowledgeArgs']]]] = None,
                 add_notes: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAddNoteArgs']]]] = None,
                 closes: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCloseArgs']]]] = None,
                 creates: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCreateArgs']]]] = None,
                 ignores: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionIgnoreArgs']]]] = None):
        """
        The set of arguments for constructing a IntegrationAction resource.
        :param pulumi.Input[str] integration_id: ID of the parent integration resource to bind to.
        """
        IntegrationActionArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            integration_id=integration_id,
            acknowledges=acknowledges,
            add_notes=add_notes,
            closes=closes,
            creates=creates,
            ignores=ignores,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             integration_id: Optional[pulumi.Input[str]] = None,
             acknowledges: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAcknowledgeArgs']]]] = None,
             add_notes: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAddNoteArgs']]]] = None,
             closes: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCloseArgs']]]] = None,
             creates: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCreateArgs']]]] = None,
             ignores: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionIgnoreArgs']]]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if integration_id is None and 'integrationId' in kwargs:
            integration_id = kwargs['integrationId']
        if integration_id is None:
            raise TypeError("Missing 'integration_id' argument")
        if add_notes is None and 'addNotes' in kwargs:
            add_notes = kwargs['addNotes']

        _setter("integration_id", integration_id)
        if acknowledges is not None:
            _setter("acknowledges", acknowledges)
        if add_notes is not None:
            _setter("add_notes", add_notes)
        if closes is not None:
            _setter("closes", closes)
        if creates is not None:
            _setter("creates", creates)
        if ignores is not None:
            _setter("ignores", ignores)

    @property
    @pulumi.getter(name="integrationId")
    def integration_id(self) -> pulumi.Input[str]:
        """
        ID of the parent integration resource to bind to.
        """
        return pulumi.get(self, "integration_id")

    @integration_id.setter
    def integration_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "integration_id", value)

    @property
    @pulumi.getter
    def acknowledges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAcknowledgeArgs']]]]:
        return pulumi.get(self, "acknowledges")

    @acknowledges.setter
    def acknowledges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAcknowledgeArgs']]]]):
        pulumi.set(self, "acknowledges", value)

    @property
    @pulumi.getter(name="addNotes")
    def add_notes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAddNoteArgs']]]]:
        return pulumi.get(self, "add_notes")

    @add_notes.setter
    def add_notes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAddNoteArgs']]]]):
        pulumi.set(self, "add_notes", value)

    @property
    @pulumi.getter
    def closes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCloseArgs']]]]:
        return pulumi.get(self, "closes")

    @closes.setter
    def closes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCloseArgs']]]]):
        pulumi.set(self, "closes", value)

    @property
    @pulumi.getter
    def creates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCreateArgs']]]]:
        return pulumi.get(self, "creates")

    @creates.setter
    def creates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCreateArgs']]]]):
        pulumi.set(self, "creates", value)

    @property
    @pulumi.getter
    def ignores(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionIgnoreArgs']]]]:
        return pulumi.get(self, "ignores")

    @ignores.setter
    def ignores(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionIgnoreArgs']]]]):
        pulumi.set(self, "ignores", value)


@pulumi.input_type
class _IntegrationActionState:
    def __init__(__self__, *,
                 acknowledges: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAcknowledgeArgs']]]] = None,
                 add_notes: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAddNoteArgs']]]] = None,
                 closes: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCloseArgs']]]] = None,
                 creates: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCreateArgs']]]] = None,
                 ignores: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionIgnoreArgs']]]] = None,
                 integration_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering IntegrationAction resources.
        :param pulumi.Input[str] integration_id: ID of the parent integration resource to bind to.
        """
        _IntegrationActionState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            acknowledges=acknowledges,
            add_notes=add_notes,
            closes=closes,
            creates=creates,
            ignores=ignores,
            integration_id=integration_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             acknowledges: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAcknowledgeArgs']]]] = None,
             add_notes: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAddNoteArgs']]]] = None,
             closes: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCloseArgs']]]] = None,
             creates: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCreateArgs']]]] = None,
             ignores: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionIgnoreArgs']]]] = None,
             integration_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if add_notes is None and 'addNotes' in kwargs:
            add_notes = kwargs['addNotes']
        if integration_id is None and 'integrationId' in kwargs:
            integration_id = kwargs['integrationId']

        if acknowledges is not None:
            _setter("acknowledges", acknowledges)
        if add_notes is not None:
            _setter("add_notes", add_notes)
        if closes is not None:
            _setter("closes", closes)
        if creates is not None:
            _setter("creates", creates)
        if ignores is not None:
            _setter("ignores", ignores)
        if integration_id is not None:
            _setter("integration_id", integration_id)

    @property
    @pulumi.getter
    def acknowledges(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAcknowledgeArgs']]]]:
        return pulumi.get(self, "acknowledges")

    @acknowledges.setter
    def acknowledges(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAcknowledgeArgs']]]]):
        pulumi.set(self, "acknowledges", value)

    @property
    @pulumi.getter(name="addNotes")
    def add_notes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAddNoteArgs']]]]:
        return pulumi.get(self, "add_notes")

    @add_notes.setter
    def add_notes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionAddNoteArgs']]]]):
        pulumi.set(self, "add_notes", value)

    @property
    @pulumi.getter
    def closes(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCloseArgs']]]]:
        return pulumi.get(self, "closes")

    @closes.setter
    def closes(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCloseArgs']]]]):
        pulumi.set(self, "closes", value)

    @property
    @pulumi.getter
    def creates(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCreateArgs']]]]:
        return pulumi.get(self, "creates")

    @creates.setter
    def creates(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionCreateArgs']]]]):
        pulumi.set(self, "creates", value)

    @property
    @pulumi.getter
    def ignores(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionIgnoreArgs']]]]:
        return pulumi.get(self, "ignores")

    @ignores.setter
    def ignores(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['IntegrationActionIgnoreArgs']]]]):
        pulumi.set(self, "ignores", value)

    @property
    @pulumi.getter(name="integrationId")
    def integration_id(self) -> Optional[pulumi.Input[str]]:
        """
        ID of the parent integration resource to bind to.
        """
        return pulumi.get(self, "integration_id")

    @integration_id.setter
    def integration_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "integration_id", value)


class IntegrationAction(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acknowledges: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionAcknowledgeArgs']]]]] = None,
                 add_notes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionAddNoteArgs']]]]] = None,
                 closes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionCloseArgs']]]]] = None,
                 creates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionCreateArgs']]]]] = None,
                 ignores: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionIgnoreArgs']]]]] = None,
                 integration_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages advanced actions for Integrations within Opsgenie. This applies for the following resources:
        * `ApiIntegration`
        * `EmailIntegration`

        The actions that are supported are:
        * `create`
        * `close`
        * `acknowledge`
        * `add_note`
        * `ignore`

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] integration_id: ID of the parent integration resource to bind to.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: IntegrationActionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages advanced actions for Integrations within Opsgenie. This applies for the following resources:
        * `ApiIntegration`
        * `EmailIntegration`

        The actions that are supported are:
        * `create`
        * `close`
        * `acknowledge`
        * `add_note`
        * `ignore`

        :param str resource_name: The name of the resource.
        :param IntegrationActionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(IntegrationActionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            IntegrationActionArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 acknowledges: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionAcknowledgeArgs']]]]] = None,
                 add_notes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionAddNoteArgs']]]]] = None,
                 closes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionCloseArgs']]]]] = None,
                 creates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionCreateArgs']]]]] = None,
                 ignores: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionIgnoreArgs']]]]] = None,
                 integration_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = IntegrationActionArgs.__new__(IntegrationActionArgs)

            __props__.__dict__["acknowledges"] = acknowledges
            __props__.__dict__["add_notes"] = add_notes
            __props__.__dict__["closes"] = closes
            __props__.__dict__["creates"] = creates
            __props__.__dict__["ignores"] = ignores
            if integration_id is None and not opts.urn:
                raise TypeError("Missing required property 'integration_id'")
            __props__.__dict__["integration_id"] = integration_id
        super(IntegrationAction, __self__).__init__(
            'opsgenie:index/integrationAction:IntegrationAction',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            acknowledges: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionAcknowledgeArgs']]]]] = None,
            add_notes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionAddNoteArgs']]]]] = None,
            closes: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionCloseArgs']]]]] = None,
            creates: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionCreateArgs']]]]] = None,
            ignores: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['IntegrationActionIgnoreArgs']]]]] = None,
            integration_id: Optional[pulumi.Input[str]] = None) -> 'IntegrationAction':
        """
        Get an existing IntegrationAction resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] integration_id: ID of the parent integration resource to bind to.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _IntegrationActionState.__new__(_IntegrationActionState)

        __props__.__dict__["acknowledges"] = acknowledges
        __props__.__dict__["add_notes"] = add_notes
        __props__.__dict__["closes"] = closes
        __props__.__dict__["creates"] = creates
        __props__.__dict__["ignores"] = ignores
        __props__.__dict__["integration_id"] = integration_id
        return IntegrationAction(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def acknowledges(self) -> pulumi.Output[Optional[Sequence['outputs.IntegrationActionAcknowledge']]]:
        return pulumi.get(self, "acknowledges")

    @property
    @pulumi.getter(name="addNotes")
    def add_notes(self) -> pulumi.Output[Optional[Sequence['outputs.IntegrationActionAddNote']]]:
        return pulumi.get(self, "add_notes")

    @property
    @pulumi.getter
    def closes(self) -> pulumi.Output[Optional[Sequence['outputs.IntegrationActionClose']]]:
        return pulumi.get(self, "closes")

    @property
    @pulumi.getter
    def creates(self) -> pulumi.Output[Optional[Sequence['outputs.IntegrationActionCreate']]]:
        return pulumi.get(self, "creates")

    @property
    @pulumi.getter
    def ignores(self) -> pulumi.Output[Optional[Sequence['outputs.IntegrationActionIgnore']]]:
        return pulumi.get(self, "ignores")

    @property
    @pulumi.getter(name="integrationId")
    def integration_id(self) -> pulumi.Output[str]:
        """
        ID of the parent integration resource to bind to.
        """
        return pulumi.get(self, "integration_id")

