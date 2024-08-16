Feature: Search for Products on Retail App
  Background: Login to account and setups
    Given user click on "Sign in" link
    Then validate user is in sign in page
    When user enter "elenavin5@gmail.com" on "Email" field
    When user enter "Mona3yo#" on "Password" field
    When user click on "Login" button
    Then user should be able to see account link
    @UserStory7
  Scenario: Search a product and validate
      When user enter "plug" in search bar and click on the search button
      Then validate displayed products contains "plug" in their title
   @UserStory8
  Scenario: Search for TV, Add TV to the cart, and delete it from the cart
    When user enter "tv" in search bar and click on the search button
    Then validate displayed products contains "tv" in their title
    When user click on a product
    And user click on Add to Cart button
    When user click on Cart link
    Then user validate that there is only one item in the cart
    Then user delete the item from the cart
    And validate item is deleted from the cart