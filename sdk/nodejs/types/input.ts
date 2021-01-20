// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

export interface AlertPolicyFilter {
    /**
     * Conditions applied to filter. This is a block, structure is documented below.
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.AlertPolicyFilterCondition>[]>;
    /**
     * Type of responder. Acceptable values are: user or team
     */
    type?: pulumi.Input<string>;
}

export interface AlertPolicyFilterCondition {
    /**
     * User defined value that will be compared with alert field according to the operation. Default: empty string
     */
    expectedValue?: pulumi.Input<string>;
    /**
     * Specifies which alert field will be used in condition. Possible values are "message", "alias", "description", "source", "entity", "tags", "actions", "details", "extra-properties", "recipients", "teams", "priority"
     */
    field: pulumi.Input<string>;
    /**
     * If `field` is set as extra-properties, key could be used for key-value pair
     */
    key?: pulumi.Input<string>;
    /**
     * Indicates behaviour of the given operation. Default: false
     */
    not?: pulumi.Input<boolean>;
    /**
     * It is the operation that will be executed for the given field and key. Possible operations are "matches", "contains", "starts-with", "ends-with", "equals", "contains-key", "contains-value", "greater-than", "less-than", "is-empty", "equals-ignore-whitespace".
     */
    operation: pulumi.Input<string>;
    /**
     * Order of the condition in conditions list
     */
    order?: pulumi.Input<number>;
}

export interface AlertPolicyResponder {
    /**
     * ID of the responder
     */
    id: pulumi.Input<string>;
    /**
     * Name of the responder
     */
    name?: pulumi.Input<string>;
    /**
     * Type of responder. Acceptable values are: user or team
     */
    type: pulumi.Input<string>;
    /**
     * Username of the responder
     */
    username?: pulumi.Input<string>;
}

export interface AlertPolicyTimeRestriction {
    /**
     * List of days and hours definitions for field type = "weekday-and-time-of-day". This is a block, structure is documented below.
     */
    restrictions?: pulumi.Input<pulumi.Input<inputs.AlertPolicyTimeRestrictionRestriction>[]>;
    /**
     * Type of responder. Acceptable values are: user or team
     */
    type: pulumi.Input<string>;
}

export interface AlertPolicyTimeRestrictionRestriction {
    /**
     * Ending day of restriction (eg. "wednesday)
     */
    endDay: pulumi.Input<string>;
    /**
     * Ending hour of restriction.
     */
    endHour: pulumi.Input<number>;
    /**
     * Ending minute of restriction on defined `endHour`
     */
    endMin: pulumi.Input<number>;
    /**
     * Starting day of restriction (eg. "monday")
     */
    startDay: pulumi.Input<string>;
    /**
     * Starting hour of restriction.
     */
    startHour: pulumi.Input<number>;
    /**
     * Staring minute of restriction on defined `startHour`
     */
    startMin: pulumi.Input<number>;
}

export interface ApiIntegrationResponder {
    /**
     * The id of the responder.
     */
    id?: pulumi.Input<string>;
    /**
     * The responder type.
     */
    type?: pulumi.Input<string>;
}

export interface EmailIntegrationResponder {
    /**
     * The id of the responder.
     */
    id?: pulumi.Input<string>;
    /**
     * The responder type.
     */
    type?: pulumi.Input<string>;
}

export interface EscalationRepeat {
    closeAlertAfterAll?: pulumi.Input<boolean>;
    count?: pulumi.Input<number>;
    resetRecipientStates?: pulumi.Input<boolean>;
    waitInterval?: pulumi.Input<number>;
}

export interface EscalationRule {
    /**
     * The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: if-not-acked and if-not-closed. If not given, if-not-acked is used.
     */
    condition: pulumi.Input<string>;
    /**
     * Time delay of the escalation rule. This parameter takes an object that consists timeAmount field that takes time amount in minutes.
     */
    delay: pulumi.Input<number>;
    /**
     * Recipient calculation logic for schedules. Possible values are:
     * ```typescript
     * import * as pulumi from "@pulumi/pulumi";
     * ```
     */
    notifyType: pulumi.Input<string>;
    /**
     * Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: user, schedule, team.
     */
    recipients: pulumi.Input<pulumi.Input<inputs.EscalationRuleRecipient>[]>;
}

export interface EscalationRuleRecipient {
    /**
     * The ID of the Opsgenie Escalation.
     */
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
    /**
     * The ID of the Opsgenie Escalation.
     */
    id?: string;
    type?: string;
}

export interface GetTeamMember {
    /**
     * The ID of the Opsgenie Team.
     */
    id?: string;
    role?: string;
}

export interface IncidentTemplateStakeholderProperty {
    /**
     * Description that is generally used to provide a detailed information about the alert. This field must not be longer than 15000 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * Option to enable stakeholder notifications.Default value is true.
     */
    enable?: pulumi.Input<boolean>;
    /**
     * Message that is to be passed to audience that is generally used to provide a content information about the alert.
     */
    message: pulumi.Input<string>;
}

export interface IntegrationActionAcknowledge {
    /**
     * An identifier that is used for alert deduplication. Defaults to `{{alias}}`.
     */
    alias?: pulumi.Input<string>;
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAcknowledgeFilter>[]>;
    /**
     * Name of the integration action.
     */
    name: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed.
     */
    note?: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type?: pulumi.Input<string>;
    /**
     * Owner of the execution for integration action.
     */
    user?: pulumi.Input<string>;
}

export interface IntegrationActionAcknowledgeFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAcknowledgeFilterCondition>[]>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type: pulumi.Input<string>;
}

export interface IntegrationActionAcknowledgeFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
}

export interface IntegrationActionAddNote {
    /**
     * An identifier that is used for alert deduplication. Defaults to `{{alias}}`.
     */
    alias?: pulumi.Input<string>;
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAddNoteFilter>[]>;
    /**
     * Name of the integration action.
     */
    name: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed.
     */
    note?: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type?: pulumi.Input<string>;
    /**
     * Owner of the execution for integration action.
     */
    user?: pulumi.Input<string>;
}

export interface IntegrationActionAddNoteFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.IntegrationActionAddNoteFilterCondition>[]>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type: pulumi.Input<string>;
}

export interface IntegrationActionAddNoteFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
}

export interface IntegrationActionClose {
    /**
     * An identifier that is used for alert deduplication. Defaults to `{{alias}}`.
     */
    alias?: pulumi.Input<string>;
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCloseFilter>[]>;
    /**
     * Name of the integration action.
     */
    name: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed.
     */
    note?: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type?: pulumi.Input<string>;
    /**
     * Owner of the execution for integration action.
     */
    user?: pulumi.Input<string>;
}

export interface IntegrationActionCloseFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCloseFilterCondition>[]>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type: pulumi.Input<string>;
}

export interface IntegrationActionCloseFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
}

export interface IntegrationActionCreate {
    alertActions?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * An identifier that is used for alert deduplication. Defaults to `{{alias}}`.
     */
    alias?: pulumi.Input<string>;
    appendAttachments?: pulumi.Input<boolean>;
    /**
     * Custom alert priority. e.g. {{message.substring(0,2)}}
     */
    customPriority?: pulumi.Input<string>;
    /**
     * Detailed description of the alert, anything that may not have fit in the `message` field.
     */
    description?: pulumi.Input<string>;
    /**
     * The entity the alert is related to.
     */
    entity?: pulumi.Input<string>;
    /**
     * Set of user defined properties specified as a map.
     */
    extraProperties?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCreateFilter>[]>;
    ignoreAlertActionsFromPayload?: pulumi.Input<boolean>;
    ignoreExtraPropertiesFromPayload?: pulumi.Input<boolean>;
    /**
     * If enabled, the integration will ignore responders sent in request payloads.
     */
    ignoreRespondersFromPayload?: pulumi.Input<boolean>;
    ignoreTagsFromPayload?: pulumi.Input<boolean>;
    /**
     * If enabled, the integration will ignore teams sent in request payloads.
     */
    ignoreTeamsFromPayload?: pulumi.Input<boolean>;
    /**
     * Alert text limited to 130 characters.
     */
    message?: pulumi.Input<string>;
    /**
     * Name of the integration action.
     */
    name: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed.
     */
    note?: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
    /**
     * Alert priority.
     */
    priority?: pulumi.Input<string>;
    /**
     * User, schedule, teams or escalation names to calculate which users will receive notifications of the alert.
     */
    responders?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCreateResponder>[]>;
    /**
     * User defined field to specify source of action.
     */
    source?: pulumi.Input<string>;
    /**
     * Comma separated list of labels to be attached to the alert.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type?: pulumi.Input<string>;
    /**
     * Owner of the execution for integration action.
     */
    user?: pulumi.Input<string>;
}

export interface IntegrationActionCreateFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.IntegrationActionCreateFilterCondition>[]>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type: pulumi.Input<string>;
}

export interface IntegrationActionCreateFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
}

export interface IntegrationActionCreateResponder {
    /**
     * The id of the responder.
     */
    id: pulumi.Input<string>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type: pulumi.Input<string>;
}

export interface IntegrationActionIgnore {
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: pulumi.Input<pulumi.Input<inputs.IntegrationActionIgnoreFilter>[]>;
    /**
     * Name of the integration action.
     */
    name: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type?: pulumi.Input<string>;
}

export interface IntegrationActionIgnoreFilter {
    conditions?: pulumi.Input<pulumi.Input<inputs.IntegrationActionIgnoreFilterCondition>[]>;
    /**
     * The responder type - can be escalation, team or user.
     */
    type: pulumi.Input<string>;
}

export interface IntegrationActionIgnoreFilterCondition {
    expectedValue?: pulumi.Input<string>;
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    not?: pulumi.Input<boolean>;
    operation: pulumi.Input<string>;
    /**
     * Integer value that defines in which order the action will be performed. Defaults to `1`.
     */
    order?: pulumi.Input<number>;
}

export interface MaintenanceRule {
    /**
     * This field represents the entity that maintenance will be applied. Entity field takes two mandatory fields as id and type.
     */
    entities: pulumi.Input<pulumi.Input<inputs.MaintenanceRuleEntity>[]>;
    /**
     * State of rule that will be defined in maintenance and can take either enabled or disabled for policy type rules. This field has to be disabled for integration type entity rules.
     */
    state?: pulumi.Input<string>;
}

export interface MaintenanceRuleEntity {
    /**
     * The id of the entity that maintenance will be applied.
     */
    id?: pulumi.Input<string>;
    /**
     * This parameter defines when the maintenance will be active. It can take one of for-5-minutes, for-30-minutes, for-1-hour, indefinitely or schedule.
     */
    type?: pulumi.Input<string>;
}

export interface MaintenanceTime {
    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     */
    endDate?: pulumi.Input<string>;
    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     */
    startDate?: pulumi.Input<string>;
    /**
     * This parameter defines when the maintenance will be active. It can take one of for-5-minutes, for-30-minutes, for-1-hour, indefinitely or schedule.
     */
    type: pulumi.Input<string>;
}

export interface NotificationPolicyAutoCloseAction {
    /**
     * Duration of this action. If `delayOption` = "for-duration" this has to be set. This is a block, structure is documented below.
     */
    durations: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoCloseActionDuration>[]>;
}

export interface NotificationPolicyAutoCloseActionDuration {
    /**
     * A amount of time in `timeUnits`. This is a integer attribute.
     */
    timeAmount: pulumi.Input<number>;
    /**
     * Valid time units are: "minutes", "hours", "days". Default: minutes
     */
    timeUnit?: pulumi.Input<string>;
}

export interface NotificationPolicyAutoRestartAction {
    /**
     * Duration of this action. If `delayOption` = "for-duration" this has to be set. This is a block, structure is documented below.
     */
    durations: pulumi.Input<pulumi.Input<inputs.NotificationPolicyAutoRestartActionDuration>[]>;
    /**
     * How many times to repeat. This is a integer attribute.
     */
    maxRepeatCount: pulumi.Input<number>;
}

export interface NotificationPolicyAutoRestartActionDuration {
    /**
     * A amount of time in `timeUnits`. This is a integer attribute.
     */
    timeAmount: pulumi.Input<number>;
    /**
     * Valid time units are: "minutes", "hours", "days". Default: minutes
     */
    timeUnit?: pulumi.Input<string>;
}

export interface NotificationPolicyDeDuplicationAction {
    /**
     * - Count
     */
    count: pulumi.Input<number>;
    /**
     * Deduplication type. Possible values are: "value-based", "frequency-based"
     */
    deDuplicationActionType: pulumi.Input<string>;
    /**
     * Duration of this action. If `delayOption` = "for-duration" this has to be set. This is a block, structure is documented below.
     */
    durations?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDeDuplicationActionDuration>[]>;
}

export interface NotificationPolicyDeDuplicationActionDuration {
    /**
     * A amount of time in `timeUnits`. This is a integer attribute.
     */
    timeAmount: pulumi.Input<number>;
    /**
     * Valid time units are: "minutes", "hours", "days". Default: minutes
     */
    timeUnit?: pulumi.Input<string>;
}

export interface NotificationPolicyDelayAction {
    /**
     * Defines until what day to delay or for what duration. Possible values are: "for-duration", "next-time", "next-weekday", "next-monday", "next-tuesday", "next-wednesday", "next-thursday", "next-friday", "next-saturday", "next-sunday"
     */
    delayOption: pulumi.Input<string>;
    /**
     * Duration of this action. If `delayOption` = "for-duration" this has to be set. This is a block, structure is documented below.
     */
    durations?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyDelayActionDuration>[]>;
    /**
     * Until what hour notifications will be delayed. If `delayOption` is set to antyhing else then "for-duration" this has to be set.
     */
    untilHour?: pulumi.Input<number>;
    /**
     * Until what minute on `untilHour` notifications will be delayed. If `delayOption` is set to antyhing else then "for-duration" this has to be set.
     */
    untilMinute?: pulumi.Input<number>;
}

export interface NotificationPolicyDelayActionDuration {
    /**
     * A amount of time in `timeUnits`. This is a integer attribute.
     */
    timeAmount: pulumi.Input<number>;
    /**
     * Valid time units are: "minutes", "hours", "days". Default: minutes
     */
    timeUnit?: pulumi.Input<string>;
}

export interface NotificationPolicyFilter {
    /**
     * Conditions applied to filter. This is a block, structure is documented below.
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyFilterCondition>[]>;
    /**
     * Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: "time-of-day", "weekday-and-time-of-day"
     */
    type?: pulumi.Input<string>;
}

export interface NotificationPolicyFilterCondition {
    /**
     * User defined value that will be compared with alert field according to the operation. Default: empty string
     */
    expectedValue?: pulumi.Input<string>;
    /**
     * Specifies which alert field will be used in condition. Possible values are "message", "alias", "description", "source", "entity", "tags", "actions", "details", "extra-properties", "recipients", "teams", "priority"
     */
    field: pulumi.Input<string>;
    /**
     * If `field` is set as extra-properties, key could be used for key-value pair
     */
    key?: pulumi.Input<string>;
    /**
     * Indicates behaviour of the given operation. Default: false
     */
    not?: pulumi.Input<boolean>;
    /**
     * It is the operation that will be executed for the given field and key. Possible operations are "matches", "contains", "starts-with", "ends-with", "equals", "contains-key", "contains-value", "greater-than", "less-than", "is-empty", "equals-ignore-whitespace".
     */
    operation: pulumi.Input<string>;
    /**
     * Order of the condition in conditions list
     */
    order?: pulumi.Input<number>;
}

export interface NotificationPolicyTimeRestriction {
    /**
     * List of days and hours definitions for field type = "weekday-and-time-of-day". This is a block, structure is documented below.
     */
    restrictions?: pulumi.Input<pulumi.Input<inputs.NotificationPolicyTimeRestrictionRestriction>[]>;
    /**
     * Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: "time-of-day", "weekday-and-time-of-day"
     */
    type: pulumi.Input<string>;
}

export interface NotificationPolicyTimeRestrictionRestriction {
    /**
     * Ending day of restriction (eg. "wednesday)
     */
    endDay: pulumi.Input<string>;
    /**
     * Ending hour of restriction.
     */
    endHour: pulumi.Input<number>;
    /**
     * Ending minute of restriction on defined `endHour`
     */
    endMin: pulumi.Input<number>;
    /**
     * Starting day of restriction (eg. "monday")
     */
    startDay: pulumi.Input<string>;
    /**
     * Starting hour of restriction.
     */
    startHour: pulumi.Input<number>;
    /**
     * Staring minute of restriction on defined `startHour`
     */
    startMin: pulumi.Input<number>;
}

export interface NotificationRuleCriteria {
    /**
     * Defines the fields and values when the condition applies
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.NotificationRuleCriteriaCondition>[]>;
    /**
     * Kind of matching filter  "match-all", "match-any-condition", "match-all-conditions"
     */
    type: pulumi.Input<string>;
}

export interface NotificationRuleCriteriaCondition {
    expectedValue?: pulumi.Input<string>;
    /**
     * Possible values: "message", "alias", "description", "source", "entity", "tags", "actions", "details", "extra-properties", "recipients", "teams", "priority"
     */
    field: pulumi.Input<string>;
    /**
     * If 'field' is set as 'extra-properties', key could be used for key-value pair
     */
    key?: pulumi.Input<string>;
    /**
     * Indicates behaviour of the given operation. Default value is false
     */
    not?: pulumi.Input<boolean>;
    /**
     * Possible values: "matches", "contains", "starts-with", "ends-with", "equals", "contains-key", "contains-value", "greater-than", "less-than", "is-empty", "equals-ignore-whitespace
     */
    operation: pulumi.Input<string>;
    /**
     * Order of the condition in conditions list
     */
    order?: pulumi.Input<number>;
}

export interface NotificationRuleRepeat {
    /**
     * Defined if this step is enabled. Default: true
     */
    enabled?: pulumi.Input<boolean>;
    loopAfter: pulumi.Input<number>;
}

export interface NotificationRuleSchedule {
    /**
     * Name of the notification policy
     */
    name?: pulumi.Input<string>;
    /**
     * Kind of matching filter  "match-all", "match-any-condition", "match-all-conditions"
     */
    type: pulumi.Input<string>;
}

export interface NotificationRuleStep {
    /**
     * Defines the contact that notification will be sent to. This is a block, structure is documented below.
     */
    contacts: pulumi.Input<pulumi.Input<inputs.NotificationRuleStepContact>[]>;
    /**
     * Defined if this step is enabled. Default: true
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Minute time period notification will be sent after.
     */
    sendAfter?: pulumi.Input<number>;
}

export interface NotificationRuleStepContact {
    /**
     * Contact method. Possible values: "email", "sms", "voice", "mobile"
     */
    method: pulumi.Input<string>;
    /**
     * Address of a given method (eg. phone number for sms/voice or email address for email)
     */
    to: pulumi.Input<string>;
}

export interface NotificationRuleTimeRestriction {
    restrictions?: pulumi.Input<pulumi.Input<inputs.NotificationRuleTimeRestrictionRestriction>[]>;
    /**
     * Kind of matching filter  "match-all", "match-any-condition", "match-all-conditions"
     */
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
    /**
     * The id of the responder.
     */
    id?: pulumi.Input<string>;
    /**
     * The responder type.
     */
    type: pulumi.Input<string>;
}

export interface ScheduleRotationTimeRestriction {
    /**
     * It is a restriction object which is described below. This can be used only if time restriction type is `weekday-and-time-of-day`.
     */
    restrictions?: pulumi.Input<pulumi.Input<inputs.ScheduleRotationTimeRestrictionRestriction>[]>;
    /**
     * This parameter should be set to `time-of-day` or `weekday-and-time-of-day`.
     */
    type: pulumi.Input<string>;
}

export interface ScheduleRotationTimeRestrictionRestriction {
    /**
     * Value of the day that frame will end.
     */
    endDay: pulumi.Input<string>;
    /**
     * Value of the hour that frame will end.
     */
    endHour: pulumi.Input<number>;
    /**
     * Value of the minute that frame will end. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     */
    endMin: pulumi.Input<number>;
    /**
     * Value of the day that frame will start.
     */
    startDay: pulumi.Input<string>;
    /**
     * Value of the hour that frame will start
     */
    startHour: pulumi.Input<number>;
    /**
     * Value of the minute that frame will start. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     */
    startMin: pulumi.Input<number>;
}

export interface ServiceIncidentRuleIncidentRule {
    /**
     * A Condition type, supported types are: "match-all", "match-any-condition", "match-all-conditions". Default: "match-all"
     */
    conditionMatchType?: pulumi.Input<string>;
    /**
     * Conditions applied to incident. This is a block, structure is documented below.
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.ServiceIncidentRuleIncidentRuleCondition>[]>;
    /**
     * Properties for incident rule. This is a block, structure is documented below.
     */
    incidentProperties: pulumi.Input<pulumi.Input<inputs.ServiceIncidentRuleIncidentRuleIncidentProperty>[]>;
}

export interface ServiceIncidentRuleIncidentRuleCondition {
    /**
     * User defined value that will be compared with alert field according to the operation. Default: empty string
     */
    expectedValue?: pulumi.Input<string>;
    /**
     * Specifies which alert field will be used in condition. Possible values are "message", "alias", "description", "source", "entity", "tags", "actions", "details", "extra-properties", "recipients", "teams", "priority"
     */
    field: pulumi.Input<string>;
    key?: pulumi.Input<string>;
    /**
     * Indicates behaviour of the given operation. Default: false
     */
    not?: pulumi.Input<boolean>;
    /**
     * It is the operation that will be executed for the given field and key. Possible operations are "matches", "contains", "starts-with", "ends-with", "equals", "contains-key", "contains-value", "greater-than", "less-than", "is-empty", "equals-ignore-whitespace".
     */
    operation: pulumi.Input<string>;
}

export interface ServiceIncidentRuleIncidentRuleIncidentProperty {
    /**
     * Description that is generally used to provide a detailed information about the alert.
     */
    description?: pulumi.Input<string>;
    /**
     * Map of key-value pairs to use as custom properties of the alert.
     */
    details?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Message that is to be passed to audience that is generally used to provide a content information about the alert.
     */
    message: pulumi.Input<string>;
    /**
     * Priority level of the alert. Possible values are P1, P2, P3, P4 and P5
     */
    priority: pulumi.Input<string>;
    /**
     * DEtails about stakeholders for this rule. This is a block, structure is documented below.
     */
    stakeholderProperties: pulumi.Input<pulumi.Input<inputs.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty>[]>;
    /**
     * Tags of the alert.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty {
    /**
     * Description that is generally used to provide a detailed information about the alert.
     */
    description?: pulumi.Input<string>;
    /**
     * Option to enable stakeholder notifications.Default value is true.
     */
    enable?: pulumi.Input<boolean>;
    /**
     * Message that is to be passed to audience that is generally used to provide a content information about the alert.
     */
    message: pulumi.Input<string>;
}

export interface TeamMember {
    /**
     * The UUID for the member to add to this Team.
     */
    id: pulumi.Input<string>;
    /**
     * The role for the user within the Team - can be either 'admin' or 'user', defaults to 'user' if not set.
     */
    role?: pulumi.Input<string>;
}

export interface TeamRoutingRuleCriteria {
    /**
     * List of conditions will be checked before applying team routing rule. This field declaration should be omitted if the criteria type is set to match-all.
     */
    conditions?: pulumi.Input<pulumi.Input<inputs.TeamRoutingRuleCriteriaCondition>[]>;
    /**
     * Type of the operation will be applied on conditions. Should be one of match-all, match-any-condition or match-all-conditions.
     */
    type: pulumi.Input<string>;
}

export interface TeamRoutingRuleCriteriaCondition {
    expectedValue?: pulumi.Input<string>;
    /**
     * Specifies which alert field will be used in condition. Possible values are message, alias, description, source, entity, tags, actions, extra-properties, recipients, teams or priority.
     */
    field: pulumi.Input<string>;
    /**
     * If field is set as extra-properties, key could be used for key-value pair.
     */
    key?: pulumi.Input<string>;
    /**
     * Indicates behaviour of the given operation. Default value is false.
     */
    not?: pulumi.Input<boolean>;
    /**
     * It is the operation that will be executed for the given field and key. Possible operations are matches, contains, starts-with, ends-with, equals, contains-key, contains-value, greater-than, less-than, is-empty and equals-ignore-whitespace.
     */
    operation: pulumi.Input<string>;
    /**
     * Order of the condition in conditions list.
     */
    order?: pulumi.Input<number>;
}

export interface TeamRoutingRuleNotify {
    /**
     * The ID of the Opsgenie Team Routing Rule.
     */
    id?: pulumi.Input<string>;
    /**
     * Name of the team routing rule
     */
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