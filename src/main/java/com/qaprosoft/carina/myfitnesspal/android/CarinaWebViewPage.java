package com.qaprosoft.carina.myfitnesspal.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.igor.common.CarinaContactUsPageBase;
import com.qaprosoft.carina.igor.common.CarinaWebViewPageBase;
import com.qaprosoft.carina.igor.utils.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CarinaWebViewPageBase.class)
public class CarinaWebViewPage extends CarinaWebViewPageBase implements IMobileUtils, IConstants {
    @FindBy(xpath = "//android.view.View[@content-desc='Contact Us']/android.widget.TextView")
    private ExtendedWebElement contactUsLink;
    @FindBy(xpath = "//android.widget.ImageView[@index='0']")
    private ExtendedWebElement userAvatar;
    @FindBy(xpath = "//android.widget.TextView[@index='1']")
    private ExtendedWebElement userName;
    @FindBy(xpath = "//android.widget.TextView[@index='2']")
    private ExtendedWebElement userStatus;
    @FindBy(xpath = "//android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2][@index='1']")
    private ExtendedWebElement burgerMenuBtn;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private ExtendedWebElement navigateBtn;
    @FindBy(xpath = "//android.widget.TextView[@index='1']")
    private ExtendedWebElement menuName;
    @FindBy(xpath = "//android.widget.RelativeLayout/android.widget.ImageView[@index='0']")
    private ExtendedWebElement imageAnimation;
    @FindBy(xpath = "//android.widget.Image[@text='tild3134-6534-4436-b530-633362386138__group_3']")
    private ExtendedWebElement container;
    @FindBy(xpath = "//android.view.View[@text='CARINA']")
    private ExtendedWebElement carinaLogo;
    @FindBy(xpath = "//android.view.View[@content-desc='Read on GitHub']")
    private ExtendedWebElement readOnGitHubBtn;
    @FindBy(xpath = "//android.view.View[@content-desc='Read on GitHub']/android.widget.TextView")
    private ExtendedWebElement gitHubRead;


    public CarinaWebViewPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isUserAvatarPresent() {
        return userAvatar.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isUserNamePresent() {
        return userName.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isUserStatusPresent() {
        return userStatus.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public String getUserNameText() {
        return userName.getText();
    }

    @Override
    public String getUserStatusText() {
        return userStatus.getText();
    }

    @Override
    public CarinaContactUsPageBase goToContactUsPage() {
        contactUsLink.click();
        return initPage(getDriver(), CarinaContactUsPageBase.class);
    }

    @Override
    public boolean isPageOpened() {
        return menuName.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isNavigateBtnPresent() {
        return navigateBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isBurgerMenuBtnPresent() {
        return burgerMenuBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isImageAnimationPresent() {
        return imageAnimation.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isCarinaLogoPresent() {
        return carinaLogo.isElementPresent(FIVE_SECONDS);

    }
    @Override
    public boolean isReadOnGitHubBtnPresent() {
        return readOnGitHubBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public void clickOnBurgerMenuBtn() {
        burgerMenuBtn.click();
    }

    @Override
    public void clickOnReadOnGitHubBtn() {
        readOnGitHubBtn.click();
    }

    @Override
    public void swipeToReadOnGitHubBtn() {
        swipe(readOnGitHubBtn, container, 20);
    }

    @Override
    public boolean isContactsPageOpened() {
        return gitHubRead.isElementPresent();
    }


    }

