package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import org.openqa.selenium.WebDriver;

public abstract class FoodPageBase extends AbstractPage implements TextConstants {

    public FoodPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract AddFoodPageBase clickOnChosenFood();

    public abstract void clickOnSearchedFoodList();

    public abstract void typeFood(String food);

    public abstract void addFood(String SALAD_ASIAN);

}

