package pages;

import uistore.PerfumePageLocator;
import utils.Base;
import utils.WebDriverHelper;

public class PerfumePageActions {

    WebDriverHelper helper = new WebDriverHelper(Base.driver);
    PerfumePageLocator productPageLocator = new PerfumePageLocator();

    public void choosePerfume() {
        helper.clickOnElemnent(productPageLocator.perfume);
    }

    public void switchTab() {
        helper.switchToNewWindow();
    }

    public void applyProductFilter() {
        helper.clickOnElemnent(productPageLocator.moreOptions);
        helper.clickOnElemnent(productPageLocator.chooseMl);
    }

    public void buyPerfume() {
        helper.clickOnElemnent(productPageLocator.buyBtn);
    }

}
