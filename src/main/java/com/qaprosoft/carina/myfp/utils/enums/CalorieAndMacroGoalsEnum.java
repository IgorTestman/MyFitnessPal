package com.qaprosoft.carina.myfp.utils.enums;

public enum CalorieAndMacroGoalsEnum {
    CALORIES("Calories"),
    CARBOHYDRATES("Carbohydrates"),
    PROTEIN("Protein"),
    FAT("fat");

    private String name;
    CalorieAndMacroGoalsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


