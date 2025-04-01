package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import pages.HomePageActions;
import pages.KurtaPageActions;
import pages.PerfumePageActions;
import utils.Base;

public class TestRunner {

    Base baseObj = new Base();
    HomePageActions homePageObj;
    PerfumePageActions perfumePageObj;
    KurtaPageActions kurtaPageObj;

    @BeforeClass
    void createReport() {

    }

    @BeforeMethod
    void setup() {
        baseObj.openBrowser();
    }

    @Test(enabled = true)
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
        Thread.sleep(4000);
    }

    @Test(enabled = true)
    void TestCase2() throws InterruptedException {
        homePageObj = new HomePageActions();
        perfumePageObj = new PerfumePageActions();

        homePageObj.clickBanner();
        perfumePageObj.choosePerfume();
        perfumePageObj.switchTab();
        perfumePageObj.applyProductFilter();
        perfumePageObj.buyPerfume();

        Thread.sleep(4000);
    }

    @Test
    void TestCase3() throws InterruptedException {
        homePageObj = new HomePageActions();
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

    }

}
