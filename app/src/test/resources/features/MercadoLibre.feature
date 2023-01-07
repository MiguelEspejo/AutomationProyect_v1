@busquedaMercadolibre
Feature: Ingresar a Mercadolibre realizar filtros por categorias

Rule: Realizar la prueba del filtro de Categorias en la pagina de MercadoLibre

Background: Navego a la pagina de MercadoLibre
Given Navego a MercadoLibre

Scenario: Validación de la Categoría Hogar y electodomésticos area de Climatización
    When Ingreso a la opcion categorias
    And Ingreso a la opción Hogar y  Electrodomesticos
    Then Valido el nombre del area Climatización y el numero de resultados obtenidos

Scenario: Validación de la Categoría Tecnología area Celulares y smartphones
    When Ingreso a la opcion categorias
    And Ingreso a la opción Tecnologia
    Then Valido el nombre del area Celulares y SmarthPhones y el numero de resultados obtenidos    
    
Scenario: Validación de la Categoría Belleza y cuidado personal area Perfumes importados
    When Ingreso a la opcion categorias
    And Ingreso a la opción Belleza y cuidado personal
    Then Valido el nombre del area Perfumes importados y el numero de resultados obtenidos 

Scenario: Validación de la Categoría Herramientas e industria area Industria textil
    When Ingreso a la opcion categorias
    And Ingreso a la opción Herramientas e industria
    Then Valido el nombre del area Industria textil y el numero de resultados obtenidos 

Scenario: Validación de la Categoría Juguetes y bebes area Cuarto del bebe
    When Ingreso a la opcion categorias
    And Ingreso a la opción Juguetes y bebes
    Then Valido el nombre del area Cuarto del bebe y el numero de resultados obtenidos 
             