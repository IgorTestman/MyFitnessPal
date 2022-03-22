package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.common.ActivityLevelPageBase;
import com.qaprosoft.carina.myfp.common.GoalsPageBase;
import com.qaprosoft.carina.myfp.utils.enums.Goals;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GoalsPageBase.class)
public class GoalsPage extends GoalsPageBase implements IMobileUtils, TimeConstants {

    @FindBy(xpath = "//android.widget.ImageButton")
    private ExtendedWebElement backButton;

    @FindBy(xpath = "//android.widget.TextView[@text='Goals']")
    private ExtendedWebElement goalsTab;

    @FindBy(id = "com.myfitnesspal.android:id/page_indicator")
    private ExtendedWebElement pageIndicator;

    @FindBy(id = "com.myfitnesspal.android:id/titleTextView")
    private ExtendedWebElement titleText;

    @FindBy(id = "com.myfitnesspal.android:id/subtitleTextView")
    private ExtendedWebElement subtitleText;

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='%s']")
    private ExtendedWebElement itemByText;

    @FindBy(id = "com.myfitnesspal.android:id/container")
    private ExtendedWebElement container;

    @FindBy(id = "com.myfitnesspal.android:id/parentPanel")
    private ExtendedWebElement alertWindow;

    @FindBy(id = "com.myfitnesspal.android:id/title_template")
    private ExtendedWebElement errorName;

    @FindBy(id = "android:id/message")
    private ExtendedWebElement errorMessage;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement okButton;

    @FindBy(id = "com.myfitnesspal.android:id/action_bar_root")
    private ExtendedWebElement errorWindowGoals;

    @FindBy(id = "com.myfitnesspal.android:id/title_template")
    private ExtendedWebElement errorNameGoals;

    @FindBy(id = "android:id/button1")
    private ExtendedWebElement okButtonGoals;

    @FindBy(id = "com.myfitnesspal.android:id/followupTextView")
    private ExtendedWebElement followUpTextView;

    @FindBy(id = "com.myfitnesspal.android:id/nextButton")
    private ExtendedWebElement nextButton;

    @FindBy(xpath = "//android.widget.TextView[@text='How many steps do you take per day now?']")
    private ExtendedWebElement followToSteps;

    @FindBy(id = "com.myfitnesspal.android:id/subtitleTextView")
    private ExtendedWebElement selectOneOption;

    @FindBy(id = "com.myfitnesspal.android:id/leadingTextView")
    private ExtendedWebElement leadingText;

    public GoalsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isAlertWindowPresent() {
        return alertWindow.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isErrorNamePresent() {
        return errorName.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isOkButtonPresent() {
        return okButton.isElementPresent(THREE_SECONDS);
    }

    @Override
    public ActivityLevelPageBase clickOnNextButton() {
        nextButton.click();
        return initPage(getDriver(), ActivityLevelPageBase.class);
    }

    @Override
    public void clickOnOkButton() {
        okButton.click();
    }

    @Override
    public void clickOnBackButton() {
        backButton.click(THREE_SECONDS);
    }

    @Override
    public boolean isPageOpened() {
        return titleText.isElementPresent(THREE_SECONDS);
    }

    @Override
    public String getErrorMessageText() {
        return errorMessage.getText();
    }

    @Override
    public boolean isAlertWindowGoalsPresent() {
        return errorWindowGoals.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isOkButtonGoalsPresent() {
        return okButtonGoals.isElementPresent(THREE_SECONDS);
    }

    @Override
    public void clickOnOkButtonGoals() {
        okButtonGoals.click();
    }

    @Override
    public AbstractPage clickOnButton(Goals page) {
        itemByText.format(page.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), page.getPageClass());
    }

    @Override
    public boolean isButtonActive(String goal) {
        return itemByText.format(goal).isClickable(THREE_SECONDS);
    }

    @Override
    public boolean isFollowUpPageOpened() {
        return itemByText.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isFollowToStepsPageOpened() {
        return followToSteps.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isAchieveOfResultPageOpened() {
        return selectOneOption.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isHelpToLookYouWantPageOpened() {
        return leadingText.isElementPresent(THREE_SECONDS);
    }

    @Override
    public boolean isMoreDetailsPageOpened() {
        return leadingText.isElementPresent(THREE_SECONDS);
    }

    @Override
    public ActivityLevelPageBase goToActivityLevelPage() {
        clickOnButton(Goals.GAIN_MUSCLE);
        clickOnButton(Goals.MODIFY_MY_DIET);
        clickOnNextButton();
        clickOnNextButton();
        clickOnButton(Goals.TONE_UP);
        clickOnNextButton();
        clickOnNextButton();
        clickOnButton(Goals.LESS_SUGAR);
        clickOnNextButton();
        clickOnNextButton();
        return initPage(getDriver(), ActivityLevelPageBase.class);
    }
}
