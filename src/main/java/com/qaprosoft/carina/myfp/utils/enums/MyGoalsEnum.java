package com.qaprosoft.carina.myfp.utils.enums;

public enum MyGoalsEnum {

    CURRENT_WEIGHT("Current Weight"),
    GOAL_WEIGHT("Goal Weight"),
    CHOSEN_CURRENT_WEIGHT("998 lbs"),
    CHOSEN_GOAL_WEIGHT("1,000 lbs"),
    INPUT_MAX_CURRENT_WEIGHT("999"),
    YES("Yes"),
    SET("Set"),
    DISMISS("Dismiss"),
    OK("Ok");

    private String name;

    MyGoalsEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


