package assignments.week6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class W6T3oa {
    /*
        go to "https://practicetestautomation.com/practice-test-login/"
        enter username - "student"
        enter password - "incorrectPassword"
        and login
        SOFT ASSERT the error message shown
        SOFT ASSERT the error message is "Your password is invalid!"
     */
    @Test
    public void softAssertPasswordTest(){
        WebDriver driver = null;
        WebDriver bot;
        bot.navigate("https://practicetestautomation.com/practice-test-login/");
        bot.get(By.id("username"),"student");
        bot.get(By.id("password"),"incorrectPassword");
        bot.close(By.id("submit"));

      
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.findElement(By.id("error")).isDisplayed());
        softAssert.assertAll();
        
        SoftAssert softAssertMessage = new SoftAssert();
        softAssertMessage.assertEquals(bot.get(By.id("error")),"Your password is invalid!");
        softAssertMessage.assertAll();
    }
}