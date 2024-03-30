package testPackage;


import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    @Test
    public void testMethod(){
        WebDriver driver = new ChromeDriver();

        //driver.manage().window().maximize();
//        driver.manage().window().setPosition(new Point(0,0));
//        driver.manage().window().setSize(new Dimension(1920, 1000));


//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//        driver.getTitle();
//        driver.quit();
        driver.navigate().to("https://www.selenium.dev/selenium/web/web-form.html");
        driver.navigate().refresh();
        //driver.navigate().to("https://duckduckgo.com");
        driver.navigate().back();
        driver.navigate().forward();

//        try {
//            Thread.sleep(10000);
//        }catch (InterruptedException e){
//            throw new RuntimeException(e);
//        }


        var title = driver.getTitle();
        //Assertions.assertEquals("", title);
        var currentUrl = driver.getCurrentUrl();
        var pageSource = driver.getPageSource();
        //driver.quit();

    }
}
