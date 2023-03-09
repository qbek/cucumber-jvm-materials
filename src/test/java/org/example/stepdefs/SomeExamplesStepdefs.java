package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import org.example.data.UserAccount;

public class SomeExamplesStepdefs {

    @Given("there is a {accountType} user account")
    public void thereIsAStandardUserAccount(UserAccount account) {}

    @Then("he is logged in")
    public void heIsLoggedIn() {
        System.out.println("Checking if on main scree1n");
    }
}
