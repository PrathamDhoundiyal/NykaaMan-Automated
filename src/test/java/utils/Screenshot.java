package utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

    public static void captureScreenshot(String filename) {
        File ssdir = new File("screenshots");
        if (!ssdir.exists()) {
            ssdir.mkdir();
        }

        File screenshot = ((TakesScreenshot) Base.driver).getScreenshotAs(OutputType.FILE);

        File sspath = new File(ssdir, filename + ".png");

        try {
            FileHandler.copy(screenshot, sspath);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
