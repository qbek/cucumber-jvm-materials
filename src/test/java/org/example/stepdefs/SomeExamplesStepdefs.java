package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.example.data.UserAccount;
import org.example.steps.AuthorizationSteps;

public class SomeExamplesStepdefs {

    @Steps
    AuthorizationSteps authSteps;

    @Given("there is a {accountType} user account")
    public void thereIsAStandardUserAccount(UserAccount account) {
        Serenity.recordReportData().withTitle("User account details").andContents(account.toString());
    }

    @Then("{account} successfully logs in")
    public void heIsLoggedIn(UserAccount account) {
        authSteps.userSuccessfullyLogsIn(account.getLogin());
    }
}
