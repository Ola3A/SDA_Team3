package assignments.week6;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.openqa.selenium.By.*;

public class W6T4oa {
    /*
       //Open the site: http://opencart.abstracta.us/index.php?route=account/login
       //Login with that credentials
       //Email: clarusway@gmail.com
       //Password: 123456789
       //Using the Search function do it with Data Provider for Mac, iPad and Samsung.
    */
    @Test(dataProvider = "searchData")
    public void searchWithDataProviderTest(String[][] searchData){
        WebDriver bot = null;
        bot.navigate("http://opencart.abstracta.us/index.php?route=account/login");

        bot.get(id("input-email"),"clarusway@gmail.com");
        bot.get(id("input-password"),"123456789");
        bot.close();


        for (String[] searchDatum : searchData) {
            bot.get(xpath("//input[@type='text']"), searchDatum[0]);
            bot.close();
        }
    }
    @DataProvider
    private Object[][] searchData(){
        Object[][] objects = new Object[1][1];

        String[][] searchData = new String[3][1];
        searchData[0][0] = "Mac";
        searchData[1][0] = "iPad";
        searchData[2][0] = "Samsung";

        objects[0][0] = searchData;
        return objects;
    }
}
