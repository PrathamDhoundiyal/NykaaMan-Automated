package utils;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverHelper {

    private WebDriver driver;
    // This will set this class's driver to hold the value
    // of the driver created by the Base class

    public WebDriverHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void explicityWait(By locator) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (Exception e) {
            System.out.println("Error while waiting for the element: " + e.getMessage());
        }
    }

    // Click Any Element
    public void clickOnElemnent(By locator) {
        try {
            explicityWait(locator);
            WebElement element = driver.findElement(locator);
            element.click();
        } catch (Exception e) {
            System.out.println("Error while clicking on the element: " + e.getMessage());
        }
    }

    // Send Keys/Input
    public void sendKeys(By locator, String message) {
        try {
            explicityWait(locator);
            WebElement element = driver.findElement(locator);
            element.sendKeys(message);
        } catch (Exception e) {
            System.out.println("Error while sending keys to the element: " + e.getMessage());
        }
    }

    // Enter Action
    public void enterKey(By locator) {
        explicityWait(locator);
        WebElement webElement = driver.findElement(locator);
        webElement.sendKeys(Keys.ENTER);
    }

    // Scroll to Element
    public void javascriptScroll(By locator) {
        try {
            new WebDriverWait(driver,
                    Duration.ofSeconds(10)).until(
                            ExpectedConditions.visibilityOfElementLocated(
                                    locator));
            WebElement element = driver.findElement(locator);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView()", element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Switch Control to new Window
    public void switchToNewWindow() {
        try {
            String currWindowHandle = driver.getWindowHandle();
            Set<String> allwindowHandles = driver.getWindowHandles();
            for (String handle : allwindowHandles) {
                if (!currWindowHandle.equals(handle)) {
                    driver.switchTo().window(handle);
                    return;
                }
            }
            throw new Exception("New Window could not be retrieved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hoverOverElement(By locator) {
        try {
            new WebDriverWait(driver,
                    Duration.ofSeconds(10)).until(
                            ExpectedConditions.visibilityOfElementLocated(
                                    locator));
            WebElement webElement = driver.findElement(locator);
            Actions act = new Actions(driver);
            act.moveToElement(webElement).build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getText(By locator) {
        try {
            new WebDriverWait(driver,
                    Duration.ofSeconds(10)).until(
                            ExpectedConditions.visibilityOfElementLocated(
                                    locator));
            WebElement webElement = driver.findElement(locator);
            return webElement.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return " ";
        }
    }

    public void switchToIFrame(By locator) {
        explicityWait(locator);
        WebElement iframe = driver.findElement(locator);
        driver.switchTo().frame(iframe);
    }

}

/*
 * 
 * package utils;
 * 
 * import java.time.Duration;
 * 
 * import java.util.Set;
 * 
 * import org.openqa.selenium.By;
 * import org.openqa.selenium.JavascriptExecutor;
 * import org.openqa.selenium.Keys;
 * import org.openqa.selenium.WebDriver;
 * import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.interactions.Actions;
 * import org.openqa.selenium.support.ui.ExpectedConditions;
 * import org.openqa.selenium.support.ui.Select;
 * import org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class WebDriverHelper {
 * private WebDriver driver;
 * 
 * public WebDriverHelper(WebDriver driver){
 * this.driver = driver;
 * }
 * 
 * public void implicitlyWait(int time){
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
 * }
 * 
 * public void explicityWait(int time, By locator){
 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
 * wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
 * }
 * 
 * public void clickOnElement(By locator){
 * try{
 * new WebDriverWait(driver,
 * Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(locator
 * ));
 * WebElement webElement = driver.findElement(locator);
 * webElement.click();
 * }
 * catch(Exception e){
 * e.printStackTrace();
 * }
 * }
 * 
 * public void sendKeys(By locator, String data){
 * try{
 * new WebDriverWait(driver,
 * Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(
 * locator));
 * WebElement webElement = driver.findElement(locator);
 * webElement.sendKeys(data);
 * }
 * catch(Exception e){
 * e.printStackTrace();
 * }
 * }
 * 
 * public String getText(By locator){
 * try{
 * new WebDriverWait(driver,
 * Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(
 * locator));
 * WebElement webElement = driver.findElement(locator);
 * return webElement.getText();
 * }
 * catch(Exception e){
 * e.printStackTrace();
 * return " ";
 * }
 * }
 * 
 * 
 * 
 * public void enterAction(By locator){
 * try{
 * WebElement webElement = driver.findElement(locator);
 * webElement.sendKeys(Keys.ENTER);
 * }
 * catch(Exception e){
 * e.printStackTrace();
 * }
 * }
 * 
 * public void hoverOverElement(By locator){
 * try{
 * new WebDriverWait(driver,
 * Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(
 * locator));
 * WebElement webElement = driver.findElement(locator);
 * Actions act = new Actions(driver);
 * act.moveToElement(webElement).build().perform();
 * }
 * catch(Exception e){
 * e.printStackTrace();
 * }
 * }
 * 
 * public void clearInputBox(By locator){
 * try{
 * WebElement webElement = driver.findElement(locator);
 * webElement.clear();
 * }
 * catch(Exception e){
 * e.printStackTrace();
 * }
 * }
 * 
 * public void selectDropDown(String xpath, String optionValue) {
 * try {
 * WebElement dropDownElement=driver.findElement(By.xpath(xpath));
 * Select select=new Select(dropDownElement);
 * select.selectByValue(optionValue);
 * }
 * catch(Exception e) {
 * e.printStackTrace();
 * }
 * }
 * 
 * }
 * 
 * 
 * 
 */