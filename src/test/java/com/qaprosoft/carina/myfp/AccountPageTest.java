package com.qaprosoft.carina.myfp;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.commons.SpecialKeywords;
import com.qaprosoft.carina.core.foundation.crypto.CryptoTool;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.myfp.common.LoginPageBase;
import com.qaprosoft.carina.myfp.common.MainPageBase;
import com.qaprosoft.carina.myfp.common.StartPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.zebrunner.agent.core.annotation.TestLabel;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.regex.Pattern;

public class AccountPageTest implements IAbstractTest, IMobileUtils, TextConstants {
        private static final CryptoTool cryptoTool = new CryptoTool("./.settings/crypto.key");
        private static final Pattern CRYPTO_PATTERN = Pattern.compile(SpecialKeywords.CRYPT);
        private static final String EMAIL = cryptoTool.decryptByPattern(R.EMAIL.get("user1.email"), CRYPTO_PATTERN);
        private static final String PASSWORD = cryptoTool.decryptByPattern(R.EMAIL.get("user1.password"), CRYPTO_PATTERN);


    @Test()
    @MethodOwner(owner = "IgorB")
    @TestLabel(name = "Second Test", value = {"mobile", "regression"})
    public void validationUiElementsOnUserPageTest() {

        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        LoginPageBase loginPage = startPage.clickLogInButton();
        loginPage.typeEmailAddress(EMAIL);
        loginPage.typePassword(PASSWORD);
        MainPageBase mainPage = loginPage.clickOnLogInButton();
        mainPage.closeImage();
        Assert.assertTrue(mainPage.isPageDownloaded(), "Main page isn't downloaded");

    }
}
