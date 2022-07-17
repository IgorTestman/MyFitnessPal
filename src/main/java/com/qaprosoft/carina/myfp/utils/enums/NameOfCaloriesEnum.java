package com.qaprosoft.carina.myfp.utils.enums;

public enum NameOfCaloriesEnum {
    CARBS("Carbs"),
    CARB("Carb"),
    PROTEIN ("Protein"),
    FAT("Fat");

    private String name;
    NameOfCaloriesEnum(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
