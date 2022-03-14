package com.qaprosoft.carina.myfitnesspal.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfitnesspal.common.GoalsPageBaseMyFitnessPal;
import com.qaprosoft.carina.myfitnesspal.utils.IConstantsMyFitnessPal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = GoalsPageBaseMyFitnessPal.class)
public class GoalsPageMyFitnessPal extends GoalsPageBaseMyFitnessPal implements IMobileUtils, IConstantsMyFitnessPal {

    @FindBy(xpath = "//android.widget.ImageButton[@index='0']")
    private ExtendedWebElement backBtn;
    @FindBy(xpath = "//android.widget.TextView[@text='Goals']")
    private ExtendedWebElement goalsTab;
    @FindBy(id = "com.myfitnesspal.android:id/page_indicator")
    private ExtendedWebElement pageIndicator;
    @FindBy(id = "com.myfitnesspal.android:id/titleTextView")
    private ExtendedWebElement titleText;
    @FindBy(id = "com.myfitnesspal.android:id/subtitleTextView")
    private ExtendedWebElement subtitleText;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Lose Weight']")
    private ExtendedWebElement loseWeightBtn;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Maintain Weight']")
    private ExtendedWebElement maintainWeightBtn;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Gain Weight']")
    private ExtendedWebElement gainWeightBtn;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Gain Muscle']")
    private ExtendedWebElement gainMuscleBtn;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Modify My Diet']")
    private ExtendedWebElement modifyMyDietBtn;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Manage Stress']")
    private ExtendedWebElement manageStressBtn;
    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Increase My Step Count']")
    private ExtendedWebElement increaseMyStepCountBtn;
    @FindBy(id = "com.myfitnesspal.android:id/nextButton")
    private ExtendedWebElement nextBtn;
    @FindBy(id = "com.myfitnesspal.android:id/container")
    private ExtendedWebElement container;
    @FindBy(id = "com.myfitnesspal.android:id/parentPanel")
    private ExtendedWebElement alertWindow;
    @FindBy(id = "com.myfitnesspal.android:id/title_template")
    private ExtendedWebElement errorName;
    @FindBy(id = "android:id/message")
    private ExtendedWebElement errorMessage;
    @FindBy(id = "android:id/button1")
    private ExtendedWebElement okBtn;

    @FindBy(id = "com.myfitnesspal.android:id/action_bar_root")
    private ExtendedWebElement errorWindowGoals;
    @FindBy(id = "com.myfitnesspal.android:id/title_template")
    private ExtendedWebElement errorNameGoals;
    @FindBy(xpath = "//android.widget.TextView[@text='You’ve selected the max number of responses. To change, deselect a previous response.']")
    private ExtendedWebElement errorMessageGoals;
    @FindBy(id = "android:id/button1")
    private ExtendedWebElement okBtnGoals;


    public GoalsPageMyFitnessPal(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isBackBtnPresent() {
        return backBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isGoalsTabPresent() {
        return goalsTab.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isPageIndicatorPresent() {
        return pageIndicator.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isTitleTextPresent() {
        return titleText.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isSubtitleTextPresent() {
        return subtitleText.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isLoseWeightBtnPresent() {
        return loseWeightBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isMaintainWeightBtnPresent() {
        return maintainWeightBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isGainWeightBtnPresent() {
        return gainWeightBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isGainMuscleBtnPresent() {
        return gainMuscleBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isModifyMyDietBtnPresent() {
        return modifyMyDietBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isManageStressBtnPresent() {
        return manageStressBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isIncreaseMyStepCountBtnPresent() {
        return increaseMyStepCountBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isNextBtnPresent() {
        return nextBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isAlertWindowPresent() {
        return alertWindow.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isErrorNamePresent() {
        return errorName.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isErrorMessagePresent() {
        return errorMessage.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isOkBtnPresent() {
        return okBtn.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public void clickOnNextBtn() {
        nextBtn.click();
    }

    @Override
    public void clickOnOkBtn() {
        okBtn.click();
    }

    @Override
    public void clickOnBackBtn() {
        backBtn.click(FIVE_SECONDS);

    }

    @Override
    public boolean isPageOpened() {
        return titleText.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public String getErrorMessageText() {
        return errorMessage.getText();
    }

    @Override
    public void swipeToManageStress() {
        swipe(increaseMyStepCountBtn, container, 10);
    }

    @Override
    public void clickOnLoseWeightBtn() {
        loseWeightBtn.click();
    }

    @Override
    public boolean isLoseWeightBtnSelected() {
        return loseWeightBtn.isChecked();
    }

    @Override
    public void clickOnMaintainWeightBtn() {
        maintainWeightBtn.click();
    }

    @Override
    public boolean isMaintainWeightBtnSelected() {
        return maintainWeightBtn.isChecked();
    }

    @Override
    public void clickOngGainWeightBtn() {
        gainWeightBtn.click();
    }

    @Override
    public boolean isgGainWeightBtnSelected() {
        return gainWeightBtn.isChecked();
    }


    @Override
    public void clickOngGainMuscleBtn() {
        gainMuscleBtn.click();
    }

    @Override
    public boolean isGainMuscleBtnSelected() {
        return gainMuscleBtn.isChecked();
    }

    @Override
    public void clickOnModifyMyDietBtn() {
        modifyMyDietBtn.click();
    }

    @Override
    public boolean isModifyMyDietBtnSelected() {
        return modifyMyDietBtn.isChecked();
    }

    @Override
    public void clickOnManageStressBtn() {
        manageStressBtn.click();
    }

    @Override
    public boolean isManageStressBtnSelected() {
        return manageStressBtn.isChecked();
    }

    @Override
    public void clickOnIncreaseMyStepCountBtn() {
        increaseMyStepCountBtn.click();
    }

    @Override
    public boolean isIncreaseMyStepCountBtnSelected() {
        return increaseMyStepCountBtn.isChecked();
    }

    @Override
    public boolean isAlertWindowGoalsPresent() {
        return errorWindowGoals.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isErrorNameGoalsPresent() {
        return errorNameGoals.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isErrorMessageGoalsPresent() {
        return errorMessageGoals.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isOkBtnGoalsPresent() {
        return okBtnGoals.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public void clickOnOkBtnGoals() {
        okBtnGoals.click();
    }

    public boolean clickMoreThanThreeBtns() {
        gainWeightBtn.click();
        gainMuscleBtn.click();
        modifyMyDietBtn.click();
        manageStressBtn.click();
        return errorWindowGoals.isElementPresent();
    }


}