package assignments;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class week6T1 {
    /*
        Create tests that depend on each other
        Create beforeClass and set up settings.
        By creating interdependent tests;
        First go to Facebook.
        Then go to Google depending on Facebook,
        Then go to Amazon depending on Google
        Close the driver.
      */
    @Test
    public void navigateFacebookTest(){
        WebDriver bot = null;
        final var navigate = bot.navigate();
    }
    @Test(dependsOnMethods = "navigateFacebookTest")
    public void navigateGoogleTest(){
        WebDriver bot = null;
        bot.navigate("https://www.google.com/");
    }
    @Test(dependsOnMethods = "navigateGoogleTest")
    public void navigateAmazonTest(){
        WebDriver bot = null;
        bot.navigate("https://www.amazon.sa/");
    }
}
