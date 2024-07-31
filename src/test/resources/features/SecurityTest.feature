Feature: Security Test
  Scenario: User signin with valid username and password
    Given Open browser navigate to retail app
    Then click on SignIn button
    When input the validate username and password
    And click on SignIn button
    Then validate the Account link from main page
    Then Close  browser
