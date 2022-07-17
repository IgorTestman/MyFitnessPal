package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.CaloriesAndMacroGoalsPageBase;
import com.qaprosoft.carina.myfp.common.MacronutrientsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.DefaultGoalEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CaloriesAndMacroGoalsPageBase.class)
public class CalorieAndMacroGoalsPage extends CaloriesAndMacroGoalsPageBase implements TimeConstants, IMobileUtils {

    public CalorieAndMacroGoalsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@text = '%s']/parent::*//*[contains(@resource-id, 'id/title')]")
    private ExtendedWebElement itemByText;

    @FindBy(xpath = "//*[@text = '%s']//*[contains(@resource-id,'id/numberpicker_input')]")
    private ExtendedWebElement inputNumberPicker;

    @FindBy(xpath = "//*[@text = '%s']/parent::*/parent::*/parent::*//*[contains(@resource-id, 'id/text')]")
    private ExtendedWebElement percentValue;

    @FindBy(xpath = "//*[@text = '%s']/parent::*/parent::*/parent::*//*[contains(@resource-id, 'id/side_title')]")
    private ExtendedWebElement weightValue;

    @FindBy(xpath = "//*[@text = '%s']/parent::*/parent::*/parent::*//*[contains(@resource-id, 'id/value')]")
    private ExtendedWebElement caloriesValue;

    @Override
    public MacronutrientsPageBase openMacronutrientsPage(DefaultGoalEnum calories) {
        itemByText.format(calories.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), MacronutrientsPageBase.class);
    }


    @Override
    public int getCarbsPercentage() {
        String carbsPercentage = percentValue.format(DefaultGoalEnum.CARBOHYDRATES.getName()).getText();
        String[] carbohydrates = carbsPercentage.split("\\D+");
        return Integer.parseInt(String.join("", carbohydrates));
    }

    @Override
    public int getFatPercentage() {
        String fatPercentage = percentValue.format(DefaultGoalEnum.FAT.getName()).getText();
        String[] fat = fatPercentage.split("\\D+");
        return Integer.parseInt(String.join("", fat));
    }

    @Override
    public int getProteinPercentage() {
        String proteinPercentage = percentValue.format(DefaultGoalEnum.PROTEIN.getName()).getText();
        String[] protein = proteinPercentage.split("\\D+");
        return Integer.parseInt(String.join("", protein));
    }

    @Override
    public int getSavedCarbsWeight() {
        String carbs = weightValue.format(DefaultGoalEnum.CARBOHYDRATES.getName()).getText();
        String[] carbohydrates = carbs.split("\\D+");
        return Integer.parseInt(String.join("", carbohydrates));
    }

    @Override
    public int getSavedFatWeight() {
        String fatValue = weightValue.format(DefaultGoalEnum.FAT.getName()).getText();
        String[] fat = fatValue.split("\\D+");
        return Integer.parseInt(String.join("", fat));
    }

    @Override
    public int getSavedProteinWeight() {
        String proteinValue = weightValue.format(DefaultGoalEnum.PROTEIN.getName()).getText();
        String[] protein = proteinValue.split("\\D+");
        return Integer.parseInt(String.join("", protein));
    }


    @Override
    public int getCurrentCalories() {
        String calories = caloriesValue.format(DefaultGoalEnum.CALORIES.getName()).getText();
        String[] value = calories.split("\\D+");
        return Integer.parseInt(String.join("", value));
    }
    @Override
    public int getUpdatedCalories() {
        String calories = caloriesValue.format(DefaultGoalEnum.CALORIES.getName()).getText();
        String[] value = calories.split("\\D+");
        return Integer.parseInt(String.join("", value));
    }
}
