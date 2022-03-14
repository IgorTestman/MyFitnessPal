package com.qaprosoft.carina.myfitnesspal.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfitnesspal.utils.IConstantsMyFitnessPal;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBaseMyFitnessPal extends AbstractPage implements IConstantsMyFitnessPal {

    public LoginPageBaseMyFitnessPal(WebDriver driver) {
        super(driver);
    }

    public abstract void typeEmailAddress(String name);

    public abstract void typePassword(String password);

    public abstract boolean isLoginBtnActive();

    public abstract boolean isEmailFieldPresent();

    public abstract boolean isBackBtnPresent();

    public abstract boolean isFacebookBtnPresent();
    public abstract boolean isForgotPasswordBtnPresent();
    public abstract boolean isPasswordFieldPresent();

    public abstract boolean isLoginBtnPresent();

    public abstract StartPageBaseMyFitnessPal clickLogInBtn();

    public abstract void clickOnBackBtn();
   // public abstract StartPageMyFitnessPal login();

    public abstract boolean isEmailAddressFieldBelowPasswordField();

    public abstract boolean isPasswordFieldBelowLoginBtn();

    public abstract String getEmailAddressFieldText();

    public abstract String getPasswordFieldText();

    public abstract String getForgotPasswordBtnText();

    public abstract String getFacebookBtnText();

    public abstract String getLogInText();


    }


