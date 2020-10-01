Feature: Test AddToCart Functionality

  Scenario: add item to shopping cart
   Given open home page
   When user enter qty in text box of the item
   And click add to cart btn
   And   click on shopping cart
   Then click on Review Cart btn
   Then validate Quantity
   And close window

