Feature: Make a strike
  As a player of the bowling game
  I want to be able to make a strike
  So that I can increase my score

  Scenario: A player makes a strike
    Given a player rolls the first ball in a new frame
    When the player hits all 10 pins in the first roll
    Then the player has made a strike

  Scenario: A player makes a strike and gets bonus points
    Given a player makes a strike
    When the player hits all 10 pins in the first roll
    And after the strike in next frame hits 2 pins and 3 pins
    Then the player gets 15 points for the strike

  Scenario: A player makes a strike and then a spare in next frame
    Given a player makes a strike
    When the player hits all 10 pins in the first roll
    And after the strike in next frame hits 2 pins and 8 pins
    Then the player gets 20 points for the strike

  Scenario: A player makes a strike in the last frame
    Given a player makes a strike in the last frame
    When the player hits all 10 pins in the first roll
    And after the strike in a bonus roll hits 2 pins
    Then the player gets 12 points for the strike in the last frame