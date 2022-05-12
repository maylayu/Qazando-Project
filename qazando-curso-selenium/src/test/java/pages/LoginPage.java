package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class LoginPage extends Utils {

    WebDriver driver;

    private final By create_email_field = By.id("email_create");
    private final By create_email_button = By.id("SubmitCreate");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

     public void acessarTelaLogin(){
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
         driver.manage().window().maximize();
         waitElementBePresent(create_email_field, 20);
     }

     public void fillEmailCreate(){
        driver.findElement(create_email_field).sendKeys(getRandomEmail());
     }

     public void clicarCriarConta(){
         driver.findElement(create_email_button).click();
     }
}
