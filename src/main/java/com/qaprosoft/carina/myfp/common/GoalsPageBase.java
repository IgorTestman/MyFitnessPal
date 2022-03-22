package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.Goals;
import org.openqa.selenium.WebDriver;

public abstract class GoalsPageBase extends AbstractPage {

    public GoalsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract ActivityLevelPageBase clickOnNextButton();

    public abstract void clickOnBackButton();

    public abstract boolean isAlertWindowPresent();

    public abstract boolean isErrorNamePresent();

    public abstract boolean isOkButtonPresent();

    public abstract void clickOnOkButton();

    public abstract String getErrorMessageText();

    public abstract boolean isAlertWindowGoalsPresent();

    public abstract boolean isOkButtonGoalsPresent();

    public abstract void clickOnOkButtonGoals();

    public abstract AbstractPage clickOnButton(Goals page);

    public abstract boolean isButtonActive(String goal);

    public abstract boolean isFollowUpPageOpened();

    public abstract boolean isFollowToStepsPageOpened();

    public abstract boolean isAchieveOfResultPageOpened();

    public abstract boolean isHelpToLookYouWantPageOpened();

    public abstract boolean isMoreDetailsPageOpened();

    public abstract ActivityLevelPageBase goToActivityLevelPage();

}

