package pages;

import uistore.KurtaPageLocator;
import utils.Base;
import utils.WebDriverHelper;

public class KurtaPageActions {

    WebDriverHelper helper = new WebDriverHelper(Base.driver);
    KurtaPageLocator kurtaPageLocator = new KurtaPageLocator();

    public void switchKurtaTab() {
        helper.switchToNewWindow();
    }

    public void scrollToBottom() {
        helper.javascriptScroll(kurtaPageLocator.selectPage);
    }

    public void selectPage() {
        helper.clickOnElemnent(kurtaPageLocator.selectPage);

    }

    public void previewSize() {
        helper.hoverOverElement(kurtaPageLocator.card);
        helper.clickOnElemnent(kurtaPageLocator.checkSize);
    }

    public void addToBag() {
        helper.clickOnElemnent(kurtaPageLocator.addtoBag);
    }
}
