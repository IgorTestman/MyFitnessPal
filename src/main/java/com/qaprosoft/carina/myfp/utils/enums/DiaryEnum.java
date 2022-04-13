package com.qaprosoft.carina.myfp.utils.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.DiaryPageBase;

public enum DiaryEnum {
    BREAKFAST("Breakfast", DiaryPageBase.class),
    LUNCH("Lunch", DiaryPageBase.class),
    DINNER("Dinner", DiaryPageBase.class),
    SNACKS("Snacks", DiaryPageBase.class),
    EXERCISE("Exercise", DiaryPageBase.class),
    WATER("Water", DiaryPageBase.class);


    private String name;
    private Class<? extends AbstractPage> pageClass;

    DiaryEnum(String name, Class<? extends AbstractPage> pageClass) {
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


