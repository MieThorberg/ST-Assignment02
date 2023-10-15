package org.katas.bowling;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import bowling.Game;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpareDefinitions {
    private Game game;

    @Given("a player rolls the ball two times in a frame")
    public void aPlayerRollsTheBallTwoTimesInAFrame() {
        game = new Game();
    }

    @When("the player hits {int} pins in the two rolls")
    public void thePlayerHitsPinsInTheTwoRolls(int i) {
        game.roll(i/2);
        game.roll(i/2);
    }

    @Then("the player gets a spare")
    public void thePlayerGetsASpare() {
        assert(game.isSpare(0));
    }

    @Given("a player makes a spare")
    public void aPlayerMakesASpare() {
        game = new Game();
    }

    @When("the player hits {int} pins and {int} pins")
    public void thePlayerHitsPinsAndPins(int i, int j) {
        game.roll(i);
        game.roll(j);
    }

    @And("after the spare in next frame hits {int} pins and {int} pins")
    public void afterTheSpareInNextFrameHitsPinsAndPins(int i, int j) {
        game.roll(i);
        game.roll(j);
    }

    @Then("the player gets {int} points for the spare")
    public void thePlayerGetsPointsForTheSpare(int i) {
        assertEquals(i, 10 + game.spareBonus(0));
    }

    @And("after the spare in next frame hits {int} pins")
    public void afterTheSpareInNextFrameHitsPins(int i) {
        game.roll(i);
    }

    @Given("a player has made a spare")
    public void aPlayerHasMadeASpare() {
        game = new Game();
    }

    @And("after the spare in next frame hits {int} pins and then a {int} pins")
    public void afterTheSpareInNextFrameHitsPinsAndThenAPins(int i, int j) {
        game.roll(i);
        game.roll(j);
    }

    @Given("a player has made a spare in last frame")
    public void aPlayerHasMadeASpareInLastFrame() {
        game = new Game();
        for (int i = 0; i < 18; i++) {
            game.roll(0);
        }
    }

    @And("after the spare in a bonus roll hits {int} pins")
    public void afterTheSpareInABonusRollHitsPins(int i) {
        game.roll(i);
    }

    @Then("the player gets {int} points for the spare in last frame")
    public void thePlayerGetsPointsForTheSpareInLastFrame(int i) {
        assertEquals(i, 10 + game.spareBonus(18));
    }
}
