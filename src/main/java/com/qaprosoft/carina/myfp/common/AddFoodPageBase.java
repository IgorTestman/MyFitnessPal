package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import org.openqa.selenium.WebDriver;

public abstract class AddFoodPageBase extends AbstractPage implements TextConstants {

    public AddFoodPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract DiaryPageBase clickOnSaveButton();

    public abstract void clickOnPopUp();

    public abstract void clickOnToolTitle();

}

