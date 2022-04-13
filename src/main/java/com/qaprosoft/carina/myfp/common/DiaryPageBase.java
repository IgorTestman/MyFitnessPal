package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import org.openqa.selenium.WebDriver;

public abstract class DiaryPageBase extends AbstractPage implements TextConstants {

    public DiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpen();

    public abstract boolean editFoodButtonIsPresent();

    public abstract boolean isMealTimePresent(String meal);

    public abstract String isCaloriesOfMealTimePresent();

    public abstract String isMealMacrosPresent();

    public abstract String isNameOfAddedFoodPresent();

    public abstract String isCaloriesOfAddedFoodPresent();

    public abstract String isDetailsOfAddedFoodPresent();

    public abstract BreakfastPageBase clickOnAddFoodButton();

    public abstract String getAddedFoodName();

    public abstract String getAddedFoodCalories();

    public abstract String getAddedFoodDetails();

}
