package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.MePageBase;
import com.qaprosoft.carina.myfp.common.MyGoalsPageBase;
import com.qaprosoft.carina.myfp.common.SettingsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.Settings;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SettingsPageBase.class)
public class SettingsPage extends SettingsPageBase implements TimeConstants {

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    // * edited correct implementation of method
    @FindBy(id = "com.myfitnesspal.android:id/textMyGoals")
    private ExtendedWebElement myGoalsTab;

    @Override
    public MyGoalsPageBase isPageOpened(Settings tab) {
        myGoalsTab.format(tab.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), MyGoalsPageBase.class);
    }

}

