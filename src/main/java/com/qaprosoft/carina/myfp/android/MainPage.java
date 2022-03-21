package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.MainPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MainPageBase.class)
public class MainPage extends MainPageBase implements IMobileUtils, TimeConstants {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open Drawer']")
    private ExtendedWebElement burgerMenuButton;

    @FindBy(id = "com.myfitnesspal.android:id/imageClose")
    private ExtendedWebElement imageCloseButton;

    @Override
    public boolean isPageDownloaded() {
        return imageCloseButton.isElementPresent();
    }

    @Override
    public boolean closeImage() {
        return waitUntil(ExpectedConditions.visibilityOfElementLocated(imageCloseButton.getBy()), SIXTEEN_SECONDS);
    }
}