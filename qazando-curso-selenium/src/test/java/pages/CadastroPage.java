package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import runner.RunCucumberTest;
import support.Utils;

public class CadastroPage extends RunCucumberTest {

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


    public void selectTitle(Integer type ){
        Utils.waitElementBePresent(titleM, 20);
        if (type == 1){
            getDriver().findElement(By.id("id_gender1")).click();
        }else {
            getDriver().findElement(By.id("id_gender2")).click();
        }
    }

    public void preencheNome(String name){
        getDriver().findElement(first_name_field).sendKeys(name);
    }

    public void preencheSobrenome(String last_name){
        getDriver().findElement(last_name_field).sendKeys(last_name);
    }

    public void preencheSenha(String password){
        getDriver().findElement(password_field).sendKeys(password);
    }

    public void selecionaNascimento(Integer day, Integer months, String years){
        Select selectDay = new Select(getDriver().findElement(select_day));
        selectDay.selectByIndex(day);

        Select selectMonth = new Select(getDriver().findElement(select_month));
        selectMonth.selectByIndex(months);

        Select selectYear = new Select(getDriver().findElement(select_year));
        selectYear.selectByValue(years);
    }

    public void preencheEndereco(String address){
        getDriver().findElement(address_field).sendKeys(address);
    }

    public void preencheCidade(String city){
        getDriver().findElement(city_field).sendKeys(city);
    }

    public void preencheEstado(String state){
        getDriver().findElement(state_field).click();
        Select select_state = new Select(getDriver().findElement(state_field));
        select_state.selectByVisibleText(state);
    }

    public void preencheCEP(String cep){
        getDriver().findElement(postcode_field).sendKeys(cep);
    }

    public void preencheTelefone(String phone){
        getDriver().findElement(phone_mobile_field).sendKeys(phone);
    }

    public void clicarRegistrar(){
        getDriver().findElement(submit_button).click();
    }

    public void validarCadastro(String nome, String sobrenome){
        Utils.waitElementBePresent(By.className("myaccount-link-list"), 20);
        String resultado_atual = getDriver().findElement(By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(1) > a > span")).getText();
        Assert.assertEquals(nome+" "+sobrenome, resultado_atual);
    }
}
