package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.MyGoalsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyGoalsPageBase.class)
public class MyGoalsPage extends MyGoalsPageBase implements TimeConstants, IMobileUtils {

    public MyGoalsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement byName;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker")
    private ExtendedWebElement numberPicker;

    @FindBy(xpath = "//android.widget.Button[@text='%s']")
    private ExtendedWebElement buttonByName;

    @FindBy(id = "com.myfitnesspal.android:id/txtValue")
    private ExtendedWebElement typeCurrentWeight;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter your current weight.']")
    private ExtendedWebElement alertTitle;

    @FindBy(id = "com.myfitnesspal.android:id/alertTitle")
    private ExtendedWebElement alertTitleText;

    @FindBy(xpath = "//android.widget.EditText[@text='%s']")
    private ExtendedWebElement editButton;


    @Override
    public void typeCurrentWeight(double currentWeight) {
        typeCurrentWeight.type(String.valueOf(currentWeight));
    }

    @Override
    public void clickOnSetButton() {
        buttonByName.click(THREE_SECONDS);
    }

    @Override
    public String isAlertTextWeightPresent() {
        return alertTitle.getText();
    }

    @Override
    public void clickOnDismissButton() {
        buttonByName.click(THREE_SECONDS);
    }

    @Override
    public String isAlertTextPresent() {
        return alertTitleText.getText();
    }

    @Override
    public boolean isEnteredWeightPresent(String weight) {
        return byName.format(weight).isElementPresent();
    }

    @Override
    public boolean isEnteredGoalWeightPresent(String goalWeight) {
        return byName.format(goalWeight).isElementPresent();
    }

    @Override
    public AbstractPage clickOnWeightButton(MyGoalsEnum weight) {
        byName.format(weight.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), MyGoalsPageBase.class);
    }

    @Override
    public int typeRandomWeight(int randomWeight) {
        typeCurrentWeight.type(String.valueOf(randomWeight));
        return randomWeight;
    }

    @Override
    public boolean isMaxGoalWeightPresent(String value) {
        ExtendedWebElement maxValue = editButton.format(value);
        return swipe(maxValue, Direction.UP, SIXTY_SWIPES, FAST_SWIPES);
    }

    @Override
    public AbstractPage clickOnButton(MyGoalsEnum buttons) {
        buttonByName.format(buttons.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), MyGoalsPageBase.class);
    }
}