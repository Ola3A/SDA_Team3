package Week7oa;

import assignments.pages.lambdatest.LambdaTestRegisterPage;
import org.junit.jupiter.api.Test;

public class W7T1oa {
    /*
      go to url : https://ecommerce-playground.lambdatest.io/index.php?route=account/register
      register account test with fluent page object approach
    */

    @Test
    public void registerLambdatestTest(){
        Object bot = new Object();
        new LambdaTestRegisterPage(bot)
                .goTo()
                .register("Ola",
                        "Ahmed",
                        "oaaa358@gmail.com",
                        "0590985009",
                        "o358o358")
                .assertRegister();
    }
}
