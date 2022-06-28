package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.AddFoodPageBase;
import com.qaprosoft.carina.myfp.common.DiaryPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = AddFoodPageBase.class)
public class AddFoodPage extends AddFoodPageBase implements TimeConstants, IMobileUtils, TextConstants {

    public AddFoodPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc='NO THANKS']")
    private ExtendedWebElement toolTipDescription;

    @FindBy(id = "com.myfitnesspal.android:id/menu_action_item")
    private ExtendedWebElement saveButton;

    @FindBy(id = "netcarbs_tooltip_title")
    private ExtendedWebElement toolTitle;

    @Override
    public void clickOnPopUp() {
        toolTipDescription.click(FIVE_SECONDS);
    }

    @Override
    public void clickOnToolTitle() {
        toolTipDescription.clickIfPresent(THREE_SECONDS);

    }


    @Override
    public DiaryPageBase clickOnSaveButton() {
        saveButton.click(SEVEN_SECONDS);
        waitUntil(ExpectedConditions.visibilityOf(saveButton.getElement()), TEN_TIMEOUT);
        return initPage(getDriver(), DiaryPageBase.class);
    }
}