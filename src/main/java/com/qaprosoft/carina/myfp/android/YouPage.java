package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.WeeklyGoalPageBase;
import com.qaprosoft.carina.myfp.common.YouPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = YouPageBase.class)
public class YouPage extends YouPageBase implements TimeConstants, IMobileUtils, TextConstants {

    public YouPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.RadioButton[@text='%s']")
    private ExtendedWebElement itemByGenderButton;

    @FindBy(id = "com.myfitnesspal.android:id/birthDate")
    private ExtendedWebElement birthDateField;

    @FindBy(id = "com.myfitnesspal.android:id/textCountry")
    private ExtendedWebElement countryDropdown;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement selectCountry;

    @FindBy(id = "com.myfitnesspal.android:id/nextButton")
    private ExtendedWebElement nextBtn;

    @FindBy(id = "com.myfitnesspal.android:id/buttonNext")
    private ExtendedWebElement nextButton;

    @FindBy(id = "com.myfitnesspal.android:id/height")
    private ExtendedWebElement heightButton;

    @FindBy(id = "com.myfitnesspal.android:id/current_weight")
    private ExtendedWebElement currentWeightButton;

    @FindBy(id = "com.myfitnesspal.android:id/entry_one")
    private ExtendedWebElement entryFirstValue;

    @FindBy(id = "com.myfitnesspal.android:id/current_weight")
    private ExtendedWebElement enteredCurrentWeight;

    @FindBy(id = "com.myfitnesspal.android:id/entry_two")
    private ExtendedWebElement entrySecondValue;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement setButton;

    @FindBy(id = "com.myfitnesspal.android:id/units")
    private ExtendedWebElement unitsDropdown;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='%s']")
    private ExtendedWebElement itemByText;

    @FindBy(xpath = "//android.widget.TextView[@text='%s']")
    private ExtendedWebElement itemByChosenText;

    @FindBy(xpath = "//android.widget.ImageButton[@index='0']")
    private ExtendedWebElement backButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Please enter a valid weight']")
    private ExtendedWebElement errorMessage;

    @Override
    public AbstractPage selectCountryFromDropdown(com.qaprosoft.carina.myfp.utils.enums.YouPage country) {
        countryDropdown.click();
        selectCountry.format(country.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), country.getPageClass());
    }

    @Override
    public void typeAge(String date) {
        birthDateField.type(String.valueOf(date));
    }

    @Override
    public AbstractPage clickOnGenderButton(com.qaprosoft.carina.myfp.utils.enums.YouPage gender) {
        itemByGenderButton.format(gender.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), gender.getPageClass());
    }

    @Override
    public boolean isCountrySelected(String country) {
        return countryDropdown.format(country).isClickable(THREE_SECONDS);
    }

    @Override
    public void clickOnNextButton() {
        nextButton.click();
    }

    @Override
    public boolean isGenderSelected(String gender) {
        return itemByGenderButton.format(gender).isClickable(THREE_SECONDS);
    }

    @Override
    public void clickOnHeightButton() {
        heightButton.click();
    }

    @Override
    public void clickOnWeightButton() {
        currentWeightButton.click();
    }

    @Override
    public void typeFirstHeight(String firstValue) {
        entryFirstValue.type(String.valueOf(firstValue));
    }

    @Override
    public void typeSecondHeight(String secondValue) {
        entrySecondValue.type(String.valueOf(secondValue));
    }

    @Override
    public void clickOnSetButton() {
        setButton.click();
        hideKeyboard();
    }

    @Override
    public void typeWeight(double value) {
        entryFirstValue.type(String.valueOf(value));
        clickOnSetButton();
    }

    @Override
    public AbstractPage selectHeightUnitFromDropdown(com.qaprosoft.carina.myfp.utils.enums.YouPage height) {
        unitsDropdown.click();
        itemByText.format(height.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), height.getPageClass());
    }

    @Override
    public boolean isHeightUnitSelected(String unit) {
        return itemByChosenText.format(unit).isElementPresent(THREE_SECONDS);
    }

    @Override
    public AbstractPage selectWeightUnitFromDropdown(com.qaprosoft.carina.myfp.utils.enums.YouPage weight) {
        unitsDropdown.click();
        itemByText.format(weight.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), weight.getPageClass());
    }

    @Override
    public boolean isWeightUnitSelected(String unit) {
        return itemByChosenText.format(unit).isElementPresent(THREE_SECONDS);
    }

    @Override
    public WeeklyGoalPageBase followToGoalWeight() {
        nextBtn.click(THREE_SECONDS);
        return initPage(getDriver(), WeeklyGoalPageBase.class);
    }

    @Override
    public void clickOnBackButton() {
        backButton.click();
    }

    @Override
    public void typeHeightInCentimeters(String height) {
        entryFirstValue.type(String.valueOf(height));
    }

    @Override
    public String isInputAgePresent() {
        return birthDateField.getText();
    }

    @Override
    public String isInputFirstHeightPresent() {
        return entryFirstValue.getText();
    }

    @Override
    public int isInputValuePresent(String value) {
        String newString = enteredCurrentWeight.format(value).getText();
        String[] newString2 = newString.split("\\D+");
        return Integer.parseInt(String.join("", newString2));
   }

    @Override
    public String isInputSecondHeightPresent() {
        return entrySecondValue.getText();
    }

    @Override
    public void inputValues() {
        clickOnGenderButton(com.qaprosoft.carina.myfp.utils.enums.YouPage.MALE);
        clickOnGenderButton(com.qaprosoft.carina.myfp.utils.enums.YouPage.FEMALE);
        typeAge("64");
        selectCountryFromDropdown(com.qaprosoft.carina.myfp.utils.enums.YouPage.ZAMBIA);
        clickOnNextButton();
        clickOnWeightButton();
        selectWeightUnitFromDropdown(com.qaprosoft.carina.myfp.utils.enums.YouPage.KILOGRAMS);
    }

    @Override
    public String errorMessageIsPresent() {
        return errorMessage.getText();
    }

}