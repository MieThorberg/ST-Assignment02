Feature: The bowling game
  As a player of the bowling game
  I want to be able to play a game of bowling
  so that I can have fun

  Scenario: Count the score for one frame with a hit of 0 pins
    Given a player rolls two times
    When the first ball hits 0 pins
    And the second ball hits 0 pins
    Then the score for the frame is 0

  Scenario: Count the score for one frame with a hit of 5 pins and 3 pins
    Given a player rolls two times
    When the first ball hits 5 pins
    And the second ball hits 3 pins
    Then the score for the frame is 8

  Scenario: Count the total score of 0 points for a played game
    Given a player had finished the bowling game
    When the player hits 0 pins in all rolls
    Then the total score is 0

  Scenario: Count the total score of 133 points for a played game
    Given a player had finished the bowling game
    When the player rolls and hits 1 pins and 4 pins
    And hits 4 pins and 5 pins
    And hits 6 pins and 4 pins
    And hits 5 pins and 5 pins
    And hits 10 pins
    And hits 0 pins and 1 pins
    And hits 7 pins and 3 pins
    And hits 6 pins and 4 pins
    And hits 10 pins
    And hits 2 pins and 8 pins
    And hits 6 pins
    Then the total score is 133