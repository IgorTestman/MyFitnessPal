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

    public abstract AbstractPage clickOnWeightButton(MyGoalsEnum weight);

    public abstract double typeRandomWeight(double randomWeight);

    public abstract boolean isMaxGoalWeightPresent(int value);

    public abstract void clickOnButtonByName(String buttons);

    }
