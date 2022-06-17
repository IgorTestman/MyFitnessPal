package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.MePageBase;
import com.qaprosoft.carina.myfp.common.SettingsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MePageBase.class)
public class MePage extends MePageBase implements TimeConstants {

    public MePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/action_me")
    private ExtendedWebElement meTab;

    @FindBy(id = "com.myfitnesspal.android:id/settingsButton")
    private ExtendedWebElement settingsIcon;

    @Override
    public void clickOnMeTab() {
        meTab.click(THREE_SECONDS);
    }

    @Override
    public SettingsPageBase followToSettingsPage() {
        settingsIcon.click(THREE_SECONDS);
        return initPage(getDriver(), SettingsPageBase.class);
    }
}


