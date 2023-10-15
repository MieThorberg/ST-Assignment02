package org.katas.bowling;

import bowling.Game;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameDefinitions {
    private Game game;

    @Given("a player rolls two times")
    public void aPlayerRollsTwoTimes() {
        game = new Game();
    }

    @When("the first ball hits {int} pins")
    public void theFirstBallHitsPins(int i) {
        game.roll(i);
    }

    @And("the second ball hits {int} pins")
    public void theSecondBallHitsPins(int j) {
        game.roll(j);
    }

    @Then("the score for the frame is {int}")
    public void theScoreForTheFrameIs(int i) {
        assertEquals(i, game.score());
    }

    @Given("a player had finished the bowling game")
    public void aPlayerHadFinishedTheBowlingGame() {
        game = new Game();
    }

    @When("the player hits {int} pins in all rolls")
    public void thePlayerHitsPinsInAllRolls(int i) {
        for (int j = 0; j < 20; j++) {
            game.roll(i);
        }
    }

    @Then("the total score is {int}")
    public void theTotalScoreIs(int i) {
        assertEquals(i, game.score());
    }

    @When("the player rolls and hits {int} pins and {int} pins")
    public void thePlayerRollsAndHitsPinsAndPins(int i, int j) {
        game.roll(i);
        game.roll(j);
    }

    @And("hits {int} pins and {int} pins")
    public void hitsPinsAndPins(int i, int j) {
        game.roll(i);
        game.roll(j);
    }

    @And("hits {int} pins")
    public void hitsPins(int i) {
        game.roll(i);
    }
}
