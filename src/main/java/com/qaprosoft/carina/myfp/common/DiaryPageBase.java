package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.DiaryEnum;
import com.qaprosoft.carina.myfp.utils.enums.TimeStampEnum;
import com.qaprosoft.carina.myfp.utils.enums.ViewOptionsDiaryEnum;
import org.openqa.selenium.WebDriver;

public abstract class DiaryPageBase extends AbstractPage implements TextConstants {

    public DiaryPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpen();

    public abstract boolean editFoodButtonIsPresent();

    public abstract boolean isMealTimePresent(String meal);

    public abstract boolean isAddedFoodPresent();

    public abstract boolean isMealMacrosPresent();

    public abstract String  getAddedMealText(String food);

    public abstract String getAddedFoodNameText();

    public abstract String getAddedFoodCaloriesText();

    public abstract String getAddedFoodDetailsText();

    public abstract DiarySettingsPageBase clickOnOptions(ViewOptionsDiaryEnum options);

    public abstract void clickOnTimeStamp();

    public abstract DiaryPageBase selectEditTimeStamp(TimeStampEnum timeStamp);

    public abstract void typeHours(int hours);

    public abstract void typeMinutes(int hours);

    public abstract void enterTime();

    public abstract String getAddedTimeStampsText();

    public abstract String getTimeStampsText();

    public abstract MealPageBase clickOnAddFoodButton(DiaryEnum diary);

    public abstract void selectTimeFormat();

    public abstract String getNameOfAddedFood();

    public abstract String getCaloriesOfAddedFood();

    public abstract String getDetailsOfAddedFood();

    }


