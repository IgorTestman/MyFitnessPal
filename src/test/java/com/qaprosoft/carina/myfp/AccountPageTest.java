package com.qaprosoft.carina.myfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfp.common.*;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.DiaryEnum;
import com.qaprosoft.carina.myfp.utils.enums.TimeStamp;
import com.qaprosoft.carina.myfp.utils.enums.UserPageEnum;
import com.qaprosoft.carina.myfp.utils.enums.ViewOptionsDiaryEnum;
import com.qaprosoft.carina.myfp.utils.services.Authorization;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AccountPageTest implements IAbstractTest, IMobileUtils, TextConstants {
    private static Authorization authorization;
    private final String SALAD_ASIAN = "Salad asian";
    private final String SALAD = "Salad";
    private final String EXPECTED_TIME = "9:15 PM";
    private final String NO_TIME = "No Time";

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Third Test", value = {"mobile", "regression"})
    public void diaryPageItemsFoodTest() {
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
        softAssert.assertAll();
    }

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Fourth Test", value = {"mobile", "regression"})
    public void timeStampsTest() {

        SoftAssert softAssert = new SoftAssert();

        authorization = new Authorization(getDriver());
        UserPageBase userPage = authorization.logIn();
        DiaryPageBase diaryPage = (DiaryPageBase) userPage.clickOnTab(UserPageEnum.DIARY);
        DiarySettingsPageBase diarySettings = diaryPage.clickOnOptions(ViewOptionsDiaryEnum.DIARY_SETTINGS);
        diarySettings.clickOnTimeStampsCheckbox();
        softAssert.assertTrue(diarySettings.checkBoxChecked(true), "Checkbox isn't checked");
        diaryPage = diarySettings.clickOnBackButton();
        softAssert.assertEquals(diaryPage.getTimeStampsText(), NO_TIME, "Time stamp isn't present");
        diaryPage.clickOnTimeStamp();
        diaryPage.selectEditTimeStamp(TimeStamp.EDIT_TIME);
        diaryPage.selectTimeFormat("PM");
        diaryPage.enterTime();
        softAssert.assertEquals(diaryPage.getAddedTimeStampsText(), EXPECTED_TIME, "Time is wrong");
        softAssert.assertAll();
    }
}