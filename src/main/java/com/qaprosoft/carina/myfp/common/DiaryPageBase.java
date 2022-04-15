package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.TimeStamp;
import com.qaprosoft.carina.myfp.utils.enums.ViewOptionsDiaryEnum;
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

    public abstract MealPageBase clickOnAddFoodButton();

    public abstract String getAddedMealName();

    public abstract boolean getAddedFoodName();

    public abstract boolean getAddedFoodCalories();

    public abstract boolean getAddedFoodDetails();

    public abstract boolean getMeal();

    public abstract DiarySettingsPageBase clickOnOptions(ViewOptionsDiaryEnum options);

    public abstract void clickOnTimeStamp();

    public abstract AbstractPage selectEditTimeStamp(TimeStamp timeStamp);

    public abstract void typeHours(String hours);

    public abstract void typeMinutes(String hours);

    public abstract void enterTime();

    public abstract String getAddedTimeStamps();

    public abstract String isTimeStampPresent();

}
