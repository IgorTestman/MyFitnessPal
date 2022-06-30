package com.qaprosoft.carina.myfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfp.common.*;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.CalorieAndMacroGoalsEnum;
import com.qaprosoft.carina.myfp.utils.enums.NutritionGoalsEnum;
import com.qaprosoft.carina.myfp.utils.enums.SettingsEnum;
import com.qaprosoft.carina.myfp.utils.enums.UserPageEnum;
import com.qaprosoft.carina.myfp.utils.services.Authorization;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class NutritionTest implements IAbstractTest, IMobileUtils, TextConstants {
    private static Authorization authorization;

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Seven Test", value = {"mobile", "regression"})
    public void validationNutritionTest() {

        SoftAssert softAssert = new SoftAssert();

        authorization = new Authorization(getDriver());
        UserPageBase userPage = authorization.logIn();
        MePageBase mePage = (MePageBase) userPage.clickOnMenu(UserPageEnum.ME);
        SettingsPageBase settingsPage = mePage.openSettingsPage();
        MyGoalsPageBase myGoalsPage = (MyGoalsPageBase) settingsPage.openPageByName(SettingsEnum.MY_GOALS);
        NutritionGoalsPageBase nutritionGoalsPage = myGoalsPage.openNutritionPage(NutritionGoalsEnum.CALORIE_CARBS_PROTEIN_AND_FAT_GOALS);
        nutritionGoalsPage.openCalorieAndMacrosPage(CalorieAndMacroGoalsEnum.CARBOHYDRATES);
        nutritionGoalsPage.setMacronutrientsPercentage(SIXTY_PERCENTS_FOR_CARBS, TWENTY_PERCENTS_FOR_PROTEIN, TWENTY_PERCENTS_FOR_FAT);
        softAssert.assertEquals(nutritionGoalsPage.getCarbsWeight(), CARBS_WEIGHT,
                "Carbs weight is incorrect");
        softAssert.assertEquals(nutritionGoalsPage.getProteinWeight(), PROTEIN_WEIGHT,
                "Protein weight is incorrect");
        softAssert.assertEquals(nutritionGoalsPage.getFatWeight(), FAT_WEIGHT,
                "Fat weight is incorrect");
        nutritionGoalsPage.clickOnDoneButton();

        softAssert.assertAll();

    }
}