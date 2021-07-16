

  Feature: Create an order for a pet

    Scenario: Create an order for a pet successful
      Given  I want to send some information to service"https://petstore.swagger.io/v2/store/order"
        |id|petId|quantity|shipDate                |status   |complete|
        |1 |1124 |1       |2021-07-16T15:58:43.124Z|Entregado|true    |
      Then I validate the status code 200 for the request