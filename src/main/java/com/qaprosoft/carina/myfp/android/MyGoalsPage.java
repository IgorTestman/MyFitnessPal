package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.MyGoalsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Random;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyGoalsPageBase.class)
public class MyGoalsPage extends MyGoalsPageBase implements TimeConstants, IMobileUtils {

    public MyGoalsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/textMyGoals")
    private ExtendedWebElement myGoalsTab;

    @FindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[2]")
    private ExtendedWebElement currentWeightButton;

    @FindBy(xpath = "//android.widget.ListView/android.widget.LinearLayout[3]")
    private ExtendedWebElement goalWeightButton;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker")
    private ExtendedWebElement numberPicker;

    @FindBy(xpath = "//android.widget.EditText [@text='1000']")
    private ExtendedWebElement scrollToMax;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement yesButton;

    @FindBy(id = "com.myfitnesspal.android:id/txtValue")
    private ExtendedWebElement typeCurrentWeight;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement setButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter your current weight.']")
    private ExtendedWebElement alertTitle;

    @FindBy(xpath = "//*[@resource-id='android:id/button1']")
    private ExtendedWebElement dismissButton;

    @FindBy(id = "com.myfitnesspal.android:id/alertTitle")
    private ExtendedWebElement alertTitleText;

    @FindBy(xpath = "//android.widget.TextView[@text='998 lbs']")
    private ExtendedWebElement textChosenWeight;

    @FindBy(xpath = "//android.widget.TextView[@text='1,000 lbs']")
    private ExtendedWebElement textChosenGoalWeight;

    @Override
    public void clickOnMyGoals() {
        myGoalsTab.click(THREE_SECONDS);
    }

    @Override
    public void clickOnCurrentWeightButton() {
        currentWeightButton.click(THREE_SECONDS);
    }

    @Override
    public void clickOnYesButton() {
        yesButton.click(THREE_SECONDS);
    }

    @Override
    public void typeCurrentWeight(String currentWeight) {
        clickOnCurrentWeightButton();
        clickOnYesButton();
        typeCurrentWeight.type(currentWeight);
        setButton.click();
    }

    @Override
    public void clickOnSetButton() {
        setButton.click(THREE_SECONDS);
    }

    @Override
    public void clickOnOtherSetButton() {
        waitUntil(ExpectedConditions.visibilityOf(textChosenGoalWeight.getElement()), TEN_TIMEOUT);
        setButton.click(THREE_SECONDS);
    }

    @Override
    public String isAlertTextWeightPresent() {
        return alertTitle.getText();
    }

    @Override
    public void clickOnDismissButton() {
        dismissButton.click(THREE_SECONDS);
    }

    @Override
    public String isAlertTextPresent() {
        return alertTitleText.getText();
    }

    @Override
    public void clickOnGoalWeightButton() {
        goalWeightButton.click(THREE_SECONDS);
        clickOnYesButton();
    }

    @Override
    public boolean isMaxValuePresent() {
        return swipe(scrollToMax, numberPicker, Direction.UP, SIXTY_SWIPES, FAST_SWIPES);
    }

    @Override
    public boolean scrollPage() {
        waitUntil(ExpectedConditions.visibilityOf(textChosenGoalWeight.getElement()), TEN_TIMEOUT);
        return swipeInContainer(numberPicker, Direction.UP, SIXTY_SWIPES, FAST_SWIPES);
    }

    @Override
    public String getChosenWeightText() {
        return textChosenWeight.getText();
    }

    @Override
    public String getChosenGoalWeightText() {
        return textChosenGoalWeight.getText();
    }
    @Override
    public void typeCurrentRandomWeight(String currentRandomWeight) {
        clickOnCurrentWeightButton();
        clickOnYesButton();
        Random random = new Random();
        currentRandomWeight = String.valueOf(random.nextInt(1000));
        typeCurrentWeight.type(currentRandomWeight);

        setButton.click();
    }
}



