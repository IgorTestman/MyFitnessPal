package com.qaprosoft.carina.myfp.utils.enums;

public enum ActivityLevelEnum {
    NOT_VERY_ACTIVE("Not Very Active"),
    LIGHTLY_ACTIVE("Lightly Active"),
    ACTIVE("Active"),
    VERY_ACTIVE("Very Active");

    private String name;

    ActivityLevelEnum(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

}
