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
    Scenario: Verificar que se permita crear y logiar usuarios sin inconvenientes
      When Selecciono la opcion para crear usuario
      Then Valido que se creeo el usuario correctamente
      And Verifico que no se permita registrar un usuario con el mismo username y que no se permita ingresar con credenciales invalidas


      ##ValidacionesAPI
    @Regresion @Smoke
    Scenario: Verificar que se permita crear un usuario mediante el servicio de DemoBlaze
      Given Que puedo acceder al servicio con la URI https://api.demoblaze.com para solicitar peticiones con el metodo POST
      When Envio una solicitud para registrar usuario pl_SignUp al endpoint /signup
      Then Valido que se registre correctamente el usuario con el codigo de estatus sea 200 OK

    @Regresion @Smoke
    Scenario: Verificar que se permita obtener un token enviando una peticion con credenciales correctas a el servicio de DemoBlaze
      Given Que puedo acceder al servicio con la URI https://api.demoblaze.com para solicitar peticiones con el metodo POST
      When Envio una solicitud para obtener token de usuario pl_SignIn al endpoint /signIn
      Then Valido que se genere un token y el codigo de estatus sea 200 OK

    Scenario: Verificar que no se permita obtener token con un usuario que no este registrado
      Given Que puedo acceder al servicio con la URI https://api.demoblaze.com para solicitar peticiones con el metodo POST
      When Envio una solicitud para obtener token con un usuario invalido pl_SignIn_usrInv al endpoint /signIn
      Then Valido que no se genere token y muestre el siguiente mensaje User does not exist. y el codigo de estatus sea 200 OK

    Scenario: Verificar que no se permita obtener token con un usuario con una contraseña incorrecta
      Given Que puedo acceder al servicio con la URI https://api.demoblaze.com para solicitar peticiones con el metodo POST
      When Envio una solicitud para obtener token con contrasena incorrecta pl_SignIn_passInv al endpoint /signIn
      Then Valido que no se genere token y muestre el siguiente mensaje Wrong password. y el codigo de estatus sea 200 OK



