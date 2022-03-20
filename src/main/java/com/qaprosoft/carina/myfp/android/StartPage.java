package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.LoginPageBase;
import com.qaprosoft.carina.myfp.common.SignUpPageBase;
import com.qaprosoft.carina.myfp.common.StartPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = StartPageBase.class)
public class StartPage extends StartPageBase implements TimeConstants {

    @FindBy(id = "com.myfitnesspal.android:id/imageLogo")
    private ExtendedWebElement imageLogo;

    @FindBy(id = "com.myfitnesspal.android:id/buttonSignUp")
    private ExtendedWebElement sigUpButton;

    @FindBy(id = "com.myfitnesspal.android:id/buttonLogIn")
    private ExtendedWebElement loginButton;

    public StartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isImageLogoPresent() {
        return imageLogo.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isSignUpButtonPresent() {
        return sigUpButton.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isLoginButtonPresent() {
        return sigUpButton.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isPageOpened() {
        return loginButton.isElementPresent(THREE_SECONDS);
    }

    @Override
    public String getSignUpButtonText() {
        return loginButton.getText();
    }

    @Override
    public String getLogInButtonText() {
        return loginButton.getText();
    }

    @Override
    public boolean isImageLogoBelowSignUpButton() {
        return imageLogo.getLocation().getY() < sigUpButton.getLocation().getY();
    }

    @Override
    public boolean isSignUpBtnBelowLogInButton() {
        return sigUpButton.getLocation().getY() < loginButton.getLocation().getY();
    }

    @Override()
    public LoginPageBase clickLogInButton() {
        loginButton.click(THREE_SECONDS);
        return initPage(getDriver(), LoginPageBase.class);
    }

    @Override
    public SignUpPageBase clickOnSignUpButton() {
        sigUpButton.click(THREE_SECONDS);
        return initPage(getDriver(), SignUpPageBase.class);
    }
}
