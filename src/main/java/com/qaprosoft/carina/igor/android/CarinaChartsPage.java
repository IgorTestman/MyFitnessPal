package com.qaprosoft.carina.igor.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.ChartsPageBase;
import com.qaprosoft.carina.igor.common.CarinaChartsPageBase;
import com.qaprosoft.carina.igor.utils.IConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = CarinaChartsPageBase.class)
public class CarinaChartsPage extends CarinaChartsPageBase implements IConstants {

    public CarinaChartsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "com.solvd.carinademoapplication:id/image_view")
    private ExtendedWebElement imageMainMenu;

    @FindBy(id = "com.solvd.carinademoapplication:id/fragmentFruitChart")
    private ExtendedWebElement chartsFruitsDiagram;

    @FindBy(id = "com.solvd.carinademoapplication:id/fragmentVennDiagram")
    private ExtendedWebElement chartsFruitsChart;
    @FindBy(id = "com.solvd.carinademoapplication:id/chartView")
    private ExtendedWebElement chartView;


    @Override
    public boolean isDiagramPresent() {
        return chartsFruitsDiagram.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isImageMainMenuPresent() {
        return imageMainMenu.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isFruitsChartPresent() {
        return chartsFruitsChart.isElementPresent(FIVE_SECONDS);
    }

    @Override
    public boolean isChartViewPresent() {
        return chartView.isElementPresent(FIVE_SECONDS);
    }
    @Override
    public void isChartViewClickable() {
        chartView.click();
    }
}



