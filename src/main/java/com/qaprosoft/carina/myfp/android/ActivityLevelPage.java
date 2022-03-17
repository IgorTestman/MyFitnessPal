package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.ActivityLevelPageBase;
import com.qaprosoft.carina.myfp.common.YouPageBase;
import com.qaprosoft.carina.myfp.utils.enums.ActivityLevel;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ActivityLevelPageBase.class)
public class ActivityLevelPage extends ActivityLevelPageBase implements IMobileUtils, TimeConstants {
    public ActivityLevelPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@text='%s']")
    private ExtendedWebElement selectLevelButton;

    @FindBy(xpath = "//android.widget.ImageButton[@index='0']")
    private ExtendedWebElement backToGoalBtn;

    @FindBy(id = "com.myfitnesspal.android:id/buttonNext")
    private ExtendedWebElement nextBtn;

    @Override
    public void clickOnBackButton() {
        backToGoalBtn.click();
    }

    @Override
    public boolean isButtonActive(String activityLevel) {
        return selectLevelButton.format(activityLevel).isPresent(THREE_SECONDS);
    }

    @Override
    public void clickOnNextButton() {
        nextBtn.click();
    }

    @Override
    public YouPageBase selectActivity(ActivityLevel activityLevel) {
        selectLevelButton.format(activityLevel.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), YouPageBase.class);
    }
}
