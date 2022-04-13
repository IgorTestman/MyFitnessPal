package com.qaprosoft.carina.myfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfp.common.*;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.DiaryEnum;
import com.qaprosoft.carina.myfp.utils.enums.UserPageEnum;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AccountPageTest implements IAbstractTest, IMobileUtils, TextConstants {
    private final String SALAD_ASIAN = "Salad asian";
    private final String SALAD = "Salad";
    private final String SALAD_CALORIES = "160";
    private final String FOOD_DETAILS = "Asian salad, 1.0 cup";

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Third Test", value = {"mobile", "regression"})
    public void DiaryPageTestItemsFood() {
        SoftAssert softAssert = new SoftAssert();

        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        LoginPageBase loginPage = startPage.clickOnLogInButton();
        loginPage.login();
        UserPageBase userPage = loginPage.clickOnLogInButton();
        userPage.pageIsLoaded();
        Assert.assertTrue(userPage.isPageOpen(), "User page isn't opened");
        DiaryPageBase diaryPage = (DiaryPageBase) userPage.clickOnTab(UserPageEnum.DIARY);
        Assert.assertTrue(diaryPage.isPageOpen(), "Diary page isn't opened");
        softAssert.assertFalse(diaryPage.editFoodButtonIsPresent(), "Food is added");
        BreakfastPageBase breakfastPage = diaryPage.clickOnAddFoodButton();
        breakfastPage.typeFood(SALAD_ASIAN);
        breakfastPage.clickOnSearchedFoodList();
        AddFoodPageBase addFoodPage = breakfastPage.clickOnChosenFood();
        addFoodPage.clickOnPopUp();
        diaryPage = addFoodPage.clickOnSaveButton();

        //* Verify that salad (meal) with characteristics is added
        softAssert.assertTrue(diaryPage.editFoodButtonIsPresent(), "Edit Food button isn't present");
        softAssert.assertEquals(diaryPage.getAddedFoodName(),SALAD, "Name of food is incorrect");
        softAssert.assertEquals(diaryPage.getAddedFoodCalories(), SALAD_CALORIES, "Calories are wrong");
        softAssert.assertEquals(diaryPage.getAddedFoodDetails(), FOOD_DETAILS,
                "Details of added food are incorrect");

        softAssert.assertAll();

    }

}
