package com.qaprosoft.carina.myfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfp.common.*;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.UserPageEnum;
import com.qaprosoft.carina.myfp.utils.services.Authorization;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AccountPageTest implements IAbstractTest, IMobileUtils, TextConstants {
    private static Authorization authorization;
    private final String SALAD_ASIAN = "Salad asian";
    private final String SALAD = "Salad";

    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Third Test", value = {"mobile", "regression"})
    public void DiaryPageTestItemsFood() {
        SoftAssert softAssert = new SoftAssert();

        authorization = new Authorization(getDriver());
        UserPageBase userPage = authorization.logIn();
        DiaryPageBase diaryPage = (DiaryPageBase) userPage.clickOnTab(UserPageEnum.DIARY);
        FoodPageBase foodPage = diaryPage.clickOnAddFoodButton();
        foodPage.addFood(SALAD_ASIAN);
        AddFoodPageBase addFoodPage = foodPage.clickOnChosenFood();
        addFoodPage.clickOnPopUp();
        diaryPage = addFoodPage.clickOnSaveButton();
        softAssert.assertEquals(diaryPage.getAddedMealName(), SALAD, "Added meal isn't present");

        softAssert.assertAll();
    }
}
