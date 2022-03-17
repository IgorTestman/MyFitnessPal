package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.YouPage;
import org.openqa.selenium.WebDriver;

public abstract class WeeklyGoalPageBase extends AbstractPage {

    public WeeklyGoalPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage selectWeightUnitFromDropdown(YouPage weight);

    public abstract void typeWeight(int date);

    public abstract boolean isWeightUnitSelected(String unit);

    public abstract void clickOnSetButton();

    public abstract AbstractPage switchToWeeklyGoal(YouPage weeklyGoal);

    public abstract boolean isWeeklyGoalSelected(String weeklyGoal);

    public abstract void typeWeightAgain(int weight);

    public abstract void clickToOpenDropdownWeight();

}
