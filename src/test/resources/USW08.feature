Feature: Visualizar mi historial de pedidos
  Como Washer quiero visualizar mi historial de pedidos para consultar servicios que adquirí anteriormente.
  Scenario: El washer desea visualizar su historial de pedidos.
    Given El washer desea visualizar el estado del pedido
    When El washer ingresa a la sección "Mis pedidos"
    Then Puede visualizar el listado de todos los pedidos realizados

  Scenario: El washer desea filtrar su historial de pedidos por estado
    Given El washer desea filtrar los pedidos de su historial de pedidos por estado
    When Utiliza el combobox de "Estado" y escoge un estado
    Then Puede filtrar los pedidos de su historial por estado

  Scenario: El washer desea filtrar su historial de pedidos por fecha
    Given El washer desea filtrar los pedidos de su historial de pedidos por fecha
    When Ingresa un rango de fechas
    Then Puede filtrar los pedidos de su historial por fecha
