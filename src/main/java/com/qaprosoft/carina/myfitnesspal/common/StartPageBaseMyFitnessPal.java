package com.qaprosoft.carina.myfitnesspal.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class StartPageBaseMyFitnessPal extends AbstractPage  {

    public StartPageBaseMyFitnessPal(WebDriver driver) {
        super(driver);
    }

    public abstract LoginPageBaseMyFitnessPal clickLogInBtn();
    public abstract  boolean isImageLogoPresent();
    public abstract  boolean isSignUpBtnPresent();
    public abstract  boolean isBtnLogInPresent();
    public abstract String getSignUpBtnText();
    public abstract String getLogInBtnText();
    public abstract boolean isImageLogoBelowSignUpBtn();
    public abstract boolean isSignUpBtnBelowLogInBtn();
    public abstract SignUpPageBaseMyFitnessPal clickSignUpBtn();


}