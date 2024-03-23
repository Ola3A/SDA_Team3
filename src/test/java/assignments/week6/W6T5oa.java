package assignments.week6;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class W6T5oa {
    WebDriver driver;
    /*
       //Go to URL: http://crossbrowsertesting.github.io/
       //Click to To-Do App
       //Checking Box to do-4 and Checking Box to do-5
       //If both clicks worked, then the following List should be have length 3.
       //Assert that this is correct
       //Assert that the to do we added is present in the list
       //Archiving old todos
       //If our archive link worked, then the following list should have length 4.
       //Assert that this is true as well
       //Doing Cross Browser Testing.
    */
    @Test
    public void checkingBoxTest(){
        WebDriver bot = null;
        bot.navigate("http://crossbrowsertesting.github.io/");

        bot.close(By.linkText("To-Do App"));

        bot.close(By.name("todo-4"));
        bot.close(By.name("todo-5"));

        Assert.assertEquals("3 of 5 remaining", bot.get(String.valueOf(By.xpath("//span[@class='ng-binding']"))));
        bot.close();
        Assert.assertEquals(3,driver.findElements(By.tagName("li")).size());

        bot.get(By.id("todotext"),"oa");
        bot.close(By.id("addbutton"));

        bot.close(By.linkText("archive"));

        Assert.assertTrue((4 == driver.findElements(By.tagName("li")).size()));

    }
}
