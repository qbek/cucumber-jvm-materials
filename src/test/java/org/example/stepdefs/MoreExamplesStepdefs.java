package org.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Steps;
import org.example.data.UserAccount;
import org.example.steps.AuthorizationSteps;

public class MoreExamplesStepdefs {

    @Steps
    AuthorizationSteps authSteps;

    @When("{account} enters his credentials on login screen")
    public void heEntersHisCredetilsOnLoginScreen(UserAccount account) {
        authSteps.userLogsInUsingCredentials(account);
    }

    @Given("{account} is logged in")
    public void heIsLoggedIn(UserAccount account) {
        authSteps.userLogsInUsingCredentials(account.getLogin(), account.getPassword());
        authSteps.userSuccessfullyLogsIn(account.getLogin());
    }
}
