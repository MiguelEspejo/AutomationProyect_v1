Feature: Probar las busuqedas de Google

Scenario: Realizo busqueda google
    Given Navego a google
    When Capturo los param para buscar
    And clic en el boton buscar
    Then obtengo resultados de la busqueda

