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
    @TestLabel(name = "Five test'", value = {"mobile", "regression"})
    public void currentWeightFromSighUpPageTest() {
        SoftAssert softAssert = new SoftAssert();

        signUp = new SignUp(getDriver());
        GoalsPageBase goalsPage = signUp.SignUp();
        ActivityLevelPageBase activityLevelPage = goalsPage.goToActivityLevelPage();
        YouPageBase youPage = activityLevelPage.selectActivity(ActivityLevelEnum.VERY_ACTIVE);
        youPage.inputValues();
        youPage.typeWeight(INPUT_MAX_CURRENT_WEIGHT_IN_LB);
        softAssert.assertEquals(youPage.errorMessageIsPresent(), ERROR_MESSAGE, "Error message isn't present");

        softAssert.assertAll();

    }

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Six Test", value = {"mobile", "regression"})
    public void currentGoalWeightInKgTest() {

        SoftAssert softAssert = new SoftAssert();

        double randomWeight = new Random().nextInt(423) + 30.0;
        authorization = new Authorization(getDriver());
        UserPageBase userPage = authorization.logIn();
        MePageBase mePage = (MePageBase) userPage.clickOnMenu(UserPageEnum.ME);
        SettingsPageBase settingsPage = mePage.followToSettingsPage();
        MyGoalsPageBase myGoalsPage = (MyGoalsPageBase) settingsPage.openPageByName(SettingsEnum.MY_GOALS);
        myGoalsPage.setCurrentWeight(randomWeight);
        myGoalsPage.setCurrentWeight(MAX_CURRENT_WEIGHT_IN_KG);
        softAssert.assertEquals(myGoalsPage.getAlertTitle(), ALERT_MESSAGE, "Alert message isn't" +
                " present");
        myGoalsPage.clickOnButtonByName(DISMISS);
        myGoalsPage.setCurrentWeight(CURRENT_WEIGHT_IN_KG);
        softAssert.assertEquals(myGoalsPage.getCurrentWeight(), CURRENT_WEIGHT_IN_KG,
                "Current weight is incorrect");
        myGoalsPage.setGoalWeight(MAX_GOAL_WEIGHT_IN_KG);
        softAssert.assertEquals(myGoalsPage.getGoalWeight(), MAX_GOAL_WEIGHT_IN_KG, "Max weight is incorrect");

        softAssert.assertAll();
    }
}
