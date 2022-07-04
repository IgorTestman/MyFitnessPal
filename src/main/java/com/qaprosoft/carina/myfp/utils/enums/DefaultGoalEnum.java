package com.qaprosoft.carina.myfp.utils.enums;

public enum DefaultGoalEnum {
    CALORIES("Calories", "4571"),
    CARBOHYDRATES("Carbohydrates","114g"),
    PROTEIN("Protein", "914g"),
    FAT("Fat", "51g");

    private String name;
    private String weight;

    DefaultGoalEnum(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }
}
