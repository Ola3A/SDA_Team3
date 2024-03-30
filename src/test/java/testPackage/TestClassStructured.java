package testPackage;

import com.sun.nio.sctp.Association;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.sun.nio.sctp.Association.*;


public class TestClassStructured {

    // 1. class level

    // 2. BeforeAll

    // 3. BeforeEach
    // 4. testMethod1
    // 5. AfterEach

    // 6. BeforeEach
    // 7. testMethod2
    // 8. AfterEach

    // 9. AfterAll
    WebDriver driver;


    /**
     *
     */
//    @Test
//    public void checkPageTitle(){
//
//        // checkpoint
//        //WebDriver driver = new ChromeDriver();
//        var title = driver.getTitle();
//        //Association.assertEquals("DuckDuckGo - Privacy, simplified", title);
//
//    }
    @Test
    public void checkPageUrl(){

        var currentUrl = driver.getCurrentUrl();
        //Association.assertEquals("https://duckduckgo.com/", currentUrl);

    }
    @Test
    public void webFormManipulation(){
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");

        By textInput = By.id("my-text-id");
        driver.findElement(textInput).sendKeys("Selenium is Great!");

        By pageHeader = By.tagName("h1");
        var textValue = driver.findElement(pageHeader).getText();
        Association.assertEquals("web form", textValue);
    }



    @BeforeEach
    public void beforeEach(){
        // initializing the session
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // initial navigation
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");

        // test steps
        driver.navigate().to("https://duckduckgo.com"); // google.com

    }
    @AfterEach
    public void afterEach(){
        // terminating the session
        driver.quit();

    }

}
