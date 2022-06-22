package com.qaprosoft.carina.myfp.utils.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.GoalsPageBase;

public enum MyGoalsEnum {

    CURRENT_WEIGHT("Current Weight",GoalsPageBase .class),
    GOAL_WEIGHT("Goal Weight",GoalsPageBase .class),
    CHOSEN_CURRENT_WEIGHT("998 lbs",GoalsPageBase .class),
    CHOSEN_GOAL_WEIGHT("1,000 lbs",GoalsPageBase .class),
    INPUT_MAX_CURRENT_WEIGHT("999",GoalsPageBase .class),
    YES("Yes",GoalsPageBase .class),
    SET("Set",GoalsPageBase .class),
    DISMISS("Dismiss",GoalsPageBase .class),
    OK("Ok",GoalsPageBase .class);


    private String name;
    private Class<? extends AbstractPage> pageClass;

    MyGoalsEnum(String name, Class<? extends AbstractPage> pageClass) {
        this.name = name;
        this.pageClass = pageClass;
    }

    public String getName() {
        return name;
    }

    public Class<? extends AbstractPage> getPageClass() {
        return this.pageClass;
    }
}

