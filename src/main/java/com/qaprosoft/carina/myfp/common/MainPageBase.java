package com.qaprosoft.carina.myfp.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.myfp.utils.constants.TextConstants;
import org.openqa.selenium.WebDriver;

public abstract class MainPageBase extends AbstractPage implements TextConstants {

    public MainPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isPageDownloaded();

    public abstract boolean closeImage();
}