@Security
@PasswordManagement
  Feature: Manage Account Password

  Background: User is logged in with the current password
    Given user clicks on "Sign in" link
    Then validate user is in sign in page
    When user enters current password and clicks on login with username "elenavin5@gmail.com"
    Then user should be able to see account link
    And user clicks on "Account" link

  @ChangePassword
  Scenario: Change account password and validate login with new password
    When user changes the password to "Monica3yo#"
    Then validate Toast Displayed

  @LoginWithNewPassword
  Scenario: Login with the new password
    Given user clicks on "Sign out" link
    When user clicks on "Sign in" link
    Then validate user is in sign in page
    When user enters current password and clicks on login with username "elenavin5@gmail.com"
    Then user should be able to see account link