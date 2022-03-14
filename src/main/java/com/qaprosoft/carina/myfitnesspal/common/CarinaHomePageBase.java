package com.qaprosoft.carina.myfitnesspal.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaHomePageBase extends AbstractPage {

    public CarinaHomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract CarinaWebViewPageBase navigateToWebViewPage();

    public abstract SignUpPageBaseMyFitnessPal navigateToChartsPage();

    public abstract CarinaMapsPageBase navigateToMapPage();

    public abstract CarinaUIElementsPageBase navigateToUIElementsPage();
    public abstract CarinaWebViewPageBase navigateToUserPage();
    public abstract boolean isPageOpened();
    public abstract String isEnumElementPresent();

}

