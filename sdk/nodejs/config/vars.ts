// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

let __config = new pulumi.Config("opsgenie");

export let apiKey: string | undefined = __config.get("apiKey") || utilities.getEnv("OPSGENIE_API_KEY");
export let apiUrl: string | undefined = __config.get("apiUrl") || utilities.getEnv("OPSGENIE_API_URL");
