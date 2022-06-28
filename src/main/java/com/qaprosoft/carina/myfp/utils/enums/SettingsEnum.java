package com.qaprosoft.carina.myfp.utils.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.MyGoalsPageBase;
import com.qaprosoft.carina.myfp.common.SettingsPageBase;

public enum SettingsEnum {
    MY_ACCOUNT("My Account", SettingsPageBase.class),
    EDIT_PROFILE("Edit Profile", SettingsPageBase.class),
    MY_GOALS("My Goals", MyGoalsPageBase.class),
    PREMIUM_SUBSCRIPTION("Premium Subscription", SettingsPageBase.class),
    MY_APPS_AND_DEVICES("My Apps & Devices", SettingsPageBase.class),
    DELETE_ACCOUNT("Delete Account", SettingsPageBase.class),
    MY_APPS_DEVICES("My Apps & Devices", SettingsPageBase.class),
    CHANGE_PASSWORD("Change Password", SettingsPageBase.class),
    LOG_OUT("Log Out", SettingsPageBase.class);

    private String name;
    private Class<? extends AbstractPage> pageClass;

    SettingsEnum(String name, Class<? extends AbstractPage> pageClass) {
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

