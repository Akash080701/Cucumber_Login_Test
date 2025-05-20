Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters username "standard_user" and password "secret_sauce"
    Then user should be redirected to the homepage

    Scenario: Unsuccessful login with invalid credentials
    Given user is on the login page
    When user enters username "invalid_user" and password "wrong_password"
    Then user should see an error message "Epic sadface: Username and password do not match any user in this service"
