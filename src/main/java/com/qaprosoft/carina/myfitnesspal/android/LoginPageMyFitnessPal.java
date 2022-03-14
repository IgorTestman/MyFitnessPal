package com.qaprosoft.carina.myfitnesspal.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfitnesspal.common.LoginPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.common.StartPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.utils.IConstantsMyFitnessPal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBaseMyFitnessPal.class)
public class LoginPageMyFitnessPal extends LoginPageBaseMyFitnessPal implements IMobileUtils, IConstantsMyFitnessPal {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='LoginActivity']/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
    private ExtendedWebElement backBtn;

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


    public LoginPageMyFitnessPal(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isEmailFieldPresent() {
        return emailField.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public boolean isBackBtnPresent() {
        return backBtn.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public boolean isPasswordFieldPresent() {
        return passwordInputField.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isForgotPasswordBtnPresent() {
        return forgotPasswordBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isFacebookBtnPresent() {
        return facebookBtn.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public boolean isLoginBtnPresent() {
        return loginBtn.isElementPresent(FIVE_SECONDS);
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
    public boolean isLoginBtnActive() {
        return false;
    }

    @Override
    public boolean isPageOpened() {
        return loginBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public StartPageBaseMyFitnessPal clickLogInBtn() {
         loginBtn.click(FIVE_SECONDS);
        return initPage(getDriver(), StartPageBaseMyFitnessPal.class);
    }
    @Override
    public void clickOnBackBtn() {
        backBtn.click(FIVE_SECONDS);

    }

    @Override
    public boolean isEmailAddressFieldBelowPasswordField(){
        return emailField.getLocation().getY()<passwordInputField.getLocation().getY();
    }
    @Override
    public boolean isPasswordFieldBelowLoginBtn() {
        return passwordInputField.getLocation().getY()<loginBtn.getLocation().getY();
    }
    @Override
    public String getEmailAddressFieldText (){
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






