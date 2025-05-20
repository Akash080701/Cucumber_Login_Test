Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters username "standard_user" and password "secret_sauce"
    Then user should be redirected to the homepage
