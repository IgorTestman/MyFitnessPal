package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.igor.utils.IConstants;
import com.qaprosoft.carina.myfp.common.GoalsPageBase;
import com.qaprosoft.carina.myfp.common.SignUpPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignUpPageBase.class)
public class SignUpPage extends SignUpPageBase implements TimeConstants {

    public SignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageButton[@index = '0']")
    private ExtendedWebElement backButton;

    @FindBy(id = "com.myfitnesspal.android:id/welcome_text_view")
    private ExtendedWebElement welcomeText;

    @FindBy(id = "com.myfitnesspal.android:id/login_button")
    private ExtendedWebElement loginButton;

    @FindBy(id = "com.myfitnesspal.android:id/facebook_button")
    private ExtendedWebElement continueWithFacebookButton;

    @FindBy(xpath = "//android.widget.TextView[@text = 'We will never post anything without your permission.']")
    private ExtendedWebElement textAboutPermission;

    @FindBy(xpath = "//android.widget.TextView[@text = 'OR']")
    private ExtendedWebElement textOr;

    @Override
    public boolean isBackButtonPresent() {
        return backButton.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isWelcomeTextPresent() {
        return welcomeText.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isLogInButtonPresent() {
        return loginButton.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isContinueWithFacebookButtonPresent() {
        return continueWithFacebookButton.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isTextAboutPermissionPresent() {
        return textAboutPermission.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isTextOrPresent() {
        return textOr.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isPageOpened() {
        return textAboutPermission.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public void clickOnBackButton() {
        backButton.click(THREE_SECONDS);
    }

    @Override
    public String getWelcomeText() {
        return welcomeText.getText();
    }

    @Override
    public String getLogInButtonText() {
        return loginButton.getText();
    }

    @Override
    public String getContinueWithFacebookButtonText() {
        return continueWithFacebookButton.getText();
    }

    @Override
    public String getPermissionText() {
        return textAboutPermission.getText();
    }

    @Override
    public boolean isContinueButtonBelowContinueWithFacebookButton() {
        return loginButton.getLocation().getY() < continueWithFacebookButton.getLocation().getY();
    }

    @Override
    public GoalsPageBase clickOnContinueButton() {
        loginButton.click(THREE_SECONDS);
        return initPage(getDriver(), GoalsPageBase.class);
    }
}



