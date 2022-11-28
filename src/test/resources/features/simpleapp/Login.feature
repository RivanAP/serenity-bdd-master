@login @android
Feature: Login

  @test @positive
  Scenario: Verify user successfully login when input valid email and password
    Given user is on login page
    When user input username
    And user input password
    When user click button login
    Then user successfully login
    When user go to list menu
    And user do scroll menu
    And User Long Press On List Menu
  @login @android
  @test @positive
    Scenario: Multiple taps
      Given user is on login page
      When user input username
      And user input password
      When user click button login
      Then user successfully login
      When user go to list menu
      And User doing Multiple tap on the list
  @login @android
  @test @positive
  Scenario: Calculator Menu For Sum
    Given user is on login page
    When user input username
    And user input password
    When user click button login
    Then user successfully login
      And User input FirtsNumber for Sum
      And User click Formula
      Then User click Sum
      And User input SecondNumber for Sum
      And User click equals
      And User Will see the Result
  @login @android
  @test @positive
  Scenario: Calculator Menu For Reduce
    Given user is on login page
    When user input username
    And user input password
    When user click button login
    Then user successfully login
    Then User input FirtsNumber for Reduce
    When User click Formula
    Then User click Reduce
    And User input SecondNumber for Reduce
    And User click equals
    And User Will see the Result
  @login @android
  @test @positive
  Scenario: Calculator Menu For Multiplication
    Given user is on login page
    When user input username
    And user input password
    When user click button login
    Then user successfully login
    Then User input FirtsNumber for Multiplication
    When User click Formula
    Then User click Multiplication
    And User input SecondNumber for Multiplication
    And User click equals
    And User Will see the Result
  @login @android
  @test @positive
  Scenario: Calculator Menu For Distribution
    Given user is on login page
    When user input username
    And user input password
    When user click button login
    Then user successfully login
    Then User input FirtsNumber for Distribution
    When User click Formula
    Then User click Distribution
    And User input SecondNumber for Distribution
    And User click equals
    And User Will see the Result