package pages;

import uistore.HomePageLocators;
import utils.Base;
import utils.WebDriverHelper;

public class HomePageActions {

    HomePageLocators homePageLocators = new HomePageLocators();
    WebDriverHelper helper = new WebDriverHelper(Base.driver);

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
}
