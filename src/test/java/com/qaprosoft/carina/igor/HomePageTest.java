package com.qaprosoft.carina.igor;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.igor.common.LoginPageUiBase;
import com.qaprosoft.carina.igor.common.StartPageBase;
import com.qaprosoft.carina.igor.utils.IConstants;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

    public class HomePageTest implements IAbstractTest, IMobileUtils, IConstants {


        @Test()
        @MethodOwner(owner = "IgorB")
        @TestLabel(name = "test 1", value = {"mobile", "regression"})
        public void validationUiElementsOnHomePageTest() {
            SoftAssert softAssert = new SoftAssert();

            StartPageBase startPageBase = initPage(getDriver(), StartPageBase.class);
            Assert.assertTrue(startPageBase.isPageOpened(), "Start page isn't opened");
            Assert.assertTrue(startPageBase.isCarinaLogoPresent(), "Login page isn't opened");
            Assert.assertTrue(startPageBase.isNextBtnPresent(), "Login button is active when it should be disabled");
            softAssert.assertEquals(startPageBase.getNextBtnText(), NEXT_BTN, "Name of next button is incorrect");
            LoginPageUiBase loginPageUiBase = startPageBase.clickNextBtn();
            Assert.assertTrue(loginPageUiBase.isPageOpened(), "Login page isn't opened");

            softAssert.assertAll();

        }

}
