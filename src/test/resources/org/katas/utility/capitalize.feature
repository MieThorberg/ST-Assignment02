Feature: Capitalize string
  As a user of the application
  I want to capitalize a string
  so that I can see the string capitalized

  Scenario: Capitalize a null string
    Given a null string to capitalize
    When capitalize the null string
    Then the result of the capitalization is a null pointer exception

  Scenario: Capitalize an empty string
    Given an empty string to capitalize
    When capitalize the empty string
    Then the result of the capitalization is an empty string

  Scenario: Capitalize a "hello" string
    Given a "hello" string to capitalize
    When capitalize the string
    Then the result of the capitalization is "HELLO"

  Scenario: Capitalize a "hello world" string
    Given a "hello world" string to capitalize
    When capitalize the string
    Then the result of the capitalization is "HELLO WORLD"

  Scenario: Capitalize a "HELLO" string
    Given a "HELLO" string to capitalize
    When capitalize the string
     Then the result of the capitalization is "HELLO"

  Scenario: Capitalize a "hELLo" string
    Given a "hELLo" string to capitalize
    When capitalize the string
    Then the result of the capitalization is "HELLO"