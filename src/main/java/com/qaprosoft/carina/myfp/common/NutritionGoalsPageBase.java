package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.CalorieAndMacroGoalsEnum;
import org.openqa.selenium.WebDriver;

public abstract class NutritionGoalsPageBase extends AbstractPage {
    public NutritionGoalsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AbstractPage openCalorieAndMacrosPage(CalorieAndMacroGoalsEnum calories);

    public abstract int getCarbsWeight();

    public abstract int getProteinWeight();

    public abstract int getFatWeight();

    public abstract NutritionGoalsPageBase setMacronutrientsPercentage(int carb, int protein, int fat);

    public abstract void clickOnDoneButton();


}

