package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CreateAccountPageBase extends AbstractPage {

    public CreateAccountPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typePassword(String value);

    public abstract void typeEmail(String email);

    public abstract void clickOnSignUpButton();

    public abstract boolean isErrorMessagePresent();

    public abstract void clickOnOkButton();

    public abstract String inputEmailPresent();

    public abstract String inputPasswordPresent();

}
