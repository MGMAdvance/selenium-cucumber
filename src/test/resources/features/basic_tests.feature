@Funcionalidades
Feature: Testando todas as funcionalidades do Cucumber

  @Calculo
  Scenario: Incrementar contador
    Given que eu inicializei com 5
    And acrescento mais 10
    Then fico com 15

  Scenario: Incluindo numeros negativos
    Given que eu inicializei com 10
    And acrescento mais -5
    Then fico com 5