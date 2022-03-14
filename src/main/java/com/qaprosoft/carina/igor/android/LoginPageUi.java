package com.qaprosoft.carina.igor.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.igor.common.CarinaHomePageBase;
import com.qaprosoft.carina.igor.common.LoginPageUiBase;
import com.qaprosoft.carina.igor.utils.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;



    @DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageUiBase.class)
    public class LoginPageUi extends LoginPageUiBase implements IMobileUtils, IConstants {

        @FindBy(id = "com.solvd.carinademoapplication:id/backButton")
        private ExtendedWebElement backBtn;

        @FindBy(xpath = "//android.widget.TextView[@text ='CARINA']")
        private ExtendedWebElement carinaLogo;

        @FindBy(id = "com.solvd.carinademoapplication:id/name")
        private ExtendedWebElement nameInputField;

        @FindBy(id = "com.solvd.carinademoapplication:id/password")
        private ExtendedWebElement passwordInputField;

        @FindBy(id = "com.solvd.carinademoapplication:id/radio_male")
        private ExtendedWebElement maleRadioBtn;

        @FindBy(id = "com.solvd.carinademoapplication:id/radio_female")
        private ExtendedWebElement femaleRadioBtn;

        @FindBy(id = "com.solvd.carinademoapplication:id/checkbox")
        private ExtendedWebElement privacyPolicyCheckbox;

        @FindBy(id = "com.solvd.carinademoapplication:id/login_button")
        private ExtendedWebElement loginBtn;

        public LoginPageUi(WebDriver driver) {
            super(driver);
        }
        @Override
        public boolean isCarinaLogoPresent() {
            return carinaLogo.isElementPresent(FIVE_SECONDS);
        }
        @Override
        public boolean isBackBtnPresent() {
            return backBtn.isElementPresent(FIVE_SECONDS);
        }
        @Override
        public boolean isNameFieldPresent() {
            return nameInputField.isElementPresent(FIVE_SECONDS);
        }
        @Override
        public boolean isPasswordFieldPresent() {
            return passwordInputField.isElementPresent(FIVE_SECONDS);
        }
        @Override
        public boolean isMaleRadioBtnPresent() {
            return maleRadioBtn.isElementPresent(SEVEN_SECONDS);
        }
        @Override
        public boolean isFemaleRadioBtnPresent() {
            return femaleRadioBtn.isElementPresent(FIVE_SECONDS);
        }
        @Override
        public void selectGender(String gender) {
             maleRadioBtn.format(gender).click();
        }
        @Override
        public boolean isPrivacyPoliceCheckboxPresent() {
            return privacyPolicyCheckbox.isElementPresent(FIVE_SECONDS);
        }
        @Override
        public boolean isLoginBtnPresent() {
            return loginBtn.isElementPresent(FIVE_SECONDS);
        }


        @Override
        public void typeName(String name) {
            nameInputField.type(name);
            hideKeyboard();
        }

        @Override
        public void typePassword(String password) {
            passwordInputField.type(password);
        }
        @Override
        public void checkPrivacyPolicyCheckbox() {
            privacyPolicyCheckbox.click();
        }
        @Override
        public boolean isLoginBtnActive() {
            return false;
        }

        @Override
        public boolean isPageOpened() {
            return loginBtn.isElementPresent(FIVE_SECONDS);
        }

        @Override
        public CarinaHomePageBase clickSignUpBtn() {
             loginBtn.click(FIVE_SECONDS);
            return initPage(getDriver(), CarinaHomePageBase.class);
        }
        @Override
        public void clickOnBackBtn() {
            backBtn.click(FIVE_SECONDS);

        }
        @Override
        public CarinaHomePageBase login() {
            String username = "qwerty";
            String password = "123456";
            typeName(username);
            typePassword(password);
            selectGender(MALE);
            checkPrivacyPolicyCheckbox();
            return clickSignUpBtn();
        }
        @Override
        public boolean signUpBtnIsClickable() {
             return loginBtn.isClickable();
        }
        @Override
        public boolean isNameFieldBelowPasswordField(){
            return nameInputField.getLocation().getY()<passwordInputField.getLocation().getY();
        }
        @Override
        public boolean isPasswordFieldBelowLoginBtn() {
            return passwordInputField.getLocation().getY()<loginBtn.getLocation().getY();
        }
        @Override
        public String getLogoText (){
            return carinaLogo.getText();
        }

        @Override
        public String getNameFieldText() {
            return nameInputField.getText();
        }
        @Override
        public String getPasswordFieldText() {
            return passwordInputField.getText();
        }
        @Override
        public String getMaleRadioBtnText() {
            return maleRadioBtn.getText();
        }
        @Override
        public String getFemaleRadioBtnText() {
            return femaleRadioBtn.getText();
        }
        @Override
        public String getPrivacyPoliceCheckBoxText() {
            return privacyPolicyCheckbox.getText();
        }
        @Override
        public String getSignUpBtnText() {
            return loginBtn.getText();
        }

    }




