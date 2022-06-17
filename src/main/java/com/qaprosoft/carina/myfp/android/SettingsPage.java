package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.MyGoalsPageBase;
import com.qaprosoft.carina.myfp.common.SettingsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SettingsPageBase.class)
public class SettingsPage extends SettingsPageBase implements TimeConstants {

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/textMyGoals")
    private ExtendedWebElement myGoalsTab;

    @Override
    public MyGoalsPageBase clickOnMyGoalsTab() {
        myGoalsTab.click(THREE_SECONDS);
        return initPage(getDriver(), MyGoalsPageBase.class);
    }

}


