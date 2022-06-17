package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MyGoalsPageBase extends AbstractPage {
    public MyGoalsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnMyGoals();

    public abstract void clickOnCurrentWeightButton();

    public abstract void clickOnYesButton();

    public abstract void typeCurrentWeight(String currentWeight);

    public abstract void clickOnSetButton();

    public abstract String isAlertTextWeightPresent();

    public abstract void clickOnDismissButton();

    public abstract String isAlertTextPresent();

    public abstract void clickOnGoalWeightButton();

    public abstract boolean isMaxValuePresent();

    public abstract String getChosenWeightText();

    public abstract String getChosenGoalWeightText();

    public abstract boolean scrollPage();

    public abstract void clickOnOtherSetButton();

}
