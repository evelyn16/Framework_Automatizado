Feature: Ingresar pagina y realizar registro

  Scenario: ingresar datos correctos
           Given el usuario se encuntre en la pagina de inicio
           When ingresa usuario Ok
           And ingresa contrasena OK
           Then se muestra un  mensaje de exito