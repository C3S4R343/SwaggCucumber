Feature: Swag Labs End-to-End Test

  Background:
    Given the user is on the login page
    When the user logs in with username "standard_user" and password "secret_sauce"

  Scenario: Procces to buy
    Then the Swag Labs logo should be visible
    And the products page is displayed
    When the user navigates to a product page
    Then the product name should be visible
    And the user adds 3 items to the cart
    When the user navigates to the cart page
    Then the cart contains 3 items
    When the user removes an item from the cart
    Then the cart contains 2 items
    When the user proceeds to checkout
    Then the checkout page is displayed
    When the user fills in the required information
    And the user proceeds to the confirmation page
    Then the confirmation page displays the correct items
    When the user logs out
    Then the login page should be displayed


