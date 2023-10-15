package org.katas.utility;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utility.StringConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CapitalizeDefinitions {
    private String input, actual;

    @Given("a null string to capitalize")
    public void aNullStringToCapitalize() {
        input = null;
    }

    @When("capitalize the null string")
    public void capitalizeTheNullString() {
       try {
           actual = StringConverter.capitalize(input);
       } catch (NullPointerException e) {
           actual = null;
       }
    }

    @Then("the result of the capitalization is a null pointer exception")
    public void theResultOfTheCapitalizationIsANullPointerException() {
        Class<NullPointerException> expected = NullPointerException.class;
        assertThrows(expected, () -> StringConverter.capitalize(input));
    }

    @Given("an empty string to capitalize")
    public void anEmptyStringToCapitalize() {
        input = "";
    }

    @When("capitalize the empty string")
    public void capitalizeTheEmptyString() {
        actual = StringConverter.capitalize(input);
    }

    @Then("the result of the capitalization is an empty string")
    public void theResultOfTheCapitalizationIsAnEmptyString() {
        String expected = "";
        assertEquals(expected, actual);
    }

    @Given("a {string} string to capitalize")
    public void aStringToCapitalize(String s) {
        input = s;
    }

    @When("capitalize the string")
    public void capitalizeTheString() {
        actual = StringConverter.capitalize(input);
    }

    @Then("the result of the capitalization is {string}")
    public void theResultOfTheCapitalizationIs(String s) {
        String expected = s;
        assertEquals(expected, actual);
    }
}
