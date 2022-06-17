package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SettingsPageBase extends AbstractPage {
    public SettingsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract MyGoalsPageBase clickOnMyGoalsTab();

}


