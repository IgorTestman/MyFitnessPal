package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.DiaryEnum;
import com.qaprosoft.carina.myfp.utils.enums.Goals;
import com.qaprosoft.carina.myfp.utils.enums.MyGoalsEnum;
import org.openqa.selenium.WebDriver;

public abstract class MyGoalsPageBase extends AbstractPage {
    public MyGoalsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeCurrentWeight(double currentWeight);

    public abstract void clickOnSetButton();

    public abstract String isAlertTextWeightPresent();

    public abstract void clickOnDismissButton();

    public abstract String isAlertTextPresent();

    public abstract boolean isEnteredWeightPresent(String weight);

    public abstract boolean isEnteredGoalWeightPresent(String goalWeight);

    public abstract AbstractPage clickOnWeightButton(MyGoalsEnum weight);

    public abstract int typeRandomWeight(int randomWeight);

    public abstract boolean isMaxGoalWeightPresent(String value);

    public abstract AbstractPage clickOnButton(MyGoalsEnum buttons);

    }
