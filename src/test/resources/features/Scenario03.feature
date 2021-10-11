Feature: Using voucher code to make a discount

  @task3
  Scenario Outline: Verify that the user should be apply the voucher code for discount "<productnumber>"
    Given the user is on the "HomePage"
    And the user accepts the cookies
    And the user navigates to the "handbags" page
    And the user add a product "<productnumber>" to the cart
    And the user clicks to the "Basket" icon at the top of the right corner
    When the user apply the voucher "qachallenge" to the cart
    Then the user sees that voucher code successfully applied message
    Then the voucher is properly applied
    Examples: productnumber
      | productnumber |
      | A0158605      |
      | A0165944      |

