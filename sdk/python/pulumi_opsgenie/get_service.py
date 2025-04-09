# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
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
    'GetServiceResult',
    'AwaitableGetServiceResult',
    'get_service',
    'get_service_output',
]

@pulumi.output_type
class GetServiceResult:
    """
    A collection of values returned by getService.
    """
    def __init__(__self__, description=None, id=None, name=None, team_id=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if team_id and not isinstance(team_id, str):
            raise TypeError("Expected argument 'team_id' to be a str")
        pulumi.set(__self__, "team_id", team_id)

    @property
    @pulumi.getter
    def description(self) -> Optional[builtins.str]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> builtins.str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[builtins.str]:
        return pulumi.get(self, "team_id")


class AwaitableGetServiceResult(GetServiceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetServiceResult(
            description=self.description,
            id=self.id,
            name=self.name,
            team_id=self.team_id)


def get_service(description: Optional[builtins.str] = None,
                name: Optional[builtins.str] = None,
                team_id: Optional[builtins.str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceResult:
    """
    Manages existing Service within Opsgenie.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_opsgenie as opsgenie

    this = opsgenie.get_service(name="Payment")
    ```


    :param builtins.str description: Description field of the service that is generally used to provide a detailed information about the service.
    :param builtins.str name: Name of the service. This field must not be longer than 100 characters.
           
           The following attributes are exported:
    :param builtins.str team_id: Team id of the service.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['name'] = name
    __args__['teamId'] = team_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('opsgenie:index/getService:getService', __args__, opts=opts, typ=GetServiceResult).value

    return AwaitableGetServiceResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        team_id=pulumi.get(__ret__, 'team_id'))
def get_service_output(description: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                       name: Optional[pulumi.Input[builtins.str]] = None,
                       team_id: Optional[pulumi.Input[Optional[builtins.str]]] = None,
                       opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetServiceResult]:
    """
    Manages existing Service within Opsgenie.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_opsgenie as opsgenie

    this = opsgenie.get_service(name="Payment")
    ```


    :param builtins.str description: Description field of the service that is generally used to provide a detailed information about the service.
    :param builtins.str name: Name of the service. This field must not be longer than 100 characters.
           
           The following attributes are exported:
    :param builtins.str team_id: Team id of the service.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['name'] = name
    __args__['teamId'] = team_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('opsgenie:index/getService:getService', __args__, opts=opts, typ=GetServiceResult)
    return __ret__.apply(lambda __response__: GetServiceResult(
        description=pulumi.get(__response__, 'description'),
        id=pulumi.get(__response__, 'id'),
        name=pulumi.get(__response__, 'name'),
        team_id=pulumi.get(__response__, 'team_id')))
