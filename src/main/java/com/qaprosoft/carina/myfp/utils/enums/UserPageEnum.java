package com.qaprosoft.carina.myfp.utils.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.UserPageBase;

public enum UserPageEnum {
    HOME("Home", UserPageBase.class),
    DIARY("Diary", UserPageBase.class),
    RECIPES("Recipes", UserPageBase.class),
    PLANS("Plans", UserPageBase.class),
    ME("Me", UserPageBase.class);


    private String name;
    private Class<? extends AbstractPage> pageClass;

    UserPageEnum(String name, Class<? extends AbstractPage> pageClass) {
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


