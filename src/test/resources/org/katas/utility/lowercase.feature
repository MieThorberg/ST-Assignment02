Feature: Lowercase string
  As a user of the application
  I want to be able to lowercase a string
  So that I can see the string in lowercase

  Scenario: Lowercase a null string
    Given a null string to lowercase
    When lowercase a null string
    Then the result of the lowercase is a null pointer exception

  Scenario: Lowercase an empty string
    Given an empty string to lowercase
    When lowercase an empty string
    Then the result of the lowercase is an empty string

  Scenario: Lowercase a "HELLO" string
    Given a "HELLO" string to lowercase
    When lowercase a string
    Then the result of the lowercase is a "hello" string

  Scenario: Lowercase a "HELLO WORLD" string
    Given a "HELLO WORLD" string to lowercase
    When lowercase a string
    Then the result of the lowercase is a "hello world" string

  Scenario: Lowercase a "hello" string
    Given a "hello" string to lowercase
    When lowercase a string
    Then the result of the lowercase is a "hello" string

  Scenario: Lowercase a "hELLo" string
    Given a "hELLo" string to lowercase
    When lowercase a string
    Then the result of the lowercase is a "hello" string