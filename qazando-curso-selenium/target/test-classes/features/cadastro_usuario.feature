# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuario

    @cadastro-sucesso
    Cenario: Registrar novo usuário com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando preencho o formulario de cadastro
      E clico em registrar
      Então vejo o cadastro realizado com sucesso
