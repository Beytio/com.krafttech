Feature: Krafttech Login test
  # Agile story: As a user, I should be able to log in so I can see my account

  Scenario: Login as Mike
    Given The user is on the login page
    When The user enters Mike credentials
    Then the user should be able to login

  Scenario: Login as Sebastian
    Given The user is on the login page
    When The user enters Sebastian credentials
    Then the user should be able to login

  Scenario: Login as Jhon Nash
    Given The user is on the login page
    When The user enters Jhon Nash credentials
    Then the user should be able to login
