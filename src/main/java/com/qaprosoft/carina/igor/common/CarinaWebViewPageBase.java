package com.qaprosoft.carina.igor.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaWebViewPageBase extends AbstractPage {

    public CarinaWebViewPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract CarinaContactUsPageBase goToContactUsPage();

    public abstract boolean isUserAvatarPresent();
    public abstract boolean isUserNamePresent();
    public abstract boolean isUserStatusPresent();
    public abstract  String getUserNameText();
    public abstract String getUserStatusText();
    public abstract boolean isNavigateBtnPresent();
    public abstract boolean isImageAnimationPresent();
    public abstract boolean isBurgerMenuBtnPresent();
    public abstract boolean isCarinaLogoPresent();
    public abstract boolean isReadOnGitHubBtnPresent();
    public abstract void clickOnBurgerMenuBtn();
    public abstract void swipeToReadOnGitHubBtn();
    public abstract boolean isContactsPageOpened();
    public abstract void clickOnReadOnGitHubBtn();

}
