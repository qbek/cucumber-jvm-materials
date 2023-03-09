Feature: Test scenarios

  Background:
    Given there is a standard user account

  Scenario: User logs in
    When he enters his credentials on login screen
    Then he successfully logs in

  Scenario: User can create a todo
    Given he is logged in
    When he creates a new todo
    Then todo is created