package com.qaprosoft.carina.igor;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.igor.common.CarinaHomePageBase;
import com.qaprosoft.carina.igor.common.LoginPageUiBase;
import com.qaprosoft.carina.igor.common.StartPageBase;
import com.qaprosoft.carina.igor.utils.IConstants;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginPageTest implements IAbstractTest, IMobileUtils, IConstants {


    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "test 2", value = {"mobile", "regression"})
    public void validationUiElementsOnLoginPageTest() {
        SoftAssert softAssert = new SoftAssert();

        StartPageBase startPageBase = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPageBase.isPageOpened(), "Start page isn't opened");
        LoginPageUiBase loginPageUiBase = startPageBase.clickNextBtn();
        Assert.assertTrue(loginPageUiBase.isPageOpened(), "Login page isn't opened");
        Assert.assertFalse(loginPageUiBase.isLoginBtnActive(), "Login button is active when it should be disabled");
        softAssert.assertTrue(loginPageUiBase.isBackBtnPresent(), "Back button is not present");
        softAssert.assertTrue(loginPageUiBase.isCarinaLogoPresent(), "Carina logo is not present");
        softAssert.assertEquals(loginPageUiBase.getLogoText(), LOGO,"In Carina logo text is incorrect");
        softAssert.assertTrue(loginPageUiBase.isNameFieldPresent(), "Name field is not present");
        softAssert.assertEquals(loginPageUiBase.getNameFieldText(), NAME, "Name field text is incorrect");
        softAssert.assertTrue(loginPageUiBase.isPasswordFieldPresent(), "Password field is not present");
        softAssert.assertEquals(loginPageUiBase.getPasswordFieldText(), PASSWORD, "Password field text is incorrect");
        softAssert.assertTrue(loginPageUiBase.isMaleRadioBtnPresent(), "Male radio button is not present");
        softAssert.assertEquals(loginPageUiBase.getMaleRadioBtnText(), MALE, "Name of male radio button is incorrect");
        softAssert.assertTrue(loginPageUiBase.isFemaleRadioBtnPresent(), "Female radio button is not present");
        softAssert.assertEquals(loginPageUiBase.getFemaleRadioBtnText(), FEMALE, "Name of female radio button is incorrect");
        softAssert.assertTrue(loginPageUiBase.isPrivacyPoliceCheckboxPresent(), "Privacy policy checkbox is not present");
        softAssert.assertEquals(loginPageUiBase.getPrivacyPoliceCheckBoxText(),I_AGREE_PRIVACY_POLICY , "Text written with spelling mistakes");
        softAssert.assertTrue(loginPageUiBase.isLoginBtnPresent(), "Login button is not present");
        softAssert.assertEquals(loginPageUiBase.getSignUpBtnText(), SIGN_UP, "Name of Sign Up button is wrong");
        softAssert.assertTrue(loginPageUiBase.isNameFieldBelowPasswordField(), "Name field is not below password field");
        softAssert.assertTrue(loginPageUiBase.isPasswordFieldBelowLoginBtn(), "Sign Up button is not below password field");

        softAssert.assertAll();

    }

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "test 3", value = {"mobile", "regression"})
    public void placementUiElementsTest() {
        SoftAssert softAssert = new SoftAssert();

        StartPageBase startPageBase = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPageBase.isPageOpened(), "Start page isn't opened");
        LoginPageUiBase loginPageUiBase = startPageBase.clickNextBtn();
        loginPageUiBase.clickOnBackBtn();
        Assert.assertTrue(startPageBase.isPageOpened(), "Start page isn't opened");
        startPageBase.clickNextBtn();
        Assert.assertTrue(loginPageUiBase.isPageOpened(), "Login page isn't opened");
        softAssert.assertTrue(loginPageUiBase.isNameFieldBelowPasswordField(), "Name field is not below password field");
        softAssert.assertTrue(loginPageUiBase.isPasswordFieldBelowLoginBtn(), "Sign Up button is not below password field");

        softAssert.assertAll();

    }

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "test 4", value = {"mobile", "regression"})
    public void validCredentialsTest() {
        StartPageBase startPageBase = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPageBase.isPageOpened(), "Start page isn't opened");
        LoginPageUiBase loginPageUiBase = startPageBase.clickNextBtn();
        Assert.assertTrue(loginPageUiBase.isPageOpened(), "Login page isn't opened");
        loginPageUiBase.typeName(VALID_USERNAME);
        loginPageUiBase.typePassword(VALID_PASSWORD);
        loginPageUiBase.selectGender(MALE);
        loginPageUiBase.checkPrivacyPolicyCheckbox();
        CarinaHomePageBase carinaHomePage = loginPageUiBase.clickSignUpBtn();
        Assert.assertTrue(carinaHomePage.isPageOpened(), "Carina page isn't opened");

    }

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "test 5", value = {"mobile", "regression"})
    public void invalidCredentialsTest() {
        StartPageBase startPageBase = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPageBase.isPageOpened(), "Start page isn't opened");
        LoginPageUiBase loginPageUiBase = startPageBase.clickNextBtn();
        Assert.assertTrue(loginPageUiBase.isPageOpened(), "Login page isn't opened");
        loginPageUiBase.typeName(INVALID_USERNAME);
        loginPageUiBase.typePassword(INVALID_PASSWORD);
        loginPageUiBase.selectGender(MALE);
        loginPageUiBase.checkPrivacyPolicyCheckbox();
        CarinaHomePageBase carinaHomePage = loginPageUiBase.clickSignUpBtn();
        Assert.assertTrue(carinaHomePage.isPageOpened(), "Carina page isn't opened");
    }

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "test 6", value = {"mobile", "regression"})
    public void availableSighUpBtnTest() {
        StartPageBase startPageBase = initPage(getDriver(), StartPageBase.class);
        Assert.assertTrue(startPageBase.isPageOpened(), "Start page isn't opened");
        LoginPageUiBase loginPageUiBase = startPageBase.clickNextBtn();
        Assert.assertTrue(loginPageUiBase.isPageOpened(), "Login page isn't opened");
        loginPageUiBase.typeName(INVALID_USERNAME);
        loginPageUiBase.signUpBtnIsClickable();
        Assert.assertTrue(loginPageUiBase.isPageOpened(), "Enter password, password is required field");
        loginPageUiBase.typePassword(INVALID_PASSWORD);
        loginPageUiBase.signUpBtnIsClickable();
        Assert.assertTrue(loginPageUiBase.isPageOpened(), "Please select gender");
        loginPageUiBase.selectGender(FEMALE);
        loginPageUiBase.signUpBtnIsClickable();
        Assert.assertTrue(loginPageUiBase.isPageOpened(), "Accept privacy police");
        loginPageUiBase.checkPrivacyPolicyCheckbox();
        CarinaHomePageBase carinaHomePage = loginPageUiBase.clickSignUpBtn();
        Assert.assertTrue(carinaHomePage.isPageOpened(), "Carina page isn't opened");    }
}