
package com.ayaz.core.enums;


public enum EOperator {

    EQUALS("="),
    NOT_EQUALS("!="),
    GREATER_THAN(">"),
    GREATER_THAN_EQUALS(">="),
    LESS_THAN("<"),
    LESS_THAN_EQUALS("<="),
    IN("in"),
    NOT_IN("not in"),
    CONTAINS("~"),
    DOES_NOT_CONTAIN("!~"),
    IS("is"),
    IS_NOT("is not"),
    WAS("was"),
    WAS_IN("was in"),
    WAS_NOT_IN("was not in"),
    WAS_NOT("was not"),
    CHANGED("changed"),
    AFTER("after"),
    BEFORE("before"),
    BY("by"),
    FROM("from"),
    ON("on"),
    TO("to");

    private final String operator;

    EOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    @Override
    public String toString() {
        return getOperator();
    }
}
