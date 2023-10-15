Feature: Make a spare
  As a player of the bowling game
  I want to be able to make a spare
  So that I can get a bonus on my score

  Scenario: A player makes a spare
    Given a player rolls the ball two times in a frame
    When the player hits 10 pins in the two rolls
    Then the player gets a spare

  Scenario: A player makes a spare and gets bonus points
    Given a player makes a spare
    When the player hits 3 pins and 7 pins
    And after the spare in next frame hits 5 pins and 2 pins
    Then the player gets 15 points for the spare

  Scenario: A player makes a spare and then a strike in next frame
    Given a player makes a spare
    When the player hits 5 pins and 5 pins
    And after the spare in next frame hits 10 pins
    Then the player gets 20 points for the spare

  Scenario: A player rolls and hit all pins in second roll
    Given a player has made a spare
    When the player hits 0 pins and 10 pins
    And after the spare in next frame hits 5 pins and then a 2 pins
    Then the player gets 15 points for the spare

  Scenario: A player makes a spare in last frame
    Given a player has made a spare in last frame
    When the player hits 2 pins and 8 pins
    And after the spare in a bonus roll hits 2 pins
    Then the player gets 12 points for the spare in last frame