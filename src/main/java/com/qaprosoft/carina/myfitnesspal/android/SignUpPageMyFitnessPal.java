package com.qaprosoft.carina.myfitnesspal.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.igor.utils.IConstants;
import com.qaprosoft.carina.myfitnesspal.common.GoalsPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.common.SignUpPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.common.StartPageBaseMyFitnessPal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = SignUpPageBaseMyFitnessPal.class)
public class SignUpPageMyFitnessPal extends SignUpPageBaseMyFitnessPal implements IConstants {

    public SignUpPageMyFitnessPal(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//android.widget.ImageButton[@index = '0']")
    private ExtendedWebElement backBtn;

    @FindBy(id = "com.myfitnesspal.android:id/welcome_text_view")
    private ExtendedWebElement welcomeText;

    @FindBy(id = "com.myfitnesspal.android:id/login_button")
    private ExtendedWebElement loginBtn;

    @FindBy(id = "com.myfitnesspal.android:id/facebook_button")
    private ExtendedWebElement continueWithFacebookBtn;

    @FindBy(xpath = "//android.widget.TextView[@text = 'We will never post anything without your permission.']")
    private ExtendedWebElement textAboutPermission;
    @FindBy(xpath = "//android.widget.TextView[@text = 'OR']")
    private ExtendedWebElement textOr;

    @Override
    public boolean isBackBtnPresent() {
        return backBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isWelcomeTextPresent() {
        return welcomeText.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isLogInBtnPresent() {
        return loginBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isContinueWithFacebookBtnPresent() {
        return continueWithFacebookBtn.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public boolean isTextAboutPermissionPresent() {
        return textAboutPermission.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public boolean isTextOrPresent() {
        return textOr.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public boolean isPageOpened() {
        return textAboutPermission.isElementPresent(SEVEN_SECONDS);
    }
    @Override
    public void clickOnBackBtn() {
        backBtn.click(FIVE_SECONDS);

    }
    @Override
    public String getWelcomeText() {
        return welcomeText.getText();
    }
    @Override
    public String getLogInBtnText() {
        return loginBtn.getText();
    }
    @Override
    public String getContinueWithFacebookBtnText() {
        return continueWithFacebookBtn.getText();
    }
    @Override
    public String getPermissionText() {
        return textAboutPermission.getText();
    }
    @Override
    public boolean isContinueBtnBelowContinueWithFacebookBtn(){
        return loginBtn.getLocation().getY()<continueWithFacebookBtn.getLocation().getY();
    }
    @Override
    public GoalsPageBaseMyFitnessPal clickContinueBtn() {
        loginBtn.click(SEVEN_SECONDS);
        return initPage(getDriver(), GoalsPageBaseMyFitnessPal.class);
    }

}



