package com.qaprosoft.carina.myfp.utils.enums;

public enum NutritionGoalsEnum {
    CALORIE_CARBS_PROTEIN_AND_FAT_GOALS("Calorie, Carbs, Protein and Fat Goals"),
    CALORIE_GOALS_BY_MEAL("Calorie Goals by Meal"),
    SHOW_CARBS_PROTEIN_AND_FAT_BY_MEAL("Show Carbs, Protein and Fat By Meal"),
    ADDITIONAL_NUTRIENT_GOALS("Additional Nutrient Goals");

    private String name;

    NutritionGoalsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
