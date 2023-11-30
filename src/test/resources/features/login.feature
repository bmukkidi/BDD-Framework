Feature: feature to test the login functionality

  Scenario: Check login successfull with valid credentials
  
    Given User is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
