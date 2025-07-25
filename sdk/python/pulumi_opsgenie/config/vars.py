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
from .. import _utilities

import types

__config__ = pulumi.Config('opsgenie')


class _ExportableConfig(types.ModuleType):
    @_builtins.property
    def api_key(self) -> Optional[str]:
        return __config__.get('apiKey')

    @_builtins.property
    def api_retry_count(self) -> Optional[int]:
        return __config__.get_int('apiRetryCount')

    @_builtins.property
    def api_retry_wait_max(self) -> Optional[int]:
        return __config__.get_int('apiRetryWaitMax')

    @_builtins.property
    def api_retry_wait_min(self) -> Optional[int]:
        return __config__.get_int('apiRetryWaitMin')

    @_builtins.property
    def api_url(self) -> Optional[str]:
        return __config__.get('apiUrl') or _utilities.get_env('OPSGENIE_API_URL')

