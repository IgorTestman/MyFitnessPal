package com.qaprosoft.carina.igor.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaChartsPageBase extends AbstractPage {

    public CarinaChartsPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isDiagramPresent();
    public abstract boolean isImageMainMenuPresent();
    public abstract boolean isFruitsChartPresent();
    public abstract boolean isChartViewPresent();
    public abstract  void isChartViewClickable();
}
