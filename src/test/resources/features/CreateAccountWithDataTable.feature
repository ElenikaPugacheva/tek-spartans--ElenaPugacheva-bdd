Feature: Create new account functionality
  Background: Setup create account scenarios
    Given user click on "Sign in" link
    Then validate user is in sign in page
    Given user click on "Create New Account" link

  @UsingMap
    Scenario: Using a Map as Data Table
      When user enter new account info
        | name     | Elena  |
        | email    | random |
        | password |Mona3yo# |
      When user click on "Sign Up" button
      Then validate user is in account page
      Then validate email address in account page match

  @UsingList
    Scenario: Using List as Data Table
      When user enter new account info using list Data
        | Elena    |
        | random   |
        | Mona3yo# |
      When user click on "Sign Up" button
      Then validate user is in account page
      Then validate email address in account page match

  @UsingListOfList
  Scenario: Using List of List as Data table
    When user enter new account as list of list
      | Monica | random | Levan#123 |
    When user click on "Sign Up" button
    Then validate user is in account page
    Then validate email address in account page match

  @UsingListOfMaps
  Scenario: Using List of maps as Data table
    When user enter new account as list of maps
      | name   | email  | password  |
      | Monica | random | Mona123#  |
      | Levan  | random | Levan#123 |
    When user click on "Sign Up" button
    Then validate user is in account page
    Then validate email address in account page match

  @ValidateFieldError
  Scenario: Validate error on all field when no data entered
    When user click on "Sign Up" button
    Then validate field error messages
      | Name is a required field             |
      | Email is a required field            |
      | Password is a required field         |
      | Confirm Password is a required field |

  @ValidateFieldErrorUsingMap
  Scenario: Validate error on All fields when no  data entered using map
    When user click on "Sign Up" button
    Then validate field error messages using map
      | Name     | Name is a required field             |
      | Email    | Email is a required field            |
      | Password | Password is a required field         |
      | Confirm  | Confirm Password is a required field |