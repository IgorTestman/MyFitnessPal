package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage implements TextConstants {

    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeEmailAddress(String name);

    public abstract void typePassword(String password);

    public abstract boolean isLoginButtonActive();

    public abstract boolean isEmailFieldPresent();

    public abstract boolean isFacebookButtonPresent();

    public abstract boolean isForgotPasswordButtonPresent();

    public abstract boolean isPasswordFieldPresent();

    public abstract boolean isLoginButtonPresent();

    public abstract StartPageBase clickLogInButton();

    public abstract boolean isEmailAddressFieldBelowPasswordField();

    public abstract boolean isPasswordFieldBelowLoginBtn();

    public abstract String getEmailAddressFieldText();

    public abstract String getPasswordFieldText();

    public abstract String getForgotPasswordBtnText();

    public abstract String getFacebookBtnText();

    public abstract String getLogInText();

    public abstract UserPageBase logIn();

}


