package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.NutritionGoalsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.CalorieAndMacroGoalsEnum;
import com.qaprosoft.carina.myfp.utils.enums.NameOfCalories;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NutritionGoalsPageBase.class)
public class NutritionGoalsPage extends NutritionGoalsPageBase implements TimeConstants, IMobileUtils {

    public NutritionGoalsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@text = '%s']/parent::*//*[contains(@resource-id, 'id/title')]")
    private ExtendedWebElement itemByText;

    @FindBy(id = "com.myfitnesspal.android:id/textCurrentCarbIntake")
    private ExtendedWebElement currentCarb;

    @FindBy(id = "com.myfitnesspal.android:id/textCurrentProteinIntake")
    private ExtendedWebElement currentProtein;

    @FindBy(id = "com.myfitnesspal.android:id/textCurrentFatIntake")
    private ExtendedWebElement currentFat;

    @FindBy(xpath = "//*[@text = '%s']//*[contains(@resource-id,'id/numberpicker_input')]")
    private ExtendedWebElement inputNumberPicker;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Done']")
    private ExtendedWebElement doneButton;


    @Override
    public NutritionGoalsPageBase openCalorieAndMacrosPage(CalorieAndMacroGoalsEnum calories) {
        itemByText.format(calories.getName()).click(THREE_SECONDS);
        return initPage(getDriver(), NutritionGoalsPageBase.class);
    }

    @Override
    public int getCarbsWeight() {
        String carbValue = currentCarb.format(NameOfCalories.CARBS.getName()).getText();
        String[] carb = carbValue.split("\\D+");
        return Integer.parseInt(String.join("", carb));
    }

    @Override
    public int getProteinWeight() {
        String proteinValue = currentProtein.format(NameOfCalories.PROTEIN.getName()).getText();
        String[] protein = proteinValue.split("\\D+");
        return Integer.parseInt(String.join("", protein));
    }

    @Override
    public int getFatWeight() {
        String fatValue = currentFat.format(NameOfCalories.FAT.getName()).getText();
        String[] fat = fatValue.split("\\D+");
        return Integer.parseInt(String.join("", fat));
    }

    @Override
    public NutritionGoalsPageBase setMacronutrientsPercentage(int carb, int protein, int fat) {
        ExtendedWebElement carbValue = inputNumberPicker.format(carb);
        swipe(carbValue, IMobileUtils.Direction.UP, FIVE_SWIPES, SLOW_SWIPES);
        ExtendedWebElement proteinValue = inputNumberPicker.format(protein);
        swipe(proteinValue, IMobileUtils.Direction.UP, FIVE_SWIPES, SLOW_SWIPES);
        ExtendedWebElement fatValue = inputNumberPicker.format(fat);
        swipe(fatValue, IMobileUtils.Direction.UP, FIVE_SWIPES, SLOW_SWIPES);
        return initPage(getDriver(), NutritionGoalsPageBase.class);
    }
    @Override
    public void clickOnDoneButton() {
        doneButton.click(THREE_SECONDS);

    }
}
