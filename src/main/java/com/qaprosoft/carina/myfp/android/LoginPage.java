package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.LoginPageBase;
import com.qaprosoft.carina.myfp.common.StartPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase implements IMobileUtils, TimeConstants {

    @FindBy(id = "com.myfitnesspal.android:id/email_address_edit")
    private ExtendedWebElement emailField;

    @FindBy(id = "com.myfitnesspal.android:id/password_edit")
    private ExtendedWebElement passwordInputField;

    @FindBy(id = "com.myfitnesspal.android:id/login_button")
    private ExtendedWebElement loginBtn;

    @FindBy(id = "com.myfitnesspal.android:id/forgot_password_button")
    private ExtendedWebElement forgotPasswordBtn;

    @FindBy(id = "com.myfitnesspal.android:id/facebook_button")
    private ExtendedWebElement facebookBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isEmailFieldPresent() {
        return emailField.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isPasswordFieldPresent() {
        return passwordInputField.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isForgotPasswordButtonPresent() {
        return forgotPasswordBtn.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isFacebookButtonPresent() {
        return facebookBtn.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isLoginButtonPresent() {
        return loginBtn.isElementPresent(THREE_SECONDS);
    }

    @Override
    public void typeEmailAddress(String name) {
        emailField.type(name);
        hideKeyboard();
    }

    @Override
    public void typePassword(String password) {
        passwordInputField.type(password);
    }

    @Override
    public boolean isLoginButtonActive() {
        return false;
    }

    @Override
    public boolean isPageOpened() {
        return loginBtn.isElementPresent(THREE_SECONDS);
    }

    @Override
    public StartPageBase clickLogInButton() {
        loginBtn.click(THREE_SECONDS);
        return initPage(getDriver(), StartPageBase.class);
    }

    @Override
    public boolean isEmailAddressFieldBelowPasswordField() {
        return emailField.getLocation().getY() < passwordInputField.getLocation().getY();
    }

    @Override
    public boolean isPasswordFieldBelowLoginBtn() {
        return passwordInputField.getLocation().getY() < loginBtn.getLocation().getY();
    }

    @Override
    public String getEmailAddressFieldText() {
        return emailField.getText();
    }

    @Override
    public String getPasswordFieldText() {
        return passwordInputField.getText();
    }

    @Override
    public String getLogInText() {
        return loginBtn.getText();
    }

    @Override
    public String getForgotPasswordBtnText() {
        return forgotPasswordBtn.getText();
    }

    @Override
    public String getFacebookBtnText() {
        return facebookBtn.getText();
    }

}






