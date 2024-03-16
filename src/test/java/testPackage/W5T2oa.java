package testPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;




public class W5T2oa {
    WebDriver driver;
    /** ( This task should be managed with keyboard actions ) */
    // go to https://www.google.com/
    // search for "Scroll Methods" by using an Actions object

    @Test
    public void searchScrollMethodsUsingKeyboardTest(){
        WebDriver bot = null;
        WebDriver.Navigation navigate = bot.navigate();

        new Actions(driver)
                .sendKeys(driver.findElement(By.id("APjFqb")), "Scroll Methods", Keys.RETURN)
                .perform();

        assert driver.getCurrentUrl().startsWith("https://www.google.com/search?") : "not able to search by using an Actions";
    }

}
