package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.DefaultGoalEnum;
import org.openqa.selenium.WebDriver;

public abstract class CaloriesAndMacroGoalsPageBase extends AbstractPage {

    public CaloriesAndMacroGoalsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract MacronutrientsPageBase openMacronutrientsPage(DefaultGoalEnum calories);

    public abstract int getCarbsPercentage();

    public abstract int getProteinPercentage();

    public abstract int getFatPercentage();

    public abstract int getSavedCarbsWeight();

    public abstract int getSavedProteinWeight();

    public abstract int getSavedFatWeight();

    public abstract int getCurrentCalories();

    public abstract int getUpdatedCalories();
}
