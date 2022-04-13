package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import org.openqa.selenium.WebDriver;

public abstract class BreakfastPageBase extends AbstractPage implements TextConstants {

    public BreakfastPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AddFoodPageBase clickOnChosenFood();

    public abstract void clickOnSearchedFoodList();

    public abstract void typeFood(String food);

}

