Feature: Visualizar las categorías por productos
  Como consumidor quiero visualizar las categorías por productos para encontrar con facilidad los productos que deseo comprar.

  Scenario: El consumidor quiere visualizar su historial de pedidos realizados
    Given el vendedor se encuentra en la ventana Home
    When presiona el btn, Mis Órdenes
    Then se muestra la pantalla lst. pedidos realizados

  Scenario: El consumidor no puede visualizar su historial de órdenes realizadas
    Given el consumidor se encuentra en la ventana de Mis órdenes
    When no puede ver el historial de órdenes realizadas
    Then se muestra el messagebox. ShowDialog
