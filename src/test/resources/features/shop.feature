Feature: verify items in the cart

  @Add_cart
  Scenario: validate the cart
    Given User is in the home page
    Then user navigate to "shop"
    Then user buy Stuffed Frog 2 times
    Then user buy Fluffy Bunny 5 times
    Then user buy Valentine Bear 3 times
    And user navigate to "cart"
    Then user verify the subtotal for each product is correct
    Then verify the price for each product
    Then verify sub totals
