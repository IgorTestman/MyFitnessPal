package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.DiaryPageBase;
import com.qaprosoft.carina.myfp.common.DiarySettingsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiarySettingsPageBase.class)
public class DiarySettingsPage extends DiarySettingsPageBase implements TimeConstants {
    public DiarySettingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/settings_food_timestamps")
    private ExtendedWebElement foodTimeStamps;

    @FindBy(id = "com.myfitnesspal.android:id/settings_food_timestamps")
    private ExtendedWebElement checkBox;

    @FindBy(className = "android.widget.ImageButton")
    private ExtendedWebElement backButton;


    @Override
    public void clickOnTimeStampsCheckbox() {
        foodTimeStamps.isElementPresent();
        foodTimeStamps.click(THREE_SECONDS);
    }

    @Override
    public DiaryPageBase clickOnBackButton() {
        backButton.click(THREE_SECONDS);
        waitUntil(ExpectedConditions.visibilityOf(backButton.getElement()), TEN_TIMEOUT);
        return initPage(getDriver(), DiaryPageBase.class);
    }

    @Override
    public boolean checkBoxChecked(boolean checked) {
        if (checked) {
            checkBox.uncheck();
        } else {
            checkBox.check();
        }
        return checkBox.isChecked();
    }

}
