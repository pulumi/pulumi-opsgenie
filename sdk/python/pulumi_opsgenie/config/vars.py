# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('opsgenie')


class _ExportableConfig(types.ModuleType):
    @property
    def api_key(self) -> Optional[str]:
        return __config__.get('apiKey')

    @property
    def api_url(self) -> Optional[str]:
        return __config__.get('apiUrl') or _utilities.get_env('OPSGENIE_API_URL')

