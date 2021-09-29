Feature: Visualizar información sobre mi pedido
  Como Washer quiero visualizar la información de mi pedido para estar al tanto de cualquier cambio de estado.
  Scenario: El washer desea visualizar el estado del pedido
    Given El washer desea visualizar el estado del pedido
    When Escoge el pedido a visualizar
    Then Puede visualizar el estado del pedido en la sección Estado
  Scenario: El washer desea visualizar los servicios que adquirió
    Given El washer desea visualizar los servicios que adquirió
    When Escoge el pedido a visualizar
    Then El washer puede visualizar la lista de servicios adquiridos
