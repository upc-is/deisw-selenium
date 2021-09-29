Feature: Valorar lavandería
  Como Washer quiero valorar una lavandería para que otros washers puedan tener una referencia del trabajo realizado por la lavandería.
  Scenario: El washer desea calificar por estrellas a una lavandería
    Given El washer desea calificar por estrellas a una lavandería
    When El washer ingresa a la página principal de la lavandería a calificar
    And ingresa la cantidad de estrellas
    Then La calificación se suma a las demás calificaciones por estrellas que otros washers hayan ingresado
    And las estrellas de la lavandería son modificadas al nuevo promedio

  Scenario: El washer desea calificar el pedido culminado por una lavandería
    Given El washer desea calificar el pedido culminado por una lavandería
    When Un pedido es marcado como Terminado
    Then Se habilita la opción de reseña para dejar un comentario y calificación sobre su pedido
