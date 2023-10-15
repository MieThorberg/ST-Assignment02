package org.katas.utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.StringConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LowercaseDefinitions {
    private String input, actual;

    @Given("a null string to lowercase")
    public void aNullStringToLowercase() {
        input = null;
    }

    @When("lowercase a null string")
    public void lowercaseANullString() {
        try {
            actual = StringConverter.lowercase(input);
        } catch (NullPointerException e) {
            actual = null;
        }
    }

    @Then("the result of the lowercase is a null pointer exception")
    public void theResultOfTheLowercaseIsANullPointerException() {
        Class<NullPointerException> expected = NullPointerException.class;
        assertThrows(expected, () -> StringConverter.lowercase(input));
    }

    @Given("an empty string to lowercase")
    public void anEmptyStringToLowercase() {
        input = "";
    }

    @When("lowercase an empty string")
    public void lowercaseAnEmptyString() {
        actual = StringConverter.lowercase(input);
    }

    @Then("the result of the lowercase is an empty string")
    public void theResultOfTheLowercaseIsAnEmptyString() {
        String expected = "";
        assertEquals(expected, actual);
    }

    @Given("a {string} string to lowercase")
    public void aStringToLowercase(String s) {
        input = s;
    }

    @When("lowercase a string")
    public void lowercaseAString() {
        actual = StringConverter.lowercase(input);
    }

    @Then("the result of the lowercase is a {string} string")
    public void theResultOfTheLowercaseIsAString(String s) {
        String expected = s;
        assertEquals(expected, actual);
    }
}
