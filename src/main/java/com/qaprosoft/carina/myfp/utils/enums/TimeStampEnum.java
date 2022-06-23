package com.qaprosoft.carina.myfp.utils.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.DiaryPageBase;

public enum TimeStampEnum {
    EDIT_TIME("Edit Time", DiaryPageBase.class),
    SET_CURRENT_TIME("Set Current Time", DiaryPageBase.class),
    NO_TIME("No Time", DiaryPageBase.class);


    private String name;
    private Class<? extends AbstractPage> pageClass;

    TimeStampEnum(String name, Class<? extends AbstractPage> pageClass) {
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