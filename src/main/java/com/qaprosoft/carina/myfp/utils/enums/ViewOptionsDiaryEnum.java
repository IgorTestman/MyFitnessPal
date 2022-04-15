package com.qaprosoft.carina.myfp.utils.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.DiaryPageBase;

public enum ViewOptionsDiaryEnum {
    COMPLETE_DIARY("Complete Diary", DiaryPageBase.class),
    ADD_WATER("Add Water", DiaryPageBase.class),
    ADD_NOTE("Add Note", DiaryPageBase.class),
    DIARY_SETTINGS("Diary Settings", DiaryPageBase.class);


    private String name;
    private Class<? extends AbstractPage> pageClass;

    ViewOptionsDiaryEnum(String name, Class<? extends AbstractPage> pageClass) {
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

