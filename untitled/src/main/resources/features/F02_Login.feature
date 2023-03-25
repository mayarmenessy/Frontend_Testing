@test
Feature: F02_Login | users could use login functionality to use their accounts
  Scenario: user could login with valid email and password
    Given user go to login page
    When  user login with "try@gmail.com"
    And user login with password "1@Try!"
    And user press on login button
    Then account is created_successfully



