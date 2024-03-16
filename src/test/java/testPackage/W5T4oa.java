package testPackage;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import java.util.Set;

public class W5T4oa {
    WebDriver driver;
    /*
        Go to URL: http://facebook.com
        getCookies,
        addCookie,
        deleteCookieNamed,
        deleteAllCookies
    */

        @Test
        public void cookiesTest(){
            RemoteWebDriver bot = null;
            WebDriver.Navigation navigate = bot.navigate();

            Set<Cookie> cookies = driver.manage().getCookies();

            driver.manage().addCookie(new Cookie("testKey","testValue"));

            driver.manage().deleteCookieNamed("testKey");

            driver.manage().deleteAllCookies();
        }
    }
}
