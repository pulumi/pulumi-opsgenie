# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities, _tables

__all__ = [
    'GetServiceResult',
    'AwaitableGetServiceResult',
    'get_service',
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
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[str]:
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


def get_service(description: Optional[str] = None,
                name: Optional[str] = None,
                team_id: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetServiceResult:
    """
    Manages existing Service within Opsgenie.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_opsgenie as opsgenie

    this = opsgenie.get_service(name="Payment")
    ```


    :param str description: Description field of the service that is generally used to provide a detailed information about the service.
    :param str name: Name of the service. This field must not be longer than 100 characters.
    :param str team_id: Team id of the service.
    """
    __args__ = dict()
    __args__['description'] = description
    __args__['name'] = name
    __args__['teamId'] = team_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('opsgenie:index/getService:getService', __args__, opts=opts, typ=GetServiceResult).value

    return AwaitableGetServiceResult(
        description=__ret__.description,
        id=__ret__.id,
        name=__ret__.name,
        team_id=__ret__.team_id)
