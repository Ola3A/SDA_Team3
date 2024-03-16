package testPackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;


public class W5T3oa {

    /*
       Go to Amazon
       Scroll to the bottom of the page using a robot
       Click on the "Back to top" web element
       Click on the Amazon logo at the bottom of the page (in the footer) using JavascriptExecutor
       Use Actions to type "ClarusWay" in the search box and perform the search
    */

    @Test
    public void scrollTest() throws AWTException {
        WebDriver bot = null;
        WebDriver.Navigation navigate = bot.navigate();


        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_END);
    }
}
