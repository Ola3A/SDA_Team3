package testPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
public class W5T6oa {
    WebDriver driver;
        // Go to amazon.com
        // Take Full Page Screenshot.
        // Take any spesific WebElement ScreenShot

        @Test
        public void screenshotTests() throws IOException {
            WebDriver bot = null;
            WebDriver.Navigation navigate = bot.navigate();


            File fullPageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(fullPageScreenshot, new File("target/fullPageScreenshot.png"));

            File elementScreenshot = driver.findElement(By.cssSelector("div#nav-belt")).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(elementScreenshot,new File("target/elementScreenshot.png"));

        }
}
