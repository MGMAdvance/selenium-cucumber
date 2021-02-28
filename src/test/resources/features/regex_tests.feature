@Regex
Feature: Testar funcionalidades com REGEX

  @Ingresso
  Scenario: Verificar ingressos numéricos e validos
    Given que meu ingresso é 155
    And que meu ingresso é 13368
    Then tenho 1 ingresso válido