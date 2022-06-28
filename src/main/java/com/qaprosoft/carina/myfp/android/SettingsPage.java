package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.SettingsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.SettingsEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SettingsPageBase.class)
public class SettingsPage extends SettingsPageBase implements TimeConstants {

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/textMyGoals")
    private ExtendedWebElement itemByText;

    @Override
    public AbstractPage openPageByName(SettingsEnum page) {
        itemByText.format(page.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), page.getPageClass());
    }

}

