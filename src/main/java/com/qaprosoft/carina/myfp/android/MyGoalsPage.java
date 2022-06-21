package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.MyGoalsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.Goals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MyGoalsPageBase.class)
public class MyGoalsPage extends MyGoalsPageBase implements TimeConstants, IMobileUtils {

    public MyGoalsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/textMyGoals")
    private ExtendedWebElement myGoalsTab;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement weightButton;

    @FindBy(xpath = "//android.widget.LinearLayout/android.widget.LinearLayout/android.widget.NumberPicker")
    private ExtendedWebElement numberPicker;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement okButton;

    @FindBy(id = "com.myfitnesspal.android:id/txtValue")
    private ExtendedWebElement typeCurrentWeight;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter your current weight.']")
    private ExtendedWebElement alertTitle;

    @FindBy(id = "com.myfitnesspal.android:id/alertTitle")
    private ExtendedWebElement alertTitleText;

   // * removed all unnecessary web elements, created flexible xpath's and methods
    @Override
    public void clickOnMyGoals() {
        myGoalsTab.click(THREE_SECONDS);
    }


    @Override
    public void clickOnYesButton() {
        okButton.click(THREE_SECONDS);
    }

    @Override
    public void typeCurrentWeight(String currentWeight) {
        clickOnYesButton();
        typeCurrentWeight.type(String.valueOf(currentWeight));
        okButton.click();
    }

    @Override
    public void clickOnSetButton() {
        okButton.click(THREE_SECONDS);
    }

    @Override
    public String isAlertTextWeightPresent() {
        return alertTitle.getText();
    }

    @Override
    public void clickOnDismissButton() {
        okButton.click(THREE_SECONDS);
    }

    @Override
    public String isAlertTextPresent() {
        return alertTitleText.getText();
    }

    @Override
    public boolean isMaxGoalWeightPresent() {
            return swipeInContainer(numberPicker, Direction.UP, SIXTY_SWIPES, FAST_SWIPES);
        }

    @Override
    public boolean getChosenWeightText(String weight) {
        return weightButton.format(weight).isElementPresent();
    }

    @Override
    public boolean getChosenGoalWeightText(String goalWeight) {
        return weightButton.format(goalWeight).isElementPresent();
    }

    @Override
    public MyGoalsPageBase clickOnWeightButton(Goals weight) {
        weightButton.format(weight.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), MyGoalsPageBase.class);
    }

    @Override
    public int typeRandomWeight(int randomWeight) {
        clickOnYesButton();
        randomWeight = new Random().nextInt(1000);
        typeCurrentWeight.type(String.valueOf(randomWeight));
        okButton.click();
        return randomWeight;
    }
}



