$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro_usuario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Cadastro de usuario",
  "description": "",
  "id": "cadastro-de-usuario",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@cadastro"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Registrar novo usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;registrar-novo-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@cadastro-sucesso"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que estou na tela de login",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "acesso o cadastro de usuario",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "preencho o formulario de cadastro",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "clico em registrar",
  "keyword": "E "
});
formatter.step({
  "line": 12,
  "name": "vejo o cadastro realizado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "LoginSteps.que_estou_na_tela_de_login()"
});
formatter.result({
  "duration": 7442005500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.acesso_o_cadastro_de_usuario()"
});
formatter.result({
  "duration": 275765300,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.preencho_o_formulario_de_cadastro()"
});
formatter.result({
  "duration": 12756726700,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.clico_em_registrar()"
});
formatter.result({
  "duration": 23256546100,
  "status": "passed"
});
formatter.match({
  "location": "CadastroSteps.vejo_a_mensagem_de_cadastro_realizado_com_sucesso()"
});
formatter.result({
  "duration": 124347900,
  "status": "passed"
});
});