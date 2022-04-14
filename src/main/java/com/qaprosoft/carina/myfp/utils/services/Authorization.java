package com.qaprosoft.carina.myfp.utils.services;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.LoginPageBase;
import com.qaprosoft.carina.myfp.common.StartPageBase;
import com.qaprosoft.carina.myfp.common.UserPageBase;
import org.openqa.selenium.WebDriver;


public class Authorization extends AbstractPage {
    public Authorization(WebDriver driver) {
        super(driver);
    }
    public UserPageBase logIn() {
        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        LoginPageBase loginPage = startPage.clickOnLogInButton();
        UserPageBase userPage = loginPage.logIn();
        userPage.pageIsLoaded();
        return userPage;
    }
}
