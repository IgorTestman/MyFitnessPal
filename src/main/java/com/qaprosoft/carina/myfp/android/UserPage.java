package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.DiaryPageBase;
import com.qaprosoft.carina.myfp.common.UserPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.UserPageEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = UserPageBase.class)
public class UserPage extends UserPageBase implements IMobileUtils, TimeConstants {

    public UserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/notif_icon")
    private ExtendedWebElement notificationIcon;

    @FindBy(id = "com.myfitnesspal.android:id/ivStatusImage")
    private ExtendedWebElement statusImage;

    @FindBy(id = "com.myfitnesspal.android:id/status")
    private ExtendedWebElement statusText;

    @FindBy(id = "com.myfitnesspal.android:id/likeBtn")
    private ExtendedWebElement likeButton;

    @FindBy(id = "com.myfitnesspal.android:id/commentBtn")
    private ExtendedWebElement commentButton;

    @FindBy(id = "com.myfitnesspal.android:id/numberOfLikesTxt")
    private ExtendedWebElement numberOfLikes;

    @FindBy(id = "com.myfitnesspal.android:id/comment_btn_text")
    private ExtendedWebElement commentButtonText;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Post']")
    private ExtendedWebElement postButton;

    @FindBy(id = "com.myfitnesspal.android:id/news_feed")
    private ExtendedWebElement scrollView;

    @FindBy(id = "com.myfitnesspal.android:id/numberOfCommentsTxt")
    private ExtendedWebElement numberOfComments;

    @FindBy(id = "com.myfitnesspal.android:id/profile_image_view")
    private ExtendedWebElement imageProfile;

    @FindBy(xpath = "//android.widget.TextView[@text='Share something...']")
    private ExtendedWebElement shareSomething;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open Drawer']")
    private ExtendedWebElement burgerMenuButton;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='%s']")
    private ExtendedWebElement itemTabText;

    @FindBy(xpath = "//android.view.View[@content-desc='Feature Highlight']")
    private ExtendedWebElement featureHighlight;

    @Override
    public void pageIsLoaded() {
        waitUntil(ExpectedConditions.visibilityOf(burgerMenuButton.getElement()), TEN_TIMEOUT);
        waitUntil(ExpectedConditions.or(ExpectedConditions.visibilityOf(notificationIcon.getElement()),
                ExpectedConditions.visibilityOf(scrollView.getElement())), FIFTEEN_SECONDS);
        while (featureHighlight.isElementPresent(THREE_SECONDS)) {
            featureHighlight.click(THREE_SECONDS);
        }
    }
    @Override
    public void isBurgerMenuPresent() {
        shareSomething.click(FIVE_SECONDS);
    }
    @Override
    public boolean isPageOpen() {
        return burgerMenuButton.isElementPresent(FIFTEEN_SECONDS);
    }
    @Override
    public void clickOnLikeButton() {
        swipe(likeButton, Direction.UP, FIVE_SWIPES, NORMAL_SWIPES);
        likeButton.click(SEVEN_SECONDS);
    }
    @Override
    public boolean isNumberOfLikesPresent() {
        return numberOfLikes.isElementPresent(SEVEN_SECONDS);
    }

    @Override
    public void clickOnCommentsButton() {
        commentButton.click(SEVEN_SECONDS);
    }

    @Override
    public void typeComments(String comment) {
        commentButtonText.type(comment);
    }

    @Override
    public void clickOnPostButton() {
        postButton.click(SEVEN_SECONDS);
    }

    @Override
    public boolean isInputCommentPresent() {
        return numberOfComments.isElementPresent(SEVEN_SECONDS);
    }

    @Override
    public AbstractPage clickOnMenu(UserPageEnum dairy) {
        itemTabText.format(dairy.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), dairy.getPageClass());
    }
}
