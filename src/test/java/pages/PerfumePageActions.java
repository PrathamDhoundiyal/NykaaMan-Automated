package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.PerfumePageLocator;
import utils.Base;
import utils.Reporter;
import utils.WebDriverHelper;

public class PerfumePageActions {

    WebDriverHelper helper = new WebDriverHelper(Base.driver);
    PerfumePageLocator productPageLocator = new PerfumePageLocator();
    ExtentTest test;

    public PerfumePageActions(ExtentTest test) {
        this.test = test;
    }

    public void choosePerfume() {
        try {
            test.log(Status.INFO, "Attempting to choose a perfume...");
            helper.clickOnElemnent(productPageLocator.perfume);
            test.log(Status.PASS, "Successfully chose a perfume.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to choose a perfume: " + e.getMessage());
        }
    }

    public void switchTab() {
        try {
            test.log(Status.INFO, "Switching to new tab...");
            helper.switchToNewWindow();
            test.log(Status.PASS, "Switched to new tab successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to switch to new tab: " + e.getMessage());
        }
    }

    public void applyProductFilter() {
        try {
            test.log(Status.INFO, "Applying product filters...");
            helper.clickOnElemnent(productPageLocator.moreOptions);
            helper.clickOnElemnent(productPageLocator.chooseMl);
            test.log(Status.PASS, "Product filters applied successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to apply product filters: " + e.getMessage());
        }
    }

    public void buyPerfume() {
        try {
            test.log(Status.INFO, "Attempting to buy the selected perfume...");
            helper.clickOnElemnent(productPageLocator.buyBtn);
            test.log(Status.PASS, "Successfully bought the perfume.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to buy the perfume: " + e.getMessage());
        }
    }

    public void addScreenshot() {
        try {
            test.log(Status.INFO, "Adding screenshot to the report...");
            Reporter.attachScreenshotToReport("Perfume", test, "Perfume Selected");
            test.log(Status.PASS, "Screenshot added successfully.");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to add screenshot: " + e.getMessage());
        }
    }
}
