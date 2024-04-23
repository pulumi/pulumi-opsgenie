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

__all__ = ['UserArgs', 'User']

@pulumi.input_type
class UserArgs:
    def __init__(__self__, *,
                 full_name: pulumi.Input[str],
                 role: pulumi.Input[str],
                 username: pulumi.Input[str],
                 locale: Optional[pulumi.Input[str]] = None,
                 skype_username: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 user_addresses: Optional[pulumi.Input[Sequence[pulumi.Input['UserUserAddressArgs']]]] = None,
                 user_details: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a User resource.
        :param pulumi.Input[str] full_name: The Full Name of the User.
        :param pulumi.Input[str] role: The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        :param pulumi.Input[str] username: The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        :param pulumi.Input[str] locale: Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        :param pulumi.Input[str] skype_username: Skype username of the user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags to be associated with the user.
        :param pulumi.Input[str] timezone: Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        :param pulumi.Input[Sequence[pulumi.Input['UserUserAddressArgs']]] user_addresses: Address of the user.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] user_details: Details about the user in form of key and list. of values.
        """
        pulumi.set(__self__, "full_name", full_name)
        pulumi.set(__self__, "role", role)
        pulumi.set(__self__, "username", username)
        if locale is not None:
            pulumi.set(__self__, "locale", locale)
        if skype_username is not None:
            pulumi.set(__self__, "skype_username", skype_username)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)
        if user_addresses is not None:
            pulumi.set(__self__, "user_addresses", user_addresses)
        if user_details is not None:
            pulumi.set(__self__, "user_details", user_details)

    @property
    @pulumi.getter(name="fullName")
    def full_name(self) -> pulumi.Input[str]:
        """
        The Full Name of the User.
        """
        return pulumi.get(self, "full_name")

    @full_name.setter
    def full_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "full_name", value)

    @property
    @pulumi.getter
    def role(self) -> pulumi.Input[str]:
        """
        The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: pulumi.Input[str]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter
    def username(self) -> pulumi.Input[str]:
        """
        The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: pulumi.Input[str]):
        pulumi.set(self, "username", value)

    @property
    @pulumi.getter
    def locale(self) -> Optional[pulumi.Input[str]]:
        """
        Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        """
        return pulumi.get(self, "locale")

    @locale.setter
    def locale(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "locale", value)

    @property
    @pulumi.getter(name="skypeUsername")
    def skype_username(self) -> Optional[pulumi.Input[str]]:
        """
        Skype username of the user.
        """
        return pulumi.get(self, "skype_username")

    @skype_username.setter
    def skype_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "skype_username", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of tags to be associated with the user.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)

    @property
    @pulumi.getter(name="userAddresses")
    def user_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UserUserAddressArgs']]]]:
        """
        Address of the user.
        """
        return pulumi.get(self, "user_addresses")

    @user_addresses.setter
    def user_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UserUserAddressArgs']]]]):
        pulumi.set(self, "user_addresses", value)

    @property
    @pulumi.getter(name="userDetails")
    def user_details(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Details about the user in form of key and list. of values.
        """
        return pulumi.get(self, "user_details")

    @user_details.setter
    def user_details(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "user_details", value)


@pulumi.input_type
class _UserState:
    def __init__(__self__, *,
                 full_name: Optional[pulumi.Input[str]] = None,
                 locale: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 skype_username: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 user_addresses: Optional[pulumi.Input[Sequence[pulumi.Input['UserUserAddressArgs']]]] = None,
                 user_details: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering User resources.
        :param pulumi.Input[str] full_name: The Full Name of the User.
        :param pulumi.Input[str] locale: Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        :param pulumi.Input[str] role: The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        :param pulumi.Input[str] skype_username: Skype username of the user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags to be associated with the user.
        :param pulumi.Input[str] timezone: Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        :param pulumi.Input[Sequence[pulumi.Input['UserUserAddressArgs']]] user_addresses: Address of the user.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] user_details: Details about the user in form of key and list. of values.
        :param pulumi.Input[str] username: The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        """
        if full_name is not None:
            pulumi.set(__self__, "full_name", full_name)
        if locale is not None:
            pulumi.set(__self__, "locale", locale)
        if role is not None:
            pulumi.set(__self__, "role", role)
        if skype_username is not None:
            pulumi.set(__self__, "skype_username", skype_username)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if timezone is not None:
            pulumi.set(__self__, "timezone", timezone)
        if user_addresses is not None:
            pulumi.set(__self__, "user_addresses", user_addresses)
        if user_details is not None:
            pulumi.set(__self__, "user_details", user_details)
        if username is not None:
            pulumi.set(__self__, "username", username)

    @property
    @pulumi.getter(name="fullName")
    def full_name(self) -> Optional[pulumi.Input[str]]:
        """
        The Full Name of the User.
        """
        return pulumi.get(self, "full_name")

    @full_name.setter
    def full_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "full_name", value)

    @property
    @pulumi.getter
    def locale(self) -> Optional[pulumi.Input[str]]:
        """
        Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        """
        return pulumi.get(self, "locale")

    @locale.setter
    def locale(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "locale", value)

    @property
    @pulumi.getter
    def role(self) -> Optional[pulumi.Input[str]]:
        """
        The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        """
        return pulumi.get(self, "role")

    @role.setter
    def role(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "role", value)

    @property
    @pulumi.getter(name="skypeUsername")
    def skype_username(self) -> Optional[pulumi.Input[str]]:
        """
        Skype username of the user.
        """
        return pulumi.get(self, "skype_username")

    @skype_username.setter
    def skype_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "skype_username", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of tags to be associated with the user.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter
    def timezone(self) -> Optional[pulumi.Input[str]]:
        """
        Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        """
        return pulumi.get(self, "timezone")

    @timezone.setter
    def timezone(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "timezone", value)

    @property
    @pulumi.getter(name="userAddresses")
    def user_addresses(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['UserUserAddressArgs']]]]:
        """
        Address of the user.
        """
        return pulumi.get(self, "user_addresses")

    @user_addresses.setter
    def user_addresses(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['UserUserAddressArgs']]]]):
        pulumi.set(self, "user_addresses", value)

    @property
    @pulumi.getter(name="userDetails")
    def user_details(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Details about the user in form of key and list. of values.
        """
        return pulumi.get(self, "user_details")

    @user_details.setter
    def user_details(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "user_details", value)

    @property
    @pulumi.getter
    def username(self) -> Optional[pulumi.Input[str]]:
        """
        The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        """
        return pulumi.get(self, "username")

    @username.setter
    def username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "username", value)


class User(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 full_name: Optional[pulumi.Input[str]] = None,
                 locale: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 skype_username: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 user_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserUserAddressArgs']]]]] = None,
                 user_details: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Manages a User within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.User("test",
            username="user@domain.com",
            full_name="Test User",
            role="User",
            locale="en_US",
            timezone="America/New_York",
            tags=[
                "sre",
                "opsgenie",
            ],
            skype_username="skypename",
            user_addresses=[opsgenie.UserUserAddressArgs(
                country="Country",
                state="State",
                city="City",
                line="Line",
                zipcode="998877",
            )],
            user_details={
                "key1": "val1,val2",
                "key2": "val3,val4",
            })
        ```

        ## Import

        Users can be imported using the `user_id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/user:User user user_id`
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] full_name: The Full Name of the User.
        :param pulumi.Input[str] locale: Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        :param pulumi.Input[str] role: The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        :param pulumi.Input[str] skype_username: Skype username of the user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags to be associated with the user.
        :param pulumi.Input[str] timezone: Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserUserAddressArgs']]]] user_addresses: Address of the user.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] user_details: Details about the user in form of key and list. of values.
        :param pulumi.Input[str] username: The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: UserArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Manages a User within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.User("test",
            username="user@domain.com",
            full_name="Test User",
            role="User",
            locale="en_US",
            timezone="America/New_York",
            tags=[
                "sre",
                "opsgenie",
            ],
            skype_username="skypename",
            user_addresses=[opsgenie.UserUserAddressArgs(
                country="Country",
                state="State",
                city="City",
                line="Line",
                zipcode="998877",
            )],
            user_details={
                "key1": "val1,val2",
                "key2": "val3,val4",
            })
        ```

        ## Import

        Users can be imported using the `user_id`, e.g.

        ```sh
        $ pulumi import opsgenie:index/user:User user user_id`
        ```

        :param str resource_name: The name of the resource.
        :param UserArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(UserArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 full_name: Optional[pulumi.Input[str]] = None,
                 locale: Optional[pulumi.Input[str]] = None,
                 role: Optional[pulumi.Input[str]] = None,
                 skype_username: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 timezone: Optional[pulumi.Input[str]] = None,
                 user_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserUserAddressArgs']]]]] = None,
                 user_details: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 username: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = UserArgs.__new__(UserArgs)

            if full_name is None and not opts.urn:
                raise TypeError("Missing required property 'full_name'")
            __props__.__dict__["full_name"] = full_name
            __props__.__dict__["locale"] = locale
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__.__dict__["role"] = role
            __props__.__dict__["skype_username"] = skype_username
            __props__.__dict__["tags"] = tags
            __props__.__dict__["timezone"] = timezone
            __props__.__dict__["user_addresses"] = user_addresses
            __props__.__dict__["user_details"] = user_details
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__.__dict__["username"] = username
        super(User, __self__).__init__(
            'opsgenie:index/user:User',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            full_name: Optional[pulumi.Input[str]] = None,
            locale: Optional[pulumi.Input[str]] = None,
            role: Optional[pulumi.Input[str]] = None,
            skype_username: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            timezone: Optional[pulumi.Input[str]] = None,
            user_addresses: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserUserAddressArgs']]]]] = None,
            user_details: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            username: Optional[pulumi.Input[str]] = None) -> 'User':
        """
        Get an existing User resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] full_name: The Full Name of the User.
        :param pulumi.Input[str] locale: Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        :param pulumi.Input[str] role: The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        :param pulumi.Input[str] skype_username: Skype username of the user.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: A list of tags to be associated with the user.
        :param pulumi.Input[str] timezone: Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['UserUserAddressArgs']]]] user_addresses: Address of the user.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] user_details: Details about the user in form of key and list. of values.
        :param pulumi.Input[str] username: The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _UserState.__new__(_UserState)

        __props__.__dict__["full_name"] = full_name
        __props__.__dict__["locale"] = locale
        __props__.__dict__["role"] = role
        __props__.__dict__["skype_username"] = skype_username
        __props__.__dict__["tags"] = tags
        __props__.__dict__["timezone"] = timezone
        __props__.__dict__["user_addresses"] = user_addresses
        __props__.__dict__["user_details"] = user_details
        __props__.__dict__["username"] = username
        return User(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="fullName")
    def full_name(self) -> pulumi.Output[str]:
        """
        The Full Name of the User.
        """
        return pulumi.get(self, "full_name")

    @property
    @pulumi.getter
    def locale(self) -> pulumi.Output[Optional[str]]:
        """
        Location information for the user. Please look at [Supported Locale Ids](https://docs.opsgenie.com/docs/supported-locales) for available locales.
        """
        return pulumi.get(self, "locale")

    @property
    @pulumi.getter
    def role(self) -> pulumi.Output[str]:
        """
        The Role assigned to the User. Either a built-in such as 'Admin' or 'User' - or the name of a custom role.
        """
        return pulumi.get(self, "role")

    @property
    @pulumi.getter(name="skypeUsername")
    def skype_username(self) -> pulumi.Output[Optional[str]]:
        """
        Skype username of the user.
        """
        return pulumi.get(self, "skype_username")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        A list of tags to be associated with the user.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def timezone(self) -> pulumi.Output[Optional[str]]:
        """
        Timezone information of the user. Please look at [Supported Timezone Ids](https://docs.opsgenie.com/docs/supported-timezone-ids) for available timezones.
        """
        return pulumi.get(self, "timezone")

    @property
    @pulumi.getter(name="userAddresses")
    def user_addresses(self) -> pulumi.Output[Optional[Sequence['outputs.UserUserAddress']]]:
        """
        Address of the user.
        """
        return pulumi.get(self, "user_addresses")

    @property
    @pulumi.getter(name="userDetails")
    def user_details(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        """
        Details about the user in form of key and list. of values.
        """
        return pulumi.get(self, "user_details")

    @property
    @pulumi.getter
    def username(self) -> pulumi.Output[str]:
        """
        The email address associated with this user. Opsgenie defines that this must not be longer than 100 characters and must contain lowercase characters only.
        """
        return pulumi.get(self, "username")

