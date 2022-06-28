package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.YouPageEnum;
import org.openqa.selenium.WebDriver;

public abstract class WeeklyGoalPageBase extends AbstractPage {

    public WeeklyGoalPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract WeeklyGoalPageBase selectWeightUnitFromDropdown(YouPageEnum weight);

    public abstract void typeWeight(String value);

    public abstract boolean isWeightUnitSelected(String unit);

    public abstract void clickOnSetButton();

    public abstract WeeklyGoalPageBase switchToWeeklyGoal(YouPageEnum weeklyGoal);

    public abstract boolean isWeeklyGoalSelected(String weeklyGoal);

    public abstract void typeWeightAgain(String weight);

    public abstract void clickToOpenDropdownWeight();

    public abstract CreateAccountPageBase followToCreateAccountPage();

    public abstract String getInputWeightText();

}
