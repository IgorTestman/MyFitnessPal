package com.qaprosoft.carina.myfitnesspal.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaUIElementsPageBase extends AbstractPage {

    public CarinaUIElementsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeText(String text);

    public abstract void typeEmail(String email);

    public abstract String getEmail();

    public abstract String getText();

    public abstract String getDate();

    public abstract void typeDate(String date);

    public abstract void clickOnMaleRadioButton();

    public abstract void clickOnFemaleRadioButton();

    public abstract boolean isFemaleRadioButtonSelected();

    public abstract void clickOnOtherRadioButton();

    public abstract boolean isOthersRadioButtonSelected();

    public abstract void checkCopy();

    public abstract boolean isCopyChecked();

    public abstract boolean isProgressBarPresent();

    public abstract void swipeToFemaleRadioButton();

    public abstract boolean isSwitchBtnPresent();

    public abstract void swipeToProgressBar();



    }
