package com.qaprosoft.carina.myfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfp.common.*;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.*;
import com.qaprosoft.carina.myfp.utils.services.Authorization;
import com.qaprosoft.carina.myfp.utils.services.SignUp;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;


public class CurrentWeightTest implements IAbstractTest, IMobileUtils, TextConstants {
    private static Authorization authorization;
    private static SignUp signUp;

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Five Test", value = {"mobile", "regression"})
    public void currentGoalWeightTest() {

        SoftAssert softAssert = new SoftAssert();

        int randomWeight = new Random().nextInt(889)+122;
        authorization = new Authorization(getDriver());
        UserPageBase userPage = authorization.logIn();
        MePageBase mePage = (MePageBase) userPage.clickOnOtherTab(UserPageEnum.ME);
        SettingsPageBase settingsPage = mePage.followToSettingsPage();
        MyGoalsPageBase myGoalsPage = (MyGoalsPageBase) settingsPage.openPageByName(Settings.MY_GOALS);
        myGoalsPage.clickOnWeightButton(MyGoalsEnum.CURRENT_WEIGHT);
        myGoalsPage.typeRandomWeight(randomWeight);
        myGoalsPage.clickOnWeightButton(MyGoalsEnum.CURRENT_WEIGHT);
        myGoalsPage.typeRandomWeight(MAX_CURRENT_WEIGHT);
        softAssert.assertEquals(myGoalsPage.isAlertTextWeightPresent(), ALERT_MESSAGE, "Alert message isn't" +
                " present");
        myGoalsPage.clickOnButtonByName(DISMISS);
        myGoalsPage.clickOnWeightButton(MyGoalsEnum.CURRENT_WEIGHT);
        myGoalsPage.typeRandomWeight(CURRENT_WEIGHT);
        softAssert.assertTrue(myGoalsPage.isEnteredWeightPresent(MyGoalsEnum.CHOSEN_CURRENT_WEIGHT.getName()),
                "Current weight is incorrect");
        myGoalsPage.clickOnWeightButton(MyGoalsEnum.GOAL_WEIGHT);
        myGoalsPage.clickOnButtonByName(YES);
        softAssert.assertTrue(myGoalsPage.isMaxGoalWeightPresent(MAX_GOAL_WEIGHT));
        myGoalsPage.clickOnButtonByName(SET);
        softAssert.assertTrue(myGoalsPage.isEnteredWeightPresent(MyGoalsEnum.CHOSEN_MAX_GOAL_WEIGHT.getName()),
                "Goal weight is incorrect");

        softAssert.assertAll();
    }

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Six test'", value = {"mobile", "regression"})
    public void currentWeightFromSighUpPageTest() {
        SoftAssert softAssert = new SoftAssert();

        signUp = new SignUp(getDriver());
        GoalsPageBase goalsPage = signUp.SignUp();
        ActivityLevelPageBase activityLevelPage = goalsPage.goToActivityLevelPage();
        YouPageBase youPage = activityLevelPage.selectActivity(ActivityLevelEnum.VERY_ACTIVE);
        youPage.inputValues();
        youPage.typeWeight(INPUT_MAX_CURRENT_WEIGHT);
        softAssert.assertEquals(youPage.errorMessageIsPresent(), ERROR_MESSAGE, "Error message isn't present");

        softAssert.assertAll();

    }
}