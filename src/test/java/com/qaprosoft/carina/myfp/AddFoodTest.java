package com.qaprosoft.carina.myfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfp.common.*;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.DiaryEnum;
import com.qaprosoft.carina.myfp.utils.enums.UserPageEnum;
import com.qaprosoft.carina.myfp.utils.services.Authorization;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AddFoodTest implements IAbstractTest, IMobileUtils, TextConstants {
    private static Authorization authorization;
    private final String SALAD_ASIAN = "Salad asian";
    private final String MILK = "Milk";
    private final String SALAD = "Salad";
    private final String SALAD_CALORIES = "160";
    private final String SALAD_DETAILS = "Asian salad, 1.0 cup";
    private final String MILK_CALORIES = "150";
    private final String MILK_DETAILS = "D milk, 8.0 oz.";


    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Fourth Test", value = {"mobile", "regression"})
    public void diaryPageAddedFoodsTest() {
        SoftAssert softAssert = new SoftAssert();

        authorization = new Authorization(getDriver());
        UserPageBase userPage = authorization.logIn();
        DiaryPageBase diaryPage = (DiaryPageBase) userPage.clickOnTab(UserPageEnum.DIARY);
        MealPageBase mealPage = diaryPage.clickOnAddFoodButton(DiaryEnum.BREAKFAST);
        mealPage.addFood(SALAD_ASIAN);
        AddFoodPageBase addFoodPage = mealPage.clickOnChosenFood();
        addFoodPage.clickOnPopUp();
        diaryPage = addFoodPage.clickOnSaveButton();
        softAssert.assertEquals(diaryPage.isNameOfAddedFoodPresent(), "Salad", "Name of food is " +
                "incorrect");
        softAssert.assertEquals(diaryPage.isCaloriesOfAddedFoodPresent(), SALAD_CALORIES, "Calories is " +
                "incorrect");
        softAssert.assertEquals(diaryPage.isDetailsOfAddedFoodPresent(), SALAD_DETAILS,"Details of added " +
                "food is incorrect");
        diaryPage.clickOnAddFoodButton(DiaryEnum.DINNER);
        mealPage.addFood(MILK);
        addFoodPage = mealPage.clickOnChosenFood();
        addFoodPage.clickOnFeatureHighlightButton();
        diaryPage = addFoodPage.clickOnSaveButton();
        softAssert.assertEquals(diaryPage.isNameOfAddedFoodPresent(), "Milk", "Name of food is" +
                " incorrect");
        softAssert.assertEquals(diaryPage.isCaloriesOfAddedFoodPresent(), MILK_CALORIES, "Calories is" +
                " incorrect");
        softAssert.assertEquals(diaryPage.isDetailsOfAddedFoodPresent(), MILK_DETAILS,
                "Details of added food is incorrect");
        softAssert.assertAll();

    }

}
