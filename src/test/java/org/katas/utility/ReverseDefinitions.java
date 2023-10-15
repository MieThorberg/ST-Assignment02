package org.katas.utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.StringConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReverseDefinitions {
    private String input, actual;

    @Given("a null string to reverse")
    public void aNullStringToReverse() {
        input = null;
    }

    @When("the null string is reversed")
    public void theNullStringIsReversed() {
        try {
            actual = StringConverter.reverse(input);
        } catch (NullPointerException e) {
            actual = null;
        }
    }

    @Then("the result of the reversing is a null pointer exception")
    public void theResultOfTheReversingIsANullPointerException() {
        Class<NullPointerException> expected = NullPointerException.class;
        assertThrows(expected, () -> StringConverter.reverse(input));
    }

    @Given("an empty string to reverse")
    public void anEmptyStringToReverse() {
        input = "";
    }

    @When("the empty string is reversed")
    public void theEmptyStringIsReversed() {
        actual = StringConverter.reverse(input);
    }

    @Then("the result of the reversing is an empty string")
    public void theResultOfTheReversingIsAnEmptyString() {
        String expected = "";
        assertEquals(expected, actual);
    }

    @Given("a {string} string to reverse")
    public void aStringToReverse(String s) {
        input = s;
    }

    @When("the string is reversed")
    public void theStringIsReversed() {
        actual = StringConverter.reverse(input);
    }

    @Then("the result of the reversing is an {string} string")
    public void theResultOfTheReversingIsAnString(String s) {
        String expected = s;
        assertEquals(expected, actual);
    }
}
