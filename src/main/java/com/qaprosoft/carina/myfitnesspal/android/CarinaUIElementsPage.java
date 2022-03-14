package com.qaprosoft.carina.myfitnesspal.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.UIElementsPageBase;
import com.qaprosoft.carina.igor.common.CarinaUIElementsPageBase;
import com.qaprosoft.carina.igor.utils.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CarinaUIElementsPageBase.class)
public class CarinaUIElementsPage extends CarinaUIElementsPageBase implements IConstants, IMobileUtils {

    @FindBy(id = "editText")
    private ExtendedWebElement textField;

    @FindBy(id = "editText2")
    private ExtendedWebElement emailField;

    @FindBy(id = "editText3")
    private ExtendedWebElement dateField;

    @FindBy(id = "checkBox2")
    private ExtendedWebElement checkBoxButton;

    @FindBy(id = "com.solvd.carinademoapplication:id/radioButton")
    private ExtendedWebElement maleRadioButton;

    @FindBy(id = "com.solvd.carinademoapplication:id/radioButton3")
    private ExtendedWebElement femaleRadioButton;

    @FindBy(id = "com.solvd.carinademoapplication:id/radioButton5")
    private ExtendedWebElement otherRadioButton;

    @FindBy(id = "radioButton5")
    private ExtendedWebElement seekBarRadioButton;

    @FindBy(xpath = "//android.widget.ScrollView[@index='0']")
    private ExtendedWebElement container;

    @FindBy(id = "com.solvd.carinademoapplication:id/progressBar2")
    private ExtendedWebElement progressBar;
    @FindBy(id = "com.solvd.carinademoapplication:id/switch1")
    private ExtendedWebElement switchBtn;

    public CarinaUIElementsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeText(String text) {
        textField.type(text);
    }

    @Override
    public void typeEmail(String email) {
        emailField.type(email);
    }

    @Override
    public String getEmail() {
        return emailField.getText();
    }

    @Override
    public String getText() {
        return textField.getText();
    }

    @Override
    public String getDate() {
        return dateField.getText();
    }

    @Override
    public void typeDate(String date) {
        dateField.type(date);
    }

    @Override
    public void clickOnMaleRadioButton() {
        maleRadioButton.click();
    }

    @Override
    public void clickOnFemaleRadioButton() {
        femaleRadioButton.click();
    }

    @Override
    public void clickOnOtherRadioButton() {
        otherRadioButton.click();
    }

    @Override
    public boolean isFemaleRadioButtonSelected() {
        return femaleRadioButton.isChecked();
    }

    @Override
    public boolean isOthersRadioButtonSelected() {
        return otherRadioButton.isChecked();
    }

    @Override
    public void checkCopy() {
        checkBoxButton.click();
    }

    @Override
    public boolean isProgressBarPresent() {
        return progressBar.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isSwitchBtnPresent() {
        return switchBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isCopyChecked() {
        return checkBoxButton.isChecked();
    }

    @Override
    public void swipeToProgressBar() {
        swipe(switchBtn, container, 10);
    }
    @Override
    public void swipeToFemaleRadioButton() {
        swipe(femaleRadioButton, container, 10);
    }


}
