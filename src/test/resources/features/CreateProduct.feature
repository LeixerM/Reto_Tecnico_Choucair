#Autor: Leixer Molina

  Feature: Create a product
    As a user I want to create the product on the serenity demo page

    @test2
    Scenario: The user successfully creates a product
      Given Enter the credentials to enter the main page
        |strUser     |strPassword           |
        |admin       |serenity              |
      When the user creates the product
      Then It validates that the product was created successfully