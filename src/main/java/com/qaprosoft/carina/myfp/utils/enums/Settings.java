package com.qaprosoft.carina.myfp.utils.enums;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.UserPageBase;

public enum Settings {
    MY_ACCOUNT("My Account", UserPageBase.class),
    EDIT_PROFILE("Edit Profile", UserPageBase.class),
    MY_GOALS("My Goals", UserPageBase.class),
    PREMIUM_SUBSCRIPTION("Premium Subscription", UserPageBase.class),
    MY_APPS_AND_DEVICES("My Apps & Devices", UserPageBase.class),
    DELETE_ACCOUNT("Delete Account", UserPageBase.class),
    MY_APPS_DEVICES("My Apps & Devices", UserPageBase.class),
    CHANGE_PASSWORD("Change Password", UserPageBase.class),
    LOG_OUT("Log Out", UserPageBase.class);

    // * created new enum for Settings POF
    private String name;
    private Class<? extends AbstractPage> pageClass;

    Settings (String name, Class<? extends AbstractPage> pageClass) {
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

