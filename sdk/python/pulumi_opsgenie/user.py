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

__all__ = ['User']


class User(pulumi.CustomResource):
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
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Manages a User within Opsgenie.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_opsgenie as opsgenie

        test = opsgenie.User("test",
            full_name="Test User",
            locale="en_US",
            role="User",
            skype_username="skypename",
            tags=[
                "sre",
                "opsgenie",
            ],
            timezone="America/New_York",
            user_addresses=[opsgenie.UserUserAddressArgs(
                city="City",
                country="Country",
                line="Line",
                state="State",
                zipcode="998877",
            )],
            user_details={
                "key1": "val1,val2",
                "key2": "val3,val4",
            },
            username="user@domain.com")
        ```

        ## Import

        Users can be imported using the `id`, e.g.

        ```sh
         $ pulumi import opsgenie:index/user:User user da4faf16-5546-41e4-8330-4d0002b74048s`
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

            if full_name is None and not opts.urn:
                raise TypeError("Missing required property 'full_name'")
            __props__['full_name'] = full_name
            __props__['locale'] = locale
            if role is None and not opts.urn:
                raise TypeError("Missing required property 'role'")
            __props__['role'] = role
            __props__['skype_username'] = skype_username
            __props__['tags'] = tags
            __props__['timezone'] = timezone
            __props__['user_addresses'] = user_addresses
            __props__['user_details'] = user_details
            if username is None and not opts.urn:
                raise TypeError("Missing required property 'username'")
            __props__['username'] = username
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

        __props__ = dict()

        __props__["full_name"] = full_name
        __props__["locale"] = locale
        __props__["role"] = role
        __props__["skype_username"] = skype_username
        __props__["tags"] = tags
        __props__["timezone"] = timezone
        __props__["user_addresses"] = user_addresses
        __props__["user_details"] = user_details
        __props__["username"] = username
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

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
