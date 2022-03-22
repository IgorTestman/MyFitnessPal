package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.ActivityLevel;
import org.openqa.selenium.WebDriver;

public abstract class ActivityLevelPageBase extends AbstractPage {

    public ActivityLevelPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnBackButton();

    public abstract boolean isButtonActive(String activityLevel);

    public abstract void clickOnNextButton();

    public abstract YouPageBase selectActivity(ActivityLevel activityLevel);

}
