@login @android
Feature: Login

  Background:
    Given user is on login page
    When user input username
    And user input password
    When user click button login
    Then user successfully login

