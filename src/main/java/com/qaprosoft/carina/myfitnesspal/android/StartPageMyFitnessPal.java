package com.qaprosoft.carina.myfitnesspal.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfitnesspal.common.LoginPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.common.SignUpPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.common.StartPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.utils.IConstantsMyFitnessPal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = StartPageBaseMyFitnessPal.class)
public class StartPageMyFitnessPal extends StartPageBaseMyFitnessPal implements IConstantsMyFitnessPal {

    @FindBy(id = "com.myfitnesspal.android:id/imageLogo")
    private ExtendedWebElement imageLogo;

    @FindBy(id = "com.myfitnesspal.android:id/buttonSignUp")
    private ExtendedWebElement sigUpBtn;
    @FindBy(id = "com.myfitnesspal.android:id/buttonLogIn")
    private ExtendedWebElement buttonLogIn;


    public StartPageMyFitnessPal(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isImageLogoPresent() {
        return imageLogo.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public boolean isSignUpBtnPresent() {
        return sigUpBtn.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public boolean isBtnLogInPresent() {
        return sigUpBtn.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public boolean isPageOpened() {
        return buttonLogIn.isElementPresent(SEVEN_SECONDS);
    }
    @Override
    public String getSignUpBtnText() {
        return sigUpBtn.getText();
    }
    @Override
    public String getLogInBtnText() {
        return buttonLogIn.getText();
    }
    @Override
    public boolean isImageLogoBelowSignUpBtn(){
        return imageLogo.getLocation().getY()<sigUpBtn.getLocation().getY();
    }
    @Override
    public boolean isSignUpBtnBelowLogInBtn() {
        return sigUpBtn.getLocation().getY()<buttonLogIn.getLocation().getY();
    }



        @Override
    public LoginPageBaseMyFitnessPal clickLogInBtn() {
            buttonLogIn.click(SEVEN_SECONDS);
        return initPage(getDriver(), LoginPageBaseMyFitnessPal.class);
    }
    @Override
    public SignUpPageBaseMyFitnessPal clickSignUpBtn() {
        sigUpBtn.click(SEVEN_SECONDS);
        return initPage(getDriver(), SignUpPageBaseMyFitnessPal.class);
    }

}
