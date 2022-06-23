package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.MyGoalsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyGoalsPageBase.class)
public class MyGoalsPage extends MyGoalsPageBase implements TimeConstants, IMobileUtils, TextConstants {

    public MyGoalsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement itemByName;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker")
    private ExtendedWebElement numberPicker;

    @FindBy(xpath = "//android.widget.Button[@text='%s']")
    private ExtendedWebElement buttonByName;

    @FindBy(id = "com.myfitnesspal.android:id/txtValue")
    private ExtendedWebElement inputCurrentWeightField;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter your current weight.']")
    private ExtendedWebElement alertTitle;

    @FindBy(id = "com.myfitnesspal.android:id/alertTitle")
    private ExtendedWebElement alertTitleText;

    @FindBy(xpath = "//android.widget.EditText[@text='%s']")
    private ExtendedWebElement inputNumberPickerField;


    @Override
    public String isAlertTextWeightPresent() {
        alertTitleText.isElementPresent(THREE_SECONDS);
        return alertTitle.getText();
    }

    @Override
    public String isAlertTextPresent() {
        return alertTitleText.getText();
    }

    @Override
    public boolean isEnteredWeightPresent(String weight) {
        return itemByName.format(weight).isElementPresent(THREE_SECONDS);
    }

    @Override
    public MyGoalsPageBase clickOnWeightButton(MyGoalsEnum weight) {
        itemByName.format(weight.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), MyGoalsPageBase.class);
    }

    @Override
    public String typeRandomWeight(double randomWeight) {
        clickOnButtonByName(YES);
        inputCurrentWeightField.type(String.valueOf(randomWeight));
        clickOnButtonByName(SET);
        if (randomWeight<=1500 && randomWeight>=999) {
            return isAlertTextPresent();
        }
        return String.valueOf(randomWeight);
    }


    @Override
    public boolean isMaxGoalWeightPresent(int value) {
        ExtendedWebElement maxValue = inputNumberPickerField.format(value);
        return swipe(maxValue, Direction.UP, SIXTY_SWIPES, FAST_SWIPES);
    }

    @Override
    public void clickOnButtonByName(String buttons) {
         buttonByName.format(buttons).click();

    }
}