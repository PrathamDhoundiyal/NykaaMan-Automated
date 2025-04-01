package pages;

import com.aventstack.extentreports.ExtentTest;

import uistore.HomePageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions {

    HomePageLocators homePageLocators = new HomePageLocators();
    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    ExtentTest test;

    // public HomePageActions(ExtentTest test) {
    // this.test = test;
    // }

    public void clickInputBox() {
        helper.clickOnElemnent(homePageLocators.inputBox);
    }

    public void searchTrimmer() {
        helper.sendKeys(homePageLocators.inputBox, "Trimmer");
    }

    public void pressEnter() {
        helper.enterKey(homePageLocators.inputBox);
    }

    public void clickFilter() {
        helper.clickOnElemnent(homePageLocators.categoryFilter);
    }

    public void applyFilter() {
        helper.clickOnElemnent(homePageLocators.filterByLowPrice);
    }

    public void hoverItem() {
        helper.javascriptScroll(homePageLocators.productToHover);
    }

    public void clickAddToBag() {
        helper.hoverOverElement(homePageLocators.productToHover);
        helper.clickOnElemnent(homePageLocators.addToBag);
    }

    public void clickCart() {
        helper.clickOnElemnent(homePageLocators.shoppingCartBtn);
    }

    public void clickProceed() {
        helper.switchToIFrame(homePageLocators.iframe);
        helper.clickOnElemnent(homePageLocators.proceedBtn);
    }

    public void clickBanner() {
        helper.clickOnElemnent(homePageLocators.banner);
    }

    public void hoverLifeStyle() {
        helper.hoverOverElement(homePageLocators.hooverLifestyle);
    }

    public void clickKurta() {
        helper.clickOnElemnent(homePageLocators.kurta);
    }
}
