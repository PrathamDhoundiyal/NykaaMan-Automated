package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import pages.HomePageActions;
import pages.KurtaPageActions;
import pages.PerfumePageActions;
import utils.Base;
import utils.Reporter;

// REPORTER Util Not good Broken Link Image
public class TestRunner {

    Base baseObj = new Base();
    ExtentReports report;
    HomePageActions homePageObj;
    PerfumePageActions perfumePageObj;
    KurtaPageActions kurtaPageObj;

    @BeforeClass
    void createReport() {
        report = Reporter.generateExtentReport("Report");
    }

    @BeforeMethod
    void setup() {
        baseObj.openBrowser();
    }

    @Test(enabled = true)
    void TestCase1() throws InterruptedException {
        ExtentTest test1 = Reporter.createTest("test1");
        homePageObj = new HomePageActions(test1);
        homePageObj.searchTrimmer();
        homePageObj.pressEnter();
        homePageObj.clickFilter();
        homePageObj.applyFilter();
        homePageObj.hoverItem();
        homePageObj.clickAddToBag();
        homePageObj.clickCart();
        homePageObj.takeScreenshot();
        // homePageObj.clickProceed();
        Thread.sleep(4000);
    }

    @Test(enabled = true)
    void TestCase2() throws InterruptedException {
        ExtentTest test2 = Reporter.createTest("test2");
        homePageObj = new HomePageActions(test2);
        perfumePageObj = new PerfumePageActions(test2);

        homePageObj.clickBanner();
        perfumePageObj.choosePerfume();
        perfumePageObj.switchTab();
        perfumePageObj.applyProductFilter();
        perfumePageObj.buyPerfume();
        perfumePageObj.addScreenshot();

        Thread.sleep(4000);
    }

    @Test(enabled = true)
    void TestCase3() throws InterruptedException {
        ExtentTest test3 = Reporter.createTest("test3");
        homePageObj = new HomePageActions(test3);
        kurtaPageObj = new KurtaPageActions();

        homePageObj.hoverLifeStyle();
        homePageObj.clickKurta();
        kurtaPageObj.switchKurtaTab();
        kurtaPageObj.scrollToBottom();
        kurtaPageObj.selectPage();
        kurtaPageObj.previewSize();
        kurtaPageObj.addToBag();
        Thread.sleep(4000);

    }

    @AfterMethod
    void tearDown() {
        baseObj.driver.quit();
    }

    @AfterClass
    void flushReport() {
        report.flush();
    }

}
