package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.HomePageActions;
import pages.ProductPageActions;
import utils.Base;

public class TestRunner {

    Base baseObj = new Base();
    HomePageActions homePageObj;
    ProductPageActions productPageObj;

    @BeforeClass
    void createReport() {

    }

    @BeforeMethod
    void setup() {
        baseObj.openBrowser();
    }

    @Test(enabled = false)
    void TestCase1() throws InterruptedException {
        // ExtentTest test;
        homePageObj = new HomePageActions();
        homePageObj.searchTrimmer();
        homePageObj.pressEnter();
        homePageObj.clickFilter();
        homePageObj.applyFilter();
        homePageObj.hoverItem();
        homePageObj.clickAddToBag();
        homePageObj.clickCart();
        // homePageObj.clickProceed();
        Thread.sleep(8000);
    }

    @Test
    void TestCase2() throws InterruptedException {
        homePageObj = new HomePageActions();
        productPageObj = new ProductPageActions();

        homePageObj.clickBanner();
        productPageObj.choosePerfume();
        productPageObj.switchTab();
        productPageObj.applyProductFilter();
        productPageObj.buyPerfume();

        Thread.sleep(8000);
    }

    @AfterMethod
    void tearDown() {
        baseObj.driver.quit();
    }

    @AfterClass
    void flushReport() {

    }

}
