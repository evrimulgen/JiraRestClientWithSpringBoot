

package com.ayaz.core.enums;

public enum EField {

    ALL("*all", null),

    NAVIGABLE("*naviagble", null),

    AFFECTED_VERSION("affectedVersion", EFieldType.VERSION),

    ASSIGNEE("assignee", EFieldType.USER),

    CATEGORY("category", EFieldType.CATEGORY),

    COMMENT("comment", EFieldType.TEXT),
    COMPONENT("component", EFieldType.COMPONENT),
    CREATED("created", EFieldType.DATE),
//	CUSTOM_FIELD("CustomFieldName", EFieldType.CUSTOM_TYPE),
    DESCRIPTION("description", EFieldType.TEXT),
    DUE("due", EFieldType.DATE),
    ENVIRONMENT("environment", EFieldType.TEXT),
    EPIC_LINKS("epic link", EFieldType.CUSTOM_TYPE),
    FILTER("filter", EFieldType.FILTER),
    FIX_VERSION("fixVersion", EFieldType.VERSION),
    ISSUE_KEY("issueKey", EFieldType.ISSUE),
    LAST_VIEWED("lastViewed", EFieldType.DATE),
    LEVEL("level", EFieldType.SECURITY_LEVEL),
    ORIGINAL_ESTIMATE("originalEstimate", EFieldType.DURATION),
    PARENT("parent", EFieldType.ISSUE),
    PRIORITY("priority", EFieldType.PRIORITY),
    PROJECT("project", EFieldType.PROJECT),
    REMAINING_ESTIMATE("remainingEstimate", EFieldType.DURATION),
    REPORTER("reporter", EFieldType.USER),
    RESOLUTION("resolution", EFieldType.RESOLUTION),
    RESOLVED("resolved", EFieldType.DATE),
    SPRINT("sprint", EFieldType.NUMBER),
    STATUS("status", EFieldType.STATUS),
    SUMMARY("summary", EFieldType.TEXT),
    TEXT("text", EFieldType.TEXT_MASTER),
    ISSUE_TYPE("issuetype", EFieldType.ISSUE_TYPE),

    TIME_SPENT("timeSpent", EFieldType.DURATION),
    UPDATED("updated", EFieldType.DATE),
    VOTER("voter", EFieldType.USER),
    VOTES("votes", EFieldType.NUMBER),
    WATCHER("watcher", EFieldType.USER),
    WATCHERS("watchers", EFieldType.NUMBER),
    WORK_RATIO("workRatio", EFieldType.NUMBER),
    TRANSITIONS("transitions", EFieldType.CUSTOM_TYPE),
    CHANGELOG("changelog", EFieldType.CUSTOM_TYPE),
    RENDEREDFIELDS("renderedFields", EFieldType.CUSTOM_TYPE),
    ATTACHMENT("attachment", EFieldType.CUSTOM_TYPE);

    private final String field;
    private final EFieldType type;

    EField(String field, EFieldType type) {
        this.field = field;
        this.type = type;
    }

    public String getField() {
        return field;
    }

    public EFieldType getType() {
        return type;
    }

    @Override
    public String toString() {
        return getField();
    }
}
