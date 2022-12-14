Feature: Account Type

  Scenario: First user
    Given User should be on the login page
    When User should input "qaoguzbeyt@gmail.com" and "12345678"
    Then User name should be "Beytullah"

  Scenario: Second user
    Given User should be on the login page
    When User should input "morganfreeman@kraft.com" and "mfreeman"
    Then User name should be "Morgan Freeman"

  Scenario: Third user
    Given User should be on the login page
    When User should input "eddiem@kraft.com" and "eddiem12"
    Then User name should be "Eddie Murphy"

  Scenario: Fourth user
    Given User should be on the login page
    When User should input "krafttech@kraft.com" and "Test1234"
    Then User name should be "Kyle Masters"


    Scenario Outline: Different <name> type
      Given User should be on the login page
      When User should input "<userEmail>" and "<password>"
      Then User name should be "<name>"

      Examples:
        | userEmail               | password | name           |
        | qaoguzbeyt@gmail.com    | 12345678 | Beytullah      |
        | morganfreeman@kraft.com | mfreeman | Morgan Freeman |
        | eddiem@kraft.com        | eddiem12 | Eddie Murphy   |
        | krafttech@kraft.com     | Test1234 | Kyle Masters   |


