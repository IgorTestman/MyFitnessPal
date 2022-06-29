package com.qaprosoft.carina.myfp.utils.enums;

public enum NameOfCalories {
    CARBS("Carbs"),
    PROTEIN ("Protein"),
    FAT("Fat");

    private String name;

    NameOfCalories(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
