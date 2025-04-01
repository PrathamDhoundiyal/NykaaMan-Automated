package pages;

import uistore.ProductPageLocator;
import utils.Base;
import utils.WebDriverHelper;

public class ProductPageActions {

    WebDriverHelper helper = new WebDriverHelper(Base.driver);
    ProductPageLocator productPageLocator = new ProductPageLocator();

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
