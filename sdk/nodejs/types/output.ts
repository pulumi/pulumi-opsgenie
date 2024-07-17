// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface AlertPolicyFilter {
    /**
     * Conditions applied to filter. This is a block, structure is documented below.
     */
    conditions?: outputs.AlertPolicyFilterCondition[];
    /**
     * A filter type, supported types are: `match-all`, `match-any-condition`, `match-all-conditions`. Default: `match-all`
     */
    type?: string;
}

export interface AlertPolicyFilterCondition {
    /**
     * User defined value that will be compared with alert field according to the operation. Default: empty string
     */
    expectedValue?: string;
    /**
     * Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `responders`, `teams`, `priority`
     */
    field: string;
    /**
     * If `field` is set as extra-properties, key could be used for key-value pair
     */
    key?: string;
    /**
     * Indicates behaviour of the given operation. Default: `false`
     */
    not?: boolean;
    /**
     * It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`.
     */
    operation: string;
    /**
     * Order of the condition in conditions list
     */
    order?: number;
}

export interface AlertPolicyResponder {
    /**
     * ID of the responder
     */
    id: string;
    /**
     * Name of the responder
     */
    name?: string;
    /**
     * Type of responder. Acceptable values are: `user`, `team`, `escalation` or `schedule`
     */
    type: string;
    /**
     * Username of the responder
     */
    username?: string;
}

export interface AlertPolicyTimeRestriction {
    /**
     * A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
     */
    restriction?: outputs.AlertPolicyTimeRestrictionRestriction[];
    /**
     * List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
     */
    restrictionList?: outputs.AlertPolicyTimeRestrictionRestrictionList[];
    /**
     * Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: `time-of-day`, `weekday-and-time-of-day`
     */
    type: string;
}

export interface AlertPolicyTimeRestrictionRestriction {
    /**
     * Ending hour of restriction.
     */
    endHour: number;
    /**
     * Ending minute of restriction on defined `endHour`
     */
    endMin: number;
    /**
     * Starting hour of restriction.
     */
    startHour: number;
    /**
     * Staring minute of restriction on defined `startHour`
     */
    startMin: number;
}

export interface AlertPolicyTimeRestrictionRestrictionList {
    /**
     * Ending day of restriction (eg. `wednesday`)
     */
    endDay: string;
    /**
     * Ending hour of restriction on defined `endDay`
     */
    endHour: number;
    /**
     * Ending minute of restriction on defined `endHour`
     */
    endMin: number;
    /**
     * Starting day of restriction (eg. `monday`)
     */
    startDay: string;
    /**
     * Starting hour of restriction on defined `startDay`
     */
    startHour: number;
    /**
     * Staring minute of restriction on defined `startHour`
     */
    startMin: number;
}

export interface ApiIntegrationResponder {
    /**
     * The id of the responder.
     */
    id?: string;
    /**
     * The responder type.
     */
    type?: string;
}

export interface EmailIntegrationResponder {
    /**
     * The ID of the Opsgenie Email based Integration.
     */
    id?: string;
    /**
     * The responder type.
     */
    type?: string;
}

export interface EscalationRepeat {
    closeAlertAfterAll?: boolean;
    count?: number;
    resetRecipientStates?: boolean;
    waitInterval?: number;
}

export interface EscalationRule {
    /**
     * The condition for notifying the recipient of escalation rule that is based on the alert state. Possible values are: `if-not-acked` and `if-not-closed`. Default: `if-not-acked`
     */
    condition: string;
    /**
     * Time delay of the escalation rule, in minutes.
     */
    delay: number;
    /**
     * Recipient calculation logic for schedules. Possible values are:
     */
    notifyType: string;
    /**
     * Object of schedule, team, or users which will be notified in escalation. The possible values for participants are: `user`, `schedule`, `team`. There can only be one recipient per each `rules`.
     */
    recipients: outputs.EscalationRuleRecipient[];
}

export interface EscalationRuleRecipient {
    /**
     * The ID of the Opsgenie Escalation.
     */
    id?: string;
    type?: string;
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
    recipients: outputs.GetEscalationRuleRecipient[];
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
    username?: string;
}

export interface IncidentTemplateStakeholderProperty {
    /**
     * Description field of the incident template. This field must not be longer than 10000 characters.
     */
    description?: string;
    /**
     * Option to enable stakeholder notifications.Default value is true.
     */
    enable?: boolean;
    /**
     * Message of the related incident template. This field must not be longer than 130 characters.
     */
    message: string;
}

export interface IntegrationActionAcknowledge {
    /**
     * An identifier that is used for alert deduplication. Default: `{{alias}}`.
     */
    alias?: string;
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: outputs.IntegrationActionAcknowledgeFilter[];
    /**
     * Name of the integration action.
     */
    name: string;
    /**
     * Additional alert action note.
     */
    note?: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type?: string;
    /**
     * Owner of the execution for integration action.
     */
    user?: string;
}

export interface IntegrationActionAcknowledgeFilter {
    conditions?: outputs.IntegrationActionAcknowledgeFilterCondition[];
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type: string;
}

export interface IntegrationActionAcknowledgeFilterCondition {
    expectedValue?: string;
    field: string;
    key?: string;
    not?: boolean;
    operation: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
}

export interface IntegrationActionAddNote {
    /**
     * An identifier that is used for alert deduplication. Default: `{{alias}}`.
     */
    alias?: string;
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: outputs.IntegrationActionAddNoteFilter[];
    /**
     * Name of the integration action.
     */
    name: string;
    /**
     * Additional alert action note.
     */
    note?: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type?: string;
    /**
     * Owner of the execution for integration action.
     */
    user?: string;
}

export interface IntegrationActionAddNoteFilter {
    conditions?: outputs.IntegrationActionAddNoteFilterCondition[];
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type: string;
}

export interface IntegrationActionAddNoteFilterCondition {
    expectedValue?: string;
    field: string;
    key?: string;
    not?: boolean;
    operation: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
}

export interface IntegrationActionClose {
    /**
     * An identifier that is used for alert deduplication. Default: `{{alias}}`.
     */
    alias?: string;
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: outputs.IntegrationActionCloseFilter[];
    /**
     * Name of the integration action.
     */
    name: string;
    /**
     * Additional alert action note.
     */
    note?: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type?: string;
    /**
     * Owner of the execution for integration action.
     */
    user?: string;
}

export interface IntegrationActionCloseFilter {
    conditions?: outputs.IntegrationActionCloseFilterCondition[];
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type: string;
}

export interface IntegrationActionCloseFilterCondition {
    expectedValue?: string;
    field: string;
    key?: string;
    not?: boolean;
    operation: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
}

export interface IntegrationActionCreate {
    alertActions?: string[];
    /**
     * An identifier that is used for alert deduplication. Default: `{{alias}}`.
     */
    alias?: string;
    appendAttachments?: boolean;
    /**
     * Custom alert priority. e.g. ``{{message.substring(0,2)}}``
     */
    customPriority?: string;
    /**
     * Detailed description of the alert, anything that may not have fit in the `message` field.
     */
    description?: string;
    /**
     * The entity the alert is related to.
     */
    entity?: string;
    /**
     * Set of user defined properties specified as a map.
     */
    extraProperties?: {[key: string]: string};
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: outputs.IntegrationActionCreateFilter[];
    ignoreAlertActionsFromPayload?: boolean;
    ignoreExtraPropertiesFromPayload?: boolean;
    /**
     * If enabled, the integration will ignore responders sent in request payloads.
     */
    ignoreRespondersFromPayload?: boolean;
    ignoreTagsFromPayload?: boolean;
    /**
     * If enabled, the integration will ignore teams sent in request payloads.
     */
    ignoreTeamsFromPayload?: boolean;
    /**
     * Alert text limited to 130 characters.
     */
    message?: string;
    /**
     * Name of the integration action.
     */
    name: string;
    /**
     * Additional alert action note.
     */
    note?: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
    /**
     * Alert priority.
     */
    priority?: string;
    /**
     * User, schedule, teams or escalation names to calculate which users will receive notifications of the alert.
     */
    responders?: outputs.IntegrationActionCreateResponder[];
    /**
     * User defined field to specify source of action.
     */
    source?: string;
    /**
     * Comma separated list of labels to be attached to the alert.
     */
    tags?: string[];
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type?: string;
    /**
     * Owner of the execution for integration action.
     */
    user?: string;
}

export interface IntegrationActionCreateFilter {
    conditions?: outputs.IntegrationActionCreateFilterCondition[];
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type: string;
}

export interface IntegrationActionCreateFilterCondition {
    expectedValue?: string;
    field: string;
    key?: string;
    not?: boolean;
    operation: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
}

export interface IntegrationActionCreateResponder {
    /**
     * The id of the responder.
     */
    id: string;
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type: string;
}

export interface IntegrationActionIgnore {
    /**
     * Used to specify rules for matching alerts and the filter type. Please note that depending on the integration type the field names in the filter conditions are:
     * * For SNS integration: `actions`, `alias`, `entity`, `Message`, `recipients`, `responders`, `Subject`, `tags`, `teams`, `eventType`, `Timestamp`, `TopicArn`.
     * * For API integration: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`, `eventType`.
     * * For Email integration: `fromAddress`, `fromName`, `conversationSubject`, `subject`
     */
    filters?: outputs.IntegrationActionIgnoreFilter[];
    /**
     * Name of the integration action.
     */
    name: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type?: string;
}

export interface IntegrationActionIgnoreFilter {
    conditions?: outputs.IntegrationActionIgnoreFilterCondition[];
    /**
     * The responder type - can be `escalation`, `team` or `user`.
     */
    type: string;
}

export interface IntegrationActionIgnoreFilterCondition {
    expectedValue?: string;
    field: string;
    key?: string;
    not?: boolean;
    operation: string;
    /**
     * Integer value that defines in which order the action will be performed. Default: `1`.
     */
    order?: number;
}

export interface MaintenanceRule {
    /**
     * This field represents the entity that maintenance will be applied. Entity field takes two mandatory fields as id and type.
     */
    entities: outputs.MaintenanceRuleEntity[];
    /**
     * State of rule that will be defined in maintenance and can take either enabled or disabled for policy type rules. This field has to be disabled for integration type entity rules.
     */
    state?: string;
}

export interface MaintenanceRuleEntity {
    /**
     * The id of the entity that maintenance will be applied.
     */
    id?: string;
    /**
     * The type of the entity that maintenance will be applied. It can be either integration or policy.
     */
    type?: string;
}

export interface MaintenanceTime {
    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     */
    endDate?: string;
    /**
     * This parameter takes a date format as (yyyy-MM-dd'T'HH:mm:ssZ) (e.g. 2019-06-11T08:00:00+02:00).
     */
    startDate?: string;
    type: string;
}

export interface NotificationPolicyAutoCloseAction {
    /**
     * Duration of this action. This is a block, structure is documented below.
     */
    durations: outputs.NotificationPolicyAutoCloseActionDuration[];
}

export interface NotificationPolicyAutoCloseActionDuration {
    /**
     * A amount of time in `timeUnits`. This is a integer attribute.
     */
    timeAmount: number;
    /**
     * Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
     */
    timeUnit?: string;
}

export interface NotificationPolicyAutoRestartAction {
    /**
     * Duration of this action. This is a block, structure is documented below.
     */
    durations: outputs.NotificationPolicyAutoRestartActionDuration[];
    /**
     * How many times to repeat. This is a integer attribute.
     */
    maxRepeatCount: number;
}

export interface NotificationPolicyAutoRestartActionDuration {
    /**
     * A amount of time in `timeUnits`. This is a integer attribute.
     */
    timeAmount: number;
    /**
     * Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
     */
    timeUnit?: string;
}

export interface NotificationPolicyDeDuplicationAction {
    /**
     * Count
     */
    count: number;
    /**
     * Deduplication type. Possible values are: "value-based", "frequency-based"
     */
    deDuplicationActionType: string;
    /**
     * Duration of this action (only required for "frequency-based" de-duplication action). This is a block, structure is documented below.
     */
    durations?: outputs.NotificationPolicyDeDuplicationActionDuration[];
}

export interface NotificationPolicyDeDuplicationActionDuration {
    /**
     * A amount of time in `timeUnits`. This is a integer attribute.
     */
    timeAmount: number;
    /**
     * Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
     */
    timeUnit?: string;
}

export interface NotificationPolicyDelayAction {
    /**
     * Defines until what day to delay or for what duration. Possible values are: `for-duration`, `next-time`, `next-weekday`, `next-monday`, `next-tuesday`, `next-wednesday`, `next-thursday`, `next-friday`, `next-saturday`, `next-sunday`
     */
    delayOption: string;
    /**
     * Duration of this action. If `delayOption` = `for-duration` this has to be set. This is a block, structure is documented below.
     */
    durations?: outputs.NotificationPolicyDelayActionDuration[];
    /**
     * Until what hour notifications will be delayed. If `delayOption` is set to antyhing else then `for-duration` this has to be set.
     */
    untilHour?: number;
    /**
     * Until what minute on `untilHour` notifications will be delayed. If `delayOption` is set to antyhing else then `for-duration` this has to be set.
     */
    untilMinute?: number;
}

export interface NotificationPolicyDelayActionDuration {
    /**
     * A amount of time in `timeUnits`. This is a integer attribute.
     */
    timeAmount: number;
    /**
     * Valid time units are: `minutes`, `hours`, `days`. Default: `minutes`
     */
    timeUnit?: string;
}

export interface NotificationPolicyFilter {
    /**
     * Conditions applied to filter. This is a block, structure is documented below.
     */
    conditions?: outputs.NotificationPolicyFilterCondition[];
    /**
     * A filter type, supported types are: `match-all`, `match-any-condition`, `match-all-conditions`. Default: `match-all`
     */
    type?: string;
}

export interface NotificationPolicyFilterCondition {
    /**
     * User defined value that will be compared with alert field according to the operation. Default: empty string
     */
    expectedValue?: string;
    /**
     * Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `responders`, `teams`, `priority`
     */
    field: string;
    /**
     * If `field` is set as extra-properties, key could be used for key-value pair
     */
    key?: string;
    /**
     * Indicates behaviour of the given operation. Default: `false`
     */
    not?: boolean;
    /**
     * It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`.
     */
    operation: string;
    /**
     * Order of the condition in conditions list
     */
    order?: number;
}

export interface NotificationPolicyTimeRestriction {
    /**
     * A definition of hourly definition applied daily, this has to be used with combination: type = `time-of-day`. This is a block, structure is documented below.
     */
    restriction?: outputs.NotificationPolicyTimeRestrictionRestriction[];
    /**
     * List of days and hours definitions for field type = `weekday-and-time-of-day`. This is a block, structure is documented below.
     */
    restrictionList?: outputs.NotificationPolicyTimeRestrictionRestrictionList[];
    /**
     * Defines if restriction should apply daily on given hours or on certain days and hours. Possible values are: `time-of-day`, `weekday-and-time-of-day`
     */
    type: string;
}

export interface NotificationPolicyTimeRestrictionRestriction {
    /**
     * Ending hour of restriction.
     */
    endHour: number;
    /**
     * Ending minute of restriction on defined `endHour`
     */
    endMin: number;
    /**
     * Starting hour of restriction.
     */
    startHour: number;
    /**
     * Staring minute of restriction on defined `startHour`
     */
    startMin: number;
}

export interface NotificationPolicyTimeRestrictionRestrictionList {
    /**
     * Ending day of restriction (eg. `wednesday`)
     */
    endDay: string;
    /**
     * Ending hour of restriction on defined `endDay`
     */
    endHour: number;
    /**
     * Ending minute of restriction on defined `endHour`
     */
    endMin: number;
    /**
     * Starting day of restriction (eg. `monday`)
     */
    startDay: string;
    /**
     * Starting hour of restriction on defined `startDay`
     */
    startHour: number;
    /**
     * Staring minute of restriction on defined `startHour`
     */
    startMin: number;
}

export interface NotificationRuleCriteria {
    /**
     * Defines the fields and values when the condition applies
     */
    conditions?: outputs.NotificationRuleCriteriaCondition[];
    /**
     * Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
     */
    type: string;
}

export interface NotificationRuleCriteriaCondition {
    /**
     * User defined value that will be compared with alert field according to the operation. Default: empty string
     */
    expectedValue?: string;
    /**
     * Possible values: `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`
     */
    field: string;
    /**
     * If 'field' is set as 'extra-properties', key could be used for key-value pair
     */
    key?: string;
    /**
     * Indicates behaviour of the given operation. Default: `false`
     */
    not?: boolean;
    /**
     * Possible values: `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`
     */
    operation: string;
    /**
     * Order of the condition in conditions list
     */
    order?: number;
}

export interface NotificationRuleRepeat {
    /**
     * If policy should be enabled. Default: `true`
     */
    enabled?: boolean;
    loopAfter: number;
}

export interface NotificationRuleSchedule {
    /**
     * Name of the notification policy
     */
    name: string;
    /**
     * Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
     */
    type: string;
}

export interface NotificationRuleStep {
    /**
     * Defines the contact that notification will be sent to. This is a block, structure is documented below.
     */
    contacts: outputs.NotificationRuleStepContact[];
    /**
     * Defined if this step is enabled. Default: `true`
     */
    enabled?: boolean;
    /**
     * Time period, in minutes, notification will be sent after.
     */
    sendAfter?: number;
}

export interface NotificationRuleStepContact {
    /**
     * Contact method. Possible values: `email`, `sms`, `voice`, `mobile`
     */
    method: string;
    /**
     * Address of a given method (eg. email address for `email`, phone number for `sms`/`voice` or mobile application name for `mobile`)
     */
    to: string;
}

export interface NotificationRuleTimeRestriction {
    restriction?: outputs.NotificationRuleTimeRestrictionRestriction[];
    restrictions?: outputs.NotificationRuleTimeRestrictionRestriction[];
    /**
     * Kind of matching filter. Possible values: `match-all`, `match-any-condition`, `match-all-conditions`
     */
    type: string;
}

export interface NotificationRuleTimeRestrictionRestriction {
    endDay: string;
    endHour: number;
    endMin: number;
    startDay: string;
    startHour: number;
    startMin: number;
}

export interface ScheduleRotationParticipant {
    /**
     * The id of the responder.
     */
    id?: string;
    /**
     * The responder type.
     */
    type: string;
}

export interface ScheduleRotationTimeRestriction {
    /**
     * It is a restriction object which is described below. In this case startDay/endDay fields are not supported. This can be used only if time restriction type is `time-of-day`.
     */
    restriction?: outputs.ScheduleRotationTimeRestrictionRestriction[];
    /**
     * It is a restriction object which is described below. This can be used only if time restriction type is `weekday-and-time-of-day`.
     */
    restrictionList?: outputs.ScheduleRotationTimeRestrictionRestrictionList[];
    /**
     * This parameter should be set to `time-of-day` or `weekday-and-time-of-day`.
     */
    type: string;
}

export interface ScheduleRotationTimeRestrictionRestriction {
    /**
     * Value of the hour that frame will end.
     */
    endHour: number;
    /**
     * Value of the minute that frame will end. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     */
    endMin: number;
    /**
     * Value of the hour that frame will start.
     */
    startHour: number;
    /**
     * Value of the minute that frame will start. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     */
    startMin: number;
}

export interface ScheduleRotationTimeRestrictionRestrictionList {
    /**
     * Value of the day that frame will end.
     */
    endDay: string;
    /**
     * Value of the hour that frame will end.
     */
    endHour: number;
    /**
     * Value of the minute that frame will end. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     *
     * Both `startDay` and `endDay` can assume only `monday`, `tuesday`, `wednesday`, `thursday`, `friday`, `saturday`, or `sunday` values.
     */
    endMin: number;
    /**
     * Value of the day that frame will start.
     */
    startDay: string;
    /**
     * Value of the hour that frame will start
     */
    startHour: number;
    /**
     * Value of the minute that frame will start. Minutes may take 0 or 30 as value. Otherwise they will be converted to nearest 0 or 30 automatically.
     */
    startMin: number;
}

export interface ServiceIncidentRuleIncidentRule {
    /**
     * A Condition type, supported types are: `match-all`, `match-any-condition`, `match-all-conditions`. Default: `match-all`
     */
    conditionMatchType?: string;
    /**
     * Conditions applied to incident. This is a block, structure is documented below.
     */
    conditions?: outputs.ServiceIncidentRuleIncidentRuleCondition[];
    /**
     * Properties for incident rule. This is a block, structure is documented below.
     */
    incidentProperties: outputs.ServiceIncidentRuleIncidentRuleIncidentProperty[];
}

export interface ServiceIncidentRuleIncidentRuleCondition {
    /**
     * User defined value that will be compared with alert field according to the operation. Default: empty string
     */
    expectedValue?: string;
    /**
     * Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `details`, `extra-properties`, `recipients`, `teams`, `priority`
     */
    field: string;
    /**
     * If 'field' is set as 'extra-properties', key could be used for key-value pair
     */
    key?: string;
    /**
     * Indicates behaviour of the given operation. Default: false
     */
    not?: boolean;
    /**
     * It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty`, `equals-ignore-whitespace`.
     */
    operation: string;
}

export interface ServiceIncidentRuleIncidentRuleIncidentProperty {
    /**
     * Description field of the incident rule.
     */
    description?: string;
    /**
     * Map of key-value pairs to use as custom properties of the alert.
     */
    details?: {[key: string]: string};
    /**
     * Message of the related incident rule.
     */
    message: string;
    /**
     * Priority level of the alert. Possible values are `P1`, `P2`, `P3`, `P4` and `P5`
     */
    priority: string;
    /**
     * DEtails about stakeholders for this rule. This is a block, structure is documented below.
     */
    stakeholderProperties: outputs.ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty[];
    /**
     * Tags of the alert.
     */
    tags?: string[];
}

export interface ServiceIncidentRuleIncidentRuleIncidentPropertyStakeholderProperty {
    /**
     * Description that is generally used to provide a detailed information about the alert.
     */
    description?: string;
    /**
     * Option to enable stakeholder notifications.Default value is true.
     */
    enable?: boolean;
    /**
     * Message that is to be passed to audience that is generally used to provide a content information about the alert.
     */
    message: string;
}

export interface TeamMember {
    /**
     * The UUID for the member to add to this Team.
     */
    id: string;
    /**
     * The role for the user within the Team - can be either `admin` or `user`. Default: `user`.
     */
    role?: string;
    username: string;
}

export interface TeamRoutingRuleCriteria {
    /**
     * List of conditions will be checked before applying team routing rule. This field declaration should be omitted if the criteria type is set to match-all.
     */
    conditions?: outputs.TeamRoutingRuleCriteriaCondition[];
    /**
     * Type of the operation will be applied on conditions. Should be one of `match-all`, `match-any-condition` or `match-all-conditions`.
     */
    type: string;
}

export interface TeamRoutingRuleCriteriaCondition {
    expectedValue?: string;
    /**
     * Specifies which alert field will be used in condition. Possible values are `message`, `alias`, `description`, `source`, `entity`, `tags`, `actions`, `extra-properties`, `recipients`, `teams` or `priority`.
     */
    field: string;
    /**
     * If field is set as extra-properties, key could be used for key-value pair.
     */
    key?: string;
    /**
     * Indicates behaviour of the given operation. Default value is false.
     */
    not?: boolean;
    /**
     * It is the operation that will be executed for the given field and key. Possible operations are `matches`, `contains`, `starts-with`, `ends-with`, `equals`, `contains-key`, `contains-value`, `greater-than`, `less-than`, `is-empty` and `equals-ignore-whitespace`.
     *
     * * `expectedValue` - (Optional) User defined value that will be compared with alert field according to the operation. Default: empty string.
     */
    operation: string;
    /**
     * Order of the condition in conditions list.
     */
    order?: number;
}

export interface TeamRoutingRuleNotify {
    id: string;
    name: string;
    type: string;
}

export interface TeamRoutingRuleTimeRestriction {
    restriction?: outputs.TeamRoutingRuleTimeRestrictionRestriction[];
    restrictionList?: outputs.TeamRoutingRuleTimeRestrictionRestrictionList[];
    type: string;
}

export interface TeamRoutingRuleTimeRestrictionRestriction {
    endHour: number;
    endMin: number;
    startHour: number;
    startMin: number;
}

export interface TeamRoutingRuleTimeRestrictionRestrictionList {
    endDay: string;
    endHour: number;
    endMin: number;
    startDay: string;
    startHour: number;
    startMin: number;
}

export interface UserUserAddress {
    city: string;
    country: string;
    line: string;
    state: string;
    zipcode: string;
}

