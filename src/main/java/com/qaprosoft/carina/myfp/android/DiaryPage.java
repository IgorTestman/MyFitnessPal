package com.qaprosoft.carina.myfp.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.mobile.IMobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.myfp.common.FoodPageBase;
import com.qaprosoft.carina.myfp.common.DiaryPageBase;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import com.qaprosoft.carina.myfp.utils.constants.TimeConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = DiaryPageBase.class)
public class DiaryPage extends DiaryPageBase implements TimeConstants, IMobileUtils, TextConstants {
    private final String SALAD = "Salad";
    private final String SALAD_CALORIES = "155";
    private final String FOOD_DETAILS = "Asian salad, 1.0 cup";

    public DiaryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.myfitnesspal.android:id/edit_action_item")
    private ExtendedWebElement editButton;

    @FindBy(id = "com.myfitnesspal.android:id/add_food")
    private ExtendedWebElement addFoodButton;

    @FindBy(xpath = "//*[@class = 'android.widget.TextView' and @text = 'Breakfast']")
    private ExtendedWebElement itemMealTimeText;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/txtSectionHeader' and @text='%s']")
    private ExtendedWebElement mealTime;

    @FindBy(id = "com.myfitnesspal.android:id/meal_macros")
    private ExtendedWebElement mealMacros;

    @FindBy(xpath = "//*[@text='%s']/following-sibling::*/descendant::*[contains(@resource-id, 'com.myfitnesspal.android:id/txtSectionCalories')]")
    private ExtendedWebElement sectionCalories;

    @FindBy(id = "com.myfitnesspal.android:id/txtItemDescription")
    private ExtendedWebElement textItemDescription;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/txtCalories']")
    private ExtendedWebElement textCalories;

    @FindBy(xpath = "//*[@resource-id='com.myfitnesspal.android:id/txtItemDetails']")
    private ExtendedWebElement textItemDetails;


    @Override
    public FoodPageBase clickOnAddFoodButton() {
        addFoodButton.click(THREE_SECONDS);
        waitUntil(ExpectedConditions.visibilityOf(addFoodButton.getElement()), TEN_TIMEOUT);
        return initPage(getDriver(), FoodPageBase.class);
    }

    @Override
    public boolean isPageOpen() {
        return itemMealTimeText.isElementPresent(FIFTEEN_SECONDS);
    }

    @Override
    public boolean editFoodButtonIsPresent() {
        return editButton.isElementPresent(FIFTEEN_SECONDS);
    }

    @Override
    public boolean isMealTimePresent(String meal) {
        return mealTime.format(meal).isElementPresent(THREE_SECONDS);
    }

    @Override
    public String isCaloriesOfMealTimePresent() {
        return sectionCalories.getText();
    }

    @Override
    public String isMealMacrosPresent() {
        return mealMacros.getText();
    }

    @Override
    public String isNameOfAddedFoodPresent() {
        return textItemDescription.getText();
    }

    @Override
    public String isCaloriesOfAddedFoodPresent() {
        return textCalories.getText();
    }

    @Override
    public String isDetailsOfAddedFoodPresent() {
        return textItemDetails.getText();
    }

    @Override
    public boolean getAddedFoodName() {
        return textItemDescription.getText().equals(SALAD);
    }

    @Override
    public boolean getAddedFoodCalories() {
        return textCalories.getText().equals(SALAD_CALORIES);
    }

    @Override
    public boolean getAddedFoodDetails() {
        return textItemDetails.getText().equals(FOOD_DETAILS);
    }

    @Override
    public String getAddedMealName() {
        return textItemDescription.getText();
    }

    @Override
    public boolean getMeal() {
        getAddedFoodName();
        getAddedFoodCalories();
        getAddedFoodDetails();
        return false;
    }
}