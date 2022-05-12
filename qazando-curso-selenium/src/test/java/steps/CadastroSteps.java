package steps;

import cucumber.api.PendingException;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Então;
import pages.CadastroPage;
import runner.RunCucumberTest;

public class CadastroSteps extends RunCucumberTest {
    CadastroPage cadastroPage = new CadastroPage(driver);

    @Quando("^preencho o formulario de cadastro$")
    public void preencho_o_formulario_de_cadastro(){
        cadastroPage.selectTitle(2);
        cadastroPage.preencheNome("Mayla");
        cadastroPage.preencheSobrenome("Yuu");
        cadastroPage.preencheSenha("12345");
        cadastroPage.selecionaNascimento(5, 6, "1997");
        cadastroPage.preencheEndereco("Av Ana Costa");
        cadastroPage.preencheCidade("Santos");
        cadastroPage.preencheEstado("Colorado");
        cadastroPage.preencheCEP("11090");
        cadastroPage.preencheTelefone("+5513991050505");
        cadastroPage.clicarRegistrar();
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar(){
        // Write code here that turns the phrase above into concrete actions
    }

    @Então("^vejo a mensagem de cadastro realizado com sucesso$")
    public void vejo_a_mensagem_de_cadastro_realizado_com_sucesso(){
        // Write code here that turns the phrase above into concrete actions
    }

}
