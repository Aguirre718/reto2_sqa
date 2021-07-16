

  Feature: Create a user

    Scenario: Create user successful
      Given  I want to send next information to service "https://petstore.swagger.io/v2/user"
        |id|username|firstName|lastName|email          |password|phone     |userStatus|
        |1 |JuanC   |Juan     |Aguirre |juanc@gmail.com|1234    |3014578965|1234567   |
      Then I validate the code status 200