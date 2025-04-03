package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.HomePageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;

public class HomePageActions {

    HomePageLocators homePageLocators = new HomePageLocators();
    WebDriverHelper helper = new WebDriverHelper(Base.driver);

    ExtentTest test;

    public HomePageActions(ExtentTest test) {
        this.test = test;
    }

    public void searchTrimmer() {
        try {
            test.log(Status.INFO, "Searching for Trimmer...");
            LoggerHandler.info("Searching for Trimmer...");
            helper.sendKeys(homePageLocators.inputBox, "Trimmer");
            test.log(Status.PASS, "Trimmer search initiated successfully.");
            LoggerHandler.info("Trimmer search initiated successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to search for Trimmer: " + e.getMessage());
            LoggerHandler.error("Failed to search for Trimmer: " + e.getMessage());
        }
    }

    public void pressEnter() {
        try {
            test.log(Status.INFO, "Pressing Enter key...");
            LoggerHandler.info("Pressing Enter key...");
            helper.enterKey(homePageLocators.inputBox);
            test.log(Status.PASS, "Enter key pressed successfully.");
            LoggerHandler.info("Enter key pressed successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to press Enter key: " + e.getMessage());
            LoggerHandler.error("Failed to press Enter key: " + e.getMessage());
        }
    }

    public void clickFilter() {
        try {
            test.log(Status.INFO, "Clicking on category filter...");
            LoggerHandler.info("Clicking on category filter...");
            helper.clickOnElemnent(homePageLocators.categoryFilter);
            test.log(Status.PASS, "Filter clicked successfully.");
            LoggerHandler.info("Filter clicked successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on filter: " + e.getMessage());
            LoggerHandler.error("Failed to click on filter: " + e.getMessage());
        }
    }

    public void applyFilter() {
        try {
            test.log(Status.INFO, "Applying filter by low price...");
            LoggerHandler.info("Applying filter by low price...");
            helper.clickOnElemnent(homePageLocators.filterByLowPrice);
            test.log(Status.PASS, "Filter applied successfully.");
            LoggerHandler.info("Filter applied successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to apply filter: " + e.getMessage());
            LoggerHandler.error("Failed to apply filter: " + e.getMessage());
        }
    }

    public void hoverItem() {
        try {
            test.log(Status.INFO, "Hovering over item...");
            LoggerHandler.info("Hovering over item...");
            helper.javascriptScroll(homePageLocators.productToHover);
            test.log(Status.PASS, "Successfully hovered over item.");
            LoggerHandler.info("Successfully hovered over item.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to hover over item: " + e.getMessage());
            LoggerHandler.error("Failed to hover over item: " + e.getMessage());
        }
    }

    public void clickAddToBag() {
        try {
            test.log(Status.INFO, "Adding item to bag...");
            LoggerHandler.info("Adding item to bag...");
            helper.hoverOverElement(homePageLocators.productToHover);
            helper.clickOnElemnent(homePageLocators.addToBag);
            test.log(Status.PASS, "Item added to bag successfully.");
            LoggerHandler.info("Item added to bag successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to add item to bag: " + e.getMessage());
            LoggerHandler.error("Failed to add item to bag: " + e.getMessage());
        }
    }

    public void clickCart() {
        try {
            test.log(Status.INFO, "Clicking on shopping cart...");
            LoggerHandler.info("Clicking on shopping cart...");
            helper.clickOnElemnent(homePageLocators.shoppingCartBtn);
            test.log(Status.PASS, "Successfully clicked on shopping cart.");
            LoggerHandler.info("Successfully clicked on shopping cart.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on shopping cart: " + e.getMessage());
            LoggerHandler.error("Failed to click on shopping cart: " + e.getMessage());
        }
    }

    public void clickProceed() {
        try {
            test.log(Status.INFO, "Switching to iframe and clicking on Proceed...");
            LoggerHandler.info("Switching to iframe and clicking on Proceed...");
            helper.switchToIFrame(homePageLocators.iframe);
            helper.clickOnElemnent(homePageLocators.proceedBtn);
            test.log(Status.PASS, "Proceed button clicked successfully.");
            LoggerHandler.info("Proceed button clicked successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Proceed: " + e.getMessage());
            LoggerHandler.error("Failed to click on Proceed: " + e.getMessage());
        }
    }

    public void clickBanner() {
        try {
            test.log(Status.INFO, "Clicking on banner...");
            LoggerHandler.info("Clicking on banner...");
            helper.clickOnElemnent(homePageLocators.banner);
            test.log(Status.PASS, "Banner clicked successfully.");
            LoggerHandler.info("Banner clicked successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on banner: " + e.getMessage());
            LoggerHandler.error("Failed to click on banner: " + e.getMessage());
        }
    }

    public void takeScreenshot() throws InterruptedException {
        try {
            test.log(Status.INFO, "Taking screenshot...");
            LoggerHandler.info("Taking screenshot...");
            Thread.sleep(3000);
            Screenshot.captureScreenshot("AddedToBag");
            test.log(Status.PASS, "Screenshot captured successfully.");
            LoggerHandler.info("Screenshot captured successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to capture screenshot: " + e.getMessage());
            LoggerHandler.error("Failed to capture screenshot: " + e.getMessage());
        }
    }

    public void hoverLifeStyle() {
        try {
            test.log(Status.INFO, "Hovering over Lifestyle...");
            LoggerHandler.info("Hovering over Lifestyle...");
            helper.hoverOverElement(homePageLocators.hooverLifestyle);
            test.log(Status.PASS, "Hovered over Lifestyle successfully.");
            LoggerHandler.info("Hovered over Lifestyle successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to hover over Lifestyle: " + e.getMessage());
            LoggerHandler.error("Failed to hover over Lifestyle: " + e.getMessage());
        }
    }

    public void clickKurta() {
        try {
            test.log(Status.INFO, "Clicking on Kurta section...");
            LoggerHandler.info("Clicking on Kurta section...");
            helper.clickOnElemnent(homePageLocators.kurta);
            test.log(Status.PASS, "Kurta section clicked successfully.");
            LoggerHandler.info("Kurta section clicked successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Kurta section: " + e.getMessage());
            LoggerHandler.error("Failed to click on Kurta section: " + e.getMessage());
        }
    }
}