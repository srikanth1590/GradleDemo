package com.stepdefinitions;

import com.app.Encription;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class EncriptionTestStepDef {

    Encription e = new Encription();
    String result = null;

    @Given("That I'm testing {string} for Encryption application")
    public void that_I_m_testing_for_Encryption_application(String string) {
        System.out.println("Testing scenario : " + string);
    }

    @When("I perform encryption for the given {string} and {string} combination")
    public void i_perform_encryption_for_the_given_and_combination(String string, String string2) {
        result = e.performEncription(string, string2);
    }

    @Then("I should get the correct {string} for the given sentence.")
    public void i_should_get_the_correct_for_the_given_sentence(String string) {
        assertEquals(string, result);
    }

}
