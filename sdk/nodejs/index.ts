// *** WARNING: this file was generated by pulumi-language-nodejs. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { AlertPolicyArgs, AlertPolicyState } from "./alertPolicy";
export type AlertPolicy = import("./alertPolicy").AlertPolicy;
export const AlertPolicy: typeof import("./alertPolicy").AlertPolicy = null as any;
utilities.lazyLoad(exports, ["AlertPolicy"], () => require("./alertPolicy"));

export { ApiIntegrationArgs, ApiIntegrationState } from "./apiIntegration";
export type ApiIntegration = import("./apiIntegration").ApiIntegration;
export const ApiIntegration: typeof import("./apiIntegration").ApiIntegration = null as any;
utilities.lazyLoad(exports, ["ApiIntegration"], () => require("./apiIntegration"));

export { CustomRoleArgs, CustomRoleState } from "./customRole";
export type CustomRole = import("./customRole").CustomRole;
export const CustomRole: typeof import("./customRole").CustomRole = null as any;
utilities.lazyLoad(exports, ["CustomRole"], () => require("./customRole"));

export { EmailIntegrationArgs, EmailIntegrationState } from "./emailIntegration";
export type EmailIntegration = import("./emailIntegration").EmailIntegration;
export const EmailIntegration: typeof import("./emailIntegration").EmailIntegration = null as any;
utilities.lazyLoad(exports, ["EmailIntegration"], () => require("./emailIntegration"));

export { EscalationArgs, EscalationState } from "./escalation";
export type Escalation = import("./escalation").Escalation;
export const Escalation: typeof import("./escalation").Escalation = null as any;
utilities.lazyLoad(exports, ["Escalation"], () => require("./escalation"));

export { GetEscalationArgs, GetEscalationResult, GetEscalationOutputArgs } from "./getEscalation";
export const getEscalation: typeof import("./getEscalation").getEscalation = null as any;
export const getEscalationOutput: typeof import("./getEscalation").getEscalationOutput = null as any;
utilities.lazyLoad(exports, ["getEscalation","getEscalationOutput"], () => require("./getEscalation"));

export { GetHeartbeatArgs, GetHeartbeatResult, GetHeartbeatOutputArgs } from "./getHeartbeat";
export const getHeartbeat: typeof import("./getHeartbeat").getHeartbeat = null as any;
export const getHeartbeatOutput: typeof import("./getHeartbeat").getHeartbeatOutput = null as any;
utilities.lazyLoad(exports, ["getHeartbeat","getHeartbeatOutput"], () => require("./getHeartbeat"));

export { GetScheduleArgs, GetScheduleResult, GetScheduleOutputArgs } from "./getSchedule";
export const getSchedule: typeof import("./getSchedule").getSchedule = null as any;
export const getScheduleOutput: typeof import("./getSchedule").getScheduleOutput = null as any;
utilities.lazyLoad(exports, ["getSchedule","getScheduleOutput"], () => require("./getSchedule"));

export { GetServiceArgs, GetServiceResult, GetServiceOutputArgs } from "./getService";
export const getService: typeof import("./getService").getService = null as any;
export const getServiceOutput: typeof import("./getService").getServiceOutput = null as any;
utilities.lazyLoad(exports, ["getService","getServiceOutput"], () => require("./getService"));

export { GetTeamArgs, GetTeamResult, GetTeamOutputArgs } from "./getTeam";
export const getTeam: typeof import("./getTeam").getTeam = null as any;
export const getTeamOutput: typeof import("./getTeam").getTeamOutput = null as any;
utilities.lazyLoad(exports, ["getTeam","getTeamOutput"], () => require("./getTeam"));

export { GetUserArgs, GetUserResult, GetUserOutputArgs } from "./getUser";
export const getUser: typeof import("./getUser").getUser = null as any;
export const getUserOutput: typeof import("./getUser").getUserOutput = null as any;
utilities.lazyLoad(exports, ["getUser","getUserOutput"], () => require("./getUser"));

export { HeartbeatArgs, HeartbeatState } from "./heartbeat";
export type Heartbeat = import("./heartbeat").Heartbeat;
export const Heartbeat: typeof import("./heartbeat").Heartbeat = null as any;
utilities.lazyLoad(exports, ["Heartbeat"], () => require("./heartbeat"));

export { IncidentTemplateArgs, IncidentTemplateState } from "./incidentTemplate";
export type IncidentTemplate = import("./incidentTemplate").IncidentTemplate;
export const IncidentTemplate: typeof import("./incidentTemplate").IncidentTemplate = null as any;
utilities.lazyLoad(exports, ["IncidentTemplate"], () => require("./incidentTemplate"));

export { IntegrationActionArgs, IntegrationActionState } from "./integrationAction";
export type IntegrationAction = import("./integrationAction").IntegrationAction;
export const IntegrationAction: typeof import("./integrationAction").IntegrationAction = null as any;
utilities.lazyLoad(exports, ["IntegrationAction"], () => require("./integrationAction"));

export { MaintenanceArgs, MaintenanceState } from "./maintenance";
export type Maintenance = import("./maintenance").Maintenance;
export const Maintenance: typeof import("./maintenance").Maintenance = null as any;
utilities.lazyLoad(exports, ["Maintenance"], () => require("./maintenance"));

export { NotificationPolicyArgs, NotificationPolicyState } from "./notificationPolicy";
export type NotificationPolicy = import("./notificationPolicy").NotificationPolicy;
export const NotificationPolicy: typeof import("./notificationPolicy").NotificationPolicy = null as any;
utilities.lazyLoad(exports, ["NotificationPolicy"], () => require("./notificationPolicy"));

export { NotificationRuleArgs, NotificationRuleState } from "./notificationRule";
export type NotificationRule = import("./notificationRule").NotificationRule;
export const NotificationRule: typeof import("./notificationRule").NotificationRule = null as any;
utilities.lazyLoad(exports, ["NotificationRule"], () => require("./notificationRule"));

export * from "./provider";
import { Provider } from "./provider";

export { ScheduleArgs, ScheduleState } from "./schedule";
export type Schedule = import("./schedule").Schedule;
export const Schedule: typeof import("./schedule").Schedule = null as any;
utilities.lazyLoad(exports, ["Schedule"], () => require("./schedule"));

export { ScheduleRotationArgs, ScheduleRotationState } from "./scheduleRotation";
export type ScheduleRotation = import("./scheduleRotation").ScheduleRotation;
export const ScheduleRotation: typeof import("./scheduleRotation").ScheduleRotation = null as any;
utilities.lazyLoad(exports, ["ScheduleRotation"], () => require("./scheduleRotation"));

export { ServiceArgs, ServiceState } from "./service";
export type Service = import("./service").Service;
export const Service: typeof import("./service").Service = null as any;
utilities.lazyLoad(exports, ["Service"], () => require("./service"));

export { ServiceIncidentRuleArgs, ServiceIncidentRuleState } from "./serviceIncidentRule";
export type ServiceIncidentRule = import("./serviceIncidentRule").ServiceIncidentRule;
export const ServiceIncidentRule: typeof import("./serviceIncidentRule").ServiceIncidentRule = null as any;
utilities.lazyLoad(exports, ["ServiceIncidentRule"], () => require("./serviceIncidentRule"));

export { TeamArgs, TeamState } from "./team";
export type Team = import("./team").Team;
export const Team: typeof import("./team").Team = null as any;
utilities.lazyLoad(exports, ["Team"], () => require("./team"));

export { TeamRoutingRuleArgs, TeamRoutingRuleState } from "./teamRoutingRule";
export type TeamRoutingRule = import("./teamRoutingRule").TeamRoutingRule;
export const TeamRoutingRule: typeof import("./teamRoutingRule").TeamRoutingRule = null as any;
utilities.lazyLoad(exports, ["TeamRoutingRule"], () => require("./teamRoutingRule"));

export { UserArgs, UserState } from "./user";
export type User = import("./user").User;
export const User: typeof import("./user").User = null as any;
utilities.lazyLoad(exports, ["User"], () => require("./user"));

export { UserContactArgs, UserContactState } from "./userContact";
export type UserContact = import("./userContact").UserContact;
export const UserContact: typeof import("./userContact").UserContact = null as any;
utilities.lazyLoad(exports, ["UserContact"], () => require("./userContact"));


// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "opsgenie:index/alertPolicy:AlertPolicy":
                return new AlertPolicy(name, <any>undefined, { urn })
            case "opsgenie:index/apiIntegration:ApiIntegration":
                return new ApiIntegration(name, <any>undefined, { urn })
            case "opsgenie:index/customRole:CustomRole":
                return new CustomRole(name, <any>undefined, { urn })
            case "opsgenie:index/emailIntegration:EmailIntegration":
                return new EmailIntegration(name, <any>undefined, { urn })
            case "opsgenie:index/escalation:Escalation":
                return new Escalation(name, <any>undefined, { urn })
            case "opsgenie:index/heartbeat:Heartbeat":
                return new Heartbeat(name, <any>undefined, { urn })
            case "opsgenie:index/incidentTemplate:IncidentTemplate":
                return new IncidentTemplate(name, <any>undefined, { urn })
            case "opsgenie:index/integrationAction:IntegrationAction":
                return new IntegrationAction(name, <any>undefined, { urn })
            case "opsgenie:index/maintenance:Maintenance":
                return new Maintenance(name, <any>undefined, { urn })
            case "opsgenie:index/notificationPolicy:NotificationPolicy":
                return new NotificationPolicy(name, <any>undefined, { urn })
            case "opsgenie:index/notificationRule:NotificationRule":
                return new NotificationRule(name, <any>undefined, { urn })
            case "opsgenie:index/schedule:Schedule":
                return new Schedule(name, <any>undefined, { urn })
            case "opsgenie:index/scheduleRotation:ScheduleRotation":
                return new ScheduleRotation(name, <any>undefined, { urn })
            case "opsgenie:index/service:Service":
                return new Service(name, <any>undefined, { urn })
            case "opsgenie:index/serviceIncidentRule:ServiceIncidentRule":
                return new ServiceIncidentRule(name, <any>undefined, { urn })
            case "opsgenie:index/team:Team":
                return new Team(name, <any>undefined, { urn })
            case "opsgenie:index/teamRoutingRule:TeamRoutingRule":
                return new TeamRoutingRule(name, <any>undefined, { urn })
            case "opsgenie:index/user:User":
                return new User(name, <any>undefined, { urn })
            case "opsgenie:index/userContact:UserContact":
                return new UserContact(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("opsgenie", "index/alertPolicy", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/apiIntegration", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/customRole", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/emailIntegration", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/escalation", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/heartbeat", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/incidentTemplate", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/integrationAction", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/maintenance", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/notificationPolicy", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/notificationRule", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/schedule", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/scheduleRotation", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/service", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/serviceIncidentRule", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/team", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/teamRoutingRule", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/user", _module)
pulumi.runtime.registerResourceModule("opsgenie", "index/userContact", _module)
pulumi.runtime.registerResourcePackage("opsgenie", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:opsgenie") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
