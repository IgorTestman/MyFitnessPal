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

    @FindBy(xpath = "//*[@text = '%s']/parent::*/parent::*/parent::*//*[contains(@resource-id, 'id/text')]")
    private ExtendedWebElement valueWeight;

    @Override
    public String getAlertTitle() {
        alertTitleText.isElementPresent(THREE_SECONDS);
        return alertTitle.getText();
    }

    @Override
    public String getAlertText() {
        return alertTitleText.getText();
    }

    @Override
    public boolean isEnteredWeightPresent(String weight) {
        return itemByName.format(weight).isElementPresent(THREE_SECONDS);
    }

// * openWeightMenu
    @Override
    public MyGoalsPageBase setWeightButton(MyGoalsEnum weight) {
        itemByName.format(weight.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), MyGoalsPageBase.class);
    }

    @Override
    public MyGoalsPageBase setCurrentWeight(double currentWeight) {
        itemByName.format(MyGoalsEnum.CURRENT_WEIGHT.getName()).click(THREE_SECONDS);
        clickOnButtonByName(YES);
        inputCurrentWeightField.type(String.valueOf(currentWeight));
        clickOnButtonByName(SET);
        return initPage(getDriver(), MyGoalsPageBase.class);
    }


    @Override
    public MyGoalsPageBase setGoalWeight(double value) {
        itemByName.format(MyGoalsEnum.GOAL_WEIGHT.getName()).click(THREE_SECONDS);
        clickOnButtonByName(YES);
        ExtendedWebElement maxValue = inputNumberPickerField.format(value);
        swipe(maxValue, Direction.UP, SIXTY_SWIPES, FAST_SWIPES);
        clickOnButtonByName(SET);
        return initPage(getDriver(), MyGoalsPageBase.class);
    }

    @Override
    public void clickOnButtonByName(String buttons) {
        buttonByName.format(buttons).click();

    }

    @Override
    public double getCurrentWeight(String value) {
        String parseValue = valueWeight.format(MyGoalsEnum.CURRENT_WEIGHT.getName()).getText();
        String[] parseNewValue = parseValue.split("\\D+");
        return Double.parseDouble(String.join(".", parseNewValue));
    }

    @Override
    public double getGoalWeight(String value) {
        String parseValue = valueWeight.format(MyGoalsEnum.GOAL_WEIGHT.getName()).getText();
        String[] parseNewValue = parseValue.split("\\D+");
        return Double.parseDouble(String.join(".", parseNewValue));
    }
}
