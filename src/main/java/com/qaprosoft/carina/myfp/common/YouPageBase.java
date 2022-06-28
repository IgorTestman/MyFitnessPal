package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.YouPageEnum;
import org.openqa.selenium.WebDriver;

public abstract class YouPageBase extends AbstractPage {

    public YouPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isGenderSelected(String gender);

    public abstract YouPageBase clickOnGenderButton(YouPageEnum country);

    public abstract boolean isCountrySelected(String country);

    public abstract void typeAge(String age);

    public abstract void clickOnNextButton();

    public abstract YouPageBase selectCountryFromDropdown(YouPageEnum country);

    public abstract void clickOnHeightButton();

    public abstract void clickOnWeightButton();

    public abstract void typeFirstHeight(String firstValue);

    public abstract void typeSecondHeight(String secondValue);

    public abstract void clickOnSetButton();

    public abstract void typeWeight(double value);

    public abstract YouPageBase selectHeightUnitFromDropdown(YouPageEnum height);

    public abstract boolean isHeightUnitSelected(String unit);

    public abstract YouPageBase selectWeightUnitFromDropdown(YouPageEnum weight);

    public abstract boolean isWeightUnitSelected(String unit);

    public abstract WeeklyGoalPageBase followToGoalWeight();

    public abstract void clickOnBackButton();

    public abstract void typeHeightInCentimeters(String height);

    public abstract String getInputAge();

    public abstract String getInputFirstHeight();

    public abstract String isInputSecondHeightPresent();

    public abstract int getInputValue(String value);

    public abstract void inputValues();

    public abstract String errorMessageIsPresent();

    }



