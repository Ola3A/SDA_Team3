package assignments.pages.lambdatest;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LambdaTest {

    private ActionsBot bot;

    private By firstnameInputBy = By.id("input-firstname");
    private By lastnameInputBy = By.id("input-lastname");
    private By emailInputBy = By.id("input-email");
    private By telephoneInputBy = By.id("input-telephone");
    private By passwordInputBy = By.id("input-password");
    private By confirmPasswordInputBy = By.id("input-confirm");
    private By checkBoxInputBy = By.id("input-agree");
    private By submitInputBy = By.cssSelector("input[type='submit']");
    private By accountCreatedBy = By.cssSelector("h1.page-title");

    public void LambdaTestRegisterPage(ActionsBot bot) {
        this.bot = bot;
    }

    public LambdaTest(ActionsBot bot) {
        this.bot = bot;
    }

    @Step("go to url https://ecommerce-playground.lambdatest.io/index.php?route=account/register")
    public LambdaTestRegisterPage goTo(){
        bot.navigate("https://ecommerce-playground.lambdatest.io/index.php?route=account/register");
        return this.goTo();
    }

    @Step("register new user")
    public LambdaTestRegisterPage register(String firstName, String lastName, String email, String phone,String password){
        bot.type(firstnameInputBy,firstName);
        bot.type(lastnameInputBy,lastName);
        bot.type(emailInputBy,email);
        bot.type(telephoneInputBy,phone);
        bot.type(passwordInputBy,password);
        bot.type(confirmPasswordInputBy,password);
        bot.click(checkBoxInputBy);
        bot.click(submitInputBy);
        return this.goTo();
    }

    @Step("assert Register user")
    public void assertRegister(){
        Assert.assertEquals(bot.getText(accountCreatedBy),"Your Account Has Been Created!");
    }
}
