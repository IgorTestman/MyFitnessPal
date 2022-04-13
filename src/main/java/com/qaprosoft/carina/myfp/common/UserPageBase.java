package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.enums.UserPageEnum;
import org.openqa.selenium.WebDriver;

public abstract class UserPageBase extends AbstractPage implements TextConstants {

    public UserPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageOpen();

    public abstract void clickOnLikeButton();

    public abstract boolean isNumberOfLikesPresent();

    public abstract void clickOnCommentsButton();

    public abstract void typeComments(String comment);

    public abstract void clickOnPostButton();

    public abstract boolean isInputCommentPresent();

    public abstract void isBurgerMenuPresent();

    public abstract void pageIsLoaded();

    public abstract AbstractPage clickOnTab(UserPageEnum dairy);

}
