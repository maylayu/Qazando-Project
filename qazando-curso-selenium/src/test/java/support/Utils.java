package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public void waitElementBePresent(By element, int tempo){
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public String getRandomEmail(){
        String email_int = "emailteste_";
        String email_final = "@teste.com";

        Random random = new Random();
        int minimo = 0;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_int + resultado + email_final;
    }

    public String getRandomSenha(){
        //String senha_int = "emailteste_";
        //String senha_final = "@teste.com";

        Random random = new Random();
        String primeiraParte = random.toString();
        int minimo = 0;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return primeiraParte + resultado;
    }
}
