package com.qaprosoft.carina.myfp.android;


import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.CreateAccountPageBase;
import com.qaprosoft.carina.myfp.common.MyGoalsPageBase;
import com.qaprosoft.carina.myfp.common.WeeklyGoalPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.YouPageEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WeeklyGoalPageBase.class)
public class WeeklyGoalPage extends WeeklyGoalPageBase implements TimeConstants, IMobileUtils, TextConstants {

    public WeeklyGoalPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/units")
    private ExtendedWebElement unitsDropdown;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='%s']")
    private ExtendedWebElement itemByText;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement getItemByChosenText;

    @FindBy(id = "com.myfitnesspal.android:id/inputGoalWeight")
    private ExtendedWebElement goaLWeightDropdown;

    @FindBy(id = "com.myfitnesspal.android:id/entry_one")
    private ExtendedWebElement inputWeight;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement setButton;

    @FindBy(xpath = "//android.widget.RadioButton[@text='%s']")
    private ExtendedWebElement radioButtonByText;

    @FindBy(id = "com.myfitnesspal.android:id/buttonNext")
    private ExtendedWebElement nextButton;

    @FindBy(id = "com.myfitnesspal.android:id/container")
    private ExtendedWebElement container;

    @Override
    public void typeWeight(String value) {
        goaLWeightDropdown.click();
        inputWeight.type(String.valueOf(value));
    }

    @Override
    public WeeklyGoalPageBase selectWeightUnitFromDropdown(YouPageEnum weight) {
        unitsDropdown.click();
        itemByText.format(weight.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), WeeklyGoalPageBase.class);
    }

    @Override
    public boolean isWeightUnitSelected(String unit) {
        return getItemByChosenText.format(unit).isElementPresent(THREE_SECONDS);
    }

    @Override
    public void clickOnSetButton() {
        setButton.click();
        hideKeyboard();
    }

    @Override
    public WeeklyGoalPageBase switchToWeeklyGoal(YouPageEnum weeklyGoal) {
        radioButtonByText.format(weeklyGoal.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), WeeklyGoalPageBase.class);
    }

    @Override
    public boolean isWeeklyGoalSelected(String weeklyGoal) {
        return radioButtonByText.format(weeklyGoal).isElementPresent(THREE_SECONDS);
    }

    @Override
    public void typeWeightAgain(String weight) {
        inputWeight.type(String.valueOf(weight));
    }

    @Override
    public void clickToOpenDropdownWeight() {
        goaLWeightDropdown.click();
    }

    @Override
    public CreateAccountPageBase followToCreateAccountPage() {
        swipe(nextButton, container, 5);
        nextButton.click(THREE_SECONDS);
        return initPage(getDriver(), CreateAccountPageBase.class);
    }
    @Override
    public String getInputWeightText() {
        return inputWeight.getText();
    }
}