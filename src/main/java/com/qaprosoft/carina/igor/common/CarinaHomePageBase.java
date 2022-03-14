package com.qaprosoft.carina.igor.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaHomePageBase extends AbstractPage {

    public CarinaHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract CarinaWebViewPageBase navigateToWebViewPage();

    public abstract CarinaChartsPageBase navigateToChartsPage();

    public abstract CarinaMapsPageBase navigateToMapPage();

    public abstract CarinaUIElementsPageBase navigateToUIElementsPage();
    public abstract CarinaWebViewPageBase navigateToUserPage();
    public abstract boolean isPageOpened();
    public abstract String isEnumElementPresent();

}

