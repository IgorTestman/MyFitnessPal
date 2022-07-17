package com.qaprosoft.carina.myfp.utils.enums;

public enum NutritionGoalsEnum {
    CALORIE_CARBS_PROTEIN_AND_FAT_GOALS("Calorie, Carbs, Protein and Fat Goals",
            "Customize your default or daily goals."),
    CALORIE_GOALS_BY_MEAL("Calorie Goals by Meal",
            "Stay on track with a calorie goal for each meal."),
    SHOW_CARBS_PROTEIN_AND_FAT_BY_MEAL("Show Carbs, Protein and Fat By Meal",
            "View carbs, protein and fat by gram or percent.");

    private String name;
    private String description;

    NutritionGoalsEnum(String name, String description) {
        this.name = name;
        this.description = description;

    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
