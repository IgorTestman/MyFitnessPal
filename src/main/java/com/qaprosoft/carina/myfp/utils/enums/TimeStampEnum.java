package com.qaprosoft.carina.myfp.utils.enums;

public enum TimeStampEnum {
    EDIT_TIME("Edit Time"),
    SET_CURRENT_TIME("Set Current Time"),
    NO_TIME("No Time");

    private String name;

    TimeStampEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}