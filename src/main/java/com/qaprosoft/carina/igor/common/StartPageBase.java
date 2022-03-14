package com.qaprosoft.carina.igor.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class StartPageBase extends AbstractPage  {

    public StartPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract LoginPageUiBase clickNextBtn();
    public abstract  boolean isNextBtnPresent();
    public abstract  boolean isCarinaLogoPresent();
    public abstract  String getNextBtnText();


}