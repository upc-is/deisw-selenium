Feature: Crear un equipo con jugadores registrados
  Como jugador necesito crear un equipo de compañeros que conozco con la finalidad de buscar un jugador más para completar nuestro equipo.
  Scenario: Creación de Juego
    Given que el usuario se encuentre en la pantalla Filler y el campo juego esté completo
    When haga click en Aceptar
    Then el sistema mostrará la pantalla de Juego creado.
  Scenario: Error en creación de juego
    Given que el usuario se encuentre en la pantalla Filler y el campo juego esté vacío
    When haga click en Aceptar
    Then el sistema mostrará el mensaje: Ingresa un juego válido.
  Scenario: Error en miembros
    Given que el usuario se encuentre en la pantalla Filler y todos los campos para miembros estén vacíos
    When haga click en Aceptar
    Then el sistema mostrará el mensaje: Ingresa al menos un miembro de equipo para continuar.

