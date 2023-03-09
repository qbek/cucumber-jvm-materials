Feature: Some examples


  Scenario: User logs in
    Given there is a standard user account
    When he enters his credentials on login screen
    Then he is logged in
