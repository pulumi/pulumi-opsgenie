// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package opsgenie

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// Manages existing heartbeat within Opsgenie.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie"
// 	"github.com/pulumi/pulumi-opsgenie/sdk/go/opsgenie/"
// 	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := opsgenie.LookupHeartbeat(ctx, &opsgenie.LookupHeartbeatArgs{
// 			Name: "genieheartbeat-existing",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupHeartbeat(ctx *pulumi.Context, args *LookupHeartbeatArgs, opts ...pulumi.InvokeOption) (*LookupHeartbeatResult, error) {
	var rv LookupHeartbeatResult
	err := ctx.Invoke("opsgenie:index/getHeartbeat:getHeartbeat", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getHeartbeat.
type LookupHeartbeatArgs struct {
	// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
	AlertMessage *string `pulumi:"alertMessage"`
	// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
	AlertPriority *string `pulumi:"alertPriority"`
	// Specifies the alert tags for heartbeat expiration alert.
	AlertTags []string `pulumi:"alertTags"`
	// An optional description of the heartbeat
	Description *string `pulumi:"description"`
	// Enable/disable heartbeat monitoring.
	Enabled *bool `pulumi:"enabled"`
	// Specifies how often a heartbeat message should be expected.
	Interval *int `pulumi:"interval"`
	// Interval specified as minutes, hours or days.
	IntervalUnit *string `pulumi:"intervalUnit"`
	// Name of the heartbeat
	Name string `pulumi:"name"`
	// Owner team of the heartbeat.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
}

// A collection of values returned by getHeartbeat.
type LookupHeartbeatResult struct {
	// Specifies the alert message for heartbeat expiration alert. If this is not provided, default alert message is "HeartbeatName is expired".
	AlertMessage *string `pulumi:"alertMessage"`
	// Specifies the alert priority for heartbeat expiration alert. If this is not provided, default priority is P3.
	AlertPriority *string `pulumi:"alertPriority"`
	// Specifies the alert tags for heartbeat expiration alert.
	AlertTags []string `pulumi:"alertTags"`
	// An optional description of the heartbeat
	Description *string `pulumi:"description"`
	// Enable/disable heartbeat monitoring.
	Enabled *bool `pulumi:"enabled"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Specifies how often a heartbeat message should be expected.
	Interval *int `pulumi:"interval"`
	// Interval specified as minutes, hours or days.
	IntervalUnit *string `pulumi:"intervalUnit"`
	Name         string  `pulumi:"name"`
	// Owner team of the heartbeat.
	OwnerTeamId *string `pulumi:"ownerTeamId"`
}
