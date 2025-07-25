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

__all__ = [
    'GetUserResult',
    'AwaitableGetUserResult',
    'get_user',
    'get_user_output',
]

@pulumi.output_type
class GetUserResult:
    """
    A collection of values returned by getUser.
    """
    def __init__(__self__, full_name=None, id=None, locale=None, role=None, timezone=None, username=None):
        if full_name and not isinstance(full_name, str):
            raise TypeError("Expected argument 'full_name' to be a str")
        pulumi.set(__self__, "full_name", full_name)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if locale and not isinstance(locale, str):
            raise TypeError("Expected argument 'locale' to be a str")
        pulumi.set(__self__, "locale", locale)
        if role and not isinstance(role, str):
            raise TypeError("Expected argument 'role' to be a str")
        pulumi.set(__self__, "role", role)
        if timezone and not isinstance(timezone, str):
            raise TypeError("Expected argument 'timezone' to be a str")
        pulumi.set(__self__, "timezone", timezone)
        if username and not isinstance(username, str):
            raise TypeError("Expected argument 'username' to be a str")
        pulumi.set(__self__, "username", username)

    @_builtins.property
    @pulumi.getter(name="fullName")
    def full_name(self) -> Optional[_builtins.str]:
        """
        The Full Name of the User.
        """
        return pulumi.get(self, "full_name")

    @_builtins.property
    @pulumi.getter
    def id(self) -> _builtins.str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @_builtins.property
    @pulumi.getter
    def locale(self) -> Optional[_builtins.str]:
        """
        Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        """
        return pulumi.get(self, "locale")

    @_builtins.property
    @pulumi.getter
    def role(self) -> Optional[_builtins.str]:
        """
        The Role assigned to the User. Either a built-in such as 'Owner', 'Admin' or 'User' - or the name of a custom role.
        """
        return pulumi.get(self, "role")

    @_builtins.property
    @pulumi.getter
    def timezone(self) -> Optional[_builtins.str]:
        """
        Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        """
        return pulumi.get(self, "timezone")

    @_builtins.property
    @pulumi.getter
    def username(self) -> _builtins.str:
        return pulumi.get(self, "username")


class AwaitableGetUserResult(GetUserResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetUserResult(
            full_name=self.full_name,
            id=self.id,
            locale=self.locale,
            role=self.role,
            timezone=self.timezone,
            username=self.username)


def get_user(full_name: Optional[_builtins.str] = None,
             locale: Optional[_builtins.str] = None,
             role: Optional[_builtins.str] = None,
             timezone: Optional[_builtins.str] = None,
             username: Optional[_builtins.str] = None,
             opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetUserResult:
    """
    Manages existing User within Opsgenie.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_opsgenie as opsgenie

    test = opsgenie.get_user(username="user@domain.com")
    ```


    :param _builtins.str full_name: The Full Name of the User.
    :param _builtins.str locale: Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
    :param _builtins.str role: The Role assigned to the User. Either a built-in such as 'Owner', 'Admin' or 'User' - or the name of a custom role.
    :param _builtins.str timezone: Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
    :param _builtins.str username: The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters.
    """
    __args__ = dict()
    __args__['fullName'] = full_name
    __args__['locale'] = locale
    __args__['role'] = role
    __args__['timezone'] = timezone
    __args__['username'] = username
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('opsgenie:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult).value

    return AwaitableGetUserResult(
        full_name=pulumi.get(__ret__, 'full_name'),
        id=pulumi.get(__ret__, 'id'),
        locale=pulumi.get(__ret__, 'locale'),
        role=pulumi.get(__ret__, 'role'),
        timezone=pulumi.get(__ret__, 'timezone'),
        username=pulumi.get(__ret__, 'username'))
def get_user_output(full_name: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                    locale: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                    role: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                    timezone: Optional[pulumi.Input[Optional[_builtins.str]]] = None,
                    username: Optional[pulumi.Input[_builtins.str]] = None,
                    opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetUserResult]:
    """
    Manages existing User within Opsgenie.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_opsgenie as opsgenie

    test = opsgenie.get_user(username="user@domain.com")
    ```


    :param _builtins.str full_name: The Full Name of the User.
    :param _builtins.str locale: Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
    :param _builtins.str role: The Role assigned to the User. Either a built-in such as 'Owner', 'Admin' or 'User' - or the name of a custom role.
    :param _builtins.str timezone: Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
    :param _builtins.str username: The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters.
    """
    __args__ = dict()
    __args__['fullName'] = full_name
    __args__['locale'] = locale
    __args__['role'] = role
    __args__['timezone'] = timezone
    __args__['username'] = username
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('opsgenie:index/getUser:getUser', __args__, opts=opts, typ=GetUserResult)
    return __ret__.apply(lambda __response__: GetUserResult(
        full_name=pulumi.get(__response__, 'full_name'),
        id=pulumi.get(__response__, 'id'),
        locale=pulumi.get(__response__, 'locale'),
        role=pulumi.get(__response__, 'role'),
        timezone=pulumi.get(__response__, 'timezone'),
        username=pulumi.get(__response__, 'username')))
