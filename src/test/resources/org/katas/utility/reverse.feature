Feature: Reverse string
  As a user of the application
  I want to be able to reverse a string
  so that I can see the string in reverse order.

  Scenario: Reverse a null string
    Given a null string to reverse
    When the null string is reversed
    Then the result of the reversing is a null pointer exception

  Scenario: Reverse an empty string
    Given an empty string to reverse
    When the empty string is reversed
    Then the result of the reversing is an empty string

  Scenario: Reverse a "hello" string
    Given a "hello" string to reverse
    When the string is reversed
    Then the result of the reversing is an "olleh" string

  Scenario: Reverse a "hello world" string
    Given a "hello world" string to reverse
    When the string is reversed
    Then the result of the reversing is an "dlrow olleh" string

  Scenario: Reverse a "olleh" string
    Given a "olleh" string to reverse
    When the string is reversed
    Then the result of the reversing is an "hello" string

  Scenario: Reverse a "hELLo" string
    Given a "hELLo" string to reverse
    When the string is reversed
    Then the result of the reversing is an "oLLEh" string