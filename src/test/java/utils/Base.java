package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

/*
 GOAL of Base class is to get the URL
 and Load the selenium driver instance
 with the browser type
 */

public class Base {

    // declared here as we need access in openBrowser Function
    public static Properties prop;

    // declared static as Only Single Instace of Driver needed
    public static WebDriver driver;

    /*
     * The ( loadProperties ) method reads the configuration file
     * to load key-value pairs such as the URL of the application
     * and the desired browser (e.g., Chrome or Edge).
     */

    private void loadProperties() throws IOException {

        // TO GET THE Confif File path
        String filePath = System.getProperty("user.dir") + "/config/browser.properties";

        // Reads the file from filePath
        FileInputStream file = new FileInputStream(filePath);

        // Creating the properties Obj
        prop = new Properties();
        // prop obj takes fileinputStream obj to read data from file
        prop.load(file);
    }

    public void openBrowser() {
        try {
            loadProperties();
            String URL = prop.getProperty("URL");
            String browserType = prop.getProperty("browser");

            switch (browserType) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--disable-notifications");
                    options.addArguments("--start-maximized");
                    driver = new ChromeDriver(options);
                    driver.get(URL);

                    break;

                case "edge":
                    driver = new EdgeDriver();
                    driver.get(URL);
                    break;
            }
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        }

        catch (Exception ex) {
            ex.printStackTrace();

        }

    }
}
