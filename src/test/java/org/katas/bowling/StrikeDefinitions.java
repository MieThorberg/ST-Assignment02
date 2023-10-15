package org.katas.bowling;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import bowling.Game;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrikeDefinitions {
    private Game game;

    @Given("a player rolls the first ball in a new frame")
    public void aPlayerRollsTheFirstBallInANewFrame() {
        game = new Game();
    }

    @When("the player hits all {int} pins in the first roll")
    public void thePlayerHitsAllPinsInTheFirstRoll(int i) {
        game.roll(i);
    }

    @Then("the player has made a strike")
    public void thePlayerHasMadeAStrike() {
        assert(game.isStrike(0));
    }

    @Given("a player makes a strike")
    public void aPlayerMakesAStrike() {
        game = new Game();
    }

    @And("after the strike in next frame hits {int} pins and {int} pins")
    public void afterTheStrikeInNextFrameHitsPinsAndPins(int i, int j) {
        game.roll(i);
        game.roll(j);
    }

    @Then("the player gets {int} points for the strike")
    public void thePlayerGetsPointsForTheStrike(int i) {
        assertEquals(i, 10 + game.strikeBonus(0));
    }

    @Given("a player makes a strike in the last frame")
    public void aPlayerMakesAStrikeInTheLastFrame() {
        game = new Game();
        for (int i = 0; i < 18; i++) {
            game.roll(0);
        }
    }

    @And("after the strike in a bonus roll hits {int} pins")
    public void afterTheStrikeInABonusRollHitsPins(int i) {
        game.roll(i);
    }

    @Then("the player gets {int} points for the strike in the last frame")
    public void thePlayerGetsPointsForTheStrikeInTheLastFrame(int i) {
        assertEquals(i, 10 + game.strikeBonus(18));
    }
}
