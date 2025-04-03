package utils;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporter extends Base {
    private static ExtentReports report;

    public static ExtentReports generateExtentReport(String reportName) {
        if (report == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter(
                    System.getProperty("user.dir") + "/reports/" + reportName + ".html");

            report = new ExtentReports();
            report.attachReporter(reporter);
        }
        return report;
    }

    public static ExtentTest createTest(String testName) {
        return report.createTest(testName);
    }

    public static void attachScreenshotToReport(String filename, ExtentTest test, String message) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String directoryPath = System.getProperty("user.dir") + "/reports/screenshots/";
            File directory = new File(directoryPath);

            if (!directory.exists()) {
                directory.mkdirs();
            }

            // Use absolute path for better reference
            String filepath = directory.getAbsolutePath() + "/" + filename + ".png";
            File path = new File(filepath);
            FileHandler.copy(screenshot, path);

            // Log screenshot with absolute path
            test.info(message, MediaEntityBuilder.createScreenCaptureFromPath(path.getAbsolutePath()).build());

        } catch (Exception e) {
            test.fail("Failed to attach screenshot: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
