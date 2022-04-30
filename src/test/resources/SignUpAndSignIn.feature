Feature: Registrarme en la aplicación e Ingresar
  Scenario: El usuario se registra e ingresa a la aplicación
    Given El Usuario se encuentra en la pagina principal
    And Hace click en el boton Registrarse
    When El usuario ingresa el login y el password
    And Hace click en el boton registrar
    Then Ingresa el login y el password
    And hace click en Ingresar y le muestra el Dashboard