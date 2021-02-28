@Funcionalidades
Feature: Testando todas as funcionalidades do Cucumber

  @Calculo
  Scenario: Incrimentar contador
    Given que eu inicializei com 5
    And acrescento mais 10
    Then fico com 15