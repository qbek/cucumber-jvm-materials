Feature: Hello world

  @tag1 @smoke
  Scenario: Greeetings....
    Then Hello I'm Jakub
    Then Welcome everyone

  @tag2
  Scenario: Variables handling

    Given I can have a "string value"
    And I can have a "antother string value"
    And I can have a 4 number
    And I can have a 43 number
    And I know the pi 3.14
    And any word can be a variable
    And any char can be a variable

    And we can build own boolean with value true
    And we can build own boolean with value false

  @tag1
  Scenario: Custom parameters

    Given a standard user account
    Given a premium user account

  @tag2 @smoke
  Scenario: Arrays, lists and maps...

    Given step with some list
      | val 1 |
      | val 2 |
      | val 3 |
    And step with 2d array
      | val 1 - 1 | val 1 - 2 |
      | val 2 - 1 | val 2 - 2 |
    And array with headers
      | key 1 | key 2 | key 3 |
      | a1    | a2    | a3    |
      | b1    | b2    | b3    |
    And array with names in rows
      | key 1 | login12234 | pass1234    |
      | key 2 | Stefan     | Kropielnica |


  Scenario: Multi line string
    Given huge amount of text
    """
    line 1
    line 2
    line 3
    """
    And or plain json
    """
    {
      "name": "Kuba"
    }
    """

