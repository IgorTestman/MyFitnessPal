package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.MacronutrientsPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import com.qaprosoft.carina.myfp.utils.enums.DefaultGoalEnum;
import com.qaprosoft.carina.myfp.utils.enums.NameOfCaloriesEnum;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MacronutrientsPageBase.class)
public class MacronutrientsPage extends MacronutrientsPageBase implements IMobileUtils, TimeConstants {

    public MacronutrientsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/textCurrentCarbIntake")
    private ExtendedWebElement currentCarb;

    @FindBy(id = "com.myfitnesspal.android:id/textCurrentProteinIntake")
    private ExtendedWebElement currentProtein;

    @FindBy(id = "com.myfitnesspal.android:id/textCurrentFatIntake")
    private ExtendedWebElement currentFat;

    @FindBy(xpath = "//*[contains(@resource-id,'id/text%sPercentLabel')]/parent::*//*[contains(@class, " +
            "'android.widget.Button')][1]")
    private ExtendedWebElement clickOnDown;

    @FindBy(xpath = "//*[contains(@resource-id,'id/text%sPercentLabel')]/parent::*//*[contains(@class, " +
            "'android.widget.Button')][2]")
    private ExtendedWebElement clickOnUp;

    @FindBy(xpath = "//*[contains(@resource-id,'id/text%sPercentLabel')]/parent::*//*[contains(@class, " +
            "'android.widget.EditText')]")
    private ExtendedWebElement inputItem;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private ExtendedWebElement backButton;

    @FindBy(id = "com.myfitnesspal.android:id/textMacronutrientPercentTotal")
    private ExtendedWebElement totalValue;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='Done']")
    private ExtendedWebElement doneButton;

    @FindBy(xpath = "//*[contains(@resource-id,'id/text%sPercentLabel')]/parent::*//*[contains(@class, " +
            "'android.widget.NumberPicker')]")
    private ExtendedWebElement numberPicker;

    @FindBy(xpath = "//*[contains(@resource-id,'id/text%sPercentLabel')]/parent::*//*[contains(@resource-id, " +
            "'id/numberpicker_input')]")
    private ExtendedWebElement inputNumberPickerField;

    @FindBy(xpath = "//*[@text='%s']//*[contains(@resource-id,'id/textCarbPercentLabel')]/parent::*//*[contains(@class," +
            " 'android.widget.EditTex')]")
    private ExtendedWebElement carbPicker;

    @FindBy(xpath = "//*[@text='%s']//*[contains(@resource-id,'id/textFatPercentLabel')]/parent::*//*[contains(@class," +
            " 'android.widget.EditTex')]")
    private ExtendedWebElement fatPicker;

    @FindBy(xpath = "//*[@text='%s']//*[contains(@resource-id,'id/textProteinPercentLabel')]/parent::*//*[contains(@class, " +
            "'android.widget.EditTex')]")
    private ExtendedWebElement proteinPicker;

    @Override
    public void setMacronutrientsPercentage(int carb, int protein, int fat) {
        String percentageCarbValue = inputNumberPickerField.format(NameOfCaloriesEnum.CARB.getName()).getText();
        String[] percentCarb = percentageCarbValue.split("\\D+");
        int carbValue = Integer.parseInt(String.join("", percentCarb));
        ExtendedWebElement clickOnDownCarb = clickOnDown.format(NameOfCaloriesEnum.CARB.getName());
        ExtendedWebElement clickOnUpCarb = clickOnUp.format(NameOfCaloriesEnum.CARB.getName());
        if (carbValue < carb) {
            for (int newCarb = 0; newCarb <= 100; ) {
                clickOnUpCarb.click(THREE_SECONDS);
                carbValue = carbValue + 5;
                if (carbValue == carb)
                    break;
            }
        }
        if (carbValue > carb) {
            for (int newCarb = 0; newCarb <= 100; ) {
                clickOnDownCarb.click(THREE_SECONDS);
                carbValue = carbValue - 5;
                if (carbValue == carb)
                    break;
            }
        }

        String percentageProteinValue = inputNumberPickerField.format(NameOfCaloriesEnum.PROTEIN.getName()).getText();
        String[] percentProtein = percentageProteinValue.split("\\D+");
        int proteinValue = Integer.parseInt(String.join("", percentProtein));
        ExtendedWebElement clickOnDownProtein = clickOnDown.format(NameOfCaloriesEnum.PROTEIN.getName());
        ExtendedWebElement clickOnUpProtein = clickOnUp.format(NameOfCaloriesEnum.PROTEIN.getName());
        if (proteinValue < protein) {
            for (int newProtein = 0; newProtein <= 100; ) {
                clickOnUpProtein.click(THREE_SECONDS);
                proteinValue = proteinValue + 5;
                if (proteinValue == protein)
                    break;
            }
        }
        if (proteinValue > protein) {
            for (int newProtein = 0; newProtein <= 100; ) {
                clickOnDownProtein.click(THREE_SECONDS);
                proteinValue = proteinValue - 5;
                if (proteinValue == protein)
                    break;
            }
        }

        String percentageFatValue = inputNumberPickerField.format(NameOfCaloriesEnum.FAT.getName()).getText();
        String[] percentFat = percentageFatValue.split("\\D+");
        int fatValue = Integer.parseInt(String.join("", percentFat));
        ExtendedWebElement clickOnDownFat = clickOnDown.format(NameOfCaloriesEnum.FAT.getName());
        ExtendedWebElement clickOnUpFat = clickOnUp.format(NameOfCaloriesEnum.FAT.getName());
        if (fatValue < fat) {
            for (int newFat = 0; newFat <= 100; ) {
                clickOnUpFat.click(THREE_SECONDS);
                fatValue = fatValue + 5;
                if (fatValue == fat)
                    break;
            }
        }
        if (fatValue > fat) {
            for (int newFat = 0; newFat <= 100; ) {
                clickOnDownFat.click(THREE_SECONDS);
                fatValue = fatValue - 5;
                if (fatValue == fat)
                    break;
            }
        }
    }


    @Override
    public void clickOnDoneButton() {
        doneButton.click(THREE_SECONDS);
    }

    @Override
    public void clickOnBackButton() {
        backButton.click(THREE_SECONDS);
    }

    @Override
    public int getUpdatedCarbsWeight() {
        String carbValue = currentCarb.format(DefaultGoalEnum.CARBOHYDRATES.getName()).getText();
        String[] carb = carbValue.split("\\D+");
        return Integer.parseInt(String.join("", carb));
    }

    @Override
    public int getUpdatedProteinWeight() {
        String proteinValue = currentProtein.format(DefaultGoalEnum.PROTEIN.getName()).getText();
        String[] protein = proteinValue.split("\\D+");
        return Integer.parseInt(String.join("", protein));
    }

    @Override
    public int getUpdatedFatWeight() {
        String fatValue = currentFat.format(DefaultGoalEnum.FAT.getName()).getText();
        String[] fat = fatValue.split("\\D+");
        return Integer.parseInt(String.join("", fat));
    }

    @Override
    public int getTotal(String total) {
        String totalAll = totalValue.format(total).getText();
        String[] totalValue = totalAll.split("\\D+");
        return Integer.parseInt(String.join("", totalValue));
    }

    @Override
    public void resetPercentageValues(int reset) {
        String percentageCarbValue = inputNumberPickerField.format(NameOfCaloriesEnum.CARB.getName()).getText();
        String[] percentCarb = percentageCarbValue.split("\\D+");
        int newCarb = Integer.parseInt(String.join("", percentCarb));
        if (newCarb != 0) {
            ExtendedWebElement scrollCarb = numberPicker.format(NameOfCaloriesEnum.CARB.getName());
            ExtendedWebElement skipToZero = carbPicker.format(reset);
            swipe(skipToZero, scrollCarb, Direction.DOWN, SIX_SWIPES, FAST_SWIPES);
        }
        String percentageProteinValue = inputNumberPickerField.format(NameOfCaloriesEnum.PROTEIN.getName()).getText();
        String[] percentProtein = percentageProteinValue.split("\\D+");
        int newProtein = Integer.parseInt(String.join("", percentProtein));
        if (newProtein != 0) {
            ExtendedWebElement scrollProtein = numberPicker.format(NameOfCaloriesEnum.PROTEIN.getName());
            ExtendedWebElement skipToZero = proteinPicker.format(reset);
            swipe(skipToZero, scrollProtein, Direction.DOWN, SIX_SWIPES, FAST_SWIPES);
        }
        String percentageFatValue = inputNumberPickerField.format(NameOfCaloriesEnum.FAT.getName()).getText();
        String[] percentFat = percentageFatValue.split("\\D+");
        int newFat = Integer.parseInt(String.join("", percentFat));
        if (newFat != 0) {
            ExtendedWebElement scrollFat = numberPicker.format(NameOfCaloriesEnum.FAT.getName());
            ExtendedWebElement skipToZero = fatPicker.format(reset);
            swipe(skipToZero, scrollFat, Direction.DOWN, SIX_SWIPES, FAST_SWIPES);
        }
    }
}
