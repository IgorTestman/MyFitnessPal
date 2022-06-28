package com.qaprosoft.carina.myfp.utils.services;


import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.*;
import org.openqa.selenium.WebDriver;

public class SignUp extends AbstractPage {
    public SignUp(WebDriver driver) {
        super(driver);
    }

    public GoalsPageBase SignUp() {
        StartPageBase startPage = initPage(getDriver(), StartPageBase.class);
        SignUpPageBase signUpPage = startPage.clickOnSignUpButton();
        GoalsPageBase goalsPage = signUpPage.clickOnContinueButton();
        return goalsPage;
    }
}