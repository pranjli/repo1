Feature: Check login function
  @smoke
  Scenario: 
    Given user is on login page
    When user enter valid username and password
    And enter login button
    Then navigated to homepage

  Scenario: 
    Given user is on login page
    When user enter valid username and password
    And enter login button
    Then navigated to homepage
