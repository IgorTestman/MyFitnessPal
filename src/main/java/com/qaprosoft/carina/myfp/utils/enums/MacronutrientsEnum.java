package com.qaprosoft.carina.myfp.utils.enums;

public enum MacronutrientsEnum {
    PERCENTAGE("Percentage"),
    GRAMS("Grams");

    private String name;
    MacronutrientsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
