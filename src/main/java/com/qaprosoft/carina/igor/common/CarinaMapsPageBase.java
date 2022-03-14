package com.qaprosoft.carina.igor.common;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class CarinaMapsPageBase extends AbstractPage {

    public CarinaMapsPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract boolean isNavigateBtnPresent();
    public abstract boolean isNameMenuPresent();
    public abstract boolean isAnimationImagePresent();
    public abstract boolean isZoomInClickable();
    public abstract boolean isZoomOutClickable();

}
