package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.enums.YouPage;
import org.openqa.selenium.WebDriver;

public abstract class YouPageBase extends AbstractPage {

    public YouPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isGenderSelected(String gender);

    public abstract AbstractPage clickOnGenderButton(YouPage country);

    public abstract boolean isCountrySelected(String country);

    public abstract void typeAge(String age);

    public abstract void clickOnNextButton();

    public abstract AbstractPage selectCountryFromDropdown(YouPage country);

    public abstract void clickOnHeightButton();

    public abstract void clickOnWeightButton();

    public abstract void typeFirstHeight(String firstValue);

    public abstract void typeSecondHeight(String secondValue);

    public abstract void clickOnSetButton();

    public abstract void typeWeight(String value);

    public abstract AbstractPage selectHeightUnitFromDropdown(YouPage height);

    public abstract boolean isHeightUnitSelected(String unit);

    public abstract AbstractPage selectWeightUnitFromDropdown(YouPage weight);

    public abstract boolean isWeightUnitSelected(String unit);

    public abstract WeeklyGoalPageBase followToGoalWeight();

    public abstract void clickOnBackButton();

    public abstract void typeHeightInCentimeters(String height);

    public abstract String isInputAgePresent();

    public abstract String isInputFirstHeightPresent();

    public abstract String isInputSecondHeightPresent();

    public abstract String isInputValuePresent();

}



