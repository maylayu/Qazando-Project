package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {
    WebDriver driver;

    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By first_name_field = By.id("customer_firstname");
    private By last_name_field = By.id("customer_lastname");
    private By password_field = By.id("passwd");
    private By select_day = By.id("days");
    private By select_month = By.id("months");
    private By select_year = By.id("years");

    private By address_field = By.id("address1");
    private By city_field = By.id("city");
    private By state_field = By.id("id_state");
    private By postcode_field = By.id("postcode");
    private By phone_mobile_field = By.id("phone_mobile");
    private By submit_button = By.id("submitAccount");


    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(Integer type ){
        waitElementBePresent(titleM, 20);
        if (type == 1){
            driver.findElement(By.id("id_gender1")).click();
        }else {
            driver.findElement(By.id("id_gender2")).click();
        }
    }

    public void preencheNome(String name){
        driver.findElement(first_name_field).sendKeys(name);
    }

    public void preencheSobrenome(String last_name){
        driver.findElement(last_name_field).sendKeys(last_name);
    }

    public void preencheSenha(String password){
        driver.findElement(password_field).sendKeys(password);
    }

    public void selecionaNascimento(Integer day, Integer months, String years){
        Select selectDay = new Select(driver.findElement(select_day));
        selectDay.selectByIndex(day);

        Select selectMonth = new Select(driver.findElement(select_month));
        selectMonth.selectByIndex(months);

        Select selectYear = new Select(driver.findElement(select_year));
        selectYear.selectByValue(years);
    }

    public void preencheEndereco(String address){
        driver.findElement(address_field).sendKeys(address);
    }

    public void preencheCidade(String city){
        driver.findElement(city_field).sendKeys(city);
    }

    public void preencheEstado(String state){
        driver.findElement(state_field).click();
        Select select_state = new Select(driver.findElement(state_field));
        select_state.selectByVisibleText(state);
    }

    public void preencheCEP(String cep){
        driver.findElement(postcode_field).sendKeys(cep);
    }

    public void preencheTelefone(String phone){
        driver.findElement(phone_mobile_field).sendKeys(phone);
    }

    public void clicarRegistrar(){
        driver.findElement(submit_button).click();
    }
}
