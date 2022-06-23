package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        //configurações do report de teste. Existem dois: um gerado pelo cucumber, básico
        //E outro que criamos quando rodamos o teste pelo terminal. Relatórios diferentes
        plugin = {"json:target/reports/cucumberReports.json", "html:target/reports/"},
        //Caminho dos arquivos .features (BDDs)
        features = "D:/Meus Documentos/Arquivos/Qazando-Project/qazando-curso-selenium/src/test/resources/features",
        //Caso queira rodar cenarios especificos, colocar a tag e os que tiverem ela, rodarão
        //quando coloca '~' na frente, é o diferente, tudo que não ter a tag, rodará
        tags = {"@cadastro-sucesso"},
        //Caminho de onde estão os aquivos dos metodos (STEPs)
        glue = {"steps"}
)
public class RunCucumberTest extends RunBase{

    //public static WebDriver driver;

    /* @BeforeClass
    public static void start() {
        System.out.println("Iniciou!");
        driver = new ChromeDriver();
    }*/

    @AfterClass
    public static void stop() {
        System.out.println("Finalizou!");
        getDriver().quit();
    }
}
