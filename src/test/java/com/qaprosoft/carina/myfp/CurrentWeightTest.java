package com.qaprosoft.carina.myfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfp.common.*;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.ActivityLevel;
import com.qaprosoft.carina.myfp.utils.enums.Goals;
import com.qaprosoft.carina.myfp.utils.enums.Settings;
import com.qaprosoft.carina.myfp.utils.enums.UserPageEnum;
import com.qaprosoft.carina.myfp.utils.services.Authorization;
import com.qaprosoft.carina.myfp.utils.services.SignUp;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class CurrentWeightTest implements IAbstractTest, IMobileUtils, TextConstants {
    private static Authorization authorization;
    private static SignUp signUp;
    private final String CHOSEN_CURRENT_WEIGHT= "998 lbs";
    private final String CHOSEN_GOAL_WEIGHT= "1,000 lbs";
    private final String INPUT_MAX_CURRENT_WEIGHT = "999";
    private final String ERROR_MESSAGE = "Please enter a valid weight";
    private final String ALERT_MESSAGE = "Please enter your current weight.";

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
        MyGoalsPageBase myGoalsPage = settingsPage.clickOnTab(Settings.MY_GOALS);
        myGoalsPage.clickOnWeightButton(Goals.CURRENT_WEIGHT);
        myGoalsPage.typeRandomWeight(1000);
        myGoalsPage.clickOnWeightButton(Goals.CURRENT_WEIGHT);
        myGoalsPage.typeCurrentWeight(INPUT_MAX_CURRENT_WEIGHT);
        softAssert.assertEquals(myGoalsPage.isAlertTextWeightPresent(), ALERT_MESSAGE, "Alert message isn't" +
                " present");
        myGoalsPage.clickOnDismissButton();
        myGoalsPage.clickOnWeightButton(Goals.CURRENT_WEIGHT);
        myGoalsPage.typeCurrentWeight(CHOSEN_CURRENT_WEIGHT);
        softAssert.assertTrue(myGoalsPage.getChosenWeightText(Goals.CHOSEN_CURRENT_WEIGHT.getName()),
                "Current weight is incorrect");
        myGoalsPage.clickOnWeightButton(Goals.GOAL_WEIGHT);
        myGoalsPage.clickOnYesButton();
        softAssert.assertTrue(myGoalsPage.isMaxGoalWeightPresent());
        myGoalsPage.clickOnYesButton();
        softAssert.assertTrue(myGoalsPage.getChosenGoalWeightText(Goals.CHOSEN_GOAL_WEIGHT.getName()),
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