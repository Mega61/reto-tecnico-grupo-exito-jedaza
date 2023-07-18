@stories
Feature: AddItemToShoppingCart
    As an user I want to add an item to my shopping cart
    @Scenario1:
    Scenario: Add item To shopping cart
        Given That the user is able to login to its own account
        When He searches for an item in the search bar
        Then He is able to add the item 1 Producto to the shopping cart
