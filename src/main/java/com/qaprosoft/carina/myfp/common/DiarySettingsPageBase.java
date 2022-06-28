package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import org.openqa.selenium.WebDriver;

public abstract class DiarySettingsPageBase extends AbstractPage implements TextConstants {

    public DiarySettingsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void clickOnTimeStampsCheckbox();

    public abstract DiaryPageBase clickOnBackButton();

    public abstract boolean checkBoxChecked(boolean checked);

}
