package com.ayaz.core.enums;


public enum Operation {
    SET("set"),
    EDIT("edit"),
    REMOVE("remove");

    private String name;

    Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
