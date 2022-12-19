@GoogleTest
Feature: Probar las busuqedas de Google

Rule: El usuario puede realizar cualquier busqueda en Google y obtener resultados

Background: Navego a google
Given Navego a google

@esc2
Scenario Outline: Realizo busqueda google
    
    When Capturo el <criteraToSearch> param para buscar
    And clic en el boton buscar
    Then obtengo resultados de la busqueda

Examples: 
|criteraToSearch|
|   Hola mundo  |
|   Youtube     |
|   Twitch      |
|   linkedIN    |
