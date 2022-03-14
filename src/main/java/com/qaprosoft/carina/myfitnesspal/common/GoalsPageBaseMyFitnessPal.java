package com.qaprosoft.carina.myfitnesspal.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class GoalsPageBaseMyFitnessPal extends AbstractPage {

    public GoalsPageBaseMyFitnessPal(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isBackBtnPresent();

    public abstract boolean isGoalsTabPresent();

    public abstract boolean isPageIndicatorPresent();

    public abstract boolean isTitleTextPresent();

    public abstract boolean isSubtitleTextPresent();

    public abstract boolean isLoseWeightBtnPresent();

    public abstract boolean isMaintainWeightBtnPresent();

    public abstract boolean isGainWeightBtnPresent();

    public abstract boolean isGainMuscleBtnPresent();

    public abstract boolean isModifyMyDietBtnPresent();

    public abstract boolean isManageStressBtnPresent();

    public abstract boolean isIncreaseMyStepCountBtnPresent();

    public abstract boolean isNextBtnPresent();

    public abstract void clickOnNextBtn();
    public abstract void clickOnBackBtn();
    public abstract void swipeToManageStress();
    public abstract boolean isAlertWindowPresent();
    public abstract boolean isErrorNamePresent();
    public abstract boolean isOkBtnPresent();
    public abstract boolean isErrorMessagePresent();
    public abstract void clickOnOkBtn();
    public abstract String getErrorMessageText();
    public abstract void clickOnLoseWeightBtn();
    public abstract boolean isLoseWeightBtnSelected();
    public abstract void clickOnMaintainWeightBtn();
    public abstract boolean isMaintainWeightBtnSelected();
    public abstract void clickOngGainMuscleBtn();
    public abstract boolean isGainMuscleBtnSelected();
    public abstract void clickOnModifyMyDietBtn();
    public abstract boolean isModifyMyDietBtnSelected();
    public abstract void clickOnManageStressBtn();
    public abstract boolean isManageStressBtnSelected();
    public abstract void clickOnIncreaseMyStepCountBtn();
    public abstract boolean isIncreaseMyStepCountBtnSelected();
    public abstract void clickOngGainWeightBtn();
    public abstract boolean isgGainWeightBtnSelected();
    public abstract boolean isAlertWindowGoalsPresent();
    public abstract boolean isErrorNameGoalsPresent();
    public abstract boolean isErrorMessageGoalsPresent();
    public abstract boolean isOkBtnGoalsPresent();
    public abstract void clickOnOkBtnGoals();
    public abstract boolean clickMoreThanThreeBtns();

    }

