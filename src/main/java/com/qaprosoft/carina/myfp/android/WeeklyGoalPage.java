package com.qaprosoft.carina.myfp.android;


import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.WeeklyGoalPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.YouPage;
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
    private ExtendedWebElement unitsWeight;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement chosenUnitsWeight;

    @FindBy(id = "com.myfitnesspal.android:id/goal_weight")
    private ExtendedWebElement goaLWeightDropdown;

    @FindBy(id = "com.myfitnesspal.android:id/entry_one")
    private ExtendedWebElement inputWeight;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement setButton;

    @FindBy(xpath = "//android.widget.RadioButton[@text='%s']")
    private ExtendedWebElement weeklyGoalRadioButton;


    @Override
    public void typeWeight(int date) {
        goaLWeightDropdown.click();
        inputWeight.type(String.valueOf(date));
    }

    @Override
    public AbstractPage selectWeightUnitFromDropdown(YouPage weight) {
        unitsDropdown.click();
        unitsWeight.format(weight.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), weight.getPageClass());
    }

    @Override
    public boolean isWeightUnitSelected(String unit) {
        return chosenUnitsWeight.format(unit).isElementPresent(THREE_SECONDS);
    }

    @Override
    public void clickOnSetButton() {
        setButton.click();
        hideKeyboard();
    }

    @Override
    public AbstractPage switchToWeeklyGoal(YouPage weeklyGoal) {
        weeklyGoalRadioButton.format(weeklyGoal.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), weeklyGoal.getPageClass());
    }

    @Override
    public boolean isWeeklyGoalSelected(String weeklyGoal) {
        return weeklyGoalRadioButton.format(weeklyGoal).isElementPresent(THREE_SECONDS);
    }

    @Override
    public void typeWeightAgain(int weight) {
        inputWeight.type(String.valueOf(weight));
    }

    @Override
    public void clickToOpenDropdownWeight() {
        goaLWeightDropdown.click();
    }
}