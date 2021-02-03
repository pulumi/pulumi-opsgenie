[![Actions Status](https://github.com/pulumi/pulumi-opsgenie/workflows/master/badge.svg)](https://github.com/pulumi/pulumi-opsgenie/actions)
[![Slack](http://www.pulumi.com/images/docs/badges/slack.svg)](https://slack.pulumi.com)
[![NPM version](https://badge.fury.io/js/%40pulumi%2Fopsgenie.svg)](https://npmjs.com/package/@pulumi/opsgenie)
[![NuGet version](https://badge.fury.io/nu/pulumi.opsgenie.svg)](https://badge.fury.io/nu/pulumi.opsgenie)
[![Python version](https://badge.fury.io/py/pulumi-opsgenie.svg)](https://pypi.org/project/pulumi-opsgenie)
[![PkgGoDev](https://pkg.go.dev/badge/github.com/pulumi/pulumi-opsgenie/sdk/go)](https://pkg.go.dev/github.com/pulumi/pulumi-opsgenie/sdk/go)
[![License](https://img.shields.io/npm/l/%40pulumi%2Fpulumi.svg)](https://github.com/pulumi/pulumi-opsgenie/blob/master/LICENSE)

# Opsgenie Resource Provider

The OpsGenie resource provider for Pulumi lets you manage opsgenie resources in your cloud programs. To use this package, please install the Pulumi CLI first.

## Installing

This package is available in many languages in the standard packaging formats.

### Node.js (Java/TypeScript)

To use from JavaScript or TypeScript in Node.js, install using either `npm`:

    $ npm install @pulumi/opsgenie

or `yarn`:

    $ yarn add @pulumi/opsgenie

### Python

To use from Python, install using `pip`:

    $ pip install pulumi_opsgenie

### Go

To use from Go, use `go get` to grab the latest version of the library

    $ go get github.com/pulumi/pulumi-opsgenie/sdk/go/...

### .NET

To use from .NET, install using `dotnet add package`:

    $ dotnet add package Pulumi.Opsgenie

## Configuration

The following configuration points are available for the `opsgenie` provider:

- `opsgenie:api_key` (Required) - the API key for `opsgenie`. Can also be provided with `OPSGENIE_API_KEY`.
- `opsgenie:api_url` (Optional) - the API url for `opsgenie`. Can also be provided with `OPSGENIE_API_URL`. Defaults to `api.opsgenie.com`.

## Reference

For detailed reference documentation, please visit [the API docs][1].


[1]: https://www.pulumi.com/docs/reference/pkg/opsgenie/
