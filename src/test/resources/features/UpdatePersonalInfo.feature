Feature: Update Account profile feature

    Background: Login to to account and setups
        Given user click on "Sign in" link
        Then validate user is in sign in page
        When user enter "elenavin5@gmail.com" on "Email" field
        When user enter "Mona3yo#" on "Password" field
        When user click on "Login" button
        Then user should be able to see account link
        Given user click on "Account" link

    @UserStory5
    Scenario: Change Name and phone number and validate
        Then validate user is in account page
        When user enter "Elena Vin" on "Name" field
        When user enter "3471231246" on "Phone Number" field
        When user click on "Update" button
        Then validate Toast Displayed
        When wait for 5 seconds
        Then validate account name is "Elena Vin"
        When user enter "Mona" on "Name" field
        When user enter "4325688555" on "Phone Number" field
        When user click on "Update" button
        Then validate Toast Displayed