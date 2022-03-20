package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
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

    @FindBy(xpath = "//android.widget.ImageButton")
    private ExtendedWebElement backButton;

    @FindBy(id = "com.myfitnesspal.android:id/welcome_text_view")
    private ExtendedWebElement welcomeTextView;

    @FindBy(id = "com.myfitnesspal.android:id/login_button")
    private ExtendedWebElement loginButton;

    @FindBy(id = "com.myfitnesspal.android:id/facebook_button")
    private ExtendedWebElement continueWithFacebookButton;

    @Override
    public boolean isBackButtonPresent() {
        return backButton.isElementPresent(THREE_SECONDS);
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
    public void clickOnBackButton() {
        backButton.click(THREE_SECONDS);
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
    public boolean isContinueButtonBelowContinueWithFacebookButton() {
        return loginButton.getLocation().getY() < continueWithFacebookButton.getLocation().getY();
    }

    @Override
    public GoalsPageBase clickOnContinueButton() {
        loginButton.click(THREE_SECONDS);
        return initPage(getDriver(), GoalsPageBase.class);
    }
}



