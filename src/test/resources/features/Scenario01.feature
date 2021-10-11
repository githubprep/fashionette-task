@task
Feature: Add a product to the cart


  Scenario Outline: Verify that the user should be able to add a product to the cart, login and see the product at the cart "<productnumber>"
    Given the user is on the "HomePage"
    And the user accepts the cookies
    When the user navigates to the "Handbags" page
    And the user add a product "<productnumber>" to the cart
    And the user clicks to the "Login" icon at the top of the right corner
    And the user should login with userName "QA@fashionette.de" and password "!8Ntr*BM@!#G3VH"
    And  the user clicks to the "Basket" icon at the top of the right corner
    Then verify that the user can see the added product "<productnumber>" in the cart
    Examples: productnumber
      | productnumber |
      | A0158605      |
      | A0165944      |












