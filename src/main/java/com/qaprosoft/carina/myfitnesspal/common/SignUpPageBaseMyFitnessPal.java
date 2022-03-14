package com.qaprosoft.carina.myfitnesspal.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SignUpPageBaseMyFitnessPal extends AbstractPage {

    public SignUpPageBaseMyFitnessPal(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isBackBtnPresent();
    public abstract boolean isWelcomeTextPresent();
    public abstract boolean isLogInBtnPresent();
    public abstract boolean isContinueWithFacebookBtnPresent();
    public abstract  boolean isTextAboutPermissionPresent();
    public abstract boolean isPageOpened();
    public abstract void clickOnBackBtn();
    public abstract boolean isTextOrPresent();
    public abstract String getWelcomeText();
    public abstract String getLogInBtnText();
    public abstract String getContinueWithFacebookBtnText();
    public abstract String getPermissionText();
    public abstract boolean isContinueBtnBelowContinueWithFacebookBtn();
    public abstract GoalsPageBaseMyFitnessPal clickContinueBtn();
}
