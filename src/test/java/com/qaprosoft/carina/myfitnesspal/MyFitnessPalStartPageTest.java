package com.qaprosoft.carina.myfitnesspal;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfitnesspal.common.GoalsPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.common.LoginPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.common.SignUpPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.common.StartPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.utils.IConstantsMyFitnessPal;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class MyFitnessPalStartPageTest implements IAbstractTest, IMobileUtils, IConstantsMyFitnessPal {

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "test 1", value = {"mobile", "regression"})
    public void validationUiElementsOnStartPageTest() {
        SoftAssert softAssert = new SoftAssert();

        StartPageBaseMyFitnessPal startPageBaseMyFitnessPal = initPage(getDriver(), StartPageBaseMyFitnessPal.class);
        Assert.assertTrue(startPageBaseMyFitnessPal.isPageOpened(), "Start page isn't opened");
        Assert.assertTrue(startPageBaseMyFitnessPal.isImageLogoPresent(), "Image logo  isn't present");
        Assert.assertTrue(startPageBaseMyFitnessPal.isSignUpBtnPresent(), "Sign Up button isn't present");
        softAssert.assertEquals(startPageBaseMyFitnessPal.getSignUpBtnText(), SIGN_UP, "Name of Sign Up button is incorrect");
        Assert.assertTrue(startPageBaseMyFitnessPal.isBtnLogInPresent(), "Log In button  isn't present");
        softAssert.assertEquals(startPageBaseMyFitnessPal.getLogInBtnText(), LOG_IN, "Name of Log in button is incorrect");
        softAssert.assertTrue(startPageBaseMyFitnessPal.isImageLogoBelowSignUpBtn(), "Image logo is not below password field");
        softAssert.assertTrue(startPageBaseMyFitnessPal.isSignUpBtnBelowLogInBtn(), "Sign Up button is not below Log in button");
        LoginPageBaseMyFitnessPal loginPageBaseMyFitness = startPageBaseMyFitnessPal.clickLogInBtn();
        Assert.assertTrue(loginPageBaseMyFitness.isEmailFieldPresent(), "Email address field isn't present");
        loginPageBaseMyFitness.clickOnBackBtn();
        Assert.assertTrue(startPageBaseMyFitnessPal.isPageOpened(), "Start page isn't opened");
        SignUpPageBaseMyFitnessPal signUpPageMyFitnessPal = startPageBaseMyFitnessPal.clickSignUpBtn();
        Assert.assertTrue(signUpPageMyFitnessPal.isPageOpened(), "Sign Up page isn't opened");
        softAssert.assertTrue(signUpPageMyFitnessPal.isBackBtnPresent(), "Back button is not present");
        softAssert.assertTrue(signUpPageMyFitnessPal.isLogInBtnPresent(), "Log in button is not present");
        softAssert.assertTrue(signUpPageMyFitnessPal.isWelcomeTextPresent(), "Welcome text is not present");
        softAssert.assertTrue(signUpPageMyFitnessPal.isTextOrPresent(), "'OR' text is not present");
        softAssert.assertTrue(signUpPageMyFitnessPal.isContinueWithFacebookBtnPresent(), "Continue with Facebook button is not present");
        softAssert.assertTrue(signUpPageMyFitnessPal.isTextAboutPermissionPresent(), "Text about permission is not present");
        softAssert.assertEquals(signUpPageMyFitnessPal.getLogInBtnText(), CONTINUE, "Name of Continue button is incorrect");
        softAssert.assertEquals(signUpPageMyFitnessPal.getWelcomeText(), WELCOME, "Name of Log in button is incorrect");
        softAssert.assertEquals(signUpPageMyFitnessPal.getContinueWithFacebookBtnText(), CONTINUE_WITH_FACEBOOK, "Name of Log in button is incorrect");
        softAssert.assertEquals(signUpPageMyFitnessPal.getPermissionText(), YOUR_PERMISSION, "Name of Log in button is incorrect");
        softAssert.assertTrue(signUpPageMyFitnessPal.isContinueBtnBelowContinueWithFacebookBtn(), "Continue button is not below Continue with Facebook button");
        signUpPageMyFitnessPal.clickOnBackBtn();
        Assert.assertTrue(startPageBaseMyFitnessPal.isPageOpened(), "Start page isn't opened");

        softAssert.assertAll();

    }

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "test 2", value = {"mobile", "regression"})
    public void validationUiElementsOnSignUpPageTest() {
        SoftAssert softAssert = new SoftAssert();

        StartPageBaseMyFitnessPal startPageBaseMyFitnessPal = initPage(getDriver(), StartPageBaseMyFitnessPal.class);
        SignUpPageBaseMyFitnessPal signUpPageBaseMyFitnessPal = startPageBaseMyFitnessPal.clickSignUpBtn();
        Assert.assertTrue(signUpPageBaseMyFitnessPal.isPageOpened(), "Sign Up page isn't opened");
        GoalsPageBaseMyFitnessPal goalsPageBaseMyFitnessPal = signUpPageBaseMyFitnessPal.clickContinueBtn();
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isPageOpened(), "Goal page page isn't opened");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isBackBtnPresent(), "Back button is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isTitleTextPresent(), "Title text is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isGoalsTabPresent(), "Goal tab is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isPageIndicatorPresent(), "Page indicator is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isSubtitleTextPresent(), "Subtitle text is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isLoseWeightBtnPresent(), "Gain Weight button is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isMaintainWeightBtnPresent(), "Lose Weight button is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isGainWeightBtnPresent(), "Gain Muscle button is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isGainMuscleBtnPresent(), "Maintain Weight button is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isModifyMyDietBtnPresent(), "Modify my diet button is not present");
        goalsPageBaseMyFitnessPal.swipeToManageStress();
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isManageStressBtnPresent(), "Manage Stress button is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isIncreaseMyStepCountBtnPresent(), "increase My Step Count button is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isNextBtnPresent(), "Next button is not present");
        goalsPageBaseMyFitnessPal.clickOnBackBtn();
        Assert.assertTrue(signUpPageBaseMyFitnessPal.isPageOpened(), "Sign Up page isn't opened");
        signUpPageBaseMyFitnessPal.clickContinueBtn();
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isPageOpened(), "Goal page page isn't opened");
        goalsPageBaseMyFitnessPal.clickOnNextBtn();
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isAlertWindowPresent(), "Alert window isn't shown");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isErrorNamePresent(), "Error name is not present");
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isErrorMessagePresent(), "Error message is incorrect");
        Assert.assertEquals(goalsPageBaseMyFitnessPal.getErrorMessageText(),ERROR_MESSAGE, "Text error message is incorrect");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isOkBtnPresent(), "'OK' button is not present");
        goalsPageBaseMyFitnessPal.clickOnOkBtn();

        softAssert.assertAll();

    }
    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "test 3", value = {"mobile", "regression"})
    public void validationErrorMessagesOnGoalsPageTest() {
        SoftAssert softAssert = new SoftAssert();

        StartPageBaseMyFitnessPal startPageBaseMyFitnessPal = initPage(getDriver(), StartPageBaseMyFitnessPal.class);
        SignUpPageBaseMyFitnessPal signUpPageBaseMyFitnessPal = startPageBaseMyFitnessPal.clickSignUpBtn();
        Assert.assertTrue(signUpPageBaseMyFitnessPal.isPageOpened(), "Sign Up page isn't opened");
        GoalsPageBaseMyFitnessPal goalsPageBaseMyFitnessPal = signUpPageBaseMyFitnessPal.clickContinueBtn();
        goalsPageBaseMyFitnessPal.clickOnLoseWeightBtn();
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isLoseWeightBtnSelected(), "Lose Weight button isn't selected");
        goalsPageBaseMyFitnessPal.clickOnMaintainWeightBtn();
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isMaintainWeightBtnSelected(), "Maintain weight button isn't selected");
        goalsPageBaseMyFitnessPal.clickOngGainWeightBtn();
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isgGainWeightBtnSelected(), "Gain Weight button isn't selected");
        goalsPageBaseMyFitnessPal.clickOngGainWeightBtn();
        goalsPageBaseMyFitnessPal.swipeToManageStress();
        goalsPageBaseMyFitnessPal.clickMoreThanThreeBtns();
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isAlertWindowGoalsPresent(), "Alert window isn't shown");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isErrorNameGoalsPresent(), "Error name is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isErrorMessageGoalsPresent(), "Error message is not present");
        softAssert.assertTrue(goalsPageBaseMyFitnessPal.isOkBtnGoalsPresent(), "OK button is not present");
        goalsPageBaseMyFitnessPal.clickOnOkBtnGoals();
        goalsPageBaseMyFitnessPal.clickMoreThanThreeBtns();
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isManageStressBtnSelected(), "Manage Stress button isn't selected");
        goalsPageBaseMyFitnessPal.clickOnIncreaseMyStepCountBtn();
        Assert.assertTrue(goalsPageBaseMyFitnessPal.isIncreaseMyStepCountBtnSelected(), "Increase My Step Count button isn't selected");
        softAssert.assertAll();





    }
    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "test 4", value = {"mobile", "regression"})
    public void validationUiElementsOnUserPageTest() {
        SoftAssert softAssert = new SoftAssert();

        StartPageBaseMyFitnessPal startPageBaseMyFitnessPal = initPage(getDriver(), StartPageBaseMyFitnessPal.class);
        LoginPageBaseMyFitnessPal loginPageBaseMyFitness = startPageBaseMyFitnessPal.clickLogInBtn();
        loginPageBaseMyFitness.typeEmailAddress(EMAIL_ADDRESS);
        loginPageBaseMyFitness.typePassword(PASSWORD);
        loginPageBaseMyFitness.clickLogInBtn();

        softAssert.assertAll();

    }

}