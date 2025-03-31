package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePageActions;
import utils.Base;

public class TestRunner {

    Base baseObj = new Base();
    HomePageActions homePageObj;

    @BeforeMethod
    void setup() {
        baseObj.openBrowser();
        homePageObj = new HomePageActions();
    }

    @Test
    void TestCase1() throws InterruptedException {
        homePageObj.searchTrimmer();
        homePageObj.pressEnter();
        homePageObj.clickFilter();
        homePageObj.applyFilter();
        Thread.sleep(8000);
    }

    @AfterMethod
    void tearDown() {
        baseObj.driver.quit();
    }

}
