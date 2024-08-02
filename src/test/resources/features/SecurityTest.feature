Feature: Security tests scenarios

  Scenario: validate sign in functionality with valid username and password
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "elenavin5@gmail.com" and "Mona3yo#" and click on login
    Then user should be able to see account link

  Scenario Outline: validate sign in functionality with invalid credentials
    When user click on sign in link
    Then validate user is in sign in page
    When user enter "<username>" and "<password>" and click on login
    Then should see error message "wrong username or password"
    Examples:
      | username            | password      |
      | wrong@gmail.com     | Mona3yo#      |
      | elenavin5@gmail.com | wrongPassword |
      | wrong@gmail.com     | wrongPassword |