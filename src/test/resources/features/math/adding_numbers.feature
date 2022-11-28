Feature: Adding Numbers

  @sample
  Scenario: Adding two numbers
    Given user is on login page
    When user input username
    And user input password
    When user click button login
    Then user successfully login
    Then a is 1
    And b is 2
    When I add a and b
    Then the total should be 3