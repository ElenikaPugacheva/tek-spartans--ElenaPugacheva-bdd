Feature: This feature to setup framework
  Scenario: Validate top left corner logo
    Then validate top left corner is TEKSCHOOL

    Scenario: Validate top left logo and sign in button is enabled
    Then validate top left corner is TEKSCHOOL
    Then validate Sign in button is Enabled

  Scenario: User signin with valid username and password
    Then click on SignIn button
    When input the validate username and password
    And click on SignIn button
    Then user should be able to see account link

