package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SignUpPageBase extends AbstractPage {

    public SignUpPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isBackButtonPresent();

    public abstract boolean isLogInButtonPresent();

    public abstract boolean isContinueWithFacebookButtonPresent();

    public abstract void clickOnBackButton();

    public abstract String getLogInButtonText();

    public abstract String getContinueWithFacebookButtonText();

    public abstract boolean isContinueButtonBelowContinueWithFacebookButton();

    public abstract GoalsPageBase clickOnContinueButton();
}
