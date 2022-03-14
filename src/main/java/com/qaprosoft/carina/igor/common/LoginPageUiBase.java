package com.qaprosoft.carina.igor.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.igor.utils.IConstants;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageUiBase  extends AbstractPage implements IConstants {

    public LoginPageUiBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeName(String name);

    public abstract void typePassword(String password);

    public abstract void checkPrivacyPolicyCheckbox();

    public abstract boolean isLoginBtnActive();

    public abstract boolean isCarinaLogoPresent();

    public abstract boolean isBackBtnPresent();

    public abstract boolean isNameFieldPresent();

    public abstract boolean isPasswordFieldPresent();

    public abstract boolean isMaleRadioBtnPresent();

    public abstract boolean isFemaleRadioBtnPresent();

    public abstract void selectGender(String gender);

    public abstract boolean isPrivacyPoliceCheckboxPresent();

    public abstract boolean isLoginBtnPresent();

    public abstract CarinaHomePageBase clickSignUpBtn();

    public abstract void clickOnBackBtn();
    public abstract CarinaHomePageBase login();
    public abstract String getLogoText();

    public abstract boolean signUpBtnIsClickable();

    public abstract boolean isNameFieldBelowPasswordField();

    public abstract boolean isPasswordFieldBelowLoginBtn();

    public abstract String getNameFieldText();

    public abstract String getPasswordFieldText();

    public abstract String getMaleRadioBtnText();

    public abstract String getFemaleRadioBtnText();

    public abstract String getPrivacyPoliceCheckBoxText();

    public abstract String getSignUpBtnText();


    }


