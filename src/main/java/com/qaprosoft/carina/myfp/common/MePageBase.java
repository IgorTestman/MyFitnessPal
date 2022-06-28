package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MePageBase extends AbstractPage {
    public MePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnMeTab();

    public abstract SettingsPageBase followToSettingsPage();

}
