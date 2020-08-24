package com.stepdefinitions;

import com.app.Encription;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.Assert.assertEquals;

public class EncriptionTestStepDef {

    Encription e = new Encription();

    @Given("I got my application")
    public void i_got_my_application() {
        assertEquals("ssk76vu", e.performEncription("abc76dd", "sri4"));
    }

    @When("I run the method")
    public void i_run_the_method() {
        System.out.println("When");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I should be able to see the results")
    public void i_should_be_able_to_see_the_results() {
        System.out.println("Then");
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
    }
}
