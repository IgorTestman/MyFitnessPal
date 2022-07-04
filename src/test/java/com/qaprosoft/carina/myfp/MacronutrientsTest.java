package com.qaprosoft.carina.myfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfp.common.*;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.DefaultGoalEnum;
import com.qaprosoft.carina.myfp.utils.enums.NutritionGoalsEnum;
import com.qaprosoft.carina.myfp.utils.enums.SettingsEnum;
import com.qaprosoft.carina.myfp.utils.enums.UserPageEnum;
import com.qaprosoft.carina.myfp.utils.services.Authorization;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class MacronutrientsTest implements IAbstractTest, IMobileUtils, TextConstants {
    private static Authorization authorization;

    @Test(description = "Method check if the values of Macronutrients (proteins, carbohydrates, fats in grams) change" +
            "when their percentages are changed (percentages change through spinners)")
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Seven Test", value = {"mobile", "regression"})
    public void validationMacronutrientsTest() {

        SoftAssert softAssert = new SoftAssert();

        authorization = new Authorization(getDriver());
        UserPageBase userPage = authorization.logIn();
        MePageBase mePage = (MePageBase) userPage.clickOnMenu(UserPageEnum.ME);
        SettingsPageBase settingsPage = mePage.openSettingsPage();
        MyGoalsPageBase myGoalsPage = (MyGoalsPageBase) settingsPage.openPageByName(SettingsEnum.MY_GOALS);
        CaloriesAndMacroGoalsPageBase caloriesAndMacroGoalsPage = myGoalsPage.openCaloriesAndMacroGoalsPage
                (NutritionGoalsEnum.CALORIE_CARBS_PROTEIN_AND_FAT_GOALS);
        softAssert.assertEquals(caloriesAndMacroGoalsPage.getCurrentCalories(), CALORIES,
                "Calories is blank");
        MacronutrientsPageBase macronutrientsPage = caloriesAndMacroGoalsPage.openMacronutrientsPage
                (DefaultGoalEnum.CARBOHYDRATES);
        macronutrientsPage.setMacronutrientsPercentage(TEN_PERCENTS_FOR_CARBS, EIGHTY_PERCENTS_FOR_PROTEIN,
                TEN_PERCENTS_FOR_FAT);

        //# Verify entered percent and weight changed macronutrients (carbohydrates, proteins, fats)!
        softAssert.assertEquals(macronutrientsPage.getUpdatedCarbsWeight(), UPDATED_CARBS_WEIGHT,
                "Carbs weight is incorrect");
        softAssert.assertEquals(macronutrientsPage.getUpdatedProteinWeight(), UPDATED_PROTEIN_WEIGHT,
                "Protein weight is incorrect");
        softAssert.assertEquals(macronutrientsPage.getUpdatedFatWeight(), UPDATED_FAT_WEIGHT,
                "Fat weight is incorrect");
        softAssert.assertEquals(macronutrientsPage.getTotal(ONE_HUNDRED_PERCENTS), TOTAL,
                "Total should be equal 100%");
        macronutrientsPage.clickOnDoneButton();

        //# Verify saved percent and weight changed macronutrients (carbohydrates, proteins, fats, calories)!
        softAssert.assertEquals(caloriesAndMacroGoalsPage.getCarbsPercentage(), TEN_PERCENTS_FOR_CARBS,
                "Carbs percent is incorrect");
        softAssert.assertEquals(caloriesAndMacroGoalsPage.getProteinPercentage(), EIGHTY_PERCENTS_FOR_PROTEIN,
                "Protein percent is incorrect");
        softAssert.assertEquals(caloriesAndMacroGoalsPage.getFatPercentage(), TEN_PERCENTS_FOR_FAT,
                "Fat percent is incorrect");
        softAssert.assertEquals(caloriesAndMacroGoalsPage.getSavedCarbsWeight(), UPDATED_CARBS_WEIGHT,
                "Saved value 'Carbs' weight is incorrect");
        softAssert.assertEquals(caloriesAndMacroGoalsPage.getSavedProteinWeight(), UPDATED_PROTEIN_WEIGHT,
                "Saved value 'Protein' weight is incorrect");
        softAssert.assertEquals(caloriesAndMacroGoalsPage.getSavedFatWeight(), UPDATED_FAT_WEIGHT,
                "Saved value 'Fat' weight is incorrect");
        softAssert.assertNotEquals(caloriesAndMacroGoalsPage.getCurrentCalories(), caloriesAndMacroGoalsPage.
                        getUpdatedCalories(),
                "Calories should be different");
        softAssert.assertAll();

    }
}
