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
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Random;


public class CurrentWeightTest implements IAbstractTest, IMobileUtils, TextConstants {
    private static Authorization authorization;
    private static SignUp signUp;
    private final double CHOSEN_CURRENT_WEIGHT= 998.0;
    private final String CHOSEN_GOAL_WEIGHT= "1,000 lbs";
    private final double INPUT_MAX_CURRENT_WEIGHT = 999.9;
    private final String ERROR_MESSAGE = "Please enter a valid weight";
    private final String ALERT_MESSAGE = "Please enter your current weight.";
    int randomWeight = new Random().nextInt(1000);
    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Five Test", value = {"mobile", "regression"})
    public void currentGoalWeightTest() {
        SoftAssert softAssert = new SoftAssert();
       // * created almost new test with flexible methods (uses Enum, Constants and Random.Utils)
        authorization = new Authorization(getDriver());
        UserPageBase userPage = authorization.logIn();
        MePageBase mePage = (MePageBase) userPage.clickOnOtherTab(UserPageEnum.ME);
        SettingsPageBase settingsPage = mePage.followToSettingsPage();
        MyGoalsPageBase myGoalsPage = (MyGoalsPageBase) settingsPage.isPageOpened(Settings.MY_GOALS);
        myGoalsPage.clickOnWeightButton(MyGoalsEnum.CURRENT_WEIGHT);
        myGoalsPage.clickOnButton(MyGoalsEnum.YES);
        myGoalsPage.typeRandomWeight(randomWeight);
        myGoalsPage.clickOnButton(MyGoalsEnum.SET);
        myGoalsPage.clickOnWeightButton(MyGoalsEnum.CURRENT_WEIGHT);
        myGoalsPage.clickOnButton(MyGoalsEnum.YES);
        myGoalsPage.typeCurrentWeight(INPUT_MAX_CURRENT_WEIGHT);
        myGoalsPage.clickOnButton(MyGoalsEnum.SET);
        softAssert.assertEquals(myGoalsPage.isAlertTextWeightPresent(), ALERT_MESSAGE, "Alert message isn't" +
                " present");
        myGoalsPage.clickOnButton(MyGoalsEnum.DISMISS);
        myGoalsPage.clickOnWeightButton(MyGoalsEnum.CURRENT_WEIGHT);
        myGoalsPage.clickOnButton(MyGoalsEnum.YES);
        myGoalsPage.typeCurrentWeight(CHOSEN_CURRENT_WEIGHT);
        myGoalsPage.clickOnButton(MyGoalsEnum.SET);
        softAssert.assertTrue(myGoalsPage.isEnteredWeightPresent(MyGoalsEnum.CHOSEN_CURRENT_WEIGHT.getName()),
                "Current weight is incorrect");
        myGoalsPage.clickOnWeightButton(MyGoalsEnum.GOAL_WEIGHT);
        myGoalsPage.clickOnButton(MyGoalsEnum.YES);
        softAssert.assertTrue(myGoalsPage.isMaxGoalWeightPresent("1000"));
        myGoalsPage.clickOnButton(MyGoalsEnum.SET);
        softAssert.assertTrue(myGoalsPage.isEnteredGoalWeightPresent(MyGoalsEnum.CHOSEN_GOAL_WEIGHT.getName()),
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
        YouPageBase youPage = activityLevelPage.selectActivity(ActivityLevel.VERY_ACTIVE);
        youPage.inputValues();
        youPage.typeWeight(INPUT_MAX_CURRENT_WEIGHT);
        softAssert.assertEquals(youPage.errorMessageIsPresent(), ERROR_MESSAGE, "Error message isn't present");

        softAssert.assertAll();

    }
}