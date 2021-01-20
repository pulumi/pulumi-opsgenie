// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface AlertPolicyFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.AlertPolicyFilterCondition>[]>;
    type?: pulumi.Input<string>;
}

export interface AlertPolicyFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    order?: pulumi.Input<number>;
}

export interface AlertPolicyResponder {
    id: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    type: pulumi.Input<string>;
    username?: pulumi.Input<string>;
}

export interface AlertPolicyTimeRestriction {
    restrictions?: pulumi.Input<pulumi.Input<inputs.AlertPolicyTimeRestrictionRestriction>[]>;
    type: pulumi.Input<string>;
}

export interface AlertPolicyTimeRestrictionRestriction {
    endDay: pulumi.Input<string>;
    endHour: pulumi.Input<number>;
    endMin: pulumi.Input<number>;
    startDay: pulumi.Input<string>;
    startHour: pulumi.Input<number>;
    startMin: pulumi.Input<number>;
}

export interface ApiIntegrationResponder {
    id?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

export interface EmailIntegrationResponder {
    id?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

export interface EscalationRepeat {
    closeAlertAfterAll?: pulumi.Input<boolean>;
    count?: pulumi.Input<number>;
    resetRecipientStates?: pulumi.Input<boolean>;
    waitInterval?: pulumi.Input<number>;
}

export interface EscalationRule {
    condition: pulumi.Input<string>;
    delay: pulumi.Input<number>;
    notifyType: pulumi.Input<string>;
    recipients: pulumi.Input<pulumi.Input<inputs.EscalationRuleRecipient>[]>;
}

export interface EscalationRuleRecipient {
    id?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

export interface GetEscalationRepeat {
    closeAlertAfterAll?: boolean;
    count?: number;
    resetRecipientStates?: boolean;
    waitInterval?: number;
}

export interface GetEscalationRule {
    condition: string;
    delay: number;
    notifyType: string;
    recipients: inputs.GetEscalationRuleRecipient[];
}

export interface GetEscalationRuleRecipient {
    id?: string;
    type?: string;
}

export interface GetTeamMember {
    id?: string;
    role?: string;
}

export interface IncidentTemplateStakeholderProperty {
    description?: pulumi.Input<string>;
    enable?: pulumi.Input<boolean>;
    message: pulumi.Input<string>;
}

export interface IntegrationActionAcknowledge {
    alias?: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAcknowledgeFilter>[]>;
    name: pulumi.Input<string>;
    note?: pulumi.Input<string>;
    order?: pulumi.Input<number>;
    type?: pulumi.Input<string>;
    user?: pulumi.Input<string>;
}

export interface IntegrationActionAcknowledgeFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAcknowledgeFilterCondition>[]>;
    type: pulumi.Input<string>;
}

export interface IntegrationActionAcknowledgeFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    order?: pulumi.Input<number>;
}

export interface IntegrationActionAddNote {
    alias?: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAddNoteFilter>[]>;
    name: pulumi.Input<string>;
    note?: pulumi.Input<string>;
    order?: pulumi.Input<number>;
    type?: pulumi.Input<string>;
    user?: pulumi.Input<string>;
}

export interface IntegrationActionAddNoteFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAddNoteFilterCondition>[]>;
    type: pulumi.Input<string>;
}

export interface IntegrationActionAddNoteFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    order?: pulumi.Input<number>;
}

export interface IntegrationActionClose {
    alias?: pulumi.Input<string>;
    filters?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCloseFilter>[]>;
    name: pulumi.Input<string>;
    note?: pulumi.Input<string>;
    order?: pulumi.Input<number>;
    type?: pulumi.Input<string>;
    user?: pulumi.Input<string>;
}

export interface IntegrationActionCloseFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCloseFilterCondition>[]>;
    type: pulumi.Input<string>;
}

export interface IntegrationActionCloseFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    order?: pulumi.Input<number>;
}

export interface IntegrationActionCreate {
    alertActions?: pulumi.Input<pulumi.Input<string>[]>;
    alias?: pulumi.Input<string>;
    appendAttachments?: pulumi.Input<boolean>;
    description?: pulumi.Input<string>;
    entity?: pulumi.Input<string>;
    extraProperties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    filters?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCreateFilter>[]>;
    ignoreAlertActionsFromPayload?: pulumi.Input<boolean>;
    ignoreExtraPropertiesFromPayload?: pulumi.Input<boolean>;
    ignoreRespondersFromPayload?: pulumi.Input<boolean>;
    ignoreTagsFromPayload?: pulumi.Input<boolean>;
    ignoreTeamsFromPayload?: pulumi.Input<boolean>;
    message?: pulumi.Input<string>;
    name: pulumi.Input<string>;
    note?: pulumi.Input<string>;
    order?: pulumi.Input<number>;
    priority?: pulumi.Input<string>;
    responders?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCreateResponder>[]>;
    source?: pulumi.Input<string>;
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    type?: pulumi.Input<string>;
    user?: pulumi.Input<string>;
}

export interface IntegrationActionCreateFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCreateFilterCondition>[]>;
    type: pulumi.Input<string>;
}

export interface IntegrationActionCreateFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    order?: pulumi.Input<number>;
}

export interface IntegrationActionCreateResponder {
    id: pulumi.Input<string>;
    type: pulumi.Input<string>;
}

export interface MaintenanceRule {
    entities: pulumi.Input<pulumi.Input<inputs.MaintenanceRuleEntity>[]>;
    state?: pulumi.Input<string>;
}

export interface MaintenanceRuleEntity {
    id?: pulumi.Input<string>;
    type?: pulumi.Input<string>;
}

export interface MaintenanceTime {
    endDate?: pulumi.Input<string>;
    startDate?: pulumi.Input<string>;
    type: pulumi.Input<string>;
}

export interface NotificationPolicyAutoCloseAction {
    durations: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoCloseActionDuration>[]>;
}

export interface NotificationPolicyAutoCloseActionDuration {
    timeAmount: pulumi.Input<number>;
    timeUnit?: pulumi.Input<string>;
}

export interface NotificationPolicyAutoRestartAction {
    durations: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoRestartActionDuration>[]>;
    maxRepeatCount: pulumi.Input<number>;
}

export interface NotificationPolicyAutoRestartActionDuration {
    timeAmount: pulumi.Input<number>;
    timeUnit?: pulumi.Input<string>;
}

export interface NotificationPolicyDeDuplicationAction {
    count: pulumi.Input<number>;
    deDuplicationActionType: pulumi.Input<string>;
    durations?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDeDuplicationActionDuration>[]>;
}

export interface NotificationPolicyDeDuplicationActionDuration {
    timeAmount: pulumi.Input<number>;
    timeUnit?: pulumi.Input<string>;
}

export interface NotificationPolicyDelayAction {
    delayOption: pulumi.Input<string>;
    durations?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDelayActionDuration>[]>;
    untilHour?: pulumi.Input<number>;
    untilMinute?: pulumi.Input<number>;
}

export interface NotificationPolicyDelayActionDuration {
    timeAmount: pulumi.Input<number>;
    timeUnit?: pulumi.Input<string>;
}

export interface NotificationPolicyFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyFilterCondition>[]>;
    type?: pulumi.Input<string>;
}

export interface NotificationPolicyFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    order?: pulumi.Input<number>;
}

export interface NotificationPolicyTimeRestriction {
    restrictions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyTimeRestrictionRestriction>[]>;
    type: pulumi.Input<string>;
}

export interface NotificationPolicyTimeRestrictionRestriction {
    endDay: pulumi.Input<string>;
    endHour: pulumi.Input<number>;
    endMin: pulumi.Input<number>;
    startDay: pulumi.Input<string>;
    startHour: pulumi.Input<number>;
    startMin: pulumi.Input<number>;
}

export interface NotificationRuleCriteria {
    conditions?: pulumi.Input<pulumi.Input<inputs.NotificationRuleCriteriaCondition>[]>;
    type: pulumi.Input<string>;
}

export interface NotificationRuleCriteriaCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    order?: pulumi.Input<number>;
}

export interface NotificationRuleRepeat {
    enabled?: pulumi.Input<boolean>;
    loopAfter: pulumi.Input<number>;
}

export interface NotificationRuleSchedule {
    name?: pulumi.Input<string>;
    type: pulumi.Input<string>;
}

export interface NotificationRuleStep {
    contacts: pulumi.Input<pulumi.Input<inputs.NotificationRuleStepContact>[]>;
    enabled?: pulumi.Input<boolean>;
    sendAfter?: pulumi.Input<number>;
}

export interface NotificationRuleStepContact {
    method: pulumi.Input<string>;
    to: pulumi.Input<string>;
}

export interface NotificationRuleTimeRestriction {
    restrictions?: pulumi.Input<pulumi.Input<inputs.NotificationRuleTimeRestrictionRestriction>[]>;
    type: pulumi.Input<string>;
}

export interface NotificationRuleTimeRestrictionRestriction {
    endDay: pulumi.Input<string>;
    endHour: pulumi.Input<number>;
    endMin: pulumi.Input<number>;
    startDay: pulumi.Input<string>;
    startHour: pulumi.Input<number>;
    startMin: pulumi.Input<number>;
}

export interface ScheduleRotationParticipant {
    id?: pulumi.Input<string>;
    type: pulumi.Input<string>;
}

export interface ScheduleRotationTimeRestriction {
    restrictions?: pulumi.Input<pulumi.Input<inputs.ScheduleRotationTimeRestrictionRestriction>[]>;
    type: pulumi.Input<string>;
}

export interface ScheduleRotationTimeRestrictionRestriction {
    endDay: pulumi.Input<string>;
    endHour: pulumi.Input<number>;
    endMin: pulumi.Input<number>;
    startDay: pulumi.Input<string>;
    startHour: pulumi.Input<number>;
    startMin: pulumi.Input<number>;
}

export interface ServiceIncidentRuleIncidentRule {
    conditionMatchType?: pulumi.Input<string>;
    conditions?: pulumi.Input<pulumi.Input<inputs.ServiceIncidentRuleIncidentRuleCondition>[]>;
    incidentProperties: pulumi.Input<pulumi.Input<inputs.ServiceIncidentRuleIncidentRuleIncidentProperty>[]>;
}

export interface ServiceIncidentRuleIncidentRuleCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
}

export interface ServiceIncidentRuleIncidentRuleIncidentProperty {
    description?: pulumi.Input<string>;
    details?: pulumi.Input<pulumi.Input<string>[]>;
    message: pulumi.Input<string>;
    priority: pulumi.Input<string>;
    stakeholderProperties: pulumi.Input<pulumi.Input<inputs.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty>[]>;
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty {
    description?: pulumi.Input<string>;
    enable?: pulumi.Input<boolean>;
    message: pulumi.Input<string>;
}

export interface TeamMember {
    id: pulumi.Input<string>;
    role?: pulumi.Input<string>;
}

export interface TeamRoutingRuleCriteria {
    conditions?: pulumi.Input<pulumi.Input<inputs.TeamRoutingRuleCriteriaCondition>[]>;
    type: pulumi.Input<string>;
}

export interface TeamRoutingRuleCriteriaCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    order?: pulumi.Input<number>;
}

export interface TeamRoutingRuleNotify {
    id?: pulumi.Input<string>;
    name?: pulumi.Input<string>;
    type: pulumi.Input<string>;
}

export interface TeamRoutingRuleTimeRestriction {
    restrictions?: pulumi.Input<pulumi.Input<inputs.TeamRoutingRuleTimeRestrictionRestriction>[]>;
    type: pulumi.Input<string>;
}

export interface TeamRoutingRuleTimeRestrictionRestriction {
    endDay: pulumi.Input<string>;
    endHour: pulumi.Input<number>;
    endMin: pulumi.Input<number>;
    startDay: pulumi.Input<string>;
    startHour: pulumi.Input<number>;
    startMin: pulumi.Input<number>;
}

export interface UserUserAddress {
    city: pulumi.Input<string>;
    country: pulumi.Input<string>;
    line: pulumi.Input<string>;
    state: pulumi.Input<string>;
    zipcode: pulumi.Input<string>;
}