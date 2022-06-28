package com.qaprosoft.carina.myfp.utils.enums;

public enum ViewOptionsDiaryEnum {
    COMPLETE_DIARY("Complete Diary"),
    ADD_WATER("Add Water"),
    ADD_NOTE("Add Note"),
    DIARY_SETTINGS("Diary Settings");

    private String name;

    ViewOptionsDiaryEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

