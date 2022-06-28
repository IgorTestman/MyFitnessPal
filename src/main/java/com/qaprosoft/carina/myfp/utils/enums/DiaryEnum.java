package com.qaprosoft.carina.myfp.utils.enums;

public enum DiaryEnum {
    BREAKFAST("Breakfast"),
    LUNCH ("LUNCH"),
    DINNER ("Dinner"),
    SNACKS ("Snacks"),
    EXERCISE ("Exercise"),
    WATER ("Water");

    private String name;

    DiaryEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


