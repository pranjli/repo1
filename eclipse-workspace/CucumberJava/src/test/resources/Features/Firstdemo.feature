Feature: check login functionalty

  Scenario Outline: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enter valid <username> and <password>
    And hit enter
    Then user able to navigate login page

    Examples: 
      | username | password |
      | pranjli  |    12345 |
      | pt       |    12345 |
