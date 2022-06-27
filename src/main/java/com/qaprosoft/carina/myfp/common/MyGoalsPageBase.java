package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.MyGoalsEnum;
import org.openqa.selenium.WebDriver;

public abstract class MyGoalsPageBase extends AbstractPage {
    public MyGoalsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract String getAlertTitle();

    public abstract String getAlertText();

    public abstract boolean isEnteredWeightPresent(String weight);

    public abstract AbstractPage setWeightButton(MyGoalsEnum weight);

    public abstract MyGoalsPageBase setCurrentWeight(double randomWeight);

    public abstract MyGoalsPageBase setGoalWeight(double value);

    public abstract void clickOnButtonByName(String buttons);

    public abstract double getCurrentWeight(String value);

    public abstract double getGoalWeight(String value);

    }
