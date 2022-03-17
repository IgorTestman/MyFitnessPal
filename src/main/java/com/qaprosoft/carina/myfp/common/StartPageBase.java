package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class StartPageBase extends AbstractPage  {

    public StartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginPageBase clickLogInButton();

    public abstract  boolean isImageLogoPresent();

    public abstract  boolean isSignUpButtonPresent();

    public abstract  boolean isLoginButtonPresent();

    public abstract String getSignUpButtonText();

    public abstract String getLogInButtonText();

    public abstract boolean isImageLogoBelowSignUpButton();

    public abstract boolean isSignUpBtnBelowLogInButton();

    public abstract SignUpPageBase clickOnSignUpButton();

}