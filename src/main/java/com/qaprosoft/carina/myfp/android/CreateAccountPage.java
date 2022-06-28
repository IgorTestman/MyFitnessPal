package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.CreateAccountPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CreateAccountPageBase.class)
public class CreateAccountPage extends CreateAccountPageBase implements IMobileUtils, TimeConstants, TextConstants {
    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/emailEdit")
    private ExtendedWebElement emailField;

    @FindBy(id = "com.myfitnesspal.android:id/passwordEdit")
    private ExtendedWebElement passwordField;

    @FindBy(id = "com.myfitnesspal.android:id/sign_up")
    private ExtendedWebElement signUpButton;

    @FindBy(xpath = "//android.widget.TextView[@text='The email address you entered is invalid. Please update it and try again.']")
    private ExtendedWebElement errorMessage;

    @FindBy(xpath = "//android.widget.TextView[@text='Error']")
    private ExtendedWebElement errorIcon;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement errorOkButton;

    @Override
    public void typePassword(String value) {
        passwordField.type(String.valueOf(value));
    }

    @Override
    public void typeEmail(String email) {
        emailField.type(String.valueOf(email));
    }

    @Override
    public void clickOnSignUpButton() {
        signUpButton.click();
    }

    @Override
    public boolean isErrorMessagePresent() {
        return errorIcon.isElementPresent();
    }

    @Override
    public void clickOnOkButton() {
        errorOkButton.click();
    }

    @Override
    public String inputEmailPresent() {
        return emailField.getText();
    }

    @Override
    public String inputPasswordPresent() {
        return passwordField.getText();
    }
}


