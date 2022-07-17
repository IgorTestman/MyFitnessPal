package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import org.openqa.selenium.WebDriver;

public abstract class MacronutrientsPageBase extends AbstractPage implements TextConstants {

    public MacronutrientsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract int getUpdatedCarbsWeight();

    public abstract int getUpdatedProteinWeight();

    public abstract int getUpdatedFatWeight();

    public abstract void setMacronutrientsPercentage(int carb, int protein, int fat);

    public abstract void clickOnDoneButton();

    public abstract void clickOnBackButton();

    public abstract int getTotal(String total);

    public abstract void resetPercentageValues(int reset);
}