package pages;

import org.openqa.selenium.By;
import runner.RunCucumberTest;
import support.Utils;

public class LoginPage extends RunCucumberTest {

    private final By create_email_field = By.id("email_create");
    private final By create_email_button = By.id("SubmitCreate");


     public void acessarTelaLogin(){
        getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
         getDriver().manage().window().maximize();
         Utils.waitElementBePresent(create_email_field, 20);
     }

     public void fillEmailCreate(){
        getDriver().findElement(create_email_field).sendKeys(Utils.getRandomEmail());
     }

     public void clicarCriarConta(){
         getDriver().findElement(create_email_button).click();
     }
}
