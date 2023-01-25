@RegressionDemoBlaze
Feature: Revisar la funcionalidad del sitio de compras demoblaze.com

  Rule: El usuario puede seleccionar y agregar cualquier producto al carrito para ser adquirido


    Background: Navego a la tienda demo blaze
      Given Navego a la tienda DemoBlaze

    @Smoke @HappyPath
    Scenario: Verificar que al seleccionar y agregar productos al carrito estos se muestren correctamente
      When Selecciono diferentes productos de la tienda y los agrego al carrito
      Then Ingreso al carrito y valido que se muestren correctamente

     @Smoke
    Scenario: Verificar que se permita eliminar productos del carrito sin inconvenientes
      When Selecciono diferentes productos de tienda de la categoria laptops
      Then Ingreso al carrito y elimino productos no deseados

    @Smoke
    Scenario: Verificar que se envien correctamente mensajes de contacto
      When Selecciono la opcion contacto
      Then Capturo la infomracion de contacto y envio el mensaje

    @SignUp-Login @Smoke
    Scenario: Verificar que se permita crear usuarios sin inconvenientes
      When Selecciono la opcion para crear usuario
      Then Valido que se creeo el usuario correctamente



